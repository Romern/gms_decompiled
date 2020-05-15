package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableGeofence extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aekp();

    /* renamed from: a */
    public final String f79438a;

    /* renamed from: b */
    public final long f79439b;

    /* renamed from: c */
    public final short f79440c;

    /* renamed from: d */
    public final double f79441d;

    /* renamed from: e */
    public final double f79442e;

    /* renamed from: f */
    public final float f79443f;

    /* renamed from: g */
    public final int f79444g;

    /* renamed from: h */
    public final int f79445h;

    /* renamed from: i */
    public final int f79446i;

    public ParcelableGeofence(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("requestId is null or too long: ") : "requestId is null or too long: ".concat(valueOf));
        } else if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f79440c = s;
                this.f79438a = str;
                this.f79441d = d;
                this.f79442e = d2;
                this.f79443f = f;
                this.f79439b = j;
                this.f79444g = i4;
                this.f79445h = i2;
                this.f79446i = i3;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ParcelableGeofence)) {
            ParcelableGeofence parcelableGeofence = (ParcelableGeofence) obj;
            return this.f79443f == parcelableGeofence.f79443f && this.f79441d == parcelableGeofence.f79441d && this.f79442e == parcelableGeofence.f79442e && this.f79440c == parcelableGeofence.f79440c;
        }
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f79441d);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f79442e);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f79443f)) * 31) + this.f79440c) * 31) + this.f79444g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.f79440c != 1 ? null : "CIRCLE";
        objArr[1] = this.f79438a.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f79444g);
        objArr[3] = Double.valueOf(this.f79441d);
        objArr[4] = Double.valueOf(this.f79442e);
        objArr[5] = Float.valueOf(this.f79443f);
        objArr[6] = Integer.valueOf(this.f79445h / 1000);
        objArr[7] = Integer.valueOf(this.f79446i);
        objArr[8] = Long.valueOf(this.f79439b);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aekp.m52067a(this, parcel);
    }
}
