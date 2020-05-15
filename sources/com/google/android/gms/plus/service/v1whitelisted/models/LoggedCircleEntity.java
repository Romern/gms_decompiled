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
public final class LoggedCircleEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new aohf();

    /* renamed from: c */
    private static final HashMap f82950c = new HashMap();

    /* renamed from: a */
    final Set f82951a;

    /* renamed from: b */
    final int f82952b;

    public LoggedCircleEntity() {
        this.f82952b = 1;
        this.f82951a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82950c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
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
        if (!(obj instanceof LoggedCircleEntity)) {
            return false;
        }
        if (this != obj) {
            LoggedCircleEntity loggedCircleEntity = (LoggedCircleEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82950c.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!loggedCircleEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(loggedCircleEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (loggedCircleEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82950c.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82951a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        if (this.f82951a.contains(1)) {
            see.m35063b(parcel, 1, this.f82952b);
        }
        see.m35062b(parcel, a);
    }

    public LoggedCircleEntity(Set set, int i) {
        this.f82951a = set;
        this.f82952b = i;
    }
}
