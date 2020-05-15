package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EmailEntity extends AbstractSafeParcelable implements Email {
    public static final Parcelable.Creator CREATOR = new amos();

    /* renamed from: a */
    public final PersonFieldMetadataEntity f82008a;

    /* renamed from: b */
    public final String f82009b;

    public EmailEntity(PersonFieldMetadata personFieldMetadata, String str, boolean z) {
        this.f82009b = str;
        if (z) {
            this.f82008a = (PersonFieldMetadataEntity) personFieldMetadata;
        } else {
            this.f82008a = personFieldMetadata != null ? new PersonFieldMetadataEntity(personFieldMetadata) : null;
        }
    }

    /* renamed from: a */
    public final PersonFieldMetadata mo46420a() {
        return this.f82008a;
    }

    /* renamed from: b */
    public final String mo46421b() {
        return this.f82009b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Email)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Email email = (Email) obj;
        return sdg.m34949a(mo46420a(), email.mo46420a()) && sdg.m34949a(mo46421b(), email.mo46421b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo46420a(), mo46421b()});
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
        see.m35040a(parcel, 2, this.f82008a, i, false);
        see.m35046a(parcel, 3, this.f82009b, false);
        see.m35062b(parcel, a);
    }

    public EmailEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str) {
        this.f82008a = personFieldMetadataEntity;
        this.f82009b = str;
    }
}
