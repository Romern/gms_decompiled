package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hvl();

    /* renamed from: a */
    public final PendingIntent f10247a;

    public SavePasswordResult(PendingIntent pendingIntent) {
        sdo.m34959a(pendingIntent);
        this.f10247a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return sdg.m34949a(this.f10247a, ((SavePasswordResult) obj).f10247a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10247a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f10247a, i, false);
        see.m35062b(parcel, a);
    }
}
