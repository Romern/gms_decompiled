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
public class AdvertisementOptions extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aqxr();

    /* renamed from: c */
    private static final Map f107790c;

    /* renamed from: a */
    final Set f107791a;

    /* renamed from: b */
    public int f107792b;

    static {
        C1223np npVar = new C1223np();
        npVar.put("verificationStyle", FastJsonResponse$Field.m22651a("verificationStyle", 1));
        f107790c = Collections.unmodifiableMap(npVar);
    }

    public AdvertisementOptions() {
        this.f107791a = new HashSet();
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f107790c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 1) {
            return Integer.valueOf(this.f107792b);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 1) {
            this.f107792b = i;
            this.f107791a.add(Integer.valueOf(i2));
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
        if (this.f107791a.contains(1)) {
            see.m35063b(parcel, 1, this.f107792b);
        }
        see.m35062b(parcel, a);
    }

    public AdvertisementOptions(int i) {
        HashSet hashSet = new HashSet();
        this.f107791a = hashSet;
        this.f107792b = i;
        hashSet.add(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107791a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }

    public AdvertisementOptions(Set set, int i) {
        this.f107791a = set;
        this.f107792b = i;
    }
}
