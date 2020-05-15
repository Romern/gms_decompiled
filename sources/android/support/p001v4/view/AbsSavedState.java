package android.support.p001v4.view;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.view.AbsSavedState */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1249oo();

    /* renamed from: a */
    public static final AbsSavedState f1047a = new AbsSavedState() {
        /* class android.support.p001v4.view.AbsSavedState.C00171 */
    };

    /* renamed from: b */
    public final Parcelable f1048b;

    public AbsSavedState() {
        this.f1048b = null;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1048b, i);
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1048b = readParcelable == null ? f1047a : readParcelable;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1048b = parcelable == f1047a ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
}
