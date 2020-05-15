package com.google.android.contextmanager.interest;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InterestRecordStub extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dwe();

    /* renamed from: a */
    public final bxcx f7712a;

    public InterestRecordStub(bxcx bxcx) {
        sdo.m34959a(bxcx);
        this.f7712a = bxcx;
    }

    /* renamed from: a */
    public final int mo6265a() {
        bxco a = bxco.m122577a(this.f7712a.f163004c);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        return a.f162973bD;
    }

    public InterestRecordStub(byte[] bArr) {
        bxcx bxcx;
        try {
            bxcx = (bxcx) bxvk.m124016a(bxcx.f163000i, bArr, bxus.m123744c());
        } catch (bxwf e) {
            Log.e("InterestRecordStub", "Could not deserialize interest bytes.", e);
            bxcx = null;
        }
        this.f7712a = bxcx;
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
        int a = see.m35030a(parcel);
        see.m35052a(parcel, 2, this.f7712a.mo73642k(), false);
        see.m35062b(parcel, a);
    }
}
