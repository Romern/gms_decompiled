package com.google.android.location.reporting.state.update;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ReportingConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgyx();

    /* renamed from: a */
    public final List f150914a;

    /* renamed from: b */
    public final Conditions f150915b;

    public ReportingConfig(List list, Conditions conditions) {
        this.f150914a = Collections.unmodifiableList(list);
        sdo.checkIfNull(conditions, "conditions");
        this.f150915b = conditions;
    }

    /* renamed from: a */
    public final AccountConfig mo70926a(Account account) {
        for (AccountConfig accountConfig : this.f150914a) {
            if (accountConfig.f150890a.equals(account)) {
                return accountConfig;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final List mo70928b() {
        ArrayList arrayList = new ArrayList();
        for (AccountConfig accountConfig : this.f150914a) {
            if (accountConfig.mo70916j()) {
                arrayList.add(accountConfig.f150890a);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List mo70929c() {
        ArrayList arrayList = new ArrayList();
        for (AccountConfig accountConfig : this.f150914a) {
            if (accountConfig.mo70916j()) {
                arrayList.add(accountConfig);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final boolean mo70930d() {
        return !mo70928b().isEmpty();
    }

    /* renamed from: e */
    public final String mo70931e() {
        C1223np npVar = new C1223np();
        for (AccountConfig accountConfig : this.f150914a) {
            npVar.put(accountConfig.f150890a, accountConfig.mo70909e());
        }
        Map unmodifiableMap = Collections.unmodifiableMap(npVar);
        if (unmodifiableMap.isEmpty()) {
            return "(no Google accounts)";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            linkedHashMap.put(aeqm.m52397a((Account) entry.getKey()), entry.getValue());
        }
        return linkedHashMap.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReportingConfig) {
            ReportingConfig reportingConfig = (ReportingConfig) obj;
            return this.f150914a.equals(reportingConfig.f150914a) && this.f150915b.equals(reportingConfig.f150915b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f150914a, this.f150915b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f150914a);
        String valueOf2 = String.valueOf(this.f150915b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49 + String.valueOf(valueOf2).length());
        sb.append("ReportingConfig{, mAccountConfigs=");
        sb.append(valueOf);
        sb.append(", mConditions=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final Set mo70927a() {
        C1225nr nrVar = new C1225nr();
        for (AccountConfig accountConfig : this.f150914a) {
            nrVar.add(accountConfig.f150890a);
        }
        return nrVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f150914a, false);
        see.m35040a(parcel, 3, this.f150915b, i, false);
        see.m35062b(parcel, a);
    }
}
