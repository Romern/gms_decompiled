package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ocr.credit.base.ExpDateResult;

/* renamed from: akss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akss implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExpDateResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ExpDateResult(parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.createIntArray(), parcel.createIntArray());
    }
}
