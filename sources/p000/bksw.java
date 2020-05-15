package p000;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: bksw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bksw implements bkqy {

    /* renamed from: a */
    public final bkqx f125246a;

    /* renamed from: b */
    public final LinkedList f125247b = new LinkedList();

    /* renamed from: c */
    public final LinkedList f125248c = new LinkedList();

    /* renamed from: d */
    public final LinkedList f125249d = new LinkedList();

    /* renamed from: e */
    public final EnumSet f125250e = EnumSet.noneOf(bkqz.class);

    /* renamed from: f */
    public boolean f125251f;

    /* renamed from: g */
    private final bksm f125252g;

    /* renamed from: h */
    private final int f125253h;

    /* renamed from: i */
    private long f125254i;

    public bksw(bkqx bkqx, bkrb bkrb, int i, bksm bksm) {
        this.f125246a = bkqx;
        this.f125252g = bksm;
        this.f125253h = i;
        if (bkrb != null) {
            this.f125247b.addAll(bkrb.f125153b);
            this.f125248c.addAll(bkrb.f125154c);
            this.f125249d.addAll(bkrb.f125155d);
            m106551a(this.f125247b, bkqz.TRUNCATE_UNDO);
            m106551a(this.f125248c, bkqz.TRUNCATE_REDO);
        }
    }

    /* renamed from: a */
    private static final void m106550a(LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (((blhg) it.next()).f126522b == blhf.KIND_NOT_SET) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public final bkra mo66343b(blhg blhg) {
        blhg blhg2;
        EnumSet noneOf = EnumSet.noneOf(bkqz.class);
        if (!this.f125249d.isEmpty()) {
            blhg2 = bkws.f125358b.mo66394a(this.f125249d, blhg);
            noneOf.add(bkqz.REFRESH_PENDING_BATCH);
            m106550a(this.f125249d);
        } else {
            blhg2 = blhg;
        }
        if (!this.f125247b.isEmpty()) {
            bkws.f125358b.mo66394a(this.f125247b, blhg2);
            noneOf.add(bkqz.REFRESH_UNDO);
            m106550a(this.f125247b);
        }
        if (!this.f125248c.isEmpty()) {
            blhg = bkws.f125358b.mo66394a(this.f125248c, blhg);
            noneOf.add(bkqz.REFRESH_REDO);
            m106550a(this.f125248c);
        }
        return new bkra(noneOf, blhg);
    }

    /* renamed from: a */
    private final void m106551a(LinkedList linkedList, bkqz bkqz) {
        if (this.f125253h != -1 && linkedList.size() > this.f125253h) {
            this.f125250e.add(bkqz);
            linkedList.removeLast();
        }
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [bksl, bkqx], assign insn: 0x00a5: IGET  (r2v10 ? I:bkqx) = (r11v0 'this' bksw A[THIS]) bksw.a bkqx */
    /* renamed from: a */
    public final bkqi mo66275a(bkqw bkqw, blhg blhg) {
        bkql bkql;
        bkww.m106781a(blhg, "Cannot put null onto the undo or redo stack");
        bkql bkql2 = null;
        bkql2 = null;
        boolean z = false;
        z = false;
        boolean z2 = false;
        if (blhg.f126522b != blhf.KIND_NOT_SET) {
            boolean z3 = true;
            z3 = true;
            if (bkqw.equals(bkqw.f125127e)) {
                if (!mo66279b() || !mo66278a()) {
                    z = true;
                }
                this.f125250e.add(bkqz.ADD_TO_REDO);
                this.f125248c.push(blhg);
                m106551a(this.f125248c, bkqz.TRUNCATE_REDO);
            } else if (bkqw.equals(bkqw.f125128f)) {
                if (!mo66278a() || !mo66279b()) {
                    z2 = true;
                }
                this.f125250e.add(bkqz.ADD_TO_UNDO);
                this.f125247b.push(blhg);
                m106551a(this.f125247b, bkqz.TRUNCATE_UNDO);
                bkql = null;
            } else {
                if (mo66278a() && !mo66279b()) {
                    z3 = false;
                }
                if (this.f125251f) {
                    long j = this.f125254i;
                    List arrayList = new ArrayList();
                    if (!this.f125249d.isEmpty()) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.push((blhg) this.f125249d.peek());
                        bkws.f125358b.mo66394a(linkedList, bksy.m106559a(this.f125252g, blhg));
                        arrayList = new bksu(this.f125246a).mo66315a((blhg) linkedList.get(0)).f125114b;
                    }
                    bkql bkql3 = new bkql(j, arrayList);
                    this.f125254i = System.currentTimeMillis();
                    bkql2 = bkql3;
                }
                this.f125250e.add(bkqz.ADD_TO_PENDING_BATCH);
                this.f125249d.push(blhg);
                if (!this.f125248c.isEmpty()) {
                    this.f125250e.add(bkqz.REFRESH_REDO);
                    this.f125248c.clear();
                }
                z = z3;
            }
            bkql = bkql2;
        } else {
            bkql = null;
        }
        if (z) {
            this.f125250e.add(bkqz.UNDO_REDO_STATE_CHANGED);
        }
        bkra bkra = new bkra(this.f125250e, blhg);
        this.f125250e.clear();
        return new bkqi(null, null, null, null, bkra, null, bkql);
    }

    /* renamed from: b */
    public final boolean mo66279b() {
        return !this.f125248c.isEmpty();
    }

    /* renamed from: a */
    public final bkra mo66276a(blhg blhg) {
        return mo66343b(blhg);
    }

    /* renamed from: a */
    public final void mo66277a(boolean z) {
        blhg blhg;
        bkra bkra = bkra.f125144a;
        if (z) {
            if (!this.f125249d.isEmpty()) {
                blhg = null;
            } else {
                return;
            }
        } else if (this.f125249d.size() > 1) {
            blhg = (blhg) this.f125249d.pop();
        } else {
            return;
        }
        blhg a = bksz.m106578a(this.f125249d);
        this.f125250e.add(bkqz.ADD_TO_UNDO);
        this.f125247b.push(a);
        m106551a(this.f125247b, bkqz.TRUNCATE_UNDO);
        this.f125250e.add(bkqz.REFRESH_PENDING_BATCH);
        this.f125249d.clear();
        if (blhg != null) {
            this.f125249d.push(blhg);
        }
        new bkra(this.f125250e, a);
        this.f125250e.clear();
    }

    /* renamed from: a */
    public final boolean mo66278a() {
        return !this.f125247b.isEmpty() || !this.f125249d.isEmpty();
    }
}
