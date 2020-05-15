package p000;

/* renamed from: dcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum dcg implements bxvp {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6);
    

    /* renamed from: f */
    public final int f12804f;

    private dcg(int i) {
        this.f12804f = i;
    }

    /* renamed from: a */
    public static dcg m8153a(int i) {
        if (i == 0) {
            return UNSUPPORTED;
        }
        if (i == 2) {
            return ARM7;
        }
        if (i == 4) {
            return X86;
        }
        if (i == 5) {
            return ARM64;
        }
        if (i != 6) {
            return null;
        }
        return X86_64;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f12804f;
    }

    public final String toString() {
        return Integer.toString(this.f12804f);
    }
}
