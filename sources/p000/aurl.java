package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.trustagent.internal.ParcelableTrustAgentEvent;
import com.google.android.gms.trustagent.trustlet.TrustletManager$TrustletManagerBroadcastReceiver;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

/* renamed from: aurl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aurl implements aurg {

    /* renamed from: a */
    public static final aunx f92332a = new aunx("TrustAgent", "TrustletManager");

    /* renamed from: b */
    public static final Object f92333b = new Object();

    /* renamed from: c */
    public static final bnic f92334c = bnic.m109489a("Sesame");

    /* renamed from: d */
    public static WeakReference f92335d = new WeakReference(null);

    /* renamed from: e */
    public final Object f92336e = new Object();

    /* renamed from: f */
    public final Context f92337f;

    /* renamed from: g */
    public final BroadcastReceiver f92338g;

    /* renamed from: h */
    public final Map f92339h;

    /* renamed from: i */
    public final ConcurrentLinkedDeque f92340i = new ConcurrentLinkedDeque();

    /* renamed from: j */
    public final Map f92341j;

    /* renamed from: k */
    public final aurj f92342k;

    /* renamed from: l */
    public final aupq f92343l;

    /* renamed from: m */
    public aurh f92344m;

    /* renamed from: n */
    public boolean f92345n;

    /* renamed from: o */
    public boolean f92346o;

    /* renamed from: p */
    public boolean f92347p;

    /* renamed from: q */
    public boolean f92348q;

    /* renamed from: r */
    public auro f92349r;

    /* renamed from: s */
    public boolean f92350s;

    /* renamed from: t */
    public boolean f92351t;

    /* renamed from: u */
    public long f92352u = Long.MAX_VALUE;

    /* renamed from: v */
    public boolean f92353v;

    /* renamed from: w */
    private final List f92354w;

    /* renamed from: x */
    private boolean f92355x;

    public aurl(Context context) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        aupq a = aupq.m77579a();
        synchronized (this.f92336e) {
            this.f92337f = context;
            this.f92354w = arrayList;
            this.f92341j = hashMap;
            this.f92339h = hashMap2;
            this.f92343l = a;
            this.f92344m = null;
            this.f92342k = aurj.m77699a();
            this.f92338g = new TrustletManager$TrustletManagerBroadcastReceiver(this);
        }
    }

    /* renamed from: a */
    public static aurl m77712a() {
        aurl aurl;
        synchronized (f92333b) {
            aurl = (aurl) f92335d.get();
            if (aurl == null) {
                aurl aurl2 = new aurl(rpr.m34216b());
                f92335d = new WeakReference(aurl2);
                aurl = aurl2;
            }
        }
        return aurl;
    }

    /* renamed from: f */
    private final boolean m77713f() {
        this.f92340i.clear();
        synchronized (this.f92336e) {
            auro auro = this.f92349r;
            boolean z = false;
            if (auro == null) {
                return false;
            }
            this.f92350s = false;
            synchronized (auro.f92370b) {
                for (aurm aurm : auro.f92372d) {
                    if (aurm.mo50844c()) {
                        aurm.mo50843b();
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    /* renamed from: b */
    public final void mo50834b() {
        synchronized (this.f92336e) {
            m77713f();
        }
        mo50836b("Stop all trustlets.");
    }

    /* renamed from: c */
    public final void mo50837c() {
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        bohf bohf = bohf.f133058h;
        boolean z = false;
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohf.getClass();
        bohi.f133089s = bohf;
        bohi.f133071a |= 8192;
        synchronized (this.f92336e) {
            Iterator it = this.f92340i.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                auri auri = (auri) it.next();
                z2 |= auri.mo50822b();
                try {
                    auri.f92322e.mo50800a(new ParcelableTrustAgentEvent(bogj));
                } catch (RemoteException e) {
                    auri.f92318a.mo50710a("RemoteException", e, new Object[0]).mo50706a();
                }
            }
            if (z2 != this.f92355x) {
                if (z2) {
                    z = true;
                }
                this.f92355x = z;
                synchronized (this.f92336e) {
                    for (auoz auoz : this.f92354w) {
                        auoz.mo50612b(z);
                    }
                }
            }
        }
        bohi bohi2 = (bohi) bogj.mo74062i();
        synchronized (this.f92336e) {
            for (auoz auoz2 : this.f92354w) {
                auoz2.mo50609a(bohi2);
            }
        }
    }

    /* renamed from: d */
    public final void mo50839d() {
        synchronized (this.f92336e) {
            boolean z = false;
            if (!this.f92347p) {
                Iterator it = this.f92340i.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((auri) it.next()).mo50823c()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z != this.f92346o) {
                this.f92346o = z;
                mo50832a(z);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo50840e() {
        boolean z;
        synchronized (this.f92336e) {
            z = this.f92345n;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo50835b(auoz auoz) {
        synchronized (this.f92336e) {
            this.f92354w.remove(auoz);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        return;
     */
    /* renamed from: b */
    public final void mo50836b(String str) {
        boolean z;
        boolean z2;
        mo50839d();
        if (str == null) {
            str = "";
        }
        synchronized (this.f92336e) {
            boolean z3 = true;
            f92332a.mo50711a("validateIsTrusted(\"%s\"), mDeviceIdle: %b, mRequireUserAuthentication: %b", r8, Boolean.valueOf(this.f92348q), Boolean.valueOf(this.f92347p)).mo50707b();
            if (this.f92348q || this.f92347p) {
                if (this.f92345n) {
                    this.f92345n = false;
                    mo50833a(false, false, false, r8);
                }
                this.f92351t = false;
                return;
            }
            Iterator it = this.f92340i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    z2 = false;
                    z3 = false;
                    break;
                }
                auri auri = (auri) it.next();
                if (auri.mo50821a()) {
                    String valueOf = String.valueOf(String.format(" %s is trusted.", auri.f92321d));
                    r8 = valueOf.length() == 0 ? new String(r8) : r8.concat(valueOf);
                    z = auri.f92319b;
                    z2 = auri.f92320c;
                }
            }
            if (z3 != this.f92345n) {
                this.f92345n = z3;
                mo50833a(z3, z, z2, r8);
            }
            if (this.f92351t) {
                if (!z3) {
                    this.f92351t = false;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50828a(auoy auoy) {
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133073c = 1;
        bohi.f133071a |= 2;
        try {
            ((auri) auoy).f92322e.mo50802b(new ParcelableTrustAgentEvent(bogj));
        } catch (RemoteException e) {
            auri.f92318a.mo50710a("RemoteException", e, new Object[0]).mo50706a();
        }
        synchronized (this.f92336e) {
            bxvd da = bogk.f132997d.mo74144da();
            boolean z = this.f92351t;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bogk bogk = (bogk) da.f164949b;
            bogk.f132999a |= 2;
            bogk.f133001c = z;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f92352u;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bogk bogk2 = (bogk) da.f164949b;
            bogk2.f132999a = 1 | bogk2.f132999a;
            bogk2.f133000b = elapsedRealtime;
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi2 = (bohi) bogj.f164949b;
            bogk bogk3 = (bogk) da.mo74062i();
            bogk3.getClass();
            bohi2.f133095y = bogk3;
            bohi2.f133071a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            aupk.m77567a(this.f92337f, (bohi) bogj.mo74062i());
        }
    }

    /* renamed from: c */
    public final void mo50838c(String str) {
        mo50831a(str, "System");
    }

    /* renamed from: a */
    public final void mo50829a(auoz auoz) {
        synchronized (this.f92336e) {
            this.f92354w.add(auoz);
        }
    }

    /* renamed from: a */
    public final void mo50830a(String str) {
        boolean z;
        synchronized (this.f92336e) {
            z = true;
            if (!this.f92348q && !this.f92347p) {
                synchronized (this.f92336e) {
                    auro auro = this.f92349r;
                    if (auro != null) {
                        this.f92350s = true;
                        synchronized (auro.f92370b) {
                            for (aurm aurm : auro.f92372d) {
                                if (aurm.mo50844c() && !aurm.f92358b) {
                                    aurm.mo50843b();
                                }
                            }
                        }
                        boolean a = this.f92349r.mo50846a();
                        if (!a) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
            } else if (!m77713f()) {
                z = false;
            }
        }
        if (z) {
            mo50836b(str);
        }
    }

    /* renamed from: a */
    public final void mo50831a(String str, String str2) {
        if (cgzt.m147783h()) {
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            String l = valueOf.toString();
            synchronized (this.f92336e) {
                ArrayList arrayList = new ArrayList();
                if (mo50840e()) {
                    Iterator it = this.f92340i.iterator();
                    while (it.hasNext()) {
                        auri auri = (auri) it.next();
                        if (auri.mo50821a()) {
                            arrayList.add(auri.f92321d);
                        }
                    }
                }
                aumt aumt = new aumt(l, str, str2, this.f92345n, this.f92355x, this.f92346o, this.f92348q, this.f92347p, arrayList, valueOf);
                try {
                    auox a = auox.m77526a();
                    a.f92240e.execute(new auov(a, aumt));
                } catch (aumn e) {
                    f92332a.mo50710a("ModelNotFoundException", e, new Object[0]).mo50706a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50832a(boolean z) {
        synchronized (this.f92336e) {
            for (auoz auoz : this.f92354w) {
                auoz.mo50610a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo50833a(boolean z, boolean z2, boolean z3, String str) {
        f92332a.mo50711a("notifyListenersTrustStateChanged(trusted: %b, userInitiated: %b, dismissKeyguard: %b, reason: \"%s\")", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), str).mo50707b();
        synchronized (this.f92336e) {
            for (auoz auoz : this.f92354w) {
                auoz.mo50611a(z, z2, z3, str);
            }
        }
    }
}
