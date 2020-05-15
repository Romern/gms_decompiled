package com.google.android.gms.ocr.credit.base;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExpDateResult extends GenericResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new akss();

    /* renamed from: a */
    public final int f81297a;

    /* renamed from: b */
    public final akst f81298b;

    /* renamed from: f */
    private final int[] f81299f;

    /* renamed from: g */
    private final int[] f81300g;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ExpDateResult(String str, int i, double d, int[] iArr, int[] iArr2) {
        this(str, i, d, iArr, iArr2, r7);
        akst akst;
        akst akst2;
        int i2;
        if (str != null) {
            int length = str.length();
            if (length == 5) {
                akst2 = new akst(Integer.parseInt(str.substring(0, 2)), Integer.parseInt(str.substring(3, 5)), 1);
            } else if (length != 8) {
                akst2 = null;
            } else {
                akst2 = new akst(Integer.parseInt(str.substring(0, 2)), Integer.parseInt(str.substring(6, 8)), 2);
            }
            if (akst2 == null || (i2 = akst2.f72674b) <= 0) {
                akst = null;
            } else {
                akst = i2 > 12 ? null : akst2;
            }
        } else {
            akst = null;
        }
    }

    /* renamed from: a */
    public final int mo44727a() {
        mo44729c();
        return this.f81298b.f72674b;
    }

    /* renamed from: b */
    public final int mo44728b() {
        mo44729c();
        return this.f81298b.f72675c;
    }

    /* renamed from: c */
    public final void mo44729c() {
        if (this.f81298b == null) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("exp date \"");
            sb.append(valueOf);
            sb.append("\" was not parsed into a valid date");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f81303e);
        parcel.writeInt(this.f81297a);
        parcel.writeDouble(mo44733d());
        parcel.writeIntArray(this.f81299f);
        parcel.writeIntArray(this.f81300g);
    }

    public ExpDateResult(String str, int i, double d, int[] iArr, int[] iArr2, akst akst) {
        super(str, d);
        this.f81297a = i;
        this.f81299f = iArr;
        this.f81300g = iArr2;
        this.f81298b = akst;
    }
}
