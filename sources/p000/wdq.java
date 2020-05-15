package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: wdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wdq extends sbm {
    public wdq(Context context, Looper looper, sat sat, rlz rlz, rof rof) {
        super(context, looper, 222, sat, rlz, rof);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo12105F() {
        return true;
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return new Feature[]{wdp.f50561a};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.enterprise.internal.IEnterpriseService");
        if (queryLocalInterface instanceof wdr) {
            return (wdr) queryLocalInterface;
        }
        return new wdr(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.enterprise.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.enterprise.internal.IEnterpriseService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 17895000;
    }
}
