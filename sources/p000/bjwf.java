package p000;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bjwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjwf implements bjwp {

    /* renamed from: a */
    public boolean f123506a;

    /* renamed from: b */
    final ArrayList f123507b = new ArrayList();

    /* renamed from: c */
    private bjwk f123508c;

    /* renamed from: a */
    public final void mo52946a(bjwk bjwk) {
        this.f123508c = bjwk;
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        if (this.f123508c != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bjwj bjwj = (bjwj) arrayList.get(i);
                int a = bmna.m108191a(bjwj.f123509a.f130094d);
                int i2 = 1;
                if (a == 0) {
                    a = 1;
                }
                if (a - 1 != 2) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                    if (a2 != 0) {
                        i2 = a2;
                    }
                    objArr[0] = bmna.m108192b(i2);
                    throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
                }
                this.f123507b.add(bjwj);
            }
            return;
        }
        throw new IllegalStateException("ClickTriggerComponent must have dependencyGraphManager set before adding triggers.");
    }

    /* renamed from: a */
    public final boolean mo65585a() {
        this.f123506a = false;
        int size = this.f123507b.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) this.f123507b.get(i);
            if (this.f123508c.mo65593b(bjwj)) {
                this.f123506a = this.f123506a || bjwj.f123509a.f130095e;
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        int a = bmna.m108191a(bmne.f130094d);
        if (a != 0 && a == 3) {
            return false;
        }
        int i = 1;
        Object[] objArr = new Object[1];
        int a2 = bmna.m108191a(bmne.f130094d);
        if (a2 != 0) {
            i = a2;
        }
        objArr[0] = bmna.m108192b(i);
        throw new IllegalArgumentException(String.format("Unsupported trigger type: %s", objArr));
    }
}
