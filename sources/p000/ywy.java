package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.Field;

/* renamed from: ywy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Field[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        Boolean bool = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                bool = sed.m35007d(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new Field(str, i, bool);
    }
}
