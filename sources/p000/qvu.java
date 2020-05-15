package p000;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: qvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qvu extends smx {

    /* renamed from: a */
    private static final sek f42271a = qqu.m32672c("SyncAdapter");

    /* renamed from: b */
    private static final bnhe f42272b;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("auth-api-nigori", Integer.valueOf((int) ErrorInfo.TYPE_FSC_HTTP_ERROR));
        h.mo67695b("auth-api-credentials", 303);
        h.mo67695b("auth-api-settings", 302);
        h.mo67695b("chromesync-autofill-wallet", 304);
        h.mo67695b("chromesync-wallet-metadata", 305);
        f42272b = h.mo67618b();
    }

    public qvu(Context context) {
        super(context, false, "chromesync");
    }

    /* renamed from: a */
    public static Bundle m32974a(qwc qwc) {
        Bundle a = qwc.mo24306a();
        a.putBoolean("expedited", true);
        a.putBoolean("force", true);
        a.putBoolean("do_not_retry", true);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11595a() {
        return 7937;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        qwc qwc;
        byud byud;
        f42271a.mo25412b("performSync() triggered.", new Object[0]);
        if (bundle != null && bundle.getBoolean("initialize", false)) {
            f42271a.mo25412b("Initializing SyncAdapter...", new Object[0]);
            ContentResolver.setIsSyncable(account, str, 1);
            ContentResolver.setSyncAutomatically(account, str, true);
        }
        if (cdcx.f180510a.mo6606a().mo77274a()) {
            aymw.m84286a(getContext().getContentResolver(), account, "com.google.android.gms.auth.api.credentials", "chromiumsync", new String[0]);
            aymw.m84286a(getContext().getContentResolver(), account, str, "chromiumsync", new String[0]);
        } else {
            aymw.m84286a(getContext().getContentResolver(), account, "com.google.android.gms.auth.api.credentials", "chromiumsync", new String[0]);
            aymw.m84286a(getContext().getContentResolver(), account, str, "chromiumsync", "auth-api-nigori", "auth-api-credentials", "auth-api-settings", "chromesync-autofill-wallet", "chromesync-wallet-metadata");
        }
        try {
            if (bundle.containsKey("feed")) {
                String string = bundle.getString("feed");
                if (!f42272b.containsKey(string)) {
                    f42271a.mo25418e("Unrecognizable feed name: %s.", string);
                    return true;
                }
                qwb qwb = new qwb();
                qwb.f42296a = acyr.m50017a(getContext(), account);
                qwb.f42297b = ((Integer) f42272b.get(string)).intValue();
                String string2 = bundle.getString("hint");
                if (string2 != null) {
                    try {
                        byud = (byud) bxvk.m124014a(byud.f167762b, sqd.m35971c(string2));
                    } catch (bxwf e) {
                        f42271a.mo25417e("Unable to parse sync hint.", e, new Object[0]);
                        byud = null;
                    }
                    if (byud != null && !bmxx.m108577a(byud.f167764a)) {
                        qwb.f42299d = byud.f167764a;
                    }
                }
                qwc = qwb.mo24305a();
            } else {
                bmxv a = qwc.m32987a(getContext(), bundle);
                if (!a.mo66813a()) {
                    return true;
                }
                qwc = (qwc) a.mo66814b();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                ((qwa) qwa.f42284a.mo13145b()).mo24304b(qwc);
                f42271a.mo25414c("Successfully synced in %d milliseconds with request: %s.", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), qwc);
                return true;
            } catch (qrp e2) {
                f42271a.mo25417e("Failed to sync.", e2, new Object[0]);
                return false;
            }
        } catch (gid e3) {
            f42271a.mo25417e("Error when creating the request.", e3, new Object[0]);
            return false;
        }
    }
}
