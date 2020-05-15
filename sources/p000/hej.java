package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.List;

/* renamed from: hej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hej extends abh {

    /* renamed from: a */
    public final hem f19597a;

    /* renamed from: d */
    private final String f19598d;

    /* renamed from: e */
    private List f19599e;

    /* renamed from: f */
    private bdej f19600f;

    public hej(hem hem, String str) {
        this.f19597a = hem;
        this.f19598d = str;
    }

    /* renamed from: a */
    public final int mo161a() {
        List list = this.f19599e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        List list = this.f19599e;
        sdo.m34959a(list);
        return ((hek) list.get(i)).f19601a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        adap adap = new adap(new adzt(Looper.getMainLooper()));
        Context context = viewGroup.getContext();
        bqgj a = snp.m35702a(9);
        this.f19600f = new bdej(adap);
        heo heo = new heo(this.f19598d);
        AccountParticleDisc.m94876a(context, this.f19600f, a, heo, heo, hek.class);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 2) {
            return new hei(from.inflate((int) C0126R.C0128layout.credentials_assisted_account_row, viewGroup, false), this.f19600f);
        }
        return new acm(from.inflate((int) C0126R.C0128layout.credentials_assisted_header_row, viewGroup, false), (byte[]) null);
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        List list = this.f19599e;
        if (list != null && i < list.size()) {
            hek hek = (hek) this.f19599e.get(i);
            hei hei = (hei) acm;
            int i2 = hek.f19601a;
            hei.f19593s.setText(hek.f19604d);
            hei.f19594t.setText(hek.f19603c);
            hei.f19594t.setTypeface(i2 == 0 ? Typeface.SANS_SERIF : Typeface.MONOSPACE);
            hei.f19595u.mo60577a(hek);
            hei.f19596v.setOnClickListener(new heh(this, hek, hei));
        }
    }

    /* renamed from: a */
    public final void mo12441a(List list) {
        this.f19599e = list;
        mo171aJ();
    }
}
