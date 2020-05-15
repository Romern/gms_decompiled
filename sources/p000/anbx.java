package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;

/* renamed from: anbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum anbx implements anbw {
    INSTANCE;
    

    /* renamed from: b */
    private bnic f76605b = null;

    /* renamed from: c */
    private bnic f76606c = null;

    /* renamed from: d */
    private bnhe f76607d = null;

    private anbx(String str) {
    }

    /* renamed from: b */
    private static void m63953b() {
        if (cgbb.m144161c() && ancm.f76635f.nextDouble() < cgbb.m144162d()) {
            bxvd da = amnz.f75573c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amnz amnz = (amnz) da.f164949b;
            amnz.f75576b = 1;
            amnz.f75575a = 1 | amnz.f75575a;
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

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return r4;
     */
    /* renamed from: a */
    public final synchronized Account mo41676a(Context context, String str) {
        Account account;
        if (cgbb.m144160b()) {
            return ancx.m64046a(context, str);
        } else if (this.f76607d == null) {
            bnic<Account> b = mo41678b(context);
            if (b != null) {
                bnha h = bnhe.m109414h();
                for (Account account2 : b) {
                    h.mo67695b(account2.name, account2);
                }
                this.f76607d = h.mo67618b();
                account = (Account) this.f76607d.get(str);
            } else {
                account = null;
            }
        } else {
            m63953b();
            account = (Account) this.f76607d.get(str);
        }
    }

    /* renamed from: c */
    public final bnic mo41679c(Context context) {
        if (cgbb.m144160b()) {
            return ancx.m64047a(context);
        }
        bnic a = mo41677a(context);
        return a == null ? bnon.f131923a : a;
    }

    /* renamed from: d */
    public final bnic mo41680d(Context context) {
        if (cgbb.m144160b()) {
            return ancx.m64049b(context);
        }
        bnic b = mo41678b(context);
        return b == null ? bnon.f131923a : b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return r3;
     */
    /* renamed from: a */
    public final synchronized bnic mo41677a(Context context) {
        bnic bnic;
        if (cgbb.m144160b()) {
            return ancx.m64050c(context);
        } else if (this.f76606c == null) {
            bnic<Account> b = mo41678b(context);
            if (b != null) {
                bnia j = bnic.m109500j();
                for (Account account : b) {
                    j.mo67629b(account.name);
                }
                this.f76606c = j.mo67751a();
                bnic = this.f76606c;
            } else {
                bnic = null;
            }
        } else {
            m63953b();
            bnic = this.f76606c;
        }
    }

    /* renamed from: b */
    public final synchronized bnic mo41678b(Context context) {
        if (cgbb.m144160b()) {
            return ancx.m64051d(context);
        }
        m63953b();
        if (this.f76605b == null) {
            bnia j = bnic.m109500j();
            Account[] a = adyd.m51363a(context).mo33916a("com.google");
            for (Account account : a) {
                if (!TextUtils.isEmpty(account.name)) {
                    j.mo67629b(account);
                }
            }
            this.f76605b = j.mo67751a();
        }
        return this.f76605b;
    }

    /* renamed from: a */
    public final synchronized void mo41675a() {
        if (!cgbb.m144160b()) {
            m63953b();
            this.f76605b = null;
            this.f76606c = null;
            this.f76607d = null;
        }
    }
}
