package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.AbsSavedState;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new bhnl();

    /* renamed from: c */
    public final C1245ok f151229c;

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f151229c = new C1245ok(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f151229c.put(strArr[i], bundleArr[i]);
        }
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String valueOf = String.valueOf(this.f151229c);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(valueOf).length());
        sb.append("ExtendableSavedState{");
        sb.append(hexString);
        sb.append(" states=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.f151229c.f26809h;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) this.f151229c.mo15620b(i3);
            bundleArr[i3] = (Bundle) this.f151229c.mo15621c(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f151229c = new C1245ok();
    }
}
