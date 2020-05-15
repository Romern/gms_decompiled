package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: auxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auxg implements auxc {

    /* renamed from: a */
    public static final aunx f92694a = new aunx("TrustAgent", "HomeLure");

    /* renamed from: b */
    public HomeLure$GoogleAccountChangeBroadcastReceiver f92695b = null;

    /* renamed from: c */
    public final Context f92696c;

    /* renamed from: d */
    public auxh f92697d = null;

    /* renamed from: e */
    public final Object f92698e = new Object();

    /* renamed from: f */
    public final SharedPreferences f92699f;

    /* renamed from: g */
    public SharedPreferences.OnSharedPreferenceChangeListener f92700g;

    /* renamed from: h */
    private final Map f92701h = new HashMap();

    public auxg(Context context) {
        SharedPreferences a = aupo.m77578a(context);
        auxh auxh = new auxh(context);
        sdo.m34959a(context);
        this.f92696c = context;
        sdo.m34959a(a);
        this.f92699f = a;
        this.f92697d = auxh;
    }

    /* renamed from: a */
    public final void mo51010a() {
        HomeLure$GoogleAccountChangeBroadcastReceiver homeLure$GoogleAccountChangeBroadcastReceiver = this.f92695b;
        if (homeLure$GoogleAccountChangeBroadcastReceiver != null) {
            this.f92696c.unregisterReceiver(homeLure$GoogleAccountChangeBroadcastReceiver);
            this.f92695b = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        return;
     */
    /* renamed from: b */
    public final void mo51012b() {
        synchronized (this.f92698e) {
            if (this.f92697d != null) {
                Account[] c = mo51013c();
                int length = c.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Account account = c[i];
                    if (this.f92699f.getBoolean(auxi.m78031e(account.name), false)) {
                        f92694a.mo50711a("User has at least one home address enabled. Ignore.", new Object[0]).mo50708c();
                        this.f92697d.mo51017b();
                        break;
                    }
                    if (!TextUtils.isEmpty(account.name)) {
                        new auxe(this.f92696c, account.name, this, new aupj(this.f92699f)).mo51006b();
                    }
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Account[] mo51013c() {
        return AccountManager.get(this.f92696c).getAccountsByType("com.google");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cb, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo51011a(String str, String str2) {
        synchronized (this.f92698e) {
            if (this.f92697d != null) {
                if (this.f92701h.containsKey(str) && !((String) this.f92701h.get(str)).equals(str2)) {
                    auxh auxh = this.f92697d;
                    String str3 = (String) this.f92701h.get(str);
                    auxh.f92702a.mo50711a("removePlace", new Object[0]).mo50708c();
                    synchronized (auxh.f92704c) {
                        if (auxh.f92705d.containsKey(str3) && ((String) auxh.f92705d.get(str3)).equals(str)) {
                            auxh.f92705d.remove(str3);
                            synchronized (auxh.f92706e) {
                                if (auxh.f92707f.contains(str3)) {
                                    auxh.f92707f.remove(str3);
                                }
                            }
                            if (auxh.f92710i) {
                                auxh.f92709h.mo51029b(auxh, str3);
                            }
                        }
                    }
                    this.f92701h.remove(str);
                }
                if (!this.f92701h.containsKey(str)) {
                    if (str2 != null) {
                        auxh auxh2 = this.f92697d;
                        auxh.f92702a.mo50711a("addPlace", new Object[0]).mo50708c();
                        if (auxh2.f92708g.getBoolean("auth_trust_agent_pref_place_lure_notification_do_not_show", false)) {
                            auxh.f92702a.mo50711a("Don't show notification.", new Object[0]).mo50708c();
                        } else {
                            synchronized (auxh2.f92704c) {
                                auxh2.f92705d.put(str2, str);
                            }
                            if (auxh2.f92710i) {
                                auxh2.f92709h.mo51025a(auxh2, str2);
                            }
                        }
                        this.f92701h.put(str, str2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51003a(String[] strArr) {
        if (strArr.length == 3 && !TextUtils.isEmpty(strArr[0]) && !TextUtils.isEmpty(strArr[2])) {
            mo51011a(strArr[2], strArr[0]);
        }
    }
}
