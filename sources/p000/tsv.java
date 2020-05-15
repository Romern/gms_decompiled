package p000;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.credential.manager.util.FadeInImageView;
import java.util.Locale;

/* renamed from: tsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tsv extends abh {

    /* renamed from: a */
    public final trz f46612a;

    /* renamed from: d */
    public final adcf f46613d;

    /* renamed from: e */
    public bngx f46614e;

    public tsv(tsf tsf, trz trz, boolean z, adcf adcf) {
        this.f46612a = trz;
        this.f46613d = adcf;
        (!z ? tsf.mo26759c() : tsf.f46583f).mo2445a(adcf, new tss(this));
    }

    /* renamed from: a */
    public final int mo161a() {
        bngx bngx = this.f46614e;
        if (bngx != null) {
            return bngx.size();
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
        return new tsu(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.pwm_password_list_item, viewGroup, false));
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
        TextUtils.TruncateAt truncateAt;
        tsu tsu = (tsu) acm;
        bmxy.m108581a(this.f46614e);
        C0034at atVar = (C0034at) this.f46614e.get(i);
        bsjx bsjx = (bsjx) atVar.mo2448b();
        if (i == 0) {
            tsu.f46608s.setVisibility(8);
        } else {
            tsu.f46608s.setVisibility(0);
        }
        String str = bsjx.mo70637b().f167741d;
        if (!bmxx.m108577a(str)) {
            FadeInImageView fadeInImageView = tsu.f46609t;
            fadeInImageView.mo18105a(str, fadeInImageView.getContext());
        } else {
            tsu.f46609t.setImageResource(17301651);
            if (((tqk) ((bskf) bsjx.mo70638c().get(0)).mo70642a().get(0)).mo26728c().toLowerCase(Locale.US).startsWith("android://")) {
                tsu.f46609t.setImageResource(17301651);
            } else {
                tsu.f46609t.setImageResource(C0126R.C0127drawable.quantum_ic_chrome_product_vd_theme_24);
            }
        }
        C1280ps.m19906b((View) tsu.f46609t, 2);
        tsu.f46610u.setText(bsjx.mo70637b().f167739b);
        TextView textView = tsu.f46610u;
        int a = bytu.m125339a(bsjx.mo70637b().f167740c);
        if (a != 0 && a == 2) {
            truncateAt = TextUtils.TruncateAt.START;
        } else {
            truncateAt = TextUtils.TruncateAt.END;
        }
        textView.setEllipsize(truncateAt);
        Resources resources = tsu.f46611v.getContext().getResources();
        int size = bsjx.mo70638c().size();
        if (size > 1) {
            tsu.f46611v.setVisibility(0);
            tsu.f46611v.setText(resources.getQuantityString(C0126R.plurals.pwm_password_list_entry_account_num, size, Integer.valueOf(size)));
        } else {
            tsu.f46611v.setVisibility(8);
        }
        tsu.f201a.setOnClickListener(new tst(this, atVar));
    }
}
