package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VerifyCustomTokenResponse extends AbstractSafeParcelable implements brpk {
    public static final Parcelable.Creator CREATOR = new brrm();

    /* renamed from: a */
    public String f152572a;

    /* renamed from: b */
    public String f152573b;

    /* renamed from: c */
    public long f152574c;

    /* renamed from: d */
    public boolean f152575d;

    public VerifyCustomTokenResponse() {
    }

    /* renamed from: a */
    public final bxxk mo69763a() {
        return (bxxk) bkle.f124727e.mo74142c(7);
    }

    public VerifyCustomTokenResponse(String str, String str2, long j, boolean z) {
        this.f152572a = str;
        this.f152573b = str2;
        this.f152574c = j;
        this.f152575d = z;
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
        see.m35046a(parcel, 2, this.f152572a, false);
        see.m35046a(parcel, 3, this.f152573b, false);
        see.m35036a(parcel, 4, this.f152574c);
        see.m35051a(parcel, 5, this.f152575d);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69764a(bxxc bxxc) {
        if (bxxc instanceof bkle) {
            bkle bkle = (bkle) bxxc;
            this.f152572a = stm.m36300b(bkle.f124729a);
            this.f152573b = stm.m36300b(bkle.f124730b);
            this.f152574c = bkle.f124731c;
            this.f152575d = bkle.f124732d;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of VerifyCustomTokenResponse.");
    }
}
