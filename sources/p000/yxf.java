package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.data.DataPoint;

/* renamed from: yxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yxf extends dcj implements yxh {
    public yxf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.data.IDataSourceListener");
    }

    /* renamed from: a */
    public final void mo30823a(DataPoint dataPoint) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataPoint);
        mo8530c(1, bj);
    }
}
