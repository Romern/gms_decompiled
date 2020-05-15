package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.TimeDifferenceText;

/* renamed from: aer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aer implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TimeDifferenceText(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TimeDifferenceText[i];
    }
}
