package p000;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* renamed from: mmf */
final /* synthetic */ class mmf implements mmr {

    /* renamed from: a */
    private final mmg f34006a;

    public mmf(mmg mmg) {
        this.f34006a = mmg;
    }

    /* renamed from: a */
    public final InputStream mo20161a() {
        ByteArrayInputStream b;
        mmg mmg = this.f34006a;
        try {
            synchronized (mmg) {
                b = mmg.f34008b.mo19771b();
            }
            mmg.f34008b.mo19772c();
            return b;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            mmg.f34007a.mo25415d("Interrupted while waiting for contacts.", e, new Object[0]);
            throw new C1577mms("Unable to fetch contacts", e);
        } catch (ExecutionException e2) {
            try {
                mmg.f34007a.mo25417e("Unable to fetch Contacts.", e2.getCause(), new Object[0]);
                throw new C1577mms("Unable to fetch contacts", e2.getCause());
            } catch (Throwable th) {
                mmg.f34008b.mo19772c();
                throw th;
            }
        }
    }
}
