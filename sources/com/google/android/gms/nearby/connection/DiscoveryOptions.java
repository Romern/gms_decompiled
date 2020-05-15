package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahil();

    /* renamed from: a */
    public Strategy f80467a;

    /* renamed from: b */
    public boolean f80468b;

    /* renamed from: c */
    public boolean f80469c;

    /* renamed from: d */
    public boolean f80470d;

    /* renamed from: e */
    public boolean f80471e;

    /* renamed from: f */
    public ParcelUuid f80472f;

    /* renamed from: g */
    public boolean f80473g;

    /* renamed from: h */
    public boolean f80474h;

    /* renamed from: i */
    public boolean f80475i;

    public DiscoveryOptions() {
        this.f80468b = false;
        this.f80469c = true;
        this.f80470d = true;
        this.f80471e = false;
        this.f80473g = true;
        this.f80474h = true;
        this.f80475i = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscoveryOptions) {
            DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
            return sdg.m34949a(this.f80467a, discoveryOptions.f80467a) && sdg.m34949a(Boolean.valueOf(this.f80468b), Boolean.valueOf(discoveryOptions.f80468b)) && sdg.m34949a(Boolean.valueOf(this.f80469c), Boolean.valueOf(discoveryOptions.f80469c)) && sdg.m34949a(Boolean.valueOf(this.f80470d), Boolean.valueOf(discoveryOptions.f80470d)) && sdg.m34949a(Boolean.valueOf(this.f80471e), Boolean.valueOf(discoveryOptions.f80471e)) && sdg.m34949a(this.f80472f, discoveryOptions.f80472f) && sdg.m34949a(Boolean.valueOf(this.f80473g), Boolean.valueOf(discoveryOptions.f80473g)) && sdg.m34949a(Boolean.valueOf(this.f80474h), Boolean.valueOf(discoveryOptions.f80474h)) && sdg.m34949a(Boolean.valueOf(this.f80475i), Boolean.valueOf(discoveryOptions.f80475i));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80467a, Boolean.valueOf(this.f80468b), Boolean.valueOf(this.f80469c), Boolean.valueOf(this.f80470d), Boolean.valueOf(this.f80471e), this.f80472f, Boolean.valueOf(this.f80473g), Boolean.valueOf(this.f80474h), Boolean.valueOf(this.f80475i)});
    }

    public DiscoveryOptions(Strategy strategy, boolean z, boolean z2, boolean z3, boolean z4, ParcelUuid parcelUuid, boolean z5, boolean z6, boolean z7) {
        this.f80467a = strategy;
        this.f80468b = z;
        this.f80469c = z2;
        this.f80470d = z3;
        this.f80471e = z4;
        this.f80472f = parcelUuid;
        this.f80473g = z5;
        this.f80474h = z6;
        this.f80475i = z7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f80467a, i, false);
        see.m35051a(parcel, 2, this.f80468b);
        see.m35051a(parcel, 3, this.f80469c);
        see.m35051a(parcel, 4, this.f80470d);
        see.m35051a(parcel, 5, this.f80471e);
        see.m35040a(parcel, 6, this.f80472f, i, false);
        see.m35051a(parcel, 8, this.f80473g);
        see.m35051a(parcel, 9, this.f80474h);
        see.m35051a(parcel, 10, this.f80475i);
        see.m35062b(parcel, a);
    }
}
