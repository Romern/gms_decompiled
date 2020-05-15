package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.cast.JGCastService;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: atrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atrq {
    /* renamed from: a */
    public static PendingIntent m76258a(Context context, Intent intent) {
        return spn.m35844a(context, intent, (int) JGCastService.FLAG_PRIVATE_DISPLAY);
    }

    /* renamed from: b */
    public static Intent m76261b(String str, AccountInfo accountInfo, CardInfo cardInfo) {
        return m76259a(str, accountInfo, cardInfo).putExtra("client_type", 2);
    }

    /* renamed from: a */
    public static Intent m76259a(String str, AccountInfo accountInfo, CardInfo cardInfo) {
        Intent intent = new Intent("com.google.android.gms.tapandpay.ACTION_TOKENIZE_PAN");
        intent.setClassName("com.google.android.gms", "com.google.android.gms.tapandpay.tokenization.TokenizePanActivity");
        intent.putExtra("extra_calling_package", str);
        if (accountInfo != null) {
            intent.putExtra("extra_account_info", accountInfo);
        }
        if (cardInfo != null) {
            intent.putExtra("extra_card_info", cardInfo);
        }
        return intent;
    }

    /* renamed from: a */
    public static Intent m76260a(String str, AccountInfo accountInfo, CardInfo cardInfo, byte[] bArr, boolean z, String str2, byte[] bArr2, byte[] bArr3, boolean z2, boolean z3, boolean z4, boolean z5, String str3) {
        Intent a = m76259a(str, accountInfo, cardInfo);
        if (bArr != null) {
            a.putExtra("extra_untokenized_card", bArr);
        }
        a.putExtra("extra_hide_warm_welcome", z);
        if (bArr2 != null) {
            a.putExtra("extra_warm_welcome_info", bArr2);
        }
        if (str2 != null) {
            a.putExtra("extra_alt_brand_name", str2);
        }
        if (bArr3 != null) {
            a.putExtra("extra_instrument_manager_edit_token", bArr3);
        }
        a.putExtra("skip_card_chooser", z2);
        a.putExtra("EXTRA_MONET_ONBOARDING", z3);
        a.putExtra("EXTRA_USE_DEFERRED_YP", z4);
        a.putExtra("EXTRA_USE_SUW_UI", z5);
        a.putExtra("EXTRA_SUW_THEME", str3);
        return a;
    }
}
