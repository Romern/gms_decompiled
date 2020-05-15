package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: vxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vxd extends sbm {
    public vxd(Context context, Looper looper, rlz rlz, rof rof) {
        super(context, looper, 25, sat.m34799a(context), rlz, rof);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
        if (queryLocalInterface instanceof vxs) {
            return (vxs) queryLocalInterface;
        }
        return new vxq(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.droidguard.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }
}
