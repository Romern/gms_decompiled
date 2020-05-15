package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;

/* renamed from: agqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agqs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SetConsentStatusRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        ParcelUuid parcelUuid = null;
        ConsentStatus consentStatus = null;
        Long l = null;
        Integer num = null;
        Long l2 = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    parcelUuid = (ParcelUuid) sed.m34998a(parcel, readInt, ParcelUuid.CREATOR);
                    break;
                case 3:
                    consentStatus = (ConsentStatus) sed.m34998a(parcel, readInt, ConsentStatus.CREATOR);
                    break;
                case 4:
                    l = sed.m35013j(parcel, readInt);
                    break;
                case 5:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    num = sed.m35011h(parcel, readInt);
                    break;
                case 7:
                    l2 = sed.m35013j(parcel, readInt);
                    break;
                case 8:
                    bundle = sed.m35022s(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new SetConsentStatusRequest(str, parcelUuid, consentStatus, l, i, num, l2, bundle);
    }
}
