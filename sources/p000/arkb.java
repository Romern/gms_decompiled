package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: arkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arkb extends sbm {

    /* renamed from: a */
    private final boolean f87801a;

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return aqwz.f87022j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceService");
        if (queryLocalInterface instanceof ariw) {
            return (ariw) queryLocalInterface;
        }
        return new ariu(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.smartdevice.d2d.SourceDeviceService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    /* renamed from: z */
    public final Feature[] mo25310z() {
        if (!this.f87801a) {
            return new Feature[0];
        }
        return new Feature[]{aqwz.f87013a};
    }

    public arkb(Context context, Looper looper, sat sat, rjz rjz, rka rka, boolean z) {
        super(context, looper, 75, sat, rjz, rka);
        this.f87801a = z;
    }
}
