'use strict';

const rest = require('rest');
const React = require('react');
const client = require('./client');


class DeptoList extends React.Component{
  constructor(props) {
		super(props);
		this.state = {deptoes: []};
	}
  componentDidMount() {
      client({method: 'GET', path: '/api/deptoes'}).done(response => {
          this.setState({deptoes: response.entity._embedded.deptoes});
      });
  }
	render() {
		const deptoes = this.props.deptoes.map(depto =>
			<Deptos key={depto._links.self.href} depto={depto}/>
		);
		return (
			<table>
			   <tbody>
          <tr>
            <th>Descripcion</th>
            <th>Contacto</th>
          </tr>
          {Deptos}
        </tbody>
      </table>
		)
	}
}


class Depto extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.depto.description}</td>
				<td>{this.props.depto.contacto}</td>
			</tr>
		)
	}
}

ReactDOM.render(
	<Deptos />,
	document.getElementById('react')
)
