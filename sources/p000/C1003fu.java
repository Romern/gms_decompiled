package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.app.BackStackState;

/* renamed from: fu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1003fu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BackStackState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BackStackState[i];
    }
}
