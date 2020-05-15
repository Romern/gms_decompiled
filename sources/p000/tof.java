package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tof extends abh {

    /* renamed from: a */
    public static final srn f46392a = srn.m36127a(sgj.CREDENTIAL_MANAGER);

    /* renamed from: d */
    public bsjx f46393d;

    /* renamed from: e */
    public final tnx f46394e;

    public tof(trz trz, tnx tnx, adcf adcf) {
        this.f46394e = tnx;
        trz.f46572d.mo2445a(adcf, new tny(this));
    }

    /* renamed from: a */
    public final int mo161a() {
        bsjx bsjx = this.f46393d;
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
        int i2 = toe.f46380z;
        return new toe(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.pwm_credential_group, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        boolean z;
        toe toe = (toe) acm;
        bmxy.m108581a(this.f46393d);
        bskf bskf = (bskf) this.f46393d.mo70638c().get(i);
        boolean z2 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (mo161a() == 1) {
            z2 = true;
        }
        toe.mo26684a(bskf, z, z2, this.f46393d.mo70637b().f167739b);
        toe.f46386t.setOnClickListener(new tnz(this, toe));
        toe.f46389w.setOnClickListener(new toa(this, bskf));
        toe.f46387u.setOnClickListener(new tob(this, bskf));
        toe.f46388v.setOnClickListener(new toc(this, bskf));
        toe.f46390x.setOnClickListener(new tod(this, bskf));
    }
}
