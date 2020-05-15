package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: bgyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyj {

    /* renamed from: a */
    public final Context f118058a;

    /* renamed from: b */
    public final SharedPreferences f118059b;

    /* renamed from: c */
    public final bgyp f118060c;

    /* renamed from: d */
    public final bfke f118061d;

    public bgyj(Context context, SharedPreferences sharedPreferences, bgyp bgyp, bfke bfke) {
        this.f118058a = context;
        this.f118061d = bfke;
        this.f118060c = bgyp;
        this.f118059b = sharedPreferences;
    }

    @Deprecated
    /* renamed from: a */
    private final ReportingConfig m100380a() {
        ArrayList arrayList = new ArrayList();
        for (Account account : ((bfkd) this.f118061d).f114281b) {
            arrayList.add(mo63419p(account));
        }
        return new ReportingConfig(arrayList, this.f118060c.mo63429a());
    }

    /* renamed from: b */
    public static String m100382b(Account account) {
        return bgyi.m100376a(account).f118043j;
    }

    /* renamed from: c */
    public static String m100383c(Account account) {
        return bgyi.m100376a(account).f118044k;
    }

    /* renamed from: e */
    public static String m100384e(Account account) {
        return bgyi.m100376a(account).f118046m;
    }

    /* renamed from: f */
    public static String m100385f(Account account) {
        return bgyi.m100376a(account).f118052s;
    }

    /* renamed from: g */
    public static String m100386g(Account account) {
        return bgyi.m100376a(account).f118047n;
    }

    /* renamed from: j */
    public static String m100387j(Account account) {
        return bgyi.m100376a(account).f118048o;
    }

    /* renamed from: k */
    public static String m100388k(Account account) {
        return bgyi.m100376a(account).f118049p;
    }

    /* renamed from: n */
    public static String m100389n(Account account) {
        return bgyi.m100376a(account).f118050q;
    }

    /* renamed from: o */
    public static String m100390o(Account account) {
        return bgyi.m100376a(account).f118051r;
    }

    /* renamed from: r */
    public static String m100391r(Account account) {
        return bgyi.m100376a(account).f118054u;
    }

    /* renamed from: s */
    public static String m100392s(Account account) {
        return bgyi.m100376a(account).f118053t;
    }

    /* renamed from: t */
    public static String m100393t(Account account) {
        return bgyi.m100376a(account).f118055v;
    }

    /* renamed from: u */
    public static String m100394u(Account account) {
        return bgyi.m100376a(account).f118056w;
    }

    /* renamed from: d */
    public final long mo63414d(Account account) {
        return this.f118059b.getLong(m100383c(account), 0);
    }

    /* renamed from: h */
    public final boolean mo63415h(Account account) {
        return this.f118059b.contains(m100386g(account));
    }

    /* renamed from: i */
    public final boolean mo63416i(Account account) {
        return this.f118059b.getBoolean(m100386g(account), false);
    }

    /* renamed from: l */
    public final boolean mo63417l(Account account) {
        return this.f118059b.contains(m100388k(account));
    }

    /* renamed from: m */
    public final boolean mo63418m(Account account) {
        return this.f118059b.getBoolean(m100388k(account), false);
    }

    /* renamed from: p */
    public final AccountConfig mo63419p(Account account) {
        bgyk a = AccountConfig.m117314a(account);
        mo63412a(account, a);
        a.mo63422a(0);
        a.f118077p = null;
        a.mo63423a(true);
        return a.mo63421a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo63420q(Account account) {
        return mo63415h(account) || mo63417l(account);
    }

    /* renamed from: a */
    public static String m100381a(Account account) {
        return bgyi.m100376a(account).f118042i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63412a(Account account, bgyk bgyk) {
        bgyk.f118064c = Boolean.valueOf(mo63420q(account));
        bgyk.f118063b = Long.valueOf(mo63414d(account));
        bgyk.f118065d = Boolean.valueOf(this.f118061d.mo61825a(account));
        bgyk.f118070i = Boolean.valueOf(mo63416i(account));
        bgyk.f118071j = this.f118059b.getString(m100387j(account), null);
        bgyk.f118072k = Boolean.valueOf(mo63418m(account));
        bgyk.f118073l = this.f118059b.getString(m100389n(account), null);
        bgyk.f118068g = Long.valueOf(this.f118059b.getLong(m100382b(account), Long.MIN_VALUE));
        int i = this.f118059b.getInt(m100384e(account), 0);
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                i = -1;
                break;
        }
        bgyk.f118069h = Integer.valueOf(i);
        bgyk.f118066e = Boolean.valueOf(this.f118059b.getBoolean(m100381a(account), false));
        bgyk.f118074m = this.f118060c.mo63429a();
        bgyk.f118076o = Build.MODEL;
        bgyk.f118079r = Boolean.valueOf(this.f118059b.getBoolean(m100390o(account), true));
        bgyk.f118080s = Integer.valueOf(bgwb.m100148a(this.f118059b.getInt(m100385f(account), 0)));
    }

    /* renamed from: a */
    public final void mo63413a(SharedPreferences.Editor editor, boolean z, String str, String str2, boolean z2) {
        String str3;
        int i;
        ReportingConfig a = m100380a();
        editor.apply();
        ReportingConfig a2 = m100380a();
        if (!z2) {
            Context context = this.f118058a;
            if (!z) {
                for (Account account : a2.mo70927a()) {
                    AccountConfig a3 = a2.mo70926a(account);
                    AccountConfig a4 = a.mo70926a(account);
                    if (!(a4 == null || !a3.mo70911f() || (i = a3.f150908s) == 1 || i == 2)) {
                        if (chcs.m148243o()) {
                            boolean z3 = a3.f150896g;
                            if (z3 != a4.f150896g) {
                                bgwy.m100197a(context, account, z3);
                            }
                        } else if (a3.mo70916j() && !a4.mo70916j()) {
                            bgwy.m100197a(context, account, true);
                        }
                    }
                }
            }
        }
        Set<Account> a5 = a.mo70927a();
        a5.addAll(a2.mo70927a());
        StringBuilder sb = new StringBuilder();
        for (Account account2 : a5) {
            AccountConfig a6 = a.mo70926a(account2);
            AccountConfig a7 = a2.mo70926a(account2);
            bgyz bgyz = new bgyz(a6);
            bgyz bgyz2 = new bgyz(a7);
            if (!bgyz.equals(bgyz2)) {
                sb.append(aeqm.m52397a(account2));
                sb.append(": ");
                String a8 = bgyz.m100435a(bgyz.f118143a, bgyz2.f118143a);
                String a9 = bgyz.m100435a(bgyz.f118144b, bgyz2.f118144b);
                if (bxbl.m122538a(bgyz.f118145c, bgyz2.f118145c)) {
                    str3 = bgyz2.mo63454a();
                } else {
                    String a10 = bgyz.mo63454a();
                    String a11 = bgyz2.mo63454a();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a10).length() + 4 + String.valueOf(a11).length());
                    sb2.append(a10);
                    sb2.append(" -> ");
                    sb2.append(a11);
                    str3 = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(a8).length() + 10 + String.valueOf(a9).length() + String.valueOf(str3).length());
                sb3.append("LR=");
                sb3.append(a8);
                sb3.append(", LH=");
                sb3.append(a9);
                sb3.append(", ");
                sb3.append(str3);
                sb.append(sb3.toString());
                sb.append("; ");
            }
        }
        String sb4 = sb.toString();
        if (!sb4.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(sb4).length());
            sb5.append(str);
            sb5.append(" at ");
            sb5.append(currentTimeMillis);
            sb5.append(": ");
            sb5.append(sb4);
            bgur.m100011a("GCoreUlrLong", sb5.toString());
        }
        bgxx.m100278b(this.f118058a, str2);
    }
}
