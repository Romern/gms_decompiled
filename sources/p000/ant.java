package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.ListPreference;

/* renamed from: ant */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ant implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ListPreference.SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ListPreference.SavedState[i];
    }
}
