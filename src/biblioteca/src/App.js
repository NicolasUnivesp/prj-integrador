import React, { Component } from 'react';
import './App.css';
import Home from './Home';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import LivroList from './LivroList';
import LivroEdit from "./LivroEdit";

class App extends Component {
  render() {
    return (
        <Router>
          <Switch>
            <Route path='/' exact={true} component={Home}/>
            <Route path='/livros' exact={true} component={LivroList}/>
            <Route path='/livros/:id' component={LivroEdit}/>
          </Switch>
        </Router>
    )
  }
}

export default App;