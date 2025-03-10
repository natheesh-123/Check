import logo from './logo.svg';
import './App.css';
import CounterComp from './Component/reduxpractice/CounterComp';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}

<h1>redux counter app</h1>
<CounterComp></CounterComp>

      
    </div>
  );
}

export default App;
