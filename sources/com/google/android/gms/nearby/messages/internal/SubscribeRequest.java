package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ajdp();

    /* renamed from: a */
    final int f80760a;

    /* renamed from: b */
    public final ajcd f80761b;

    /* renamed from: c */
    public final Strategy f80762c;

    /* renamed from: d */
    public final ajcg f80763d;

    /* renamed from: e */
    public final MessageFilter f80764e;

    /* renamed from: f */
    public final PendingIntent f80765f;
    @Deprecated

    /* renamed from: g */
    public final int f80766g;
    @Deprecated

    /* renamed from: h */
    public final String f80767h;
    @Deprecated

    /* renamed from: i */
    public final String f80768i;

    /* renamed from: j */
    public final byte[] f80769j;
    @Deprecated

    /* renamed from: k */
    public final boolean f80770k;

    /* renamed from: l */
    public final ajco f80771l;
    @Deprecated

    /* renamed from: m */
    public final boolean f80772m;
    @Deprecated

    /* renamed from: n */
    public final ClientAppContext f80773n;

    /* renamed from: o */
    public final boolean f80774o;

    /* renamed from: p */
    public final int f80775p;

    /* renamed from: q */
    public final int f80776q;

    public SubscribeRequest(int i, IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, int i2, String str, String str2, byte[] bArr, boolean z, IBinder iBinder3, boolean z2, ClientAppContext clientAppContext, boolean z3, int i3, int i4) {
        ajcd ajcd;
        ajcg ajcg;
        IBinder iBinder4 = iBinder;
        IBinder iBinder5 = iBinder2;
        String str3 = str;
        String str4 = str2;
        IBinder iBinder6 = iBinder3;
        boolean z4 = z2;
        this.f80760a = i;
        ajco ajco = null;
        if (iBinder4 != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            ajcd = queryLocalInterface instanceof ajcd ? (ajcd) queryLocalInterface : new ajcb(iBinder);
        } else {
            ajcd = null;
        }
        this.f80761b = ajcd;
        this.f80762c = strategy;
        if (iBinder5 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            ajcg = queryLocalInterface2 instanceof ajcg ? (ajcg) queryLocalInterface2 : new ajce(iBinder2);
        } else {
            ajcg = null;
        }
        this.f80763d = ajcg;
        this.f80764e = messageFilter;
        this.f80765f = pendingIntent;
        this.f80766g = i2;
        this.f80767h = str3;
        this.f80768i = str4;
        this.f80769j = bArr;
        this.f80770k = z;
        if (iBinder6 != null) {
            IInterface queryLocalInterface3 = iBinder6.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            if (queryLocalInterface3 instanceof ajco) {
                ajco = (ajco) queryLocalInterface3;
            } else {
                ajco = new ajcm(iBinder6);
            }
        }
        this.f80771l = ajco;
        this.f80772m = z4;
        this.f80773n = ClientAppContext.m67403a(clientAppContext, str4, str3, z4);
        this.f80774o = z3;
        this.f80775p = i3;
        this.f80776q = i4;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.f80761b);
        String valueOf2 = String.valueOf(this.f80762c);
        String valueOf3 = String.valueOf(this.f80763d);
        String valueOf4 = String.valueOf(this.f80764e);
        String valueOf5 = String.valueOf(this.f80765f);
        byte[] bArr = this.f80769j;
        if (bArr != null) {
            int length = bArr.length;
            StringBuilder sb = new StringBuilder(19);
            sb.append("<");
            sb.append(length);
            sb.append(" bytes>");
            str = sb.toString();
        } else {
            str = null;
        }
        String valueOf6 = String.valueOf(this.f80771l);
        boolean z = this.f80772m;
        String valueOf7 = String.valueOf(this.f80773n);
        boolean z2 = this.f80774o;
        String str2 = this.f80767h;
        String str3 = this.f80768i;
        boolean z3 = this.f80770k;
        int i = this.f80776q;
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(str).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(valueOf7).length();
        StringBuilder sb2 = new StringBuilder(length2 + 291 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append("SubscribeRequest{messageListener=");
        sb2.append(valueOf);
        sb2.append(", strategy=");
        sb2.append(valueOf2);
        sb2.append(", callback=");
        sb2.append(valueOf3);
        sb2.append(", filter=");
        sb2.append(valueOf4);
        sb2.append(", pendingIntent=");
        sb2.append(valueOf5);
        sb2.append(", hint=");
        sb2.append(str);
        sb2.append(", subscribeCallback=");
        sb2.append(valueOf6);
        sb2.append(", useRealClientApiKey=");
        sb2.append(z);
        sb2.append(", clientAppContext=");
        sb2.append(valueOf7);
        sb2.append(", isDiscardPendingIntent=");
        sb2.append(z2);
        sb2.append(", zeroPartyPackageName=");
        sb2.append(str2);
        sb2.append(", realClientPackageName=");
        sb2.append(str3);
        sb2.append(", isIgnoreNearbyPermission=");
        sb2.append(z3);
        sb2.append(", callingContext=");
        sb2.append(i);
        sb2.append("}");
        return sb2.toString();
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80760a);
        ajcd ajcd = this.f80761b;
        IBinder iBinder3 = null;
        if (ajcd != null) {
            iBinder = ajcd.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 2, iBinder);
        see.m35040a(parcel, 3, this.f80762c, i, false);
        ajcg ajcg = this.f80763d;
        if (ajcg != null) {
            iBinder2 = ajcg.asBinder();
        } else {
            iBinder2 = null;
        }
        see.m35038a(parcel, 4, iBinder2);
        see.m35040a(parcel, 5, this.f80764e, i, false);
        see.m35040a(parcel, 6, this.f80765f, i, false);
        see.m35063b(parcel, 7, this.f80766g);
        see.m35046a(parcel, 8, this.f80767h, false);
        see.m35046a(parcel, 9, this.f80768i, false);
        see.m35052a(parcel, 10, this.f80769j, false);
        see.m35051a(parcel, 11, this.f80770k);
        ajco ajco = this.f80771l;
        if (ajco != null) {
            iBinder3 = ajco.asBinder();
        }
        see.m35038a(parcel, 12, iBinder3);
        see.m35051a(parcel, 13, this.f80772m);
        see.m35040a(parcel, 14, this.f80773n, i, false);
        see.m35051a(parcel, 15, this.f80774o);
        see.m35063b(parcel, 16, this.f80775p);
        see.m35063b(parcel, 17, this.f80776q);
        see.m35062b(parcel, a);
    }

    public SubscribeRequest(IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, IBinder iBinder3, boolean z, int i) {
        this(iBinder, strategy, iBinder2, messageFilter, pendingIntent, null, iBinder3, z, 0, i);
    }

    public SubscribeRequest(IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, byte[] bArr, IBinder iBinder3, boolean z, int i, int i2) {
        this(3, iBinder, strategy, iBinder2, messageFilter, pendingIntent, 0, null, null, bArr, false, iBinder3, false, null, z, i, i2);
    }
}
