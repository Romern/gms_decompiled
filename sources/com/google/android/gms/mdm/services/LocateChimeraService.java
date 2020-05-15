package com.google.android.gms.mdm.services;

import android.app.admin.DevicePolicyManager;
import android.content.Intent;
import android.location.Location;
import android.os.BatteryManager;
import android.os.Build;
import com.android.volley.Response;
import com.felicanetworks.mfc.C0126R;
import java.util.Collection;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocateChimeraService extends afzi {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: afzi.a(java.lang.String, java.lang.String, java.lang.String, boolean):void
     arg types: [java.lang.String, java.lang.String, java.lang.String, int]
     candidates:
      com.google.android.gms.mdm.services.LocateChimeraService.a(cake, android.location.Location, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener):void
      afzi.a(cake, android.location.Location, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener):void
      afzi.a(java.lang.String, java.lang.String, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35075a(Intent intent) {
        intent.getStringExtra("echo_server_token");
        intent.getBooleanExtra("includeBatteryStatus", false);
        Boolean valueOf = Boolean.valueOf(intent.getBooleanExtra("includeConnectivityStatus", false));
        long longExtra = intent.getLongExtra("timeout", 60000);
        valueOf.booleanValue();
        if (!agab.m53789a(this)) {
            super.mo35076a(cake.LOCATION_DISABLED_IN_SYSTEM);
        } else if (!srs.m36149a(this)) {
            super.mo35076a(cake.LOCATION_DISABLED_IN_GOOGLE_SETTINGS);
        } else if (((Boolean) afzd.f64991e.mo10351a()).booleanValue()) {
            this.f65004b = new Semaphore(0);
            this.f65006d = false;
            this.f65007e.mo24756l().mo50371a(new afzh(this));
            try {
                this.f65004b.tryAcquire(longExtra, TimeUnit.MILLISECONDS);
                if (!this.f65006d) {
                    super.mo35076a(cake.LOCATION_TIME_OUT);
                } else if (cgkl.f187170a.mo6606a().mo83991a()) {
                    mo35078a(getString(mo35080b()), getString(mo35081c()), "mdm.notification_location", false);
                }
                mo35074a();
                int i = eoa.f15378a;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                mo35074a();
            }
        } else {
            super.mo35076a(cake.LOCATION_DISABLED_IN_CONSOLE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo35080b() {
        return C0126R.string.mdm_location_notification_title;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo35081c() {
        return C0126R.string.mdm_location_notification_text;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo35082d() {
        return C0126R.string.mdm_locating_notification_title;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo35083e() {
        return C0126R.string.mdm_locating_notification_text;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo35084f() {
        return C0126R.C0127drawable.mdm_ic_notification;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo35085g() {
        return C0126R.color.mdm_accent_color;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35077a(cake cake, Location location, Response.Listener listener, Response.ErrorListener errorListener) {
        boolean z;
        cajs cajs;
        cake cake2 = cake;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        Collection<afzz> values = agaa.m53787a().f65051a.values();
        if (cake2 == cake.USER_NOT_PRIVILEGED || cake2 == cake.LOCATION_DISABLED_IN_CONSOLE) {
            z = true;
        } else {
            z = false;
        }
        if (values != null) {
            for (afzz afzz : values) {
                cake[] cakeArr = {cake2};
                if (!afzz.mo35114b()) {
                    cajs = null;
                } else if (!z) {
                    int i = Build.VERSION.SDK_INT;
                    BatteryManager batteryManager = (BatteryManager) getSystemService("batterymanager");
                    cajs = afzx.m53781a(this);
                } else {
                    cajs = null;
                }
                afyu.m53686a(cakeArr, location, cajs, !afzz.mo35115c() ? null : !z ? afzw.m53780c(this) : null, afzz.mo35113a(), afzq.m53758a(devicePolicyManager), afzw.m53778a(this), afzw.m53776a(), listener, errorListener);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35079a(C1102je jeVar) {
        jeVar.mo13634c();
    }
}
