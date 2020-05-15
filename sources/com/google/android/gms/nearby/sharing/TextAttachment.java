package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TextAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new ajua();

    /* renamed from: a */
    public final String f81048a;

    /* renamed from: b */
    public final int f81049b;

    /* renamed from: c */
    public final long f81050c;

    /* renamed from: d */
    public final Bundle f81051d;

    public TextAttachment(String str, int i, long j, Bundle bundle) {
        this.f81048a = str;
        this.f81049b = i;
        this.f81050c = j;
        this.f81051d = bundle;
    }

    /* renamed from: a */
    public final long mo44383a() {
        return this.f81050c;
    }

    /* renamed from: b */
    public final int mo44384b() {
        return this.f81049b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextAttachment) {
            TextAttachment textAttachment = (TextAttachment) obj;
            return sdg.m34949a(this.f81048a, textAttachment.f81048a) && sdg.m34949a(Integer.valueOf(this.f81049b), Integer.valueOf(textAttachment.f81049b)) && sdg.m34949a(Long.valueOf(this.f81050c), Long.valueOf(textAttachment.f81050c));
        }
    }

    /* renamed from: f */
    public final int mo44388f() {
        return 3;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81048a, Integer.valueOf(this.f81049b), Long.valueOf(this.f81050c)});
    }

    public final String toString() {
        return String.format(Locale.US, "TextAttachment<textBody: %s, type: %s, size: %s>", this.f81048a, Integer.valueOf(this.f81049b), Long.valueOf(this.f81050c));
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
        see.m35046a(parcel, 1, this.f81048a, false);
        see.m35063b(parcel, 2, this.f81049b);
        see.m35036a(parcel, 3, this.f81050c);
        see.m35037a(parcel, 4, this.f81051d, false);
        see.m35062b(parcel, a);
    }
}
