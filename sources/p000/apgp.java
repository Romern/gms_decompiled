package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: apgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apgp extends sbm {

    /* renamed from: a */
    public final Context f84344a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (queryLocalInterface instanceof apgd) {
            return (apgd) queryLocalInterface;
        }
        return new apgb(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.safetynet.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12200000;
    }

    public apgp(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 45, sat, rjz, rka);
        this.f84344a = context;
    }
}
