package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: bgye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgye implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: e */
    public static boolean f117996e = false;

    /* renamed from: f */
    public static final Object f117997f = new Object();

    /* renamed from: g */
    private static WeakReference f117998g = new WeakReference(null);

    /* renamed from: a */
    public final bgyj f117999a;

    /* renamed from: b */
    public final bgyh f118000b;

    /* renamed from: c */
    public final bfke f118001c;

    /* renamed from: d */
    public final bgyp f118002d;

    /* renamed from: h */
    private final Random f118003h;

    /* renamed from: i */
    private final Map f118004i;

    /* renamed from: j */
    private final Map f118005j;

    /* renamed from: k */
    private final Context f118006k;

    /* renamed from: l */
    private final bgze f118007l;

    /* renamed from: m */
    private List f118008m = null;

    private bgye(bgyj bgyj, bgyh bgyh, bgyp bgyp, bfke bfke, Random random, Context context, bgze bgze) {
        this.f117999a = bgyj;
        this.f118000b = bgyh;
        this.f118002d = bgyp;
        this.f118001c = bfke;
        this.f118003h = random;
        this.f118004i = new HashMap();
        this.f118005j = new HashMap();
        this.f118006k = context;
        this.f118007l = bgze;
        bgyj.f118059b.registerOnSharedPreferenceChangeListener(this);
        bgyh.f118032a.registerOnSharedPreferenceChangeListener(this);
        this.f118008m = new ArrayList();
        for (Account account : ((bfkd) this.f118001c).f114281b) {
            this.f118008m.add(new bgym(account, this.f118000b));
        }
        if (this.f118000b.f118032a.getInt("disable_ulr_key", -1) == -1) {
            mo63366c();
        }
    }

    /* renamed from: a */
    public static bgye m100307a(Context context) {
        bgye bgye;
        synchronized (f117997f) {
            bgye = (bgye) f117998g.get();
            if (bgye == null) {
                bgze bgze = new bgze(context);
                bfkd a = bfkd.m97106a(context);
                bgyp bgyp = new bgyp(context);
                bgye = new bgye(new bgyj(context, context.getSharedPreferences("ULR_USER_PREFS", 0), bgyp, a), bgyh.m100364a(context), bgyp, a, new Random(), context, bgze);
                f117998g = new WeakReference(bgye);
            }
            bgye.mo63362b(context);
        }
        return bgye;
    }

    /* renamed from: h */
    private final boolean m100308h(Account account) {
        boolean z;
        synchronized (f117997f) {
            z = true;
            if (!this.f117999a.mo63420q(account)) {
                bgyh bgyh = this.f118000b;
                if (!bgyh.f118032a.contains(bgyh.m100366c(account)) && !bgyh.f118032a.contains(bgyh.m100365b(account)) && !bgyh.f118032a.contains(bgyh.m100368e(account))) {
                    if (!bgyh.f118032a.contains(bgyh.m100369f(account))) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo63358a(boolean z) {
        return this.f118000b.mo63410a(z ? 1 : 0, "wifi_enabled_key");
    }

    /* renamed from: b */
    public final int mo63359b(Account account) {
        int intValue;
        mo63367d(account);
        synchronized (f117997f) {
            Integer a = this.f118000b.mo63409a(account);
            if (a == null) {
                a = Integer.valueOf(this.f118003h.nextInt());
                if (!f117996e) {
                    String valueOf = String.valueOf(a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Create new device tag of ");
                    sb.append(valueOf);
                    sb.append(" without device reboot");
                    bgur.m100018b("GCoreUlr", 65538, sb.toString());
                } else {
                    String valueOf2 = String.valueOf(a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 46);
                    sb2.append("Create new device tag of ");
                    sb2.append(valueOf2);
                    sb2.append(" after device reboot.");
                    bgur.m100018b("GCoreUlr", 65537, sb2.toString());
                    f117996e = false;
                }
                bgyh bgyh = this.f118000b;
                int intValue2 = a.intValue();
                if (bgyh.mo63409a(account) != null) {
                    String a2 = aeqm.m52397a(account);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a2).length() + 62);
                    sb3.append("Assigning new device tag to account ");
                    sb3.append(a2);
                    sb3.append(" with existing device tag.");
                    bgur.m100024c("GCoreUlr", 22, sb3.toString());
                }
                String c = bgyh.m100366c(account);
                SharedPreferences.Editor edit = bgyh.f118032a.edit();
                edit.putInt(c, intValue2);
                edit.apply();
                mo63364c(account);
                if (this.f118000b.mo63409a(account) != null) {
                    if (this.f118000b.mo63409a(account).intValue() == a.intValue()) {
                    }
                }
                String valueOf3 = String.valueOf(aeqm.m52397a(account));
                bgur.m100018b("GCoreUlr", (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE, valueOf3.length() == 0 ? new String("GcmId shared preference save error for account ") : "GcmId shared preference save error for account ".concat(valueOf3));
            }
            intValue = a.intValue();
        }
        return intValue;
    }

    /* renamed from: c */
    public final void mo63364c(Account account) {
        synchronized (f117997f) {
            bgyh bgyh = this.f118000b;
            String e = bgyh.m100368e(account);
            if (bgyh.f118032a.contains(e)) {
                SharedPreferences.Editor edit = bgyh.f118032a.edit();
                edit.remove(e);
                edit.apply();
                String valueOf = String.valueOf(aeqm.m52397a(account));
                bgur.m100011a("GCoreUlr", valueOf.length() == 0 ? new String("Cleared GCM upload time for ") : "Cleared GCM upload time for ".concat(valueOf));
            }
            ReportingSyncChimeraService.m117310a(account, "GcmIdChanged", this.f118006k);
        }
    }

    /* renamed from: e */
    public final boolean mo63368e(Account account) {
        return this.f117999a.f118059b.getBoolean(bgyj.m100392s(account), false);
    }

    /* renamed from: f */
    public final int mo63369f(Account account) {
        bgym bgym;
        if (account == null) {
            return -1;
        }
        List list = this.f118008m;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bgym = null;
                break;
            }
            bgym = (bgym) list.get(i);
            i++;
            if (account.equals(bgym.f118083c)) {
                break;
            }
        }
        if (bgym == null) {
            bgym = new bgym(account, this.f118000b);
            this.f118008m.add(bgym);
        }
        if (bgym.f118082b == 0) {
            bgyh bgyh = bgym.f118084d;
            int i2 = bgyh.f118032a.getInt(bgyh.m100367d(bgym.f118083c), 0);
            bgym.f118082b = i2;
            int i3 = i2 + 1;
            bgym.f118082b = i3;
            synchronized (bgym.f118085e) {
                bgyh bgyh2 = bgym.f118084d;
                String d = bgyh.m100367d(bgym.f118083c);
                SharedPreferences.Editor edit = bgyh2.f118032a.edit();
                edit.putInt(d, i3);
                edit.apply();
            }
        }
        return bgym.f118082b;
    }

    /* renamed from: g */
    public final int mo63370g(Account account) {
        bgym bgym;
        List list = this.f118008m;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bgym = null;
                break;
            }
            bgym = (bgym) list.get(i);
            i++;
            if (account.equals(bgym.f118083c)) {
                break;
            }
        }
        if (bgym == null) {
            bgym = new bgym(account, this.f118000b);
            this.f118008m.add(bgym);
        }
        int i2 = bgym.f118081a;
        bgym.f118081a = i2 + 1;
        return i2;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (f117997f) {
            Object obj = sharedPreferences.getAll().get(str);
            if (this.f118004i.containsKey(str)) {
                Object obj2 = this.f118004i.get(str);
                if (obj2 != obj) {
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                        }
                        this.f118004i.put(str, obj);
                        this.f118005j.clear();
                    }
                }
            }
            this.f118004i.put(str, obj);
            this.f118005j.clear();
        }
    }

    /* renamed from: d */
    public final void mo63367d(Account account) {
        int i = Build.VERSION.SDK_INT;
        synchronized (f117997f) {
            if (!m100308h(account)) {
                bfke bfke = this.f118001c;
                int i2 = Build.VERSION.SDK_INT;
                adyd adyd = ((bfkd) bfke).f114280a;
                bljb a = blkh.m107281a("AccountManager.getPreviousName");
                try {
                    String previousName = adyd.f62893a.getPreviousName(account);
                    if (a != null) {
                        a.close();
                    }
                    if (previousName != null) {
                        Account account2 = new Account(previousName, account.type);
                        if (m100308h(account2)) {
                            String a2 = aeqm.m52397a(account2);
                            String a3 = aeqm.m52397a(account);
                            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 21 + String.valueOf(a3).length());
                            sb.append("Renaming account ");
                            sb.append(a2);
                            sb.append(" to ");
                            sb.append(a3);
                            bgur.m100020b("GCoreUlr", sb.toString());
                            synchronized (f117997f) {
                                bgyj bgyj = this.f117999a;
                                SharedPreferences.Editor edit = bgyj.f118059b.edit();
                                bgzo.m100474b(bgyj.f118059b, bgyj.m100381a(account2), bgyj.m100381a(account), edit);
                                bgzo.m100474b(bgyj.f118059b, bgyj.m100386g(account2), bgyj.m100386g(account), edit);
                                bgzo.m100461a(bgyj.f118059b, bgyj.m100387j(account2), bgyj.m100387j(account), edit);
                                bgzo.m100474b(bgyj.f118059b, bgyj.m100388k(account2), bgyj.m100388k(account), edit);
                                bgzo.m100461a(bgyj.f118059b, bgyj.m100389n(account2), bgyj.m100389n(account), edit);
                                bgzo.m100477d(bgyj.f118059b, bgyj.m100382b(account2), bgyj.m100382b(account), edit);
                                bgzo.m100477d(bgyj.f118059b, bgyj.m100383c(account2), bgyj.m100383c(account), edit);
                                bgzo.m100475c(bgyj.f118059b, bgyj.m100384e(account2), bgyj.m100384e(account), edit);
                                bgzo.m100474b(bgyj.f118059b, bgyj.m100390o(account2), bgyj.m100390o(account), edit);
                                bgzo.m100475c(bgyj.f118059b, bgyj.m100385f(account2), bgyj.m100385f(account), edit);
                                edit.apply();
                                bgyi.m100379b(account2);
                                bgzo.m100460a(bgyj.f118059b, account2);
                                bgyh bgyh = this.f118000b;
                                SharedPreferences.Editor edit2 = bgyh.f118032a.edit();
                                bgzo.m100475c(bgyh.f118032a, bgyh.m100366c(account2), bgyh.m100366c(account), edit2);
                                bgzo.m100477d(bgyh.f118032a, bgyh.m100365b(account2), bgyh.m100365b(account), edit2);
                                bgzo.m100477d(bgyh.f118032a, bgyh.m100368e(account2), bgyh.m100368e(account), edit2);
                                bgzo.m100477d(bgyh.f118032a, bgyh.m100369f(account2), bgyh.m100369f(account), edit2);
                                bgzo.m100474b(bgyh.f118032a, bgyh.m100370g(account2), bgyh.m100370g(account), edit2);
                                edit2.apply();
                                bgyi.m100379b(account2);
                                bgzo.m100460a(bgyh.f118032a, account2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
        }
        return;
        throw th;
    }

    /* renamed from: c */
    public final void mo63365c(Account account, boolean z) {
        bgyj bgyj = this.f117999a;
        String u = bgyj.m100394u(account);
        SharedPreferences.Editor edit = bgyj.f118059b.edit();
        edit.putBoolean(u, z);
        edit.apply();
    }

    /* renamed from: c */
    public final boolean mo63366c() {
        return this.f118000b.mo63410a(chcs.m148233e() ? 1 : 0, "disable_ulr_key");
    }

    /* renamed from: a */
    public final AccountConfig mo63353a(Account account) {
        AccountConfig accountConfig;
        Long l;
        mo63367d(account);
        int b = mo63359b(account);
        synchronized (f117997f) {
            Map map = this.f118005j;
            Integer valueOf = Integer.valueOf(b);
            accountConfig = (AccountConfig) map.get(valueOf);
            if (accountConfig != null) {
                bgyj bgyj = this.f117999a;
                if (accountConfig.f150893d == bgyj.f118061d.mo61825a(accountConfig.f150890a) && accountConfig.f150902m.equals(bgyj.f118060c.mo63429a())) {
                }
            }
            bgyk a = AccountConfig.m117314a(account);
            this.f117999a.mo63412a(account, a);
            bgyh bgyh = this.f118000b;
            String e = bgyh.m100368e(account);
            Long l2 = null;
            if (bgyh.f118032a.contains(e)) {
                l = Long.valueOf(bgyh.f118032a.getLong(e, 0));
            } else {
                l = null;
            }
            a.f118077p = l;
            String f = bgyh.m100369f(account);
            if (bgyh.f118032a.contains(f)) {
                l2 = Long.valueOf(bgyh.f118032a.getLong(f, 0));
            }
            a.f118078q = l2;
            a.mo63423a(bgyh.f118032a.getBoolean(bgyh.m100370g(account), true));
            a.mo63422a(b);
            accountConfig = a.mo63421a();
            this.f118005j.put(valueOf, accountConfig);
        }
        return accountConfig;
    }

    /* renamed from: b */
    public final void mo63360b() {
        for (Account account : ((bfkd) this.f118001c).f114281b) {
            mo63367d(account);
        }
    }

    /* renamed from: b */
    public final void mo63361b(Account account, boolean z) {
        bgyj bgyj = this.f117999a;
        String t = bgyj.m100393t(account);
        SharedPreferences.Editor edit = bgyj.f118059b.edit();
        edit.putBoolean(t, z);
        edit.apply();
    }

    /* renamed from: b */
    public final boolean mo63362b(Context context) {
        return this.f118000b.mo63410a(aeri.m52438c(context), "location_enabled_key");
    }

    /* renamed from: b */
    public final boolean mo63363b(boolean z) {
        return this.f118000b.mo63410a(z ? 1 : 0, "Location_airplane_mode_enabled_key");
    }

    /* renamed from: a */
    public final ReportingConfig mo63354a() {
        ReportingConfig reportingConfig;
        mo63360b();
        synchronized (f117997f) {
            ArrayList arrayList = new ArrayList();
            for (Account account : ((bfkd) this.f118001c).f114281b) {
                arrayList.add(mo63353a(account));
            }
            reportingConfig = new ReportingConfig(arrayList, this.f118002d.mo63429a());
        }
        return reportingConfig;
    }

    /* renamed from: a */
    public final void mo63355a(Account account, long j) {
        bgyh bgyh = this.f118000b;
        String f = bgyh.m100369f(account);
        SharedPreferences.Editor edit = bgyh.f118032a.edit();
        edit.putLong(f, j);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo63356a(Account account, boolean z) {
        bgyj bgyj = this.f117999a;
        String s = bgyj.m100392s(account);
        SharedPreferences.Editor edit = bgyj.f118059b.edit();
        edit.putBoolean(s, z);
        edit.apply();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgye.a(android.accounts.Account, boolean):void
     arg types: [android.accounts.Account, int]
     candidates:
      bgye.a(android.accounts.Account, long):void
      bgye.a(android.accounts.Account, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01e3, code lost:
        if (r9.f118119i != null) goto L_0x01e5;
     */
    /* renamed from: a */
    public final boolean mo63357a(String str, bgys bgys, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        AccountConfig a;
        String str3 = str;
        bgys bgys2 = bgys;
        mo63367d(bgys2.f118111a);
        if (chcs.m148243o()) {
            Boolean bool = bgys2.f118119i;
            if (bool != null) {
                if (!bool.equals(bgys2.f118118h)) {
                    bgys2.mo63442a(bgys2.f118119i.booleanValue());
                    bgys.mo63441a();
                    bguv.m100042a("UlrLhLrMerge");
                }
            } else if (!(bgys2.f118118h == null || (a = mo63353a(bgys2.f118111a)) == null || a.f150896g == bgys2.f118118h.booleanValue())) {
                bgys2.mo63442a(a.f150896g);
                bgys.mo63441a();
            }
        }
        if (chcs.m148233e() && bgys2.f118114d && !(bgys2.f118118h == null && bgys2.f118119i == null)) {
            mo63356a(bgys2.f118111a, true);
        }
        synchronized (f117997f) {
            bgyj bgyj = this.f117999a;
            AccountConfig p = bgyj.mo63419p(bgys2.f118111a);
            if (!p.mo70911f()) {
                String valueOf = String.valueOf(bgys);
                String valueOf2 = String.valueOf(p);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(str2).length() + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
                sb.append("Blocking ");
                sb.append(str3);
                sb.append(" (");
                sb.append(str2);
                sb.append(") ");
                sb.append(valueOf);
                sb.append(" for ");
                sb.append(valueOf2);
                bgur.m100008a("GCoreUlr", 24, sb.toString());
                z = false;
            } else {
                if (p.f150891b && !bgys2.f118113c) {
                    Long l = bgys2.f118112b;
                    String valueOf3 = String.valueOf(bgys);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(valueOf3).length());
                    sb2.append("update(");
                    sb2.append(str3);
                    sb2.append(", ");
                    sb2.append(valueOf3);
                    sb2.append(") must provide referenceUpdateNumber");
                    sdo.m34966a(l, sb2.toString());
                    if (bgys2.f118112b.longValue() != p.f150892c) {
                        String valueOf4 = String.valueOf(bgys);
                        long j = p.f150892c;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 89);
                        sb3.append("UserPreferences.updateEditor(");
                        sb3.append(valueOf4);
                        sb3.append("): aborting to preserve local change at ");
                        sb3.append(j);
                        bgur.m100011a("GCoreUlr", sb3.toString());
                        z = false;
                    }
                }
                if (bgys2.f118114d) {
                    if (p.f150908s == 2) {
                        String valueOf5 = String.valueOf(bgys);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 60);
                        sb4.append("Attempted to change settings for Unicorn read-only account: ");
                        sb4.append(valueOf5);
                        bgur.m100018b("GCoreUlr", 25, sb4.toString());
                        z = false;
                    }
                }
                String valueOf6 = String.valueOf(bgys);
                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(valueOf6).length());
                sb5.append("UserPreferences.update(");
                sb5.append(str3);
                sb5.append(", ");
                sb5.append(valueOf6);
                sb5.toString();
                SharedPreferences.Editor edit = bgyj.f118059b.edit();
                Account account = bgys2.f118111a;
                edit.putLong(bgyj.m100383c(account), bgyj.mo63414d(account) + 1);
                edit.remove(bgyi.m100376a(account).f118045l);
                if (bgys2.f118118h != null) {
                }
                edit.putBoolean("defined", true);
                edit.remove(bgyi.m100376a(account).f118041h);
                if (bgys2.f118124n != null) {
                    edit.putBoolean(bgyj.m100381a(account), bgys2.f118124n.booleanValue());
                }
                if (bgys2.f118122l != null) {
                    edit.putLong(bgyj.m100382b(account), bgys2.f118122l.longValue());
                }
                if (bgys2.f118123m != null) {
                    edit.putInt(bgyj.m100384e(account), bgys2.f118123m.intValue());
                }
                if (bgys2.f118126p != null) {
                    edit.putBoolean(bgyj.m100390o(account), bgys2.f118126p.booleanValue());
                }
                if (bgys2.f118127q != null) {
                    edit.putInt(bgyj.m100385f(account), bgys2.f118127q.intValue());
                }
                Account account2 = bgys2.f118111a;
                Boolean bool2 = bgys2.f118118h;
                if (bool2 != null) {
                    boolean booleanValue = bool2.booleanValue();
                    z2 = !bgyj.mo63415h(account2) || bgyj.mo63416i(account2) != booleanValue;
                    edit.putBoolean(bgyj.m100386g(account2), booleanValue);
                } else {
                    z2 = false;
                }
                if (bgys2.f118121k) {
                    edit.putString(bgyj.m100387j(account2), "com.google.android.gms+not-dirty");
                } else if (z2) {
                    edit.putString(bgyj.m100387j(account2), bgys2.f118120j);
                    if (stm.m36302d(bgys2.f118120j) && chcs.m148254z()) {
                        String valueOf7 = String.valueOf(bgys2.f118118h);
                        StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf7).length() + 29);
                        sb6.append("null source for LR switch to ");
                        sb6.append(valueOf7);
                        bguz.m100120a(new RuntimeException(sb6.toString()));
                    }
                }
                Account account3 = bgys2.f118111a;
                Boolean bool3 = bgys2.f118119i;
                if (bool3 != null) {
                    boolean booleanValue2 = bool3.booleanValue();
                    if (!bgyj.mo63417l(account3) || bgyj.mo63418m(account3) != booleanValue2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    edit.putBoolean(bgyj.m100388k(account3), booleanValue2);
                } else {
                    z3 = false;
                }
                if (bgys2.f118121k) {
                    edit.putString(bgyj.m100389n(account3), "com.google.android.gms+not-dirty");
                } else if (z3) {
                    edit.putString(bgyj.m100389n(account3), bgys2.f118120j);
                    if (stm.m36302d(bgys2.f118120j) && chcs.m148254z()) {
                        String valueOf8 = String.valueOf(bgys2.f118118h);
                        StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf8).length() + 29);
                        sb7.append("null source for LH switch to ");
                        sb7.append(valueOf8);
                        bguz.m100120a(new RuntimeException(sb7.toString()));
                    }
                }
                bgyj.mo63413a(edit, bgys2.f118114d, str, str2, bgys2.f118125o);
                if (!bgys2.f118117g) {
                    Account account4 = bgys2.f118111a;
                    if (Boolean.TRUE.equals(bgys2.f118124n) && bgyj.f118061d.mo61825a(account4)) {
                        if (!bgys2.f118114d) {
                            if (!bgys2.f118116f) {
                                ReportingSyncChimeraService.m117310a(account4, str3, bgyj.f118058a);
                            }
                        }
                        Context context = bgyj.f118058a;
                        Boolean bool4 = bgys2.f118118h;
                        Boolean bool5 = bgys2.f118119i;
                        String str4 = bgys2.f118128r;
                        String a2 = aeqm.m52397a(account4);
                        StringBuilder sb8 = new StringBuilder(String.valueOf(a2).length() + 45 + String.valueOf(str).length() + String.valueOf(str4).length());
                        sb8.append("Requesting insistent sync for ");
                        sb8.append(a2);
                        sb8.append(": ");
                        sb8.append(str3);
                        sb8.append(", auditToken=");
                        sb8.append(str4);
                        sb8.toString();
                        bgzo.m100465a(context, bgxm.m100243a(context, str, account4, bool4, bool5, false, str4));
                        z = true;
                    }
                }
                z = true;
            }
        }
        if (!z || !bgys2.f118129s) {
            return z;
        }
        bgze bgze = this.f118007l;
        Account account5 = bgys2.f118111a;
        String str5 = bgys2.f118128r;
        String str6 = bgys2.f118120j;
        Boolean bool6 = bgys2.f118119i;
        Boolean bool7 = bgys2.f118118h;
        if (chcs.m148235g()) {
            byte[] bArr = null;
            if (!bmxx.m108577a(str5)) {
                try {
                    bArr = Base64.decode(str5, 8);
                } catch (IllegalArgumentException e) {
                    IllegalArgumentException illegalArgumentException = e;
                    if (Log.isLoggable("GCoreUlr", 6)) {
                        Log.e("GCoreUlr", "Failed to parse AuditToken", illegalArgumentException);
                    }
                }
            }
            bsqv bsqv = (bsqv) bsqw.f146695g.mo74144da();
            bxvd da = bsrf.f146744d.mo74144da();
            bsmz bsmz = bsmz.LOCATION_HISTORY_SETTING_CHANGE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsrf bsrf = (bsrf) da.f164949b;
            bsrf.f146747b = bsmz.f146213dO;
            bsrf.f146746a |= 1;
            bxvd da2 = bsqk.f146657e.mo74144da();
            int i = 3;
            if (bool6 != null) {
                bxvd da3 = bssl.f146873c.mo74144da();
                int i2 = !bool6.booleanValue() ? 3 : 2;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bssl bssl = (bssl) da3.f164949b;
                bssl.f146876b = i2 - 1;
                bssl.f146875a |= 1;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bsqk bsqk = (bsqk) da2.f164949b;
                bssl bssl2 = (bssl) da3.mo74062i();
                bssl2.getClass();
                bsqk.f146660b = bssl2;
                bsqk.f146659a |= 1;
            }
            if (bool7 != null) {
                bxvd da4 = bssl.f146873c.mo74144da();
                if (bool7.booleanValue()) {
                    i = 2;
                }
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bssl bssl3 = (bssl) da4.f164949b;
                bssl3.f146876b = i - 1;
                bssl3.f146875a |= 1;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bsqk bsqk2 = (bsqk) da2.f164949b;
                bssl bssl4 = (bssl) da4.mo74062i();
                bssl4.getClass();
                bsqk2.f146661c = bssl4;
                bsqk2.f146659a |= 2;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsqk bsqk3 = (bsqk) da2.f164949b;
            str6.getClass();
            bsqk3.f146659a |= 4;
            bsqk3.f146662d = str6;
            bxvd da5 = bsrg.f146749m.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bsrg bsrg = (bsrg) da5.f164949b;
            bsqk bsqk4 = (bsqk) da2.mo74062i();
            bsqk4.getClass();
            bsrg.f146754d = bsqk4;
            bsrg.f146751a |= 2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsrf bsrf2 = (bsrf) da.f164949b;
            bsrg bsrg2 = (bsrg) da5.mo74062i();
            bsrg2.getClass();
            bsrf2.f146748c = bsrg2;
            bsrf2.f146746a |= 2;
            if (bsqv.f164950c) {
                bsqv.mo74035c();
                bsqv.f164950c = false;
            }
            bsqw bsqw = (bsqw) bsqv.f164949b;
            bsrf bsrf3 = (bsrf) da.mo74062i();
            bsrf3.getClass();
            bsqw.f146701e = bsrf3;
            bsqw.f146697a |= 4;
            Context context2 = bgze.f118154a;
            aucf aucf = new aucf();
            new bgzd(aucf, context2, account5).start();
            aucf.f91388a.mo50382b((aubg) new bgzc(context2, bsqv, bArr, account5)).mo50371a(bgzb.f118146a);
        }
        return true;
    }
}
