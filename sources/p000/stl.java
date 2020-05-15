package p000;

import android.os.StrictMode;

/* renamed from: stl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class stl {
    /* renamed from: a */
    public static StrictMode.ThreadPolicy m36298a() {
        StrictMode.noteSlowCall("gcore.dynamite");
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        return threadPolicy;
    }
}
