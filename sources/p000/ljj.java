package p000;

/* renamed from: ljj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ljj {

    /* renamed from: a */
    public static final srn f26194a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    public final void mo15203a(bmxv bmxv, kpk kpk, lhi lhi) {
        if (!bmxv.mo66813a()) {
            bqga.m112775a((Object) null);
            return;
        }
        bngx f = lhi.mo15086f();
        bngs j = bngx.m109377j();
        bnre i = kpk.mo14762a().listIterator();
        while (i.hasNext()) {
            kck kck = ((kcl) i.next()).f23818a;
            if (f.contains(kck.f23817a)) {
                j.mo67668c(((kfx) bmxv.mo66814b()).mo14455a(kck));
            }
        }
        bngx a = j.mo67664a();
        bqga.m112782b(a).mo69214a(new lji(a), bqfb.INSTANCE);
    }
}
