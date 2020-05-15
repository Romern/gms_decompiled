package p000;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.WalletBalanceInfo;
import java.util.concurrent.TimeUnit;

/* renamed from: agvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agvu extends acm {

    /* renamed from: z */
    public static final srn f66670z = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: A */
    private final TextView f66671A;

    /* renamed from: s */
    public final Context f66672s;

    /* renamed from: t */
    public final TextView f66673t;

    /* renamed from: u */
    public final TextView f66674u;

    /* renamed from: v */
    public final TextView f66675v;

    /* renamed from: w */
    public String f66676w;

    /* renamed from: x */
    public MdpCarrierPlanIdResponse f66677x;

    /* renamed from: y */
    public WalletBalanceInfo f66678y;

    public agvu(View view) {
        super(view);
        this.f66672s = view.getContext();
        this.f66673t = (TextView) view.findViewById(C0126R.C0129id.balance_text);
        this.f66674u = (TextView) view.findViewById(C0126R.C0129id.balance_value);
        this.f66675v = (TextView) view.findViewById(C0126R.C0129id.unpaid_loan_value);
        this.f66671A = (TextView) view.findViewById(C0126R.C0129id.valid_time);
    }

    /* renamed from: a */
    public final Spanned mo36143a(WalletBalanceInfo walletBalanceInfo) {
        StringBuilder sb = new StringBuilder();
        String v = mo36144v();
        if (!TextUtils.isEmpty(v)) {
            sb.append(v);
        }
        if (!TextUtils.isEmpty(walletBalanceInfo.f80247e)) {
            sb.append(" ");
            sb.append(walletBalanceInfo.f80247e);
        }
        StringBuilder sb2 = new StringBuilder();
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = this.f66677x;
        if (mdpCarrierPlanIdResponse != null && !TextUtils.isEmpty(mdpCarrierPlanIdResponse.f80153c)) {
            String str = this.f66677x.f80153c;
            if (!TextUtils.isEmpty(walletBalanceInfo.f80248f)) {
                str = String.format("<a href='%s'>%s</a>", walletBalanceInfo.f80248f, str);
            }
            sb.append(" ");
            sb2.append(this.f66672s.getString(C0126R.string.account_balance_dialog_detail_carrier_name, str));
        }
        if (agqg.m54838E().booleanValue()) {
            return agze.m55328a(sb.toString(), sb2.toString());
        }
        sb.append((CharSequence) sb2);
        return agze.m55327a(sb.toString());
    }

    /* renamed from: v */
    public final String mo36144v() {
        WalletBalanceInfo walletBalanceInfo = this.f66678y;
        if (walletBalanceInfo.f80245c == 2) {
            this.f66671A.setText((int) C0126R.string.account_balance_valid_time_view_invalid);
            this.f66671A.setTextAppearance(this.f66672s, 16974319);
            this.f66671A.setTextColor(this.f66672s.getResources().getColor(C0126R.color.google_yellow_900));
            return this.f66672s.getString(C0126R.string.account_balance_dialog_invalid);
        }
        Long l = walletBalanceInfo.f80246d;
        if (l == null || l.longValue() > System.currentTimeMillis() + 31536000000L) {
            this.f66671A.setVisibility(8);
            return null;
        }
        long longValue = this.f66678y.f80246d.longValue() - System.currentTimeMillis();
        if (longValue >= 0) {
            String b = agze.m55338b(longValue, this.f66672s);
            long days = TimeUnit.MILLISECONDS.toDays(longValue);
            if (days >= 30) {
                this.f66671A.setText(this.f66672s.getString(C0126R.string.account_balance_valid_time_view_valid_until, b));
                return this.f66672s.getString(C0126R.string.account_balance_dialog_valid_until, b);
            } else if (days == 0) {
                this.f66671A.setText(this.f66672s.getString(C0126R.string.account_balance_valid_time_view_invalid_in, b));
                this.f66671A.setTextAppearance(this.f66672s, 16974319);
                this.f66671A.setTextColor(this.f66672s.getResources().getColor(C0126R.color.google_yellow_900));
                return this.f66672s.getString(C0126R.string.account_balance_dialog_invalid_in, b);
            } else {
                this.f66671A.setText(this.f66672s.getString(C0126R.string.account_balance_valid_time_view_valid_for, b));
                return this.f66672s.getString(C0126R.string.account_balance_dialog_valid_for, b);
            }
        } else {
            this.f66671A.setText((int) C0126R.string.account_balance_valid_time_view_invalid);
            this.f66671A.setTextAppearance(this.f66672s, 16974319);
            this.f66671A.setTextColor(this.f66672s.getResources().getColor(C0126R.color.google_yellow_900));
            return this.f66672s.getString(C0126R.string.account_balance_dialog_invalid);
        }
    }
}
