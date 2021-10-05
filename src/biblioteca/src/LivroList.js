import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table } from 'reactstrap';
import AppNavbar from './AppNavbar';
import { Link } from 'react-router-dom';

class LivroList extends Component {

    constructor(props) {
        super(props);
        this.state = {livros: []};
        this.remove = this.remove.bind(this);
    }

    componentDidMount() {
        fetch('/livros')
            .then(response => response.json())
            .then(data => this.setState({livros: data}));

    }

    async remove(bookId) {
        await fetch(`/livros/${bookId}`, {
            method: 'DELETE',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }).then(() => {
            let updatedLivros = [...this.state.livros].filter(i => i.bookId !== bookId);
            this.setState({livros: updatedLivros});
        });
    }

    render() {
        const {livros} = this.state;

        const livroList = livros.map(livro => {
            return <tr key={livro.bookId}>
                <td style={{whiteSpace: 'nowrap'}}>{livro.title}</td>
                <td>{livro.author}</td>
                <td>
                    <ButtonGroup>
                        <Button size="sm" color="primary" tag={Link} to={"/livros/" + livro.bookId}>Edit</Button>
                        <Button size="sm" color="danger" onClick={() => this.remove(livro.bookId)}>Delete</Button>
                    </ButtonGroup>
                </td>
            </tr>
        });

        return (
            <div>
                <AppNavbar/>
                <Container fluid>
                    <div className="float-right">
                        <Button color="success" tag={Link} to="/livros/novo">Add Livro</Button>
                    </div>
                    <h3>Livros</h3>
                    <Table className="mt-4">
                        <thead>
                        <tr>
                            <th width="30%">Title</th>
                            <th width="30%">Autor</th>
                            <th width="40%">Actions</th>
                        </tr>
                        </thead>
                        <tbody>
                        {livroList}
                        </tbody>
                    </Table>
                </Container>
            </div>
        );
    }
}

export default LivroList;