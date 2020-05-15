package p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: bypo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bypo extends bypx {

    /* renamed from: a */
    public final boolean f167356a;

    public bypo(boolean z) {
        this.f167356a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74417a(byqc byqc) {
        int i;
        try {
            if (!this.f167356a) {
                i = 20;
            } else {
                i = 21;
            }
            byqc.f167375a.mo74461b();
            byqc.mo74465a((byte) -32, (long) i);
        } catch (IOException e) {
            throw new bypr("Error while encoding CborBoolean", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo74418b() {
        return m125078a((byte) -32);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        bypx bypx = (bypx) obj;
        if (mo74418b() != bypx.mo74418b()) {
            return mo74418b() - bypx.mo74418b();
        }
        bypo bypo = (bypo) bypx;
        int i2 = 20;
        if (!this.f167356a) {
            i = 20;
        } else {
            i = 21;
        }
        if (bypo.f167356a) {
            i2 = 21;
        }
        return i - i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.f167356a == ((bypo) obj).f167356a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo74418b()), Boolean.valueOf(this.f167356a)});
    }

    public final String toString() {
        return Boolean.toString(this.f167356a);
    }
}
