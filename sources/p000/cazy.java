package p000;

import java.util.Collections;
import java.util.Set;

/* renamed from: cazy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cazy implements cazv {

    /* renamed from: a */
    private boolean f176466a = false;

    /* renamed from: b */
    public final Set f176467b;

    public cazy() {
        bnko bnko = new bnko();
        bnko.mo67938a(bnle.WEAK);
        this.f176467b = Collections.newSetFromMap(bnko.mo67943e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bqgg mo32752a();

    /* renamed from: a */
    public final cazn mo75202a(cazw cazw) {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        return r1;
     */
    /* renamed from: b */
    public final bqgg mo75201b() {
        synchronized (this.f176467b) {
            if (!this.f176466a) {
                bqgg a = mo32752a();
                if (!a.isDone() && this.f176467b.add(a)) {
                    a.mo741a(new cazx(this, a), bqfb.INSTANCE);
                }
            } else {
                bqgg a2 = bqga.m112770a();
                return a2;
            }
        }
    }

    /* renamed from: bf */
    public final cazn mo75204bf() {
        return this;
    }

    /* renamed from: a */
    public final void mo75203a(boolean z) {
        synchronized (this.f176467b) {
            this.f176466a = true;
            for (bqgg bqgg : this.f176467b) {
                bqgg.cancel(z);
            }
        }
    }
}
