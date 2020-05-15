package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axjk */
public final /* synthetic */ class axjk implements aaz {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96045a;

    public axjk(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96045a = transferMoneyChimeraActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ec  */
    /* renamed from: a */
    public final boolean mo135a(MenuItem menuItem) {
        char c;
        String str;
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96045a;
        int i = ((C1446vw) menuItem).f27454a;
        if (i == C0126R.C0129id.switch_account) {
            transferMoneyChimeraActivity.mo60189a(null, true, true);
        }
        if (i == C0126R.C0129id.return_money_item) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(TransferMoneyChimeraActivity.m94346r().appendPath("return").appendQueryParameter("tt", transferMoneyChimeraActivity.f110725m.f110649h).build());
            transferMoneyChimeraActivity.startActivity(intent);
            transferMoneyChimeraActivity.mo53238P(50);
        }
        if (i == C0126R.C0129id.decline_request_item) {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
            intent2.addCategory("android.intent.category.BROWSABLE");
            intent2.setData(TransferMoneyChimeraActivity.m94346r().appendPath("declineRequest").appendQueryParameter("tt", transferMoneyChimeraActivity.f110725m.f110649h).build());
            transferMoneyChimeraActivity.startActivity(intent2);
            transferMoneyChimeraActivity.mo53238P(51);
        }
        if (i == C0126R.C0129id.view_in_wallet_item) {
            Intent intent3 = new Intent();
            intent3.setAction("android.intent.action.VIEW");
            intent3.addCategory("android.intent.category.BROWSABLE");
            intent3.setData(TransferMoneyChimeraActivity.m94346r().appendPath("view").appendQueryParameter("tt", transferMoneyChimeraActivity.f110725m.f110649h).build());
            transferMoneyChimeraActivity.startActivity(intent3);
            transferMoneyChimeraActivity.mo53238P(52);
        }
        if (i == C0126R.C0129id.wallet_settings_item) {
            Intent intent4 = new Intent();
            intent4.setAction("android.intent.action.VIEW");
            intent4.addCategory("android.intent.category.BROWSABLE");
            String a = axmb.m82712a();
            int hashCode = a.hashCode();
            if (hashCode != -1711584601) {
                if (hashCode == 1928147227 && a.equals("DEVELOPMENT")) {
                    c = 0;
                    if (c != 0) {
                        str = c != 1 ? "https://wallet.google.com" : "https://wallet-web.sandbox.google.com";
                    } else {
                        str = "https://wallet-dev.sandbox.google.com";
                    }
                    intent4.setData(Uri.parse(str.concat("/n/settings")));
                    transferMoneyChimeraActivity.startActivity(intent4);
                    transferMoneyChimeraActivity.mo53238P(170);
                }
            } else if (a.equals("SANDBOX")) {
                c = 1;
                if (c != 0) {
                }
                intent4.setData(Uri.parse(str.concat("/n/settings")));
                transferMoneyChimeraActivity.startActivity(intent4);
                transferMoneyChimeraActivity.mo53238P(170);
            }
            c = 65535;
            if (c != 0) {
            }
            intent4.setData(Uri.parse(str.concat("/n/settings")));
            transferMoneyChimeraActivity.startActivity(intent4);
            transferMoneyChimeraActivity.mo53238P(170);
        }
        if (i == C0126R.C0129id.help_item) {
            Intent intent5 = new Intent();
            intent5.setAction("android.intent.action.VIEW");
            intent5.addCategory("android.intent.category.BROWSABLE");
            intent5.setData(Uri.parse("https://support.google.com/wallet"));
            transferMoneyChimeraActivity.startActivity(intent5);
            transferMoneyChimeraActivity.mo53238P(53);
        }
        return false;
    }
}
