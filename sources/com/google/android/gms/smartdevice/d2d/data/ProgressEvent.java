package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProgressEvent extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new arhl();

    /* renamed from: c */
    private static final HashMap f107991c;

    /* renamed from: a */
    final Set f107992a;

    /* renamed from: b */
    public int f107993b;

    static {
        HashMap hashMap = new HashMap();
        f107991c = hashMap;
        hashMap.put("progressType", FastJsonResponse$Field.m22651a("progressType", 2));
    }

    public ProgressEvent() {
        this.f107992a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f107991c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return Integer.valueOf(this.f107993b);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public ProgressEvent(Set set, int i) {
        this.f107992a = set;
        this.f107993b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 2) {
            this.f107993b = i;
            this.f107992a.add(Integer.valueOf(i2));
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
        if (this.f107992a.contains(2)) {
            see.m35063b(parcel, 2, this.f107993b);
        }
        see.m35062b(parcel, a);
    }

    public ProgressEvent(byte[] bArr) {
        HashSet hashSet = new HashSet();
        this.f107992a = hashSet;
        this.f107993b = 6;
        hashSet.add(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107992a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
