package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: alji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alji extends sbm {
    public alji(Context context, Looper looper, sat sat, rlz rlz, rof rof) {
        super(context, looper, 198, sat, rlz, rof);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo12105F() {
        return true;
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return new Feature[]{aldg.f73481a, aldg.f73482b, aldg.f73483c, aldg.f73484d, aldg.f73485e, aldg.f73487g, aldg.f73486f, aldg.f73488h, aldg.f73489i, aldg.f73490j, aldg.f73491k, aldg.f73492l, aldg.f73493m, aldg.f73494n, aldg.f73495o, aldg.f73496p};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pay.internal.IPayService");
        if (queryLocalInterface instanceof aliu) {
            return (aliu) queryLocalInterface;
        }
        return new alis(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.pay.service.BIND";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.pay.internal.IPayService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 17895000;
    }
}
