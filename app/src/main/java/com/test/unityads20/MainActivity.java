package com.test.unityads20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

public class MainActivity extends AppCompatActivity {

    Button Show1,Show2;

    String GameID = "5204341";

    String RewardedAD_ID = "Rewarded_Android";

    String InterstitialAd_ID = "Interstitial_Android";

    boolean test = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Show1 = findViewById(R.id.show1);
        Show2 = findViewById(R.id.show2);

        UnityAds.initialize(this, GameID, test, new IUnityAdsInitializationListener() {
            @Override
            public void onInitializationComplete() {

                loadAD();

            }



            @Override
            public void onInitializationFailed(UnityAds.UnityAdsInitializationError error, String message) {

            }
        });

        Show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Interstitial_AndroidShow();

            }
        });


        Show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rewarded_AndroidShow();

                loadAD();

            }
        });
    }
    private void loadAD() {


        UnityAds.load(InterstitialAd_ID, new IUnityAdsLoadListener() {
            @Override
            public void onUnityAdsAdLoaded(String placementId) {

            }

            @Override
            public void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String message) {

            }
        });

        UnityAds.load(RewardedAD_ID, new IUnityAdsLoadListener() {
            @Override
            public void onUnityAdsAdLoaded(String placementId) {

            }

            @Override
            public void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String message) {

            }
        });
    }


    public void Interstitial_AndroidShow (){

        UnityAds.show(MainActivity.this, InterstitialAd_ID, new IUnityAdsShowListener() {
            @Override
            public void onUnityAdsShowFailure(String placementId, UnityAds.UnityAdsShowError error, String message) {

            }

            @Override
            public void onUnityAdsShowStart(String placementId) {

            }

            @Override
            public void onUnityAdsShowClick(String placementId) {

            }

            @Override
            public void onUnityAdsShowComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {

            }
        });


    }

    public void Rewarded_AndroidShow (){

        UnityAds.show(MainActivity.this, RewardedAD_ID, new IUnityAdsShowListener() {
            @Override
            public void onUnityAdsShowFailure(String placementId, UnityAds.UnityAdsShowError error, String message) {

            }

            @Override
            public void onUnityAdsShowStart(String placementId) {

            }

            @Override
            public void onUnityAdsShowClick(String placementId) {

            }

            @Override
            public void onUnityAdsShowComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {

            }
        });


    }
}