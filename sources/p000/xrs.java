package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.view.RequestValidationViewOptions;

/* renamed from: xrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xrs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RequestValidationViewOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        while (parcel.dataPosition() < b) {
            sed.m35002b(parcel, parcel.readInt());
        }
        sed.m34994F(parcel, b);
        return new RequestValidationViewOptions();
    }
}
