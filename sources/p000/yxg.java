package p000;

import android.os.Parcel;
import com.google.android.gms.fitness.data.DataPoint;

/* renamed from: yxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class yxg extends dck implements yxh {
    public yxg() {
        super("com.google.android.gms.fitness.data.IDataSourceListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo30823a((DataPoint) dcl.m8163a(parcel, DataPoint.CREATOR));
        return true;
    }
}
