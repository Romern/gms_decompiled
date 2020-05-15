package com.google.android.location.geofencer.service;

import android.util.Log;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BlockingChreGeofenceHardware$1 extends spb {

    /* renamed from: b */
    final /* synthetic */ bfyq f150778b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockingChreGeofenceHardware$1(bfyq bfyq, String str) {
        super(str);
        this.f150778b = bfyq;
    }

    /* renamed from: a */
    public final void mo25922a() {
        if (!this.f150778b.f115727v.isEmpty()) {
            if (Log.isLoggable("ChreGeofenceHardware", 5)) {
                bfxc.m98134c("ChreGeofenceHardware", "Waiting for CHRE message timed out.");
            }
            this.f150778b.f115715j.mo62553d((int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED);
        }
    }
}
