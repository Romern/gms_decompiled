package com.google.android.gms.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContextData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tis();

    /* renamed from: a */
    public static final int[] f30618a = {0, 1};

    /* renamed from: c */
    public static dwo f30619c = null;

    /* renamed from: b */
    public bxce f30620b;

    /* renamed from: d */
    private byte[] f30621d;

    /* renamed from: e */
    private tjl f30622e;

    /* renamed from: f */
    private tka f30623f;

    /* renamed from: g */
    private tju f30624g;

    public ContextData(bxce bxce) {
        sdo.m34959a(bxce);
        this.f30620b = bxce;
        this.f30621d = null;
        m22845o();
    }

    /* renamed from: a */
    public static final boolean m22842a(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    /* renamed from: n */
    private final void m22844n() {
        byte[] bArr;
        if (!mo18011a() && (bArr = this.f30621d) != null) {
            try {
                this.f30620b = (bxce) bxvk.m124016a(bxce.f162766k, bArr, bxus.m123744c());
                this.f30621d = null;
            } catch (bxwf e) {
                Log.e("ContextData", "Could not deserialize context bytes.", e);
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: o */
    private final void m22845o() {
        bxce bxce = this.f30620b;
        if (bxce == null && this.f30621d != null) {
            return;
        }
        if (bxce != null && this.f30621d == null) {
            return;
        }
        if (bxce != null && this.f30621d != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (bxce == null && this.f30621d == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo18011a() {
        return this.f30620b != null;
    }

    /* renamed from: b */
    public final byte[] mo18012b() {
        byte[] bArr = this.f30621d;
        return bArr == null ? this.f30620b.mo73642k() : bArr;
    }

    /* renamed from: c */
    public final bxce mo18013c() {
        m22844n();
        return this.f30620b;
    }

    /* renamed from: d */
    public final String mo18014d() {
        m22844n();
        return this.f30620b.f162769b;
    }

    /* renamed from: e */
    public final tjl mo18015e() {
        m22844n();
        bxce bxce = this.f30620b;
        if ((bxce.f162768a & 2) == 0) {
            return null;
        }
        bxcp bxcp = bxce.f162770c;
        if (bxcp == null) {
            bxcp = bxcp.f162974g;
        }
        if (TextUtils.isEmpty(bxcp.f162980e) || TextUtils.isEmpty(bxcp.f162981f)) {
            return null;
        }
        if (this.f30622e == null) {
            bxcp bxcp2 = this.f30620b.f162770c;
            if (bxcp2 == null) {
                bxcp2 = bxcp.f162974g;
            }
            this.f30622e = new tjl(bxcp2);
        }
        return this.f30622e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContextData) {
            ContextData contextData = (ContextData) obj;
            m22844n();
            contextData.m22844n();
            if (mo18014d().equals(contextData.mo18014d())) {
                bxcp bxcp = this.f30620b.f162770c;
                if (bxcp == null) {
                    bxcp = bxcp.f162974g;
                }
                int i = bxcp.f162979d;
                bxcp bxcp2 = contextData.f30620b.f162770c;
                if (bxcp2 == null) {
                    bxcp2 = bxcp.f162974g;
                }
                if (i == bxcp2.f162979d) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int mo18017f() {
        m22844n();
        int a = bxch.m122566a(this.f30620b.f162771d);
        if (a == 0) {
            a = 1;
        }
        return a - 1;
    }

    /* renamed from: g */
    public final int mo18018g() {
        m22844n();
        bxco a = bxco.m122577a(this.f30620b.f162772e);
        if (a == null) {
            a = bxco.UNKNOWN_CONTEXT_NAME;
        }
        return a.f162973bD;
    }

    /* renamed from: h */
    public final bxco mo18019h() {
        m22844n();
        bxco a = bxco.m122577a(this.f30620b.f162772e);
        return a == null ? bxco.UNKNOWN_CONTEXT_NAME : a;
    }

    public final int hashCode() {
        m22844n();
        Object[] objArr = new Object[2];
        objArr[0] = mo18014d();
        bxcp bxcp = this.f30620b.f162770c;
        if (bxcp == null) {
            bxcp = bxcp.f162974g;
        }
        objArr[1] = Integer.valueOf(bxcp.f162979d);
        return Arrays.hashCode(objArr);
    }

    /* renamed from: i */
    public final int mo18021i() {
        m22844n();
        int a = bxcd.m122562a(this.f30620b.f162773f);
        if (a == 0) {
            a = 1;
        }
        return a - 1;
    }

    /* renamed from: j */
    public final tka mo18022j() {
        m22844n();
        bxce bxce = this.f30620b;
        if ((bxce.f162768a & 32) == 0) {
            return null;
        }
        if (this.f30623f == null) {
            bxeu bxeu = bxce.f162774g;
            if (bxeu == null) {
                bxeu = bxeu.f163125e;
            }
            this.f30623f = new tka(bxeu);
        }
        return this.f30623f;
    }

    /* renamed from: k */
    public final byte[] mo18023k() {
        m22844n();
        return m22843a(this.f30620b);
    }

    /* renamed from: l */
    public final tju mo18024l() {
        m22844n();
        bxce bxce = this.f30620b;
        if ((bxce.f162768a & 128) == 0) {
            return null;
        }
        if (this.f30624g == null) {
            bxdj bxdj = bxce.f162777j;
            if (bxdj == null) {
                bxdj = bxdj.f163036e;
            }
            this.f30624g = new tju(bxdj);
        }
        return this.f30624g;
    }

    /* renamed from: m */
    public final int mo18025m() {
        if (!mo18011a()) {
            return this.f30621d.length;
        }
        bxce bxce = this.f30620b;
        int i = bxce.f164961ai;
        if (i != -1) {
            return i;
        }
        int b = bxxm.f165037a.mo74228a(bxce).mo74223b(bxce);
        bxce.f164961ai = b;
        return b;
    }

    public final String toString() {
        m22844n();
        return f30619c == null ? this.f30620b.toString() : Base64.encodeToString(this.f30620b.mo73642k(), 2);
    }

    /* renamed from: a */
    public static byte[] m22843a(bxce bxce) {
        if ((bxce.f162768a & 64) == 0) {
            return null;
        }
        bxcf bxcf = bxce.f162775h;
        if (bxcf == null) {
            bxcf = bxcf.f162779a;
        }
        byte[] k = bxcf.mo73642k();
        if (k.length == 0) {
            return k;
        }
        bxuc a = bxuc.m123419a(k);
        try {
            a.mo73786a();
            return a.mo73795e(a.mo73811t());
        } catch (IOException e) {
            Log.e("ContextData", "Could not read extension.", e);
            return null;
        }
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35052a(parcel, 2, mo18012b(), false);
        see.m35062b(parcel, a);
    }

    public ContextData(byte[] bArr) {
        this.f30620b = null;
        this.f30621d = (byte[]) sdo.m34959a(bArr);
        m22845o();
    }

    /* renamed from: a */
    public final Object mo18009a(bxuq bxuq) {
        m22844n();
        bxcf bxcf = this.f30620b.f162775h;
        if (bxcf == null) {
            bxcf = bxcf.f162779a;
        }
        bxvj bxvj = (bxvj) bxuq;
        bxcf.mo74135a(bxvj);
        if (!bxcf.f164952m.mo73911a(bxvj.f164958d)) {
            return null;
        }
        bxcf bxcf2 = this.f30620b.f162775h;
        if (bxcf2 == null) {
            bxcf2 = bxcf.f162779a;
        }
        bxcf2.mo74135a(bxvj);
        Object b = bxcf2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            return bxvj.f164956b;
        }
        bxvj.mo74139a(b);
        return b;
    }

    /* renamed from: a */
    public final void mo18010a(String str, String str2) {
        m22844n();
        bxce bxce = this.f30620b;
        bxvd bxvd = (bxvd) bxce.mo74142c(5);
        bxvd.mo73625a((bxvk) bxce);
        bxcp bxcp = this.f30620b.f162770c;
        if (bxcp == null) {
            bxcp = bxcp.f162974g;
        }
        bxvd bxvd2 = (bxvd) bxcp.mo74142c(5);
        bxvd2.mo73625a((bxvk) bxcp);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bxcp bxcp2 = (bxcp) bxvd2.f164949b;
        str.getClass();
        int i = bxcp2.f162976a | 16;
        bxcp2.f162976a = i;
        bxcp2.f162981f = str;
        str2.getClass();
        bxcp2.f162976a = i | 8;
        bxcp2.f162980e = str2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxce bxce2 = (bxce) bxvd.f164949b;
        bxcp bxcp3 = (bxcp) bxvd2.mo74062i();
        bxce bxce3 = bxce.f162766k;
        bxcp3.getClass();
        bxce2.f162770c = bxcp3;
        bxce2.f162768a |= 2;
        this.f30620b = (bxce) bxvd.mo74062i();
        bxcp bxcp4 = this.f30620b.f162770c;
        if (bxcp4 == null) {
            bxcp4 = bxcp.f162974g;
        }
        this.f30622e = new tjl(bxcp4);
    }
}
