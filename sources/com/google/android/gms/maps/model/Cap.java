package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afgz();

    /* renamed from: a */
    public final int f79870a;

    /* renamed from: b */
    public final Float f79871b;

    /* renamed from: c */
    private final afgv f79872c;

    static {
        Cap.class.getSimpleName();
    }

    public Cap(int i, afgv afgv, Float f) {
        boolean z;
        boolean z2;
        if (f == null || f.floatValue() <= 0.0f) {
            z = false;
        } else {
            z = true;
        }
        if (i != 3) {
            z2 = true;
        } else {
            z2 = afgv != null && z;
        }
        sdo.m34975b(z2, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), afgv, f));
        this.f79870a = i;
        this.f79872c = afgv;
        this.f79871b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cap) {
            Cap cap = (Cap) obj;
            return this.f79870a == cap.f79870a && sdg.m34949a(this.f79872c, cap.f79872c) && sdg.m34949a(this.f79871b, cap.f79871b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79870a), this.f79872c, this.f79871b});
    }

    public String toString() {
        int i = this.f79870a;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f79870a);
        afgv afgv = this.f79872c;
        if (afgv != null) {
            iBinder = afgv.f64237a.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 3, iBinder);
        see.m35043a(parcel, 4, this.f79871b);
        see.m35062b(parcel, a);
    }
}
