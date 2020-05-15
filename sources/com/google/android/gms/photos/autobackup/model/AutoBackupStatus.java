package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutoBackupStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anjz();

    /* renamed from: a */
    public final int f82175a;

    /* renamed from: b */
    public int f82176b;

    /* renamed from: c */
    public String f82177c;

    /* renamed from: d */
    public String f82178d;

    /* renamed from: e */
    public float f82179e;

    /* renamed from: f */
    public int f82180f;

    /* renamed from: g */
    public int f82181g;

    /* renamed from: h */
    public int f82182h;

    /* renamed from: i */
    public String[] f82183i;

    /* renamed from: j */
    public String f82184j;

    /* renamed from: k */
    public int f82185k;

    public AutoBackupStatus() {
        this.f82175a = 1;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("accountName", this.f82177c);
        a.mo25396a("autoBackupState", Integer.valueOf(this.f82176b));
        a.mo25396a("currentItem", this.f82178d);
        a.mo25396a("currentItemProgress", Float.valueOf(this.f82179e));
        a.mo25396a("numCompleted", Integer.valueOf(this.f82180f));
        a.mo25396a("numPending", Integer.valueOf(this.f82181g));
        a.mo25396a("numFailed", Integer.valueOf(this.f82182h));
        a.mo25396a("failedItems", this.f82183i);
        a.mo25396a("enabledAccountName", this.f82184j);
        a.mo25396a("numUploading", Integer.valueOf(this.f82185k));
        return a.toString();
    }

    public AutoBackupStatus(int i, int i2, String str, String str2, float f, int i3, int i4, int i5, String[] strArr, String str3, int i6) {
        this.f82175a = i;
        this.f82176b = i2;
        this.f82177c = str;
        this.f82178d = str2;
        this.f82179e = f;
        this.f82180f = i3;
        this.f82181g = i4;
        this.f82182h = i5;
        this.f82183i = strArr;
        this.f82184j = str3;
        this.f82185k = i6;
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
        see.m35063b(parcel, 1, this.f82175a);
        see.m35063b(parcel, 2, this.f82176b);
        see.m35046a(parcel, 3, this.f82177c, false);
        see.m35046a(parcel, 4, this.f82178d, false);
        see.m35034a(parcel, 5, this.f82179e);
        see.m35063b(parcel, 6, this.f82180f);
        see.m35063b(parcel, 7, this.f82181g);
        see.m35063b(parcel, 8, this.f82182h);
        see.m35058a(parcel, 9, this.f82183i, false);
        see.m35046a(parcel, 10, this.f82184j, false);
        see.m35063b(parcel, 11, this.f82185k);
        see.m35062b(parcel, a);
    }
}
