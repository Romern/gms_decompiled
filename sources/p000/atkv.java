package p000;

import android.support.p002v7.widget.SwitchCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.TransactionInfo;
import com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity;

/* renamed from: atkv */
public final /* synthetic */ class atkv implements rkl {

    /* renamed from: a */
    private final NotificationSettingsChimeraActivity f90429a;

    public atkv(NotificationSettingsChimeraActivity notificationSettingsChimeraActivity) {
        this.f90429a = notificationSettingsChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        boolean z;
        NotificationSettingsChimeraActivity notificationSettingsChimeraActivity = this.f90429a;
        asmj asmj = (asmj) rkk;
        if (!asmj.mo7183bo().mo17710c() || asmj.mo49241b() == null) {
            notificationSettingsChimeraActivity.mo59404a(new IllegalArgumentException("GetAllCards failed"));
            return;
        }
        CardInfo[] cardInfoArr = asmj.mo49241b().f108369a;
        ((ViewGroup) notificationSettingsChimeraActivity.findViewById(C0126R.C0129id.PaymentCardContainer)).removeAllViews();
        for (CardInfo cardInfo : cardInfoArr) {
            TransactionInfo transactionInfo = cardInfo.f108352m;
            if (transactionInfo != null && transactionInfo.f108470c == 3) {
                notificationSettingsChimeraActivity.findViewById(C0126R.C0129id.NonGooglePayTransactions).setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) notificationSettingsChimeraActivity.findViewById(C0126R.C0129id.PaymentCardContainer);
                View inflate = notificationSettingsChimeraActivity.getLayoutInflater().inflate((int) C0126R.C0128layout.tp_notification_setting_toggle, viewGroup, false);
                if (cardInfo.f108352m.f108471d == 4) {
                    z = true;
                } else {
                    z = false;
                }
                ((SwitchCompat) inflate.findViewById(C0126R.C0129id.Switch)).setChecked(z);
                ((TextView) inflate.findViewById(C0126R.C0129id.Title)).setText(cardInfo.f108343d.toString());
                inflate.findViewById(C0126R.C0129id.Description).setVisibility(8);
                inflate.setTag(cardInfo);
                inflate.setOnClickListener(new atkp(notificationSettingsChimeraActivity));
                viewGroup.addView(inflate);
                ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.Icon);
                asju.m74252a(notificationSettingsChimeraActivity.f108664d, cardInfo, imageView);
                imageView.setVisibility(0);
            }
        }
    }
}
