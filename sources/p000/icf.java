package p000;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: icf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class icf extends rjx {

    /* renamed from: a */
    static int f20724a = 1;

    public icf(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, gsq.f18964b, googleSignInOptions, new rky());
    }

    /* renamed from: a */
    public final synchronized int mo12910a() {
        if (f20724a == 1) {
            Context context = this.f43168w;
            rfi rfi = rfi.f42868a;
            int b = rfi.mo24590b(context);
            if (b == 0) {
                f20724a = 4;
            } else if (rfi.mo24591b(context, b, null) != null || waq.m41673a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                f20724a = 2;
            } else {
                f20724a = 3;
            }
        }
        return f20724a;
    }
}
