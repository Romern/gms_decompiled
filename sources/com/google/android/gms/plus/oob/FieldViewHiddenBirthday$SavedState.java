package com.google.android.gms.plus.oob;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FieldViewHiddenBirthday$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new anyh();

    /* renamed from: a */
    public String f82577a;

    public FieldViewHiddenBirthday$SavedState(Parcel parcel) {
        super(parcel);
        this.f82577a = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f82577a);
    }

    public FieldViewHiddenBirthday$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
