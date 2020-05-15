package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.Contact;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MarkContactAsSelectedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajzf();

    /* renamed from: a */
    public Contact f81087a;

    /* renamed from: b */
    public rnt f81088b;

    public MarkContactAsSelectedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MarkContactAsSelectedParams) {
            MarkContactAsSelectedParams markContactAsSelectedParams = (MarkContactAsSelectedParams) obj;
            return sdg.m34949a(this.f81087a, markContactAsSelectedParams.f81087a) && sdg.m34949a(this.f81088b, markContactAsSelectedParams.f81088b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81087a, this.f81088b});
    }

    public MarkContactAsSelectedParams(Contact contact, IBinder iBinder) {
        rnt rnt;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(iBinder);
        } else {
            rnt = null;
        }
        this.f81087a = contact;
        this.f81088b = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81087a, i, false);
        see.m35038a(parcel, 2, this.f81088b.asBinder());
        see.m35062b(parcel, a);
    }
}
