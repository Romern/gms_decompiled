package com.google.android.material.bottomnavigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BottomNavigationPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bhez();

    /* renamed from: a */
    public int f151066a;

    /* renamed from: b */
    public ParcelableSparseArray f151067b;

    public BottomNavigationPresenter$SavedState() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f151066a);
        parcel.writeParcelable(this.f151067b, 0);
    }

    public BottomNavigationPresenter$SavedState(Parcel parcel) {
        this.f151066a = parcel.readInt();
        this.f151067b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
    }
}
