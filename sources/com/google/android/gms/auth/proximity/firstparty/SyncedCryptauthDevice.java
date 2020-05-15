package com.google.android.gms.auth.proximity.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncedCryptauthDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jqy();

    /* renamed from: a */
    public final byte[] f11186a;

    /* renamed from: b */
    public final String f11187b;

    /* renamed from: c */
    public final String f11188c;

    /* renamed from: d */
    final String f11189d;

    /* renamed from: e */
    public final boolean f11190e;

    /* renamed from: f */
    public final boolean f11191f;

    /* renamed from: g */
    final long f11192g;

    /* renamed from: h */
    final boolean f11193h;

    /* renamed from: i */
    public final String f11194i;

    /* renamed from: j */
    final boolean f11195j;

    /* renamed from: k */
    final boolean f11196k;

    /* renamed from: l */
    public final List f11197l;

    /* renamed from: m */
    public final List f11198m;

    /* renamed from: n */
    final List f11199n;

    public SyncedCryptauthDevice(byte[] bArr, String str, String str2, String str3, boolean z, boolean z2, long j, boolean z3, String str4, boolean z4, boolean z5, List list, List list2, List list3) {
        this.f11186a = (byte[]) sdo.m34959a(bArr);
        sdo.m34977c(str);
        this.f11187b = str;
        this.f11188c = str2 == null ? "" : str2;
        this.f11189d = str3;
        this.f11190e = z;
        this.f11191f = z2;
        this.f11192g = j;
        this.f11193h = z3;
        this.f11194i = str4;
        this.f11195j = z4;
        this.f11196k = z5;
        this.f11197l = list;
        this.f11198m = list2;
        this.f11199n = list3 != null ? bngx.m109368a((Collection) list3) : bngx.m109376e();
    }

    /* renamed from: a */
    private static String m6810a(List list) {
        String join = TextUtils.join(", ", list);
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 4);
        sb.append("[ ");
        sb.append(join);
        sb.append(" ]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof SyncedCryptauthDevice) {
            SyncedCryptauthDevice syncedCryptauthDevice = (SyncedCryptauthDevice) obj;
            return Arrays.equals(this.f11186a, syncedCryptauthDevice.f11186a) && TextUtils.equals(this.f11187b, syncedCryptauthDevice.f11187b) && TextUtils.equals(this.f11188c, syncedCryptauthDevice.f11188c) && this.f11191f == syncedCryptauthDevice.f11191f && this.f11190e == syncedCryptauthDevice.f11190e && this.f11193h == syncedCryptauthDevice.f11193h && TextUtils.equals(this.f11189d, syncedCryptauthDevice.f11189d) && TextUtils.equals(this.f11194i, syncedCryptauthDevice.f11194i) && this.f11195j == syncedCryptauthDevice.f11195j && this.f11196k == syncedCryptauthDevice.f11196k && this.f11198m.size() == syncedCryptauthDevice.f11198m.size() && this.f11198m.containsAll(syncedCryptauthDevice.f11198m) && this.f11197l.size() == syncedCryptauthDevice.f11197l.size() && this.f11199n.equals(syncedCryptauthDevice.f11199n) && this.f11197l.containsAll(syncedCryptauthDevice.f11197l);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11186a, this.f11187b, this.f11188c, Boolean.valueOf(this.f11191f), Boolean.valueOf(this.f11190e), Boolean.valueOf(this.f11193h), this.f11189d, this.f11194i, Boolean.valueOf(this.f11195j), Boolean.valueOf(this.f11196k), this.f11197l, this.f11198m, this.f11199n});
    }

    public final String toString() {
        return String.format("SyncedCryptauthDevice { mPublicKey='%s', mAccountId=%s, mName='%s', mIsUnlockable=%b, mIsUnlockKey=%b, mIsMobileHotspotSupported=%b, mBtMacAddress='%s', mDeviceType=%s, mIsPixelPhone=%s, isArcPlusPlus=%s, supportedFeatures=%s, enabledFeatures=%s}", sqd.m35970c(this.f11186a), this.f11187b, this.f11188c, Boolean.valueOf(this.f11191f), Boolean.valueOf(this.f11190e), Boolean.valueOf(this.f11193h), this.f11189d, this.f11194i, Boolean.valueOf(this.f11195j), Boolean.valueOf(this.f11196k), m6810a(this.f11197l), m6810a(this.f11198m));
    }

    /* renamed from: a */
    public final bngx mo7813a() {
        return bngx.m109368a((Collection) this.f11199n);
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
        see.m35052a(parcel, 1, this.f11186a, false);
        see.m35046a(parcel, 2, this.f11187b, false);
        see.m35046a(parcel, 3, this.f11188c, false);
        see.m35046a(parcel, 4, this.f11189d, false);
        see.m35051a(parcel, 5, this.f11190e);
        see.m35051a(parcel, 6, this.f11191f);
        see.m35036a(parcel, 7, this.f11192g);
        see.m35051a(parcel, 8, this.f11193h);
        see.m35046a(parcel, 9, this.f11194i, false);
        see.m35051a(parcel, 10, this.f11195j);
        see.m35051a(parcel, 11, this.f11196k);
        see.m35065b(parcel, 12, this.f11197l, false);
        see.m35065b(parcel, 13, this.f11198m, false);
        see.m35066c(parcel, 14, this.f11199n, false);
        see.m35062b(parcel, a);
    }
}
