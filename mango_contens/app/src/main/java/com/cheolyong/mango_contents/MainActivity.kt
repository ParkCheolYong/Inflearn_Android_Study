package com.cheolyong.mango_contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/ug3rOeg_RrKb",
                "https://mp-seoul-image-production-s3.mangoplate.com/358721/554117_1629557172621_9183?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "이누식당"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/hqycWFVzRZ5J",
                "https://mp-seoul-image-production-s3.mangoplate.com/112634_1631038530026935.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "노스티모"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/2l52up6B6MvY",
                "https://mp-seoul-image-production-s3.mangoplate.com/405210/1468743_1630923936170_70493?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "노란상소갈비"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/9TgE3uc7XPc6",
                "https://mp-seoul-image-production-s3.mangoplate.com/346366/1409586_1617257350351_2223?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "스시 나미키"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/6deWyIABIlnt",
                "https://mp-seoul-image-production-s3.mangoplate.com/350387/54303_1555061014257_34575?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "스시코에"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/lmV7-IPVgD3m",
                "https://mp-seoul-image-production-s3.mangoplate.com/2001142_1626511275309649.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "이이요"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/lz14nvWzcTqx",
                "https://mp-seoul-image-production-s3.mangoplate.com/511866_1630894545326576.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "텐동한"
            )
        )


        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(this, items)
        recyclerview.adapter = rvAdapter

        recyclerview.layoutManager = GridLayoutManager(this, 2)
    }
}