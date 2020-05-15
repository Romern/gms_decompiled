package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhotoEntity extends AbstractSafeParcelable implements Photo {
    public static final Parcelable.Creator CREATOR = new ampe();

    /* renamed from: a */
    public final PersonFieldMetadataEntity f82035a;

    /* renamed from: b */
    public final String f82036b;

    public PhotoEntity(PersonFieldMetadata personFieldMetadata, String str, boolean z) {
        this.f82036b = str;
        if (z) {
            this.f82035a = (PersonFieldMetadataEntity) personFieldMetadata;
        } else {
            this.f82035a = personFieldMetadata != null ? new PersonFieldMetadataEntity(personFieldMetadata) : null;
        }
    }

    /* renamed from: a */
    public final PersonFieldMetadata mo46459a() {
        return this.f82035a;
    }

    /* renamed from: b */
    public final String mo46460b() {
        return this.f82036b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Photo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Photo photo = (Photo) obj;
        return sdg.m34949a(mo46459a(), photo.mo46459a()) && sdg.m34949a(mo46460b(), photo.mo46460b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo46459a(), mo46460b()});
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
        see.m35040a(parcel, 2, this.f82035a, i, false);
        see.m35046a(parcel, 3, this.f82036b, false);
        see.m35062b(parcel, a);
    }

    public PhotoEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str) {
        this.f82035a = personFieldMetadataEntity;
        this.f82036b = str;
    }
}
