package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SetOnboardingInfoRequest;

/* renamed from: algg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class algg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SetOnboardingInfoRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ProtoSafeParcelable protoSafeParcelable = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                protoSafeParcelable = (ProtoSafeParcelable) sed.m34998a(parcel, readInt, ProtoSafeParcelable.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SetOnboardingInfoRequest(protoSafeParcelable);
    }
}
