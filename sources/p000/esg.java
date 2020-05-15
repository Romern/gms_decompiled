package p000;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: esg */
final /* synthetic */ class esg implements Callable {

    /* renamed from: a */
    private final esp f15605a;

    public esg(esp esp) {
        this.f15605a = esp;
    }

    public final Object call() {
        esp esp = this.f15605a;
        HashMap hashMap = new HashMap();
        esp.mo10482a(esp.f15624c, System.currentTimeMillis(), hashMap, esp.f15627f);
        return bngx.m109368a(hashMap.values());
    }
}
