package p000;

import android.content.Intent;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAvailableOtherPaymentMethodsResponse;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;

/* renamed from: atug */
final /* synthetic */ class atug implements aubq {

    /* renamed from: a */
    private final atuh f90901a;

    /* renamed from: b */
    private final atsy f90902b;

    public atug(atuh atuh, atsy atsy) {
        this.f90901a = atuh;
        this.f90902b = atsy;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        boolean z;
        byte[] bArr;
        byte[] bArr2;
        TokenStatus tokenStatus;
        TokenReference tokenReference;
        atuh atuh = this.f90901a;
        atsy atsy = this.f90902b;
        int i = 0;
        if (aucb.mo50384b()) {
            z = sqc.m35957a(((GetAvailableOtherPaymentMethodsResponse) aucb.mo50386d()).f108374a, 2);
        } else {
            z = false;
        }
        CardInfo cardInfo = atsy.f90811C;
        if (!(cardInfo == null || (tokenStatus = cardInfo.f108345f) == null || (tokenReference = tokenStatus.f108458a) == null)) {
            i = tokenReference.f108457b;
        }
        if (!atsy.f90823O || !atsy.f90824P || !cgwn.m147270t()) {
            Intent putExtra = new Intent().setClassName(atuh.f90898f, "com.google.android.gms.tapandpay.tokenization.SummaryActivity").putExtra("tokenization_status", atsy.f90831W).putExtra("save_status", atsy.f90828T).putExtra("tsp", atsy.f90843f).putExtra("tsp_info_from_platform", i).putExtra("nfc_device", asjw.m74255a()).putExtra("nfcf_device", atgf.m75807a(atuh.f90898f).mo49940a()).putExtra("pay_pal_available", z);
            btnf btnf = atsy.f90832X;
            if (btnf != null) {
                bArr = btnf.serializeToBytes();
            } else {
                bArr = null;
            }
            atuh.mo50181a(putExtra.putExtra("api_error", bArr).putExtra("felica_card_limit_reached", atsy.f90827S), 1);
            return;
        }
        Intent className = new Intent("com.google.android.gms.tapandpay.settings.RED_PATH_RESULT").setClassName(atuh.f90898f, "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity");
        Intent putExtra2 = className.putExtra("tokenization_status", atsy.f90831W).putExtra("save_status", atsy.f90828T).putExtra("tsp", atsy.f90843f).putExtra("tsp_info_from_platform", i).putExtra("nfc_device", asjw.m74255a()).putExtra("nfcf_device", atgf.m75807a(atuh.f90898f).mo49940a()).putExtra("pay_pal_available", z);
        btnf btnf2 = atsy.f90832X;
        if (btnf2 != null) {
            bArr2 = btnf2.serializeToBytes();
        } else {
            bArr2 = null;
        }
        putExtra2.putExtra("api_error", bArr2).putExtra("felica_card_limit_reached", atsy.f90827S);
        atuh.mo50181a(className, 5);
    }
}
