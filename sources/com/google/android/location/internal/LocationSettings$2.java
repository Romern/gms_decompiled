package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationSettings$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgav f150789a;

    /* renamed from: b */
    final /* synthetic */ bgax f150790b;

    /* renamed from: c */
    private boolean f150791c = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationSettings$2(bgav bgav, String str, bgax bgax) {
        super(str);
        this.f150789a = bgav;
        this.f150790b = bgax;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            switch (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)) {
                case 10:
                case 12:
                    if (this.f150791c) {
                        this.f150789a.f115940a.unregisterReceiver(this);
                        this.f150790b.mo62585a();
                        return;
                    }
                    return;
                case 11:
                    this.f150791c = true;
                    return;
                default:
                    return;
            }
        }
    }
}
