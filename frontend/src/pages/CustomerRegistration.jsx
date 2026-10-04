import React from 'react'
import { useState } from 'react'
import "./CustomerRegistration.css"
const CustomerRegistration = () => {
    const [customer,setCustomer]=useState({
        name:"",
        age:"",
        phone:"",
        email:"",
        address:"",
        createdAt:"",
    });
    async function handleform(e){
        e.preventDefault();
        const updatedDate={
            ...customer,
            createdAt:new Date().toISOString().slice(0,19)
        };
        setCustomer(updatedDate);
        // console.log(customer);
        
        try{
            const respose=await fetch("http://localhost:8090/customer/add",{
                method:"POST",
                headers:{
                    "Content-Type":"application/json"
                },
                body:JSON.stringify(customer)
            });
            if(!respose.ok)
            {
                console.log("failed register customer");
            }
            const data=respose.json();
            console.log("Customer saved",data);
            
        }
        catch(error){
            console.log(error);
            
        }
    }
  return (
    <div className='customer-register'>

        <form onSubmit={handleform} className='form-register'>
            <h1>Customer Registration</h1>
            <div  className='name'>
                <label>Full Name</label>
                <input type="text" 
                value={customer.name} 
                onChange={(e)=>setCustomer({...customer,name:e.target.value})}/>
            </div>
            <div className='age'>
                <label>age</label>
                <input type="number" value={customer.age} onChange={(e)=>setCustomer({...customer,age:e.target.value})}/>
            </div>
            <div  className='phone'>
                <label>phone</label>
                <input type="number" value={customer.phone} onChange={(e)=>setCustomer({...customer,phone:e.target.value})}/>
            </div>
            <div  className='email'>
                <label>Email</label>
                <input type="email" value={customer.email} onChange={(e)=>setCustomer({...customer,email:e.target.value})}/>
            </div>
            <div className='address'>
                <label >Address</label>
                <input type="text" value={customer.address} onChange={(e)=>setCustomer({...customer,address:e.target.value})}/>
            </div>
            <button type='submit'>submit</button>
        </form>
    </div>
  )
}

export default CustomerRegistration