package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.TimeFormatText;

/* renamed from: aet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aet implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TimeFormatText[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TimeFormatText(parcel);
    }
}
