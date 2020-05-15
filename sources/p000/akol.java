package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: akol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akol extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.notifications.internal.IGunsService");
        if (queryLocalInterface instanceof akor) {
            return (akor) queryLocalInterface;
        }
        return new akop(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.notifications.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.notifications.internal.IGunsService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    public akol(Context context, Looper looper, rjz rjz, rka rka, sat sat) {
        super(context, looper, 110, sat, rjz, rka);
    }
}
