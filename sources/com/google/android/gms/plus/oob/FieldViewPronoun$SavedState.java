package com.google.android.gms.plus.oob;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FieldViewPronoun$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new anyp();

    /* renamed from: a */
    public boolean f82583a;

    /* renamed from: b */
    public int f82584b;

    public FieldViewPronoun$SavedState(Parcel parcel) {
        super(parcel);
        this.f82584b = parcel.readInt();
        this.f82583a = parcel.readInt() != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f82584b);
        parcel.writeInt(this.f82583a ? 1 : 0);
    }

    public FieldViewPronoun$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
