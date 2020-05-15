package p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: bypp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bypp extends bypx {

    /* renamed from: a */
    public final bxtx f167357a;

    public bypp(bxtx bxtx) {
        bmxy.m108581a(bxtx);
        this.f167357a = bxtx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74417a(byqc byqc) {
        try {
            byte[] k = this.f167357a.mo73780k();
            if (k != null) {
                byqc.f167375a.mo74458a(-1);
                byqc.mo74466a((byte) 64, k);
                return;
            }
            throw new IllegalArgumentException("byte array must be non-null");
        } catch (IOException e) {
            throw new bypr("Error while encoding CborByteString", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo74418b() {
        return m125078a((byte) 64);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bypx bypx = (bypx) obj;
        if (mo74418b() != bypx.mo74418b()) {
            return mo74418b() - bypx.mo74418b();
        }
        bypp bypp = (bypp) bypx;
        if (this.f167357a.mo73744a() != bypp.f167357a.mo73744a()) {
            return this.f167357a.mo73744a() - bypp.f167357a.mo73744a();
        }
        return bqcv.f140491b.compare(this.f167357a.mo73780k(), bypp.f167357a.mo73780k());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f167357a.equals(((bypp) obj).f167357a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo74418b()), this.f167357a});
    }

    public final String toString() {
        String a = boan.f132472f.mo68787b().mo68794a(this.f167357a.mo73780k());
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 3);
        sb.append("h'");
        sb.append(a);
        sb.append("'");
        return sb.toString();
    }
}
