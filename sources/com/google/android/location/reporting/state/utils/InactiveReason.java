package com.google.android.location.reporting.state.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InactiveReason extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgza();

    /* renamed from: a */
    public static final int[] f150916a = {13, 3, 5, 7, 11, 12, 4, 14, 6, 10};

    /* renamed from: b */
    public final int f150917b;

    /* renamed from: c */
    public final String f150918c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public InactiveReason(int i, String str) {
        this.f150917b = i;
        sdo.checkIfNull((Object) str, (Object) "missing name");
        this.f150918c = str;
    }

    /* renamed from: a */
    public static boolean m117336a(Iterable iterable, int i) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((InactiveReason) it.next()).f150917b == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InactiveReason) {
            InactiveReason inactiveReason = (InactiveReason) obj;
            if (this.f150917b != inactiveReason.f150917b || !this.f150918c.equals(inactiveReason.f150918c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f150917b), this.f150918c});
    }

    public final String toString() {
        int i = this.f150917b;
        String str = this.f150918c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append("InactiveReason{mIdentifier=");
        sb.append(i);
        sb.append(", mName='");
        sb.append(str);
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
        see.m35063b(parcel, 2, this.f150917b);
        see.m35046a(parcel, 3, this.f150918c, false);
        see.m35062b(parcel, a);
    }
}
