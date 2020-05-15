package p000;

/* renamed from: fj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0988fj extends C0986fh {

    /* renamed from: af */
    public float f16698af = -1.0f;

    /* renamed from: ag */
    public int f16699ag = -1;

    /* renamed from: ah */
    public int f16700ah = -1;

    /* renamed from: ai */
    public int f16701ai = 0;

    /* renamed from: aj */
    private C0985fg f16702aj = this.f16576j;

    public C0988fj() {
        this.f16583q.clear();
        this.f16583q.add(this.f16702aj);
    }

    /* renamed from: a */
    public final void mo10812a(C0981fc fcVar) {
        C0986fh fhVar = this.f16584r;
        if (fhVar != null) {
            C0985fg e = fhVar.mo10822e(2);
            C0985fg e2 = fhVar.mo10822e(4);
            if (this.f16701ai == 0) {
                e = fhVar.mo10822e(3);
                e2 = fhVar.mo10822e(5);
            }
            if (this.f16699ag != -1) {
                fcVar.mo10667a(C0981fc.m11427a(fcVar, fcVar.mo10665a(this.f16702aj), fcVar.mo10665a(e), this.f16699ag, false));
            } else if (this.f16700ah != -1) {
                fcVar.mo10667a(C0981fc.m11427a(fcVar, fcVar.mo10665a(this.f16702aj), fcVar.mo10665a(e2), -this.f16700ah, false));
            } else if (this.f16698af != -1.0f) {
                C0983fe a = fcVar.mo10665a(this.f16702aj);
                C0983fe a2 = fcVar.mo10665a(e);
                C0983fe a3 = fcVar.mo10665a(e2);
                float f = this.f16698af;
                C0977ez b = fcVar.mo10673b();
                b.f16077d.mo10575a(a, -1.0f);
                b.f16077d.mo10575a(a2, 1.0f - f);
                b.f16077d.mo10575a(a3, f);
                fcVar.mo10667a(b);
            }
        }
    }

    /* renamed from: e */
    public final C0985fg mo10822e(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f16701ai == 0) {
                return this.f16702aj;
            }
            return null;
        }
        if (this.f16701ai == 1) {
            return this.f16702aj;
        }
        return null;
    }

    /* renamed from: h */
    public final void mo10880h(int i) {
        if (this.f16701ai != i) {
            this.f16701ai = i;
            this.f16583q.clear();
            if (this.f16701ai == 1) {
                this.f16702aj = this.f16575i;
            } else {
                this.f16702aj = this.f16576j;
            }
            this.f16583q.add(this.f16702aj);
        }
    }

    /* renamed from: m */
    public final void mo10832m() {
        if (this.f16584r != null) {
            int b = C0981fc.m11429b(this.f16702aj);
            if (this.f16701ai == 1) {
                this.f16589w = b;
                this.f16590x = 0;
                mo10813b(this.f16584r.mo10823f());
                mo10808a(0);
                return;
            }
            this.f16589w = 0;
            this.f16590x = b;
            mo10808a(this.f16584r.mo10816c());
            mo10813b(0);
        }
    }
}
