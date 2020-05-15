package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BirthdayEntity extends AbstractSafeParcelable implements Birthday {
    public static final Parcelable.Creator CREATOR = new amop();

    /* renamed from: a */
    public final PersonFieldMetadataEntity f82005a;

    /* renamed from: b */
    public final Long f82006b;

    public BirthdayEntity(PersonFieldMetadata personFieldMetadata, Long l, boolean z) {
        this.f82006b = l;
        if (z) {
            this.f82005a = (PersonFieldMetadataEntity) personFieldMetadata;
        } else {
            this.f82005a = personFieldMetadata != null ? new PersonFieldMetadataEntity(personFieldMetadata) : null;
        }
    }

    /* renamed from: a */
    public final PersonFieldMetadata mo46411a() {
        return this.f82005a;
    }

    /* renamed from: b */
    public final Long mo46412b() {
        return this.f82006b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Birthday)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Birthday birthday = (Birthday) obj;
        return sdg.m34949a(mo46411a(), birthday.mo46411a()) && sdg.m34949a(mo46412b(), birthday.mo46412b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo46411a(), mo46412b()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f82005a, i, false);
        see.m35045a(parcel, 3, this.f82006b);
        see.m35062b(parcel, a);
    }

    public BirthdayEntity(PersonFieldMetadataEntity personFieldMetadataEntity, Long l) {
        this.f82005a = personFieldMetadataEntity;
        this.f82006b = l;
    }
}
