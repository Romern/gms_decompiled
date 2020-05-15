package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: ipj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ipj implements egy {

    /* renamed from: a */
    private final Account f21487a;

    /* renamed from: b */
    private final ite f21488b;

    /* renamed from: c */
    private final ipx f21489c;

    /* renamed from: d */
    private final iqi f21490d;

    public ipj(Context context, Account account) {
        ite ite = new ite(context);
        ipx ipx = new ipx(context, account);
        iqi iqi = new iqi(context);
        this.f21487a = account;
        this.f21488b = ite;
        this.f21489c = ipx;
        this.f21490d = iqi;
    }

    /* renamed from: a */
    public static aebo m15813a(long j) {
        aebn aebn = new aebn();
        aebn.f63074a = 1;
        aebn.f63075b = (int) TimeUnit.MILLISECONDS.toSeconds(j);
        aebn.f63076c = (int) TimeUnit.MILLISECONDS.toSeconds(j + ((Long) ipl.f21492b.mo58455c()).longValue());
        return aebn.mo34011a();
    }

    /* renamed from: a */
    public final void mo10119a(String str, bqlp bqlp) {
        String str2;
        ipx ipx = this.f21489c;
        synchronized (ipx.f21534a) {
            ipx.f21536c.mo25412b("Updating clientDirective", new Object[0]);
            ipx.f21535b.edit().putLong(ipx.mo13240a("checkinafter"), bqlp.f141131a).putLong(ipx.mo13240a("retryattempts"), (long) bqlp.f141132b).putLong(ipx.mo13240a("retryperiod"), bqlp.f141133c).putLong(ipx.mo13240a("policycreation"), bqlp.f141134d).putLong(ipx.mo13240a("currentretryattempt"), 0).commit();
        }
        bxwc bxwc = bqlp.f141135e;
        ArrayList arrayList = new ArrayList();
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bqma bqma = (bqma) bxwc.get(i);
            if (!arrayList.contains(bqma)) {
                arrayList.add(bqma);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i2 = 0;
        while (true) {
            str2 = null;
            if (i2 >= size2) {
                break;
            }
            bqma bqma2 = (bqma) arrayList.get(i2);
            int i3 = bqma2.f141185a;
            char c = 2;
            char c2 = 1;
            if (i3 != 0) {
                c = i3 != 1 ? i3 != 2 ? (char) 0 : 4 : 3;
            }
            if (c != 0) {
                c2 = c;
            }
            String str3 = bqma2.f141186b;
            if (c2 == 4 && !this.f21490d.mo13260a(this.f21487a, str3, null)) {
                arrayList2.add(bqma2);
            }
            i2++;
        }
        ipx ipx2 = this.f21489c;
        ipx2.f21536c.mo25412b("Updating invokeNext", new Object[0]);
        synchronized (ipx2.f21534a) {
            SharedPreferences.Editor edit = ipx2.f21535b.edit();
            String a = ipx2.mo13240a("invokenext");
            if (!arrayList2.isEmpty()) {
                try {
                    str2 = Base64.encodeToString(ips.m15855a(arrayList2), 0);
                } catch (IOException e) {
                    ipx2.f21536c.mo25417e("Error serializing invoke next list", e, new Object[0]);
                }
            }
            edit.putString(a, str2).commit();
        }
        long j = bqlp.f141131a;
        this.f21488b.mo13334a(str, j, j + ((Long) ipl.f21492b.mo58455c()).longValue(), m15813a(bqlp.f141133c));
    }
}
