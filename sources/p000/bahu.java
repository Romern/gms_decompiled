package p000;

import java.util.HashSet;

/* renamed from: bahu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bahu extends cazu {

    /* renamed from: b */
    private final cazn f100909b;

    public bahu(cijl cijl, cijl cijl2, cazn cazn) {
        super(cijl2, cbag.m127657a(bahu.class), cijl);
        this.f100909b = cbac.m127643a(cazn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return this.f100909b.mo75201b();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        HashSet hashSet = new HashSet();
        bngx bngx = ((bamm) obj).f101270a;
        int size = bngx.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(((byhy) bngx.get(i)).f166534e);
        }
        return bqga.m112775a((Object) hashSet);
    }
}
