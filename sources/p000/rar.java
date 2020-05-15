package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: rar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rar extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IBootCountService");
        if (queryLocalInterface instanceof rbd) {
            return (rbd) queryLocalInterface;
        }
        return new rbb(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.clearcut.bootcount.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.clearcut.internal.IBootCountService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 11925000;
    }

    public rar(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 124, sat, rjz, rka);
    }
}
