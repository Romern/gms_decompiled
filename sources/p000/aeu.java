package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.rendering.ComplicationDrawable;

/* renamed from: aeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ComplicationDrawable(parcel, null);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ComplicationDrawable[i];
    }
}
