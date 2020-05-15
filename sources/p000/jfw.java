package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: jfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jfw extends sbm {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.managed.internal.IEmmService");
        if (queryLocalInterface instanceof jgc) {
            return (jgc) queryLocalInterface;
        }
        return new jga(iBinder);
    }

    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.managed.START_EMM_SERVICE";
    }

    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.managed.internal.IEmmService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    public jfw(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 136, sat, rjz, rka);
    }
}
