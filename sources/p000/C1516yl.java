package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v7.widget.AppCompatSpinner;

/* renamed from: yl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1516yl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AppCompatSpinner.SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppCompatSpinner.SavedState[i];
    }
}
