package com.oysterable.android_kotlin_wifi_list

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.wifi.WifiManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


  /*  BroadcastReceiver mWifiScanReceiver = new BroadcastReceiver() {
        @Override
        fun onReceive(Context context, Intent intent) {
            val action = intent.getAction();
            if(action.equals(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION)){
                getWIFIScanResult();
                wifiManager.startScan();
            }else if(action.equals(WifiManager.NETWORK_STATE_CHANGED_ACTION)){
                applicationContext.sendBroadcast(new Intent("wifi.ON_NETWORK_STATE_CHANGED"));
            }
        }
    };
    */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    val BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val action = intent!!.action
            if(action == WifiManager.SCAN_RESULTS_AVAILABLE_ACTION){

            }else if(action == WifiManager.NETWORK_STATE_CHANGED_ACTION){
                applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

                val intent = Intent("wifi.ON_NETWORK_STATE_CHANGED")
                applicationContext.sendBroadcast(intent)
            }

        }
    }






}
