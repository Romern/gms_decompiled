package p000;

import java.util.Collection;
import java.util.HashSet;

/* renamed from: cicu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cicu {

    /* renamed from: a */
    final Object f189793a = new Object();

    /* renamed from: b */
    final Collection f189794b = new HashSet();

    /* renamed from: c */
    chuv f189795c;

    /* renamed from: d */
    final /* synthetic */ cicv f189796d;

    public cicu(cicv cicv) {
        this.f189796d = cicv;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r2.f189796d.f189848w.mo85746a(r3);
     */
    /* renamed from: a */
    public final void mo85952a(chuv chuv) {
        synchronized (this.f189793a) {
            if (this.f189795c == null) {
                this.f189795c = chuv;
                boolean isEmpty = this.f189794b.isEmpty();
            }
        }
    }
}
