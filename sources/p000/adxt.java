package p000;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.languageprofile.service.AccountsChangedIntentOperation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: adxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adxt {

    /* renamed from: a */
    private static volatile adxt f62875a;

    private adxt() {
    }

    /* renamed from: a */
    public static synchronized adxt m51334a() {
        adxt adxt;
        synchronized (adxt.class) {
            if (f62875a == null) {
                f62875a = new adxt();
            }
            adxt = f62875a;
        }
        return adxt;
    }

    /* renamed from: b */
    private static final bsix m51337b(Account account, bxvd bxvd, long j) {
        int i = ((bsix) bxvd.f164949b).f144767c;
        if (i <= 0 || i >= adwb.m51262a()) {
            long t = ceqz.f183340a.mo6606a().mo79680t();
            int s = (int) ceqz.f183340a.mo6606a().mo79679s();
            long nextInt = j + ((((long) ((int) t)) + ((long) (bmyk.f131201a.nextInt(s + s) - s))) * 1000);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsix bsix = bsix.f144763e;
            ((bsix) bxvd.f164949b).f144766b = nextInt;
        } else {
            double u = ceqz.f183340a.mo6606a().mo79681u();
            double v = ceqz.f183340a.mo6606a().mo79682v();
            if (i != 1) {
                j = ((bsix) bxvd.f164949b).f144766b;
            }
            long pow = j + ((long) (u * Math.pow((double) ((bsix) bxvd.f164949b).f144767c, v)));
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsix bsix2 = bsix.f144763e;
            ((bsix) bxvd.f164949b).f144766b = pow;
        }
        bsix bsix3 = (bsix) bxvd.mo74062i();
        m51336a(account.name, bsix3);
        return bsix3;
    }

    /* renamed from: c */
    public static final bxvd m51339c(String str) {
        bsix bsix;
        String string = m51345f().getString(str, null);
        if (string != null) {
            try {
                bsix = (bsix) bxvk.m124014a(bsix.f144763e, Base64.decode(string, 0));
            } catch (bxwf e) {
                bsix = bsix.f144763e;
            }
            bxvd bxvd = (bxvd) bsix.mo74142c(5);
            bxvd.mo73625a((bxvk) bsix);
            bsjk bsjk = ((bsix) bxvd.f164949b).f144765a;
            if (bsjk != null) {
                long j = bsjk.f144809c;
                if (j > 0 && j < System.currentTimeMillis() - (ceqz.f183340a.mo6606a().mo79686z() * 1000)) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    ((bsix) bxvd.f164949b).f144765a = null;
                }
            }
            return bxvd;
        }
        bsix bsix2 = bsix.f144763e;
        bxvd bxvd2 = (bxvd) bsix2.mo74142c(5);
        bxvd2.mo73625a((bxvk) bsix2);
        return bxvd2;
    }

    /* renamed from: d */
    public static final synchronized bngx m51341d() {
        synchronized (adxt.class) {
            bmxv a = adwg.m51268a();
            if (!a.mo66813a()) {
                bngx e = bngx.m109376e();
                return e;
            }
            bngs j = bngx.m109377j();
            Account[] accountArr = (Account[]) a.mo66814b();
            for (Account account : accountArr) {
                if (!((bsix) m51339c(account.name).f164949b).f144768d) {
                    j.mo67668c(account.name);
                }
            }
            bngx a2 = j.mo67664a();
            return a2;
        }
    }

    /* renamed from: e */
    public static final synchronized void m51343e() {
        synchronized (adxt.class) {
            bmxv a = adwg.m51268a();
            if (a.mo66813a()) {
                Account[] accountArr = (Account[]) a.mo66814b();
                for (Account account : accountArr) {
                    bxvd c = m51339c(account.name);
                    if (c.f164950c) {
                        c.mo74035c();
                        c.f164950c = false;
                    }
                    bsix bsix = bsix.f144763e;
                    ((bsix) c.f164949b).f144768d = false;
                    m51336a(account.name, (bsix) c.mo74062i());
                }
            }
        }
    }

    /* renamed from: f */
    private static final SharedPreferences m51345f() {
        return rpr.m34216b().getSharedPreferences("languageprofile.service.UserLanguageProfile", 0);
    }

    /* renamed from: a */
    public static bsjk m51335a(bsiy bsiy) {
        bsjk bsjk = ((bsix) bsiy).f144765a;
        return bsjk == null ? bsjk.f144805d : bsjk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[SYNTHETIC, Splitter:B:23:0x0046] */
    /* renamed from: f */
    static final synchronized List m51346f(String str) {
        List emptyList;
        synchronized (adxt.class) {
            bmxv a = adwg.m51269a(str);
            if (!a.mo66813a()) {
                List emptyList2 = Collections.emptyList();
                return emptyList2;
            }
            bsjk bsjk = ((bsix) m51339c(((Account) a.mo66814b()).name).f164949b).f144765a;
            if (bsjk != null) {
                bsjj bsjj = bsjk.f144808b;
                if (bsjj != null) {
                    emptyList = bsjj.f144804d;
                }
                if (!cere.f183373a.mo6606a().mo79691d()) {
                }
            } else if (!cere.f183373a.mo6606a().mo79691d()) {
                List singletonList = Collections.singletonList(cere.m138101b());
                return singletonList;
            } else {
                emptyList = Collections.emptyList();
            }
        }
    }

    /* renamed from: a */
    private static final void m51336a(String str, bsix bsix) {
        String encodeToString = Base64.encodeToString(bsix.mo73642k(), 0);
        SharedPreferences.Editor edit = m51345f().edit();
        edit.putString(str, encodeToString);
        edit.apply();
    }

    /* renamed from: a */
    public final synchronized bsix mo33878a(Account account) {
        bxvd c = m51339c(account.name);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis <= ((bsix) c.f164949b).f144766b) {
            bsix bsix = (bsix) c.mo74062i();
            m51336a(account.name, bsix);
            return bsix;
        } else if (ceqz.m138038g()) {
            try {
                return (bsix) advu.m51251a().mo34061a(advd.SYNC_ID_ULP_DOWNLOAD, account).mo34066a(new adxq(this, account, c, currentTimeMillis), 1, advu.m51253c()).get();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new aaaj(14, "Download thread interrupted", null, e);
            } catch (ExecutionException e2) {
                throw new aaaj(8, "Downloading and storing settings failed", null, e2);
            }
        } else {
            return mo33879a(account, c, currentTimeMillis);
        }
    }

    /* renamed from: d */
    public static final synchronized void m51342d(String str) {
        synchronized (adxt.class) {
            SharedPreferences.Editor edit = m51345f().edit();
            edit.remove(str);
            edit.apply();
        }
    }

    /* renamed from: e */
    public static final synchronized void m51344e(String str) {
        synchronized (adxt.class) {
            bmxv a = adwg.m51269a(str);
            if (a.mo66813a()) {
                bxvd c = m51339c(((Account) a.mo66814b()).name);
                if (c.f164950c) {
                    c.mo74035c();
                    c.f164950c = false;
                }
                bsix bsix = bsix.f144763e;
                ((bsix) c.f164949b).f144768d = true;
                m51336a(((Account) a.mo66814b()).name, (bsix) c.mo74062i());
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnec.a(java.util.Collection, bmxj):java.util.Collection
     arg types: [java.util.List, bmxj]
     candidates:
      bnec.a(java.util.Collection, bmxz):java.util.Collection
      bnec.a(java.util.Collection, java.lang.Object):boolean
      bnec.a(java.util.Collection, java.util.Collection):boolean
      bnec.a(java.util.Collection, bmxj):java.util.Collection */
    /* renamed from: c */
    public static final synchronized List m51340c() {
        ArrayList a;
        synchronized (adxt.class) {
            bmxv a2 = adwg.m51268a();
            a = bnkn.m109663a(m51345f().getAll().keySet());
            if (a2.mo66813a()) {
                a.removeAll(bnec.m109116a((Collection) Arrays.asList((Account[]) a2.mo66814b()), adxp.f62869a));
            }
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* renamed from: a */
    public final bsix mo33879a(Account account, bxvd bxvd, long j) {
        bmxv bmxv;
        adwm a = adwm.m51286a(rpr.m34216b());
        if (!ceqz.m138036e()) {
            bmxv = bmxv.m108566b(bsjk.f144805d);
        } else {
            try {
                ClientContext a2 = a.mo33869a(account);
                adwn adwn = a.f62836a;
                bsir bsir = bsir.f144748a;
                if (adwn.f62839c == null) {
                    adwn.f62839c = chtv.m149566a(chtu.UNARY, "i18n.language_profile.mobile.MobileUlpService/GetUserLanguageProfile", ciie.m150370a(bsir.f144748a), ciie.m150370a(bsis.f144750b));
                }
                bsjk bsjk = ((bsis) adwn.f62841a.mo25553a(adwn.f62839c, a2, bsir, (long) adwn.f62838b, TimeUnit.MILLISECONDS)).f144752a;
                if (bsjk == null) {
                    bsjk = bsjk.f144805d;
                }
                bmxv = bmxv.m108567c(bsjk);
            } catch (gid | IOException e) {
                Log.e("LangProfileGrpcService", "Authentication failure.", e);
                bmxv = bmvz.f131120a;
                a.mo33870a();
                if (!ceqz.m138036e()) {
                }
            } catch (chuw | chux e2) {
                Log.e("LangProfileGrpcService", "Request failure.", e2);
                bmxv = bmvz.f131120a;
                a.mo33870a();
                if (!ceqz.m138036e()) {
                }
            }
        }
        a.mo33870a();
        if (!ceqz.m138036e()) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsix bsix = bsix.f144763e;
            ((bsix) bxvd.f164949b).f144767c = 0;
            bsix bsix2 = (bsix) bxvd.mo74062i();
            m51336a(account.name, bsix2);
            return bsix2;
        }
        if (bmxv.mo66813a()) {
            bsjk bsjk2 = (bsjk) bmxv.mo66814b();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsix bsix3 = (bsix) bxvd.f164949b;
            bsix bsix4 = bsix.f144763e;
            bsjk2.getClass();
            bsix3.f144765a = bsjk2;
            bsix3.f144767c = 0;
        } else {
            int min = Math.min(((bsix) bxvd.f164949b).f144767c + 1, adwb.m51262a());
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsix bsix5 = bsix.f144763e;
            ((bsix) bxvd.f164949b).f144767c = min;
        }
        return m51337b(account, bxvd, j);
    }

    /* renamed from: b */
    public static void m51338b() {
        if (ceqz.f183340a.mo6606a().mo79683w()) {
            rpr.m34216b().startService(AccountsChangedIntentOperation.m66808a(rpr.m34216b()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo33882b(String str) {
        bmxv a = adwg.m51269a(str);
        if (a.mo66813a()) {
            if (ceqz.m138038g()) {
                try {
                    ((bqfl) bqdx.m112674a(bqdf.m112619a(bqdx.m112674a(bqfl.m112747c(advu.m51251a().mo34080b(advd.SYNC_ID_ULP_DOWNLOAD, (Account) a.mo66814b())), adxm.f62867a, bqfb.INSTANCE), IOException.class, adxn.f62868a, bqfb.INSTANCE), new adxo(), bqfb.INSTANCE)).get();
                } catch (InterruptedException | ExecutionException e) {
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    Log.e("StateManager", "Failed to schedule a one time download sync");
                    throw new RuntimeException(e);
                }
            } else {
                mo33879a((Account) a.mo66814b(), m51339c(((Account) a.mo66814b()).name), System.currentTimeMillis());
            }
        }
    }

    /* renamed from: a */
    public final bsjk mo33880a(String str) {
        bmxv a = adwg.m51269a(str);
        if (!a.mo66813a()) {
            String valueOf = String.valueOf(str);
            throw new aaaj(5, valueOf.length() == 0 ? new String("Account is not available: ") : "Account is not available: ".concat(valueOf));
        }
        bsix a2 = mo33878a((Account) a.mo66814b());
        if (!a2.f144768d) {
            m51338b();
        }
        return m51335a(a2);
    }

    /* renamed from: a */
    public final synchronized void mo33881a(String str, bsjk bsjk) {
        bmxv a = adwg.m51269a(str);
        if (a.mo66813a()) {
            bxvd c = m51339c(((Account) a.mo66814b()).name);
            if (c.f164950c) {
                c.mo74035c();
                c.f164950c = false;
            }
            bsix bsix = (bsix) c.f164949b;
            bsix bsix2 = bsix.f144763e;
            bsjk.getClass();
            bsix.f144765a = bsjk;
            bsix.f144767c = 0;
            m51337b((Account) a.mo66814b(), c, System.currentTimeMillis());
        }
    }
}
