package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.List;

/* renamed from: hdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hdr extends abh {

    /* renamed from: a */
    private final aczm f19542a;

    /* renamed from: d */
    private final bdej f19543d = new bdej(new adap(new adzt(Looper.getMainLooper())));

    /* renamed from: e */
    private final Bitmap f19544e;

    /* renamed from: f */
    private final int f19545f;

    /* renamed from: g */
    private List f19546g;

    public hdr(int i, aczm aczm, Bitmap bitmap) {
        this.f19542a = aczm;
        this.f19544e = bitmap;
        this.f19545f = i;
    }

    /* renamed from: a */
    public final int mo161a() {
        List list = this.f19546g;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return ((aczd) this.f19546g.get(i)).f61127a;
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
        Context context = viewGroup.getContext();
        bqgj a = snp.m35702a(9);
        hdq hdq = new hdq();
        AccountParticleDisc.m94876a(context, this.f19543d, a, hdq, hdq, aczd.class);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new hdl(from.inflate((int) C0126R.C0128layout.credentials_assisted_account_row, viewGroup, false), this.f19543d);
        }
        if (i == 1) {
            return new hdp(from.inflate(this.f19545f, viewGroup, false), this.f19544e);
        }
        if (i == 2) {
            return new hdn(from.inflate((int) C0126R.C0128layout.credentials_account_chooser_add_account, viewGroup, false));
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Invalid view type: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        List list = this.f19546g;
        if (list != null && i < list.size()) {
            ((hdo) acm).mo12410a((aczd) this.f19546g.get(i), this.f19542a);
        }
    }

    /* renamed from: a */
    public final void mo12412a(List list) {
        this.f19546g = list;
        mo171aJ();
    }
}
