package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awak();

    /* renamed from: a */
    public ArrayList f109772a;

    /* renamed from: b */
    public boolean f109773b;

    /* renamed from: c */
    public boolean f109774c;

    /* renamed from: d */
    public int f109775d;

    private CardRequirements() {
        this.f109773b = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.util.List, boolean):void
     arg types: [android.os.Parcel, int, java.util.ArrayList, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35049a(parcel, 1, (List) this.f109772a, false);
        see.m35051a(parcel, 2, this.f109773b);
        see.m35051a(parcel, 3, this.f109774c);
        see.m35063b(parcel, 4, this.f109775d);
        see.m35062b(parcel, a);
    }

    public CardRequirements(ArrayList arrayList, boolean z, boolean z2, int i) {
        this.f109772a = arrayList;
        this.f109773b = z;
        this.f109774c = z2;
        this.f109775d = i;
    }
}
