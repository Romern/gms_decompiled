package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;

/* renamed from: agov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agov implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MdpPurchaseOfferRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        Integer num = null;
        Long l = null;
        PaymentForm[] paymentFormArr = null;
        String str5 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    bundle = sed.m35022s(parcel, readInt);
                    break;
                case 6:
                    num = sed.m35011h(parcel, readInt);
                    break;
                case 7:
                    l = sed.m35013j(parcel, readInt);
                    break;
                case 8:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 9:
                    paymentFormArr = (PaymentForm[]) sed.m35004b(parcel, readInt, PaymentForm.CREATOR);
                    break;
                case 10:
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new MdpPurchaseOfferRequest(str, str2, str3, str4, bundle, num, l, i, paymentFormArr, str5);
    }
}
