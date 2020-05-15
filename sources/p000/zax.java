package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DataReadResult;

/* renamed from: zax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zax extends dcj implements IInterface {
    public zax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IDataReadCallback");
    }

    /* renamed from: a */
    public final void mo30899a(DataReadResult dataReadResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataReadResult);
        mo8530c(1, bj);
    }
}
