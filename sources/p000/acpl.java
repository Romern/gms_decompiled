package p000;

import android.content.Context;
import android.content.Intent;
import android.os.ConditionVariable;
import android.os.WorkSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: acpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acpl {

    /* renamed from: a */
    public final Object f60418a;

    /* renamed from: b */
    public Set f60419b;

    /* renamed from: c */
    public final Set f60420c;

    /* renamed from: d */
    public int f60421d;

    /* renamed from: e */
    public final ConditionVariable f60422e;

    /* renamed from: f */
    public int f60423f;

    /* renamed from: g */
    final ThreadLocal f60424g;

    /* renamed from: h */
    public asfb f60425h;

    /* renamed from: i */
    private int f60426i;

    /* renamed from: j */
    private final snf f60427j;

    /* renamed from: k */
    private final snf f60428k;

    /* renamed from: l */
    private final Context f60429l;

    /* renamed from: m */
    private HashMap f60430m;

    /* renamed from: n */
    private final Intent f60431n;

    /* renamed from: o */
    private final String f60432o;

    public acpl() {
        this.f60418a = new Object();
        this.f60419b = new HashSet();
        this.f60420c = new HashSet();
        this.f60426i = 0;
        this.f60421d = 0;
        this.f60422e = new ConditionVariable(true);
        this.f60424g = new ThreadLocal();
    }

    /* renamed from: a */
    public final void mo32988a() {
        boolean z;
        boolean z2;
        synchronized (this.f60418a) {
            boolean z3 = true;
            if (this.f60421d >= 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            if (this.f60426i >= this.f60421d) {
                z2 = true;
            } else {
                z2 = false;
            }
            bmxy.m108600b(z2);
            if (this.f60423f < 0) {
                z3 = false;
            }
            bmxy.m108600b(z3);
        }
    }

    /* renamed from: b */
    public final void mo32992b(int i) {
        Integer num = (Integer) this.f60424g.get();
        if (!mo32991a(i)) {
            throw new IllegalStateException(bmzh.m108675a("Must be in a thread with scheduling %s vs %s", Integer.valueOf(i), num));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo32994c(acpn acpn) {
        if (this.f60425h == null) {
            asfb asfb = new asfb(this.f60429l, 1, "Icing", null, "com.google.android.gms", "ICING");
            this.f60425h = asfb;
            asfb.mo49121c(new WorkSource());
        }
        acpm acpm = (acpm) this.f60430m.get(acpn.f60439j);
        if (acpm == null) {
            acpm = new acpm(acpn.f60439j, this.f60429l);
            this.f60430m.put(acpn.f60439j, acpm);
        }
        if (acpm.f60434b == 0) {
            try {
                this.f60425h.mo49112a(acpm.f60433a);
            } catch (ArrayIndexOutOfBoundsException e) {
                absg.m48203d("Failed to add work source %s for task %s", acpn.f60439j, acpn.mo32998d());
            }
        }
        acpm.f60434b++;
        this.f60425h.mo49114a(String.valueOf(acpn.mo32998d()).concat("-pending"), cemj.m137338b());
    }

    /* renamed from: d */
    public final void mo32995d(acpn acpn) {
        mo32990a(acpn, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo32989a(acpn acpn) {
        synchronized (this.f60418a) {
            mo32988a();
            boolean z = true;
            if (this.f60421d == 1) {
                if (!this.f60419b.isEmpty()) {
                    Set set = this.f60419b;
                    this.f60419b = new HashSet();
                    mo32995d(new acpj(set));
                }
            }
            acpm acpm = (acpm) this.f60430m.get(acpn.f60439j);
            sdo.checkIfNull(acpm, "packageData is null");
            if (acpm.f60434b <= 0) {
                z = false;
            }
            sdo.m34971a(z, (Object) "acquireWakeLockLocked must be called before releaseWakeLockLocked");
            this.f60425h.mo49122c(acpn.mo32998d());
            int i = acpm.f60434b - 1;
            acpm.f60434b = i;
            if (i == 0) {
                this.f60425h.mo49118b(acpm.f60433a);
            }
            int i2 = this.f60421d - 1;
            this.f60421d = i2;
            if (i2 == 0) {
                absg.m48185a("%s: On dead called", this.f60432o);
                this.f60429l.stopService(this.f60431n);
            }
            int i3 = this.f60426i - 1;
            this.f60426i = i3;
            if (i3 == 0) {
                this.f60422e.open();
            }
            mo32988a();
        }
    }

    /* renamed from: b */
    public final void mo32993b(acpn acpn) {
        int i = this.f60421d;
        this.f60421d = i + 1;
        if (i == 0) {
            this.f60419b.addAll(this.f60420c);
            this.f60429l.startService(this.f60431n);
        }
        mo32994c(acpn);
    }

    public acpl(Context context, String str, Intent intent) {
        this.f60418a = new Object();
        this.f60419b = new HashSet();
        this.f60420c = new HashSet();
        this.f60426i = 0;
        this.f60421d = 0;
        this.f60422e = new ConditionVariable(true);
        this.f60424g = new ThreadLocal();
        this.f60427j = snp.m35703a(4, 9);
        this.f60428k = snp.m35703a(1, 10);
        this.f60430m = new HashMap();
        this.f60429l = context;
        this.f60431n = intent;
        this.f60432o = str;
    }

    /* renamed from: a */
    public final void mo32990a(acpn acpn, long j) {
        boolean z;
        snf snf;
        absg.m48186a("Scheduling task: %s %d", acpn, Long.valueOf(j));
        if (j < 0 || j > 5000) {
            z = false;
        } else {
            z = true;
        }
        bmxy.m108593a(z, "Delay out of range: %s", j);
        acpn.m49671a(acpn.f60437h);
        List<Runnable> emptyList = Collections.emptyList();
        bmxy.m108581a(emptyList);
        for (Runnable runnable : emptyList) {
            bmxy.m108581a(runnable);
        }
        synchronized (this.f60418a) {
            mo32988a();
            if (this.f60423f != 0) {
                if (!(acpn instanceof acpj)) {
                    absg.m48206e("Scheduling new tasks while awaiting pending to complete: %s.", acpn);
                }
            }
            this.f60419b.addAll(emptyList);
            this.f60426i++;
            this.f60422e.close();
            if (acpn.f60438i == 3) {
                mo32993b(acpn);
            }
            mo32988a();
        }
        acpn.mo32996a(0, 1);
        acpk acpk = new acpk(this, acpn);
        int i = acpk.f60416a.f60437h;
        if (i == 1) {
            snf = this.f60427j;
        } else if (i == 2) {
            snf = this.f60428k;
        } else {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Invalid task scheduling: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        snl.m35700a(snf.mo25814a(acpk, j, TimeUnit.MILLISECONDS));
    }

    /* renamed from: a */
    public final boolean mo32991a(int i) {
        acpn.m49671a(i);
        Integer num = (Integer) this.f60424g.get();
        return num != null && num.intValue() == i;
    }
}
