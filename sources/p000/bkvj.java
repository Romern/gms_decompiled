package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bkvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkvj extends bkvh {

    /* renamed from: d */
    private final String f125321d = m106706b("objectId").mo66491b();

    /* renamed from: e */
    private final int f125322e = ((int) m106706b("index").mo66490a());

    /* renamed from: f */
    private final blgs f125323f;

    /* renamed from: g */
    private final blgm f125324g;

    /* renamed from: h */
    private final Map f125325h;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3 A[RETURN] */
    public bkvj(blgm blgm) {
        super(blgm);
        char c;
        blgs blgs;
        blgm a = mo66374a("value");
        this.f125324g = a;
        this.f125325h = a.mo66493d().mo66481a();
        if (m106707c("deleteMode")) {
            String b = m106706b("deleteMode").mo66491b();
            int hashCode = b.hashCode();
            if (hashCode != -1481713298) {
                if (hashCode != 998662160) {
                    if (hashCode == 1102859787 && b.equals("shift_after_delete")) {
                        c = 0;
                        if (c != 0) {
                            blgs = blgs.SHIFT_AFTER_DELETE;
                        } else if (c == 1) {
                            blgs = blgs.SHIFT_BEFORE_DELETE;
                        } else if (c != 2) {
                            blgs = null;
                        } else {
                            blgs = blgs.SHIFT_TO_INVALID;
                        }
                        this.f125323f = blgs;
                        if (blgs != null) {
                            String valueOf = String.valueOf(b);
                            throw new IllegalStateException(valueOf.length() == 0 ? new String("Unknown delete mode: ") : "Unknown delete mode: ".concat(valueOf));
                        }
                        return;
                    }
                } else if (b.equals("shift_to_invalid")) {
                    c = 2;
                    if (c != 0) {
                    }
                    this.f125323f = blgs;
                    if (blgs != null) {
                    }
                }
            } else if (b.equals("shift_before_delete")) {
                c = 1;
                if (c != 0) {
                }
                this.f125323f = blgs;
                if (blgs != null) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
            this.f125323f = blgs;
            if (blgs != null) {
            }
        } else if (m106707c("canBeDeleted")) {
            this.f125323f = bksx.m106558a(m106706b("canBeDeleted").mo66492c());
        } else {
            this.f125323f = blgs.SHIFT_AFTER_DELETE;
        }
    }

    /* renamed from: b */
    private final blgm m106706b(String str) {
        if (m106707c(str)) {
            return (blgm) this.f125325h.get(str);
        }
        throw new bkqd(str, bkqg.m106277a(this.f125324g));
    }

    /* renamed from: c */
    private final boolean m106707c(String str) {
        return this.f125325h.containsKey(str);
    }

    /* renamed from: a */
    public final List mo66373a() {
        return Collections.singletonList(bksz.m106576a(this.f125316a, this.f125321d, this.f125322e, this.f125323f));
    }
}
