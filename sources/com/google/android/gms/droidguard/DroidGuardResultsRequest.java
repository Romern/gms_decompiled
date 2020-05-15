package com.google.android.gms.droidguard;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DroidGuardResultsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vwe();

    /* renamed from: b */
    private static final int f31251b = ((int) TimeUnit.SECONDS.toMillis(60));

    /* renamed from: a */
    public Bundle f31252a;

    public DroidGuardResultsRequest() {
        String str;
        this.f31252a = new Bundle();
        mo18377a(rfi.f42869b);
        try {
            str = System.getProperty("os.arch");
        } catch (Exception e) {
            str = "?";
        }
        this.f31252a.putString("appArchitecture", str);
    }

    /* renamed from: a */
    public final int mo18376a() {
        return this.f31252a.getInt("timeoutMs", f31251b);
    }

    /* renamed from: b */
    public final void mo18378b(int i) {
        this.f31252a.putInt("timeoutMs", i);
    }

    /* renamed from: a */
    public final void mo18377a(int i) {
        this.f31252a.putInt("clientVersion", i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35037a(parcel, 2, this.f31252a, false);
        see.m35062b(parcel, a);
    }

    public DroidGuardResultsRequest(Bundle bundle) {
        new Bundle();
        this.f31252a = bundle;
    }
}
