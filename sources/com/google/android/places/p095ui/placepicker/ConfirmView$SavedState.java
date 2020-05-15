package com.google.android.places.p095ui.placepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: com.google.android.places.ui.placepicker.ConfirmView$SavedState */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConfirmView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new bilp();

    /* renamed from: a */
    public boolean f151430a;

    public ConfirmView$SavedState(Parcel parcel) {
        super(parcel);
        this.f151430a = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f151430a ? 1 : 0);
    }

    public ConfirmView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
