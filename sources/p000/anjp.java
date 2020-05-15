package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: anjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anjp extends sbm {
    public anjp(Context context, Looper looper, sat sat, rlz rlz, rof rof) {
        super(context, looper, 31, sat, rlz, rof);
        sat.mo25318a();
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (queryLocalInterface instanceof anjv) {
            return (anjv) queryLocalInterface;
        }
        return new anjt(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.photos.autobackup.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.photos.autobackup.internal.IAutoBackupService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }
}
