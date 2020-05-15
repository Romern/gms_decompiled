package p000;

import android.os.Parcel;
import com.google.android.gms.fitness.result.DataSourcesResult;

/* renamed from: zaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zaz extends dck implements zba {
    public zaz() {
        super("com.google.android.gms.fitness.internal.IDataSourcesCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo30897a((DataSourcesResult) dcl.m8163a(parcel, DataSourcesResult.CREATOR));
        return true;
    }
}
