package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.SafeHtml;

/* renamed from: agqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agqi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConsentAgreementText[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        SafeHtml safeHtml = null;
        SafeHtml[] safeHtmlArr = null;
        SafeHtml[] safeHtmlArr2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    safeHtml = (SafeHtml) sed.m34998a(parcel, readInt, SafeHtml.CREATOR);
                    break;
                case 2:
                    safeHtmlArr = (SafeHtml[]) sed.m35004b(parcel, readInt, SafeHtml.CREATOR);
                    break;
                case 3:
                    safeHtmlArr2 = (SafeHtml[]) sed.m35004b(parcel, readInt, SafeHtml.CREATOR);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 8:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ConsentAgreementText(safeHtml, safeHtmlArr, safeHtmlArr2, str, str2, str3, i, str4);
    }
}
