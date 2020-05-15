package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NameEntity extends AbstractSafeParcelable implements Name {
    public static final Parcelable.Creator CREATOR = new amow();

    /* renamed from: a */
    public final PersonFieldMetadataEntity f82012a;

    /* renamed from: b */
    public final String f82013b;

    /* renamed from: c */
    public final String f82014c;

    /* renamed from: d */
    public final String f82015d;

    /* renamed from: e */
    public final String f82016e;

    /* renamed from: f */
    public final String f82017f;

    /* renamed from: g */
    public final String f82018g;

    public NameEntity(PersonFieldMetadata personFieldMetadata, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.f82013b = str;
        this.f82014c = str2;
        this.f82015d = str3;
        this.f82016e = str4;
        this.f82017f = str5;
        this.f82018g = str6;
        if (z) {
            this.f82012a = (PersonFieldMetadataEntity) personFieldMetadata;
        } else {
            this.f82012a = personFieldMetadata != null ? new PersonFieldMetadataEntity(personFieldMetadata) : null;
        }
    }

    /* renamed from: a */
    public final PersonFieldMetadata mo46429a() {
        return this.f82012a;
    }

    /* renamed from: b */
    public final String mo46430b() {
        return this.f82013b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo46431c() {
        return this.f82014c;
    }

    /* renamed from: d */
    public final String mo46432d() {
        return this.f82015d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Name)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Name name = (Name) obj;
        return sdg.m34949a(mo46429a(), name.mo46429a()) && sdg.m34949a(mo46430b(), name.mo46430b()) && sdg.m34949a(mo46431c(), name.mo46431c()) && sdg.m34949a(mo46432d(), name.mo46432d()) && sdg.m34949a(mo46433f(), name.mo46433f()) && sdg.m34949a(mo46434g(), name.mo46434g()) && sdg.m34949a(mo46435h(), name.mo46435h());
    }

    /* renamed from: f */
    public final String mo46433f() {
        return this.f82016e;
    }

    /* renamed from: g */
    public final String mo46434g() {
        return this.f82017f;
    }

    /* renamed from: h */
    public final String mo46435h() {
        return this.f82018g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo46429a(), mo46430b(), mo46431c(), mo46432d(), mo46433f(), mo46434g(), mo46435h()});
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
        see.m35040a(parcel, 2, this.f82012a, i, false);
        see.m35046a(parcel, 3, this.f82013b, false);
        see.m35046a(parcel, 4, this.f82018g, false);
        see.m35046a(parcel, 5, this.f82015d, false);
        see.m35046a(parcel, 6, this.f82016e, false);
        see.m35046a(parcel, 7, this.f82017f, false);
        see.m35046a(parcel, 17, this.f82014c, false);
        see.m35062b(parcel, a);
    }

    public NameEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f82012a = personFieldMetadataEntity;
        this.f82013b = str;
        this.f82014c = str2;
        this.f82015d = str3;
        this.f82016e = str4;
        this.f82017f = str5;
        this.f82018g = str6;
    }
}
