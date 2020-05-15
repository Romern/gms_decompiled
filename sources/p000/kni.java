package p000;

import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: kni */
final /* synthetic */ class kni implements bqeg {

    /* renamed from: a */
    private final knk f24523a;

    /* renamed from: b */
    private final List f24524b;

    /* renamed from: c */
    private final klu f24525c;

    public kni(knk knk, List list, klu klu) {
        this.f24523a = knk;
        this.f24524b = list;
        this.f24525c = klu;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        knk knk = this.f24523a;
        List list = this.f24524b;
        klu klu = this.f24525c;
        bngs b = bngx.m109371b(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                b.mo67668c((klw) ((bqgg) list.get(i)).get());
            } catch (InterruptedException | ExecutionException e) {
                knk.f24527a.mo14629a(e, "Failed to generate result from delegate processor.", new Object[0]);
            }
        }
        return bqga.m112775a(knk.m18198a(klu, b.mo67664a()));
    }
}
