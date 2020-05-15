package p000;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.List;

/* renamed from: rhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rhz extends abh {

    /* renamed from: a */
    public final aczm f43009a;

    /* renamed from: d */
    public List f43010d;

    /* renamed from: e */
    private final int f43011e;

    /* renamed from: f */
    private final int f43012f;

    /* renamed from: g */
    private bdej f43013g;

    public rhz(aczm aczm, int i, int i2) {
        this.f43009a = aczm;
        this.f43011e = i;
        this.f43012f = i2;
    }

    /* renamed from: a */
    public final int mo161a() {
        List list = this.f43010d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        List list = this.f43010d;
        sdo.m34959a(list);
        return ((aczd) list.get(i)).f61127a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        adap adap = new adap(new adzt(Looper.getMainLooper()));
        Context context = viewGroup.getContext();
        bqgj a = snp.m35702a(9);
        this.f43013g = new bdej(adap);
        rhu rhu = new rhu();
        AccountParticleDisc.m94876a(context, this.f43013g, a, rhu, rhu, aczd.class);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new rhw(from.inflate((int) C0126R.C0128layout.common_account_account_picker_header_row, viewGroup, false));
        }
        if (i == 2) {
            return new rhv(from.inflate((int) C0126R.C0128layout.common_account_add_account_chip_view, viewGroup, false));
        }
        if (i == 3) {
            return new rhx(from.inflate(this.f43011e, viewGroup, false));
        }
        if (i != 4) {
            return new rht(from.inflate((int) C0126R.C0128layout.common_account_chip_account_with_disc_row, viewGroup, false), this.f43013g);
        }
        return new rhy(from.inflate(this.f43012f, viewGroup, false), this.f43013g);
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        List list = this.f43010d;
        if (list != null && i < list.size()) {
            aczd aczd = (aczd) this.f43010d.get(i);
            int i2 = aczd.f61127a;
            if (i2 == 0) {
                rht rht = (rht) acm;
                rht.f42998s.setText(aczd.f61130d);
                rht.f42999t.setText(aczd.f61129c);
                rht.f43000u.mo60577a(aczd);
                rht.f43001v.setOnClickListener(new rhr(this, aczd));
            } else if (i2 == 1) {
                ((rhw) acm).f43003s.setText(aczd.f61129c);
            } else if (i2 == 2) {
                ((rhv) acm).f43002s.setOnClickListener(new rhq(this, aczd));
            } else if (i2 != 3) {
                rhy rhy = (rhy) acm;
                rhy.f43005s.setText(aczd.f61130d);
                rhy.f43006t.setText(aczd.f61129c);
                rhy.f43007u.mo60577a(aczd);
                rhy.f43008v.setClickable(false);
            } else {
                ((rhx) acm).f43004s.setOnClickListener(new rhs(this, aczd));
            }
        }
    }
}
