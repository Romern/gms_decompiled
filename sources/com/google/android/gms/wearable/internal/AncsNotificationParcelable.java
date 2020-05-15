package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AncsNotificationParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axpt();

    /* renamed from: a */
    public int f110886a;

    /* renamed from: b */
    public final String f110887b;

    /* renamed from: c */
    public final String f110888c;

    /* renamed from: d */
    public final String f110889d;

    /* renamed from: e */
    public final String f110890e;

    /* renamed from: f */
    public final String f110891f;

    /* renamed from: g */
    public final byte f110892g;

    /* renamed from: h */
    public final byte f110893h;

    /* renamed from: i */
    public final byte f110894i;

    /* renamed from: j */
    public final byte f110895j;

    /* renamed from: k */
    public final String f110896k;

    /* renamed from: l */
    private final String f110897l;

    public AncsNotificationParcelable(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.f110886a = i;
        this.f110887b = str;
        this.f110888c = str2;
        this.f110889d = str3;
        this.f110890e = str4;
        this.f110891f = str5;
        this.f110897l = str6;
        this.f110892g = b;
        this.f110893h = b2;
        this.f110894i = b3;
        this.f110895j = b4;
        this.f110896k = str7;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) obj;
            if (this.f110886a == ancsNotificationParcelable.f110886a && this.f110892g == ancsNotificationParcelable.f110892g && this.f110893h == ancsNotificationParcelable.f110893h && this.f110894i == ancsNotificationParcelable.f110894i && this.f110895j == ancsNotificationParcelable.f110895j && this.f110887b.equals(ancsNotificationParcelable.f110887b) && ((str = this.f110888c) == null ? ancsNotificationParcelable.f110888c == null : str.equals(ancsNotificationParcelable.f110888c)) && this.f110889d.equals(ancsNotificationParcelable.f110889d) && this.f110890e.equals(ancsNotificationParcelable.f110890e) && this.f110891f.equals(ancsNotificationParcelable.f110891f)) {
                String str2 = this.f110897l;
                if (str2 == null ? ancsNotificationParcelable.f110897l != null : !str2.equals(ancsNotificationParcelable.f110897l)) {
                    return false;
                }
                String str3 = this.f110896k;
                if (str3 != null) {
                    return str3.equals(ancsNotificationParcelable.f110896k);
                }
                return ancsNotificationParcelable.f110896k == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((this.f110886a + 31) * 31) + this.f110887b.hashCode()) * 31;
        String str = this.f110888c;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((((((hashCode + i) * 31) + this.f110889d.hashCode()) * 31) + this.f110890e.hashCode()) * 31) + this.f110891f.hashCode()) * 31;
        String str2 = this.f110897l;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (((((((((hashCode2 + i2) * 31) + this.f110892g) * 31) + this.f110893h) * 31) + this.f110894i) * 31) + this.f110895j) * 31;
        String str3 = this.f110896k;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        int i = this.f110886a;
        String str = this.f110887b;
        String str2 = this.f110888c;
        String str3 = this.f110889d;
        String str4 = this.f110890e;
        String str5 = this.f110891f;
        String str6 = this.f110897l;
        byte b = this.f110892g;
        byte b2 = this.f110893h;
        byte b3 = this.f110894i;
        byte b4 = this.f110895j;
        String str7 = this.f110896k;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        int length6 = String.valueOf(str6).length();
        StringBuilder sb = new StringBuilder(length + BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE + length2 + length3 + length4 + length5 + length6 + String.valueOf(str7).length());
        sb.append("AncsNotificationParcelable{, id=");
        sb.append(i);
        sb.append(", appId='");
        sb.append(str);
        sb.append("', dateTime='");
        sb.append(str2);
        sb.append("', notificationText='");
        sb.append(str3);
        sb.append("', title='");
        sb.append(str4);
        sb.append("', subtitle='");
        sb.append(str5);
        sb.append("', displayName='");
        sb.append(str6);
        sb.append("', eventId=");
        sb.append((int) b);
        sb.append(", eventFlags=");
        sb.append((int) b2);
        sb.append(", categoryId=");
        sb.append((int) b3);
        sb.append(", categoryCount=");
        sb.append((int) b4);
        sb.append(", packageName='");
        sb.append(str7);
        sb.append("'}");
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110886a);
        see.m35046a(parcel, 3, this.f110887b, false);
        see.m35046a(parcel, 4, this.f110888c, false);
        see.m35046a(parcel, 5, this.f110889d, false);
        see.m35046a(parcel, 6, this.f110890e, false);
        see.m35046a(parcel, 7, this.f110891f, false);
        String str = this.f110897l;
        if (str == null) {
            str = this.f110887b;
        }
        see.m35046a(parcel, 8, str, false);
        see.m35032a(parcel, 9, this.f110892g);
        see.m35032a(parcel, 10, this.f110893h);
        see.m35032a(parcel, 11, this.f110894i);
        see.m35032a(parcel, 12, this.f110895j);
        see.m35046a(parcel, 13, this.f110896k, false);
        see.m35062b(parcel, a);
    }
}
