package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: sat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sat {

    /* renamed from: a */
    public final Account f43963a;

    /* renamed from: b */
    public final Set f43964b;

    /* renamed from: c */
    public final Set f43965c;

    /* renamed from: d */
    public final Map f43966d;

    /* renamed from: e */
    public final String f43967e;

    /* renamed from: f */
    public final String f43968f;

    /* renamed from: g */
    public final aqkt f43969g;

    /* renamed from: h */
    public Integer f43970h;

    public sat(Account account, Set set, Map map, String str, String str2, aqkt aqkt) {
        this.f43963a = account;
        this.f43964b = set != null ? Collections.unmodifiableSet(set) : Collections.emptySet();
        this.f43966d = map == null ? Collections.emptyMap() : map;
        this.f43967e = str;
        this.f43968f = str2;
        this.f43969g = aqkt;
        HashSet hashSet = new HashSet(this.f43964b);
        for (sas sas : this.f43966d.values()) {
            Set set2 = sas.f43962a;
            hashSet.addAll(null);
        }
        this.f43965c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public static sat m34799a(Context context) {
        return new rjy(context).mo24773a();
    }

    /* renamed from: b */
    public final Account mo25320b() {
        Account account = this.f43963a;
        return account == null ? new Account("<<default account>>", "com.google") : account;
    }

    @Deprecated
    /* renamed from: a */
    public final String mo25318a() {
        Account account = this.f43963a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: a */
    public final Set mo25319a(rjo rjo) {
        if (((sas) this.f43966d.get(rjo)) == null) {
            return this.f43964b;
        }
        throw null;
    }
}
