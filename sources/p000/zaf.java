package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: zaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zaf extends yzu {

    /* renamed from: a */
    public static final sgj f54887a = sgj.FIT_GOALS;

    /* renamed from: b */
    public static final rje f54888b = new rje();

    static {
        new rjo("Fitness.GOALS_API", new zad(), f54888b);
        new rjo("Fitness.GOALS_CLIENT", new zae(), f54888b);
    }

    public zaf(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, f54887a, rjz, rka, sat);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
        if (queryLocalInterface instanceof zbn) {
            return (zbn) queryLocalInterface;
        }
        return new zbl(iBinder);
    }

    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.fitness.GoalsApi";
    }

    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitGoalsApi";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }
}
