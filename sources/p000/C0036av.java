package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: av */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0036av extends C0034at {

    /* renamed from: a */
    private final C1207n f2349a = new C1207n();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2443a() {
        Iterator it = this.f2349a.iterator();
        while (it.hasNext()) {
            ((C0035au) ((Map.Entry) it.next()).getValue()).mo2510a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo2451c() {
        Iterator it = this.f2349a.iterator();
        while (it.hasNext()) {
            ((C0035au) ((Map.Entry) it.next()).getValue()).mo2512b();
        }
    }

    /* renamed from: a */
    public final void mo2666a(C0034at atVar) {
        C0035au auVar = (C0035au) this.f2349a.mo11576b(atVar);
        if (auVar != null) {
            auVar.mo2512b();
        }
    }

    /* renamed from: a */
    public final void mo2667a(C0034at atVar, C0038ax axVar) {
        C0035au auVar = new C0035au(atVar, axVar);
        C0035au auVar2 = (C0035au) this.f2349a.mo15481a(atVar, auVar);
        if (auVar2 != null && auVar2.f2239b != axVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (auVar2 == null && mo2452d()) {
            auVar.mo2510a();
        }
    }
}
