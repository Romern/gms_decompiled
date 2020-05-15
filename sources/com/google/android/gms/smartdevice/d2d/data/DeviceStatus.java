package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceStatus extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new arhi();

    /* renamed from: c */
    private static final Map f107967c;

    /* renamed from: a */
    public int f107968a;

    /* renamed from: b */
    final Set f107969b;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("errorCode", FastJsonResponse$Field.m22651a("errorCode", 1));
        f107967c = h.mo67618b();
    }

    public DeviceStatus() {
        this.f107969b = new HashSet();
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f107967c;
    }

    /* renamed from: c */
    public final Object mo17863c(String str) {
        if ("errorCode".equals(str)) {
            return Integer.valueOf(this.f107968a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("No value for key ") : "No value for key ".concat(valueOf));
    }

    public DeviceStatus(Set set, int i) {
        this.f107969b = set;
        this.f107968a = i;
    }

    /* renamed from: a */
    public final void mo59090a(int i) {
        this.f107968a = i;
        this.f107969b.add(1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        if (this.f107969b.contains(1)) {
            see.m35063b(parcel, 1, this.f107968a);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25602a(String str, int i) {
        if ("errorCode".equals(str)) {
            mo59090a(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107969b.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
