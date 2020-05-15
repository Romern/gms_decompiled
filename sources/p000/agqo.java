package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;

/* renamed from: agqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agqo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetConsentInformationResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Long l = 0L;
        ConsentStatus consentStatus = null;
        ConsentAgreementText consentAgreementText = null;
        Integer num = null;
        Long l2 = null;
        Integer num2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    consentStatus = (ConsentStatus) sed.m34998a(parcel, readInt, ConsentStatus.CREATOR);
                    break;
                case 2:
                    consentAgreementText = (ConsentAgreementText) sed.m34998a(parcel, readInt, ConsentAgreementText.CREATOR);
                    break;
                case 3:
                    l = sed.m35013j(parcel, readInt);
                    break;
                case 4:
                    num = sed.m35011h(parcel, readInt);
                    break;
                case 5:
                    l2 = sed.m35013j(parcel, readInt);
                    break;
                case 6:
                    num2 = sed.m35011h(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new GetConsentInformationResponse(consentStatus, consentAgreementText, l, num, l2, num2);
    }
}
