package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: obv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class obv extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final int mo21953G() {
        return 161;
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return nqp.f36426b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarCall");
        if (queryLocalInterface instanceof nri) {
            return (nri) queryLocalInterface;
        }
        return new nrg(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.car.CALL";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.car.ICarCall";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    public obv(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 13, sat, rjz, rka);
        new C1245ok();
    }
}
