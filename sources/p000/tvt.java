package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: tvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tvt extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.deviceconnection.internal.IDeviceConnectionService");
        if (queryLocalInterface instanceof twa) {
            return (twa) queryLocalInterface;
        }
        return new tvy(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.deviceconnection.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.deviceconnection.internal.IDeviceConnectionService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    public tvt(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 20, sat, rjz, rka);
    }
}
