package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PublishRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajdn();

    /* renamed from: a */
    final int f80743a;

    /* renamed from: b */
    public final MessageWrapper f80744b;

    /* renamed from: c */
    public final Strategy f80745c;

    /* renamed from: d */
    public final ajcg f80746d;
    @Deprecated

    /* renamed from: e */
    public final String f80747e;
    @Deprecated

    /* renamed from: f */
    public final String f80748f;
    @Deprecated

    /* renamed from: g */
    public final boolean f80749g;
    @Deprecated

    /* renamed from: h */
    public final boolean f80750h;
    @Deprecated

    /* renamed from: i */
    public final ClientAppContext f80751i;

    /* renamed from: j */
    public final int f80752j;

    /* renamed from: k */
    public final ajck f80753k;

    public PublishRequest(int i, MessageWrapper messageWrapper, Strategy strategy, IBinder iBinder, String str, String str2, boolean z, IBinder iBinder2, boolean z2, ClientAppContext clientAppContext, int i2) {
        ajcg ajcg;
        this.f80743a = i;
        this.f80744b = messageWrapper;
        this.f80745c = strategy;
        ajck ajck = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            ajcg = queryLocalInterface instanceof ajcg ? (ajcg) queryLocalInterface : new ajce(iBinder);
        } else {
            ajcg = null;
        }
        this.f80746d = ajcg;
        this.f80747e = str;
        this.f80748f = str2;
        this.f80749g = z;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            if (queryLocalInterface2 instanceof ajck) {
                ajck = (ajck) queryLocalInterface2;
            } else {
                ajck = new ajck(iBinder2);
            }
        }
        this.f80753k = ajck;
        this.f80750h = z2;
        this.f80751i = ClientAppContext.m67403a(clientAppContext, str2, str, z2);
        this.f80752j = i2;
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
        see.m35063b(parcel, 1, this.f80743a);
        see.m35040a(parcel, 2, this.f80744b, i, false);
        see.m35040a(parcel, 3, this.f80745c, i, false);
        see.m35038a(parcel, 4, this.f80746d.asBinder());
        see.m35046a(parcel, 5, this.f80747e, false);
        see.m35046a(parcel, 6, this.f80748f, false);
        see.m35051a(parcel, 7, this.f80749g);
        ajck ajck = this.f80753k;
        if (ajck != null) {
            iBinder = ajck.f12819a;
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 8, iBinder);
        see.m35051a(parcel, 9, this.f80750h);
        see.m35040a(parcel, 10, this.f80751i, i, false);
        see.m35063b(parcel, 11, this.f80752j);
        see.m35062b(parcel, a);
    }
}
