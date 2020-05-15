package p000;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tpm extends abh {

    /* renamed from: a */
    public List f46452a = new ArrayList();

    /* renamed from: d */
    public final tpp f46453d;

    public tpm(tsa tsa, tpp tpp, adcf adcf) {
        this.f46453d = tpp;
        tsa.mo26752a().mo2445a(adcf, new tpj(this));
    }

    /* renamed from: a */
    public final int mo161a() {
        List list = this.f46452a;
        if (list != null) {
            return list.size();
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
        return new tpl(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.pwm_blacklist_item, viewGroup, false));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [com.google.android.gms.credential.manager.util.FadeInImageView, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        tpl tpl = (tpl) acm;
        tqj tqj = (tqj) this.f46452a.get(i);
        if (i == 0) {
            tpl.f46448s.setVisibility(8);
        } else {
            tpl.f46448s.setVisibility(0);
        }
        if (tqj.mo26720c().mo66813a()) {
            tpl.f46449t.mo18105a((String) tqj.mo26720c().mo66814b(), tpl.f46449t.getContext());
        } else if (tqj.mo26742g().mo66813a()) {
            tpl.f46449t.setImageResource(17301651);
        } else {
            tpl.f46449t.setImageResource(C0126R.C0127drawable.quantum_ic_chrome_product_vd_theme_24);
        }
        C1280ps.m19906b((View) tpl.f46449t, 2);
        if (tqj.mo26719b().mo66813a()) {
            tpl.f46451v.setText((CharSequence) tqj.mo26719b().mo66814b());
        } else {
            tpl.f46451v.setText(tqj.mo26741f());
        }
        if (tqj.mo26721d().mo66813a()) {
            tpl.f46451v.setEllipsize((TextUtils.TruncateAt) tqj.mo26721d().mo66814b());
        } else {
            tpl.f46451v.setEllipsize(!tqj.mo26742g().mo66813a() ? TextUtils.TruncateAt.START : TextUtils.TruncateAt.END);
        }
        tpl.f46450u.setOnClickListener(new tpk(this, tqj));
    }
}
