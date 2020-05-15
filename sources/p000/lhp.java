package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.sharedpreferences.Change;

/* renamed from: lhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lhp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Change[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Change(parcel.readByte() != 0, (Change.Put[]) parcel.createTypedArray(Change.Put.CREATOR));
    }
}
