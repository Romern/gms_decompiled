package com.google.android.gms.smartdevice.d2d.data;

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
    public static final Parcelable.Creator CREATOR = new arhc();

    /* renamed from: g */
    private static final HashMap f107955g;

    /* renamed from: a */
    public final Set f107956a;

    /* renamed from: b */
    public ArrayList f107957b;

    /* renamed from: c */
    public ArrayList f107958c;

    /* renamed from: d */
    public ExchangeAssertionsForUserCredentialsRequest f107959d;

    /* renamed from: e */
    public ArrayList f107960e;

    /* renamed from: f */
    public ExchangeSessionCheckpointsForUserCredentialsRequest f107961f;

    static {
        HashMap hashMap = new HashMap();
        f107955g = hashMap;
        hashMap.put("userBootstrapInfos", FastJsonResponse$Field.m22657b("userBootstrapInfos", 2, UserBootstrapInfo.class));
        f107955g.put("challenges", FastJsonResponse$Field.m22657b("challenges", 3, Challenge.class));
        f107955g.put("exchangeAssertionsForUserCredentialsRequest", FastJsonResponse$Field.m22653a("exchangeAssertionsForUserCredentialsRequest", 4, ExchangeAssertionsForUserCredentialsRequest.class));
        f107955g.put("userCredentials", FastJsonResponse$Field.m22657b("userCredentials", 5, UserCredential.class));
        f107955g.put("exchangeSessionCheckpointsForUserCredentialsRequest", FastJsonResponse$Field.m22653a("exchangeSessionCheckpointsForUserCredentialsRequest", 6, ExchangeSessionCheckpointsForUserCredentialsRequest.class));
    }

    public AccountBootstrapPayload() {
        this.f107956a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f107955g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f107957b;
        }
        if (i == 3) {
            return this.f107958c;
        }
        if (i == 4) {
            return this.f107959d;
        }
        if (i == 5) {
            return this.f107960e;
        }
        if (i == 6) {
            return this.f107961f;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public AccountBootstrapPayload(Set set, ArrayList arrayList, ArrayList arrayList2, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest, ArrayList arrayList3, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest) {
        this.f107956a = set;
        this.f107957b = arrayList;
        this.f107958c = arrayList2;
        this.f107959d = exchangeAssertionsForUserCredentialsRequest;
        this.f107960e = arrayList3;
        this.f107961f = exchangeSessionCheckpointsForUserCredentialsRequest;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f107957b = arrayList;
        } else if (i == 3) {
            this.f107958c = arrayList;
        } else if (i == 5) {
            this.f107960e = arrayList;
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
        this.f107956a.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f107956a;
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f107957b, true);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f107958c, true);
        }
        if (set.contains(4)) {
            see.m35040a(parcel, 4, this.f107959d, i, true);
        }
        if (set.contains(5)) {
            see.m35066c(parcel, 5, this.f107960e, true);
        }
        if (set.contains(6)) {
            see.m35040a(parcel, 6, this.f107961f, i, true);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f107959d = (ExchangeAssertionsForUserCredentialsRequest) sio;
        } else if (i == 6) {
            this.f107961f = (ExchangeSessionCheckpointsForUserCredentialsRequest) sio;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), sio.getClass().getCanonicalName()));
        }
        this.f107956a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107956a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
