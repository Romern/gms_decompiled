package p000;

import android.content.Context;
import com.google.android.gms.auth.account.service.WorkAccountChimeraService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: gsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gsc implements gim {

    /* renamed from: a */
    public static final gsc f18934a = new gsc();

    /* renamed from: a */
    public final void mo11907a(Context context) {
    }

    /* renamed from: b */
    public final void mo11908b(Context context) {
    }

    /* renamed from: c */
    public final void mo11909c(Context context) {
        WorkAccountChimeraService.f10032a.mo25414c("update authenticator enabled for boot or update", new Object[0]);
        try {
            aucu.m76783a(gje.m13260a(context).mo24732b(new gjg()), 10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            WorkAccountChimeraService.f10032a.mo25417e("Failed to init work authenticator in onBootOrUpdate", e, new Object[0]);
        }
    }

    private gsc() {
    }
}
