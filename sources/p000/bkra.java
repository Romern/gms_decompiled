package p000;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: bkra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkra {

    /* renamed from: a */
    public static final bkra f125144a = new bkra(EnumSet.noneOf(bkqz.class), null);

    /* renamed from: b */
    public static final bkra f125145b = new bkra(f125149h, null);

    /* renamed from: e */
    private static final EnumSet f125146e = EnumSet.of(bkqz.ADD_TO_UNDO, bkqz.TRUNCATE_UNDO, bkqz.POP_UNDO);

    /* renamed from: f */
    private static final EnumSet f125147f = EnumSet.of(bkqz.ADD_TO_REDO, bkqz.TRUNCATE_REDO, bkqz.POP_REDO);

    /* renamed from: g */
    private static final EnumSet f125148g = EnumSet.of(bkqz.ADD_TO_PENDING_BATCH);

    /* renamed from: h */
    private static final EnumSet f125149h = EnumSet.of(bkqz.REFRESH_UNDO, bkqz.REFRESH_REDO, bkqz.REFRESH_PENDING_BATCH);

    /* renamed from: c */
    public final Set f125150c;

    /* renamed from: d */
    public final blhg f125151d;

    public bkra(EnumSet enumSet, blhg blhg) {
        EnumSet copyOf = EnumSet.copyOf(enumSet);
        boolean contains = copyOf.contains(bkqz.ADD_TO_UNDO);
        boolean contains2 = copyOf.contains(bkqz.ADD_TO_REDO);
        boolean contains3 = copyOf.contains(bkqz.ADD_TO_PENDING_BATCH);
        blhg blhg2 = null;
        if (contains ? contains2 || contains3 : contains2 && contains3) {
            copyOf.addAll(f125149h);
            blhg = null;
        }
        if (copyOf.contains(bkqz.REFRESH_UNDO)) {
            blhg = copyOf.contains(bkqz.ADD_TO_UNDO) ? null : blhg;
            copyOf.removeAll(f125146e);
        }
        if (copyOf.contains(bkqz.REFRESH_REDO)) {
            blhg = copyOf.contains(bkqz.ADD_TO_REDO) ? null : blhg;
            copyOf.removeAll(f125147f);
        }
        if (copyOf.contains(bkqz.REFRESH_PENDING_BATCH)) {
            blhg2 = !copyOf.contains(bkqz.ADD_TO_PENDING_BATCH) ? blhg : blhg2;
            copyOf.removeAll(f125148g);
            blhg = blhg2;
        }
        this.f125150c = Collections.unmodifiableSet(copyOf);
        this.f125151d = blhg;
    }

    /* renamed from: a */
    public final bkra mo66280a(bkra bkra) {
        if (this.f125151d != null && bkra.f125151d != null) {
            return new bkra(f125149h, null);
        }
        if (this.f125150c.isEmpty() && bkra.f125150c.isEmpty()) {
            return new bkra(EnumSet.noneOf(bkqz.class), null);
        }
        if (this.f125150c.isEmpty()) {
            return bkra;
        }
        if (bkra.f125150c.isEmpty()) {
            return this;
        }
        EnumSet copyOf = EnumSet.copyOf(this.f125150c);
        copyOf.addAll(bkra.f125150c);
        blhg blhg = this.f125151d;
        if (blhg == null) {
            blhg = bkra.f125151d;
        }
        return new bkra(copyOf, blhg);
    }
}
