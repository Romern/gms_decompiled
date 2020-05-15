package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UnpublishRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajds();

    /* renamed from: a */
    final int f80777a;

    /* renamed from: b */
    public final MessageWrapper f80778b;

    /* renamed from: c */
    public final ajcg f80779c;
    @Deprecated

    /* renamed from: d */
    public final String f80780d;
    @Deprecated

    /* renamed from: e */
    public final String f80781e;
    @Deprecated

    /* renamed from: f */
    public final boolean f80782f;
    @Deprecated

    /* renamed from: g */
    public final ClientAppContext f80783g;

    public UnpublishRequest(int i, MessageWrapper messageWrapper, IBinder iBinder, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        ajcg ajcg;
        this.f80777a = i;
        this.f80778b = messageWrapper;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            ajcg = queryLocalInterface instanceof ajcg ? (ajcg) queryLocalInterface : new ajce(iBinder);
        } else {
            ajcg = null;
        }
        this.f80779c = ajcg;
        this.f80780d = str;
        this.f80781e = str2;
        this.f80782f = z;
        this.f80783g = ClientAppContext.m67403a(clientAppContext, str2, str, z);
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
        see.m35063b(parcel, 1, this.f80777a);
        see.m35040a(parcel, 2, this.f80778b, i, false);
        see.m35038a(parcel, 3, this.f80779c.asBinder());
        see.m35046a(parcel, 4, this.f80780d, false);
        see.m35046a(parcel, 5, this.f80781e, false);
        see.m35051a(parcel, 6, this.f80782f);
        see.m35040a(parcel, 7, this.f80783g, i, false);
        see.m35062b(parcel, a);
    }
}
