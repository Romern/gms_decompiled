package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bbin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbin {

    /* renamed from: a */
    private final qws f102746a;

    /* renamed from: b */
    private final bbir f102747b;

    public bbin(qws qws, bbir bbir) {
        this.f102746a = qws;
        this.f102747b = bbir;
    }

    /* renamed from: a */
    public final void mo56151a(int i, bbic bbic) {
        qwo a = this.f102746a.mo24335a(bbic.serializeToBytes());
        a.mo24328b(i - 1);
        a.mo24327b();
        if (this.f102747b.mo34094a()) {
            this.f102746a.mo24336a(10, TimeUnit.SECONDS);
        }
    }
}
