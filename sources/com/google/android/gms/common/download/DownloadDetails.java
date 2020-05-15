package com.google.android.gms.common.download;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DownloadDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rxx();

    /* renamed from: a */
    public final String f30175a;

    /* renamed from: b */
    public final String f30176b;

    /* renamed from: c */
    public final long f30177c;

    /* renamed from: d */
    public final String f30178d;

    /* renamed from: e */
    public final String f30179e;

    /* renamed from: f */
    public final int f30180f;

    /* renamed from: g */
    public final int f30181g;

    @Deprecated
    public DownloadDetails(String str, String str2, long j, String str3, String str4, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(88);
        sb.append("The minVersion (");
        sb.append(i);
        sb.append(") must be less than or equal to the maxVersion (");
        sb.append(i2);
        sb.append(").");
        sdo.m34975b(z, sb.toString());
        z2 = j <= 0 ? false : z2;
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("sizeBytes (");
        sb2.append(j);
        sb2.append(") must be greater than zero");
        sdo.m34975b(z2, sb2.toString());
        sdo.m34959a((Object) str);
        this.f30175a = str;
        sdo.m34959a((Object) str2);
        this.f30176b = str2;
        this.f30177c = j;
        sdo.m34959a((Object) str3);
        this.f30178d = str3;
        this.f30179e = str4;
        this.f30180f = i;
        this.f30181g = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadDetails)) {
            return false;
        }
        DownloadDetails downloadDetails = (DownloadDetails) obj;
        if (!this.f30175a.equals(downloadDetails.f30175a) || !this.f30176b.equals(downloadDetails.f30176b) || this.f30177c != downloadDetails.f30177c || !this.f30178d.equals(downloadDetails.f30178d)) {
            return false;
        }
        String str = this.f30179e;
        return ((str == null && downloadDetails.f30179e == null) || str.equals(downloadDetails.f30179e)) && this.f30180f == downloadDetails.f30180f && this.f30181g == downloadDetails.f30181g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30175a, this.f30176b, Long.valueOf(this.f30177c), this.f30178d, this.f30179e, Integer.valueOf(this.f30180f), Integer.valueOf(this.f30181g)});
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
        see.m35046a(parcel, 2, this.f30175a, false);
        see.m35046a(parcel, 3, this.f30176b, false);
        see.m35036a(parcel, 4, this.f30177c);
        see.m35046a(parcel, 5, this.f30178d, false);
        see.m35046a(parcel, 6, this.f30179e, false);
        see.m35063b(parcel, 7, this.f30180f);
        see.m35063b(parcel, 8, this.f30181g);
        see.m35062b(parcel, a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public DownloadDetails(JSONObject jSONObject) {
        this(r2, r3, r4, r6, r7, r8, r9);
        String str;
        int i;
        int i2;
        String string = jSONObject.getString("filename");
        String string2 = jSONObject.getString("url");
        long j = jSONObject.getLong("sizeBytes");
        String string3 = jSONObject.getString("sha1");
        if (jSONObject.has("destination")) {
            str = jSONObject.getString("destination");
        } else {
            str = null;
        }
        if (jSONObject.has("minVersion")) {
            i = jSONObject.getInt("minVersion");
        } else {
            i = 0;
        }
        if (jSONObject.has("maxVersion")) {
            i2 = jSONObject.getInt("maxVersion");
        } else {
            i2 = Integer.MAX_VALUE;
        }
    }

    public DownloadDetails(rxw rxw) {
        boolean z;
        long j = rxw.f43835c;
        boolean z2 = true;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(58);
        sb.append("sizeBytes (");
        sb.append(j);
        sb.append(") must be greater than zero");
        sdo.m34975b(z, sb.toString());
        int i = rxw.f43838f;
        int i2 = rxw.f43839g;
        z2 = i > i2 ? false : z2;
        StringBuilder sb2 = new StringBuilder(88);
        sb2.append("The minVersion (");
        sb2.append(i);
        sb2.append(") must be less than or equal to the maxVersion (");
        sb2.append(i2);
        sb2.append(").");
        sdo.m34975b(z2, sb2.toString());
        String str = rxw.f43833a;
        sdo.m34959a((Object) str);
        this.f30175a = str;
        String str2 = rxw.f43834b;
        sdo.m34959a((Object) str2);
        this.f30176b = str2;
        this.f30177c = rxw.f43835c;
        String str3 = rxw.f43836d;
        sdo.m34959a((Object) str3);
        this.f30178d = str3;
        this.f30179e = rxw.f43837e;
        this.f30180f = rxw.f43838f;
        this.f30181g = rxw.f43839g;
    }
}
