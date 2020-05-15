package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.CountrySpecification;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import java.util.ArrayList;

/* renamed from: awbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awbe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MaskedWalletRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Cart cart = null;
        CountrySpecification[] countrySpecificationArr = null;
        ArrayList arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        ArrayList arrayList2 = null;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = true;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 5:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    cart = (Cart) sed.m34998a(parcel2, readInt, Cart.CREATOR);
                    break;
                case 10:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    countrySpecificationArr = (CountrySpecification[]) sed.m35004b(parcel2, readInt, CountrySpecification.CREATOR);
                    break;
                case 13:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case 14:
                    z7 = sed.m35006c(parcel2, readInt);
                    break;
                case 15:
                    arrayList = sed.m35005c(parcel2, readInt, com.google.android.gms.identity.intents.model.CountrySpecification.CREATOR);
                    break;
                case 16:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) sed.m34998a(parcel2, readInt, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 17:
                    arrayList2 = sed.m34990B(parcel2, readInt);
                    break;
                case 18:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new MaskedWalletRequest(str, z, z2, z3, str2, str3, str4, cart, z4, z5, countrySpecificationArr, z6, z7, arrayList, paymentMethodTokenizationParameters, arrayList2, str5);
    }
}
