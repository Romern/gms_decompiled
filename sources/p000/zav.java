package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: zav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zav extends yzu {

    /* renamed from: a */
    public static final sgj f54899a = sgj.FIT_SESSIONS;

    /* renamed from: b */
    public static final rje f54900b = new rje();

    static {
        new rjo("Fitness.SESSIONS_API", new zat(), f54900b);
        new rjo("Fitness.SESSIONS_CLIENT", new zau(), f54900b);
    }

    public zav(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, f54899a, rjz, rka, sat);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
        if (queryLocalInterface instanceof zcc) {
            return (zcc) queryLocalInterface;
        }
        return new zca(iBinder);
    }

    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.fitness.SessionsApi";
    }

    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }
}
