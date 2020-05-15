package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: aupv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aupv extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.trustagent.internal.IBridgeApi");
        if (queryLocalInterface instanceof auqb) {
            return (auqb) queryLocalInterface;
        }
        return new aupz(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.trustagent.BridgeApi.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.trustagent.internal.IBridgeApi";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    protected aupv(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 89, sat, rjz, rka);
    }
}
