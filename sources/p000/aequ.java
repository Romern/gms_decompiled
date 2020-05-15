package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: aequ */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aequ {

    /* renamed from: a */
    protected final Context f63645a;

    /* renamed from: b */
    public final C1223np f63646b = new C1223np(1);

    /* renamed from: c */
    public int f63647c;

    public aequ(Context context) {
        this.f63645a = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo34467a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34468a(int i) {
        synchronized (this.f63646b) {
            int i2 = this.f63647c;
            if (i != i2) {
                this.f63647c = i;
                int i3 = 0;
                while (true) {
                    C1223np npVar = this.f63646b;
                    if (i3 < npVar.f26809h) {
                        aerc aerc = (aerc) npVar.mo15620b(i3);
                        Executor executor = (Executor) this.f63646b.mo15621c(i3);
                        executor.execute(new aeqt(this, aerc, executor, i2, i));
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo34469b();
}
