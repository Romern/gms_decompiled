package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RadioStationInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new nvp();

    /* renamed from: a */
    public int f29436a;

    /* renamed from: b */
    public int f29437b;

    /* renamed from: c */
    public int f29438c;

    /* renamed from: d */
    public MetaData f29439d;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class HdData extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new nvq();

        public final void writeToParcel(Parcel parcel, int i) {
            see.m35062b(parcel, see.m35030a(parcel));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class MetaData extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new nvr();

        /* renamed from: a */
        public int f29440a;

        /* renamed from: b */
        public int f29441b;

        /* renamed from: c */
        public RdsData f29442c;

        /* renamed from: d */
        public HdData f29443d;

        public MetaData(int i, int i2, RdsData rdsData, HdData hdData) {
            this.f29440a = i;
            this.f29441b = i2;
            this.f29442c = rdsData;
            this.f29443d = hdData;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 1, this.f29440a);
            see.m35063b(parcel, 2, this.f29441b);
            see.m35040a(parcel, 3, this.f29442c, i, false);
            see.m35040a(parcel, 4, this.f29443d, i, false);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class RdsData extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new nvs();

        /* renamed from: a */
        public List f29444a;

        /* renamed from: b */
        public int f29445b;

        /* renamed from: c */
        public int f29446c;

        /* renamed from: d */
        public String f29447d;

        /* renamed from: e */
        public int f29448e;

        /* renamed from: f */
        public String f29449f;

        /* renamed from: g */
        public String f29450g;

        /* renamed from: h */
        public boolean f29451h;

        /* renamed from: i */
        public boolean f29452i;

        public RdsData(List list, int i, int i2, String str, int i3, String str2, String str3, boolean z, boolean z2) {
            this.f29444a = list;
            this.f29445b = i;
            this.f29446c = i2;
            this.f29447d = str;
            this.f29448e = i3;
            this.f29449f = str2;
            this.f29450g = str3;
            this.f29451h = z;
            this.f29452i = z2;
        }

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
            see.m35049a(parcel, 1, this.f29444a, false);
            see.m35063b(parcel, 2, this.f29445b);
            see.m35063b(parcel, 3, this.f29446c);
            see.m35046a(parcel, 4, this.f29447d, false);
            see.m35063b(parcel, 5, this.f29448e);
            see.m35046a(parcel, 6, this.f29449f, false);
            see.m35046a(parcel, 7, this.f29450g, false);
            see.m35051a(parcel, 8, this.f29451h);
            see.m35051a(parcel, 9, this.f29452i);
            see.m35062b(parcel, a);
        }
    }

    public RadioStationInfo(int i, int i2, int i3, MetaData metaData) {
        this.f29436a = i;
        this.f29437b = i2;
        this.f29438c = i3;
        this.f29439d = metaData;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29436a);
        see.m35063b(parcel, 2, this.f29437b);
        see.m35063b(parcel, 3, this.f29438c);
        see.m35040a(parcel, 4, this.f29439d, i, false);
        see.m35062b(parcel, a);
    }
}
