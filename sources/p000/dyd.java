package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dyd extends drm {

    /* renamed from: CG */
    private ContextData f14386CG;

    /* renamed from: c */
    public final String f14387c;

    /* renamed from: d */
    public final Context f14388d;

    /* renamed from: e */
    public final doh f14389e;

    /* renamed from: f */
    public final dxr f14390f;

    /* renamed from: g */
    public final lri f14391g;

    /* renamed from: h */
    public Set f14392h;

    /* renamed from: i */
    public WriteBatchImpl f14393i;

    public dyd(Context context, doh doh, dxr dxr, String str, dqb dqb) {
        super(dqb, str);
        Account account;
        this.f14388d = context;
        sdo.m34959a(doh);
        this.f14389e = doh;
        sdo.m34959a(dxr);
        this.f14390f = dxr;
        String str2 = dxr.f14368b;
        if (!this.f14389e.mo9338b()) {
            account = this.f14389e.mo9337a();
        } else {
            account = null;
        }
        this.f14391g = lri.m19583b(str2, account);
        this.f14387c = str;
        if (this.f14390f.f14371e) {
            this.f14392h = new HashSet();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9845a();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, bryx, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9851a(int i) {
        if (!rjs.m33679e(dwq.m9672p().mo10035a(i, dwq.m9665i().mo20505a(), dwq.m9652a(this.f14389e, "BaseProducer")))) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dyd", "a", 330, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68422a("[%s] Failed to close ongoing contexts for contextName: %s", (Object) bryx.m114908a(this.f14387c), i);
        }
    }

    /* renamed from: a */
    public void mo9854a(dwa dwa) {
    }

    /* renamed from: a */
    public void mo9855a(dwa dwa, dwa dwa2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo9848b();

    /* renamed from: b */
    public void mo9500b(ContextData contextData) {
        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
        bnsl.mo68432a("dyd", "b", 183, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68425a("[%s] Context %s received by producer %s and not handled.", bryx.m114908a(this.f14387c), Integer.toString(contextData.mo18018g()), this.f14387c);
    }

    /* renamed from: c */
    public final void mo9856c(ContextData contextData) {
        if (contextData == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dyd", "c", 232, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[%s] write request with null contextData", bryx.m114908a(this.f14387c));
            return;
        }
        WriteBatchImpl b = tjj.m37080b();
        b.mo18101a(contextData);
        mo9852a(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo9857d(ContextData contextData) {
        this.f14386CG = contextData;
        mo9856c(contextData);
    }

    /* renamed from: d */
    public final boolean mo9858d() {
        return this.f14390f.f14371e;
    }

    /* renamed from: e */
    public boolean mo9859e() {
        Object[] objArr = {this.f14390f.f14368b, this.f14389e};
        mo9845a();
        mo9862h();
        return true;
    }

    /* renamed from: f */
    public void mo9860f() {
        Object[] objArr = {this.f14390f.f14368b, this.f14389e};
        mo9863i();
        mo9848b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo9861g() {
        return this.f14386CG != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo9862h() {
        if (this.f14390f.f14370d != null) {
            tit tit = new tit();
            for (int i : this.f14390f.f14370d) {
                tit.mo26579a(i);
            }
            lrh.m19579c(this.f14388d, this.f14391g).mo24703a(tit.mo26578a(), this).mo50371a(new dqi("[%s] registerContextListener, account=%s", this.f14387c, this.f14389e));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo9863i() {
        if (this.f14390f.f14370d != null) {
            lrh.m19579c(this.f14388d, this.f14391g).mo24704a((tjc) this).mo50371a(new dqi("[%s] unregisterContextListener, account=%s", this.f14387c, this.f14389e));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9846a(long j) {
        ContextData contextData = this.f14386CG;
        if (contextData == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dyd", "a", 304, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[%s] Ongoing data shouldn't be null.", bryx.m114908a(this.f14387c));
        } else if (contextData.mo18022j().mo26616b()) {
            tip tip = new tip(this.f14386CG);
            tip.mo26571a(j);
            mo9856c(tip.mo26570a());
        } else {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68432a("dyd", "a", 296, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68424a("[%s] ongoing data is not ongoing. type=%s", bryx.m114908a(this.f14387c), Integer.toString(this.f14386CG.mo18022j().mo26615a()));
        }
        this.f14386CG = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9852a(WriteBatchImpl writeBatchImpl) {
        if (writeBatchImpl == null || !writeBatchImpl.mo18102a()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dyd", "a", 246, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[%s] write request with empty data", bryx.m114908a(this.f14387c));
        } else if (mo9858d()) {
            Set<doh> set = this.f14392h;
            if (set != null) {
                for (doh doh : set) {
                    mo9853a(writeBatchImpl, lri.m19583b(this.f14390f.f14368b, doh.mo9337a()));
                }
            }
            this.f14393i = writeBatchImpl;
        } else {
            mo9853a(writeBatchImpl, this.f14391g);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ecv.a(doh, boolean):ecu
     arg types: [doh, int]
     candidates:
      ecv.a(doh, ecu):void
      ecv.a(doh, tjq):void
      eev.a(doh, tjq):void
      ecv.a(doh, boolean):ecu */
    /* renamed from: a */
    public final void mo9853a(WriteBatchImpl writeBatchImpl, lri lri) {
        Object[] objArr = {this.f14387c, lri.f26639f};
        ContextManagerClientInfo a = ContextManagerClientInfo.m22890a(this.f14388d, this.f14389e.f13690b, lri);
        ecv v = dwq.m9678v();
        ArrayList arrayList = writeBatchImpl.f30703a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ContextData) arrayList.get(i)).mo18010a(a.f30680d, v.mo9974a(this.f14389e, true).f14703a.f46294b);
            }
        }
        dwq.m9667k().mo9435a(new dyc(writeBatchImpl, a), dqy.m9123a("BaseProducer_write_to_store"));
    }
}
