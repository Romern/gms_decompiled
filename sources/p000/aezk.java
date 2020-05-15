package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: aezk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aezk extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.lockbox.internal.ILockboxService");
        if (queryLocalInterface instanceof aeze) {
            return (aeze) queryLocalInterface;
        }
        return new aezc(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.lockbox.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.lockbox.internal.ILockboxService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    public aezk(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 26, sat, rjz, rka);
    }
}
