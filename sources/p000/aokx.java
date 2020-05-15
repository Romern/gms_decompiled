package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.sharebox.AddToCircleData;
import com.google.android.gms.plus.sharebox.Circle;
import java.util.ArrayList;

/* renamed from: aokx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aokx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AddToCircleData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        Audience audience = null;
        Audience audience2 = null;
        ArrayList arrayList = null;
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        str = sed.m35020q(parcel, readInt);
                        continue;
                    case 2:
                        str2 = sed.m35020q(parcel, readInt);
                        continue;
                    case 3:
                        audience = (Audience) sed.m34998a(parcel, readInt, Audience.CREATOR);
                        continue;
                    case 4:
                        audience2 = (Audience) sed.m34998a(parcel, readInt, Audience.CREATOR);
                        continue;
                    case 5:
                        arrayList = sed.m35005c(parcel, readInt, Circle.CREATOR);
                        continue;
                    case 6:
                        num = sed.m35011h(parcel, readInt);
                        continue;
                    case 7:
                        bool = sed.m35007d(parcel, readInt);
                        continue;
                    case 8:
                        bool2 = sed.m35007d(parcel, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel, readInt);
                        continue;
                }
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new AddToCircleData(i, str, str2, audience, audience2, arrayList, num, bool, bool2);
    }
}
