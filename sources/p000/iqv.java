package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: iqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iqv extends sbm {
    /* renamed from: I */
    public final Feature[] mo6461I() {
        return kay.f23677b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.ICryptauthService");
        if (queryLocalInterface instanceof iqy) {
            return (iqy) queryLocalInterface;
        }
        return new iqw(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.cryptauth.cryptauthservice.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.cryptauth.internal.ICryptauthService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    public iqv(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 129, sat, rjz, rka);
    }
}
