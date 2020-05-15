package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;

/* renamed from: anx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Preference.BaseSavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Preference.BaseSavedState[i];
    }
}
