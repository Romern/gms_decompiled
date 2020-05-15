package p000;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: ydj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ydj {
    static {
        sgj sgj = zam.f54891a;
    }

    /* renamed from: a */
    public static rjx m43846a(Context context, GoogleSignInAccount googleSignInAccount) {
        sdo.m34959a(googleSignInAccount);
        return new rjx(context, new ydk(context, googleSignInAccount));
    }
}
