package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.SessionDataSet;

/* renamed from: yxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yxq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SessionDataSet[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Session session = null;
        DataSet dataSet = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                session = (Session) sed.m34998a(parcel, readInt, Session.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                dataSet = (DataSet) sed.m34998a(parcel, readInt, DataSet.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SessionDataSet(session, dataSet);
    }
}
