package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;

/* renamed from: brqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brqy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendVerificationCodeRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    j = sed.m35012i(parcel, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new SendVerificationCodeRequest(str, j, z, str2, str3, str4);
    }
}
