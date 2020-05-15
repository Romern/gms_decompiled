package com.google.android.gms.plus.oob;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FieldViewName$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new anyn();

    /* renamed from: a */
    public boolean f82578a;

    /* renamed from: b */
    public boolean f82579b;

    /* renamed from: c */
    public int f82580c;

    /* renamed from: d */
    public String f82581d;

    /* renamed from: e */
    public String f82582e;

    public FieldViewName$SavedState(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.f82578a = parcel.readInt() != 0;
        this.f82580c = parcel.readInt();
        this.f82581d = parcel.readString();
        this.f82582e = parcel.readString();
        this.f82579b = parcel.readInt() == 0 ? false : z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f82578a ? 1 : 0);
        parcel.writeInt(this.f82580c);
        parcel.writeString(this.f82581d);
        parcel.writeString(this.f82582e);
        parcel.writeInt(this.f82579b ? 1 : 0);
    }

    public FieldViewName$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
