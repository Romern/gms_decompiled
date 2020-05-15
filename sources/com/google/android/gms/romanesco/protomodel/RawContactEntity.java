package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RawContactEntity extends AbstractSafeParcelable implements RawContact {
    public static final Parcelable.Creator CREATOR = new apcd();

    /* renamed from: a */
    public final String f107241a;

    /* renamed from: b */
    private final List f107242b;

    /* renamed from: c */
    private final List f107243c;

    /* renamed from: d */
    private List f107244d;

    /* renamed from: e */
    private List f107245e;

    public RawContactEntity(String str, List list, List list2) {
        this.f107241a = str;
        this.f107242b = list;
        this.f107243c = list2;
    }

    /* renamed from: a */
    public final String mo58822a() {
        return this.f107241a;
    }

    /* renamed from: b */
    public final List mo58823b() {
        List list;
        if (this.f107244d == null && (list = this.f107242b) != null) {
            this.f107244d = new ArrayList(list.size());
            List list2 = this.f107242b;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.f107244d.add((EmailAddress) list2.get(i));
            }
        }
        return this.f107244d;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final List mo58824c() {
        List list;
        if (this.f107245e == null && (list = this.f107243c) != null) {
            this.f107245e = new ArrayList(list.size());
            List list2 = this.f107243c;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.f107245e.add((PhoneNumber) list2.get(i));
            }
        }
        return this.f107245e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RawContact)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        RawContact rawContact = (RawContact) obj;
        return sdg.m34949a(mo58822a(), rawContact.mo58822a()) && sdg.m34949a(mo58823b(), rawContact.mo58823b()) && sdg.m34949a(mo58824c(), rawContact.mo58824c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo58822a(), mo58823b(), mo58824c()});
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
        see.m35046a(parcel, 2, this.f107241a, false);
        see.m35066c(parcel, 4, mo58823b(), false);
        see.m35066c(parcel, 5, mo58824c(), false);
        see.m35062b(parcel, a);
    }
}
