package p000;

import android.util.Log;

/* renamed from: bhxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhxj implements bhwo {
    /* renamed from: d */
    public final void mo64316d(String str, String str2) {
        Log.wtf(str, str2);
    }

    /* renamed from: a */
    public final void mo64312a(String str, String str2) {
        if (Log.isLoggable(str, 4)) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo64314b(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: c */
    public final void mo64315c(String str, String str2) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo64313a(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2, th);
        }
    }
}
