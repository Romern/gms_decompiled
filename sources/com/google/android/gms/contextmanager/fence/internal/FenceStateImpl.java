package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceState;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FenceStateImpl extends FenceState {
    public static final Parcelable.Creator CREATOR = new tkn();

    /* renamed from: a */
    public final int f30653a;

    /* renamed from: b */
    public final long f30654b;

    /* renamed from: c */
    public final String f30655c;

    /* renamed from: d */
    public final int f30656d;

    /* renamed from: e */
    public final ArrayList f30657e;

    public FenceStateImpl(int i, long j, String str, int i2) {
        this(i, j, str, i2, null);
    }

    /* renamed from: a */
    public final int mo8005a() {
        return this.f30653a;
    }

    /* renamed from: b */
    public final String mo8006b() {
        return this.f30655c;
    }

    public FenceStateImpl(int i, long j, String str, int i2, ArrayList arrayList) {
        this.f30653a = i;
        this.f30654b = j;
        this.f30655c = str;
        this.f30656d = i2;
        this.f30657e = arrayList;
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
        see.m35063b(parcel, 2, this.f30653a);
        see.m35036a(parcel, 3, this.f30654b);
        see.m35046a(parcel, 4, this.f30655c, false);
        see.m35063b(parcel, 5, this.f30656d);
        see.m35066c(parcel, 6, this.f30657e, false);
        see.m35062b(parcel, a);
    }
}
