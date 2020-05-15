package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.ActivityRecognitionRequest;

/* renamed from: aefz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aefz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        WorkSource workSource = null;
        String str = null;
        int[] iArr = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 2:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 3:
                    workSource = (WorkSource) sed.m34998a(parcel2, readInt, WorkSource.CREATOR);
                    break;
                case 4:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    iArr = sed.m35026w(parcel2, readInt);
                    break;
                case 6:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ActivityRecognitionRequest(j, z, workSource, str, iArr, z2, str2, j2);
    }
}
