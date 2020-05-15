package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.SeekBarPreference;

/* renamed from: aou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aou implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SeekBarPreference.SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SeekBarPreference.SavedState[i];
    }
}
