package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.request.ReadStatsRequest;
import java.util.ArrayList;

/* renamed from: zfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zfb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReadStatsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a == 3) {
                arrayList = sed.m35005c(parcel, readInt, DataSource.CREATOR);
            } else if (a != 1000) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new ReadStatsRequest(iBinder, arrayList, i);
    }
}
