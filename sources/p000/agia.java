package p000;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;

/* renamed from: agia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agia implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f65551a;

    /* renamed from: b */
    final /* synthetic */ String f65552b;

    /* renamed from: c */
    final /* synthetic */ Object f65553c;

    /* renamed from: d */
    final /* synthetic */ Object f65554d;

    /* renamed from: e */
    final /* synthetic */ Object f65555e;

    /* renamed from: f */
    final /* synthetic */ agid f65556f;

    public agia(agid agid, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f65556f = agid;
        this.f65551a = i;
        this.f65552b = str;
        this.f65553c = obj;
        this.f65554d = obj2;
        this.f65555e = obj3;
    }

    public final void run() {
        boolean z;
        agiq a = this.f65556f.f65756y.mo35499a();
        if (a.mo35543g()) {
            agid agid = this.f65556f;
            if (agid.f65562a == 0) {
                agdi v = agid.mo35538v();
                if (v.f65294b == null) {
                    synchronized (v) {
                        if (v.f65294b == null) {
                            ApplicationInfo applicationInfo = v.mo35542z().getApplicationInfo();
                            String a2 = ssy.m36271a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                if (str == null || !str.equals(a2)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                v.f65294b = Boolean.valueOf(z);
                            }
                            if (v.f65294b == null) {
                                v.f65294b = Boolean.TRUE;
                                v.mo35497E().f65564c.mo35435a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (!v.f65294b.booleanValue()) {
                    agid agid2 = this.f65556f;
                    agid2.f65562a = !agid2.mo35537u().f65291a ? 'c' : 'p';
                } else {
                    agid agid3 = this.f65556f;
                    agid3.f65562a = !agid3.mo35537u().f65291a ? 'C' : 'P';
                }
            }
            agid agid4 = this.f65556f;
            if (agid4.f65563b < 0) {
                agid4.f65563b = agid4.mo35538v().mo35318c();
            }
            char charAt = "01VDIWEA?".charAt(this.f65551a);
            agid agid5 = this.f65556f;
            char c = agid5.f65562a;
            long j = agid5.f65563b;
            String a3 = agid.m54290a(true, this.f65552b, this.f65553c, this.f65554d, this.f65555e);
            StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(c);
            sb.append(j);
            sb.append(":");
            sb.append(a3);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f65552b.substring(0, 1024);
            }
            agio agio = a.f65618c;
            agio.f65609e.mo35241h();
            if (agio.mo35461b() == 0) {
                agio.mo35460a();
            }
            if (sb2 == null) {
                sb2 = "";
            }
            long j2 = agio.f65609e.mo35468c().getLong(agio.f65606b, 0);
            if (j2 <= 0) {
                SharedPreferences.Editor edit = agio.f65609e.mo35468c().edit();
                edit.putString(agio.f65607c, sb2);
                edit.putLong(agio.f65606b, 1);
                edit.apply();
                return;
            }
            long nextLong = agio.f65609e.mo35540x().mo35751e().nextLong();
            long j3 = j2 + 1;
            SharedPreferences.Editor edit2 = agio.f65609e.mo35468c().edit();
            if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j3) {
                edit2.putString(agio.f65607c, sb2);
            }
            edit2.putLong(agio.f65606b, j3);
            edit2.apply();
            return;
        }
        this.f65556f.mo35439a(6, "Persisted config not initialized. Not logging error/warn");
    }
}
