package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: azvz */
final /* synthetic */ class azvz implements bmxj {

    /* renamed from: a */
    private final azwa f100109a;

    public azvz(azwa azwa) {
        this.f100109a = azwa;
    }

    public final Object apply(Object obj) {
        azwa azwa = this.f100109a;
        bqgg bqgg = (bqgg) obj;
        try {
            azqf.m86130a(azwa.f99942a);
            return azqf.m86145b((String) bqgg.get());
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85931a("WAPhotosInterface", e, "Failed to get value from Future", new Object[0]);
            azph.m85998a(azwa.f99942a).mo55126a(1850, 59);
            azqf.m86130a(azwa.f99942a);
            return azqf.m86138a("Failed to get future value from Lighter", new Object[0]);
        }
    }
}
