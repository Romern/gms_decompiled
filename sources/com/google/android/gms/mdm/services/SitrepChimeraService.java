package com.google.android.gms.mdm.services;

import android.content.Intent;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SitrepChimeraService extends afzn {

    /* renamed from: a */
    private int f80057a;

    /* renamed from: b */
    private String f80058b;

    /* renamed from: c */
    private Boolean f80059c;

    /* renamed from: d */
    private Boolean f80060d;

    /* renamed from: e */
    private cakk f80061e = cakk.UNKNOWN;

    /* renamed from: a */
    private final void m67238a(Exception exc) {
        long j;
        NetworkResponse networkResponse;
        long j2;
        agac.m53790a("Error sending sitrep.", new Object[0]);
        VolleyError volleyError = null;
        if (exc != null && (exc.getCause() instanceof VolleyError)) {
            volleyError = (VolleyError) exc.getCause();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (volleyError != null && (volleyError instanceof AuthFailureError) && (volleyError.getCause() == null || !(volleyError.getCause() instanceof IOException))) {
            agac.m53790a("Permanent error sending sitrep and do not retry.", new Object[0]);
            return;
        }
        if (volleyError == null || (networkResponse = volleyError.networkResponse) == null) {
            int i = eoa.f15378a;
            j = 0;
        } else {
            new Object[1][0] = Integer.valueOf(networkResponse.statusCode);
            int i2 = eoa.f15378a;
            Base64.encodeToString(volleyError.networkResponse.data, 0);
            NetworkResponse networkResponse2 = volleyError.networkResponse;
            if (networkResponse2.statusCode != 503 || !networkResponse2.headers.containsKey("Retry-After")) {
                j = 0;
            } else {
                String str = (String) volleyError.networkResponse.headers.get("Retry-After");
                try {
                    j = AndroidHttpClient.parseDate(str);
                } catch (IllegalArgumentException e) {
                    try {
                        j2 = Long.parseLong(str) * 1000;
                    } catch (NumberFormatException e2) {
                        agac.m53790a("Cannot parse retry time: %s", str);
                        j2 = 0;
                    }
                    j = j2 > 0 ? j2 + currentTimeMillis : 0;
                }
            }
        }
        afzd.f64994h.mo10352a(Integer.valueOf(this.f80061e.f175005o));
        afzd.f64996j.mo10352a(Integer.valueOf(((Integer) afzd.f64996j.mo10351a()).intValue() + 1));
        if (j > 0) {
            afzf.m53700a(this, j);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eoa.a(java.lang.Object, boolean):java.lang.String
     arg types: [java.lang.Long, int]
     candidates:
      eoa.a(java.lang.String, java.lang.Object[]):java.lang.String
      eoa.a(java.lang.Object, boolean):java.lang.String */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eoa.a(java.lang.Object, boolean):java.lang.String
     arg types: [java.lang.String, int]
     candidates:
      eoa.a(java.lang.String, java.lang.Object[]):java.lang.String
      eoa.a(java.lang.Object, boolean):java.lang.String */
    public final void onHandleIntent(Intent intent) {
        Intent intent2 = intent;
        if (!sre.m36080a(this) && intent2 != null) {
            this.f80061e = SitrepHelperIntentOperation.m67239a(intent2, "reason");
            this.f80057a = intent2.getIntExtra("gms_core_version", 0);
            this.f80058b = intent2.getStringExtra("gcm_registration_id");
            if (intent2.hasExtra("is_device_admin")) {
                this.f80059c = Boolean.valueOf(intent2.getBooleanExtra("is_device_admin", false));
            }
            if (intent2.hasExtra("lockscreen_enabled")) {
                this.f80060d = Boolean.valueOf(intent2.getBooleanExtra("lockscreen_enabled", false));
            }
            cakk a = SitrepHelperIntentOperation.m67239a(intent2, "retry_reason");
            long a2 = spn.m35843a(this);
            String str = null;
            if (a2 == 0) {
                agac.m53790a("Android ID == 0, not sending sitrep", new Object[0]);
                m67238a(null);
                return;
            }
            RequestFuture newFuture = RequestFuture.newFuture();
            TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
            try {
                str = qdf.m31915b(this);
            } catch (IOException e) {
                agac.m53791a(e, "Error getting device data version info.", new Object[0]);
            } catch (rfv e2) {
                agac.m53791a(e2, "Error getting device data version info.", new Object[0]);
            } catch (rfw e3) {
                agac.m53791a(e3, "Error getting device data version info.", new Object[0]);
            }
            int phoneType = telephonyManager.getPhoneType();
            int i = this.f80057a;
            String str2 = this.f80058b;
            Boolean bool = this.f80059c;
            cakk cakk = this.f80061e;
            Boolean bool2 = this.f80060d;
            agac.m53792b("sending sitrep: [%s, %s, %s, %s, %s, %s, %s, %s, %s]", cakk, a, eoa.m10821a((Object) Long.valueOf(a2), false), Integer.valueOf(i), eoa.m10821a((Object) str2, false), bool, str, Integer.valueOf(phoneType), bool2);
            RequestQueue a3 = afyu.m53684a();
            bxvd da = cakl.f175006l.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cakl cakl = (cakl) da.f164949b;
            cakl.f175014g = cakk.f175005o;
            int i2 = cakl.f175008a | 64;
            cakl.f175008a = i2;
            cakl.f175015h = a.f175005o;
            int i3 = i2 | 128;
            cakl.f175008a = i3;
            cakl.f175008a = i3 | 1;
            cakl.f175009b = a2;
            int i4 = Build.VERSION.SDK_INT;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cakl cakl2 = (cakl) da.f164949b;
            int i5 = cakl2.f175008a | 4;
            cakl2.f175008a = i5;
            cakl2.f175011d = i4;
            int i6 = i5 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            cakl2.f175008a = i6;
            cakl2.f175016i = phoneType;
            if (i > 0) {
                cakl2.f175008a = i6 | 2;
                cakl2.f175010c = i;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cakl cakl3 = (cakl) da.f164949b;
                str2.getClass();
                cakl3.f175008a |= 16;
                cakl3.f175012e = str2;
            }
            if (bool != null) {
                bxvd da2 = caju.f174872e.mo74144da();
                boolean booleanValue = bool.booleanValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                caju caju = (caju) da2.f164949b;
                caju.f174874a |= 1;
                caju.f174875b = booleanValue;
                boolean booleanValue2 = bool.booleanValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                caju caju2 = (caju) da2.f164949b;
                caju2.f174874a |= 2;
                caju2.f174876c = booleanValue2;
                boolean booleanValue3 = bool.booleanValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                caju caju3 = (caju) da2.f164949b;
                caju3.f174874a |= 4;
                caju3.f174877d = booleanValue3;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cakl cakl4 = (cakl) da.f164949b;
                caju caju4 = (caju) da2.mo74062i();
                caju4.getClass();
                cakl4.f175013f = caju4;
                cakl4.f175008a |= 32;
            }
            if (str != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cakl cakl5 = (cakl) da.f164949b;
                str.getClass();
                cakl5.f175008a |= 512;
                cakl5.f175017j = str;
            }
            if (bool2 != null) {
                boolean booleanValue4 = bool2.booleanValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cakl cakl6 = (cakl) da.f164949b;
                cakl6.f175008a |= 2048;
                cakl6.f175018k = booleanValue4;
            }
            a3.cancelAll("sitrep");
            afyv a4 = afyv.m53688a(cgko.f187173a.mo6606a().mo83995c(), true, newFuture, newFuture, (bxxk) cakm.f175019a.mo74142c(7), (cakl) da.mo74062i());
            a4.setTag("sitrep");
            a4.setShouldCache(false);
            a3.add(a4);
            try {
                newFuture.get();
                agac.m53792b("Sitrep successful", new Object[0]);
                Object[] objArr = {Integer.valueOf(this.f80057a), eoa.m10821a((Object) this.f80058b, false), this.f80059c, this.f80060d};
                if (this.f80057a > 0) {
                    afzd.f64987a.mo10352a(Integer.valueOf(this.f80057a));
                }
                if (this.f80058b != null) {
                    afzd.f64988b.mo10352a(this.f80058b);
                }
                if (this.f80059c != null) {
                    afzd.f64989c.mo10352a(this.f80059c);
                }
                if (this.f80060d != null) {
                    afzd.f64990d.mo10352a(this.f80060d);
                }
                afzf.m53701a(this, new skc(this));
                afzd.f64994h.mo10353b();
                afzd.f64995i.mo10353b();
                afzd.f64996j.mo10353b();
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                m67238a(e4);
            } catch (ExecutionException e5) {
                m67238a(e5);
            }
        }
    }
}
