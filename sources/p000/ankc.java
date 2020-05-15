package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.photos.autobackup.model.MediaState;

/* renamed from: ankc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ankc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String[] strArr = null;
        int[] iArr = null;
        long[] jArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                strArr = sed.m34989A(parcel, readInt);
            } else if (a == 3) {
                iArr = sed.m35026w(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                jArr = sed.m35027x(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new MediaState(i, strArr, iArr, jArr);
    }
}
