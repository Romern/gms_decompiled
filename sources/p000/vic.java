package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: vic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vic {

    /* renamed from: a */
    public final vec f49316a;

    /* renamed from: b */
    private final ExecutorService f49317b = snp.m35704b(9);

    /* renamed from: c */
    private final vpu f49318c;

    public vic(vpu vpu) {
        this.f49318c = vpu;
        this.f49316a = new via(this);
    }

    /* renamed from: a */
    public final void mo28480a() {
        vpu vpu = this.f49318c;
        this.f49317b.submit(new vib(vkq.m40631a(vpu.f49755b, vpu).f49396d));
    }
}
