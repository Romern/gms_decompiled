package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ApplicationMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new peh();

    /* renamed from: a */
    public String f29706a;

    /* renamed from: b */
    public String f29707b;

    /* renamed from: c */
    public List f29708c;

    /* renamed from: d */
    public String f29709d;

    /* renamed from: e */
    public Uri f29710e;

    /* renamed from: f */
    public String f29711f;

    /* renamed from: g */
    public String f29712g;

    public ApplicationMetadata() {
        this.f29708c = new ArrayList();
    }

    /* renamed from: a */
    public final boolean mo17489a(String str) {
        List list = this.f29708c;
        return list != null && list.contains(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ApplicationMetadata) {
            ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
            return ptk.m31236a(this.f29706a, applicationMetadata.f29706a) && ptk.m31236a(this.f29707b, applicationMetadata.f29707b) && ptk.m31236a(this.f29708c, applicationMetadata.f29708c) && ptk.m31236a(this.f29709d, applicationMetadata.f29709d) && ptk.m31236a(this.f29710e, applicationMetadata.f29710e) && ptk.m31236a(this.f29711f, applicationMetadata.f29711f) && ptk.m31236a(this.f29712g, applicationMetadata.f29712g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29706a, this.f29707b, this.f29708c, this.f29709d, this.f29710e, this.f29711f});
    }

    public final String toString() {
        String str = this.f29706a;
        String str2 = this.f29707b;
        List list = this.f29708c;
        int size = list != null ? list.size() : 0;
        String str3 = this.f29709d;
        String valueOf = String.valueOf(this.f29710e);
        String str4 = this.f29711f;
        String str5 = this.f29712g;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 118 + length2 + length3 + String.valueOf(valueOf).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("applicationId: ");
        sb.append(str);
        sb.append(", name: ");
        sb.append(str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        sb.append(", senderAppLaunchUrl: ");
        sb.append(valueOf);
        sb.append(", iconUrl: ");
        sb.append(str4);
        sb.append(", type: ");
        sb.append(str5);
        return sb.toString();
    }

    public ApplicationMetadata(String str, String str2, List list, String str3, Uri uri, String str4, String str5) {
        this.f29706a = str;
        this.f29707b = str2;
        this.f29708c = list;
        this.f29709d = str3;
        this.f29710e = uri;
        this.f29711f = str4;
        this.f29712g = str5;
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
        see.m35046a(parcel, 2, this.f29706a, false);
        see.m35046a(parcel, 3, this.f29707b, false);
        see.m35066c(parcel, 4, null, false);
        see.m35065b(parcel, 5, Collections.unmodifiableList(this.f29708c), false);
        see.m35046a(parcel, 6, this.f29709d, false);
        see.m35040a(parcel, 7, this.f29710e, i, false);
        see.m35046a(parcel, 8, this.f29711f, false);
        see.m35046a(parcel, 9, this.f29712g, false);
        see.m35062b(parcel, a);
    }
}
