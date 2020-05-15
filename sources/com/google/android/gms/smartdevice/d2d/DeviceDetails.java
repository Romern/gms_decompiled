package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceDetails extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aqzn();

    /* renamed from: e */
    private static final Map f107880e;

    /* renamed from: a */
    final Set f107881a;

    /* renamed from: b */
    public long f107882b;

    /* renamed from: c */
    public int f107883c;

    /* renamed from: d */
    public boolean f107884d;

    static {
        C1223np npVar = new C1223np();
        npVar.put("androidId", FastJsonResponse$Field.m22656b("androidId", 2));
        npVar.put("gmsVersion", FastJsonResponse$Field.m22651a("gmsVersion", 3));
        npVar.put("isSourceIos", FastJsonResponse$Field.m22664e("isSourceIos", 4));
        f107880e = Collections.unmodifiableMap(npVar);
    }

    public DeviceDetails() {
        this.f107881a = new HashSet();
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f107880e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return Long.valueOf(this.f107882b);
        }
        if (i == 3) {
            return Integer.valueOf(this.f107883c);
        }
        if (i == 4) {
            return Boolean.valueOf(this.f107884d);
        }
        throw new IllegalArgumentException();
    }

    public DeviceDetails(long j, int i) {
        HashSet hashSet = new HashSet();
        this.f107881a = hashSet;
        this.f107882b = j;
        hashSet.add(2);
        this.f107883c = i;
        this.f107881a.add(3);
        this.f107884d = false;
        this.f107881a.add(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 3) {
            this.f107883c = i;
            this.f107881a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid id %s", Integer.valueOf(i2)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f107881a;
        if (set.contains(2)) {
            see.m35036a(parcel, 2, this.f107882b);
        }
        if (set.contains(3)) {
            see.m35063b(parcel, 3, this.f107883c);
        }
        if (set.contains(4)) {
            see.m35051a(parcel, 4, this.f107884d);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f107882b = j;
            this.f107881a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid id %s", Integer.valueOf(i)));
    }

    public DeviceDetails(Set set, long j, int i, boolean z) {
        this.f107881a = set;
        this.f107882b = j;
        this.f107883c = i;
        this.f107884d = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f107884d = z;
            this.f107881a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid id %s", Integer.valueOf(i)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107881a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
