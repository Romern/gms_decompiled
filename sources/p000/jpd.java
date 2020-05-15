package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.proximity.firstparty.SetupRequestedSubscription;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;

/* renamed from: jpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jpd {

    /* renamed from: a */
    private static final Logger f22966a = jsy.m17256a("FeatureSetupRouter");

    /* renamed from: a */
    public final void mo13970a(Context context, Account account, String str) {
        String str2 = account.name;
        if (ccig.f179039a.mo6606a().mo76014k() && bsni.SMS_CONNECT_HOST.name().equals(str)) {
            Intent intent = new Intent("com.google.android.apps.messaging.BETTER_TOGETHER_SETUP_REQUESTED");
            intent.setPackage("com.google.android.apps.messaging");
            intent.putExtra("android.intent.extra.USER", str2);
            context.sendBroadcast(intent);
        }
        if (ccig.f179039a.mo6606a().mo76019p() && bsni.BETTER_TOGETHER_HOST.name().equals(str)) {
            jpp.m17075a();
            if (!jpq.m17076a(context, account)) {
                f22966a.mo25418e("Failed to trigger force sync for account: %s", account.name);
            }
        }
        try {
            int a = bsni.m116007a(str).mo3214a();
            jta a2 = jsz.m17257a();
            a2.mo14043a("feature_setup_event", a);
            jqw a3 = jqw.m17133a();
            try {
                bqgh a4 = bqgh.m112796a(new jqu(a3));
                a3.mo14003a(a4);
                List<SetupRequestedSubscription> list = (List) a4.get();
                if (!list.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("EXTRA_ACCOUNT_NAME_FOR_SETUP", str2);
                    ArrayList arrayList = new ArrayList();
                    for (SetupRequestedSubscription setupRequestedSubscription : list) {
                        if (str.equals(setupRequestedSubscription.f11184b)) {
                            try {
                                setupRequestedSubscription.mo7812a(context, bundle);
                                a2.mo14043a("feature_setup_event_reported", a);
                            } catch (PendingIntent.CanceledException e) {
                                arrayList.add(a3.mo14005b(setupRequestedSubscription));
                            }
                        }
                    }
                    try {
                        for (Status status : (List) bqga.m112774a((Iterable) arrayList).get()) {
                            if (!status.equals(Status.f30107a)) {
                                f22966a.mo25418e("Failed to update cache subscription. %s", status);
                            }
                        }
                    } catch (InterruptedException | ExecutionException e2) {
                        f22966a.mo25417e("Failed to update cache subscriptions.", e2, new Object[0]);
                    }
                }
            } catch (InterruptedException | ExecutionException e3) {
                f22966a.mo25418e("Failed to fetch subscriptions.", new Object[0]);
                jsw.m17254a().mo14033a(e3);
            }
        } catch (IllegalArgumentException e4) {
            if (!Pattern.matches("^([0-9A-Fa-f]{2}:){5}([0-9A-Fa-f]{2})$", str)) {
                f22966a.mo25418e("Invalid feature name: %s", str);
                jsw.m17254a().mo14033a(e4);
            }
        }
    }
}
