package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;

/* renamed from: bgbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bgbp {
    /* renamed from: a */
    public abstract void mo62618a();

    /* renamed from: b */
    public abstract void mo62619b();

    /* renamed from: a */
    public static bgbp m98537a(Context context, Handler handler, bugn bugn) {
        bugr a;
        int i = Build.VERSION.SDK_INT;
        if (!ceze.m138467l() || (a = bugn.mo72627a(5147455389092024324L)) == null) {
            return new bgbl();
        }
        return new bgbo(context, a, handler);
    }
}
