package p000;

import java.util.Collection;
import java.util.logging.Level;

/* renamed from: bryz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bryz extends bntm {

    /* renamed from: a */
    private final Collection f143705a;

    public bryz(String str, Collection collection) {
        super(str);
        this.f143705a = collection;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection], assign insn: 0x0000: IGET  (r0v0 ? I:java.util.Collection) = (r5v0 'this' bryz A[THIS]) bryz.a java.util.Collection */
    /* renamed from: a */
    public final void mo8544a(bnsw bnsw) {
        ? r0 = this.f143705a;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            bnsx bnsx = (bnsx) r0.get(i);
            if (bnsw.mo68445j() || bnsx.mo8545a(bnsw.mo68438c())) {
                bnsx.mo8544a(bnsw);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection], assign insn: 0x0000: IGET  (r0v0 ? I:java.util.Collection) = (r5v0 'this' bryz A[THIS]) bryz.a java.util.Collection */
    /* renamed from: a */
    public final boolean mo8545a(Level level) {
        ? r0 = this.f143705a;
        int size = r0.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((bnsx) r0.get(i)).mo8545a(level)) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
