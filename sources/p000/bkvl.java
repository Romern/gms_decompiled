package p000;

import java.util.HashSet;
import java.util.Map;

/* renamed from: bkvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkvl {

    /* renamed from: a */
    public final bkqk f125328a;

    /* renamed from: b */
    public final StringBuilder f125329b = new StringBuilder();

    /* renamed from: c */
    public final bkxh f125330c = new bkxh(this.f125329b);

    /* renamed from: d */
    private final HashSet f125331d = new HashSet();

    public bkvl(bkqk bkqk) {
        this.f125328a = bkqk;
    }

    /* renamed from: a */
    private final void m106711a(blhp blhp) {
        blgs blgs = blgs.SHIFT_AFTER_DELETE;
        blho blho = blho.KIND_NOT_SET;
        int ordinal = blhp.f126558b.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                mo66376a(((bksp) this.f125328a).mo66227a(blhp.mo66554b()));
                return;
            }
            throw new bkpz("Unknown value type.", blhp.getClass().getCanonicalName());
        } else if (blhp.mo66553a().f126445b == blgl.NULL_VALUE) {
            this.f125330c.mo66425e();
        } else {
            this.f125330c.mo66423c();
            this.f125330c.mo66419a("json");
            bkqg.m106278a(blhp.mo66553a(), this.f125330c);
            this.f125330c.mo66424d();
        }
    }

    /* renamed from: a */
    public final void mo66376a(bkqo bkqo) {
        if (bkqo != null) {
            String d = bkqo.mo66247d();
            if (this.f125331d.contains(d)) {
                String d2 = bkqo.mo66247d();
                this.f125330c.mo66423c();
                this.f125330c.mo66419a("ref");
                this.f125330c.mo66422b(d2);
                this.f125330c.mo66424d();
                return;
            }
            this.f125331d.add(d);
            this.f125330c.mo66423c();
            this.f125330c.mo66419a("id");
            this.f125330c.mo66422b(bkqo.mo66247d());
            this.f125330c.mo66419a("type");
            this.f125330c.mo66422b(bkqo.mo66249f());
            this.f125330c.mo66419a("value");
            if (bkqo instanceof bkqp) {
                this.f125330c.mo66422b(((bkqp) bkqo).toString());
            } else if (bkqo instanceof bkqn) {
                this.f125330c.mo66423c();
                for (Map.Entry entry : ((bkqn) bkqo).mo66242c()) {
                    this.f125330c.mo66419a((String) entry.getKey());
                    m106711a((blhp) entry.getValue());
                }
                this.f125330c.mo66424d();
            } else if (bkqo instanceof bkqm) {
                this.f125330c.mo66417a();
                for (blhp blhp : ((bkqm) bkqo).mo66234b()) {
                    m106711a(blhp);
                }
                this.f125330c.mo66421b();
            } else if (bkqo instanceof bkqt) {
                bkqt bkqt = (bkqt) bkqo;
                blgs n = bkqt.mo66267n();
                blgs blgs = blgs.SHIFT_AFTER_DELETE;
                blho blho = blho.KIND_NOT_SET;
                int ordinal = n.ordinal();
                String str = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? "unknown" : "shift_to_invalid" : "shift_before_delete" : "shift_after_delete";
                this.f125330c.mo66423c();
                this.f125330c.mo66419a("objectId");
                this.f125330c.mo66422b(bkqt.mo66263a());
                this.f125330c.mo66419a("index");
                this.f125330c.mo66418a(bkqt.mo66265b());
                this.f125330c.mo66419a("canBeDeleted");
                this.f125330c.mo66420a(bkqt.mo66266c());
                this.f125330c.mo66419a("deleteMode");
                this.f125330c.mo66422b(str);
                this.f125330c.mo66424d();
            } else {
                String valueOf = String.valueOf(bkqo);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unknown object type: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f125330c.mo66424d();
            return;
        }
        this.f125330c.mo66425e();
    }
}
