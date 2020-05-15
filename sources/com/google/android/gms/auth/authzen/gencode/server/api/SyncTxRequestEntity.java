package com.google.android.gms.auth.authzen.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SyncTxRequestEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new ihw();

    /* renamed from: f */
    private static final HashMap f10450f;

    /* renamed from: a */
    final Set f10451a;

    /* renamed from: b */
    String f10452b;

    /* renamed from: c */
    String f10453c;

    /* renamed from: d */
    String f10454d;

    /* renamed from: e */
    List f10455e;

    static {
        HashMap hashMap = new HashMap();
        f10450f = hashMap;
        hashMap.put("accountName", FastJsonResponse$Field.m22666f("accountName", 2));
        f10450f.put("deviceId", FastJsonResponse$Field.m22666f("deviceId", 3));
        f10450f.put("secureSyncRequest", FastJsonResponse$Field.m22666f("secureSyncRequest", 4));
        f10450f.put("seenWebViewPromptTxIds", FastJsonResponse$Field.m22668g("seenWebViewPromptTxIds", 5));
    }

    public SyncTxRequestEntity() {
        this.f10451a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f10450f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f10452b;
        }
        if (i == 3) {
            return this.f10453c;
        }
        if (i == 4) {
            return this.f10454d;
        }
        if (i == 5) {
            return this.f10455e;
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
        if (!(obj instanceof SyncTxRequestEntity)) {
            return false;
        }
        if (this != obj) {
            SyncTxRequestEntity syncTxRequestEntity = (SyncTxRequestEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f10450f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!syncTxRequestEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(syncTxRequestEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (syncTxRequestEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f10450f.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public SyncTxRequestEntity(Set set, String str, String str2, String str3, List list) {
        this.f10451a = set;
        this.f10452b = str;
        this.f10453c = str2;
        this.f10454d = str3;
        this.f10455e = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f10452b = str2;
        } else if (i == 3) {
            this.f10453c = str2;
        } else if (i == 4) {
            this.f10454d = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f10451a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f10455e = arrayList;
            this.f10451a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an array of String.");
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f10451a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f10452b, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f10453c, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f10454d, true);
        }
        if (set.contains(5)) {
            see.m35065b(parcel, 5, this.f10455e, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10451a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
