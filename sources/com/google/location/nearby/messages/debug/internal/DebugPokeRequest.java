package com.google.location.nearby.messages.debug.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DebugPokeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bvha();

    /* renamed from: a */
    final int f191782a;

    /* renamed from: b */
    public byte[] f191783b;

    /* renamed from: c */
    public final bvhf f191784c;

    /* renamed from: d */
    public final bvhg f191785d;

    /* renamed from: e */
    public final bvhg f191786e;

    /* renamed from: f */
    public final bvhg f191787f;

    /* renamed from: g */
    public final bvhg f191788g;

    public DebugPokeRequest(int i, byte[] bArr, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, IBinder iBinder5) {
        bvhf bvhf;
        bvhg bvhg;
        bvhg bvhg2;
        bvhg bvhg3;
        bvhg bvhg4 = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.messages.debug.internal.IDebugPokeTokenCallback");
            bvhf = queryLocalInterface instanceof bvhf ? (bvhf) queryLocalInterface : new bvhf(iBinder);
        } else {
            bvhf = null;
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.location.nearby.messages.debug.internal.IProtoMessageCallback");
            bvhg = queryLocalInterface2 instanceof bvhg ? (bvhg) queryLocalInterface2 : new bvhg(iBinder2);
        } else {
            bvhg = null;
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.location.nearby.messages.debug.internal.IProtoMessageCallback");
            bvhg2 = queryLocalInterface3 instanceof bvhg ? (bvhg) queryLocalInterface3 : new bvhg(iBinder3);
        } else {
            bvhg2 = null;
        }
        if (iBinder4 != null) {
            IInterface queryLocalInterface4 = iBinder4.queryLocalInterface("com.google.location.nearby.messages.debug.internal.IProtoMessageCallback");
            bvhg3 = queryLocalInterface4 instanceof bvhg ? (bvhg) queryLocalInterface4 : new bvhg(iBinder4);
        } else {
            bvhg3 = null;
        }
        if (iBinder5 != null) {
            IInterface queryLocalInterface5 = iBinder5.queryLocalInterface("com.google.location.nearby.messages.debug.internal.IProtoMessageCallback");
            if (queryLocalInterface5 instanceof bvhg) {
                bvhg4 = (bvhg) queryLocalInterface5;
            } else {
                bvhg4 = new bvhg(iBinder5);
            }
        }
        this.f191782a = i;
        this.f191783b = bArr;
        this.f191784c = bvhf;
        this.f191785d = bvhg;
        this.f191786e = bvhg2;
        this.f191787f = bvhg3;
        this.f191788g = bvhg4;
    }

    public final String toString() {
        Integer num;
        Object[] objArr = new Object[6];
        objArr[0] = this.f191788g;
        objArr[1] = this.f191787f;
        objArr[2] = this.f191786e;
        objArr[3] = this.f191785d;
        objArr[4] = this.f191784c;
        byte[] bArr = this.f191783b;
        if (bArr != null) {
            num = Integer.valueOf(bArr.length);
        } else {
            num = null;
        }
        objArr[5] = num;
        return String.format("DebugPokeRequest{operationCallback=%s, gcmCallback=%s, configurationCallback=%s, networkCallback=%s, tokenCallback=%s, protoData.length=%s}", objArr);
    }

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
        IBinder iBinder3;
        IBinder iBinder4;
        int a = see.m35030a(parcel);
        see.m35052a(parcel, 4, this.f191783b, false);
        bvhf bvhf = this.f191784c;
        IBinder iBinder5 = null;
        if (bvhf != null) {
            iBinder = bvhf.f12819a;
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 5, iBinder);
        bvhg bvhg = this.f191785d;
        if (bvhg != null) {
            iBinder2 = bvhg.f12819a;
        } else {
            iBinder2 = null;
        }
        see.m35038a(parcel, 7, iBinder2);
        bvhg bvhg2 = this.f191786e;
        if (bvhg2 != null) {
            iBinder3 = bvhg2.f12819a;
        } else {
            iBinder3 = null;
        }
        see.m35038a(parcel, 8, iBinder3);
        bvhg bvhg3 = this.f191787f;
        if (bvhg3 != null) {
            iBinder4 = bvhg3.f12819a;
        } else {
            iBinder4 = null;
        }
        see.m35038a(parcel, 9, iBinder4);
        bvhg bvhg4 = this.f191788g;
        if (bvhg4 != null) {
            iBinder5 = bvhg4.f12819a;
        }
        see.m35038a(parcel, 10, iBinder5);
        see.m35063b(parcel, 1000, this.f191782a);
        see.m35062b(parcel, a);
    }
}
