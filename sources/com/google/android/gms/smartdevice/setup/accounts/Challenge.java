package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Challenge extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new arue();

    /* renamed from: g */
    private static final HashMap f108119g;

    /* renamed from: a */
    final Set f108120a;

    /* renamed from: b */
    public int f108121b;

    /* renamed from: c */
    public String f108122c;

    /* renamed from: d */
    public String f108123d;

    /* renamed from: e */
    public byte[] f108124e;

    /* renamed from: f */
    public byte[] f108125f;

    static {
        HashMap hashMap = new HashMap();
        f108119g = hashMap;
        hashMap.put("status", FastJsonResponse$Field.m22651a("status", 2));
        f108119g.put("accountIdentifier", FastJsonResponse$Field.m22666f("accountIdentifier", 3));
        f108119g.put("reason", FastJsonResponse$Field.m22666f("reason", 4));
        f108119g.put("challenge", FastJsonResponse$Field.m22669h("challenge", 5));
        f108119g.put("challengeSessionState", FastJsonResponse$Field.m22669h("challengeSessionState", 6));
    }

    public Challenge() {
        this.f108120a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f108119g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return Integer.valueOf(this.f108121b);
        }
        if (i == 3) {
            return this.f108122c;
        }
        if (i == 4) {
            return this.f108123d;
        }
        if (i == 5) {
            return this.f108124e;
        }
        if (i == 6) {
            return this.f108125f;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public final void mo59149c(byte[] bArr) {
        this.f108124e = bArr;
        this.f108120a.add(5);
    }

    /* renamed from: d */
    public final void mo59150d(byte[] bArr) {
        this.f108125f = bArr;
        this.f108120a.add(6);
    }

    /* renamed from: e */
    public final void mo59151e(String str) {
        this.f108122c = str;
        this.f108120a.add(3);
    }

    public Challenge(int i, String str, String str2, byte[] bArr, byte[] bArr2) {
        this();
        mo59148a(i);
        mo59151e(str);
        this.f108123d = str2;
        this.f108120a.add(4);
        mo59149c(bArr);
        mo59150d(bArr2);
    }

    /* renamed from: a */
    public final void mo59148a(int i) {
        this.f108121b = i;
        this.f108120a.add(2);
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
        Set set = this.f108120a;
        if (set.contains(2)) {
            see.m35063b(parcel, 2, this.f108121b);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f108122c, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f108123d, true);
        }
        if (set.contains(5)) {
            see.m35052a(parcel, 5, this.f108124e, true);
        }
        if (set.contains(6)) {
            see.m35052a(parcel, 6, this.f108125f, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 2) {
            this.f108121b = i;
            this.f108120a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    public Challenge(Set set, int i, String str, String str2, byte[] bArr, byte[] bArr2) {
        this.f108120a = set;
        this.f108121b = i;
        this.f108122c = str;
        this.f108123d = str2;
        this.f108124e = bArr;
        this.f108125f = bArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f108122c = str2;
        } else if (i == 4) {
            this.f108123d = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f108120a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7392a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f108124e = bArr;
        } else if (i == 6) {
            this.f108125f = bArr;
        } else {
            StringBuilder sb = new StringBuilder(59);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an byte array.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f108120a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f108120a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
