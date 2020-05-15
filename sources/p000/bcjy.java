package p000;

import java.util.concurrent.Callable;

/* renamed from: bcjy */
final /* synthetic */ class bcjy implements Callable {

    /* renamed from: a */
    private final azbk f104362a;

    public bcjy(azbk azbk) {
        this.f104362a = azbk;
    }

    public final Object call() {
        try {
            return addi.m50206a(this.f104362a.f98903a.f98906a).mo33343a("466216207879", "GCM");
        } catch (Exception e) {
            throw new bcjr(e);
        }
    }
}
