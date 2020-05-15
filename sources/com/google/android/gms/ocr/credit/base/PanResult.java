package com.google.android.gms.ocr.credit.base;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PanResult extends GenericResult {
    public static final Parcelable.Creator CREATOR = new aksv();

    /* renamed from: a */
    public final double f81308a;

    public PanResult(String str, double d, double d2) {
        super(str, d2);
        this.f81308a = d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f81303e);
        parcel.writeDouble(this.f81308a);
        parcel.writeDouble(mo44733d());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public PanResult(int[] iArr, double d, double d2) {
        this(new String(r0), d, d2);
        char[] cArr = new char[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            cArr[i] = (char) (iArr[i] + 48);
        }
    }
}
