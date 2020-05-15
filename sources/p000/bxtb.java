package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: bxtb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bxtb implements bxxk {

    /* renamed from: a */
    private static final bxus f164759a = bxus.m123743b();

    /* renamed from: a */
    private static final void m123109a(bxxc bxxc) {
        bxym bxym;
        if (bxxc != null && !bxxc.mo74020aS()) {
            if (bxxc instanceof bxsz) {
                bxsz bxsz = (bxsz) bxxc;
                bxym = bxsz.m123094m();
            } else if (bxxc instanceof bxta) {
                bxta bxta = (bxta) bxxc;
                throw null;
            } else {
                bxym = new bxym();
            }
            throw bxym.mo74281a();
        }
    }

    /* renamed from: a */
    public bxxc mo73651a(byte[] bArr, int i, int i2, bxus bxus) {
        throw null;
    }

    /* renamed from: b */
    public final bxxc mo73665d(InputStream inputStream, bxus bxus) {
        bxxc a = mo73650a(inputStream, bxus);
        m123109a(a);
        return a;
    }

    /* renamed from: b */
    public final bxxc mo73664c(byte[] bArr, int i, int i2, bxus bxus) {
        bxxc a = mo73651a(bArr, i, i2, bxus);
        m123109a(a);
        return a;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo73663c(InputStream inputStream, bxus bxus) {
        bxxc bxxc;
        try {
            int read = inputStream.read();
            if (read != -1) {
                bxxc = mo73650a(new bxsx(inputStream, bxuc.m123414a(read, inputStream)), bxus);
            } else {
                bxxc = null;
            }
            m123109a(bxxc);
            return bxxc;
        } catch (IOException e) {
            throw new bxwf(e);
        }
    }

    /* renamed from: a */
    public final bxxc mo73661b(ByteString bxtx, bxus bxus) {
        try {
            bxuc h = bxtx.mo73764h();
            bxxc bxxc = (bxxc) mo74124b(h, bxus);
            h.mo73787a(0);
            m123109a(bxxc);
            return bxxc;
        } catch (bxwf e) {
            throw e;
        } catch (bxwf e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public final bxxc mo73650a(InputStream inputStream, bxus bxus) {
        bxuc a = bxuc.m123416a(inputStream);
        bxxc bxxc = (bxxc) mo74124b(a, bxus);
        try {
            a.mo73787a(0);
            return bxxc;
        } catch (bxwf e) {
            throw e;
        }
    }

    /* renamed from: a */
    public final bxxc mo73662b(byte[] bArr, bxus bxus) {
        return mo73664c(bArr, 0, bArr.length, bxus);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo73653a(ByteString bxtx) {
        return mo73661b(bxtx, f164759a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo73654a(bxuc bxuc) {
        return (bxxc) mo74124b(bxuc, f164759a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo73655a(bxuc bxuc, bxus bxus) {
        bxxc bxxc = (bxxc) mo74124b(bxuc, bxus);
        m123109a(bxxc);
        return bxxc;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo73656a(InputStream inputStream) {
        return mo73665d(inputStream, f164759a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo73657a(byte[] bArr) {
        return mo73662b(bArr, f164759a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo73658a(byte[] bArr, int i, int i2) {
        return mo73664c(bArr, i, i2, f164759a);
    }
}
