package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TargetConnectionArgs extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ared();

    /* renamed from: c */
    private static final HashMap f107936c;

    /* renamed from: a */
    public final Set f107937a;

    /* renamed from: b */
    public SourceDevice f107938b;

    static {
        HashMap hashMap = new HashMap();
        f107936c = hashMap;
        hashMap.put("sourceDevice", FastJsonResponse$Field.m22653a("sourceDevice", 2, SourceDevice.class));
    }

    public TargetConnectionArgs() {
        this.f107937a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f107936c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f107938b;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public TargetConnectionArgs(Set set, SourceDevice sourceDevice) {
        this.f107937a = set;
        this.f107938b = sourceDevice;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f107938b = (SourceDevice) sio;
            this.f107937a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), sio.getClass().getCanonicalName()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        if (this.f107937a.contains(2)) {
            see.m35040a(parcel, 2, this.f107938b, i, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107937a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
