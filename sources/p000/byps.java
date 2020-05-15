package p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: byps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byps extends bypx {

    /* renamed from: a */
    public final long f167358a;

    public byps(long j) {
        this.f167358a = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74417a(byqc byqc) {
        byte b;
        try {
            long j = this.f167358a;
            byqc.f167375a.mo74461b();
            if (j < 0) {
                j ^= -1;
                b = 32;
            } else {
                b = 0;
            }
            byqc.mo74465a(b, j);
        } catch (IOException e) {
            throw new bypr("Error while encoding CborInteger", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo74418b() {
        if (this.f167358a >= 0) {
            return m125078a((byte) 0);
        }
        return m125078a((byte) 32);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bypx bypx = (bypx) obj;
        if (mo74418b() != bypx.mo74418b()) {
            return mo74418b() - bypx.mo74418b();
        }
        return bqcr.m112591a(Math.abs(this.f167358a), Math.abs(((byps) bypx).f167358a));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.f167358a == ((byps) obj).f167358a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo74418b()), Long.valueOf(this.f167358a)});
    }

    public final String toString() {
        return Long.toString(this.f167358a);
    }
}
