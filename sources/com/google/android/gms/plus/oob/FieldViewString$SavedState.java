package com.google.android.gms.plus.oob;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FieldViewString$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new anyr();

    /* renamed from: a */
    public String f82585a;

    public FieldViewString$SavedState(Parcel parcel) {
        super(parcel);
        this.f82585a = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f82585a);
    }

    public FieldViewString$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
