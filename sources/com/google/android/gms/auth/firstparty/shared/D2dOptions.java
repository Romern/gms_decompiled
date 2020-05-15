package com.google.android.gms.auth.firstparty.shared;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class D2dOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new izb();

    /* renamed from: a */
    public final boolean f10855a;

    /* renamed from: b */
    public final boolean f10856b;

    public D2dOptions() {
        this(false, false);
    }

    /* renamed from: a */
    public static D2dOptions m6591a(Bundle bundle) {
        if (bundle != null) {
            return m6592a(bundle.getByteArray("d2d_options"));
        }
        return new D2dOptions();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D2dOptions) {
            D2dOptions d2dOptions = (D2dOptions) obj;
            if (this.f10855a == d2dOptions.f10855a && this.f10856b == d2dOptions.f10856b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10855a), Boolean.valueOf(this.f10856b)});
    }

    public D2dOptions(boolean z, boolean z2) {
        this.f10855a = z;
        this.f10856b = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f10855a);
        see.m35051a(parcel, 2, this.f10856b);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public static D2dOptions m6592a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new D2dOptions();
        }
        return (D2dOptions) sef.m35069a(bArr, CREATOR);
    }
}
