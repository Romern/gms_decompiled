package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import com.google.android.gms.wallet.TransactionInfo;
import java.util.ArrayList;

/* renamed from: awbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awbj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PaymentDataRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        CardRequirements cardRequirements = null;
        ShippingAddressRequirements shippingAddressRequirements = null;
        ArrayList arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        TransactionInfo transactionInfo = null;
        String str = null;
        Bundle bundle = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 2:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 3:
                    cardRequirements = (CardRequirements) sed.m34998a(parcel2, readInt, CardRequirements.CREATOR);
                    break;
                case 4:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 5:
                    shippingAddressRequirements = (ShippingAddressRequirements) sed.m34998a(parcel2, readInt, ShippingAddressRequirements.CREATOR);
                    break;
                case 6:
                    arrayList = sed.m34990B(parcel2, readInt);
                    break;
                case 7:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) sed.m34998a(parcel2, readInt, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 8:
                    transactionInfo = (TransactionInfo) sed.m34998a(parcel2, readInt, TransactionInfo.CREATOR);
                    break;
                case 9:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new PaymentDataRequest(z, z2, cardRequirements, z3, shippingAddressRequirements, arrayList, paymentMethodTokenizationParameters, transactionInfo, z4, str, bundle);
    }
}
