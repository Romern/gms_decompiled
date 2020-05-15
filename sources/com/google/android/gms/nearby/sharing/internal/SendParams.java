package com.google.android.gms.nearby.sharing.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SendParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akas();

    /* renamed from: a */
    public ShareTarget f81119a;

    /* renamed from: b */
    public Intent f81120b;

    /* renamed from: c */
    public rnt f81121c;

    public SendParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendParams) {
            SendParams sendParams = (SendParams) obj;
            return sdg.m34949a(this.f81119a, sendParams.f81119a) && sdg.m34949a(this.f81120b, sendParams.f81120b) && sdg.m34949a(this.f81121c, sendParams.f81121c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81119a, this.f81120b, this.f81121c});
    }

    public SendParams(ShareTarget shareTarget, Intent intent, IBinder iBinder) {
        rnt rnt;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(iBinder);
        } else {
            rnt = null;
        }
        this.f81119a = shareTarget;
        this.f81120b = intent;
        this.f81121c = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81119a, i, false);
        see.m35040a(parcel, 2, this.f81120b, i, false);
        see.m35038a(parcel, 3, this.f81121c.asBinder());
        see.m35062b(parcel, a);
    }
}
