package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DataSourcesResult;

/* renamed from: zay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zay extends dcj implements zba {
    public zay(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IDataSourcesCallback");
    }

    /* renamed from: a */
    public final void mo30897a(DataSourcesResult dataSourcesResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataSourcesResult);
        mo8530c(1, bj);
    }
}
