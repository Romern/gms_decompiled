package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: jbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jbv {

    /* renamed from: a */
    public final SharedPreferences f22127a;

    public jbv(Context context) {
        this.f22127a = context.getSharedPreferences("com.google.android.gms.auth.keystore.recovery.storage.sharedpreferences.Settings", 0);
    }

    /* renamed from: a */
    public static jbv m16478a(Context context) {
        return new jbv(context);
    }

    /* renamed from: a */
    public final void mo13567a(long j) {
        this.f22127a.edit().putLong("syncTaskCreationTime", j).commit();
    }
}
