package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.List;

/* renamed from: atzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atzw extends abh {

    /* renamed from: a */
    public final Activity f91302a;

    /* renamed from: d */
    public List f91303d = bngx.m109376e();

    public atzw(Activity activity) {
        this.f91302a = activity;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f91303d.size() + 2;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        if (i != 0) {
            return i == this.f91303d.size() + 1 ? 2 : 1;
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
    public final acm mo163a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new acm(from.inflate((int) C0126R.C0128layout.tp_wear_select_account_header, viewGroup, false));
        }
        if (i == 1) {
            return new atzt(from.inflate((int) C0126R.C0128layout.tp_wear_select_account_owner_item, viewGroup, false), new atzu());
        }
        if (i == 2) {
            return new acm(from.inflate((int) C0126R.C0128layout.tp_wear_add_account_item, viewGroup, false), new atzv(this));
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unknown view type: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        if (acm instanceof atzt) {
            atzt atzt = (atzt) acm;
            String str = (String) this.f91303d.get(i - 1);
            atzt.f201a.setTag(str);
            atzt.f91299s.setText(str);
            AccountParticleDisc accountParticleDisc = atzt.f91300t;
            bddn g = bddo.m90606g();
            g.mo57907a(str);
            g.mo57908b();
            accountParticleDisc.mo60577a(g.mo57906a());
        }
    }
}
