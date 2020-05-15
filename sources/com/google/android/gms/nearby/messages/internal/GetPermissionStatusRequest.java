package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetPermissionStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajby();

    /* renamed from: a */
    final int f80731a;

    /* renamed from: b */
    public final ajcg f80732b;
    @Deprecated

    /* renamed from: c */
    public final String f80733c;
    @Deprecated

    /* renamed from: d */
    public final ClientAppContext f80734d;

    public GetPermissionStatusRequest(int i, IBinder iBinder, String str, ClientAppContext clientAppContext) {
        ajcg ajcg;
        this.f80731a = i;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            ajcg = queryLocalInterface instanceof ajcg ? (ajcg) queryLocalInterface : new ajce(iBinder);
        } else {
            ajcg = null;
        }
        this.f80732b = ajcg;
        this.f80733c = str;
        this.f80734d = ClientAppContext.m67403a(clientAppContext, null, str, false);
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
        see.m35063b(parcel, 1, this.f80731a);
        see.m35038a(parcel, 2, this.f80732b.asBinder());
        see.m35046a(parcel, 3, this.f80733c, false);
        see.m35040a(parcel, 4, this.f80734d, i, false);
        see.m35062b(parcel, a);
    }
}
