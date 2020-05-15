package p000;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: akuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akuo {

    /* renamed from: a */
    protected final akup f72903a;

    /* renamed from: b */
    protected final ExecutorService f72904b;

    /* renamed from: c */
    public final ArrayList f72905c;

    /* renamed from: d */
    public int f72906d = -1;

    /* renamed from: e */
    private final AtomicBoolean f72907e;

    protected akuo(ExecutorService executorService, akup akup) {
        this.f72903a = akup;
        this.f72904b = executorService;
        this.f72905c = new ArrayList(3);
        this.f72907e = new AtomicBoolean(false);
    }

    /* renamed from: a */
    private final void m60502a(akum akum, int i) {
        int[] iArr = akum.f72899a;
        int i2 = iArr[0];
        this.f72906d = i2;
        iArr[0] = i2 + 1;
        for (int i3 = 0; i3 < this.f72905c.size(); i3++) {
            ((akuo) this.f72905c.get(i3)).m60502a(akum, i + 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        android.util.Log.e("Pipeline", "Pipeline processor failed", r6);
        r4.f72903a.mo39836c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    public final void mo39871b(Object obj, akul akul) {
        if (this.f72903a.mo39837d(obj)) {
            Object a = this.f72903a.mo39747a(obj);
            if (a != null) {
                for (int i = 0; i < this.f72905c.size(); i++) {
                    akuo akuo = (akuo) this.f72905c.get(i);
                }
                ArrayList arrayList = this.f72905c;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((akuo) arrayList.get(i2)).mo39870a(a, akul);
                }
                return;
            }
            return;
        }
        this.f72903a.mo39836c(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f72906d == -1) {
            sb.append("(not yet set up)");
        } else {
            sb.append("@");
            sb.append(this.f72906d);
        }
        sb.append(": ");
        sb.append(this.f72903a);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo39868a() {
        this.f72903a.mo39873d();
        ExecutorService executorService = this.f72904b;
        if (executorService != null) {
            executorService.shutdown();
        }
        this.f72907e.set(true);
        for (int i = 0; i < this.f72905c.size(); i++) {
            ((akuo) this.f72905c.get(i)).mo39868a();
        }
    }

    /* renamed from: a */
    public final void mo39869a(Object obj) {
        if (this.f72906d == -1) {
            m60502a(new akum(new int[]{0}), 0);
        }
        mo39870a(obj, new akul());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39870a(Object obj, akul akul) {
        if (!this.f72907e.get()) {
            ExecutorService executorService = this.f72904b;
            if (executorService != null) {
                executorService.execute(new akun(this, obj, akul));
            } else {
                mo39871b(obj, akul);
            }
        }
    }
}
