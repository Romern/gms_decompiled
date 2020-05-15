package p000;

import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.ExecutionException;

/* renamed from: bbsa */
final /* synthetic */ class bbsa implements Runnable {

    /* renamed from: a */
    private final bbsc f103266a;

    /* renamed from: b */
    private final bqgg f103267b;

    /* renamed from: c */
    private final bcoh f103268c;

    /* renamed from: d */
    private final ContactId f103269d;

    public bbsa(bbsc bbsc, bqgg bqgg, bcoh bcoh, ContactId contactId) {
        this.f103266a = bbsc;
        this.f103267b = bqgg;
        this.f103268c = bcoh;
        this.f103269d = contactId;
    }

    public final void run() {
        bbsc bbsc = this.f103266a;
        bqgg bqgg = this.f103267b;
        bcoh bcoh = this.f103268c;
        ContactId contactId = this.f103269d;
        try {
            bcsj bcsj = (bcsj) bqgg.get();
            synchronized (bbsc.f103276d) {
                bbsc.f103279g.remove(Pair.create(bcoh, contactId));
            }
        } catch (InterruptedException | ExecutionException e) {
            bbos.m88292b("LitContactCtrlr", "Failed to sync contact profile", e);
        }
    }
}
