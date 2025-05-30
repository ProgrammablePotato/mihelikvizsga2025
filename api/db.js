const mysql = require("mysql2")

async function query(sql,params) {
    const connection = mysql.createConnection({
        host:"127.0.0.1",
        user:"root",
        port:"3306",
        password:"",
        database:"chefsdb"
    })
    try {
        const res = await connection.execute(sql,params)
        return res
    } catch (error) {
        console.log(error)
    }
    finally {
        await connection.end() 
    }
}
module.exports = {
    query
}