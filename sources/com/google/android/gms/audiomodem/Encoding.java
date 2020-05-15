package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Encoding extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gdr();

    /* renamed from: a */
    public final int f9882a;

    /* renamed from: b */
    public final DsssEncoding f9883b;

    /* renamed from: c */
    public final DtmfEncoding f9884c;

    public Encoding(int i, DsssEncoding dsssEncoding, DtmfEncoding dtmfEncoding) {
        this.f9882a = i;
        this.f9883b = dsssEncoding;
        this.f9884c = dtmfEncoding;
    }

    /* renamed from: a */
    public static boolean m6246a(int i) {
        return i == 1 || i == 3;
    }

    /* renamed from: b */
    public static int m6247b(int i) {
        return (i == 2 || i == 3) ? 2 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Encoding)) {
            return false;
        }
        Encoding encoding = (Encoding) obj;
        int i = this.f9882a;
        if (i != encoding.f9882a) {
            return false;
        }
        if ((i != 0 || sdg.m34949a(this.f9883b, encoding.f9883b)) && (this.f9882a != 1 || sdg.m34949a(this.f9884c, encoding.f9884c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = Arrays.hashCode(new Object[]{Integer.valueOf(this.f9882a)}) + (this.f9882a == 0 ? this.f9883b.hashCode() : 0);
        if (this.f9882a == 1) {
            i = this.f9884c.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f9882a);
        see.m35040a(parcel, 3, this.f9883b, i, false);
        see.m35040a(parcel, 4, this.f9884c, i, false);
        see.m35062b(parcel, a);
    }
}
