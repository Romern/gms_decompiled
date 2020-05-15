package p000;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: tol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tol extends abh {

    /* renamed from: a */
    public bsjx f46408a;

    /* renamed from: d */
    private final adcf f46409d;

    public tol(trz trz, adcf adcf) {
        trz.f46572d.mo2445a(adcf, new toh(this));
        this.f46409d = adcf;
    }

    /* renamed from: a */
    private final void m37290a(int i, bskf bskf) {
        Intent intent = new Intent();
        if (i == 1 || i == 3) {
            intent.putExtra("pwm.DataFieldNames.pickerUsername", bskf.mo70660f());
        }
        if ((i == 2 || i == 3) && ((tqk) bskf.mo70661g()).mo26727b().mo66813a()) {
            intent.putExtra("pwm.DataFieldNames.pickerPassword", ((bsqg) ((tqk) bskf.mo70661g()).mo26727b().mo66814b()).mo70699a());
        }
        ArrayList arrayList = new ArrayList();
        bnrd a = bskf.mo70644c().iterator();
        while (a.hasNext()) {
            arrayList.add(((bytw) a.next()).f167728b);
        }
        intent.putExtra("pwm.DataFieldNames.pickerCredentialDomains", arrayList);
        this.f46409d.getActivity().setResult(-1, intent);
        this.f46409d.getActivity().finish();
    }

    /* renamed from: a */
    public final int mo161a() {
        bsjx bsjx = this.f46408a;
        if (bsjx != null) {
            return bsjx.mo70638c().size();
        }
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new tok(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.pwm_picker_credential_group, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        boolean z;
        tok tok = (tok) acm;
        bmxy.m108581a(this.f46408a);
        bskf bskf = (bskf) this.f46408a.mo70638c().get(i);
        boolean z2 = false;
        if (!this.f46409d.getActivity().getIntent().getBooleanExtra("pwm.DataFieldNames.hasTwoFields", false) || mo161a() != 1) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (mo161a() == 1) {
                z2 = true;
            }
            tok.mo26687a(bskf, z, z2, this.f46408a.mo70637b().f167739b);
            int i2 = tok.f46400u;
            tok.f46401s.setOnClickListener(new toi(this, bskf));
            tok.f46402t.setOnClickListener(new toj(this, bskf));
            return;
        }
        m37290a(3, bskf);
    }

    /* renamed from: a */
    public final void mo26688a(bskf bskf, int i) {
        if (this.f46409d.getActivity().getIntent().getBooleanExtra("pwm.DataFieldNames.hasTwoFields", false)) {
            m37290a(3, bskf);
        } else {
            m37290a(i, bskf);
        }
    }
}
