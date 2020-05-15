package com.google.android.gms.tapandpay.tokenization.gcmtasks;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeferredYellowPathNotificationTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108937a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bepr.a(android.graphics.Bitmap, boolean):void
     arg types: [android.graphics.Bitmap, int]
     candidates:
      bepr.a(double, double):int
      bepr.a(android.graphics.Rect, android.graphics.Paint):void
      bepr.a(android.graphics.Bitmap, boolean):void */
    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        Bitmap decodeFile;
        if (Settings.Secure.getInt(context.getContentResolver(), "com.google.android.gms.tapandpay.oobe.OOBE_RESULT_STATUS", 0) == 1) {
            return 0;
        }
        String str = aecc.f63128a;
        if ("tokenization.dypNotification".equals(str)) {
            Bundle bundle = aecc.f63129b;
            if (bundle != null) {
                Object obj = bundle.get("extra_card_info");
                Object obj2 = aecc.f63129b.get("extra_account_info");
                if (!(obj instanceof CardInfo) || !(obj2 instanceof AccountInfo)) {
                    bnsl bnsl = (bnsl) f108937a.mo68388c();
                    bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.gcmtasks.DeferredYellowPathNotificationTaskOperation", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Could not find card info or account info.");
                    return 2;
                }
                CardInfo cardInfo = (CardInfo) obj;
                AccountInfo accountInfo = (AccountInfo) obj2;
                asjs asjs = new asjs(context, accountInfo.f108326b);
                bepr bepr = new bepr(context);
                asju.m74253a(cardInfo, bepr);
                Uri uri = cardInfo.f108347h;
                if (!(uri == null || (decodeFile = BitmapFactory.decodeFile(asjs.mo49202a(uri.toString()))) == null)) {
                    bepr.mo60914a(decodeFile, true);
                }
                Intent a = atrq.m76259a(context.getPackageName(), accountInfo, cardInfo);
                C1102je a2 = atbg.m75368a(context, atbf.ALERTS);
                a2.mo13616a(3);
                a2.mo13637c(true);
                a2.mo13627a(true);
                int minimumWidth = bepr.getMinimumWidth();
                int minimumHeight = bepr.getMinimumHeight();
                Bitmap createBitmap = Bitmap.createBitmap(minimumWidth, minimumWidth, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                bepr.setBounds(0, 0, minimumWidth, minimumHeight);
                canvas.translate(0.0f, (float) ((minimumWidth - minimumHeight) / 2));
                bepr.draw(canvas);
                a2.mo13621a(createBitmap);
                a2.mo13640e(context.getString(C0126R.string.tp_dyp_notification_title, cardInfo.f108343d));
                C1101jd jdVar = new C1101jd();
                jdVar.mo13593a(context.getString(C0126R.string.tp_dyp_notification_body));
                a2.mo13626a(jdVar);
                a2.mo13639d(context.getString(C0126R.string.tp_google_pay));
                int i = Build.VERSION.SDK_INT;
                a2.f22254f = becl.m91780a(context, 7, a, 1275068416);
                atbg.m75371a(context, "tokenization.dypNotification", a2);
                return 0;
            }
            bnsl bnsl2 = (bnsl) f108937a.mo68388c();
            bnsl2.mo68432a("com.google.android.gms.tapandpay.tokenization.gcmtasks.DeferredYellowPathNotificationTaskOperation", "a", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Could not find extras for the params: %s", aecc);
            return 2;
        }
        bnsl bnsl3 = (bnsl) f108937a.mo68388c();
        bnsl3.mo68432a("com.google.android.gms.tapandpay.tokenization.gcmtasks.DeferredYellowPathNotificationTaskOperation", "a", 66, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68420a("Got an unexpected task service tag: %s", str);
        return 2;
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
    }
}
