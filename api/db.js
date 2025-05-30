const mysql = require("mysql2")

async function query(sql,params) {
    const connection = mysql.createConnection({
        host:"127.0.0.1",
        user:"root",
        password:"",
        database:"chefsdb"
    })
    try {
        const result = connection.execute(sql,params)
        return result
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