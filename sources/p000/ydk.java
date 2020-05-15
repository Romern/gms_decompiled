package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: ydk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ydk implements rjg {

    /* renamed from: a */
    private final GoogleSignInAccount f53660a;

    public ydk(Context context, GoogleSignInAccount googleSignInAccount) {
        if ("<<default account>>".equals(googleSignInAccount.f10317d)) {
            int i = Build.VERSION.SDK_INT;
            if (context.getPackageManager().hasSystemFeature("cn.google")) {
                this.f53660a = null;
                return;
            }
        }
        this.f53660a = googleSignInAccount;
    }

    /* renamed from: a */
    public final GoogleSignInAccount mo16734a() {
        return this.f53660a;
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof ydk) && sdg.m34949a(((ydk) obj).f53660a, this.f53660a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        GoogleSignInAccount googleSignInAccount = this.f53660a;
        if (googleSignInAccount != null) {
            return googleSignInAccount.hashCode();
        }
        return 0;
    }
}
