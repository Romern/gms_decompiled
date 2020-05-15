package p000;

import android.util.Log;

/* renamed from: bjbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbu {

    /* renamed from: a */
    public final String f122492a;

    public bjbu(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 3);
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        this.f122492a = sb.toString();
    }

    /* renamed from: a */
    public final void mo64981a(String str) {
        Log.i("ConsentLogging", this.f122492a.concat(str));
    }

    /* renamed from: b */
    public final void mo64983b(String str) {
        Log.w("ConsentLogging", this.f122492a.concat(str));
    }

    /* renamed from: a */
    public final void mo64982a(String str, Throwable th) {
        Log.w("ConsentLogging", this.f122492a.concat(str), th);
    }
}
