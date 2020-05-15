package com.google.android.gms.plus.oob;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FieldViewGender$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new anyf();

    /* renamed from: a */
    public boolean f82574a;

    /* renamed from: b */
    public boolean f82575b;

    /* renamed from: c */
    public int f82576c;

    public FieldViewGender$SavedState(Parcel parcel) {
        super(parcel);
        this.f82576c = parcel.readInt();
        boolean z = true;
        this.f82575b = parcel.readInt() != 0;
        this.f82574a = parcel.readInt() == 0 ? false : z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f82576c);
        parcel.writeInt(this.f82575b ? 1 : 0);
        parcel.writeInt(this.f82574a ? 1 : 0);
    }

    public FieldViewGender$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
