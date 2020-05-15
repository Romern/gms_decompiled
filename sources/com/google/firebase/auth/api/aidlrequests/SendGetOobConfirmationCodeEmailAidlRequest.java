package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SendGetOobConfirmationCodeEmailAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brkg();

    /* renamed from: a */
    public final String f152450a;

    /* renamed from: b */
    public final ActionCodeSettings f152451b;

    /* renamed from: c */
    public final String f152452c;

    public SendGetOobConfirmationCodeEmailAidlRequest(String str, ActionCodeSettings actionCodeSettings, String str2) {
        this.f152450a = str;
        this.f152451b = actionCodeSettings;
        this.f152452c = str2;
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
        see.m35046a(parcel, 1, this.f152450a, false);
        see.m35040a(parcel, 2, this.f152451b, i, false);
        see.m35046a(parcel, 3, this.f152452c, false);
        see.m35062b(parcel, a);
    }
}
