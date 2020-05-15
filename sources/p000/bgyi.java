package p000;

import android.accounts.Account;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: bgyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyi {

    /* renamed from: x */
    private static final List f118033x = new ArrayList();

    /* renamed from: a */
    public final String f118034a;

    /* renamed from: b */
    public final String f118035b;

    /* renamed from: c */
    public final String f118036c;

    /* renamed from: d */
    public final String f118037d;

    /* renamed from: e */
    public final String f118038e;

    /* renamed from: f */
    public final String f118039f;

    /* renamed from: g */
    public final String f118040g;
    @Deprecated

    /* renamed from: h */
    public final String f118041h;

    /* renamed from: i */
    public final String f118042i;

    /* renamed from: j */
    public final String f118043j;

    /* renamed from: k */
    public final String f118044k;
    @Deprecated

    /* renamed from: l */
    public final String f118045l;

    /* renamed from: m */
    public final String f118046m;

    /* renamed from: n */
    public final String f118047n;

    /* renamed from: o */
    public final String f118048o;

    /* renamed from: p */
    public final String f118049p;

    /* renamed from: q */
    public final String f118050q;

    /* renamed from: r */
    public final String f118051r;

    /* renamed from: s */
    public final String f118052s;

    /* renamed from: t */
    public final String f118053t;

    /* renamed from: u */
    public final String f118054u;

    /* renamed from: v */
    public final String f118055v;

    /* renamed from: w */
    public final String f118056w;

    /* renamed from: y */
    private final Account f118057y;

    public bgyi(Account account) {
        this.f118057y = account;
        String valueOf = String.valueOf(account);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append("deviceTag_");
        sb.append(valueOf);
        this.f118034a = sb.toString();
        String valueOf2 = String.valueOf(account);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("inactivationMillis_");
        sb2.append(valueOf2);
        this.f118035b = sb2.toString();
        String valueOf3 = String.valueOf(account);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
        sb3.append("gcmIdUploadTime_");
        sb3.append(valueOf3);
        this.f118036c = sb3.toString();
        String valueOf4 = String.valueOf(account);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 15);
        sb4.append("lastUploadTime_");
        sb4.append(valueOf4);
        this.f118037d = sb4.toString();
        String valueOf5 = String.valueOf(account);
        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 11);
        sb5.append("authorized_");
        sb5.append(valueOf5);
        this.f118038e = sb5.toString();
        String valueOf6 = String.valueOf(account);
        StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 26);
        sb6.append("authenticationFailureTime_");
        sb6.append(valueOf6);
        this.f118039f = sb6.toString();
        String valueOf7 = String.valueOf(account);
        StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf7).length() + 22);
        sb7.append("account_reboot_number_");
        sb7.append(valueOf7);
        this.f118040g = sb7.toString();
        String valueOf8 = String.valueOf(account);
        StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf8).length() + 10);
        sb8.append("ambiguous_");
        sb8.append(valueOf8);
        this.f118041h = sb8.toString();
        String valueOf9 = String.valueOf(account);
        StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf9).length() + 6);
        sb9.append("dirty_");
        sb9.append(valueOf9);
        this.f118042i = sb9.toString();
        String valueOf10 = String.valueOf(account);
        StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf10).length() + 13);
        sb10.append("serverMillis_");
        sb10.append(valueOf10);
        this.f118043j = sb10.toString();
        String valueOf11 = String.valueOf(account);
        StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf11).length() + 13);
        sb11.append("updateNumber_");
        sb11.append(valueOf11);
        this.f118044k = sb11.toString();
        String valueOf12 = String.valueOf(account);
        StringBuilder sb12 = new StringBuilder(String.valueOf(valueOf12).length() + 13);
        sb12.append("clientMillis_");
        sb12.append(valueOf12);
        this.f118045l = sb12.toString();
        String valueOf13 = String.valueOf(account);
        StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf13).length() + 12);
        sb13.append("restriction_");
        sb13.append(valueOf13);
        this.f118046m = sb13.toString();
        String valueOf14 = String.valueOf(account);
        StringBuilder sb14 = new StringBuilder(String.valueOf(valueOf14).length() + 17);
        sb14.append("reportingEnabled_");
        sb14.append(valueOf14);
        this.f118047n = sb14.toString();
        String valueOf15 = String.valueOf(account);
        StringBuilder sb15 = new StringBuilder(String.valueOf(valueOf15).length() + 17);
        sb15.append("reportingPackage_");
        sb15.append(valueOf15);
        this.f118048o = sb15.toString();
        String valueOf16 = String.valueOf(account);
        StringBuilder sb16 = new StringBuilder(String.valueOf(valueOf16).length() + 15);
        sb16.append("historyEnabled_");
        sb16.append(valueOf16);
        this.f118049p = sb16.toString();
        String valueOf17 = String.valueOf(account);
        StringBuilder sb17 = new StringBuilder(String.valueOf(valueOf17).length() + 15);
        sb17.append("historyPackage_");
        sb17.append(valueOf17);
        this.f118050q = sb17.toString();
        String valueOf18 = String.valueOf(account);
        StringBuilder sb18 = new StringBuilder(String.valueOf(valueOf18).length() + 14);
        sb18.append("primaryDevice_");
        sb18.append(valueOf18);
        this.f118051r = sb18.toString();
        String valueOf19 = String.valueOf(account);
        StringBuilder sb19 = new StringBuilder(String.valueOf(valueOf19).length() + 12);
        sb19.append("accountType_");
        sb19.append(valueOf19);
        this.f118052s = sb19.toString();
        String valueOf20 = String.valueOf(account);
        StringBuilder sb20 = new StringBuilder(String.valueOf(valueOf20).length() + 15);
        sb20.append("overriddenByUi_");
        sb20.append(valueOf20);
        this.f118053t = sb20.toString();
        String valueOf21 = String.valueOf(account);
        StringBuilder sb21 = new StringBuilder(String.valueOf(valueOf21).length() + 21);
        sb21.append("auto_enable_eligible_");
        sb21.append(valueOf21);
        this.f118054u = sb21.toString();
        String valueOf22 = String.valueOf(account);
        StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 24);
        sb22.append("auto_enable_new_account_");
        sb22.append(valueOf22);
        this.f118055v = sb22.toString();
        String valueOf23 = String.valueOf(account);
        StringBuilder sb23 = new StringBuilder(String.valueOf(valueOf23).length() + 28);
        sb23.append("auto_enable_history_enabled_");
        sb23.append(valueOf23);
        this.f118056w = sb23.toString();
    }

    /* renamed from: a */
    public static synchronized bgyi m100376a(Account account) {
        bgyi bgyi;
        synchronized (bgyi.class) {
            sdo.checkIfNull(account, "null account");
            int i = 0;
            while (true) {
                if (i >= f118033x.size()) {
                    bgyi = null;
                    break;
                }
                bgyi = (bgyi) f118033x.get(i);
                if (account.equals(bgyi.f118057y)) {
                    break;
                }
                i++;
            }
            if (bgyi != null) {
                return bgyi;
            }
            bgyi bgyi2 = new bgyi(account);
            f118033x.add(bgyi2);
            return bgyi2;
        }
    }

    /* renamed from: b */
    public static synchronized void m100379b(Account account) {
        synchronized (bgyi.class) {
            Iterator it = f118033x.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (account.equals(((bgyi) it.next()).f118057y)) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    /* renamed from: a */
    public static Set m100377a(SharedPreferences sharedPreferences, Account... accountArr) {
        HashSet hashSet = new HashSet();
        for (String str : sharedPreferences.getAll().keySet()) {
            if (str.endsWith("}") && str.contains("Account {name=")) {
                int length = accountArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (str.endsWith(accountArr[i].toString())) {
                            break;
                        }
                        i++;
                    } else {
                        hashSet.add(str);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public static boolean m100378a(String str) {
        return str != null && str.startsWith("deviceTag_");
    }
}
