package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserAttributeParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agmq();

    /* renamed from: a */
    public final int f80138a;

    /* renamed from: b */
    public final String f80139b;

    /* renamed from: c */
    public final long f80140c;

    /* renamed from: d */
    public final Long f80141d;

    /* renamed from: e */
    public final String f80142e;

    /* renamed from: f */
    public final String f80143f;

    /* renamed from: g */
    public final Double f80144g;

    public UserAttributeParcel(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f80138a = i;
        this.f80139b = str;
        this.f80140c = j;
        this.f80141d = l;
        if (i == 1) {
            this.f80144g = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f80144g = d;
        }
        this.f80142e = str2;
        this.f80143f = str3;
    }

    /* renamed from: a */
    public final Object mo44016a() {
        Long l = this.f80141d;
        if (l != null) {
            return l;
        }
        Double d = this.f80144g;
        if (d != null) {
            return d;
        }
        String str = this.f80142e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        agmq.m54587a(this, parcel);
    }

    public UserAttributeParcel(agmr agmr) {
        this(agmr.f65973c, agmr.f65974d, agmr.f65975e, agmr.f65972b);
    }

    public UserAttributeParcel(String str, long j, Object obj, String str2) {
        sdo.m34977c(str);
        this.f80138a = 2;
        this.f80139b = str;
        this.f80140c = j;
        this.f80143f = str2;
        if (obj == null) {
            this.f80141d = null;
            this.f80144g = null;
            this.f80142e = null;
        } else if (obj instanceof Long) {
            this.f80141d = (Long) obj;
            this.f80144g = null;
            this.f80142e = null;
        } else if (obj instanceof String) {
            this.f80141d = null;
            this.f80144g = null;
            this.f80142e = (String) obj;
        } else if (obj instanceof Double) {
            this.f80141d = null;
            this.f80144g = (Double) obj;
            this.f80142e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
