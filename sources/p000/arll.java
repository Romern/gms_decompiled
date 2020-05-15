package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: arll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arll extends sbm {
    /* renamed from: I */
    public final Feature[] mo6461I() {
        return aqwz.f87022j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceService");
        if (queryLocalInterface instanceof arji) {
            return (arji) queryLocalInterface;
        }
        return new arjg(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.smartdevice.d2d.TargetDeviceService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    /* renamed from: z */
    public final Feature[] mo25310z() {
        return new Feature[0];
    }

    public arll(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 76, sat, rjz, rka);
    }
}
