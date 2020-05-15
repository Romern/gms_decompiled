package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountTransferPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new arhd();

    /* renamed from: d */
    private static final asco f107962d = ascp.m73787a("D2D", "AccountTransferPayload");

    /* renamed from: e */
    private static final Map f107963e;

    /* renamed from: a */
    final Set f107964a;

    /* renamed from: b */
    final int f107965b;

    /* renamed from: c */
    public byte[] f107966c;

    static {
        C1223np npVar = new C1223np();
        f107963e = npVar;
        npVar.put("accountTransferMsg", FastJsonResponse$Field.m22669h("accountTransferMsg", 2));
    }

    public AccountTransferPayload() {
        this.f107965b = 1;
        this.f107964a = new HashSet();
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f107963e;
    }

    /* renamed from: b */
    public final AccountTransferMsg mo59088b() {
        if (this.f107966c == null) {
            return null;
        }
        AccountTransferMsg accountTransferMsg = new AccountTransferMsg();
        try {
            new sja().mo25625a(new ByteArrayInputStream(this.f107966c), accountTransferMsg);
            return accountTransferMsg;
        } catch (siy e) {
            throw new kau(e.getMessage());
        } catch (kau e2) {
            f107962d.mo25417e("Failed populating AccountTransferMsg from bytes", e2, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7392a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f107966c = bArr;
            this.f107964a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(57);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a byte array");
        throw new IllegalArgumentException(sb.toString());
    }

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
        Set set = this.f107964a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f107965b);
        }
        if (set.contains(2)) {
            see.m35052a(parcel, 2, this.f107966c, true);
        }
        see.m35062b(parcel, a);
    }

    public AccountTransferPayload(AccountTransferMsg accountTransferMsg) {
        byte[] bArr;
        this.f107965b = 1;
        this.f107964a = new HashSet();
        try {
            bArr = accountTransferMsg.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e(com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson.f11607h, "Error serializing object.", e);
            bArr = null;
        }
        this.f107966c = bArr;
        this.f107964a.add(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107964a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f107966c;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public AccountTransferPayload(Set set, int i, byte[] bArr) {
        this.f107964a = set;
        this.f107965b = i;
        this.f107966c = bArr;
    }
}
