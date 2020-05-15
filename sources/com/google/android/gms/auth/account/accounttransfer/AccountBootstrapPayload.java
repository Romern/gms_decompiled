package com.google.android.gms.auth.account.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountBootstrapPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new gjh();

    /* renamed from: h */
    private static final HashMap f9954h;

    /* renamed from: a */
    public final Set f9955a;

    /* renamed from: b */
    final int f9956b;

    /* renamed from: c */
    public ArrayList f9957c;

    /* renamed from: d */
    public ArrayList f9958d;

    /* renamed from: e */
    public ExchangeAssertionsForUserCredentialsRequest f9959e;

    /* renamed from: f */
    public ArrayList f9960f;

    /* renamed from: g */
    public ExchangeSessionCheckpointsForUserCredentialsRequest f9961g;

    static {
        HashMap hashMap = new HashMap();
        f9954h = hashMap;
        hashMap.put("userBootstrapInfos", FastJsonResponse$Field.m22657b("userBootstrapInfos", 2, UserBootstrapInfo.class));
        f9954h.put("challenges", FastJsonResponse$Field.m22657b("challenges", 3, Challenge.class));
        f9954h.put("exchangeAssertionsForUserCredentialsRequest", FastJsonResponse$Field.m22653a("exchangeAssertionsForUserCredentialsRequest", 4, ExchangeAssertionsForUserCredentialsRequest.class));
        f9954h.put("userCredentials", FastJsonResponse$Field.m22657b("userCredentials", 5, UserCredential.class));
        f9954h.put("exchangeSessionCheckpointsForUserCredentialsRequest", FastJsonResponse$Field.m22653a("exchangeSessionCheckpointsForUserCredentialsRequest", 6, ExchangeSessionCheckpointsForUserCredentialsRequest.class));
    }

    public AccountBootstrapPayload() {
        this.f9956b = 2;
        this.f9955a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f9954h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f9957c;
        }
        if (i == 3) {
            return this.f9958d;
        }
        if (i == 4) {
            return this.f9959e;
        }
        if (i == 5) {
            return this.f9960f;
        }
        if (i == 6) {
            return this.f9961g;
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
            this.f9957c = arrayList;
        } else if (i == 3) {
            this.f9958d = arrayList;
        } else if (i == 5) {
            this.f9960f = arrayList;
        } else {
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known array of custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f9955a.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f9955a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f9956b);
        }
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f9957c, true);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f9958d, true);
        }
        if (set.contains(4)) {
            see.m35040a(parcel, 4, this.f9959e, i, true);
        }
        if (set.contains(5)) {
            see.m35066c(parcel, 5, this.f9960f, true);
        }
        if (set.contains(6)) {
            see.m35040a(parcel, 6, this.f9961g, i, true);
        }
        see.m35062b(parcel, a);
    }

    public AccountBootstrapPayload(Set set, int i, ArrayList arrayList, ArrayList arrayList2, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest, ArrayList arrayList3, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest) {
        this.f9955a = set;
        this.f9956b = i;
        this.f9957c = arrayList;
        this.f9958d = arrayList2;
        this.f9959e = exchangeAssertionsForUserCredentialsRequest;
        this.f9960f = arrayList3;
        this.f9961g = exchangeSessionCheckpointsForUserCredentialsRequest;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f9959e = (ExchangeAssertionsForUserCredentialsRequest) sio;
        } else if (i == 6) {
            this.f9961g = (ExchangeSessionCheckpointsForUserCredentialsRequest) sio;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), sio.getClass().getCanonicalName()));
        }
        this.f9955a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f9955a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
