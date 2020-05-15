package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.TapFailureUiInfo;
import com.google.android.gms.tapandpay.firstparty.ValuableInfo;

/* renamed from: atmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atmz {
    /* renamed from: a */
    public static Intent m76200a(Context context) {
        return m76201a(context, 4);
    }

    /* renamed from: a */
    public static Intent m76201a(Context context, int i) {
        return IntentOperation.getStartIntent(context, "com.google.android.gms.tapandpay.tap.TapEventIntentOperation", "com.google.android.gms.tapandpay.tap.TAP_EVENT").putExtra("eventType", i);
    }

    /* renamed from: a */
    public static Intent m76202a(Context context, int i, TapFailureUiInfo tapFailureUiInfo) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        Intent putExtra = m76201a(context, 5).putExtra("failedReason", i);
        if (tapFailureUiInfo != null) {
            sef.m35071a(tapFailureUiInfo, putExtra, "failedUiInfo");
        }
        return putExtra;
    }

    /* renamed from: a */
    public static Intent m76203a(Context context, CardInfo cardInfo) {
        Intent a = m76201a(context, 2);
        if (cardInfo != null) {
            a.putExtra("paymentCardInfo", cardInfo);
        }
        return a;
    }

    /* renamed from: a */
    public static Intent m76204a(Context context, ValuableInfo[] valuableInfoArr) {
        return m76201a(context, 3).putExtra("valuables", valuableInfoArr);
    }

    /* renamed from: a */
    public static Intent m76205a(Context context, ValuableInfo[] valuableInfoArr, boolean z) {
        return m76201a(context, 8).putExtra("valuables", valuableInfoArr).putExtra("expedited", z);
    }
}
