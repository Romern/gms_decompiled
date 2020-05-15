package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new auy();

    /* renamed from: a */
    private final avg f1723a;

    public ParcelImpl(Parcel parcel) {
        this.f1723a = new avc(parcel).mo2705l();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        new avc(parcel).mo2674a(this.f1723a);
    }
}
