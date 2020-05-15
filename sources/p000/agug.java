package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: agug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agug extends abh {

    /* renamed from: a */
    public final ArrayList f66571a = new ArrayList();

    /* renamed from: a */
    public final int mo161a() {
        return this.f66571a.size();
    }

    /* renamed from: c */
    public final void mo36117c() {
        this.f66571a.clear();
        mo171aJ();
    }

    /* renamed from: e */
    public final void mo36118e(int i, int i2) {
        this.f66571a.subList(i, i2).clear();
        mo178d(i, i2 - i);
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return ((agya) this.f66571a.get(i)).mo36175a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        if (i == C0126R.C0128layout.account_balance_item) {
            return new agvu(inflate);
        }
        if (i == C0126R.C0128layout.separator_line_item || i == C0126R.C0128layout.settings_separator_line_item) {
            return new agwz(inflate);
        }
        if (i == C0126R.C0128layout.carrier_item) {
            return new agvx(inflate);
        }
        if (i == C0126R.C0128layout.unlimited_dataplan_item) {
            return new agxl(inflate);
        }
        if (i == C0126R.C0128layout.progressbar_dataplan_item) {
            return new agwr(inflate);
        }
        if (i == C0126R.C0128layout.flex_win_item) {
            return new agwi(inflate);
        }
        if (i == C0126R.C0128layout.notification_link_item) {
            return new agwk(inflate);
        }
        if (i == C0126R.C0128layout.notification_switch_item || i == C0126R.C0128layout.settings_notification_switch_item) {
            return new agwp(inflate);
        }
        if (i == C0126R.C0128layout.purchase_dialog_text_item) {
            return new agws(inflate);
        }
        if (i == C0126R.C0128layout.purchase_dialog_title_item) {
            return new agwt(inflate);
        }
        if (i == C0126R.C0128layout.small_line_item) {
            return new agwz(inflate);
        }
        if (i == C0126R.C0128layout.update_info_item) {
            return new agxm(inflate);
        }
        if (i == C0126R.C0128layout.upsell_plan_item || i == C0126R.C0128layout.upsell_plan_item_pre_v23) {
            return new agxt(inflate);
        }
        if (i == C0126R.C0128layout.support_channel_item) {
            return new agxe(inflate);
        }
        if (i == C0126R.C0128layout.details_dialog_item) {
            return new agvp(inflate);
        }
        if (i == C0126R.C0128layout.upsell_placeholder_item) {
            return new agwz(inflate);
        }
        if (i == C0126R.C0128layout.repurchase_single_card_item || i == C0126R.C0128layout.repurchase_card_item) {
            return new agwv(inflate);
        }
        if (i == C0126R.C0128layout.repurchase_list_item) {
            return new agwx(inflate);
        }
        if (i == C0126R.C0128layout.repurchase_start_space_item || i == C0126R.C0128layout.repurchase_end_space_item) {
            return new acm(inflate);
        }
        if (i != C0126R.C0128layout.revoke_consent_item) {
            return null;
        }
        return new agwy(inflate);
    }

    /* renamed from: a */
    public final void mo36115a(int i, agya agya) {
        this.f66571a.add(i, agya);
        mo159N(i);
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        ((agya) this.f66571a.get(i)).mo36176a(acm);
    }

    /* renamed from: a */
    public final void mo36116a(agya agya) {
        if (this.f66571a.add(agya)) {
            mo159N(this.f66571a.size() - 1);
        }
    }
}
