package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleSignInOptions extends AbstractSafeParcelable implements ReflectedParcelable, rjh, rjj {
    public static final Parcelable.Creator CREATOR = new ici();

    /* renamed from: a */
    public static final Scope f10327a = new Scope("profile");

    /* renamed from: b */
    public static final Scope f10328b = new Scope("email");

    /* renamed from: c */
    public static final Scope f10329c = new Scope("openid");

    /* renamed from: d */
    public static final Scope f10330d = new Scope("https://www.googleapis.com/auth/games_lite");

    /* renamed from: e */
    public static final Scope f10331e = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: f */
    public static final GoogleSignInOptions f10332f;

    /* renamed from: r */
    public static Comparator f10333r = new icg();

    /* renamed from: g */
    final int f10334g;

    /* renamed from: h */
    public final ArrayList f10335h;

    /* renamed from: i */
    public Account f10336i;

    /* renamed from: j */
    public boolean f10337j;

    /* renamed from: k */
    public final boolean f10338k;

    /* renamed from: l */
    public final boolean f10339l;

    /* renamed from: m */
    public String f10340m;

    /* renamed from: n */
    public String f10341n;

    /* renamed from: o */
    public ArrayList f10342o;

    /* renamed from: p */
    public String f10343p;

    /* renamed from: q */
    public Map f10344q;

    static {
        ich ich = new ich();
        ich.mo12914b();
        ich.f20725a.add(f10327a);
        f10332f = ich.mo12912a();
        ich ich2 = new ich();
        ich2.mo12913a(f10330d, new Scope[0]);
        ich2.mo12912a();
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.f10334g = i;
        this.f10335h = arrayList;
        this.f10336i = account;
        this.f10337j = z;
        this.f10338k = z2;
        this.f10339l = z3;
        this.f10340m = str;
        this.f10341n = str2;
        this.f10342o = new ArrayList(map.values());
        this.f10344q = map;
        this.f10343p = str3;
    }

    /* renamed from: a */
    public static GoogleSignInOptions m6415a(String str) {
        String str2;
        Account account;
        String str3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str3 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, optString, str3, new HashMap(), null);
    }

    /* renamed from: b */
    public final Scope[] mo7527b() {
        ArrayList arrayList = this.f10335h;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r4.f10336i == null) goto L_0x0042;
     */
    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                if (this.f10342o.size() <= 0 && googleSignInOptions.f10342o.size() <= 0 && this.f10335h.size() == googleSignInOptions.mo7526a().size() && this.f10335h.containsAll(googleSignInOptions.mo7526a())) {
                    Account account = this.f10336i;
                    if (account != null) {
                        if (account.equals(googleSignInOptions.f10336i)) {
                        }
                    }
                    if (TextUtils.isEmpty(this.f10340m)) {
                        if (TextUtils.isEmpty(googleSignInOptions.f10340m)) {
                        }
                    } else if (!this.f10340m.equals(googleSignInOptions.f10340m)) {
                    }
                    if (this.f10339l == googleSignInOptions.f10339l && this.f10337j == googleSignInOptions.f10337j && this.f10338k == googleSignInOptions.f10338k && TextUtils.equals(this.f10343p, googleSignInOptions.f10343p)) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f10335h;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).f30106b);
        }
        Collections.sort(arrayList);
        icy icy = new icy();
        icy.mo12929a(arrayList);
        icy.mo12929a(this.f10336i);
        icy.mo12929a(this.f10340m);
        icy.mo12930a(this.f10339l);
        icy.mo12930a(this.f10337j);
        icy.mo12930a(this.f10338k);
        icy.mo12929a(this.f10343p);
        return icy.f20753a;
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10334g);
        see.m35066c(parcel, 2, mo7526a(), false);
        see.m35040a(parcel, 3, this.f10336i, i, false);
        see.m35051a(parcel, 4, this.f10337j);
        see.m35051a(parcel, 5, this.f10338k);
        see.m35051a(parcel, 6, this.f10339l);
        see.m35046a(parcel, 7, this.f10340m, false);
        see.m35046a(parcel, 8, this.f10341n, false);
        see.m35066c(parcel, 9, this.f10342o, false);
        see.m35046a(parcel, 10, this.f10343p, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public static Map m6416a(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) list.get(i);
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f10349b), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final ArrayList mo7526a() {
        return new ArrayList(this.f10335h);
    }
}
