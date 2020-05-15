package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LaunchOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pfy();

    /* renamed from: a */
    public boolean f29737a;

    /* renamed from: b */
    public String f29738b;

    /* renamed from: c */
    public boolean f29739c;

    /* renamed from: d */
    public CredentialsData f29740d;

    public LaunchOptions() {
        this(false, ptk.m31230a(Locale.getDefault()), false, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LaunchOptions) {
            LaunchOptions launchOptions = (LaunchOptions) obj;
            return this.f29737a == launchOptions.f29737a && ptk.m31236a(this.f29738b, launchOptions.f29738b) && this.f29739c == launchOptions.f29739c && ptk.m31236a(this.f29740d, launchOptions.f29740d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f29737a), this.f29738b, Boolean.valueOf(this.f29739c), this.f29740d});
    }

    public final String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.f29737a), this.f29738b, Boolean.valueOf(this.f29739c));
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
        see.m35051a(parcel, 2, this.f29737a);
        see.m35046a(parcel, 3, this.f29738b, false);
        see.m35051a(parcel, 4, this.f29739c);
        see.m35040a(parcel, 5, this.f29740d, i, false);
        see.m35062b(parcel, a);
    }

    public LaunchOptions(boolean z, String str, boolean z2, CredentialsData credentialsData) {
        this.f29737a = z;
        this.f29738b = str;
        this.f29739c = z2;
        this.f29740d = credentialsData;
    }
}
