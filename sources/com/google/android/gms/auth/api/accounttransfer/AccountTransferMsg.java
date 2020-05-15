package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountTransferMsg extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new gtr();

    /* renamed from: f */
    private static final HashMap f10039f;

    /* renamed from: a */
    final Set f10040a;

    /* renamed from: b */
    final int f10041b;

    /* renamed from: c */
    public ArrayList f10042c;

    /* renamed from: d */
    public int f10043d;

    /* renamed from: e */
    public AccountTransferProgress f10044e;

    static {
        HashMap hashMap = new HashMap();
        f10039f = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse$Field.m22657b("authenticatorData", 2, AuthenticatorAnnotatedData.class));
        f10039f.put("progress", FastJsonResponse$Field.m22653a("progress", 4, AccountTransferProgress.class));
    }

    public AccountTransferMsg() {
        this.f10040a = new HashSet(1);
        this.f10041b = 1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f10039f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 1) {
            return Integer.valueOf(this.f10041b);
        }
        if (i == 2) {
            return this.f10042c;
        }
        if (i == 4) {
            return this.f10044e;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public AccountTransferMsg(Set set, int i, ArrayList arrayList, int i2, AccountTransferProgress accountTransferProgress) {
        this.f10040a = set;
        this.f10041b = i;
        this.f10042c = arrayList;
        this.f10043d = i2;
        this.f10044e = accountTransferProgress;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f10042c = arrayList;
            this.f10040a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i), arrayList.getClass().getCanonicalName()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f10040a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f10041b);
        }
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f10042c, true);
        }
        if (set.contains(3)) {
            see.m35063b(parcel, 3, this.f10043d);
        }
        if (set.contains(4)) {
            see.m35040a(parcel, 4, this.f10044e, i, true);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f10044e = (AccountTransferProgress) sio;
            this.f10040a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), sio.getClass().getCanonicalName()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10040a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
