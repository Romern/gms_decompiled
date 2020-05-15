package p000;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import java.io.IOException;

/* renamed from: bgxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgxl extends smx {
    public bgxl(Context context) {
        super(context, "location");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11595a() {
        return 8705;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        String a = aeqm.m52397a(account);
        String valueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 28 + String.valueOf(str).length() + String.valueOf(valueOf).length());
        sb.append("onPerformSync() called: ");
        sb.append(a);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        sb.toString();
        Context context = getContext();
        if (bundle == null || !bundle.getBoolean("initialize", false)) {
            try {
                bgxm.m100244a(context).mo63326a(account, null, null, false, null);
                return true;
            } catch (gid e) {
                bgur.m100021b("GCoreUlr", "", e);
                syncResult.stats.numAuthExceptions++;
                bguv.m100042a("UlrSyncException");
                return false;
            } catch (IOException e2) {
                bgur.m100021b("GCoreUlr", "", e2);
                syncResult.stats.numIoExceptions++;
                bguv.m100042a("UlrSyncException");
                return false;
            } catch (chuw e3) {
                bgur.m100021b("GCoreUlr", "", e3);
                if (e3.f189236a.f189233s == chus.UNAUTHENTICATED) {
                    syncResult.stats.numAuthExceptions++;
                } else {
                    syncResult.stats.numIoExceptions++;
                }
                bguv.m100042a("UlrSyncException");
                return false;
            }
        } else {
            ReportingSyncChimeraService.m117309a(account, context);
            return false;
        }
    }
}
