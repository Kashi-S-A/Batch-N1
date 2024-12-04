let fullname=document.getElementById('name')
let email=document.getElementById('email')
let pwd=document.getElementById('pwd')
let btn=document.getElementById('btn')
registereddata=[];

btn.addEventListener('click',(e)=>{
    e.preventDefault();
    let registereddata=JSON.parse(localStorage.getItem('rdata'))
    registereddata.push({name:fullname.value,email:email.value,password:pwd.value})
    localStorage.setItem('rdata',JSON.stringify(registereddata));
    
})