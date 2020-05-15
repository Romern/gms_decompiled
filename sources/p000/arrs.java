package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.Feature;

/* renamed from: arrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arrs extends sbm {
    /* renamed from: I */
    public final Feature[] mo6461I() {
        return aqwz.f87022j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.smartdevice.directtransfer.internal.ISourceDirectTransferService");
        if (queryLocalInterface instanceof arrk) {
            return (arrk) queryLocalInterface;
        }
        return new arri(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.smartdevice.directtransfer.SourceDirectTransferService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.smartdevice.directtransfer.internal.ISourceDirectTransferService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    public arrs(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, sat, rjz, rka);
    }
}
