package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: bqqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqi {

    /* renamed from: a */
    public final SharedPreferences.Editor f141373a;

    /* renamed from: b */
    public final String f141374b;

    public bqqi(Context context, String str, String str2) {
        this.f141374b = str;
        this.f141373a = context.getApplicationContext().getSharedPreferences(str2, 0).edit();
    }
}
