package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: auqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auqz extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.trustagent.internal.IStateApi");
        if (queryLocalInterface instanceof auqh) {
            return (auqh) queryLocalInterface;
        }
        return new auqf(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.trustagent.StateApi.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.trustagent.internal.IStateApi";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    protected auqz(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 85, sat, rjz, rka);
    }
}
