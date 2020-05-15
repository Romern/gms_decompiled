package p000;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: bxsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bxsz implements bxxc {

    /* renamed from: ag */
    public int f164758ag = 0;

    /* renamed from: m */
    static final bxym m123094m() {
        return new bxym();
    }

    /* renamed from: a */
    public final void mo73638a(OutputStream outputStream) {
        bxuk a = bxuk.m123635a(outputStream, bxuk.m123649f(mo74145db()));
        mo73644a(a);
        a.mo73851c();
    }

    /* renamed from: aL */
    public final ByteString mo73639aL() {
        try {
            bxts e = ByteString.m123269e(mo74145db());
            mo73644a(e.f164787a);
            return e.mo73749a();
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* renamed from: b */
    public void mo73640b(int i) {
        throw null;
    }

    /* renamed from: k */
    public final byte[] serializeToBytes() {
        try {
            byte[] bArr = new byte[mo74145db()];
            bxuk a = bxuk.m123637a(bArr);
            mo73644a(a);
            a.mo73868d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: l */
    public int mo73643l() {
        throw null;
    }

    /* renamed from: b */
    public final void mo73641b(OutputStream outputStream) {
        int db = mo74145db();
        bxuk a = bxuk.m123635a(outputStream, bxuk.m123649f(bxuk.m123661k(db) + db));
        a.mo73855d(db);
        mo73644a(a);
        a.mo73851c();
    }
}
