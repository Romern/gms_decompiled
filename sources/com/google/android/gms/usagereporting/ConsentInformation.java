package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConsentInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avtt();

    /* renamed from: a */
    public static final ConsentInformation f109531a = new ConsentInformation(null, false, false);

    /* renamed from: b */
    public boolean f109532b;

    /* renamed from: c */
    public boolean f109533c;

    /* renamed from: d */
    private List f109534d;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class AccountConsentInformation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avtr();

        /* renamed from: a */
        public final String f109535a;

        /* renamed from: b */
        public final byte[] f109536b;

        /* renamed from: c */
        private List f109537c;

        public AccountConsentInformation(String str, byte[] bArr, List list) {
            this.f109535a = str;
            this.f109536b = bArr;
            this.f109537c = list == null ? new ArrayList(0) : new ArrayList(list);
        }

        /* renamed from: a */
        public final List mo59686a() {
            return new ArrayList(this.f109537c);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof AccountConsentInformation) {
                AccountConsentInformation accountConsentInformation = (AccountConsentInformation) obj;
                return sdg.m34949a(this.f109535a, accountConsentInformation.f109535a) && sdg.m34949a(this.f109536b, accountConsentInformation.f109536b) && sdg.m34949a(this.f109537c, accountConsentInformation.f109537c);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f109535a, this.f109536b, this.f109537c});
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
        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: see.a(android.os.Parcel, int, byte[], boolean):void
         arg types: [android.os.Parcel, int, byte[], int]
         candidates:
          see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
          see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
          see.a(android.os.Parcel, int, java.lang.String, boolean):void
          see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
          see.a(android.os.Parcel, int, java.util.List, boolean):void
          see.a(android.os.Parcel, int, double[], boolean):void
          see.a(android.os.Parcel, int, float[], boolean):void
          see.a(android.os.Parcel, int, int[], boolean):void
          see.a(android.os.Parcel, int, long[], boolean):void
          see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
          see.a(android.os.Parcel, int, java.lang.String[], boolean):void
          see.a(android.os.Parcel, int, boolean[], boolean):void
          see.a(android.os.Parcel, int, byte[], boolean):void */
        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: see.a(android.os.Parcel, int, java.util.List, boolean):void
         arg types: [android.os.Parcel, int, java.util.List, int]
         candidates:
          see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
          see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
          see.a(android.os.Parcel, int, java.lang.String, boolean):void
          see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
          see.a(android.os.Parcel, int, byte[], boolean):void
          see.a(android.os.Parcel, int, double[], boolean):void
          see.a(android.os.Parcel, int, float[], boolean):void
          see.a(android.os.Parcel, int, int[], boolean):void
          see.a(android.os.Parcel, int, long[], boolean):void
          see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
          see.a(android.os.Parcel, int, java.lang.String[], boolean):void
          see.a(android.os.Parcel, int, boolean[], boolean):void
          see.a(android.os.Parcel, int, java.util.List, boolean):void */
        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35046a(parcel, 1, this.f109535a, false);
            see.m35052a(parcel, 2, this.f109536b, false);
            see.m35049a(parcel, 3, mo59686a(), false);
            see.m35062b(parcel, a);
        }
    }

    public ConsentInformation(List list, boolean z, boolean z2) {
        this.f109534d = list == null ? new ArrayList(0) : new ArrayList(list);
        this.f109532b = z;
        this.f109533c = z2;
    }

    /* renamed from: b */
    public static avts m93760b() {
        return new avts();
    }

    /* renamed from: a */
    public final List mo59682a() {
        return new ArrayList(this.f109534d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConsentInformation) {
            ConsentInformation consentInformation = (ConsentInformation) obj;
            return sdg.m34949a(this.f109534d, consentInformation.f109534d) && sdg.m34949a(Boolean.valueOf(this.f109532b), Boolean.valueOf(consentInformation.f109532b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f109534d, Boolean.valueOf(this.f109532b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, mo59682a(), false);
        see.m35051a(parcel, 2, this.f109532b);
        see.m35051a(parcel, 3, this.f109533c);
        see.m35062b(parcel, a);
    }
}
