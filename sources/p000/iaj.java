package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: iaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iaj extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverInternal");
        if (queryLocalInterface instanceof hyx) {
            return (hyx) queryLocalInterface;
        }
        return new hyv(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.api.phone.service.InternalService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverInternal";
    }

    public iaj(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 197, sat, rjz, rka);
    }
}
