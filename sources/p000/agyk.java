package p000;

import android.view.ViewManager;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agyk implements agya {

    /* renamed from: a */
    private final bszg f66861a;

    /* renamed from: b */
    private agxe f66862b;

    public agyk(bszg bszg) {
        this.f66861a = bszg;
    }

    /* renamed from: a */
    public final int mo36175a() {
        return C0126R.C0128layout.support_channel_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        agxe agxe = (agxe) acm;
        this.f66862b = agxe;
        bszg bszg = this.f66861a;
        if (bszg.f147818c.isEmpty()) {
            agxe.f66767w.mo26019b(agyt.m55307c()).mo68405a("Input empty support channel target at view holder, won't show ui");
            agvn.m55183a(agxe.f201a);
            return;
        }
        int b = btbi.m116395b(bszg.f147821f);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        if (i == 1) {
            agxe.f66770u.setImageResource(C0126R.C0127drawable.quantum_ic_phone_googblue_24);
        } else if (i == 2) {
            agxe.f66770u.setImageResource(C0126R.C0127drawable.quantum_ic_email_googblue_24);
        } else if (i == 3) {
            agxe.f66770u.setImageResource(C0126R.C0127drawable.quantum_ic_open_in_browser_googblue_24);
        } else if (i != 4) {
            agvn.m55183a(agxe.f201a);
            return;
        } else {
            agxe.f66770u.setImageResource(C0126R.C0127drawable.quantum_ic_textsms_googblue_24);
        }
        agxe.f66770u.setVisibility(0);
        if (bszg.f147816a.isEmpty()) {
            agxe.f66768s.setText(bszg.f147818c);
        } else {
            agxe.f66768s.setText(bszg.f147816a);
        }
        if (bszg.f147817b.isEmpty()) {
            agxe.f66769t.setVisibility(8);
            ((ViewManager) agxe.f66769t.getParent()).removeView(agxe.f66769t);
        } else {
            agxe.f66769t.setText(bszg.f147817b);
        }
        agxe.f201a.setOnClickListener(new agxa(agxe, bszg));
    }
}
