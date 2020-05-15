package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ClientActionDataEntity extends FastSafeParcelableJsonResponse implements ReflectedParcelable, aofz {
    public static final Parcelable.Creator CREATOR = new aoga();

    /* renamed from: h */
    private static final HashMap f82861h;

    /* renamed from: a */
    final Set f82862a;

    /* renamed from: b */
    final int f82863b;

    /* renamed from: c */
    ClientAclDetailsEntity f82864c;

    /* renamed from: d */
    List f82865d;

    /* renamed from: e */
    List f82866e;

    /* renamed from: f */
    List f82867f;

    /* renamed from: g */
    ClientLoggedRhsComponentEntity f82868g;

    static {
        HashMap hashMap = new HashMap();
        f82861h = hashMap;
        hashMap.put("aclDetails", FastJsonResponse$Field.m22653a("aclDetails", 2, ClientAclDetailsEntity.class));
        f82861h.put("circle", FastJsonResponse$Field.m22657b("circle", 7, ClientLoggedCircleEntity.class));
        f82861h.put("circleMember", FastJsonResponse$Field.m22657b("circleMember", 8, ClientLoggedCircleMemberEntity.class));
        f82861h.put("obfuscatedGaiaId", FastJsonResponse$Field.m22668g("obfuscatedGaiaId", 13));
        f82861h.put("rhsComponent", FastJsonResponse$Field.m22653a("rhsComponent", 20, ClientLoggedRhsComponentEntity.class));
    }

    public ClientActionDataEntity() {
        this.f82863b = 1;
        this.f82862a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82861h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82864c;
        }
        if (i == 13) {
            return this.f82867f;
        }
        if (i == 20) {
            return this.f82868g;
        }
        if (i == 7) {
            return this.f82865d;
        }
        if (i == 8) {
            return this.f82866e;
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
        if (!(obj instanceof ClientActionDataEntity)) {
            return false;
        }
        if (this != obj) {
            ClientActionDataEntity clientActionDataEntity = (ClientActionDataEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82861h.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!clientActionDataEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(clientActionDataEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientActionDataEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82861h.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 7) {
            this.f82865d = arrayList;
        } else if (i == 8) {
            this.f82866e = arrayList;
        } else {
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known array of custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82862a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 13) {
            this.f82867f = arrayList;
            this.f82862a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an array of String.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f82862a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82863b);
        }
        if (set.contains(2)) {
            see.m35040a(parcel, 2, this.f82864c, i, true);
        }
        if (set.contains(7)) {
            see.m35066c(parcel, 7, this.f82865d, true);
        }
        if (set.contains(8)) {
            see.m35066c(parcel, 8, this.f82866e, true);
        }
        if (set.contains(13)) {
            see.m35065b(parcel, 13, this.f82867f, true);
        }
        if (set.contains(20)) {
            see.m35040a(parcel, 20, this.f82868g, i, true);
        }
        see.m35062b(parcel, a);
    }

    public ClientActionDataEntity(Set set, int i, ClientAclDetailsEntity clientAclDetailsEntity, List list, List list2, List list3, ClientLoggedRhsComponentEntity clientLoggedRhsComponentEntity) {
        this.f82862a = set;
        this.f82863b = i;
        this.f82864c = clientAclDetailsEntity;
        this.f82865d = list;
        this.f82866e = list2;
        this.f82867f = list3;
        this.f82868g = clientLoggedRhsComponentEntity;
    }

    public ClientActionDataEntity(Set set, ClientAclDetailsEntity clientAclDetailsEntity, List list, List list2, ClientLoggedRhsComponentEntity clientLoggedRhsComponentEntity) {
        this.f82862a = set;
        this.f82863b = 1;
        this.f82864c = clientAclDetailsEntity;
        this.f82865d = list;
        this.f82866e = list2;
        this.f82867f = null;
        this.f82868g = clientLoggedRhsComponentEntity;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82864c = (ClientAclDetailsEntity) sio;
        } else if (i == 20) {
            this.f82868g = (ClientLoggedRhsComponentEntity) sio;
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
        this.f82862a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82862a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
