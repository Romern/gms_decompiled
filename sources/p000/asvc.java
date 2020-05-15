package p000;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.util.List;

/* renamed from: asvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asvc extends abh {

    /* renamed from: a */
    static final int f89796a;

    /* renamed from: h */
    private static final bnzc f89797h;

    /* renamed from: d */
    public final asvh f89798d;

    /* renamed from: e */
    public final View.OnClickListener f89799e;

    /* renamed from: f */
    public final boolean f89800f;

    /* renamed from: g */
    public String f89801g;

    /* renamed from: i */
    private List f89802i;

    static {
        bnzc h = bnzi.m110906h();
        f89797h = h;
        f89796a = h.mo68720a(asvc.class.getCanonicalName()).mo68741c();
    }

    public asvc(asvh asvh, auak auak, boolean z) {
        this.f89798d = asvh;
        this.f89799e = auak;
        this.f89800f = z;
        mo170a(true);
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        return (long) f89797h.mo68720a(((CardInfo) this.f89802i.get(i)).f108340a).mo68741c();
    }

    /* renamed from: a */
    public final int mo161a() {
        List list = this.f89802i;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return f89796a;
    }

    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        return new asvb(this, viewGroup);
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        CardInfo cardInfo = (CardInfo) this.f89802i.get(i);
        asvb asvb = (asvb) acm;
        Context context = asvb.f201a.getContext();
        asvb.f89790t.setText(cardInfo.f108343d);
        Uri uri = asvb.f89794x;
        if (uri == null || !uri.equals(cardInfo.f108347h)) {
            asju.m74252a(asvb.f89793w, cardInfo, asvb.f89789s);
            asvb.f89794x = cardInfo.f108347h;
        }
        int i2 = cardInfo.f108345f.f108459b;
        int a = atyg.m76547a(context, C0126R.attr.colorOnSurfaceVariant);
        if (i2 == 2) {
            asvb.mo49523a(asvb.f89791u, context.getString(C0126R.string.tp_tokenize_contacting_bank), a);
        } else if (i2 == 3) {
            asvb.mo49523a(asvb.f89791u, context.getString(C0126R.string.tp_verification_needed), C0126R.color.tp_action_color);
        } else if (i2 == 4) {
            asvb.mo49523a(asvb.f89791u, context.getString(C0126R.string.tp_token_state_suspended), C0126R.color.tp_action_color);
        } else if (i2 == 5) {
            boolean z = true;
            if (!cardInfo.mo59217a() && !asvb.f89795y.f89800f) {
                z = false;
            }
            if (cardInfo.f108345f.f108460c && z) {
                asvb.mo49523a(asvb.f89791u, context.getString(!cardInfo.mo59217a() ? C0126R.string.tp_selected_card : C0126R.string.tp_primary_card), a);
            } else {
                asvb.mo49523a(asvb.f89791u, null, a);
            }
        } else if (i2 == 6) {
            asvb.mo49523a(asvb.f89791u, context.getString(C0126R.string.tp_felica_pending_provisioning), C0126R.color.tp_action_color);
        }
        asvb.f89792v.setOnClickListener(new asva(asvb, i2, cardInfo));
        asvb.f201a.setTag(cardInfo);
        asvb.f201a.setOnClickListener(asvb.f89795y.f89798d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49526a(List list, String str) {
        this.f89802i = list;
        this.f89801g = str;
        mo171aJ();
    }
}
