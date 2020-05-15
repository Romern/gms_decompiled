package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Map;

/* renamed from: aarp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aarp extends aasc {

    /* renamed from: e */
    private static final Map f56373e = new C1223np();

    /* renamed from: a */
    public String f56374a;

    public aarp(Context context, HelpConfig helpConfig) {
        super(context, helpConfig);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasc.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      aasc.a(java.lang.String, int):int
      aasc.a(java.lang.String, long):long
      aasc.a(java.lang.String, bxxc):bxxc
      aasc.a(java.lang.String, java.lang.String):java.lang.String
      aasc.a(bxxc, java.lang.String):void
      aasc.a(java.lang.String, boolean):boolean */
    /* renamed from: a */
    public static void m46797a(bqgj bqgj, aarn aarn, Context context, HelpConfig helpConfig) {
        Account account = helpConfig.f78829d;
        if (account != null) {
            aarp aarp = new aarp(context, helpConfig);
            aarp.f56374a = m46798c(account.name);
            if (aarp.mo31699a("is_account_in_prefs", false)) {
                aarn.mo31653a(aarp);
            } else {
                bqgj.execute(new aaro(aarn, context, helpConfig));
            }
        } else {
            aarn.mo31653a(new aarp(context, helpConfig));
        }
    }

    /* renamed from: c */
    public static String m46798c(String str) {
        return Integer.toString(str.hashCode());
    }

    /* renamed from: b */
    public final boolean mo31657b(String str) {
        String a = mo31656a(str);
        C1245ok a2 = aasj.m46867a(this.f56425d);
        if (!(a2.get(str) instanceof bxxc)) {
            return this.f56423b.contains(mo31656a(str));
        }
        bxxc bxxc = (bxxc) a2.get(str);
        return (bxxc == null || mo31696a(a, bxxc) == bxxc) ? false : true;
    }

    /* renamed from: a */
    public final String mo31656a(String str) {
        String str2;
        synchronized (f56373e) {
            Map map = (Map) f56373e.get(this.f56374a);
            if (map == null) {
                map = new C1223np();
                f56373e.put(this.f56374a, map);
            }
            Map map2 = (Map) map.get(this.f56424c);
            if (map2 == null) {
                map2 = new C1223np();
                map.put(this.f56424c, map2);
            }
            String str3 = (String) map2.get(str);
            if (str3 != null) {
                return str3;
            }
            if (!TextUtils.isEmpty(this.f56374a)) {
                str2 = String.format("%s:%s", super.mo31656a(str), this.f56374a);
            } else {
                str2 = super.mo31656a(str);
            }
            map2.put(str, str2);
            return str2;
        }
    }
}
