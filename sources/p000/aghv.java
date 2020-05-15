package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: aghv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aghv extends sam {
    public aghv(Context context, Looper looper, sac sac, sad sad) {
        super(context, looper, 93, sac, sad);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof aghq) {
            return (aghq) queryLocalInterface;
        }
        return new agho(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.measurement.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }
}
