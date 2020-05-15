package com.google.android.gms.googlehelp.service;

import android.accounts.Account;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleHelpChimeraService extends sjh implements aarn {

    /* renamed from: a */
    public static List f79000a;

    /* renamed from: i */
    public aaxx f79001i;

    /* renamed from: j */
    public aarp f79002j;

    /* renamed from: k */
    private abcr f79003k;

    /* renamed from: l */
    private aasi f79004l = new aasi();

    public GoogleHelpChimeraService() {
        super(63, "com.google.android.gms.googlehelp.service.GoogleHelpService.START", Collections.emptySet(), 1, 9);
        new adzt(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static synchronized void m66613a(HelpConfig helpConfig) {
        synchronized (GoogleHelpChimeraService.class) {
            aask d = m66619d(helpConfig);
            if (d != null && d.f56459b == helpConfig.f78819S) {
                d.mo31713b(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return null;
     */
    /* renamed from: b */
    public static synchronized aask m66616b(String str) {
        synchronized (GoogleHelpChimeraService.class) {
            if (f79000a != null) {
                for (int i = 0; i < f79000a.size(); i++) {
                    aask aask = (aask) f79000a.get(i);
                    if (TextUtils.equals(aask.f56458a, str)) {
                        return aask;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static String m66618c(HelpConfig helpConfig) {
        String str;
        String str2 = helpConfig.f78827b;
        if (str2 == null) {
            str2 = "unknown_package_name";
        }
        Account account = helpConfig.f78829d;
        if (account != null) {
            str = account.name;
        } else {
            str = "unknown_account_name";
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf);
    }

    /* renamed from: d */
    public static aask m66619d(HelpConfig helpConfig) {
        return m66616b(m66618c(helpConfig));
    }

    public final void onDestroy() {
        abcr abcr = this.f79003k;
        if (abcr != null) {
            abcr.close();
        }
        aaxx aaxx = this.f79001i;
        if (aaxx != null) {
            aaxx.close();
        }
        super.onDestroy();
    }

    /* renamed from: b */
    public static synchronized void m66617b(HelpConfig helpConfig) {
        synchronized (GoogleHelpChimeraService.class) {
            aask d = m66619d(helpConfig);
            if (d != null && d.f56459b == helpConfig.f78819S) {
                d.mo31712a(true);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m66614a(HelpConfig helpConfig, boolean z) {
        synchronized (GoogleHelpChimeraService.class) {
            String c = m66618c(helpConfig);
            if (f79000a == null) {
                ArrayList arrayList = new ArrayList(1);
                f79000a = arrayList;
                arrayList.add(new aask(c, helpConfig.f78819S, z));
                return;
            }
            aask b = m66616b(c);
            if (b == null) {
                f79000a.add(new aask(c, helpConfig.f78819S, z));
                return;
            }
            b.f56459b = helpConfig.f78819S;
            b.mo31713b(false);
            b.mo31712a(false);
            b.f56460c = z;
            b.mo31711a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1 == 1) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.f79000a.remove(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.f79000a = null;
     */
    /* renamed from: a */
    public static synchronized void m66615a(String str) {
        synchronized (GoogleHelpChimeraService.class) {
            if (f79000a != null) {
                int size = f79000a.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (TextUtils.equals(((aask) f79000a.get(i)).f56458a, str)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final abcr mo43374a() {
        if (this.f79003k == null) {
            this.f79003k = new abcr(this);
        }
        return this.f79003k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo43375a(aarn aarn) {
        aarp aarp = this.f79002j;
        if (aarp == null) {
            aasi aasi = this.f79004l;
            if (aasi != null) {
                aasi.addObserver(new abgg(this, aarn));
            }
        } else {
            aarn.mo31653a(aarp);
        }
    }

    /* renamed from: a */
    public final synchronized void mo31653a(aarp aarp) {
        aasi aasi = this.f79004l;
        if (aasi != null) {
            this.f79002j = aarp;
            aasi.mo31709a();
            this.f79004l = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7277a(sjj sjj, GetServiceRequest getServiceRequest) {
        sjj.mo25645a(new abgk(this, getServiceRequest.f30230d));
    }
}
