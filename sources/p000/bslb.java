package p000;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: bslb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bslb {

    /* renamed from: a */
    final bobp f144905a = new bobp();

    /* renamed from: b */
    final bsla f144906b;

    /* renamed from: c */
    private final bnge f144907c;

    public bslb(bsla bsla) {
        this.f144906b = bsla;
        this.f144907c = bnge.m109299s();
    }

    /* renamed from: a */
    public bnic mo70680a() {
        bobp bobp = this.f144905a;
        LinkedHashMap b = bnmt.m109804b();
        for (bobo bobo : bobp.f132512a.values()) {
            bobo a = bobp.mo68886a(bobo);
            bnia bnia = (bnia) b.get(a);
            if (bnia == null) {
                bnia = bnic.m109500j();
                b.put(a, bnia);
            }
            bnia.mo67629b(bobo.f132509b);
        }
        bngs j = bngx.m109377j();
        for (bnia bnia2 : b.values()) {
            j.mo67668c(bnia2.mo67751a());
        }
        bngx a2 = j.mo67664a();
        bnia j2 = bnic.m109500j();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            bngs j3 = bngx.m109377j();
            for (Object obj : (Set) a2.get(i)) {
                j3.mo67668c(obj);
                j3.mo67666b((Iterable) this.f144907c.mo67127c(obj));
            }
            j2.mo67629b(this.f144906b.mo70665a(j3.mo67664a()));
        }
        return j2.mo67751a();
    }

    /* renamed from: a */
    public abstract void mo70681a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo70682a(Object obj, Object obj2) {
        this.f144907c.mo67268a(obj, obj2);
    }

    /* renamed from: a */
    public final void mo70683a(Collection collection) {
        for (Object obj : collection) {
            mo70681a(obj);
        }
    }
}
