package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: zai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zai extends yzu {

    /* renamed from: a */
    public static final sgj f54889a = sgj.FIT_HISTORY;

    /* renamed from: b */
    public static final rje f54890b = new rje();

    static {
        new rjo("Fitness.API", new zag(), f54890b);
        new rjo("Fitness.CLIENT", new zah(), f54890b);
    }

    public zai(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, f54889a, rjz, rka, sat);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
        if (queryLocalInterface instanceof zbq) {
            return (zbq) queryLocalInterface;
        }
        return new zbo(iBinder);
    }

    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.fitness.HistoryApi";
    }

    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }
}
