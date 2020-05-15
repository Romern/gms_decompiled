package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceAuthInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new gue();

    /* renamed from: e */
    private static final HashMap f10067e;

    /* renamed from: a */
    final Set f10068a;

    /* renamed from: b */
    final int f10069b;

    /* renamed from: c */
    public boolean f10070c;

    /* renamed from: d */
    public long f10071d;

    static {
        HashMap hashMap = new HashMap();
        f10067e = hashMap;
        hashMap.put("solved", FastJsonResponse$Field.m22664e("solved", 2));
        f10067e.put("age", FastJsonResponse$Field.m22656b("age", 3));
    }

    public DeviceAuthInfo() {
        this.f10068a = new HashSet(1);
        this.f10069b = 1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f10067e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 1) {
            return Integer.valueOf(this.f10069b);
        }
        if (i == 2) {
            return Boolean.valueOf(this.f10070c);
        }
        if (i == 3) {
            return Long.valueOf(this.f10071d);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public DeviceAuthInfo(Set set, int i, boolean z, long j) {
        this.f10068a = set;
        this.f10069b = i;
        this.f10070c = z;
        this.f10071d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f10071d = j;
            this.f10068a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f10068a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f10069b);
        }
        if (set.contains(2)) {
            see.m35051a(parcel, 2, this.f10070c);
        }
        if (set.contains(3)) {
            see.m35036a(parcel, 3, this.f10071d);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f10070c = z;
            this.f10068a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10068a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
