package com.google.android.gms.contextmanager.fence.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateFenceOperation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tlk();

    /* renamed from: a */
    public final int f30662a;

    /* renamed from: b */
    public final ContextFenceRegistrationStub f30663b;

    /* renamed from: c */
    public tku f30664c;

    /* renamed from: d */
    public final lrj f30665d;

    /* renamed from: e */
    public final PendingIntent f30666e;

    /* renamed from: f */
    public final String f30667f;

    /* renamed from: g */
    public final long f30668g;

    /* renamed from: h */
    public final long f30669h;

    public UpdateFenceOperation(int i, ContextFenceRegistrationStub contextFenceRegistrationStub, IBinder iBinder, PendingIntent pendingIntent, String str, long j, long j2) {
        tku tku;
        this.f30662a = i;
        this.f30663b = contextFenceRegistrationStub;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
            tku = queryLocalInterface instanceof tku ? (tku) queryLocalInterface : new tks(iBinder);
        } else {
            tku = null;
        }
        this.f30664c = tku;
        this.f30665d = null;
        this.f30666e = pendingIntent;
        this.f30667f = str;
        this.f30668g = j;
        this.f30669h = j2;
    }

    /* renamed from: a */
    public static final UpdateFenceOperation m22879a(String str) {
        return new UpdateFenceOperation(5, (ContextFenceRegistrationStub) null, (lrj) null, (PendingIntent) null, str, -1, -1);
    }

    /* renamed from: a */
    public static final UpdateFenceOperation m22880a(String str, long j, ContextFenceStub contextFenceStub, PendingIntent pendingIntent) {
        return new UpdateFenceOperation(2, ContextFenceRegistrationStub.m22861a(str, j, contextFenceStub), (lrj) null, pendingIntent, (String) null, -1, -1);
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
        see.m35063b(parcel, 2, this.f30662a);
        see.m35040a(parcel, 3, this.f30663b, i, false);
        tku tku = this.f30664c;
        if (tku != null) {
            iBinder = tku.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 4, iBinder);
        see.m35040a(parcel, 5, this.f30666e, i, false);
        see.m35046a(parcel, 6, this.f30667f, false);
        see.m35036a(parcel, 7, this.f30668g);
        see.m35036a(parcel, 8, this.f30669h);
        see.m35062b(parcel, a);
    }

    public UpdateFenceOperation(int i, ContextFenceRegistrationStub contextFenceRegistrationStub, lrj lrj, PendingIntent pendingIntent, String str, long j, long j2) {
        this.f30662a = i;
        this.f30663b = contextFenceRegistrationStub;
        this.f30664c = null;
        this.f30665d = lrj;
        this.f30666e = pendingIntent;
        this.f30667f = str;
        this.f30668g = j;
        this.f30669h = j2;
    }

    public UpdateFenceOperation(ContextFenceRegistrationStub contextFenceRegistrationStub, tku tku) {
        this.f30662a = 1;
        this.f30663b = contextFenceRegistrationStub;
        this.f30664c = tku;
        this.f30665d = null;
        this.f30666e = null;
        this.f30667f = null;
        this.f30668g = -1;
        this.f30669h = -1;
    }
}
