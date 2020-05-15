package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: raw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class raw extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        if (queryLocalInterface instanceof rbj) {
            return (rbj) queryLocalInterface;
        }
        return new rbh(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.clearcut.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 11925000;
    }

    public raw(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 40, sat, rjz, rka);
    }
}
