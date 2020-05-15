package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceDataUploadOptedInAccountsParcelable extends AbstractSafeParcelable implements avab {
    public static final Parcelable.Creator CREATOR = new auzp();

    /* renamed from: a */
    public final List f109342a;

    /* renamed from: b */
    public final List f109343b;

    public DeviceDataUploadOptedInAccountsParcelable(List list, List list2) {
        this.f109342a = list;
        this.f109343b = list2;
    }

    /* renamed from: a */
    public final List mo51103a() {
        return this.f109342a;
    }

    /* renamed from: b */
    public final List mo51104b() {
        return this.f109343b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceDataUploadOptedInAccountsParcelable) {
            DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable = (DeviceDataUploadOptedInAccountsParcelable) obj;
            if (!sdg.m34949a(this.f109342a, deviceDataUploadOptedInAccountsParcelable.f109342a) || !sdg.m34949a(this.f109343b, deviceDataUploadOptedInAccountsParcelable.f109343b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f109342a, this.f109343b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35065b(parcel, 2, this.f109342a, false);
        see.m35065b(parcel, 3, this.f109343b, false);
        see.m35062b(parcel, a);
    }
}
