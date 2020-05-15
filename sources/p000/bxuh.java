package p000;

import java.io.IOException;

/* renamed from: bxuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxuh extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    bxuh() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bxuh(String str) {
        super(r3.length() == 0 ? new String("CodedOutputStream was writing to a flat byte array and ran out of space.: ") : "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3));
        String valueOf = String.valueOf(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bxuh(String str, Throwable th) {
        super(r3.length() == 0 ? new String("CodedOutputStream was writing to a flat byte array and ran out of space.: ") : "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3), th);
        String valueOf = String.valueOf(str);
    }

    public bxuh(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
