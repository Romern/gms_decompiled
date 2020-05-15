package p000;

import android.accounts.Account;
import com.google.android.gms.auth.folsom.operation.KeySyncIntentOperation;
import com.google.android.gms.auth.folsom.service.FolsomGcmTaskChimeraService;

/* renamed from: jav */
public final /* synthetic */ class jav implements Runnable {

    /* renamed from: a */
    private final KeySyncIntentOperation f22045a;

    public jav(KeySyncIntentOperation keySyncIntentOperation) {
        this.f22045a = keySyncIntentOperation;
    }

    public final void run() {
        KeySyncIntentOperation keySyncIntentOperation = this.f22045a;
        KeySyncIntentOperation.f10912a.mo25412b("syncKeyOrScheduleRetryOnFailure", new Object[0]);
        if (ccgb.m129584c()) {
            Account[] b = adyd.m51363a(keySyncIntentOperation).mo33922b();
            for (Account account : b) {
                jcn jcn = new jcn();
                jcn.f22164a = account;
                jcn.f22165b = jco.SYNC_PERIODIC;
                if (((jcm) jcm.f22159a.mo13145b()).mo13584c(jcn.mo13585a()) && KeySyncIntentOperation.m6603a(account, 18) == 1) {
                    FolsomGcmTaskChimeraService.m6619b(keySyncIntentOperation, account.name);
                }
            }
        } else if (KeySyncIntentOperation.m6604a(keySyncIntentOperation, KeySyncIntentOperation.m6606a(keySyncIntentOperation), 5) == 1) {
            FolsomGcmTaskChimeraService.m6622e(keySyncIntentOperation);
        }
    }
}
