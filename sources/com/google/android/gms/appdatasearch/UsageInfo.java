package com.google.android.gms.appdatasearch;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UsageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ftc();

    /* renamed from: a */
    public final DocumentId f9694a;

    /* renamed from: b */
    public final long f9695b;

    /* renamed from: c */
    public int f9696c;

    /* renamed from: d */
    public final String f9697d;

    /* renamed from: e */
    public final DocumentContents f9698e;

    /* renamed from: f */
    public final boolean f9699f;

    /* renamed from: g */
    int f9700g;

    /* renamed from: h */
    public int f9701h;

    /* renamed from: i */
    public final String f9702i;

    public UsageInfo(DocumentId documentId, long j, int i, String str, DocumentContents documentContents, boolean z, int i2, int i3, String str2) {
        this.f9694a = documentId;
        this.f9695b = j;
        this.f9696c = i;
        this.f9697d = str;
        this.f9698e = documentContents;
        this.f9699f = z;
        this.f9700g = i2;
        this.f9701h = i3;
        this.f9702i = str2;
    }

    /* renamed from: a */
    public static DocumentSection m6157a(Uri uri) {
        String uri2 = uri.toString();
        fsa fsa = new fsa("web_url");
        fsa.f17179b = true;
        fsa.f17183f = "url";
        return new DocumentSection(uri2, fsa.mo11234a());
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", this.f9694a, Long.valueOf(this.f9695b), Integer.valueOf(this.f9696c), Integer.valueOf(this.f9701h));
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
        see.m35040a(parcel, 1, this.f9694a, i, false);
        see.m35036a(parcel, 2, this.f9695b);
        see.m35063b(parcel, 3, this.f9696c);
        see.m35046a(parcel, 4, this.f9697d, false);
        see.m35040a(parcel, 5, this.f9698e, i, false);
        see.m35051a(parcel, 6, this.f9699f);
        see.m35063b(parcel, 7, this.f9700g);
        see.m35063b(parcel, 8, this.f9701h);
        see.m35046a(parcel, 9, this.f9702i, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public static DocumentSection m6158a(String str) {
        fsa fsa = new fsa("title");
        fsa.f17181d = true;
        fsa.f17183f = "name";
        return new DocumentSection(str, fsa.mo11234a());
    }

    /* renamed from: a */
    public static DocumentSection m6159a(String str, String str2) {
        fsa fsa = new fsa(str);
        fsa.f17179b = true;
        return new DocumentSection(str2, fsa.mo11234a());
    }
}
