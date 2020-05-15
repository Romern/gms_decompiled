package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: zap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zap extends yzu {

    /* renamed from: a */
    public static final sgj f54895a = sgj.FIT_RECORDING;

    /* renamed from: b */
    public static final rje f54896b = new rje();

    static {
        new rjo("Fitness.RECORDING_API", new zan(), f54896b);
        new rjo("Fitness.RECORDING_CLIENT", new zao(), f54896b);
    }

    public zap(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, f54895a, rjz, rka, sat);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
        if (queryLocalInterface instanceof zbw) {
            return (zbw) queryLocalInterface;
        }
        return new zbu(iBinder);
    }

    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.fitness.RecordingApi";
    }

    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitRecordingApi";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }
}
