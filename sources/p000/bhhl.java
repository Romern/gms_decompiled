package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.Month;

/* renamed from: bhhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhhl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Month[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return Month.m117563a(parcel.readInt(), parcel.readInt());
    }
}
