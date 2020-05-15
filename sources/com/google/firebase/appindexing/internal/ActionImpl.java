package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActionImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brie();

    /* renamed from: a */
    public final String f152341a;

    /* renamed from: b */
    public final String f152342b;

    /* renamed from: c */
    public final String f152343c;

    /* renamed from: d */
    public final String f152344d;

    /* renamed from: e */
    public final MetadataImpl f152345e;

    /* renamed from: f */
    public final String f152346f;

    /* renamed from: g */
    public final Bundle f152347g;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class MetadataImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new brja();

        /* renamed from: a */
        public int f152348a;

        /* renamed from: b */
        public final boolean f152349b;

        /* renamed from: c */
        public final String f152350c;

        /* renamed from: d */
        public final String f152351d;

        /* renamed from: e */
        public final byte[] f152352e;

        /* renamed from: f */
        public final boolean f152353f;

        public MetadataImpl(int i, boolean z, String str, String str2, byte[] bArr, boolean z2) {
            this.f152348a = i;
            this.f152349b = z;
            this.f152350c = str;
            this.f152351d = str2;
            this.f152352e = bArr;
            this.f152353f = z2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MetadataImpl { { eventStatus: '");
            sb.append(this.f152348a);
            sb.append("' } { uploadable: '");
            sb.append(this.f152349b);
            sb.append("' } ");
            if (this.f152350c != null) {
                sb.append("{ completionToken: '");
                sb.append(this.f152350c);
                sb.append("' } ");
            }
            if (this.f152351d != null) {
                sb.append("{ accountName: '");
                sb.append(this.f152351d);
                sb.append("' } ");
            }
            if (this.f152352e != null) {
                sb.append("{ ssbContext: [ ");
                byte[] bArr = this.f152352e;
                for (byte b : bArr) {
                    sb.append("0x");
                    sb.append(Integer.toHexString(b));
                    sb.append(" ");
                }
                sb.append("] } ");
            }
            sb.append("{ contextOnly: '");
            sb.append(this.f152353f);
            sb.append("' } }");
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
            see.m35063b(parcel, 1, this.f152348a);
            see.m35051a(parcel, 2, this.f152349b);
            see.m35046a(parcel, 3, this.f152350c, false);
            see.m35046a(parcel, 4, this.f152351d, false);
            see.m35052a(parcel, 5, this.f152352e, false);
            see.m35051a(parcel, 6, this.f152353f);
            see.m35062b(parcel, a);
        }
    }

    public ActionImpl(String str, String str2, String str3, String str4, MetadataImpl metadataImpl, String str5, Bundle bundle) {
        this.f152341a = str;
        this.f152342b = str2;
        this.f152343c = str3;
        this.f152344d = str4;
        this.f152345e = metadataImpl;
        this.f152346f = str5;
        if (bundle == null) {
            this.f152347g = Bundle.EMPTY;
        } else {
            this.f152347g = bundle;
        }
        this.f152347g.setClassLoader(getClass().getClassLoader());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActionImpl { { actionType: '");
        sb.append(this.f152341a);
        sb.append("' } { objectName: '");
        sb.append(this.f152342b);
        sb.append("' } { objectUrl: '");
        sb.append(this.f152343c);
        sb.append("' } ");
        if (this.f152344d != null) {
            sb.append("{ objectSameAs: '");
            sb.append(this.f152344d);
            sb.append("' } ");
        }
        if (this.f152345e != null) {
            sb.append("{ metadata: '");
            sb.append(this.f152345e.toString());
            sb.append("' } ");
        }
        if (this.f152346f != null) {
            sb.append("{ actionStatus: '");
            sb.append(this.f152346f);
            sb.append("' } ");
        }
        if (!this.f152347g.isEmpty()) {
            sb.append("{ ");
            sb.append(this.f152347g);
            sb.append(" } ");
        }
        sb.append("}");
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
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
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f152341a, false);
        see.m35046a(parcel, 2, this.f152342b, false);
        see.m35046a(parcel, 3, this.f152343c, false);
        see.m35046a(parcel, 4, this.f152344d, false);
        see.m35040a(parcel, 5, this.f152345e, i, false);
        see.m35046a(parcel, 6, this.f152346f, false);
        see.m35037a(parcel, 7, this.f152347g, false);
        see.m35062b(parcel, a);
    }
}
