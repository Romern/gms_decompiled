package p000;

import android.support.p002v7.widget.SwitchCompat;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity;

/* renamed from: atkp */
final /* synthetic */ class atkp implements View.OnClickListener {

    /* renamed from: a */
    private final NotificationSettingsChimeraActivity f90423a;

    public atkp(NotificationSettingsChimeraActivity notificationSettingsChimeraActivity) {
        this.f90423a = notificationSettingsChimeraActivity;
    }

    public void onClick(View view) {
        int i;
        NotificationSettingsChimeraActivity notificationSettingsChimeraActivity = this.f90423a;
        CardInfo cardInfo = (CardInfo) view.getTag();
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(C0126R.C0129id.Switch);
        switchCompat.toggle();
        boolean isChecked = switchCompat.isChecked();
        asjn asjn = notificationSettingsChimeraActivity.f108663c;
        String str = cardInfo.f108340a;
        AccountInfo accountInfo = notificationSettingsChimeraActivity.f108665e;
        String str2 = accountInfo.f108325a;
        String str3 = accountInfo.f108326b;
        bssm b = NotificationSettingsChimeraActivity.m93117b(C0126R.string.tp_payment_card_setting_heading, C0126R.string.tp_payment_card_setting_subheading);
        bxvd da = bsrn.f146780d.mo74144da();
        bxvd da2 = bssl.f146873c.mo74144da();
        if (!isChecked) {
            i = 3;
        } else {
            i = 2;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bssl bssl = (bssl) da2.f164949b;
        bssl.f146876b = i - 1;
        bssl.f146875a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsrn bsrn = (bsrn) da.f164949b;
        bssl bssl2 = (bssl) da2.mo74062i();
        bssl2.getClass();
        bsrn.f146783b = bssl2;
        bsrn.f146782a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsrn bsrn2 = (bsrn) da.f164949b;
        str.getClass();
        bsrn2.f146782a |= 2;
        bsrn2.f146784c = str;
        bsrn bsrn3 = (bsrn) da.mo74062i();
        bxvd da3 = bsrf.f146744d.mo74144da();
        bsmz bsmz = bsmz.GOOGLE_PAY_SETTING_CHANGE;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsrf bsrf = (bsrf) da3.f164949b;
        bsrf.f146747b = bsmz.f146213dO;
        bsrf.f146746a |= 1;
        bxvd da4 = bsrg.f146749m.mo74144da();
        bxvd da5 = bsru.f146799c.mo74144da();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bsru bsru = (bsru) da5.f164949b;
        bsrn3.getClass();
        bsru.f146802b = bsrn3;
        bsru.f146801a = 7;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsrg bsrg = (bsrg) da4.f164949b;
        bsru bsru2 = (bsru) da5.mo74062i();
        bsru2.getClass();
        bsrg.f146759i = bsru2;
        bsrg.f146751a |= 134217728;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsrf bsrf2 = (bsrf) da3.f164949b;
        bsrg bsrg2 = (bsrg) da4.mo74062i();
        bsrg2.getClass();
        bsrf2.f146748c = bsrg2;
        bsrf2.f146746a |= 2;
        byte[] a = asjn.mo49198a(str2, str3, (bsrf) da3.mo74062i(), b);
        bxvd da6 = btpf.f149840d.mo74144da();
        bxvd da7 = btiy.f149054c.mo74144da();
        String str4 = cardInfo.f108340a;
        if (da7.f164950c) {
            da7.mo74035c();
            da7.f164950c = false;
        }
        str4.getClass();
        ((btiy) da7.f164949b).f149056a = str4;
        bxtx a2 = bxtx.m123261a(cardInfo.f108341b);
        if (da7.f164950c) {
            da7.mo74035c();
            da7.f164950c = false;
        }
        a2.getClass();
        ((btiy) da7.f164949b).f149057b = a2;
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        btiy btiy = (btiy) da7.mo74062i();
        btiy.getClass();
        ((btpf) da6.f164949b).f149842a = btiy;
        bxtx a3 = bxtx.m123261a(a);
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        a3.getClass();
        ((btpf) da6.f164949b).f149844c = a3;
        bxvd da8 = btpe.f149837b.mo74144da();
        int i2 = !isChecked ? 4 : 5;
        if (da8.f164950c) {
            da8.mo74035c();
            da8.f164950c = false;
        }
        ((btpe) da8.f164949b).f149839a = i2 - 2;
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        btpe btpe = (btpe) da8.mo74062i();
        btpe.getClass();
        ((btpf) da6.f164949b).f149843b = btpe;
        atff.m75767a(new askf(notificationSettingsChimeraActivity.f108665e, askc.m74272b(), notificationSettingsChimeraActivity), "t/token/setpreferences", (btpf) da6.mo74062i(), btpg.f149845a, atkq.f90424a, new atkr(notificationSettingsChimeraActivity), "NotificationSettingsAct");
    }
}
