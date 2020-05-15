package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: aoro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoro extends sbm {
    public aoro(Context context, Looper looper, sat sat, rlz rlz, rof rof) {
        super(context, looper, 205, sat, rlz, rof);
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return aopn.f78655e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptcha.internal.IRecaptchaService");
        if (queryLocalInterface instanceof aorn) {
            return (aorn) queryLocalInterface;
        }
        return new aorl(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.recaptcha.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.recaptcha.internal.IRecaptchaService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 17108000;
    }
}
