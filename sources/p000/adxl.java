package p000;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: adxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adxl {

    /* renamed from: a */
    private static volatile adxl f62866a;

    private adxl() {
    }

    /* renamed from: a */
    public static synchronized adxl m51314a() {
        adxl adxl;
        synchronized (adxl.class) {
            if (f62866a == null) {
                f62866a = new adxl();
            }
            adxl = f62866a;
        }
        return adxl;
    }

    /* renamed from: b */
    private static final bsiv m51322b(String str) {
        String string = m51326d().getString(str, null);
        if (string != null) {
            try {
                bsiw bsiw = (bsiw) bxvk.m124014a(bsiw.f144758d, Base64.decode(string, 0));
                bxvd bxvd = (bxvd) bsiw.mo74142c(5);
                bxvd.mo73625a((bxvk) bsiw);
                return (bsiv) bxvd;
            } catch (bxwf e) {
                bsiv bsiv = (bsiv) bsiw.f144758d.mo74144da();
                if (bsiv.f164950c) {
                    bsiv.mo74035c();
                    bsiv.f164950c = false;
                }
                bsiw bsiw2 = (bsiw) bsiv.f164949b;
                bsiw2.f144761b = false;
                bsiw2.f144762c = 0;
                return bsiv;
            }
        } else {
            bsiv bsiv2 = (bsiv) bsiw.f144758d.mo74144da();
            if (bsiv2.f164950c) {
                bsiv2.mo74035c();
                bsiv2.f164950c = false;
            }
            bsiw bsiw3 = (bsiw) bsiv2.f164949b;
            bsiw3.f144761b = false;
            bsiw3.f144762c = 0;
            return bsiv2;
        }
    }

    /* renamed from: c */
    static final synchronized void m51325c() {
        synchronized (adxl.class) {
            List b = m51323b();
            ArrayList arrayList = new ArrayList();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                String str = (String) b.get(i);
                try {
                    if (Log.isLoggable("LSStateManager", 4)) {
                        String valueOf = String.valueOf(str);
                        Log.i("LSStateManager", valueOf.length() == 0 ? new String("remove language settings for deleted account ") : "remove language settings for deleted account ".concat(valueOf));
                    }
                    m51320a(str);
                } catch (Exception e) {
                    arrayList.add(e);
                }
            }
            if (!arrayList.isEmpty()) {
                throw adwk.m51281a("Exception while wiping out data for deleted accounts", arrayList);
            }
        }
    }

    /* renamed from: d */
    private static final SharedPreferences m51326d() {
        return rpr.m34216b().getSharedPreferences("languageprofile.service.LanguageSettings", 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.List, adxf]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076 A[SYNTHETIC, Splitter:B:22:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f4 A[Catch:{ gid -> 0x00ea, IOException -> 0x00e8, chuw | chux -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa A[Catch:{ gid -> 0x00ea, IOException -> 0x00e8, chuw | chux -> 0x00dc }] */
    /* renamed from: a */
    public static final synchronized bbjq m51315a(Account account, List list) {
        bngx bngx;
        boolean z;
        synchronized (adxl.class) {
            bsiv b = m51322b(account.name);
            boolean z2 = ((bsiw) b.f164949b).f144761b;
            boolean z3 = !z2;
            if (z2) {
                if (System.currentTimeMillis() - ((bsiw) b.f164949b).f144762c < cere.f183373a.mo6606a().mo79693f() * 1000) {
                    bbjq a = bbjq.m88103a();
                    return a;
                }
            }
            List unmodifiableList = Collections.unmodifiableList(((bsiw) b.f164949b).f144760a);
            if (!unmodifiableList.isEmpty()) {
                if (!list.isEmpty()) {
                    bngx = bngx.m109355a(bnjd.m109586b((Iterable) unmodifiableList, (bmxz) new adxf(list)));
                    adwm a2 = adwm.m51286a(rpr.m34216b());
                    if (!cere.f183373a.mo6606a().mo79690c()) {
                        try {
                            ClientContext a3 = a2.mo33869a(account);
                            bxvd da = bsit.f144753b.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bsit bsit = (bsit) da.f164949b;
                            if (!bsit.f144755a.mo73666a()) {
                                bsit.f144755a = bxvk.m124021a(bsit.f144755a);
                            }
                            bxsy.m123078a(bngx, bsit.f144755a);
                            bsit bsit2 = (bsit) da.mo74062i();
                            adwn adwn = a2.f62836a;
                            if (adwn.f62840d == null) {
                                adwn.f62840d = chtv.m149566a(chtu.UNARY, "i18n.language_profile.mobile.MobileUlpService/SetLanguageSettings", ciie.m150370a(bsit.f144753b), ciie.m150370a(bsiu.f144756a));
                            }
                            z = ((bsiu) adwn.f62841a.mo25553a(adwn.f62840d, a3, bsit2, (long) adwn.f62838b, TimeUnit.MILLISECONDS)) != null;
                        } catch (gid e) {
                            e = e;
                            Log.e("LangProfileGrpcService", "Authentication failure.", e);
                            z = false;
                        } catch (IOException e2) {
                            e = e2;
                            Log.e("LangProfileGrpcService", "Authentication failure.", e);
                            z = false;
                        } catch (chuw | chux e3) {
                            Log.e("LangProfileGrpcService", "Request failure.", e3);
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    a2.mo33870a();
                    if (z) {
                        if (b.f164950c) {
                            b.mo74035c();
                            b.f164950c = false;
                        }
                        bsiw bsiw = bsiw.f144758d;
                        ((bsiw) b.f164949b).f144761b = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (b.f164950c) {
                            b.mo74035c();
                            b.f164950c = false;
                        }
                        ((bsiw) b.f164949b).f144762c = currentTimeMillis;
                        m51321a(account.name, (bsiw) b.mo74062i());
                    }
                    bbjp b2 = bbjq.m88104b(null);
                    b2.f102772c = z3;
                    bbjq a4 = b2.mo56173a();
                    return a4;
                }
            }
            bngx = bngx.m109376e();
            adwm a22 = adwm.m51286a(rpr.m34216b());
            if (!cere.f183373a.mo6606a().mo79690c()) {
            }
            a22.mo33870a();
            if (z) {
            }
            bbjp b22 = bbjq.m88104b(null);
            b22.f102772c = z3;
            bbjq a42 = b22.mo56173a();
            return a42;
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
    /* renamed from: b */
    static final synchronized List m51323b() {
        ArrayList a;
        synchronized (adxl.class) {
            bmxv a2 = adwg.m51268a();
            a = bnkn.m109663a(m51326d().getAll().keySet());
            if (a2.mo66813a()) {
                a.removeAll(bnec.m109116a((Collection) Arrays.asList((Account[]) a2.mo66814b()), adxa.f62857a));
            }
        }
        return a;
    }

    /* renamed from: b */
    public static final synchronized void m51324b(Account account, String str) {
        synchronized (adxl.class) {
            bsiv b = m51322b(account.name);
            int g = bnjd.m109601g(Collections.unmodifiableList(((bsiw) b.f164949b).f144760a), new adxc(str));
            if (g >= 0) {
                if (b.f164950c) {
                    b.mo74035c();
                    b.f164950c = false;
                }
                bsiw bsiw = (bsiw) b.f164949b;
                bsiw bsiw2 = bsiw.f144758d;
                bsiw.mo70625a();
                bsiw.f144760a.remove(g);
                if (b.f164950c) {
                    b.mo74035c();
                    b.f164950c = false;
                }
                ((bsiw) b.f164949b).f144761b = false;
                m51321a(account.name, (bsiw) b.mo74062i());
            }
        }
    }

    /* renamed from: a */
    public static final synchronized bmxv m51316a(Account account, String str) {
        bmxv b;
        synchronized (adxl.class) {
            bsiv b2 = m51322b(account.name);
            int g = bnjd.m109601g(Collections.unmodifiableList(((bsiw) b2.f164949b).f144760a), new adxd(str));
            b = g >= 0 ? bmxv.m108566b(b2.mo70624a(g)) : bmvz.f131120a;
        }
        return b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.ArrayList, bmxz]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxz):boolean */
    /* renamed from: a */
    public static final synchronized void m51317a(Account account) {
        synchronized (adxl.class) {
            bsiv b = m51322b(account.name);
            ArrayList a = bnkn.m109663a((Iterable) Collections.unmodifiableList(((bsiw) b.f164949b).f144760a));
            bnjd.m109580a((Iterable) a, adxe.f62861a);
            if (a.size() < ((bsiw) b.f164949b).f144760a.size()) {
                if (b.f164950c) {
                    b.mo74035c();
                    b.f164950c = false;
                }
                bsiw bsiw = bsiw.f144758d;
                ((bsiw) b.f164949b).f144760a = bxvk.m124030de();
                if (b.f164950c) {
                    b.mo74035c();
                    b.f164950c = false;
                }
                bsiw bsiw2 = (bsiw) b.f164949b;
                bsiw2.mo70625a();
                bxsy.m123078a(a, bsiw2.f144760a);
                if (b.f164950c) {
                    b.mo74035c();
                    b.f164950c = false;
                }
                ((bsiw) b.f164949b).f144761b = false;
                m51321a(account.name, (bsiw) b.mo74062i());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        return;
     */
    /* renamed from: a */
    public static final synchronized void m51318a(Account account, bsjf bsjf) {
        synchronized (adxl.class) {
            bsiv b = m51322b(account.name);
            int g = bnjd.m109601g(Collections.unmodifiableList(((bsiw) b.f164949b).f144760a), new adxb(bsjf));
            if (g >= 0) {
                bsjf a = b.mo70624a(g);
                if (!(bsjf == null && a == null)) {
                    if (bsjf != null) {
                        if (a != null) {
                            if (!bsjf.equals(a)) {
                                if (bsjf.f144786a.size() == a.f144786a.size()) {
                                    int i = 0;
                                    while (i < bsjf.f144786a.size()) {
                                        if (TextUtils.equals((String) bsjf.f144786a.get(i), (String) a.f144786a.get(i))) {
                                            i++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (b.f164950c) {
                        b.mo74035c();
                        b.f164950c = false;
                    }
                    bsiw bsiw = (bsiw) b.f164949b;
                    bsiw bsiw2 = bsiw.f144758d;
                    bsjf.getClass();
                    bsiw.mo70625a();
                    bsiw.f144760a.set(g, bsjf);
                }
            } else {
                if (b.f164950c) {
                    b.mo74035c();
                    b.f164950c = false;
                }
                bsiw bsiw3 = (bsiw) b.f164949b;
                bsiw bsiw4 = bsiw.f144758d;
                bsjf.getClass();
                bsiw3.mo70625a();
                bsiw3.f144760a.add(bsjf);
            }
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            ((bsiw) b.f164949b).f144761b = false;
            m51321a(account.name, (bsiw) b.mo74062i());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.lang.Iterable, adxg]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public static final void m51319a(Iterable iterable) {
        try {
            bqga.m112782b(bnjd.m109575a(iterable, (bmxj) new adxg())).mo69214a(new adxh(), bqfb.INSTANCE).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new aaaj(14, "Scheduling a one time sync was interrupted", null, e);
        } catch (ExecutionException e2) {
            throw new aaaj(8, "Error during scheduling a one time sync", null, e2);
        }
    }

    /* renamed from: a */
    static final synchronized void m51320a(String str) {
        synchronized (adxl.class) {
            SharedPreferences.Editor edit = m51326d().edit();
            edit.remove(str);
            edit.apply();
        }
    }

    /* renamed from: a */
    private static final void m51321a(String str, bsiw bsiw) {
        String encodeToString = Base64.encodeToString(bsiw.mo73642k(), 0);
        SharedPreferences.Editor edit = m51326d().edit();
        edit.putString(str, encodeToString);
        edit.apply();
    }
}
