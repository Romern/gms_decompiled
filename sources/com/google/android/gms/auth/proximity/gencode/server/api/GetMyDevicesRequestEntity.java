package com.google.android.gms.auth.proximity.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetMyDevicesRequestEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new jrq();

    /* renamed from: g */
    private static final HashMap f11231g;

    /* renamed from: a */
    final Set f11232a;

    /* renamed from: b */
    boolean f11233b;

    /* renamed from: c */
    boolean f11234c;

    /* renamed from: d */
    DeviceClassifierEntity f11235d;

    /* renamed from: e */
    int f11236e;

    /* renamed from: f */
    int f11237f;

    static {
        HashMap hashMap = new HashMap();
        f11231g = hashMap;
        hashMap.put("allowStaleRead", FastJsonResponse$Field.m22664e("allowStaleRead", 2));
        f11231g.put("approvedForUnlockRequired", FastJsonResponse$Field.m22664e("approvedForUnlockRequired", 3));
        f11231g.put("deviceClassifier", FastJsonResponse$Field.m22653a("deviceClassifier", 4, DeviceClassifierEntity.class));
        f11231g.put("invocationReason", FastJsonResponse$Field.m22651a("invocationReason", 5));
        f11231g.put("retryCount", FastJsonResponse$Field.m22651a("retryCount", 6));
    }

    public GetMyDevicesRequestEntity() {
        this.f11232a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f11231g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return Boolean.valueOf(this.f11233b);
        }
        if (i == 3) {
            return Boolean.valueOf(this.f11234c);
        }
        if (i == 4) {
            return this.f11235d;
        }
        if (i == 5) {
            return Integer.valueOf(this.f11236e);
        }
        if (i == 6) {
            return Integer.valueOf(this.f11237f);
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
        if (!(obj instanceof GetMyDevicesRequestEntity)) {
            return false;
        }
        if (this != obj) {
            GetMyDevicesRequestEntity getMyDevicesRequestEntity = (GetMyDevicesRequestEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f11231g.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!getMyDevicesRequestEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(getMyDevicesRequestEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (getMyDevicesRequestEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f11231g.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public GetMyDevicesRequestEntity(Set set, boolean z, boolean z2, DeviceClassifierEntity deviceClassifierEntity, int i, int i2) {
        this.f11232a = set;
        this.f11233b = z;
        this.f11234c = z2;
        this.f11235d = deviceClassifierEntity;
        this.f11236e = i;
        this.f11237f = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 5) {
            this.f11236e = i;
        } else if (i2 == 6) {
            this.f11237f = i;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f11232a.add(Integer.valueOf(i2));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f11232a;
        if (set.contains(2)) {
            see.m35051a(parcel, 2, this.f11233b);
        }
        if (set.contains(3)) {
            see.m35051a(parcel, 3, this.f11234c);
        }
        if (set.contains(4)) {
            see.m35040a(parcel, 4, this.f11235d, i, true);
        }
        if (set.contains(5)) {
            see.m35063b(parcel, 5, this.f11236e);
        }
        if (set.contains(6)) {
            see.m35063b(parcel, 6, this.f11237f);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f11235d = (DeviceClassifierEntity) sio;
            this.f11232a.add(Integer.valueOf(i));
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

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f11233b = z;
        } else if (i == 3) {
            this.f11234c = z;
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f11232a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f11232a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
