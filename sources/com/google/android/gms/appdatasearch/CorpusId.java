package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CorpusId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fqs();

    /* renamed from: a */
    public final String f9517a;

    /* renamed from: b */
    public final String f9518b;

    /* renamed from: c */
    final Bundle f9519c;

    public CorpusId(String str, String str2) {
        this(str, str2, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusId) {
            CorpusId corpusId = (CorpusId) obj;
            return sdg.m34949a(this.f9517a, corpusId.f9517a) && sdg.m34949a(this.f9518b, corpusId.f9518b) && sdg.m34949a(this.f9519c, corpusId.f9519c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9517a, this.f9518b, this.f9519c});
    }

    public final String toString() {
        String str = this.f9517a;
        String str2 = this.f9518b;
        Bundle bundle = this.f9519c;
        String bundle2 = bundle != null ? bundle.toString() : "null";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length() + String.valueOf(bundle2).length());
        sb.append("CorpusId[package=");
        sb.append(str);
        sb.append(", corpus=");
        sb.append(str2);
        sb.append("userHandle=");
        sb.append(bundle2);
        sb.append("]");
        return sb.toString();
    }

    public CorpusId(String str, String str2, Bundle bundle) {
        this.f9517a = str;
        this.f9518b = str2;
        this.f9519c = bundle;
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
        see.m35046a(parcel, 1, this.f9517a, false);
        see.m35046a(parcel, 2, this.f9518b, false);
        see.m35037a(parcel, 3, this.f9519c, false);
        see.m35062b(parcel, a);
    }
}
