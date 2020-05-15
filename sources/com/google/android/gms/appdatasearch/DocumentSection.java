package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DocumentSection extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fqz();

    /* renamed from: a */
    public static final int f9541a = Integer.parseInt("-1");

    /* renamed from: b */
    public static final RegisterSectionInfo f9542b;

    /* renamed from: c */
    public final String f9543c;

    /* renamed from: d */
    public final RegisterSectionInfo f9544d;

    /* renamed from: e */
    public final int f9545e;

    /* renamed from: f */
    public final byte[] f9546f;

    static {
        fsa fsa = new fsa("SsbContext");
        fsa.f17179b = true;
        fsa.f17178a = "blob";
        f9542b = fsa.mo11234a();
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo) {
        this(str, registerSectionInfo, f9541a, null);
    }

    /* renamed from: a */
    public final String mo7175a() {
        int i = this.f9545e;
        if (i != f9541a && fro.m12230a(i) == null) {
            int i2 = this.f9545e;
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid section type ");
            sb.append(i2);
            return sb.toString();
        } else if (this.f9543c == null || this.f9546f == null) {
            return null;
        } else {
            return "Both content and blobContent set";
        }
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo, int i, byte[] bArr) {
        boolean z = true;
        if (i != f9541a && fro.m12230a(i) == null) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid section type ");
        sb.append(i);
        sdo.m34975b(z, sb.toString());
        this.f9543c = str;
        this.f9544d = registerSectionInfo;
        this.f9545e = i;
        this.f9546f = bArr;
        String a = mo7175a();
        if (a != null) {
            throw new IllegalArgumentException(a);
        }
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
        see.m35046a(parcel, 1, this.f9543c, false);
        see.m35040a(parcel, 3, this.f9544d, i, false);
        see.m35063b(parcel, 4, this.f9545e);
        see.m35052a(parcel, 5, this.f9546f, false);
        see.m35062b(parcel, a);
    }

    public DocumentSection(byte[] bArr, RegisterSectionInfo registerSectionInfo) {
        this(null, registerSectionInfo, f9541a, bArr);
    }
}
