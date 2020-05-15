package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: qpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qpq {

    /* renamed from: a */
    public final SharedPreferences f41922a;

    private qpq(SharedPreferences sharedPreferences) {
        this.f41922a = sharedPreferences;
    }

    /* renamed from: a */
    public static qpq m32626a(Context context) {
        return new qpq(context.getSharedPreferences("ChimeraDebugPrefs", 0));
    }
}
