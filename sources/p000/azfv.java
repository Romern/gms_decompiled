package p000;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: azfv */
public final /* synthetic */ class azfv implements Runnable {

    /* renamed from: a */
    private final SilentRegisterIntentOperation f99250a;

    public azfv(SilentRegisterIntentOperation silentRegisterIntentOperation) {
        this.f99250a = silentRegisterIntentOperation;
    }

    public final void run() {
        SilentRegisterIntentOperation silentRegisterIntentOperation = this.f99250a;
        azph.m85998a(silentRegisterIntentOperation.f111106c).mo55125a(1963);
        bngx.m109376e();
        try {
            bnre i = ((bngx) azbj.m85193a(silentRegisterIntentOperation.f111106c).mo54563c().mo56338a().get()).listIterator();
            while (i.hasNext()) {
                silentRegisterIntentOperation.mo60387a((bcoh) i.next());
            }
            azbj.m85194a();
            silentRegisterIntentOperation.f111105b.mo54773f(true);
            List b = azoe.m85910b(silentRegisterIntentOperation.f111106c);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                Account account = (Account) b.get(i2);
                if (account != null && !TextUtils.isEmpty(account.name)) {
                    silentRegisterIntentOperation.mo60385a(account.name);
                }
            }
            azph.m85998a(silentRegisterIntentOperation.f111106c).mo55125a(1965);
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85931a("RegisterService", e, "Could not retrieve account contexts", new Object[0]);
            azph.m85998a(silentRegisterIntentOperation.f111106c).mo55126a(1964, 68);
        }
    }
}
