package com.google.android.gms.family.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MemberDataModel implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wie();

    /* renamed from: a */
    public final String f31350a;

    /* renamed from: b */
    public final String f31351b;

    /* renamed from: c */
    public final String f31352c;

    /* renamed from: d */
    public final String f31353d;

    /* renamed from: e */
    public final String f31354e;

    /* renamed from: f */
    public final String f31355f;

    /* renamed from: g */
    public int f31356g;

    /* renamed from: h */
    public boolean f31357h;

    /* renamed from: i */
    public long f31358i;

    /* renamed from: j */
    public int f31359j;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        if (r0.equals("UNSUPERVISED") != false) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    public MemberDataModel(Parcel parcel) {
        this.f31350a = parcel.readString();
        this.f31351b = parcel.readString();
        this.f31352c = parcel.readString();
        this.f31353d = parcel.readString();
        this.f31354e = parcel.readString();
        this.f31355f = parcel.readString();
        this.f31356g = parcel.readInt();
        char c = 0;
        int i = 1;
        this.f31357h = parcel.readInt() == 1;
        String readString = parcel.readString();
        int hashCode = readString.hashCode();
        if (hashCode != -1553293955) {
            if (hashCode == -1212137948 && readString.equals("SUPERVISED")) {
                c = 1;
                if (c != 0) {
                    if (c == 1) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                this.f31359j = i;
                this.f31358i = parcel.readLong();
            }
        }
        c = 65535;
        if (c != 0) {
        }
        this.f31359j = i;
        this.f31358i = parcel.readLong();
    }

    /* renamed from: a */
    public final boolean mo18428a() {
        return this.f31359j != 1;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31350a);
        parcel.writeString(this.f31351b);
        parcel.writeString(this.f31352c);
        parcel.writeString(this.f31353d);
        parcel.writeString(this.f31354e);
        parcel.writeString(this.f31355f);
        parcel.writeInt(this.f31356g);
        parcel.writeInt(this.f31357h ? 1 : 0);
        int i2 = this.f31359j;
        String str = i2 != 1 ? i2 != 2 ? "null" : "SUPERVISED" : "UNSUPERVISED";
        if (i2 != 0) {
            parcel.writeString(str);
            parcel.writeLong(this.f31358i);
            return;
        }
        throw null;
    }

    public MemberDataModel(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, int i2, Long l) {
        this.f31350a = str;
        this.f31351b = str2;
        this.f31352c = str3;
        this.f31353d = str4;
        this.f31354e = str5;
        this.f31355f = str6;
        this.f31356g = i;
        this.f31357h = z;
        this.f31359j = i2;
        this.f31358i = l.longValue();
    }
}
