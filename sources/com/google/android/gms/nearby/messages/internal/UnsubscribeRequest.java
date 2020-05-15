package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UnsubscribeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajdu();

    /* renamed from: a */
    final int f80784a;

    /* renamed from: b */
    public final ajcd f80785b;

    /* renamed from: c */
    public final ajcg f80786c;

    /* renamed from: d */
    public final PendingIntent f80787d;
    @Deprecated

    /* renamed from: e */
    public final int f80788e;
    @Deprecated

    /* renamed from: f */
    public final String f80789f;
    @Deprecated

    /* renamed from: g */
    public final String f80790g;
    @Deprecated

    /* renamed from: h */
    public final boolean f80791h;
    @Deprecated

    /* renamed from: i */
    public final ClientAppContext f80792i;

    public UnsubscribeRequest(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i2, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        ajcd ajcd;
        this.f80784a = i;
        ajcg ajcg = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            ajcd = queryLocalInterface instanceof ajcd ? (ajcd) queryLocalInterface : new ajcb(iBinder);
        } else {
            ajcd = null;
        }
        this.f80785b = ajcd;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            if (queryLocalInterface2 instanceof ajcg) {
                ajcg = (ajcg) queryLocalInterface2;
            } else {
                ajcg = new ajce(iBinder2);
            }
        }
        this.f80786c = ajcg;
        this.f80787d = pendingIntent;
        this.f80788e = i2;
        this.f80789f = str;
        this.f80790g = str2;
        this.f80791h = z;
        this.f80792i = ClientAppContext.m67403a(clientAppContext, str2, str, z);
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
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80784a);
        ajcd ajcd = this.f80785b;
        if (ajcd != null) {
            iBinder = ajcd.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 2, iBinder);
        see.m35038a(parcel, 3, this.f80786c.asBinder());
        see.m35040a(parcel, 4, this.f80787d, i, false);
        see.m35063b(parcel, 5, this.f80788e);
        see.m35046a(parcel, 6, this.f80789f, false);
        see.m35046a(parcel, 7, this.f80790g, false);
        see.m35051a(parcel, 8, this.f80791h);
        see.m35040a(parcel, 9, this.f80792i, i, false);
        see.m35062b(parcel, a);
    }

    public UnsubscribeRequest(IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent) {
        this(1, iBinder, iBinder2, pendingIntent, 0, null, null, false, null);
    }
}
