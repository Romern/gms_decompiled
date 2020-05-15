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
public final class FavaDiagnosticsEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new aoha();

    /* renamed from: g */
    private static final HashMap f82933g;

    /* renamed from: a */
    final Set f82934a;

    /* renamed from: b */
    final int f82935b;

    /* renamed from: c */
    FavaDiagnosticsNamespacedTypeEntity f82936c;

    /* renamed from: d */
    FavaDiagnosticsNamespacedTypeEntity f82937d;

    /* renamed from: e */
    FavaDiagnosticsNamespacedTypeEntity f82938e;

    /* renamed from: f */
    int f82939f;

    static {
        HashMap hashMap = new HashMap();
        f82933g = hashMap;
        hashMap.put("actionType", FastJsonResponse$Field.m22653a("actionType", 3, FavaDiagnosticsNamespacedTypeEntity.class));
        f82933g.put("endView", FastJsonResponse$Field.m22653a("endView", 4, FavaDiagnosticsNamespacedTypeEntity.class));
        f82933g.put("startView", FastJsonResponse$Field.m22653a("startView", 20, FavaDiagnosticsNamespacedTypeEntity.class));
        f82933g.put("totalTimeMs", FastJsonResponse$Field.m22651a("totalTimeMs", 24));
    }

    public FavaDiagnosticsEntity() {
        this.f82935b = 1;
        this.f82934a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82933g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            return this.f82936c;
        }
        if (i == 4) {
            return this.f82937d;
        }
        if (i == 20) {
            return this.f82938e;
        }
        if (i == 24) {
            return Integer.valueOf(this.f82939f);
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
        if (!(obj instanceof FavaDiagnosticsEntity)) {
            return false;
        }
        if (this != obj) {
            FavaDiagnosticsEntity favaDiagnosticsEntity = (FavaDiagnosticsEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82933g.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!favaDiagnosticsEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(favaDiagnosticsEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (favaDiagnosticsEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82933g.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 24) {
            this.f82939f = i;
            this.f82934a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f82934a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82935b);
        }
        if (set.contains(3)) {
            see.m35040a(parcel, 3, this.f82936c, i, true);
        }
        if (set.contains(4)) {
            see.m35040a(parcel, 4, this.f82937d, i, true);
        }
        if (set.contains(20)) {
            see.m35040a(parcel, 20, this.f82938e, i, true);
        }
        if (set.contains(24)) {
            see.m35063b(parcel, 24, this.f82939f);
        }
        see.m35062b(parcel, a);
    }

    public FavaDiagnosticsEntity(Set set, int i, FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity, FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity2, FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity3, int i2) {
        this.f82934a = set;
        this.f82935b = i;
        this.f82936c = favaDiagnosticsNamespacedTypeEntity;
        this.f82937d = favaDiagnosticsNamespacedTypeEntity2;
        this.f82938e = favaDiagnosticsNamespacedTypeEntity3;
        this.f82939f = i2;
    }

    public FavaDiagnosticsEntity(Set set, FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity, FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity2, FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity3, int i) {
        this.f82934a = set;
        this.f82935b = 1;
        this.f82936c = favaDiagnosticsNamespacedTypeEntity;
        this.f82937d = favaDiagnosticsNamespacedTypeEntity2;
        this.f82938e = favaDiagnosticsNamespacedTypeEntity3;
        this.f82939f = i;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82936c = (FavaDiagnosticsNamespacedTypeEntity) sio;
        } else if (i == 4) {
            this.f82937d = (FavaDiagnosticsNamespacedTypeEntity) sio;
        } else if (i == 20) {
            this.f82938e = (FavaDiagnosticsNamespacedTypeEntity) sio;
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
        this.f82934a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82934a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
