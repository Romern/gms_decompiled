package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.paymentmethods.PaymentMethodsFragment$PaymentMethodsPageDetails;

/* renamed from: awof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awof implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PaymentMethodsFragment$PaymentMethodsPageDetails(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PaymentMethodsFragment$PaymentMethodsPageDetails[i];
    }
}
