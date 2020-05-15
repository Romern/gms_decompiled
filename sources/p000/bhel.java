package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.badge.BadgeDrawable$SavedState;

/* renamed from: bhel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhel implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BadgeDrawable$SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BadgeDrawable$SavedState[i];
    }
}
