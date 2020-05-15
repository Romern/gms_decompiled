package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VerifyBeforeUpdateEmailAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brkv();

    /* renamed from: a */
    public final String f152484a;

    /* renamed from: b */
    public final String f152485b;

    /* renamed from: c */
    public final ActionCodeSettings f152486c;

    public VerifyBeforeUpdateEmailAidlRequest(String str, String str2, ActionCodeSettings actionCodeSettings) {
        this.f152484a = str;
        this.f152485b = str2;
        this.f152486c = actionCodeSettings;
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
        see.m35046a(parcel, 1, this.f152484a, false);
        see.m35046a(parcel, 2, this.f152485b, false);
        see.m35040a(parcel, 3, this.f152486c, i, false);
        see.m35062b(parcel, a);
    }
}
