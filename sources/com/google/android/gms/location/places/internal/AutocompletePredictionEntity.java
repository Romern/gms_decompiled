package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutocompletePredictionEntity extends AbstractSafeParcelable implements aekw {
    public static final Parcelable.Creator CREATOR = new aemq();

    /* renamed from: a */
    public final String f79516a;

    /* renamed from: b */
    public final String f79517b;

    /* renamed from: c */
    public final List f79518c;

    /* renamed from: d */
    public final List f79519d;

    /* renamed from: e */
    public final int f79520e;

    /* renamed from: f */
    public final String f79521f;

    /* renamed from: g */
    public final List f79522g;

    /* renamed from: h */
    public final String f79523h;

    /* renamed from: i */
    public final List f79524i;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SubstringEntity extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new aeom();

        /* renamed from: a */
        public final int f79525a;

        /* renamed from: b */
        public final int f79526b;

        public SubstringEntity(int i, int i2) {
            this.f79525a = i;
            this.f79526b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SubstringEntity) {
                SubstringEntity substringEntity = (SubstringEntity) obj;
                return sdg.m34949a(Integer.valueOf(this.f79525a), Integer.valueOf(substringEntity.f79525a)) && sdg.m34949a(Integer.valueOf(this.f79526b), Integer.valueOf(substringEntity.f79526b));
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79525a), Integer.valueOf(this.f79526b)});
        }

        public final String toString() {
            sdf a = sdg.m34948a(this);
            a.mo25396a("offset", Integer.valueOf(this.f79525a));
            a.mo25396a("length", Integer.valueOf(this.f79526b));
            return a.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 1, this.f79525a);
            see.m35063b(parcel, 2, this.f79526b);
            see.m35062b(parcel, a);
        }
    }

    static {
        Collections.emptyList();
    }

    public AutocompletePredictionEntity(String str, List list, int i, String str2, List list2, String str3, List list3, String str4, List list4) {
        this.f79517b = str;
        this.f79518c = list;
        this.f79520e = i;
        this.f79516a = str2;
        this.f79519d = list2;
        this.f79521f = str3;
        this.f79522g = list3;
        this.f79523h = str4;
        this.f79524i = list4;
    }

    /* renamed from: a */
    public static AutocompletePredictionEntity m66922a(String str, List list, int i, String str2, List list2, String str3, List list3, String str4, List list4) {
        sdo.m34959a((Object) str2);
        return new AutocompletePredictionEntity(str, list, i, str2, list2, str3, list3, str4, list4);
    }

    /* renamed from: a */
    public final String mo34279a() {
        return this.f79516a;
    }

    /* renamed from: b */
    public final List mo34280b() {
        return this.f79519d;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final int mo34281c() {
        return this.f79520e;
    }

    /* renamed from: d */
    public final String mo34282d() {
        return this.f79517b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutocompletePredictionEntity) {
            AutocompletePredictionEntity autocompletePredictionEntity = (AutocompletePredictionEntity) obj;
            return sdg.m34949a(this.f79517b, autocompletePredictionEntity.f79517b) && sdg.m34949a(this.f79518c, autocompletePredictionEntity.f79518c) && sdg.m34949a(Integer.valueOf(this.f79520e), Integer.valueOf(autocompletePredictionEntity.f79520e)) && sdg.m34949a(this.f79516a, autocompletePredictionEntity.f79516a) && sdg.m34949a(this.f79519d, autocompletePredictionEntity.f79519d) && sdg.m34949a(this.f79521f, autocompletePredictionEntity.f79521f) && sdg.m34949a(this.f79522g, autocompletePredictionEntity.f79522g) && sdg.m34949a(this.f79523h, autocompletePredictionEntity.f79523h) && sdg.m34949a(this.f79524i, autocompletePredictionEntity.f79524i);
        }
    }

    /* renamed from: f */
    public final CharSequence mo34283f() {
        return aemu.m52173a(this.f79516a, this.f79519d, null);
    }

    /* renamed from: g */
    public final CharSequence mo34284g() {
        return aemu.m52173a(this.f79523h, this.f79524i, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79517b, this.f79518c, Integer.valueOf(this.f79520e), this.f79516a, this.f79519d, this.f79521f, this.f79522g, this.f79523h, this.f79524i});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("placeId", this.f79517b);
        a.mo25396a("placeTypes", this.f79518c);
        a.mo25396a("fullText", this.f79516a);
        a.mo25396a("fullTextMatchedSubstrings", this.f79519d);
        a.mo25396a("primaryText", this.f79521f);
        a.mo25396a("primaryTextMatchedSubstrings", this.f79522g);
        a.mo25396a("secondaryText", this.f79523h);
        a.mo25396a("secondaryTextMatchedSubstrings", this.f79524i);
        return a.toString();
    }

    /* renamed from: a */
    public final CharSequence mo34278a(CharacterStyle characterStyle) {
        return aemu.m52173a(this.f79521f, this.f79522g, characterStyle);
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
     method: see.a(android.os.Parcel, int, java.util.List, boolean):void
     arg types: [android.os.Parcel, int, java.util.List, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f79516a, false);
        see.m35046a(parcel, 2, this.f79517b, false);
        see.m35049a(parcel, 3, this.f79518c, false);
        see.m35066c(parcel, 4, this.f79519d, false);
        see.m35063b(parcel, 5, this.f79520e);
        see.m35046a(parcel, 6, this.f79521f, false);
        see.m35066c(parcel, 7, this.f79522g, false);
        see.m35046a(parcel, 8, this.f79523h, false);
        see.m35066c(parcel, 9, this.f79524i, false);
        see.m35062b(parcel, a);
    }
}
