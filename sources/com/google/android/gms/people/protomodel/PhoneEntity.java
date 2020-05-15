package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhoneEntity extends AbstractSafeParcelable implements Phone {
    public static final Parcelable.Creator CREATOR = new ampc();

    /* renamed from: a */
    public final PersonFieldMetadataEntity f82032a;

    /* renamed from: b */
    public final String f82033b;

    /* renamed from: c */
    public final String f82034c;

    public PhoneEntity(PersonFieldMetadata personFieldMetadata, String str, String str2, boolean z) {
        this.f82033b = str;
        this.f82034c = str2;
        if (z) {
            this.f82032a = (PersonFieldMetadataEntity) personFieldMetadata;
        } else {
            this.f82032a = personFieldMetadata != null ? new PersonFieldMetadataEntity(personFieldMetadata) : null;
        }
    }

    /* renamed from: a */
    public final PersonFieldMetadata mo46453a() {
        return this.f82032a;
    }

    /* renamed from: b */
    public final String mo46454b() {
        return this.f82033b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo46455c() {
        return this.f82034c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Phone)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Phone phone = (Phone) obj;
        return sdg.m34949a(mo46453a(), phone.mo46453a()) && sdg.m34949a(mo46454b(), phone.mo46454b()) && sdg.m34949a(mo46455c(), phone.mo46455c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo46453a(), mo46454b(), mo46455c()});
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
        see.m35040a(parcel, 2, this.f82032a, i, false);
        see.m35046a(parcel, 3, this.f82033b, false);
        see.m35046a(parcel, 4, this.f82034c, false);
        see.m35062b(parcel, a);
    }

    public PhoneEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2) {
        this.f82032a = personFieldMetadataEntity;
        this.f82033b = str;
        this.f82034c = str2;
    }
}
