package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.GoalsResult;

/* renamed from: zbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zbe extends dcj implements IInterface {
    public zbe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoalsReadCallback");
    }

    /* renamed from: a */
    public final void mo30901a(GoalsResult goalsResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, goalsResult);
        mo8530c(1, bj);
    }
}
