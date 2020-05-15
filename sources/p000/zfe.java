package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import java.util.ArrayList;

/* renamed from: zfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zfe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SessionInsertRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Session session = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                session = (Session) sed.m34998a(parcel, readInt, Session.CREATOR);
            } else if (a == 2) {
                arrayList = sed.m35005c(parcel, readInt, DataSet.CREATOR);
            } else if (a == 3) {
                arrayList2 = sed.m35005c(parcel, readInt, DataPoint.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                iBinder = sed.m35021r(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SessionInsertRequest(session, arrayList, arrayList2, iBinder);
    }
}
