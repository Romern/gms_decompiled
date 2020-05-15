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
public class PostSetupAuthData extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new arsh();

    /* renamed from: d */
    private static final HashMap f108104d;

    /* renamed from: a */
    public final Set f108105a;

    /* renamed from: b */
    public byte[] f108106b;

    /* renamed from: c */
    public HandshakeData f108107c;

    static {
        HashMap hashMap = new HashMap();
        f108104d = hashMap;
        hashMap.put("key", FastJsonResponse$Field.m22669h("key", 2));
        f108104d.put("handshake", FastJsonResponse$Field.m22653a("handshake", 3, HandshakeData.class));
    }

    public PostSetupAuthData() {
        this.f108105a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f108104d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f108106b;
        }
        if (i == 3) {
            return this.f108107c;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public PostSetupAuthData(Set set, byte[] bArr, HandshakeData handshakeData) {
        this.f108105a = set;
        this.f108106b = bArr;
        this.f108107c = handshakeData;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f108107c = (HandshakeData) sio;
            this.f108105a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), sio.getClass().getCanonicalName()));
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
        Set set = this.f108105a;
        if (set.contains(2)) {
            see.m35052a(parcel, 2, this.f108106b, true);
        }
        if (set.contains(3)) {
            see.m35040a(parcel, 3, this.f108107c, i, true);
        }
        see.m35062b(parcel, a);
    }

    public PostSetupAuthData(byte[] bArr) {
        this();
        this.f108106b = bArr;
        this.f108105a.add(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7392a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f108106b = bArr;
            this.f108105a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an byte array.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f108105a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
