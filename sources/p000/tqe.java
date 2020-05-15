package p000;

import android.os.Bundle;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: tqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tqe extends adcf {

    /* renamed from: a */
    public bngx f46478a;

    /* renamed from: b */
    public Boolean f46479b;

    /* renamed from: c */
    public Boolean f46480c;

    /* renamed from: d */
    public tpy f46481d;

    /* renamed from: e */
    public int f46482e = -1;

    /* renamed from: f */
    public int f46483f = -1;

    /* renamed from: g */
    public boolean f46484g = false;

    /* renamed from: h */
    private boolean f46485h = false;

    /* renamed from: a */
    public final void mo26717a() {
        if (!this.f46485h && this.f46482e != -1 && this.f46483f != -1 && this.f46479b != null && this.f46480c != null && this.f46478a != null) {
            bnre i = ((bngx) ((tql) ((tsf) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), getArguments().getString("pwm.DataFieldNames.accountName"))).mo3444a(tsf.class)).mo26759c().mo2448b()).mo26735a()).listIterator();
            int i2 = 0;
            int i3 = 0;
            while (i.hasNext()) {
                C0034at atVar = (C0034at) i.next();
                if (atVar.mo2448b() != null) {
                    i3++;
                    i2 += ((bsjx) atVar.mo2448b()).mo70638c().size();
                }
            }
            tpy tpy = this.f46481d;
            bxvd da = bspo.f146541k.mo74144da();
            bsmt bsmt = (bsmt) getArguments().getSerializable("pwm.DataFieldNames.identityEventCategory");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspo bspo = (bspo) da.f164949b;
            bspo.f146544b = bsmt.f145305dO;
            int i4 = bspo.f146543a | 1;
            bspo.f146543a = i4;
            int i5 = this.f46482e;
            int i6 = i4 | 2;
            bspo.f146543a = i6;
            bspo.f146545c = i5;
            int i7 = i6 | 4;
            bspo.f146543a = i7;
            bspo.f146546d = i2;
            int i8 = i7 | 8;
            bspo.f146543a = i8;
            bspo.f146547e = i3;
            int i9 = this.f46483f;
            bspo.f146543a = i8 | 16;
            bspo.f146548f = i9;
            boolean booleanValue = this.f46480c.booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspo bspo2 = (bspo) da.f164949b;
            bspo2.f146543a |= 32;
            bspo2.f146549g = booleanValue;
            boolean z = !this.f46479b.booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspo bspo3 = (bspo) da.f164949b;
            bspo3.f146543a |= 64;
            bspo3.f146550h = z;
            boolean a = tsg.m37427a(this.f46478a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspo bspo4 = (bspo) da.f164949b;
            bspo4.f146543a |= 128;
            bspo4.f146551i = a;
            boolean b = tsg.m37429b(this.f46478a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspo bspo5 = (bspo) da.f164949b;
            bspo5.f146543a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bspo5.f146552j = b;
            bspo bspo6 = (bspo) da.mo74062i();
            bxvd da2 = bspq.f146567d.mo74144da();
            bxvd da3 = bspm.f146525d.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bspm bspm = (bspm) da3.f164949b;
            bspo6.getClass();
            bspm.f146529c = bspo6;
            bspm.f146527a |= 64;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bspq bspq = (bspq) da2.f164949b;
            bspm bspm2 = (bspm) da3.mo74062i();
            bspm2.getClass();
            bspq.f146571c = bspm2;
            bspq.f146569a |= 8;
            tpy.mo26716a((bspq) da2.mo74062i());
            this.f46485h = true;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f46485h = bundle.getBoolean("utils.UserMetricsFragment.loadAlreadyLogged", false);
            this.f46482e = bundle.getInt("utils.UserMetricsFragment.lastNumPasswords", -1);
            this.f46483f = bundle.getInt("utils.UserMetricsFragment.lastNumBlacklistEntries", -1);
            this.f46484g = bundle.getBoolean("utils.UserMetricsFragment.searchLogged", false);
        }
        String string = getArguments().getString("pwm.DataFieldNames.accountName");
        this.f46481d = tpy.m37326a(getContext(), string, (bsmt) getArguments().getSerializable("pwm.DataFieldNames.identityEventCategory"));
        C0060br a = adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), string));
        tsf tsf = (tsf) a.mo3444a(tsf.class);
        tsf.mo26759c().mo2445a(this, new tpz(this));
        tsf.f46584g.mo2445a(this, new tqa(this));
        ((tsa) a.mo3444a(tsa.class)).mo26752a().mo2445a(this, new tqb(this));
        if (!this.f46485h) {
            ((tsh) a.mo3444a(tsh.class)).mo26762a().mo2445a(this, new tqc(this));
            ((tsb) a.mo3444a(tsb.class)).mo26753a().mo2445a(this, new tqd(this));
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("utils.UserMetricsFragment.loadAlreadyLogged", this.f46485h);
        bundle.putInt("utils.UserMetricsFragment.lastNumPasswords", this.f46482e);
        bundle.putInt("utils.UserMetricsFragment.lastNumBlacklistEntries", this.f46483f);
        bundle.putBoolean("utils.UserMetricsFragment.searchLogged", this.f46484g);
    }
}
