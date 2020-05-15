package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.util.ClientListeners$UserReceiver;
import java.util.Collection;

/* renamed from: squ */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class squ implements spw, ssr {

    /* renamed from: a */
    private final C1223np f44995a;

    /* renamed from: b */
    private final String[] f44996b;

    /* renamed from: c */
    public final C1223np f44997c;

    /* renamed from: d */
    public final C1223np f44998d;

    /* renamed from: e */
    public final spx f44999e;

    /* renamed from: f */
    public String[] f45000f;

    /* renamed from: g */
    private final Context f45001g;

    /* renamed from: h */
    private final ssh f45002h;

    /* renamed from: i */
    private final sss f45003i;

    /* renamed from: j */
    private final Handler f45004j;

    /* renamed from: k */
    private BroadcastReceiver f45005k;

    /* renamed from: l */
    private IntentFilter f45006l;

    /* renamed from: m */
    private boolean f45007m;

    /* renamed from: n */
    private boolean f45008n;

    public squ(String[] strArr, Context context, Handler handler) {
        this(strArr, context, handler, spx.m35925a(context), ssh.m36213a(context), sss.m36260a(context));
    }

    /* renamed from: a */
    public static final boolean m36006a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final int m36008b(Object obj, sqt sqt) {
        if (this.f44998d.remove(obj) == null) {
            return this.f44995a.remove(obj) == null ? 0 : 16;
        }
        m36009c(sqt);
        return 2;
    }

    /* renamed from: c */
    private final void m36009c(sqt sqt) {
        String[] a = m36007a(sqt, this.f45000f);
        String[] m = sqt.mo9760m();
        for (String str : m) {
            if (m36006a(a, str)) {
                if (cdjz.m133769d()) {
                    this.f44999e.mo25954a(str, sqt.mo9757j(), sqt.mo9758k(), sqt.mo9759l());
                } else {
                    this.f44999e.mo25959b(str, sqt.mo9757j(), sqt.mo9758k());
                }
                mo25996w(str);
            }
        }
        mo9717a(sqt);
    }

    /* renamed from: g */
    private final void mo62371g() {
        if (!this.f44997c.isEmpty()) {
            if (!this.f45007m) {
                String[] strArr = this.f44996b;
                for (String str : strArr) {
                    int i = Build.VERSION.SDK_INT;
                    if ("android:monitor_location".equals(str) || "android:monitor_location_high_power".equals(str)) {
                        this.f44999e.mo25955a(str, 1, this);
                    } else {
                        this.f44999e.mo25956a(str, this);
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (this.f45005k == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    this.f45006l = intentFilter;
                    intentFilter.addAction("android.intent.action.USER_SWITCHED");
                    this.f45005k = new ClientListeners$UserReceiver(this);
                }
                this.f45001g.registerReceiver(this.f45005k, this.f45006l, null, this.f45004j);
                this.f45003i.mo26059a(this, this.f45004j);
                this.f45007m = true;
            }
        } else if (this.f45007m) {
            if (this.f44996b.length > 0) {
                this.f44999e.mo25957a(this);
            }
            mo25990b();
            this.f45003i.mo26061b();
            this.f45007m = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9714a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9717a(sqt sqt);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo9718b(sqt sqt);

    /* renamed from: d */
    public final Collection mo25993d() {
        return this.f44995a.values();
    }

    /* renamed from: e */
    public final Collection mo25994e() {
        return this.f44997c.values();
    }

    /* renamed from: f */
    public final void mo25995f() {
        if (this.f45008n) {
            this.f45008n = false;
            this.f45001g.sendBroadcast(new Intent("android.location.HIGH_POWER_REQUEST_CHANGE"));
        }
    }

    /* renamed from: v */
    public final void mo25951v(String str) {
        this.f45004j.post(new sqs(this, str));
    }

    /* renamed from: w */
    public final void mo25996w(String str) {
        int i = Build.VERSION.SDK_INT;
        if ("android:monitor_location_high_power".equals(str)) {
            this.f45008n = true;
        }
    }

    /* renamed from: a */
    public static final String[] m36007a(sqt sqt, String[] strArr) {
        return (!cdjz.f181084a.mo6606a().mo77781j() || !sqt.mo9761n()) ? strArr : sqt.mo9760m();
    }

    protected squ(String[] strArr, Context context, Handler handler, spx spx, ssh ssh, sss sss) {
        this.f44997c = new C1223np();
        this.f44998d = new C1223np();
        this.f44995a = new C1223np();
        this.f45007m = false;
        this.f45008n = false;
        this.f44996b = strArr;
        this.f45001g = context;
        this.f45004j = handler;
        this.f44999e = spx;
        this.f45002h = ssh;
        this.f45003i = sss;
        this.f45000f = strArr;
    }

    /* renamed from: b */
    public final sqt mo25989b(Object obj) {
        return (sqt) this.f44997c.get(obj);
    }

    /* renamed from: b */
    public final void mo25990b() {
        int i = Build.VERSION.SDK_INT;
        try {
            BroadcastReceiver broadcastReceiver = this.f45005k;
            if (broadcastReceiver != null) {
                this.f45001g.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public final sqt mo25984a(Object obj) {
        sqt sqt = (sqt) this.f44997c.remove(obj);
        if (sqt != null) {
            mo9714a(m36008b(obj, sqt));
            mo62371g();
            mo25995f();
        }
        return sqt;
    }

    /* renamed from: b */
    public final void mo25991b(int i) {
        int i2 = this.f44997c.f26809h;
        int i3 = 0;
        while (i3 < i2) {
            if (i != ((sqt) this.f44997c.mo15621c(i3)).mo9757j()) {
                i3++;
            } else {
                mo25987a(false);
                return;
            }
        }
    }

    /* renamed from: a */
    public final sqt mo25985a(Object obj, sqt sqt) {
        boolean z;
        sqt sqt2 = (sqt) this.f44997c.put(obj, sqt);
        if (sqt2 != sqt) {
            if (sqt2 != null) {
                m36008b(obj, sqt2);
                z = true;
            } else {
                z = false;
            }
            mo25987a(z);
            mo62371g();
        }
        return sqt2;
    }

    /* renamed from: c */
    public final Collection mo25992c() {
        return this.f44998d.values();
    }

    /* renamed from: a */
    public final void mo25986a() {
        int i;
        this.f44997c.clear();
        for (sqt sqt : this.f44998d.values()) {
            m36009c(sqt);
        }
        if (!this.f44998d.isEmpty()) {
            i = 2;
        } else {
            i = 0;
        }
        if (!this.f44995a.isEmpty()) {
            i |= 16;
        }
        this.f44998d.clear();
        this.f44995a.clear();
        mo9714a(i);
        mo25995f();
    }

    /* renamed from: a */
    public final void mo25987a(boolean z) {
        ssh ssh;
        int i;
        int i2;
        if (cdjz.f181084a.mo6606a().mo77782k()) {
            ssh = ssh.m36213a(this.f45001g);
        } else {
            ssh = this.f45002h;
        }
        ssh.mo26041b();
        int i3 = this.f44997c.f26809h;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object b = this.f44997c.mo15620b(i5);
            sqt sqt = (sqt) this.f44997c.mo15621c(i5);
            int i6 = Build.VERSION.SDK_INT;
            String[] m = sqt.mo9760m();
            int length = m.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    if (this.f44999e.mo25962d(m[i7], sqt.mo9757j(), sqt.mo9758k()) != 0) {
                        break;
                    }
                    i7++;
                } else {
                    if (this.f45003i.mo26060a()) {
                        String k = sqt.mo9758k();
                        String[] m2 = sqt.mo9760m();
                        int length2 = m2.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length2) {
                                break;
                            }
                            String str = m2[i8];
                            if ("android:monitor_location_high_power".equals(str)) {
                                if (svr.m36484b(this.f45001g).mo26171a("android.permission.ACCESS_FINE_LOCATION", k) == -1) {
                                    break;
                                }
                            } else if ("android:monitor_location".equals(str)) {
                                if (svr.m36484b(this.f45001g).mo26171a("android.permission.ACCESS_COARSE_LOCATION", k) == -1 && svr.m36484b(this.f45001g).mo26171a("android.permission.ACCESS_FINE_LOCATION", k) == -1) {
                                    break;
                                }
                            } else if (!"android:activity_recognition".equals(str)) {
                                Log.wtf("ClientListeners", "Currently only OPSTR_MONITOR_HIGH_POWER_LOCATION, OPSTR_MONITOR_LOCATION and OPSTR_ACTIVITY_RECOGNITION are supported. Add additional ops as necessary.");
                            } else if (svr.m36484b(this.f45001g).mo26171a("android.permission.ACTIVITY_RECOGNITION", k) == -1) {
                                break;
                            }
                            i8++;
                        }
                    }
                    if (ssh.mo26040a(sqt.mo9757j())) {
                        if (this.f44998d.put(b, sqt) == null) {
                            if (!z) {
                                i = 1;
                            } else {
                                i = 4;
                            }
                            i4 |= i;
                            if (this.f44995a.remove(b) != null) {
                                i4 |= 16;
                            }
                            String[] a = m36007a(sqt, this.f45000f);
                            String[] m3 = sqt.mo9760m();
                            for (String str2 : m3) {
                                if (m36006a(a, str2)) {
                                    if (cdjz.m133769d()) {
                                        if (this.f44999e.mo25961c(str2, sqt.mo9757j(), sqt.mo9758k(), sqt.mo9759l()) == 0) {
                                            mo25996w(str2);
                                        }
                                    } else if (this.f44999e.mo25952a(str2, sqt.mo9757j(), sqt.mo9758k()) == 0) {
                                        mo25996w(str2);
                                    }
                                }
                            }
                            mo9718b(sqt);
                        }
                    }
                }
            }
            if (this.f44995a.put(b, sqt) == null) {
                if (!z) {
                    i2 = 8;
                } else {
                    i2 = 32;
                }
                i4 |= i2;
                if (this.f44998d.remove(b) != null) {
                    i4 |= 2;
                    m36009c(sqt);
                }
            }
        }
        ssh.mo26043c();
        if (i4 != 0) {
            mo9714a(i4);
        }
        mo25995f();
    }

    /* renamed from: a */
    public final void mo25988a(String[] strArr) {
        for (sqt sqt : this.f44998d.values()) {
            String[] a = m36007a(sqt, this.f45000f);
            String[] a2 = m36007a(sqt, strArr);
            String[] m = sqt.mo9760m();
            for (String str : m) {
                boolean a3 = m36006a(a, str);
                boolean a4 = m36006a(a2, str);
                if (a3 != a4) {
                    mo25996w(str);
                    if (a4) {
                        if (cdjz.m133769d()) {
                            this.f44999e.mo25961c(str, sqt.mo9757j(), sqt.mo9758k(), sqt.mo9759l());
                        } else {
                            this.f44999e.mo25952a(str, sqt.mo9757j(), sqt.mo9758k());
                        }
                    } else if (cdjz.m133769d()) {
                        this.f44999e.mo25954a(str, sqt.mo9757j(), sqt.mo9758k(), sqt.mo9759l());
                    } else {
                        this.f44999e.mo25959b(str, sqt.mo9757j(), sqt.mo9758k());
                    }
                }
            }
        }
        this.f45000f = strArr;
        mo25995f();
    }
}
