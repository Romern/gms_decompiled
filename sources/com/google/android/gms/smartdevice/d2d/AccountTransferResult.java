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
public class AccountTransferResult extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new aqxp();

    /* renamed from: d */
    private static final HashMap f107786d;

    /* renamed from: a */
    final Set f107787a;

    /* renamed from: b */
    public BootstrapAccount f107788b;

    /* renamed from: c */
    public int f107789c;

    static {
        HashMap hashMap = new HashMap();
        f107786d = hashMap;
        hashMap.put("bootstrapAccount", FastJsonResponse$Field.m22653a("bootstrapAccount", 2, BootstrapAccount.class));
        f107786d.put("RESULT", FastJsonResponse$Field.m22651a("RESULT", 3));
    }

    public AccountTransferResult() {
        this.f107787a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f107786d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f107788b;
        }
        if (i == 3) {
            return Integer.valueOf(this.f107789c);
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
        if (i2 == 3) {
            this.f107789c = i;
            this.f107787a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be an int.", Integer.valueOf(i2)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f107787a;
        if (set.contains(2)) {
            see.m35040a(parcel, 2, this.f107788b, i, true);
        }
        if (set.contains(3)) {
            see.m35063b(parcel, 3, this.f107789c);
        }
        see.m35062b(parcel, a);
    }

    public AccountTransferResult(BootstrapAccount bootstrapAccount, int i) {
        this.f107787a = new HashSet();
        sdo.m34959a(bootstrapAccount);
        this.f107788b = bootstrapAccount;
        this.f107787a.add(2);
        this.f107789c = i;
        this.f107787a.add(3);
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f107788b = (BootstrapAccount) sio;
            this.f107787a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a concrete type.", Integer.valueOf(i)));
    }

    public AccountTransferResult(Set set, BootstrapAccount bootstrapAccount, int i) {
        this.f107787a = set;
        this.f107788b = bootstrapAccount;
        this.f107789c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107787a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
