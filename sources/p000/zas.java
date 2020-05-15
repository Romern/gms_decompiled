package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: zas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zas extends yzu {

    /* renamed from: a */
    public static final sgj f54897a = sgj.FIT_SENSORS;

    /* renamed from: b */
    public static final rje f54898b = new rje();

    static {
        new rjo("Fitness.SENSORS_API", new zaq(), f54898b);
        new rjo("Fitness.SENSORS_CLIENT", new zar(), f54898b);
    }

    public zas(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, f54897a, rjz, rka, sat);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
        if (queryLocalInterface instanceof zbz) {
            return (zbz) queryLocalInterface;
        }
        return new zbx(iBinder);
    }

    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.fitness.SensorsApi";
    }

    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }
}
