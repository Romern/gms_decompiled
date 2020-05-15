package com.google.android.gms.fonts;

import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FontFetchResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new zxc();

    /* renamed from: f */
    private static final Status f32456f = new Status(8, "File missing");

    /* renamed from: g */
    private static final Status f32457g = new Status(8, "Unable to get FD");

    /* renamed from: a */
    final int f32458a;

    /* renamed from: b */
    public final Status f32459b;

    /* renamed from: c */
    public final String f32460c;

    /* renamed from: d */
    public final ParcelFileDescriptor f32461d;

    /* renamed from: e */
    public final FontMatchSpec f32462e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public FontFetchResult(int i, Status status, String str, ParcelFileDescriptor parcelFileDescriptor, FontMatchSpec fontMatchSpec) {
        boolean z;
        String str2;
        this.f32458a = i;
        sdo.m34966a(status, "status");
        this.f32459b = status;
        this.f32460c = str;
        this.f32461d = parcelFileDescriptor;
        this.f32462e = fontMatchSpec;
        if (i >= 2) {
            boolean c = status.mo17710c();
            boolean z2 = false;
            if (fontMatchSpec != null) {
                z = false;
            } else {
                z = true;
            }
            z2 = c != z ? true : z2;
            if (!status.mo17710c()) {
                str2 = "";
            } else {
                str2 = "not ";
            }
            String valueOf = String.valueOf(status);
            StringBuilder sb = new StringBuilder(str2.length() + 22 + String.valueOf(valueOf).length());
            sb.append("spec must be ");
            sb.append(str2);
            sb.append("null for ");
            sb.append(valueOf);
            sdo.m34971a(z2, (Object) sb.toString());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public static FontFetchResult m23827a(Status status) {
        sdo.m34966a(status, "failureStatus");
        boolean c = status.mo17710c();
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("Failure status cannot be successful: ");
        sb.append(valueOf);
        sdo.m34971a(!c, (Object) sb.toString());
        return new FontFetchResult(2, status, null, null, null);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32459b;
    }

    public final String toString() {
        return String.format("{%s, %s, %s}", this.f32459b, this.f32460c, this.f32461d);
    }

    /* renamed from: a */
    public static FontFetchResult m23828a(FontMatchSpec fontMatchSpec, File file) {
        sdo.m34966a(fontMatchSpec, "spec");
        sdo.m34966a(file, "file");
        if (!file.exists()) {
            return m23827a(f32456f);
        }
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
            int i = Build.VERSION.SDK_INT;
            return new FontFetchResult(2, Status.f30107a, null, open, fontMatchSpec);
        } catch (FileNotFoundException e) {
            return m23827a(f32457g);
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f32458a);
        see.m35040a(parcel, 2, this.f32459b, i, false);
        see.m35046a(parcel, 3, this.f32460c, false);
        see.m35040a(parcel, 4, this.f32461d, i, false);
        see.m35040a(parcel, 5, this.f32462e, i, false);
        see.m35062b(parcel, a);
    }
}
