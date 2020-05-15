package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ProviderSendParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akab();

    /* renamed from: a */
    public String f81102a;

    /* renamed from: b */
    public ShareTarget f81103b;

    /* renamed from: c */
    public ajyz f81104c;

    public ProviderSendParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderSendParams) {
            ProviderSendParams providerSendParams = (ProviderSendParams) obj;
            return sdg.m34949a(this.f81102a, providerSendParams.f81102a) && sdg.m34949a(this.f81103b, providerSendParams.f81103b) && sdg.m34949a(this.f81104c, providerSendParams.f81104c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81102a, this.f81103b, this.f81104c});
    }

    public ProviderSendParams(String str, ShareTarget shareTarget, IBinder iBinder) {
        ajyz ajyz;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            ajyz = queryLocalInterface instanceof ajyz ? (ajyz) queryLocalInterface : new ajyx(iBinder);
        } else {
            ajyz = null;
        }
        this.f81102a = str;
        this.f81103b = shareTarget;
        this.f81104c = ajyz;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f81102a, false);
        see.m35040a(parcel, 2, this.f81103b, i, false);
        see.m35038a(parcel, 3, this.f81104c.asBinder());
        see.m35062b(parcel, a);
    }
}
