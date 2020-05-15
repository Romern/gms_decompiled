package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RegisterStatusCallbackRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajdo();

    /* renamed from: a */
    final int f80754a;

    /* renamed from: b */
    public final ajcg f80755b;

    /* renamed from: c */
    public boolean f80756c;
    @Deprecated

    /* renamed from: d */
    public String f80757d;
    @Deprecated

    /* renamed from: e */
    public final ClientAppContext f80758e;

    /* renamed from: f */
    public final ajcl f80759f;

    public RegisterStatusCallbackRequest(int i, IBinder iBinder, IBinder iBinder2, boolean z, String str, ClientAppContext clientAppContext) {
        ajcg ajcg;
        ajcl ajcl;
        this.f80754a = i;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            ajcg = queryLocalInterface instanceof ajcg ? (ajcg) queryLocalInterface : new ajce(iBinder);
        } else {
            ajcg = null;
        }
        this.f80755b = ajcg;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            ajcl = queryLocalInterface2 instanceof ajcl ? (ajcl) queryLocalInterface2 : new ajcl(iBinder2);
        } else {
            ajcl = null;
        }
        this.f80759f = ajcl;
        this.f80756c = z;
        this.f80757d = str;
        this.f80758e = ClientAppContext.m67403a(clientAppContext, null, str, false);
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
        see.m35063b(parcel, 1, this.f80754a);
        see.m35038a(parcel, 2, this.f80755b.asBinder());
        see.m35038a(parcel, 3, this.f80759f.f12819a);
        see.m35051a(parcel, 4, this.f80756c);
        see.m35046a(parcel, 5, this.f80757d, false);
        see.m35040a(parcel, 6, this.f80758e, i, false);
        see.m35062b(parcel, a);
    }
}
