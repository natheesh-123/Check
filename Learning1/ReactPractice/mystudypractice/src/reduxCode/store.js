import { configureStore } from '@reduxjs/toolkit';
//import React from 'react'
//mport counterReducer from './counterSlice';
import apiSlice from './api/apiSlice'
const store = configureStore({

    reducer: {

        counter: apiSlice }

}

);

export default store;

/*

import { configureStore } from "@reduxjs/toolkit";
import apiReducer from "./api/apiSlice"

const store = configureStore({
    reducer:{
        api : apiReducer
    }
});

export default store;

*/