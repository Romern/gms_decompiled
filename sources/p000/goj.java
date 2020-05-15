package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: goj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class goj extends sbm {
    public goj(Context context, Looper looper, sat sat, rlz rlz, rof rof) {
        super(context, looper, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, sat, rlz, rof);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo12105F() {
        return true;
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return new Feature[]{ghy.f18278d, ghy.f18279e};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        if (queryLocalInterface instanceof gpj) {
            return (gpj) queryLocalInterface;
        }
        return new gph(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 17895000;
    }
}
