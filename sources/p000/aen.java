package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.ComplicationData;

/* renamed from: aen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aen implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ComplicationData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ComplicationData(parcel);
    }
}
