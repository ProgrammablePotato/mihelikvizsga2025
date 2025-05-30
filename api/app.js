const express = require("express")
const app = express()

const apiRouter = require("./routers/apiRouter")

app.use("/api",apiRouter)

app.use("/",function(req,res){
    res.json({"message":"Mukodik"})
})

app.listen(3000,function(){console.log("Start")})