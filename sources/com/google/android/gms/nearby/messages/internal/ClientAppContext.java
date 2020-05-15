package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ClientAppContext extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ajbv();

    /* renamed from: a */
    final int f80722a;

    /* renamed from: b */
    public final String f80723b;

    /* renamed from: c */
    public final String f80724c;

    /* renamed from: d */
    public final boolean f80725d;
    @Deprecated

    /* renamed from: e */
    public final int f80726e;

    /* renamed from: f */
    public final String f80727f;

    public ClientAppContext(int i, String str, String str2, boolean z, int i2, String str3) {
        this.f80722a = i;
        sdo.m34959a((Object) str);
        this.f80723b = str;
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Log.w("NearbyMessages", String.format(Locale.US, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", str2, "0p:"));
            str2 = str2.length() == 0 ? new String("0p:") : "0p:".concat(str2);
        }
        this.f80724c = str2;
        this.f80725d = z;
        this.f80726e = i2;
        this.f80727f = str3;
    }

    /* renamed from: a */
    public static int m67402a(int i, ClientAppContext clientAppContext) {
        return i == 0 ? clientAppContext.f80726e : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClientAppContext) {
            ClientAppContext clientAppContext = (ClientAppContext) obj;
            return m67404a(this.f80723b, clientAppContext.f80723b) && m67404a(this.f80724c, clientAppContext.f80724c) && this.f80725d == clientAppContext.f80725d && m67404a(this.f80727f, clientAppContext.f80727f) && this.f80726e == clientAppContext.f80726e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80723b, this.f80724c, Boolean.valueOf(this.f80725d), this.f80727f, Integer.valueOf(this.f80726e)});
    }

    public final String toString() {
        return String.format(Locale.US, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", this.f80723b, this.f80724c, Boolean.valueOf(this.f80725d), this.f80727f, Integer.valueOf(this.f80726e));
    }

    /* renamed from: a */
    static final ClientAppContext m67403a(ClientAppContext clientAppContext, String str, String str2, boolean z) {
        if (clientAppContext != null) {
            return clientAppContext;
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new ClientAppContext(str, str2, z, 0);
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
        see.m35063b(parcel, 1, this.f80722a);
        see.m35046a(parcel, 2, this.f80723b, false);
        see.m35046a(parcel, 3, this.f80724c, false);
        see.m35051a(parcel, 4, this.f80725d);
        see.m35063b(parcel, 5, this.f80726e);
        see.m35046a(parcel, 6, this.f80727f, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    private static boolean m67404a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return TextUtils.isEmpty(str2);
        }
        return str.equals(str2);
    }

    public ClientAppContext(String str) {
        this(str, null);
    }

    public ClientAppContext(String str, String str2) {
        this(str, str2, false, 0);
    }

    public ClientAppContext(String str, String str2, boolean z, int i) {
        this(1, str, str2, z, i, null);
    }
}
