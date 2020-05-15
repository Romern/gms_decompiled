package p000;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.gcm.clientqueue.MessageRetryIntentOperation;
import java.util.concurrent.Executor;

/* renamed from: aamn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamn extends aakq {

    /* renamed from: a */
    public final boolean f28469a;

    /* renamed from: b */
    public final aaml f28470b;

    /* renamed from: c */
    public final aamk f28471c;

    /* renamed from: d */
    public final aamr f28472d;

    /* renamed from: e */
    private final Executor f28473e = snp.m35704b(10);

    public aamn(aakr aakr, aaml aaml, aamk aamk, aamr aamr) {
        boolean b = cedo.m136289b();
        this.f28469a = b;
        if (b) {
            this.f28470b = aaml;
            this.f28471c = aamk;
            this.f28472d = aamr;
            aakr.mo16945a(this, this.f28473e);
            return;
        }
        this.f28470b = null;
        this.f28471c = null;
        this.f28472d = null;
    }

    /* renamed from: c */
    private static final PendingIntent m21538c(int i) {
        return IntentOperation.getPendingIntent(rpr.m34216b(), MessageRetryIntentOperation.class, new Intent("com.google.android.gms.gcm.MESSAGE_RETRY"), 0, i);
    }

    /* renamed from: a */
    public final void mo17037a() {
        skc skc = new skc(rpr.m34216b());
        bmxv a = this.f28472d.mo17043a();
        if (!a.mo66813a()) {
            PendingIntent c = m21538c(536870912);
            if (c != null) {
                skc.mo25668a(c);
                return;
            }
            return;
        }
        aajg.m21338a(skc, "FcmRetry", ((Long) a.mo66814b()).longValue(), m21538c(134217728));
    }

    /* renamed from: b */
    public final void mo16942b(aamh aamh) {
        this.f28472d.mo17047a(aamh, aaqi.CLIENT_QUEUE_APP_UNINSTALLED);
    }
}
