package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: avyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avyl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Barcode.ContactInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Barcode.PersonName personName = null;
        String str = null;
        String str2 = null;
        Barcode.Phone[] phoneArr = null;
        Barcode.Email[] emailArr = null;
        String[] strArr = null;
        Barcode.Address[] addressArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    personName = (Barcode.PersonName) sed.m34998a(parcel, readInt, Barcode.PersonName.CREATOR);
                    break;
                case 3:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    phoneArr = (Barcode.Phone[]) sed.m35004b(parcel, readInt, Barcode.Phone.CREATOR);
                    break;
                case 6:
                    emailArr = (Barcode.Email[]) sed.m35004b(parcel, readInt, Barcode.Email.CREATOR);
                    break;
                case 7:
                    strArr = sed.m34989A(parcel, readInt);
                    break;
                case 8:
                    addressArr = (Barcode.Address[]) sed.m35004b(parcel, readInt, Barcode.Address.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new Barcode.ContactInfo(personName, str, str2, phoneArr, emailArr, strArr, addressArr);
    }
}
