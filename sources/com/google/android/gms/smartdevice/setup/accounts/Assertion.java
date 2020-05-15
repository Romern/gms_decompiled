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
public class Assertion extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new arud();

    /* renamed from: h */
    private static final HashMap f108111h;

    /* renamed from: a */
    final Set f108112a;

    /* renamed from: b */
    public String f108113b;

    /* renamed from: c */
    public byte[] f108114c;

    /* renamed from: d */
    public byte[] f108115d;

    /* renamed from: e */
    public byte[] f108116e;

    /* renamed from: f */
    public byte[] f108117f;

    /* renamed from: g */
    public int f108118g;

    static {
        HashMap hashMap = new HashMap();
        f108111h = hashMap;
        hashMap.put("accountIdentifier", FastJsonResponse$Field.m22666f("accountIdentifier", 2));
        f108111h.put("clientData", FastJsonResponse$Field.m22669h("clientData", 3));
        f108111h.put("encryptedUserAssertion", FastJsonResponse$Field.m22669h("encryptedUserAssertion", 4));
        f108111h.put("challengeSessionState", FastJsonResponse$Field.m22669h("challengeSessionState", 5));
        f108111h.put("challenge", FastJsonResponse$Field.m22669h("challenge", 6));
        f108111h.put("assertionType", FastJsonResponse$Field.m22651a("assertionType", 7));
    }

    public Assertion() {
        this.f108112a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f108111h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f108113b;
            case 3:
                return this.f108114c;
            case 4:
                return this.f108115d;
            case 5:
                return this.f108116e;
            case 6:
                return this.f108117f;
            case 7:
                return Integer.valueOf(this.f108118g);
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 7) {
            this.f108118g = i;
            this.f108112a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
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
        Set set = this.f108112a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f108113b, true);
        }
        if (set.contains(3)) {
            see.m35052a(parcel, 3, this.f108114c, true);
        }
        if (set.contains(4)) {
            see.m35052a(parcel, 4, this.f108115d, true);
        }
        if (set.contains(5)) {
            see.m35052a(parcel, 5, this.f108116e, true);
        }
        if (set.contains(6)) {
            see.m35052a(parcel, 6, this.f108117f, true);
        }
        if (set.contains(7)) {
            see.m35063b(parcel, 7, this.f108118g);
        }
        see.m35062b(parcel, a);
    }

    public Assertion(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        HashSet hashSet = new HashSet();
        this.f108112a = hashSet;
        this.f108113b = str;
        hashSet.add(2);
        this.f108114c = bArr;
        this.f108112a.add(3);
        this.f108115d = bArr2;
        this.f108112a.add(4);
        this.f108116e = bArr3;
        this.f108112a.add(5);
        this.f108117f = bArr4;
        this.f108112a.add(6);
        this.f108118g = 1;
        this.f108112a.add(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f108113b = str2;
            this.f108112a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7392a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f108114c = bArr;
        } else if (i == 4) {
            this.f108115d = bArr;
        } else if (i == 5) {
            this.f108116e = bArr;
        } else if (i == 6) {
            this.f108117f = bArr;
        } else {
            StringBuilder sb = new StringBuilder(59);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an byte array.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f108112a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f108112a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }

    public Assertion(Set set, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) {
        this.f108112a = set;
        this.f108113b = str;
        this.f108114c = bArr;
        this.f108115d = bArr2;
        this.f108116e = bArr3;
        this.f108117f = bArr4;
        this.f108118g = i;
    }
}
