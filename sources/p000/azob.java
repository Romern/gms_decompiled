package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: azob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azob {

    /* renamed from: b */
    private static WeakReference f99784b = new WeakReference(null);

    /* renamed from: a */
    public final Context f99785a;

    private azob(Context context) {
        this.f99785a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized azob m85899a(Context context) {
        azob azob;
        synchronized (azob.class) {
            azob = (azob) f99784b.get();
            if (azob == null) {
                azob = new azob(context);
                f99784b = new WeakReference(azob);
            }
        }
        return azob;
    }

    /* renamed from: a */
    public final Pair mo55111a() {
        bngs j = bngx.m109377j();
        bngs j2 = bngx.m109377j();
        if (azos.m85959b(this.f99785a)) {
            int i = Build.VERSION.SDK_INT;
            List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(this.f99785a).getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList != null && !activeSubscriptionInfoList.isEmpty()) {
                for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                    String iccId = subscriptionInfo.getIccId();
                    if (!TextUtils.isEmpty(iccId)) {
                        j.mo67668c(iccId.toLowerCase(Locale.US));
                    }
                    String number = subscriptionInfo.getNumber();
                    if (!TextUtils.isEmpty(number)) {
                        j2.mo67668c(number);
                    }
                }
            }
        }
        return new Pair(j.mo67664a(), j2.mo67664a());
    }

    /* renamed from: a */
    public final String mo55112a(Account account, boolean z) {
        return azfn.m85577a(this.f99785a, account, z);
    }

    /* renamed from: a */
    public final String mo55113a(String str, Map map) {
        return vvp.m41461a(this.f99785a, str, map);
    }
}
