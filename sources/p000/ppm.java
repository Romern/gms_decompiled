package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: ppm */
final /* synthetic */ class ppm implements Callable {

    /* renamed from: a */
    private final pza f40023a;

    /* renamed from: b */
    private final ClientContext f40024b;

    public ppm(pza pza, ClientContext clientContext) {
        this.f40023a = pza;
        this.f40024b = clientContext;
    }

    public final Object call() {
        pza pza = this.f40023a;
        ClientContext clientContext = this.f40024b;
        bxvd da = bsij.f144723b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bsij) da.f164949b).f144725a = true;
        bsij bsij = (bsij) da.mo74062i();
        if (pza.f40702c == null) {
            pza.f40702c = chtv.m149566a(chtu.UNARY, "google.internal.home.foyer.v1.StructuresService/GetHomeGraph", ciie.m150370a(bsij.f144723b), ciie.m150370a(bsil.f144727c));
        }
        return (bsil) pza.f40703a.mo25553a(pza.f40702c, clientContext, bsij, (long) pza.f40701b, TimeUnit.MILLISECONDS);
    }
}
