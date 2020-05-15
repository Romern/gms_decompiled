package com.google.android.gms.smartdevice.postsetup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HandshakeData extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new arsg();

    /* renamed from: d */
    private static final HashMap f108099d;

    /* renamed from: a */
    final Set f108100a;

    /* renamed from: b */
    public byte[] f108101b;

    /* renamed from: c */
    public byte[] f108102c;

    static {
        HashMap hashMap = new HashMap();
        f108099d = hashMap;
        hashMap.put("message", FastJsonResponse$Field.m22669h("message", 2));
        f108099d.put("hmac", FastJsonResponse$Field.m22669h("hmac", 3));
    }

    public HandshakeData() {
        this.f108100a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f108099d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f108101b;
        }
        if (i == 3) {
            return this.f108102c;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public final void mo59144c(byte[] bArr) {
        this.f108101b = bArr;
        this.f108100a.add(2);
    }

    public HandshakeData(Set set, byte[] bArr, byte[] bArr2) {
        this.f108100a = set;
        this.f108101b = bArr;
        this.f108102c = bArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7392a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f108101b = bArr;
        } else if (i == 3) {
            this.f108102c = bArr;
        } else {
            StringBuilder sb = new StringBuilder(59);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an byte array.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f108100a.add(Integer.valueOf(i));
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
        Set set = this.f108100a;
        if (set.contains(2)) {
            see.m35052a(parcel, 2, this.f108101b, true);
        }
        if (set.contains(3)) {
            see.m35052a(parcel, 3, this.f108102c, true);
        }
        see.m35062b(parcel, a);
    }

    public HandshakeData(byte[] bArr) {
        this();
        mo59144c(bArr);
    }

    public HandshakeData(byte[] bArr, byte[] bArr2) {
        this();
        mo59144c(bArr);
        this.f108102c = bArr2;
        this.f108100a.add(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f108100a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
