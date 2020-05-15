package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aqop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqop {

    /* renamed from: a */
    public static final aqop f86424a = new aqop();

    private aqop() {
    }

    /* renamed from: a */
    public static final void m71883a(Context context, String str) {
        SharedPreferences.Editor edit = soz.m35786a(context).edit();
        String valueOf = String.valueOf(str);
        edit.putBoolean(valueOf.length() == 0 ? new String("x-client-auth:") : "x-client-auth:".concat(valueOf), true);
        edit.apply();
    }
}
