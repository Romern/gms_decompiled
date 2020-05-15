package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthenticatorTransferInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new gua();

    /* renamed from: i */
    private static final HashMap f10059i;

    /* renamed from: a */
    final Set f10060a;

    /* renamed from: b */
    final int f10061b;

    /* renamed from: c */
    public String f10062c;

    /* renamed from: d */
    public int f10063d;

    /* renamed from: e */
    public byte[] f10064e;

    /* renamed from: f */
    public PendingIntent f10065f;

    /* renamed from: g */
    public DeviceMetaData f10066g;

    static {
        HashMap hashMap = new HashMap();
        f10059i = hashMap;
        hashMap.put("accountType", FastJsonResponse$Field.m22666f("accountType", 2));
        f10059i.put("status", FastJsonResponse$Field.m22651a("status", 3));
        f10059i.put("transferBytes", FastJsonResponse$Field.m22669h("transferBytes", 4));
    }

    public AuthenticatorTransferInfo() {
        this.f10060a = new C1225nr(3);
        this.f10061b = 1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f10059i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 1) {
            return Integer.valueOf(this.f10061b);
        }
        if (i == 2) {
            return this.f10062c;
        }
        if (i == 3) {
            return Integer.valueOf(this.f10063d);
        }
        if (i == 4) {
            return this.f10064e;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public AuthenticatorTransferInfo(Set set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f10060a = set;
        this.f10061b = i;
        this.f10062c = str;
        this.f10063d = i2;
        this.f10064e = bArr;
        this.f10065f = pendingIntent;
        this.f10066g = deviceMetaData;
    }

    /* renamed from: a */
    public final void mo7390a(PendingIntent pendingIntent) {
        this.f10065f = pendingIntent;
        if (pendingIntent == null) {
            this.f10060a.remove(6);
        } else {
            this.f10060a.add(6);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f10060a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f10061b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f10062c, true);
        }
        if (set.contains(3)) {
            see.m35063b(parcel, 3, this.f10063d);
        }
        if (set.contains(4)) {
            see.m35052a(parcel, 4, this.f10064e, true);
        }
        if (set.contains(5)) {
            see.m35040a(parcel, 5, this.f10065f, i, true);
        }
        if (set.contains(6)) {
            see.m35040a(parcel, 6, this.f10066g, i, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 3) {
            this.f10063d = i;
            this.f10060a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f10062c = str2;
            this.f10060a.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7392a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f10064e = bArr;
            this.f10060a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an byte array.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10060a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
