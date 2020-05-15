package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExchangeSessionCheckpointsForUserCredentialsRequest extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aruk();

    /* renamed from: d */
    private static final HashMap f108155d;

    /* renamed from: a */
    final Set f108156a;

    /* renamed from: b */
    public ArrayList f108157b;

    /* renamed from: c */
    public DeviceRiskSignals f108158c;

    static {
        HashMap hashMap = new HashMap();
        f108155d = hashMap;
        hashMap.put("sessionCheckpoints", FastJsonResponse$Field.m22657b("sessionCheckpoints", 2, SessionCheckpoint.class));
        f108155d.put("targetDeviceRiskSignals", FastJsonResponse$Field.m22653a("targetDeviceRiskSignals", 3, DeviceRiskSignals.class));
    }

    public ExchangeSessionCheckpointsForUserCredentialsRequest() {
        this.f108156a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f108155d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f108157b;
        }
        if (i == 3) {
            return this.f108158c;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f108157b = arrayList;
            this.f108156a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = arrayList.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known array of custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f108156a;
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f108157b, true);
        }
        if (set.contains(3)) {
            see.m35040a(parcel, 3, this.f108158c, i, true);
        }
        see.m35062b(parcel, a);
    }

    public ExchangeSessionCheckpointsForUserCredentialsRequest(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        this.f108156a = hashSet;
        this.f108157b = arrayList;
        hashSet.add(2);
        mo59161a((DeviceRiskSignals) null);
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f108158c = (DeviceRiskSignals) sio;
            this.f108156a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), sio.getClass().getCanonicalName()));
    }

    public ExchangeSessionCheckpointsForUserCredentialsRequest(Set set, ArrayList arrayList, DeviceRiskSignals deviceRiskSignals) {
        this.f108156a = set;
        this.f108157b = arrayList;
        this.f108158c = deviceRiskSignals;
    }

    /* renamed from: a */
    public final void mo59161a(DeviceRiskSignals deviceRiskSignals) {
        this.f108158c = deviceRiskSignals;
        this.f108156a.add(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f108156a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
