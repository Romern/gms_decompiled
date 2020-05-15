package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ClientContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new sao();

    /* renamed from: a */
    public final int f30211a;

    /* renamed from: b */
    public int f30212b;

    /* renamed from: c */
    public Account f30213c;

    /* renamed from: d */
    public Account f30214d;

    /* renamed from: e */
    public String f30215e;

    /* renamed from: f */
    public String f30216f;

    /* renamed from: g */
    public List f30217g;

    /* renamed from: h */
    public List f30218h;

    /* renamed from: i */
    public Bundle f30219i;

    /* renamed from: j */
    public int f30220j;

    public ClientContext() {
        this(0, -1, null, null, null, null, null, null, null, -1);
    }

    /* renamed from: a */
    public static ClientContext m22584a(Context context, int i, Account account, String str) {
        Account account2;
        Account account3;
        String[] split;
        sdo.m34959a(account);
        sdo.m34959a((Object) str);
        String a = m22585a(account, str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(a, 0);
        int i2 = sharedPreferences.getInt("calling_uid", -1);
        if (i2 == -1 || i2 != i) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String string = sharedPreferences.getString("granted_scopes", null);
        if (string != null && string.length() > 0) {
            for (String str2 : string.split(",")) {
                arrayList.add(str2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        String string2 = sharedPreferences.getString("requested_visible_actions", null);
        if (string2 != null && string2.length() > 0) {
            for (String str3 : string2.split(",")) {
                arrayList2.add(str3);
            }
        }
        Bundle bundle = new Bundle();
        String string3 = sharedPreferences.getString("extras", null);
        if (string3 != null && string3.length() > 0) {
            String[] split2 = string3.split(",");
            int length = split2.length - 1;
            for (int i3 = 0; i3 < length; i3 += 2) {
                bundle.putString(split2[i3], split2[i3 + 1]);
            }
        }
        String string4 = sharedPreferences.getString("resolved_account_name", null);
        if (!TextUtils.isEmpty(string4)) {
            account2 = new Account(string4, sharedPreferences.getString("resolved_account_type", "com.google"));
        } else {
            account2 = null;
        }
        String string5 = sharedPreferences.getString("requested_account_name", null);
        if (!TextUtils.isEmpty(string5)) {
            account3 = new Account(string5, sharedPreferences.getString("requested_account_type", "com.google"));
        } else {
            account3 = null;
        }
        return new ClientContext(i2, account2, account3, sharedPreferences.getString("calling_package_name", null), sharedPreferences.getString("auth_package_name", null), arrayList, arrayList2, bundle);
    }

    /* renamed from: c */
    public static Account m22586c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new Account(str, "com.google");
        }
        return null;
    }

    @Deprecated
    /* renamed from: b */
    public final String mo17802b() {
        Account account = this.f30213c;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: d */
    public final void mo17806d(String str) {
        if (!mo17801a(str)) {
            this.f30217g.add(str);
        }
    }

    @Deprecated
    /* renamed from: e */
    public final void mo17808e(String str) {
        this.f30213c = m22586c(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClientContext) {
            ClientContext clientContext = (ClientContext) obj;
            return sdg.m34949a(clientContext.f30213c, this.f30213c) && sdg.m34949a(clientContext.f30214d, this.f30214d) && sdg.m34949a(clientContext.f30215e, this.f30215e) && sdg.m34949a(clientContext.f30216f, this.f30216f) && clientContext.f30212b == this.f30212b;
        }
    }

    /* renamed from: f */
    public final boolean mo17811f() {
        List list = this.f30217g;
        return list != null && list.size() > 0;
    }

    /* renamed from: g */
    public final String mo17812g() {
        if (mo17811f()) {
            String valueOf = String.valueOf(TextUtils.join(" ", this.f30217g));
            return valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf);
        }
        throw new NullPointerException("no scopes granted");
    }

    /* renamed from: h */
    public final String[] mo17813h() {
        List list = this.f30218h;
        return (String[]) list.toArray(new String[list.size()]);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30213c, this.f30214d, this.f30215e, this.f30216f, Integer.valueOf(this.f30212b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("mRequestedAccount", this.f30214d);
        a.mo25396a("mResolvedAccount", this.f30213c);
        a.mo25396a("mCallingPackageName", this.f30215e);
        a.mo25396a("mCallingUid", Integer.valueOf(this.f30212b));
        a.mo25396a("mAuthPackageName", this.f30216f);
        a.mo25396a("mGrantedScopes", this.f30217g);
        a.mo25396a("isProxyingAuthentication", Boolean.valueOf(mo17807d()));
        a.mo25396a("mVisibleActions", this.f30218h);
        a.mo25396a("mExtras", this.f30219i);
        return a.toString();
    }

    public ClientContext(int i, int i2, Account account, Account account2, String str, String str2, List list, List list2, Bundle bundle, int i3) {
        this.f30211a = i;
        this.f30212b = i2;
        this.f30213c = account;
        this.f30214d = account2;
        this.f30215e = str;
        this.f30216f = str2;
        this.f30217g = list == null ? new ArrayList() : list;
        this.f30218h = list2 == null ? new ArrayList() : list2;
        this.f30219i = bundle == null ? new Bundle() : bundle;
        this.f30220j = i3;
    }

    /* renamed from: b */
    public final String mo17803b(String str) {
        return this.f30219i.getString(str);
    }

    /* renamed from: d */
    public final boolean mo17807d() {
        return !TextUtils.equals(this.f30215e, this.f30216f);
    }

    /* renamed from: e */
    public final String[] mo17809e() {
        List list = this.f30217g;
        return (String[]) list.toArray(new String[list.size()]);
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
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f30211a);
        see.m35063b(parcel, 2, this.f30212b);
        see.m35040a(parcel, 3, this.f30213c, i, false);
        see.m35040a(parcel, 4, this.f30214d, i, false);
        see.m35046a(parcel, 5, this.f30215e, false);
        see.m35046a(parcel, 6, this.f30216f, false);
        see.m35065b(parcel, 7, this.f30217g, false);
        see.m35065b(parcel, 8, this.f30218h, false);
        see.m35037a(parcel, 9, this.f30219i, false);
        see.m35063b(parcel, 10, this.f30220j);
        see.m35062b(parcel, a);
    }

    /* renamed from: b */
    public final void mo17804b(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(m22585a(this.f30213c, this.f30216f), 0).edit();
        edit.clear();
        edit.commit();
    }

    /* renamed from: c */
    public final boolean mo17805c() {
        String str;
        Account account = this.f30214d;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        return "<<default account>>".equals(str);
    }

    @Deprecated
    public ClientContext(int i, Account account, Account account2, String str, String str2) {
        this(i, account2, account, str, str2, null, null, new Bundle());
    }

    @Deprecated
    public ClientContext(int i, Account account, Account account2, String str, String str2, ArrayList arrayList, ArrayList arrayList2, Bundle bundle) {
        this(0, i, account, account2, str, str2, arrayList, arrayList2, bundle, -1);
    }

    @Deprecated
    public ClientContext(int i, String str, String str2, String str3, String str4) {
        this(i, m22586c(str2), m22586c(str), str3, str4, null, null, new Bundle());
    }

    public ClientContext(ClientContext clientContext) {
        this(clientContext.f30212b, clientContext.f30213c, clientContext.f30214d, clientContext.f30215e, clientContext.f30216f, new ArrayList(clientContext.f30217g), new ArrayList(clientContext.f30218h), new Bundle(clientContext.f30219i));
    }

    /* renamed from: a */
    private static String m22585a(Account account, String str) {
        String valueOf = String.valueOf(String.valueOf(account.hashCode() ^ str.hashCode()));
        return valueOf.length() == 0 ? new String("common.clientcontext_") : "common.clientcontext_".concat(valueOf);
    }

    @Deprecated
    /* renamed from: a */
    public final String mo17795a() {
        Account account = this.f30214d;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo17796a(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(m22585a(this.f30213c, this.f30216f), 0).edit();
        edit.putInt("calling_uid", this.f30212b);
        edit.putString("resolved_account_name", this.f30213c.name);
        edit.putString("resolved_account_type", this.f30213c.type);
        edit.putString("requested_account_name", this.f30214d.name);
        edit.putString("requested_account_type", this.f30214d.type);
        edit.putString("calling_package_name", this.f30215e);
        edit.putString("auth_package_name", this.f30216f);
        StringBuilder sb = new StringBuilder();
        int size = this.f30217g.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append((String) this.f30217g.get(i));
        }
        edit.putString("granted_scopes", sb.toString());
        edit.putString("requested_visible_actions", TextUtils.join(",", this.f30218h));
        if (this.f30219i.size() > 0) {
            sb.delete(0, sb.length());
            for (String str : this.f30219i.keySet()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str);
                sb.append(',');
                sb.append(this.f30219i.getString(str));
            }
            edit.putString("extras", sb.toString());
        }
        edit.apply();
    }

    /* renamed from: a */
    public final void mo17797a(ClientContext clientContext) {
        this.f30219i.clear();
        this.f30219i.putAll(clientContext.f30219i);
    }

    /* renamed from: a */
    public final void mo17798a(String str, String str2) {
        boolean z = true;
        sdo.m34975b(!str.contains(","), "key cannot contain ','");
        if (str2 != null && str2.contains(",")) {
            z = false;
        }
        sdo.m34975b(z, "value cannot contain ','");
        this.f30219i.putString(str, str2);
    }

    /* renamed from: a */
    public final void mo17799a(String[] strArr) {
        this.f30217g.clear();
        if (strArr != null) {
            for (String str : strArr) {
                this.f30217g.add(str);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo17800a(Scope scope) {
        return this.f30217g.contains(scope.f30106b);
    }

    /* renamed from: a */
    public final boolean mo17801a(String str) {
        return this.f30217g.contains(str);
    }
}
