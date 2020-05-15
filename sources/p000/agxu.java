package p000;

import android.text.Spannable;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.WalletBalanceInfo;
import com.google.android.gms.mobiledataplan.util.TimeTextUtils$URLSpanMediumNoUnderline;
import java.text.NumberFormat;
import java.util.Currency;

/* renamed from: agxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agxu implements agya {

    /* renamed from: a */
    private final WalletBalanceInfo f66817a;

    /* renamed from: b */
    private final String f66818b;

    /* renamed from: c */
    private final Spanned f66819c;

    public agxu(WalletBalanceInfo walletBalanceInfo, String str, Spanned spanned) {
        this.f66817a = walletBalanceInfo;
        this.f66818b = str;
        this.f66819c = spanned;
    }

    /* renamed from: a */
    public final int mo36175a() {
        return C0126R.C0128layout.details_dialog_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        agvp agvp = (agvp) acm;
        WalletBalanceInfo walletBalanceInfo = this.f66817a;
        String str = this.f66818b;
        Spanned spanned = this.f66819c;
        TextView textView = (TextView) agvp.f201a.findViewById(C0126R.C0129id.balance_help_text);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(spanned);
        URLSpan[] uRLSpanArr = (URLSpan[]) newSpannable.getSpans(0, newSpannable.length(), URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = newSpannable.getSpanStart(uRLSpan);
            int spanEnd = newSpannable.getSpanEnd(uRLSpan);
            newSpannable.removeSpan(uRLSpan);
            newSpannable.setSpan(new TimeTextUtils$URLSpanMediumNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        textView.setText(newSpannable);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        try {
            currencyInstance.setCurrency(Currency.getInstance(bmwb.m108444b(walletBalanceInfo.f80244b)));
            if (walletBalanceInfo.f80250h != null) {
                agvp.mo36137c(C0126R.string.total_account_balance_viewholder_description);
                agvp.mo36135a(C0126R.C0129id.complete_balance_text, walletBalanceInfo.f80250h.longValue(), currencyInstance);
                agvp.mo36138d(C0126R.C0129id.subtitle_account_balance_row);
                agvp.mo36135a(C0126R.C0129id.account_balance_value, walletBalanceInfo.f80243a, currencyInstance);
            } else {
                agvp.mo36137c(C0126R.string.account_balance_viewholder_description);
                agvp.mo36135a(C0126R.C0129id.complete_balance_text, walletBalanceInfo.f80243a, currencyInstance);
            }
            if (walletBalanceInfo.f80249g != null) {
                agvp.mo36138d(C0126R.C0129id.subtitle_loan_balance_row);
                agvp.mo36135a(C0126R.C0129id.loan_balance_value, walletBalanceInfo.f80249g.longValue(), currencyInstance);
            }
            if (walletBalanceInfo.f80251i != null) {
                agvp.mo36138d(C0126R.C0129id.unpaid_loan_box);
                agvp.mo36135a(C0126R.C0129id.unpaid_loan_value, walletBalanceInfo.f80251i.longValue(), currencyInstance);
            }
            String str2 = walletBalanceInfo.f80252j;
            if (str2 != null) {
                agvp.mo36136a((int) C0126R.C0129id.unpaid_loan_help_text, str2);
            }
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) agvp.f66665s.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Carrier provides wrong currency string %s", walletBalanceInfo.f80244b);
            agvp.mo36137c(C0126R.string.account_balance_viewholder_description);
            agvp.mo36136a((int) C0126R.C0129id.complete_balance_text, str);
        }
    }
}
