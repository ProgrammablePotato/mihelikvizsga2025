const express = require("express")
const router = express.Router()
const berlesekService = require("../services/berlesekService")

router.get("/berlesek", async (req,res) => {
    try {
        const rows = await berlesekService.getBerlesek()
        res.status(200)
        res.json(rows)
    } catch (error) {
        console.log(error)
    }
})
router.get("/berlesek/:id", async (req,res) => {
    try {
        const rows = await berlesekService.getBerlesById(req.params["id"])
        res.status(200)
        res.json(rows)
    } catch (error) {
        console.log(error)
    }
})
router.post("/berlesek", async (req,res) => {
    try {
        const rows = await berlesekService.newBerles(req.body)
        res.status(200)
        res.json(rows)
    } catch (error) {
        console.log(error)
    }
})
router.delete("/berlesek", async (req,res) => {
    try {
        
    } catch (error) {
        console.log(error)
    }
})

module.exports= router