package com.google.android.gms.plus.oob;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FieldViewCustomGender$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new anyc();

    /* renamed from: a */
    public String f82573a;

    public FieldViewCustomGender$SavedState(Parcel parcel) {
        super(parcel);
        this.f82573a = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f82573a);
    }

    public FieldViewCustomGender$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
