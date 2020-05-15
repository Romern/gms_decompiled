package p000;

import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.WalletBalanceInfo;
import java.text.NumberFormat;
import java.util.Currency;

/* renamed from: agxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agxv implements agya {

    /* renamed from: a */
    private final WalletBalanceInfo f66820a;

    /* renamed from: b */
    private final MdpCarrierPlanIdResponse f66821b;

    /* renamed from: c */
    private agvu f66822c;

    public agxv(WalletBalanceInfo walletBalanceInfo, MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse) {
        this.f66820a = walletBalanceInfo;
        this.f66821b = mdpCarrierPlanIdResponse;
    }

    /* renamed from: a */
    public final int mo36175a() {
        return C0126R.C0128layout.account_balance_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        Long l;
        Long l2;
        Long l3;
        String str;
        agvu agvu = (agvu) acm;
        this.f66822c = agvu;
        WalletBalanceInfo walletBalanceInfo = this.f66820a;
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = this.f66821b;
        if (walletBalanceInfo != null && !TextUtils.isEmpty(walletBalanceInfo.f80244b)) {
            agvu.f66678y = walletBalanceInfo;
            agvu.f66677x = mdpCarrierPlanIdResponse;
            long j = walletBalanceInfo.f80243a;
            if (cfnm.m140631b()) {
                Long l4 = walletBalanceInfo.f80250h;
                if (l4 != null) {
                    j = l4.longValue();
                    agvu.f66673t.setText((int) C0126R.string.total_account_balance_viewholder_description);
                } else {
                    agvu.f66673t.setText((int) C0126R.string.account_balance_viewholder_description);
                }
            }
            try {
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                currencyInstance.setCurrency(Currency.getInstance(walletBalanceInfo.f80244b.toUpperCase()));
                if (cfnm.m140638i()) {
                    agvu.f66676w = agvn.m55180a(j, currencyInstance.getCurrency().getCurrencyCode());
                } else {
                    agvu.f66676w = currencyInstance.format(agze.m55326a(j));
                }
                agvu.f66674u.setText(agvu.f66676w);
                if (walletBalanceInfo.f80243a < 0) {
                    agvu.f66674u.setTextAppearance(agvu.f66672s, 16974319);
                    agvu.f66674u.setTextColor(agvu.f66672s.getResources().getColor(C0126R.color.google_yellow_900));
                }
                if (cfnm.m140631b() && (l3 = walletBalanceInfo.f80251i) != null) {
                    long longValue = l3.longValue();
                    double a = agze.m55326a(longValue);
                    agvu.f66675v.setVisibility(0);
                    if (cfnm.m140638i()) {
                        str = agvn.m55180a(longValue, currencyInstance.getCurrency().getCurrencyCode());
                    } else {
                        str = currencyInstance.format(a);
                    }
                    agvu.f66675v.setText(agvu.f66672s.getString(C0126R.string.account_balance_unpaid_loan_text, str));
                }
                agvu.mo36144v();
                WalletBalanceInfo walletBalanceInfo2 = agvu.f66678y;
                if (walletBalanceInfo2.f80245c != 2 && ((l = walletBalanceInfo2.f80246d) == null || l.longValue() > System.currentTimeMillis() + 31536000000L)) {
                    if (cfnm.m140631b()) {
                        Long l5 = agvu.f66678y.f80249g;
                        if ((l5 == null || l5.longValue() == 0) && ((l2 = agvu.f66678y.f80251i) == null || l2.longValue() == 0)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                agvu.f201a.setOnClickListener(new agvq(agvu));
            } catch (IllegalArgumentException e) {
                bnsl bnsl = (bnsl) agvu.f66670z.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68420a("Carrier provides wrong currency string %s", walletBalanceInfo.f80244b);
                agvn.m55183a(agvu.f201a);
            }
        } else {
            ((bnsl) agvu.f66670z.mo68388c()).mo68405a("Account balance view holder passed invalid wallet balance obj");
            agvn.m55183a(agvu.f201a);
        }
    }
}
