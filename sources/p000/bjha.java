package p000;

import android.view.View;
import java.util.ArrayList;

/* renamed from: bjha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjha {

    /* renamed from: a */
    bjha f122712a;

    /* renamed from: b */
    final ArrayList f122713b = new ArrayList();

    /* renamed from: c */
    int f122714c = 0;

    /* renamed from: d */
    int f122715d = 0;

    /* renamed from: e */
    final bjgz f122716e;

    public bjha(bjgz bjgz) {
        this.f122716e = bjgz;
    }

    /* renamed from: a */
    public static bjha m103465a(bjgz bjgz) {
        return new bjha(bjgz);
    }

    /* renamed from: a */
    private final void m103466a(bjha bjha, int i) {
        if (this.f122712a != bjha) {
            this.f122712a = bjha;
            this.f122715d = i;
        }
    }

    /* renamed from: b */
    private final void m103467b(bjha bjha, int i) {
        if (bjha == null || !mo65218a()) {
            this.f122714c += i;
        }
        if (bjha != null) {
            int indexOf = this.f122713b.indexOf(bjha);
            int size = this.f122713b.size();
            for (int i2 = indexOf + 1; i2 < size; i2++) {
                ((bjha) this.f122713b.get(i2)).f122715d += i;
            }
        }
        if (bjha == null || !mo65218a()) {
            this.f122712a.m103467b(this, i);
        }
    }

    /* renamed from: a */
    public final boolean mo65218a() {
        return this.f122716e != null;
    }

    /* renamed from: a */
    public final void mo65213a(int i) {
        m103467b(null, i);
    }

    /* renamed from: a */
    public final void mo65214a(int i, bjgt bjgt, View view) {
        if (mo65218a()) {
            this.f122716e.mo65212a(bjgt, view);
            this.f122716e.mo65211a(view, i);
            return;
        }
        bjha bjha = this.f122712a;
        if (bjha != null) {
            bjha.mo65214a(i + this.f122715d, bjgt, view);
            return;
        }
        throw new IllegalStateException("The root of the NodePresenterHelper tree must be a subRoot");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65215a(int i, bjha bjha) {
        boolean z;
        int i2 = 0;
        if (bjha.f122714c == 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Trying to add a PresenterNodeHelper which already has views attached elsewhere.");
        this.f122713b.add(i, bjha);
        int indexOf = this.f122713b.indexOf(bjha);
        if (indexOf > 0) {
            bjha bjha2 = (bjha) this.f122713b.get(indexOf - 1);
            i2 = bjha2.f122714c + bjha2.f122715d;
        }
        bjha.m103466a(this, i2);
    }

    /* renamed from: a */
    public final void mo65216a(View view) {
        if (!mo65218a()) {
            bjha bjha = this.f122712a;
            if (bjha != null) {
                bjha.mo65216a(view);
                return;
            }
            throw new IllegalStateException("The root of the NodePresenterHelper tree must be a subRoot");
        }
        this.f122716e.mo65210a(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65217a(bjha bjha) {
        boolean z;
        if (bjha.f122714c == 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Trying to remove a PresenterNodeHelper without first detaching all views.");
        this.f122713b.remove(bjha);
        bjha.m103466a((bjha) null, 0);
    }
}
