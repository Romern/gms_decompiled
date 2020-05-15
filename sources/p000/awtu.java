package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.orchestration.GcoreTapAndPayConsumerVerificationServerResponse;

/* renamed from: awtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awtu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new GcoreTapAndPayConsumerVerificationServerResponse((bwey) bjvp.m104731a(parcel, (bxxk) bwey.f159035i.mo74142c(7)), parcel.readInt());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GcoreTapAndPayConsumerVerificationServerResponse[i];
    }
}
