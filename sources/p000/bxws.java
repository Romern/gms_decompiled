package p000;

/* renamed from: bxws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxws implements bxxa {

    /* renamed from: a */
    private final bxxa[] f165005a;

    public bxws(bxxa... bxxaArr) {
        this.f165005a = bxxaArr;
    }

    /* renamed from: a */
    public final boolean mo73930a(Class cls) {
        bxxa[] bxxaArr = this.f165005a;
        for (int i = 0; i < 2; i++) {
            if (bxxaArr[i].mo73930a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final bxwz mo73931b(Class cls) {
        bxxa[] bxxaArr = this.f165005a;
        for (int i = 0; i < 2; i++) {
            bxxa bxxa = bxxaArr[i];
            if (bxxa.mo73930a(cls)) {
                return bxxa.mo73931b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() == 0 ? new String("No factory is available for message type: ") : "No factory is available for message type: ".concat(valueOf));
    }
}
