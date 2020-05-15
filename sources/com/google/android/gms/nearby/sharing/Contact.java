package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Contact extends AbstractSafeParcelable implements Cloneable, Comparable {
    public static final Parcelable.Creator CREATOR = new ajij();

    /* renamed from: a */
    public final long f80844a;

    /* renamed from: b */
    public final String f80845b;

    /* renamed from: c */
    public final String f80846c;

    /* renamed from: d */
    public final Uri f80847d;

    /* renamed from: e */
    public final boolean f80848e;

    /* renamed from: f */
    public final ContactInfo f80849f;

    /* renamed from: g */
    public final boolean f80850g;

    /* renamed from: h */
    public final boolean f80851h;

    public Contact(long j, String str, String str2, Uri uri, boolean z, ContactInfo contactInfo, boolean z2, boolean z3) {
        this.f80844a = j;
        this.f80845b = str;
        this.f80846c = str2;
        this.f80847d = uri;
        this.f80848e = z;
        this.f80849f = contactInfo;
        this.f80850g = z2;
        this.f80851h = z3;
    }

    /* renamed from: a */
    public final Contact clone() {
        try {
            return (Contact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Contact contact = (Contact) obj;
        int compareToIgnoreCase = this.f80846c.compareToIgnoreCase(contact.f80846c);
        return compareToIgnoreCase == 0 ? this.f80849f.f80856a - contact.f80849f.f80856a : compareToIgnoreCase;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Contact) {
            Contact contact = (Contact) obj;
            return sdg.m34949a(Long.valueOf(this.f80844a), Long.valueOf(contact.f80844a)) && sdg.m34949a(this.f80845b, contact.f80845b) && sdg.m34949a(this.f80846c, contact.f80846c) && sdg.m34949a(this.f80847d, contact.f80847d) && sdg.m34949a(this.f80849f, contact.f80849f) && sdg.m34949a(Boolean.valueOf(this.f80850g), Boolean.valueOf(contact.f80850g)) && sdg.m34949a(Boolean.valueOf(this.f80851h), Boolean.valueOf(contact.f80851h));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f80844a), this.f80845b, this.f80846c, this.f80847d, this.f80849f, Boolean.valueOf(this.f80850g), Boolean.valueOf(this.f80851h)});
    }

    public final String toString() {
        return String.format(Locale.US, "Contact<id: %d, lookupKey: %s, displayName: %s, imageUri: %s, isSelected: %s, contactInfo: %s, isReachable: %s, isRecommended: %s>", Long.valueOf(this.f80844a), this.f80845b, this.f80846c, this.f80847d, Boolean.valueOf(this.f80848e), this.f80849f, Boolean.valueOf(this.f80850g), Boolean.valueOf(this.f80851h));
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
        see.m35036a(parcel, 1, this.f80844a);
        see.m35046a(parcel, 2, this.f80845b, false);
        see.m35046a(parcel, 3, this.f80846c, false);
        see.m35040a(parcel, 4, this.f80847d, i, false);
        see.m35051a(parcel, 5, this.f80848e);
        see.m35040a(parcel, 6, this.f80849f, i, false);
        see.m35051a(parcel, 7, this.f80850g);
        see.m35051a(parcel, 8, this.f80851h);
        see.m35062b(parcel, a);
    }
}
