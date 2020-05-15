package p000;

/* renamed from: biqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum biqh implements bxvp {
    FEEDBACK_SELECT(1),
    FEEDBACK_FOCUS_CHANGE(2),
    FEEDBACK_DRAG_SELECT(3),
    FEEDBACK_DRAG_START(4),
    FEEDBACK_DRAG_END(5);
    

    /* renamed from: f */
    public final int f121281f;

    private biqh(int i) {
        this.f121281f = i;
    }

    /* renamed from: a */
    public static biqh m102724a(int i) {
        if (i == 1) {
            return FEEDBACK_SELECT;
        }
        if (i == 2) {
            return FEEDBACK_FOCUS_CHANGE;
        }
        if (i == 3) {
            return FEEDBACK_DRAG_SELECT;
        }
        if (i == 4) {
            return FEEDBACK_DRAG_START;
        }
        if (i != 5) {
            return null;
        }
        return FEEDBACK_DRAG_END;
    }

    /* renamed from: b */
    public static bxvr m102725b() {
        return biqg.f121274a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f121281f;
    }

    public final String toString() {
        return Integer.toString(this.f121281f);
    }
}
