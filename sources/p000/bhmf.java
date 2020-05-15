package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bhmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhmf {
    @Deprecated

    /* renamed from: a */
    public float f119070a;
    @Deprecated

    /* renamed from: b */
    public float f119071b;
    @Deprecated

    /* renamed from: c */
    public float f119072c;
    @Deprecated

    /* renamed from: d */
    public float f119073d;
    @Deprecated

    /* renamed from: e */
    public float f119074e;

    /* renamed from: f */
    public final List f119075f = new ArrayList();

    /* renamed from: g */
    private final List f119076g = new ArrayList();

    public bhmf() {
        mo63985a();
    }

    /* renamed from: a */
    private final void m101171a(float f) {
        float f2 = this.f119073d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.f119071b;
                float f5 = this.f119072c;
                bhmb bhmb = new bhmb(f4, f5, f4, f5);
                bhmb.f119065e = this.f119073d;
                bhmb.f119066f = f3;
                this.f119076g.add(new bhme());
                this.f119073d = f;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bhme mo63990b() {
        m101171a(this.f119074e);
        new ArrayList(this.f119076g);
        return new bhme();
    }

    /* renamed from: a */
    public final void mo63985a() {
        mo63987a(0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public final void mo63986a(float f, float f2) {
        bhmc bhmc = new bhmc();
        bhmc.f119067a = f;
        bhmc.f119068b = f2;
        this.f119075f.add(bhmc);
        bhma bhma = new bhma(bhmc, this.f119071b, this.f119072c);
        mo63989a(bhma, bhma.mo63983a() + 270.0f, bhma.mo63983a() + 270.0f);
        this.f119071b = f;
        this.f119072c = f2;
    }

    /* renamed from: a */
    public final void mo63987a(float f, float f2, float f3) {
        this.f119070a = f;
        this.f119071b = 0.0f;
        this.f119072c = f;
        this.f119073d = f2;
        this.f119074e = (f2 + f3) % 360.0f;
        this.f119075f.clear();
        this.f119076g.clear();
    }

    /* renamed from: a */
    public final void mo63988a(Matrix matrix, Path path) {
        int size = this.f119075f.size();
        for (int i = 0; i < size; i++) {
            ((bhmd) this.f119075f.get(i)).mo63984a(matrix, path);
        }
    }

    /* renamed from: a */
    public final void mo63989a(bhme bhme, float f, float f2) {
        m101171a(f);
        this.f119076g.add(bhme);
        this.f119073d = f2;
    }
}
