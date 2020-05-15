package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ClientOzEventEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new aogo();

    /* renamed from: f */
    private static final HashMap f82887f;

    /* renamed from: a */
    final Set f82888a;

    /* renamed from: b */
    final int f82889b;

    /* renamed from: c */
    ClientActionDataEntity f82890c;

    /* renamed from: d */
    public long f82891d;

    /* renamed from: e */
    OzEventEntity f82892e;

    static {
        HashMap hashMap = new HashMap();
        f82887f = hashMap;
        hashMap.put("actionData", FastJsonResponse$Field.m22653a("actionData", 2, ClientActionDataEntity.class));
        f82887f.put("clientTimeMsec", FastJsonResponse$Field.m22656b("clientTimeMsec", 3));
        f82887f.put("ozEvent", FastJsonResponse$Field.m22653a("ozEvent", 5, OzEventEntity.class));
    }

    public ClientOzEventEntity() {
        this.f82889b = 1;
        this.f82888a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82887f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82890c;
        }
        if (i == 3) {
            return Long.valueOf(this.f82891d);
        }
        if (i == 5) {
            return this.f82892e;
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
        if (!(obj instanceof ClientOzEventEntity)) {
            return false;
        }
        if (this != obj) {
            ClientOzEventEntity clientOzEventEntity = (ClientOzEventEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82887f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!clientOzEventEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(clientOzEventEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientOzEventEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82887f.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82891d = j;
            this.f82888a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a long.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f82888a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82889b);
        }
        if (set.contains(2)) {
            see.m35040a(parcel, 2, this.f82890c, i, true);
        }
        if (set.contains(3)) {
            see.m35036a(parcel, 3, this.f82891d);
        }
        if (set.contains(5)) {
            see.m35040a(parcel, 5, this.f82892e, i, true);
        }
        see.m35062b(parcel, a);
    }

    public ClientOzEventEntity(Set set, int i, ClientActionDataEntity clientActionDataEntity, long j, OzEventEntity ozEventEntity) {
        this.f82888a = set;
        this.f82889b = i;
        this.f82890c = clientActionDataEntity;
        this.f82891d = j;
        this.f82892e = ozEventEntity;
    }

    public ClientOzEventEntity(Set set, ClientActionDataEntity clientActionDataEntity, long j, OzEventEntity ozEventEntity) {
        this.f82888a = set;
        this.f82889b = 1;
        this.f82890c = clientActionDataEntity;
        this.f82891d = j;
        this.f82892e = ozEventEntity;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82890c = (ClientActionDataEntity) sio;
        } else if (i == 5) {
            this.f82892e = (OzEventEntity) sio;
        } else {
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82888a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82888a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
