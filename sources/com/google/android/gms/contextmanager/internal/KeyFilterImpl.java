package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeyFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tmv();

    /* renamed from: a */
    public final ArrayList f30692a;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Inclusion extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new tmw();

        /* renamed from: a */
        public final String[] f30693a;

        /* renamed from: b */
        public final String[] f30694b;

        /* renamed from: c */
        public final String[] f30695c;

        public Inclusion(String[] strArr, String[] strArr2, String[] strArr3) {
            this.f30693a = strArr;
            this.f30694b = strArr2;
            this.f30695c = strArr3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Inclusion) {
                Inclusion inclusion = (Inclusion) obj;
                return Arrays.equals(this.f30693a, inclusion.f30693a) && Arrays.equals(this.f30694b, inclusion.f30694b) && Arrays.equals(this.f30695c, inclusion.f30695c);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f30693a) + Arrays.hashCode(this.f30694b) + Arrays.hashCode(this.f30695c);
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
         arg types: [android.os.Parcel, int, java.lang.String[], int]
         candidates:
          see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
          see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
          see.a(android.os.Parcel, int, java.lang.String, boolean):void
          see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
          see.a(android.os.Parcel, int, java.util.List, boolean):void
          see.a(android.os.Parcel, int, byte[], boolean):void
          see.a(android.os.Parcel, int, double[], boolean):void
          see.a(android.os.Parcel, int, float[], boolean):void
          see.a(android.os.Parcel, int, int[], boolean):void
          see.a(android.os.Parcel, int, long[], boolean):void
          see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
          see.a(android.os.Parcel, int, boolean[], boolean):void
          see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35058a(parcel, 2, this.f30693a, false);
            see.m35058a(parcel, 3, this.f30694b, false);
            see.m35058a(parcel, 4, this.f30695c, false);
            see.m35062b(parcel, a);
        }
    }

    public KeyFilterImpl(ArrayList arrayList) {
        this.f30692a = arrayList;
    }

    /* renamed from: a */
    public static boolean m22899a(String str, String[] strArr) {
        if (strArr == null || (r1 = strArr.length) == 0) {
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyFilterImpl) {
            return this.f30692a.equals(((KeyFilterImpl) obj).f30692a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30692a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f30692a, false);
        see.m35062b(parcel, a);
    }
}
