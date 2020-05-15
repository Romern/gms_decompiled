package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.List;

/* renamed from: gsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gsn extends rjl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ List mo12172a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.mo7526a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ rjm mo11610a(Context context, Looper looper, sat sat, Object obj, rjz rjz, rka rka) {
        return new icp(context, looper, sat, (GoogleSignInOptions) obj, rjz, rka);
    }
}
