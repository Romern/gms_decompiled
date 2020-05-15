package p000;

import java.util.function.Consumer;

/* renamed from: kwc */
final /* synthetic */ class kwc implements Consumer {

    /* renamed from: a */
    private final kwe f25244a;

    /* renamed from: b */
    private final bxvd f25245b;

    public kwc(kwe kwe, bxvd bxvd) {
        this.f25244a = kwe;
        this.f25245b = bxvd;
    }

    public final void accept(Object obj) {
        kwe kwe = this.f25244a;
        bxvd bxvd = this.f25245b;
        kjl kjl = (kjl) obj;
        kka kka = (kka) kjl.mo14520e().values().stream().max(kwd.f25246a).get();
        int b = kka.mo14555b();
        int c = kka.mo14554a().mo68741c();
        bxvd da = kwj.f25268f.mo74144da();
        int a = kjl.mo14518c().mo3214a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kwj) da.f164949b).f25274e = a;
        int intValue = ((Integer) kwe.f25249b.getOrDefault(kjl.mo14516a().f24609h, -1)).intValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kwj kwj = (kwj) da.f164949b;
        kwj.f25273d = intValue;
        kwj.f25272c = b;
        kwj.f25271b = c;
        int a2 = ((kpb) kjl.mo14517b().iterator().next()).mo3214a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kwj kwj2 = (kwj) da.f164949b;
        if (!kwj2.f25270a.mo73666a()) {
            kwj2.f25270a = GeneratedMessageLite.m124019a(kwj2.f25270a);
        }
        kwj2.f25270a.mo74153d(a2);
        kwj kwj3 = (kwj) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        kwr kwr = (kwr) bxvd.f164949b;
        kwr kwr2 = kwr.f25318d;
        kwj3.getClass();
        if (!kwr.f25320a.mo73666a()) {
            kwr.f25320a = GeneratedMessageLite.m124021a(kwr.f25320a);
        }
        kwr.f25320a.add(kwj3);
    }
}
