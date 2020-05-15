package com.google.android.location.reporting.service;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiWifiConnectivityStatus;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationReportingController$WifiStatusReceiver extends aacn {

    /* renamed from: a */
    public boolean f150881a = false;

    /* renamed from: b */
    boolean f150882b = false;

    /* renamed from: c */
    final /* synthetic */ bgxg f150883c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationReportingController$WifiStatusReceiver(bgxg bgxg) {
        super("location");
        this.f150883c = bgxg;
    }

    /* renamed from: a */
    private final void m117305a(long j, Pair pair) {
        long j2 = j;
        Pair pair2 = pair;
        if (chcs.f188354a.mo6606a().mo85050aL()) {
            ApiWifiConnectivityStatus apiWifiConnectivityStatus = new ApiWifiConnectivityStatus(Long.valueOf(j), (String) pair2.first);
            sqv sqv = this.f150883c.f117889a;
            ApiMetadata apiMetadata = r14;
            ApiMetadata apiMetadata2 = new ApiMetadata(null, null, null, null, null, null, null, null, Long.valueOf(System.currentTimeMillis()), apiWifiConnectivityStatus, null);
            bvwq bvwq = null;
            if (chcp.m148193b() && chcp.m148195d()) {
                bxvd da = bvxv.f158104d.mo74144da();
                if (pair2.second != null) {
                    bvxu bvxu = (bvxu) pair2.second;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvxv bvxv = (bvxv) da.f164949b;
                    bvxv.f158107b = bvxu.f158103c;
                    bvxv.f158106a |= 1;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvxv bvxv2 = (bvxv) da.f164949b;
                bvxv2.f158106a |= 2;
                bvxv2.f158108c = j2;
                bvxv bvxv3 = (bvxv) da.mo74062i();
                sqv sqv2 = this.f150883c.f117889a;
                long currentTimeMillis = System.currentTimeMillis();
                bxvd da2 = bvwq.f157983r.mo74144da();
                if (bvxv3 != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvwq bvwq2 = (bvwq) da2.f164949b;
                    bvxv3.getClass();
                    bvwq2.f157997m = bvxv3;
                    bvwq2.f157985a |= 1024;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bvwq bvwq3 = (bvwq) da2.f164949b;
                bvwq3.f157985a |= 1;
                bvwq3.f157986b = currentTimeMillis;
                bvwq = (bvwq) da2.mo74062i();
            }
            this.f150883c.f117890b.mo63202a(this.f150883c.f117891c.mo63354a().mo70928b(), new Pair(apiMetadata, bvwq), "ApiWifiConnectivityStatus");
            String str = (String) pair2.first;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53);
            sb.append("Logging wifi event, mac=");
            sb.append(j2);
            sb.append(", status=");
            sb.append(str);
            sb.toString();
        }
    }

    /* renamed from: a */
    private final void m117306a(boolean z) {
        if (chcs.f188354a.mo6606a().mo85028Q()) {
            bgxg bgxg = this.f150883c;
            if (bgxg.f117894f == null) {
                return;
            }
            if (!z) {
                bgxg.f117897i.mo63309a(8);
            } else {
                bgxg.f117897i.mo63309a(7);
            }
        }
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        NetworkInfo networkInfo;
        long j;
        if (!chcs.m148238j() && "android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            WifiInfo wifiInfo = null;
            if (extras == null || !extras.containsKey("networkInfo") || (networkInfo = (NetworkInfo) extras.get("networkInfo")) == null) {
                networkInfo = null;
            }
            boolean isConnected = networkInfo.isConnected();
            if (!this.f150881a && isConnected) {
                boolean z = true;
                m117306a(true);
                if (chcs.f188354a.mo6606a().mo85029R()) {
                    if (!chcs.f188354a.mo6606a().mo85035X()) {
                        bgxx.m100279c(context);
                    } else {
                        bgzo.m100465a(context, bgxx.m100271a(context, "com.google.android.location.reporting.WIFI_TRIGGERED_FLUSH_AND_UPLOAD"));
                    }
                }
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (wifiManager != null) {
                    wifiInfo = wifiManager.getConnectionInfo();
                }
                if (wifiInfo != null) {
                    String bssid = wifiInfo.getBSSID();
                    try {
                        if (bebi.m91718a(bssid, wifiInfo.getSSID())) {
                            z = false;
                        }
                    } catch (RuntimeException e) {
                        z = false;
                    }
                    this.f150882b = z;
                    if (z) {
                        if (bssid != null) {
                            j = bupz.m120219a(bssid);
                        } else {
                            j = -1;
                        }
                        m117305a(j, new Pair("CONNECTED", bvxu.CONNECTED));
                    }
                }
            }
            if (this.f150881a && !isConnected) {
                m117306a(false);
                if (this.f150882b) {
                    m117305a(-1, new Pair("DISCONNECTED", bvxu.DISCONNECTED));
                }
            }
            this.f150881a = isConnected;
        }
    }
}
