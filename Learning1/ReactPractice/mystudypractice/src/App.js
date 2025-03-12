import logo from './logo.svg';
import './App.css';
import CounterComp from './Component/reduxpractice/CounterComp';
import ChildComponent from './Component/temp/ChildComponent';
import Garage from './Component/props/Garage';
import Car from './Component/props/Car';
import ArrayMethodsFY from './Component/array methods ES/LearnY/ArrayMethodsFY';

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
{/* 
<h1>redux counter app</h1>
<CounterComp></CounterComp>
<ChildComponent></ChildComponent> */}

{/* <Garage></Garage> */}
{/* <Car mybrand="lambogini" price={1000} isActive={true}></Car> */}
<ArrayMethodsFY/>
      
    </div>
  );
}

export default App;
