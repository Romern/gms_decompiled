package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: zam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zam extends yzu {

    /* renamed from: a */
    public static final sgj f54891a = sgj.FIT_INTERNAL;

    /* renamed from: b */
    public static final rjo f54892b = new rjo("Fitness.INTERNAL_API", new zaj(), f54894d);

    /* renamed from: c */
    public static final rjo f54893c = new rjo("Fitness.INTERNAL_CLIENT", new zal(), f54894d);

    /* renamed from: d */
    public static final rje f54894d = new rje();

    public zam(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, f54891a, rjz, rka, sat);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
        if (queryLocalInterface instanceof zbt) {
            return (zbt) queryLocalInterface;
        }
        return new zbr(iBinder);
    }

    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.fitness.InternalApi";
    }

    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitInternalApi";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }
}
