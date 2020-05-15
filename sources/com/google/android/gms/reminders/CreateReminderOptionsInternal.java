package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreateReminderOptionsInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aosa();

    /* renamed from: a */
    public static final CreateReminderOptionsInternal f107033a = new CreateReminderOptionsInternal(null, null, false);

    /* renamed from: b */
    public final String f107034b;

    /* renamed from: c */
    public final String f107035c;

    /* renamed from: d */
    public final boolean f107036d;

    public CreateReminderOptionsInternal(String str, String str2, boolean z) {
        this.f107034b = str;
        this.f107035c = str2;
        this.f107036d = z;
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
        see.m35046a(parcel, 2, this.f107034b, false);
        see.m35046a(parcel, 3, this.f107035c, false);
        see.m35051a(parcel, 4, this.f107036d);
        see.m35062b(parcel, a);
    }
}
