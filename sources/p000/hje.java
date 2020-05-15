package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: hje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hje {

    /* renamed from: a */
    public static final adcb f19881a = adca.m50150a(hjd.f19880a);

    /* renamed from: b */
    public final Object f19882b = new Object();

    /* renamed from: c */
    public final SharedPreferences f19883c;

    /* renamed from: d */
    private final Context f19884d;

    public hje(Context context) {
        bmxy.m108581a(context);
        this.f19884d = context;
        this.f19883c = context.getSharedPreferences("com.google.android.gms.auth.api.credentials.one_tap_app_cancellations", 0);
    }

    /* renamed from: a */
    public final long mo12574a(String str, int i, TimeUnit timeUnit) {
        long size;
        synchronized (this.f19882b) {
            String a = mo12575a(str);
            bnic c = bnfi.m109235a(this.f19883c.getStringSet(a, new HashSet())).mo67501a(hja.f19876a).mo67502a(new hjb(System.currentTimeMillis(), timeUnit.toMillis((long) i))).mo67501a(hjc.f19879a).mo67508c();
            this.f19883c.edit().putStringSet(a, c).apply();
            size = (long) c.size();
        }
        return size;
    }

    /* renamed from: a */
    public final String mo12575a(String str) {
        bmxv a = qqt.m32666a(this.f19884d, str);
        if (a.mo66813a()) {
            return (String) a.mo66814b();
        }
        throw new PackageManager.NameNotFoundException("Application package is misconfigured");
    }
}
