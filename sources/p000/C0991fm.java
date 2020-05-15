package p000;

import java.util.ArrayList;

/* renamed from: fm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0991fm extends C0986fh {

    /* renamed from: al */
    public final ArrayList f16877al = new ArrayList();

    /* renamed from: a */
    public void mo10807a() {
        this.f16877al.clear();
        super.mo10807a();
    }

    /* renamed from: l */
    public final void mo10831l() {
        super.mo10831l();
        ArrayList arrayList = this.f16877al;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0986fh fhVar = (C0986fh) this.f16877al.get(i);
                fhVar.mo10809a(mo10825g(), mo10827h());
                if (!(fhVar instanceof C0987fi)) {
                    fhVar.mo10831l();
                }
            }
        }
    }

    /* renamed from: n */
    public void mo10844n() {
        mo10831l();
        ArrayList arrayList = this.f16877al;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0986fh fhVar = (C0986fh) this.f16877al.get(i);
                if (fhVar instanceof C0991fm) {
                    ((C0991fm) fhVar).mo10844n();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10809a(int i, int i2) {
        super.mo10809a(i, i2);
        int size = this.f16877al.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0986fh) this.f16877al.get(i3)).mo10809a(this.f16589w + this.f16534A, this.f16590x + this.f16535B);
        }
    }

    /* renamed from: a */
    public final void mo10811a(C0979fa faVar) {
        super.mo10811a(faVar);
        int size = this.f16877al.size();
        for (int i = 0; i < size; i++) {
            ((C0986fh) this.f16877al.get(i)).mo10811a(faVar);
        }
    }

    /* renamed from: a */
    public final void mo11018a(C0986fh fhVar) {
        this.f16877al.remove(fhVar);
        fhVar.f16584r = null;
    }
}
