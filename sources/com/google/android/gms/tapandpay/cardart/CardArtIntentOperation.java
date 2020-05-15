package com.google.android.gms.tapandpay.cardart;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardArtIntentOperation extends asjx {

    /* renamed from: a */
    private static final srn f108318a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    private final boolean m93015a(asjs asjs, long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(asjs.mo49202a(str));
            if (!file.exists()) {
                String num = Integer.toString(asjs.f89095b);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(num).length());
                sb.append(str);
                sb.append("=w");
                sb.append(num);
                try {
                    asmd.m74375a(sb.toString(), file, getApplicationContext());
                    sendBroadcast(new Intent("com.google.android.gms.tapandpay.ACTION_CARD_ART_DOWNLOADED"));
                    return true;
                } catch (IOException e) {
                    return false;
                }
            } else {
                file.setLastModified(j);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        AccountInfo accountInfo = (AccountInfo) intent.getParcelableExtra("extra_account_info");
        if (accountInfo == null) {
            bnsl bnsl = (bnsl) f108318a.mo68388c();
            bnsl.mo68432a("com.google.android.gms.tapandpay.cardart.CardArtIntentOperation", "a", 49, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Invalid intent: missing account");
            return;
        }
        try {
            asjs asjs = new asjs(this, accountInfo.f108326b);
            long currentTimeMillis = System.currentTimeMillis();
            String stringExtra = intent.getStringExtra("EXTRA_CARD_ART");
            if (TextUtils.isEmpty(stringExtra)) {
                askf askf = new askf(accountInfo, askc.m74272b(), this);
                atam atam = new atam(askf);
                CardInfo[] cardInfoArr = atds.m75666a(askf).mo49845a().f108369a;
                for (CardInfo cardInfo : cardInfoArr) {
                    Uri uri = cardInfo.f108347h;
                    if (uri != null && m93015a(asjs, currentTimeMillis, uri.toString())) {
                        atam.mo49741a(atam.mo49735a(17, cardInfo));
                    }
                }
                File[] listFiles = asjs.f89094a.listFiles();
                if (listFiles == null) {
                    bnsl bnsl2 = (bnsl) f108318a.mo68387b();
                    bnsl2.mo68432a("com.google.android.gms.tapandpay.cardart.CardArtIntentOperation", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Error retrieving files");
                    return;
                }
                long millis = currentTimeMillis - TimeUnit.HOURS.toMillis(1);
                for (File file : listFiles) {
                    if (file.lastModified() < millis) {
                        file.delete();
                    }
                }
                return;
            }
            m93015a(asjs, currentTimeMillis, stringExtra);
        } catch (asks e) {
            bnsl bnsl3 = (bnsl) f108318a.mo68387b();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("com.google.android.gms.tapandpay.cardart.CardArtIntentOperation", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Error managing card art");
        }
    }
}
