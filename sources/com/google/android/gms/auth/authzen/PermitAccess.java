package com.google.android.gms.auth.authzen;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.authzen.gencode.server.api.BeaconSeedEntity;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PermitAccess extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ifo();

    /* renamed from: a */
    final int f10390a;

    /* renamed from: b */
    public final String f10391b;

    /* renamed from: c */
    public final String f10392c;

    /* renamed from: d */
    public final byte[] f10393d;

    /* renamed from: e */
    public final String f10394e;

    /* renamed from: f */
    public final boolean f10395f;

    /* renamed from: g */
    public final boolean f10396g;

    /* renamed from: h */
    public final boolean f10397h;

    /* renamed from: i */
    public final String f10398i;

    /* renamed from: j */
    public final String f10399j;

    /* renamed from: k */
    final List f10400k;

    /* renamed from: l */
    public final long f10401l;

    /* renamed from: m */
    public final boolean f10402m;

    /* renamed from: n */
    public final boolean f10403n;

    public PermitAccess(int i, String str, String str2, byte[] bArr, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, List list, long j, boolean z4, boolean z5) {
        this.f10390a = i;
        sdo.m34977c(str);
        this.f10391b = str;
        sdo.m34977c(str2);
        this.f10392c = str2;
        this.f10393d = (byte[]) sdo.m34959a(bArr);
        this.f10394e = str3 == null ? "" : str3;
        this.f10395f = z;
        this.f10396g = z2;
        this.f10397h = z3;
        this.f10398i = str4;
        this.f10399j = str5;
        this.f10400k = list == null ? new ArrayList() : list;
        this.f10401l = j;
        this.f10402m = z4;
        this.f10403n = z5;
    }

    /* renamed from: a */
    public final List mo7549a() {
        return new ArrayList(this.f10400k);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof PermitAccess) {
            PermitAccess permitAccess = (PermitAccess) obj;
            if (TextUtils.equals(this.f10391b, permitAccess.f10391b) && TextUtils.equals(this.f10392c, permitAccess.f10392c) && Arrays.equals(this.f10393d, permitAccess.f10393d) && TextUtils.equals(this.f10394e, permitAccess.f10394e) && this.f10395f == permitAccess.f10395f && this.f10396g == permitAccess.f10396g && this.f10397h == permitAccess.f10397h && TextUtils.equals(this.f10398i, permitAccess.f10398i) && TextUtils.equals(this.f10399j, permitAccess.f10399j)) {
                List list = permitAccess.f10400k;
                if (this.f10400k.size() == list.size()) {
                    int size = this.f10400k.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (!((BeaconSeedEntity) this.f10400k.get(i)).equals((BeaconSeedEntity) list.get(i))) {
                                break;
                            }
                            i++;
                        } else {
                            return this.f10402m == permitAccess.f10402m && this.f10403n == permitAccess.f10403n;
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10391b, this.f10392c, this.f10393d, this.f10394e, Boolean.valueOf(this.f10395f), Boolean.valueOf(this.f10396g), Boolean.valueOf(this.f10397h), this.f10398i, this.f10399j, this.f10400k, Boolean.valueOf(this.f10402m), Boolean.valueOf(this.f10403n)});
    }

    public final String toString() {
        return String.format("PermitAccess{mVersion=%d, mId='%s', mType='%s', mName='%s', mIsUnlockable=%b, mIsUnlockKey=%b, mIsMobileHotspotSupported=%b, mBtMacAddress='%s', mDeviceType=%s, pixel=%s, arc=%s}", Integer.valueOf(this.f10390a), this.f10391b, this.f10392c, this.f10394e, Boolean.valueOf(this.f10395f), Boolean.valueOf(this.f10396g), Boolean.valueOf(this.f10397h), this.f10398i, this.f10399j, Boolean.valueOf(this.f10402m), Boolean.valueOf(this.f10403n));
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10390a);
        see.m35046a(parcel, 2, this.f10391b, false);
        see.m35046a(parcel, 3, this.f10392c, false);
        see.m35052a(parcel, 4, this.f10393d, false);
        see.m35046a(parcel, 5, this.f10394e, false);
        see.m35051a(parcel, 6, this.f10395f);
        see.m35051a(parcel, 7, this.f10396g);
        see.m35051a(parcel, 8, this.f10397h);
        see.m35046a(parcel, 9, this.f10398i, false);
        see.m35046a(parcel, 10, this.f10399j, false);
        see.m35066c(parcel, 11, this.f10400k, false);
        see.m35036a(parcel, 12, this.f10401l);
        see.m35051a(parcel, 13, this.f10402m);
        see.m35051a(parcel, 14, this.f10403n);
        see.m35062b(parcel, a);
    }
}
