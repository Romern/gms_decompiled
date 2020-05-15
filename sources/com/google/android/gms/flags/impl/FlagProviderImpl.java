package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FlagProviderImpl extends zwn {

    /* renamed from: a */
    private boolean f32454a = false;

    /* renamed from: b */
    private SharedPreferences f32455b;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.f32454a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.f32455b;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) zxb.m46626a(new zwq(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() == 0 ? new String("Flag value not available, returning default: ") : "Flag value not available, returning default: ".concat(valueOf2));
        }
        return valueOf.booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.f32454a) {
            return i;
        }
        SharedPreferences sharedPreferences = this.f32455b;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) zxb.m46626a(new zws(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() == 0 ? new String("Flag value not available, returning default: ") : "Flag value not available, returning default: ".concat(valueOf2));
        }
        return valueOf.intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        if (!this.f32454a) {
            return j;
        }
        SharedPreferences sharedPreferences = this.f32455b;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) zxb.m46626a(new zwu(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() == 0 ? new String("Flag value not available, returning default: ") : "Flag value not available, returning default: ".concat(valueOf2));
        }
        return valueOf.longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.f32454a) {
            return str2;
        }
        try {
            return (String) zxb.m46626a(new zww(this.f32455b, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() == 0 ? new String("Flag value not available, returning default: ") : "Flag value not available, returning default: ".concat(valueOf));
            return str2;
        }
    }

    public void init(vzr vzr) {
        Context context = (Context) vzs.m41641a(vzr);
        if (!this.f32454a) {
            try {
                this.f32455b = zxa.m46625a(context.createPackageContext("com.google.android.gms", 0));
                this.f32454a = true;
            } catch (PackageManager.NameNotFoundException e) {
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.w("FlagProviderImpl", valueOf.length() == 0 ? new String("Could not retrieve sdk flags, continuing with defaults: ") : "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf));
            }
        }
    }
}
