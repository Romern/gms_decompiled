package com.google.android.gms.auth.authzen.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SyncTxResponseWebViewPromptEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new ihy();

    /* renamed from: e */
    private static final HashMap f10460e;

    /* renamed from: a */
    final Set f10461a;

    /* renamed from: b */
    String f10462b;

    /* renamed from: c */
    String f10463c;

    /* renamed from: d */
    String f10464d;

    static {
        HashMap hashMap = new HashMap();
        f10460e = hashMap;
        hashMap.put("timeUntilExpirationMillis", FastJsonResponse$Field.m22666f("timeUntilExpirationMillis", 2));
        f10460e.put("url", FastJsonResponse$Field.m22666f("url", 3));
        f10460e.put("webViewPromptTxId", FastJsonResponse$Field.m22666f("webViewPromptTxId", 4));
    }

    public SyncTxResponseWebViewPromptEntity() {
        this.f10461a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f10460e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f10462b;
        }
        if (i == 3) {
            return this.f10463c;
        }
        if (i == 4) {
            return this.f10464d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SyncTxResponseWebViewPromptEntity)) {
            return false;
        }
        if (this != obj) {
            SyncTxResponseWebViewPromptEntity syncTxResponseWebViewPromptEntity = (SyncTxResponseWebViewPromptEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f10460e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!syncTxResponseWebViewPromptEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(syncTxResponseWebViewPromptEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (syncTxResponseWebViewPromptEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f10460e.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public SyncTxResponseWebViewPromptEntity(Set set, String str, String str2, String str3) {
        this.f10461a = set;
        this.f10462b = str;
        this.f10463c = str2;
        this.f10464d = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f10462b = str2;
        } else if (i == 3) {
            this.f10463c = str2;
        } else if (i == 4) {
            this.f10464d = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f10461a.add(Integer.valueOf(i));
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
        Set set = this.f10461a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f10462b, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f10463c, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f10464d, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10461a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
