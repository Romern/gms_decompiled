package com.google.android.gms.carsetup.fsm.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FsmController$StackEntry implements Parcelable {
    public static final Parcelable.Creator CREATOR = new oxq();

    /* renamed from: a */
    public final Class f29665a;

    /* renamed from: b */
    public final Parcelable f29666b;

    /* renamed from: c */
    public final boolean f29667c;

    /* renamed from: d */
    public final int f29668d;

    public FsmController$StackEntry(Parcel parcel) {
        boolean z;
        try {
            this.f29665a = Class.forName(parcel.readString());
            this.f29666b = parcel.readParcelable(getClass().getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f29667c = z;
            this.f29668d = parcel.readInt();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f29665a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("StackEntry{clazz=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29665a.getName());
        parcel.writeParcelable(this.f29666b, i);
        parcel.writeInt(this.f29667c ? 1 : 0);
        parcel.writeInt(this.f29668d);
    }

    public FsmController$StackEntry(Class cls, Parcelable parcelable, int i) {
        this.f29665a = cls;
        this.f29666b = parcelable;
        this.f29667c = true;
        this.f29668d = i;
    }
}
