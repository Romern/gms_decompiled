package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FileAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new ajjb();

    /* renamed from: a */
    public final String f80881a;

    /* renamed from: b */
    public final int f80882b;

    /* renamed from: c */
    public final long f80883c;

    /* renamed from: d */
    public final Uri f80884d;

    /* renamed from: e */
    public final Bundle f80885e;

    /* renamed from: f */
    public final String f80886f;

    public FileAttachment(String str, int i, long j, Uri uri, Bundle bundle, String str2) {
        this.f80881a = str;
        this.f80882b = i;
        this.f80883c = j;
        this.f80884d = uri;
        this.f80885e = bundle;
        this.f80886f = str2;
    }

    /* renamed from: a */
    public final long mo44383a() {
        return this.f80883c;
    }

    /* renamed from: b */
    public final int mo44384b() {
        return this.f80882b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FileAttachment) {
            FileAttachment fileAttachment = (FileAttachment) obj;
            return sdg.m34949a(this.f80881a, fileAttachment.f80881a) && sdg.m34949a(Integer.valueOf(this.f80882b), Integer.valueOf(fileAttachment.f80882b)) && sdg.m34949a(Long.valueOf(this.f80883c), Long.valueOf(fileAttachment.f80883c)) && sdg.m34949a(this.f80884d, fileAttachment.f80884d) && sdg.m34949a(this.f80886f, fileAttachment.f80886f);
        }
    }

    /* renamed from: f */
    public final int mo44388f() {
        return 2;
    }

    public final int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.f80881a;
        objArr[1] = Integer.valueOf(this.f80882b);
        objArr[2] = Long.valueOf(this.f80883c);
        int i = this.f80884d;
        objArr[3] = i;
        if (this.f80886f == null) {
            i = 0;
        }
        objArr[4] = i;
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        return String.format(Locale.US, "FileAttachment<fileName: %s, type: %s, size: %s, uri: %s, mimeType: %s>", this.f80881a, Integer.valueOf(this.f80882b), Long.valueOf(this.f80883c), this.f80884d, this.f80886f);
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
        see.m35046a(parcel, 1, this.f80881a, false);
        see.m35063b(parcel, 2, this.f80882b);
        see.m35036a(parcel, 3, this.f80883c);
        see.m35040a(parcel, 4, this.f80884d, i, false);
        see.m35037a(parcel, 5, this.f80885e, false);
        see.m35046a(parcel, 6, this.f80886f, false);
        see.m35062b(parcel, a);
    }
}
