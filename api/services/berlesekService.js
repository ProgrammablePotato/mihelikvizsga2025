const db = require("../db")

async function getBerlesek() {
    sql = "select * from berlesek"
    try {
        const res = await db.query(sql)
        return res
    } catch (error) {
        console.log(error)
    }
}
async function getBerlesById(id) {
    sql = "select * from berlesek where id = ?"
    params = [id]
    try {
        const res = await db.query(sql,params)
        return res
    } catch (error) {
        console.log(error)
    }
}
async function newBerles(body) {
    const {uid,chefid,startdate,enddate,dailyrate,basefee} = body
    sql = "insert into berlesek (uid,chefId,startDate,endDate,dailyRate,baseFee) values (?,?,?,?,?,?)"
    params = [uid,chefid,startdate,enddate,dailyrate,basefee]
    try {
        const res = await db.query(sql,params)
        return res
    } catch (error) {
        console.log(error)
    }
}
module.exports = {
    getBerlesek,
    getBerlesById,
    newBerles
}