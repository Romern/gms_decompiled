package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.internal.CloseContentsRequest;

/* renamed from: url */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class url implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CloseContentsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Contents contents = null;
        Boolean bool = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                contents = (Contents) sed.m34998a(parcel, readInt, Contents.CREATOR);
            } else if (a == 3) {
                bool = sed.m35007d(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new CloseContentsRequest(contents, bool, i);
    }
}