package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity;

/* renamed from: atkt */
public final /* synthetic */ class atkt implements View.OnClickListener {

    /* renamed from: a */
    private final NotificationSettingsChimeraActivity f90427a;

    public atkt(NotificationSettingsChimeraActivity notificationSettingsChimeraActivity) {
        this.f90427a = notificationSettingsChimeraActivity;
    }

    public void onClick(View view) {
        int i;
        NotificationSettingsChimeraActivity notificationSettingsChimeraActivity = this.f90427a;
        if (!ssk.m36235a(notificationSettingsChimeraActivity)) {
            auar auar = new auar();
            auar.f91333a = 1000;
            auar.f91341i = notificationSettingsChimeraActivity.f108665e;
            auar.f91335c = notificationSettingsChimeraActivity.getString(C0126R.string.tp_no_network_error_body);
            auar.f91336d = notificationSettingsChimeraActivity.getString(C0126R.string.common_got_it);
            auar.f91340h = bpan.NOTIFICATION_SETTINGS_NO_NETWORK;
            auar.mo50344a().show(notificationSettingsChimeraActivity.getSupportFragmentManager(), (String) null);
            return;
        }
        notificationSettingsChimeraActivity.f108669i.toggle();
        boolean isChecked = notificationSettingsChimeraActivity.f108669i.isChecked();
        asjn asjn = notificationSettingsChimeraActivity.f108663c;
        AccountInfo accountInfo = notificationSettingsChimeraActivity.f108665e;
        byte[] a = asjn.mo49199a(isChecked, accountInfo.f108325a, accountInfo.f108326b, (bssm) notificationSettingsChimeraActivity.f108669i.getTag());
        bxvd da = bzun.f171439c.mo74144da();
        bxvd da2 = bzuk.f171430b.mo74144da();
        if (!isChecked) {
            i = 3;
        } else {
            i = 4;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bzuk) da2.f164949b).f171432a = i - 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzuk bzuk = (bzuk) da2.mo74062i();
        bzuk.getClass();
        ((bzun) da.f164949b).f171441a = bzuk;
        bxtx a2 = bxtx.m123261a(a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((bzun) da.f164949b).f171442b = a2;
        bzun bzun = (bzun) da.mo74062i();
        notificationSettingsChimeraActivity.f108670j++;
        atff.m75770b(new askf(notificationSettingsChimeraActivity.f108665e, askc.m74272b(), notificationSettingsChimeraActivity), "g/settings/updatemarketingsettings", bzun, bzuo.f171443b, new atla(notificationSettingsChimeraActivity), new atko(notificationSettingsChimeraActivity), "NotificationSettingsAct");
    }
}
