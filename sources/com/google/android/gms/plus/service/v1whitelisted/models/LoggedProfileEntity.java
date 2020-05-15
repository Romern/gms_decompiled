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
public final class LoggedProfileEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new aohi();

    /* renamed from: d */
    private static final HashMap f82963d;

    /* renamed from: a */
    final Set f82964a;

    /* renamed from: b */
    final int f82965b;

    /* renamed from: c */
    LoggedContactDataEntity f82966c;

    static {
        HashMap hashMap = new HashMap();
        f82963d = hashMap;
        hashMap.put("contactData", FastJsonResponse$Field.m22653a("contactData", 3, LoggedContactDataEntity.class));
    }

    public LoggedProfileEntity() {
        this.f82965b = 1;
        this.f82964a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82963d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            return this.f82966c;
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
        if (!(obj instanceof LoggedProfileEntity)) {
            return false;
        }
        if (this != obj) {
            LoggedProfileEntity loggedProfileEntity = (LoggedProfileEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82963d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!loggedProfileEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(loggedProfileEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (loggedProfileEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82963d.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82966c = (LoggedContactDataEntity) sio;
            this.f82964a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = sio.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f82964a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82965b);
        }
        if (set.contains(3)) {
            see.m35040a(parcel, 3, this.f82966c, i, true);
        }
        see.m35062b(parcel, a);
    }

    public LoggedProfileEntity(Set set, int i, LoggedContactDataEntity loggedContactDataEntity) {
        this.f82964a = set;
        this.f82965b = i;
        this.f82966c = loggedContactDataEntity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82964a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
