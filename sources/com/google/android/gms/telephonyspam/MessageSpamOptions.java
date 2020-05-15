package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MessageSpamOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aucz();

    /* renamed from: a */
    public final int f109026a;

    /* renamed from: b */
    public final String f109027b;

    /* renamed from: c */
    public final long f109028c;

    /* renamed from: d */
    public final List f109029d;

    public MessageSpamOptions(int i, String str, long j, List list) {
        this.f109026a = i;
        this.f109027b = str;
        this.f109028c = j;
        this.f109029d = list;
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
        see.m35063b(parcel, 1, this.f109026a);
        see.m35046a(parcel, 2, this.f109027b, false);
        see.m35036a(parcel, 3, this.f109028c);
        see.m35066c(parcel, 4, this.f109029d, false);
        see.m35062b(parcel, a);
    }
}
