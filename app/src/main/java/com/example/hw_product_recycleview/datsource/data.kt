package com.example.hw_product_recycleview.datsource

import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.modul.datamodule

class data {
    fun loadingData():List<datamodule>{
        return listOf(
            datamodule(R.drawable.iphone, "Iphone 12 64GB", 4500, true, 5),
            datamodule(R.drawable.samsung_galaxy_uitra, "Samsung Galaxy S21 Ultra", 4500, false, 5),
            datamodule(R.drawable.xiaomi_pro, "Xiaomi 11T Pro", 2000, true, 0),
            datamodule(R.drawable.huawei_yp, "Huawei Y6p", 500, false, 0),
            datamodule(R.drawable.samsung_galaxy_z_flip, "Samsun Galaxy Z Flip3", 5000, true, 70),
            datamodule(R.drawable.iphone13, "Iphone 13", 6000, true, 36),
        )
    }
}