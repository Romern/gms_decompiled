package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;

/* renamed from: ancx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ancx {
    /* renamed from: a */
    public static synchronized Account m64046a(Context context, String str) {
        synchronized (ancx.class) {
            m64048a();
            Account[] a = adyd.m51363a(context).mo33916a("com.google");
            for (Account account : a) {
                if (!TextUtils.isEmpty(account.name) && TextUtils.equals(str, account.name)) {
                    return account;
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public static bnic m64049b(Context context) {
        bnic d = m64051d(context);
        return d == null ? bnon.f131923a : d;
    }

    /* renamed from: c */
    public static synchronized bnic m64050c(Context context) {
        bnic bnic;
        synchronized (ancx.class) {
            bnic<Account> d = m64051d(context);
            if (d != null) {
                bnia j = bnic.m109500j();
                for (Account account : d) {
                    j.mo67629b(account.name);
                }
                bnic = j.mo67751a();
            } else {
                bnic = null;
            }
        }
        return bnic;
    }

    /* renamed from: d */
    public static synchronized bnic m64051d(Context context) {
        bnic a;
        synchronized (ancx.class) {
            m64048a();
            bnia j = bnic.m109500j();
            Account[] a2 = adyd.m51363a(context).mo33916a("com.google");
            for (Account account : a2) {
                if (!TextUtils.isEmpty(account.name)) {
                    j.mo67629b(account);
                }
            }
            a = j.mo67751a();
        }
        return a;
    }

    /* renamed from: a */
    public static bnic m64047a(Context context) {
        bnic c = m64050c(context);
        return c == null ? bnon.f131923a : c;
    }

    /* renamed from: a */
    private static void m64048a() {
        if (cgbb.m144161c() && ancm.f76635f.nextDouble() < cgbb.m144162d()) {
            bxvd da = amnz.f75573c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amnz amnz = (amnz) da.f164949b;
            amnz.f75576b = 2;
            amnz.f75575a |= 1;
            amnz amnz2 = (amnz) da.mo74062i();
            bxvd da2 = amoh.f75593x.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            amoh amoh = (amoh) da2.f164949b;
            amnz2.getClass();
            amoh.f75610p = amnz2;
            amoh.f75595a |= 8192;
            alml.m61286a();
            alml.m61288a(null, da2);
        }
    }
}
