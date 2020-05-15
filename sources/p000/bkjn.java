package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.wallet.p097ui.tapandpay.TapAndPayConsumerVerificationResponse;

/* renamed from: bkjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkjn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TapAndPayConsumerVerificationResponse((bwey) bjvp.m104731a(parcel, (bxxk) bwey.f159035i.mo74142c(7)), parcel.readInt());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TapAndPayConsumerVerificationResponse[i];
    }
}
