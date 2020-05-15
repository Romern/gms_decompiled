package p000;

import java.util.HashSet;

/* renamed from: bagx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bagx extends cazu {

    /* renamed from: b */
    private final cazn f100845b;

    public bagx(cijl cijl, cijl cijl2, cazn cazn) {
        super(cijl2, cbag.m127657a(bagx.class), cijl);
        this.f100845b = cbac.m127643a(cazn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return this.f100845b.mo75201b();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        HashSet hashSet = new HashSet();
        bngx bngx = ((bamm) obj).f101270a;
        int size = bngx.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(((byhr) bngx.get(i)).f166501f);
        }
        return bqga.m112775a((Object) hashSet);
    }
}
