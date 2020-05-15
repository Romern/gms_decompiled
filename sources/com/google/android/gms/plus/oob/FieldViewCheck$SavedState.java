package com.google.android.gms.plus.oob;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FieldViewCheck$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new anya();

    /* renamed from: a */
    public boolean f82572a;

    public FieldViewCheck$SavedState(Parcel parcel) {
        super(parcel);
        this.f82572a = parcel.readInt() != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f82572a ? 1 : 0);
    }

    public FieldViewCheck$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
