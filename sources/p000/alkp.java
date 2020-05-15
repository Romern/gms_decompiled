package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: alkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alkp extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo12105F() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.payse.internal.IPaySeService");
        if (queryLocalInterface instanceof alkl) {
            return (alkl) queryLocalInterface;
        }
        return new alkj(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.payse.service.BIND";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.payse.internal.IPaySeService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 17895000;
    }

    /* renamed from: z */
    public final Feature[] mo25310z() {
        return new Feature[]{alju.f73582a};
    }

    public alkp(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 188, sat, rjz, rka);
    }
}
