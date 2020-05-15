package p000;

import java.io.IOException;

/* renamed from: ctd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ctd implements csz {
    PDOL;
    

    /* renamed from: b */
    private final byte[] f12008b;

    private ctd() {
        this.f12008b = czm.m8012a(r3);
    }

    /* renamed from: a */
    public final cta mo8232a(byte... bArr) {
        try {
            return new cte(this, ctc.m7528b(bArr));
        } catch (IOException e) {
            throw new ctu(e, css.UNKNOWN_ERROR_RESPONSE);
        }
    }

    /* renamed from: a */
    public final cte mo8255a(ctf... ctfArr) {
        return new cte(this, ctfArr);
    }

    /* renamed from: a */
    public final ctf mo8233a(int i) {
        return new ctf(this, i);
    }

    /* renamed from: a */
    public final byte[] mo8234a() {
        return czm.m8028e(this.f12008b);
    }
}
