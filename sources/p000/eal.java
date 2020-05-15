package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: eal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class eal extends dyd implements lrj {

    /* renamed from: b */
    private final String f14545b;

    /* renamed from: j */
    public ContextData f14546j;

    /* renamed from: k */
    public boolean f14547k;

    /* renamed from: l */
    public boolean f14548l;

    /* renamed from: m */
    private final eak f14549m = new eak(this);

    /* renamed from: n */
    private final Runnable f14550n;

    /* renamed from: o */
    private SparseArray f14551o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f14552p;

    /* renamed from: q */
    private String f14553q;

    public eal(Context context, doh doh, dxr dxr, String str, dqb dqb) {
        super(context, doh, dxr, str, dqb);
        boolean z;
        sdo.m34959a(dxr.f14369c);
        if (dxr.f14369c.length > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        int[] iArr = dxr.f14370d;
        if (iArr != null) {
            for (int i : iArr) {
                sdo.m34974b(tiq.m37050a(i));
            }
        }
        String str2 = doh.f13690b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        this.f14545b = sb.toString();
        this.f14547k = false;
        this.f14552p = false;
        this.f14548l = false;
        if (dxr.f14370d != null) {
            this.f14551o = new SparseArray(this.f14390f.f14370d.length);
        }
        this.f14550n = new eai(this);
    }

    /* renamed from: a */
    public static AwarenessFence m9979a(String str, String str2, doh doh) {
        new Object[1][0] = str;
        if (str == null || str.isEmpty() || doh == null) {
            return null;
        }
        tjr tjr = new tjr(doh);
        tkb tkb = new tkb();
        tkb.mo26624b();
        TimeFilterImpl a = tkb.mo26620a();
        tjv tjv = new tjv();
        tjv.mo26613a(str);
        tjr.mo26597a(13, a, tjv.mo26612a());
        tjr.mo26598b();
        ArrayList a2 = dwq.m9673q().mo10052a(tjr.mo26595a());
        if (a2 == null || a2.isEmpty() || a2.size() > 1) {
            new Object[1][0] = a2 != null ? Integer.valueOf(a2.size()) : "null";
            return null;
        } else if (((tjq) a2.get(0)).mo26594d().equals(tju.m37104a(str, null, null))) {
            return new ContextFenceStub(((tjq) a2.get(0)).mo26593c());
        } else {
            dss.m9249a(str2, "Feature with wrong key", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo9500b(ContextData contextData) {
        int length;
        int i = 1;
        new Object[1][0] = contextData;
        int[] iArr = this.f14390f.f14370d;
        if (iArr == null || (length = iArr.length) == 0) {
            dss.m9249a(this.f14387c, "onReceive called when no dependent context.", new Object[0]);
        } else if (this.f14547k) {
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                int i3 = iArr[i2];
                if (contextData.mo18018g() == i3) {
                    new Object[1][0] = Integer.toString(i3);
                    this.f14551o.put(i3, contextData);
                    break;
                }
                i2++;
            }
            if (this.f14551o.size() == this.f14390f.f14370d.length) {
                int size = this.f14551o.size();
                if (this.f14546j == null) {
                    i = 0;
                }
                ContextData[] contextDataArr = new ContextData[(size + i)];
                for (int i4 = 0; i4 < this.f14551o.size(); i4++) {
                    contextDataArr[i4] = (ContextData) this.f14551o.valueAt(i4);
                }
                if (this.f14546j != null) {
                    contextDataArr[this.f14551o.size()] = this.f14546j;
                }
                this.f14551o.clear();
                m9982a(contextDataArr);
            }
        } else {
            new Object[1][0] = contextData;
        }
    }

    /* renamed from: c */
    public final void mo9906c() {
        lrk lrk = new lrk();
        lrk.mo15394a(this);
        lrh.m19577a(this.f14388d, this.f14391g).mo24681a(lrk.mo15389a()).mo50371a(new dqi("[%s] remove fence", this.f14387c));
    }

    /* renamed from: e */
    public final boolean mo9859e() {
        Object[] objArr = {this.f14387c, this.f14389e};
        this.f14548l = true;
        tit tit = new tit();
        tit.mo26579a(this.f14390f.f14369c[0]);
        tit.mo26582b(1);
        tiu a = tit.mo26578a();
        eaj eaj = new eaj(this, "[ServerContextSyncProducer] get current context", new Object[0]);
        aucb a2 = lrh.m19580d(this.f14388d, this.f14391g).mo24702a(a);
        dqb dqb = this.f13883a;
        String str = this.f14387c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("ServerContextSyncProducer_");
        sb.append(str);
        sb.append("_currentContextOnStart");
        a2.mo50378a(dqb.mo9432a(dqy.m9123a(sb.toString())), eaj);
        return true;
    }

    /* renamed from: f */
    public final void mo9860f() {
        Object[] objArr = {this.f14387c, this.f14389e};
        this.f14548l = false;
        this.f13883a.mo9433a(this.f14550n);
        mo9906c();
        super.mo9860f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo9862h() {
        int[] iArr = this.f14390f.f14370d;
        if (iArr != null && iArr.length != 0) {
            this.f14551o.clear();
            this.f14553q = UUID.randomUUID().toString();
            int[] iArr2 = this.f14390f.f14370d;
            tjh tjh = null;
            for (int i : iArr2) {
                if (i == 1) {
                    if (tjh == null) {
                        tjh = tjj.m37079a();
                    }
                    tjh.mo18076a(this.f14553q, 1, dwj.m9630a(), tjx.m37114b(cdgz.f180900a.mo6606a().mo77612a()));
                } else if (i == 6) {
                    if (tjh == null) {
                        tjh = tjj.m37079a();
                    }
                    tjh.mo18076a(this.f14553q, 6, dwj.m9630a(), dwk.m9635a(cdgp.m133193b()));
                }
            }
            if (tjh != null) {
                sdl.m34954a(tjh.mo18075a(lrh.m19581e(this.f14388d, this.f14391g).f43165D)).mo50371a(new dqi("[ServerContextSyncProducer] register interests", new Object[0]));
            }
            super.mo9862h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo9863i() {
        if (this.f14553q != null) {
            lrh.m19581e(this.f14388d, this.f14391g).mo24743e(this.f14553q).mo50371a(new dqi("[%s] remove interest, key=%s", this.f14387c, this.f14553q));
        }
        super.mo9863i();
        if (this.f14390f.f14370d != null) {
            this.f14551o.clear();
        }
    }

    /* renamed from: j */
    public final void mo9907j() {
        this.f14547k = true;
        int[] iArr = this.f14390f.f14370d;
        if (iArr == null || iArr.length == 0) {
            ContextData contextData = this.f14546j;
            m9982a(contextData != null ? new ContextData[]{contextData} : null);
            return;
        }
        mo9862h();
    }

    /* renamed from: a */
    public static void m9980a(AwarenessFence awarenessFence, String str, doh doh) {
        if (awarenessFence == null || str == null || str.isEmpty() || doh == null) {
            Object[] objArr = {str, doh};
            return;
        }
        Object[] objArr2 = {str, doh, awarenessFence};
        tjo tjo = new tjo(doh, 13);
        tjo.mo26590a(((ContextFenceStub) awarenessFence).mo18034b());
        tjo.mo26588a(tju.m37104a(str, null, null));
        new Object[1][0] = Long.valueOf(dwq.m9673q().mo10051a(tjo.mo26587a()));
    }

    /* renamed from: a */
    private final void m9982a(ContextData[] contextDataArr) {
        if (!this.f14552p) {
            this.f14552p = true;
            dwt w = dwq.m9679w();
            doh doh = this.f14389e;
            bxco b = tiq.m37051b(this.f14390f.f14369c[0]);
            long a = cdia.f180929a.mo6606a().mo77632a();
            eak eak = this.f14549m;
            drv k = dwq.m9667k();
            dqx a2 = dqy.m9123a("NetworkManager#produceContext");
            a2.mo9467f();
            new dxf(w.f14313a, doh, b, contextDataArr, a, eak, k).mo9516a(a2);
        }
    }

    /* renamed from: a */
    public final void mo9905a(AwarenessFence awarenessFence) {
        if (awarenessFence != null) {
            lrk lrk = new lrk();
            lrk.mo15393a(this.f14545b, awarenessFence, this);
            lrh.m19577a(this.f14388d, this.f14391g).mo24681a(lrk.mo15389a()).mo50371a(new dqi("[%s] add fence", this.f14387c));
        }
    }

    /* renamed from: a */
    public final void mo9826a(FenceState fenceState) {
        if (!TextUtils.equals(fenceState.mo8006b(), this.f14545b)) {
            dss.m9249a(this.f14387c, "Fence trigger callback for unexpected key %s, expected %s", fenceState.mo8006b(), this.f14545b);
        } else if (fenceState.mo8005a() == 2) {
            this.f13883a.mo9435a(this.f14550n, dqy.m9123a(String.valueOf(this.f14387c).concat("_fenceStateChanged")));
        }
    }
}
