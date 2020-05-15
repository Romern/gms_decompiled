package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DataTypeResult;

/* renamed from: zbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zbb extends dcj implements IInterface {
    public zbb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IDataTypeCallback");
    }

    /* renamed from: a */
    public final void mo30900a(DataTypeResult dataTypeResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataTypeResult);
        mo8530c(1, bj);
    }
}
