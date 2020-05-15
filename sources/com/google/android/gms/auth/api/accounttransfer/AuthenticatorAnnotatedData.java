package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthenticatorAnnotatedData extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new gtw();

    /* renamed from: g */
    private static final HashMap f10052g;

    /* renamed from: a */
    final Set f10053a;

    /* renamed from: b */
    final int f10054b;

    /* renamed from: c */
    public AuthenticatorTransferInfo f10055c;

    /* renamed from: d */
    public String f10056d;

    /* renamed from: e */
    public String f10057e;

    /* renamed from: f */
    public String f10058f;

    static {
        HashMap hashMap = new HashMap();
        f10052g = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse$Field.m22653a("authenticatorInfo", 2, AuthenticatorTransferInfo.class));
        f10052g.put("signature", FastJsonResponse$Field.m22666f("signature", 3));
        f10052g.put("package", FastJsonResponse$Field.m22666f("package", 4));
    }

    public AuthenticatorAnnotatedData() {
        this.f10053a = new HashSet(3);
        this.f10054b = 1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f10052g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 1) {
            return Integer.valueOf(this.f10054b);
        }
        if (i == 2) {
            return this.f10055c;
        }
        if (i == 3) {
            return this.f10056d;
        }
        if (i == 4) {
            return this.f10057e;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public AuthenticatorAnnotatedData(AuthenticatorTransferInfo authenticatorTransferInfo, String str, String str2, String str3) {
        this(new HashSet(), 1, authenticatorTransferInfo, str, str2, str3);
        this.f10053a.add(2);
        this.f10053a.add(3);
        this.f10053a.add(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f10056d = str2;
        } else if (i == 4) {
            this.f10057e = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f10053a.add(Integer.valueOf(i));
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
        Set set = this.f10053a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f10054b);
        }
        if (set.contains(2)) {
            see.m35040a(parcel, 2, this.f10055c, i, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f10056d, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f10057e, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f10058f, true);
        }
        see.m35062b(parcel, a);
    }

    public AuthenticatorAnnotatedData(Set set, int i, AuthenticatorTransferInfo authenticatorTransferInfo, String str, String str2, String str3) {
        this.f10053a = set;
        this.f10054b = i;
        this.f10055c = authenticatorTransferInfo;
        this.f10056d = str;
        this.f10057e = str2;
        this.f10058f = str3;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f10055c = (AuthenticatorTransferInfo) sio;
            this.f10053a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), sio.getClass().getCanonicalName()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10053a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
