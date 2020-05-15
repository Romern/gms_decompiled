package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: yzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yzz extends yzu {

    /* renamed from: a */
    public static final sgj f54882a = sgj.FIT_BLE;

    /* renamed from: b */
    public static final rjo f54883b = new rjo("Fitness.BLE_API", new yzw(), f54884c);

    /* renamed from: c */
    public static final rje f54884c = new rje();

    static {
        new rjo("Fitness.BLE_CLIENT", new yzy(), f54884c);
    }

    public yzz(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, f54882a, rjz, rka, sat);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
        if (queryLocalInterface instanceof zbh) {
            return (zbh) queryLocalInterface;
        }
        return new zbf(iBinder);
    }

    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.fitness.BleApi";
    }

    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitBleApi";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }
}
