package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: wfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wfp extends sbm {
    public wfp(Context context, Looper looper, sat sat, rlz rlz, rof rof) {
        super(context, looper, 220, sat, rlz, rof);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo12105F() {
        return true;
    }

    /* renamed from: H */
    public final boolean mo16778H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.facs.cache.internal.IFacsInternalSyncService");
        if (queryLocalInterface instanceof wgb) {
            return (wgb) queryLocalInterface;
        }
        return new wfz(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.facs.internal.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.facs.cache.internal.IFacsInternalSyncService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 20059000;
    }
}
