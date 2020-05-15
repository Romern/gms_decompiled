package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.trustlet.place.p076ui.TrustedPlacesHomePreference;

/* renamed from: auyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auyr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TrustedPlacesHomePreference.SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TrustedPlacesHomePreference.SavedState[i];
    }
}
