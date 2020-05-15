package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PersonFieldMetadataEntity extends AbstractSafeParcelable implements PersonFieldMetadata {
    public static final Parcelable.Creator CREATOR = new ampa();

    /* renamed from: a */
    public final Integer f82030a;

    /* renamed from: b */
    public final Boolean f82031b;

    public PersonFieldMetadataEntity(PersonFieldMetadata personFieldMetadata) {
        this(personFieldMetadata.mo46448a(), personFieldMetadata.mo46449b());
    }

    /* renamed from: a */
    public final Integer mo46448a() {
        return this.f82030a;
    }

    /* renamed from: b */
    public final Boolean mo46449b() {
        return this.f82031b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PersonFieldMetadata)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PersonFieldMetadata personFieldMetadata = (PersonFieldMetadata) obj;
        return sdg.m34949a(mo46448a(), personFieldMetadata.mo46448a()) && sdg.m34949a(mo46449b(), personFieldMetadata.mo46449b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo46448a(), mo46449b()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35044a(parcel, 3, this.f82030a);
        see.m35041a(parcel, 4, this.f82031b);
        see.m35062b(parcel, a);
    }

    public PersonFieldMetadataEntity(Integer num, Boolean bool) {
        this.f82030a = num;
        this.f82031b = bool;
    }
}
