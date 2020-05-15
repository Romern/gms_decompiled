package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Strategy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aiyj();

    /* renamed from: a */
    public static final Strategy f80688a = new aiyi().mo38269a();

    /* renamed from: b */
    public static final Strategy f80689b;

    /* renamed from: c */
    final int f80690c;
    @Deprecated

    /* renamed from: d */
    final int f80691d;

    /* renamed from: e */
    public final int f80692e;

    /* renamed from: f */
    public final int f80693f;
    @Deprecated

    /* renamed from: g */
    final boolean f80694g;

    /* renamed from: h */
    public final int f80695h;

    /* renamed from: i */
    public final int f80696i;

    /* renamed from: j */
    public final int f80697j;

    static {
        aiyi aiyi = new aiyi();
        aiyi.f70067c = 2;
        aiyi.mo38270a(Integer.MAX_VALUE);
        f80689b = aiyi.mo38269a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    public Strategy(int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7) {
        this.f80690c = i;
        this.f80691d = i2;
        if (i2 != 0) {
            if (i2 != 2) {
                i6 = 3;
                if (i2 == 3) {
                    this.f80696i = 2;
                }
            } else {
                this.f80696i = 1;
            }
            this.f80693f = i4;
            this.f80694g = z;
            if (!z) {
                this.f80695h = 2;
                this.f80692e = Integer.MAX_VALUE;
            } else {
                this.f80692e = i3;
                if (i5 == -1 || i5 == 0 || i5 == 1 || i5 == 6) {
                    this.f80695h = -1;
                } else {
                    this.f80695h = i5;
                }
            }
            this.f80697j = i7;
        }
        this.f80696i = i6;
        this.f80693f = i4;
        this.f80694g = z;
        if (!z) {
        }
        this.f80697j = i7;
    }

    /* renamed from: a */
    public final boolean mo44316a() {
        return (this.f80696i & 2) != 0;
    }

    /* renamed from: b */
    public final boolean mo44317b() {
        return (this.f80696i & 1) != 0;
    }

    /* renamed from: c */
    public final boolean mo44318c() {
        return (this.f80695h & 2) != 0;
    }

    /* renamed from: d */
    public final boolean mo44319d() {
        return this.f80695h == -1;
    }

    /* renamed from: e */
    public final boolean mo44320e() {
        return (this.f80695h & 4) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Strategy) {
            Strategy strategy = (Strategy) obj;
            return this.f80690c == strategy.f80690c && this.f80696i == strategy.f80696i && this.f80692e == strategy.f80692e && this.f80693f == strategy.f80693f && this.f80695h == strategy.f80695h && this.f80697j == strategy.f80697j;
        }
    }

    public final int hashCode() {
        return (((((((((this.f80690c * 31) + this.f80696i) * 31) + this.f80692e) * 31) + this.f80693f) * 31) + this.f80695h) * 31) + this.f80697j;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.f80692e;
        int i2 = this.f80693f;
        String str4 = "DEFAULT";
        if (i2 == 0) {
            str = str4;
        } else if (i2 != 1) {
            StringBuilder sb = new StringBuilder(19);
            sb.append("UNKNOWN:");
            sb.append(i2);
            str = sb.toString();
        } else {
            str = "EARSHOT";
        }
        int i3 = this.f80695h;
        if (i3 != -1) {
            ArrayList arrayList = new ArrayList();
            if ((i3 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i3 & 2) > 0) {
                arrayList.add("BLE");
            }
            if (arrayList.isEmpty()) {
                StringBuilder sb2 = new StringBuilder(19);
                sb2.append("UNKNOWN:");
                sb2.append(i3);
                str2 = sb2.toString();
            } else {
                str2 = arrayList.toString();
            }
        } else {
            str2 = str4;
        }
        int i4 = this.f80696i;
        if (i4 != 3) {
            ArrayList arrayList2 = new ArrayList();
            if ((i4 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i4 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            if (arrayList2.isEmpty()) {
                StringBuilder sb3 = new StringBuilder(19);
                sb3.append("UNKNOWN:");
                sb3.append(i4);
                str3 = sb3.toString();
            } else {
                str3 = arrayList2.toString();
            }
        } else {
            str3 = str4;
        }
        int i5 = this.f80697j;
        if (i5 != 0) {
            if (i5 != 1) {
                StringBuilder sb4 = new StringBuilder(20);
                sb4.append("UNKNOWN: ");
                sb4.append(i5);
                str4 = sb4.toString();
            } else {
                str4 = "ALWAYS_ON";
            }
        }
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb5 = new StringBuilder(length + 102 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb5.append("Strategy{ttlSeconds=");
        sb5.append(i);
        sb5.append(", distanceType=");
        sb5.append(str);
        sb5.append(", discoveryMedium=");
        sb5.append(str2);
        sb5.append(", discoveryMode=");
        sb5.append(str3);
        sb5.append(", backgroundScanMode=");
        sb5.append(str4);
        sb5.append('}');
        return sb5.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80691d);
        see.m35063b(parcel, 2, this.f80692e);
        see.m35063b(parcel, 3, this.f80693f);
        see.m35051a(parcel, 4, this.f80694g);
        see.m35063b(parcel, 5, this.f80695h);
        see.m35063b(parcel, 6, this.f80696i);
        see.m35063b(parcel, 7, this.f80697j);
        see.m35063b(parcel, 1000, this.f80690c);
        see.m35062b(parcel, a);
    }
}
