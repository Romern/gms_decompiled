package com.google.android.gms.locationsharing.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TosUiDescription extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aetz();

    /* renamed from: a */
    public final String f79659a;

    /* renamed from: b */
    public final String f79660b;

    /* renamed from: c */
    public final List f79661c;

    /* renamed from: d */
    public final String f79662d;

    /* renamed from: e */
    public final String f79663e;

    /* renamed from: f */
    public final String f79664f;

    /* renamed from: g */
    public final String f79665g;

    /* renamed from: h */
    public final byte[] f79666h;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Section extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new aety();

        /* renamed from: a */
        public final String f79667a;

        /* renamed from: b */
        public final String f79668b;

        /* renamed from: c */
        public final String f79669c;

        public Section(String str, String str2, String str3) {
            this.f79667a = str;
            this.f79668b = str2;
            this.f79669c = str3;
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
            see.m35046a(parcel, 1, this.f79667a, false);
            see.m35046a(parcel, 2, this.f79668b, false);
            see.m35046a(parcel, 3, this.f79669c, false);
            see.m35062b(parcel, a);
        }
    }

    public TosUiDescription(String str, String str2, List list, String str3, String str4, String str5, String str6, byte[] bArr) {
        this.f79659a = str;
        this.f79660b = str2;
        this.f79661c = list;
        this.f79662d = str3;
        this.f79663e = str4;
        this.f79664f = str5;
        this.f79665g = str6;
        this.f79666h = bArr;
    }

    /* renamed from: a */
    public static String m67035a(List list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = ((bznn) list.get(i)).f170729a;
            sb.append("<br><br>");
            sb.append(str);
        }
        return sb.substring(8);
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f79659a, false);
        see.m35046a(parcel, 2, this.f79660b, false);
        see.m35066c(parcel, 3, this.f79661c, false);
        see.m35046a(parcel, 4, this.f79662d, false);
        see.m35046a(parcel, 5, this.f79663e, false);
        see.m35046a(parcel, 6, this.f79664f, false);
        see.m35046a(parcel, 7, this.f79665g, false);
        see.m35052a(parcel, 8, this.f79666h, false);
        see.m35062b(parcel, a);
    }
}
