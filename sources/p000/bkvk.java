package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bkvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkvk {

    /* renamed from: a */
    public final List f125326a = new ArrayList();

    /* renamed from: b */
    private final Map f125327b = new HashMap();

    public bkvk(String str) {
        bkww.m106781a(str, "json");
        blhp a = mo66375a((blgm) new bkxi(str).mo66427a(bkqh.f125111a));
        if (a.f126558b == blho.REFERENCED_ID) {
            String b = a.mo66554b();
            if (b.equals("root")) {
                for (bkvh bkvh : this.f125327b.values()) {
                    this.f125326a.add(bksz.m106575a(bkvh.f125316a, bkvh.f125317b));
                }
                for (bkvh bkvh2 : this.f125327b.values()) {
                    if (!(bkvh2 instanceof bkvj)) {
                        this.f125326a.addAll(bkvh2.mo66373a());
                    }
                }
                for (bkvh bkvh3 : this.f125327b.values()) {
                    if (bkvh3 instanceof bkvj) {
                        this.f125326a.addAll(bkvh3.mo66373a());
                    }
                }
                return;
            }
            throw new bkqa(b);
        }
        throw new bkqb();
    }

    /* renamed from: a */
    private final blhp m106709a(bkvh bkvh) {
        if (this.f125327b.containsKey(bkvh.f125316a)) {
            String valueOf = String.valueOf(bkvh.f125316a);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Input contains more than one value for object with ID: ") : "Input contains more than one value for object with ID: ".concat(valueOf));
        }
        this.f125327b.put(bkvh.f125316a, bkvh);
        blhn c = blhp.m107177c();
        c.mo66552a(bkvh.f125316a);
        return c.mo66550a();
    }

    /* renamed from: a */
    public final blhp mo66375a(blgm blgm) {
        blgl blgl = blgm.f126445b;
        if (blgl == blgl.NULL_VALUE) {
            return bkta.f125260a;
        }
        if (blgl == blgl.STRUCT_VALUE) {
            Map a = blgm.mo66493d().mo66481a();
            if (a.containsKey("data")) {
                return mo66375a((blgm) a.get("data"));
            }
            if (a.containsKey("json")) {
                return bkta.m106590b((blgm) a.get("json"));
            }
            if (a.containsKey("type")) {
                blgr a2 = bksz.m106562a(((blgm) a.get("type")).mo66491b());
                blgq blgq = blgq.KIND_NOT_SET;
                int ordinal = a2.f126464b.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return m106709a(new bkvf(this, blgm));
                    }
                    if (ordinal == 3) {
                        return m106709a(new bkvi(blgm));
                    }
                    if (ordinal == 4) {
                        return m106709a(new bkvj(blgm));
                    }
                    if (ordinal != 5) {
                        String valueOf = String.valueOf(a2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                        sb.append("Unsupported Realtime type: ");
                        sb.append(valueOf);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                return m106709a(new bkvg(this, blgm));
            } else if (a.containsKey("ref")) {
                String b = ((blgm) a.get("ref")).mo66491b();
                blhn c = blhp.m107177c();
                c.mo66552a(b);
                return c.mo66550a();
            } else {
                String valueOf2 = String.valueOf(bkqg.m106277a(blgm));
                throw new bkqf(valueOf2.length() == 0 ? new String("Expected Realtime object, reference, or input data but was: ") : "Expected Realtime object, reference, or input data but was: ".concat(valueOf2));
            }
        } else {
            throw new bkpz("object", blgm.toString());
        }
    }
}
