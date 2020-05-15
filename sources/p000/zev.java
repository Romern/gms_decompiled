package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.request.GoalsReadRequest;
import java.util.ArrayList;

/* renamed from: zev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zev implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoalsReadRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a == 2) {
                sed.m35000a(parcel, readInt, arrayList, getClass().getClassLoader());
            } else if (a == 3) {
                sed.m35000a(parcel, readInt, arrayList2, getClass().getClassLoader());
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                sed.m35000a(parcel, readInt, arrayList3, getClass().getClassLoader());
            }
        }
        sed.m34994F(parcel, b);
        return new GoalsReadRequest(iBinder, arrayList, arrayList2, arrayList3);
    }
}
