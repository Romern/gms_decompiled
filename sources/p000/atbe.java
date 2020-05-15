package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: atbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atbe {
    /* renamed from: a */
    public static Intent m75362a(Context context, AccountInfo accountInfo, String str) {
        return IntentOperation.getStartIntent(context, "com.google.android.gms.tapandpay.notifications.GmsCoreRenderedNotificationInteractionIntentOperation", "com.google.android.gms.tapandpay.notifications.GMS_CORE_ON_DELETE_ACTION").putExtra("extra_account_info", accountInfo).putExtra("campaign_id", str);
    }

    /* renamed from: a */
    public static Intent m75363a(Context context, AccountInfo accountInfo, String str, int i, Intent intent) {
        return IntentOperation.getStartIntent(context, "com.google.android.gms.tapandpay.notifications.GmsCoreRenderedNotificationInteractionIntentOperation", "com.google.android.gms.tapandpay.notifications.GMS_CORE_CLICK_ACTION").putExtra("extra_account_info", accountInfo).putExtra("campaign_id", str).putExtra("target_type_for_logging", i - 1).putExtra("extra_next_intent", intent);
    }

    /* renamed from: a */
    public static Intent m75364a(askf askf, byte[] bArr, int i, CardInfo cardInfo) {
        return IntentOperation.getStartIntent(askf.f89126d, "com.google.android.gms.tapandpay.notifications.UpdateGunsReadStateForNotificationIntentOperation", "com.google.android.gms.tapandpay.notifications.UPDATE_GUNS").putExtra("account_id", askf.f89123a).putExtra("account_name", askf.f89124b).putExtra("read_state", i - 1).putExtra("card_info", cardInfo).putExtra("coalesced_notification", bArr);
    }
}
