let registered=JSON.parse(localStorage.getItem('rdata'));
let email=document.getElementById('email')
let pwd=document.getElementById('pwd')
let btn=document.getElementById('btn')
btn.addEventListener('click',(e)=>{
    e.preventDefault();
    let userdetails=registered.find(ele=>email.value===ele.email && pwd.value===ele.password)
    if(userdetails){
        location.href='./homepage.html'
    }
    else{
        alert('incorrect credentials or user not found')
    }
})