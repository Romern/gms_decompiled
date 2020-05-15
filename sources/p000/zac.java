package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: zac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zac extends yzu {

    /* renamed from: a */
    public static final sgj f54885a = sgj.FIT_CONFIG;

    /* renamed from: b */
    public static final rje f54886b = new rje();

    static {
        new rjo("Fitness.CONFIG_API", new zaa(), f54886b);
        new rjo("Fitness.CONFIG_CLIENT", new zab(), f54886b);
    }

    public zac(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, f54885a, rjz, rka, sat);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
        if (queryLocalInterface instanceof zbk) {
            return (zbk) queryLocalInterface;
        }
        return new zbi(iBinder);
    }

    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.fitness.ConfigApi";
    }

    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitConfigApi";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }
}
