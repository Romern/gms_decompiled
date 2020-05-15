package p000;

import android.util.Log;
import java.util.Arrays;

/* renamed from: aamv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamv {

    /* renamed from: a */
    public final /* synthetic */ aamx f28503a;

    /* renamed from: b */
    public final bxvd f28504b;

    /* renamed from: c */
    private final aanv f28505c;

    public aamv(aamx aamx, bxvd bxvd) {
        aanv aanv;
        this.f28503a = aamx;
        this.f28504b = bxvd;
        aait aait = (aait) bxvd.mo74062i();
        int r = (int) cedc.f182364a.mo6606a().mo78877r();
        if (r == 0) {
            aanv = new aanw(aait);
        } else if (r != 1) {
            Log.e("GCM", "Invalid heartbeat algorithm selection. Using default.");
            aanv = new aanw(aait);
        } else {
            aanv = new aant(aait);
        }
        this.f28505c = aanv;
    }

    /* renamed from: a */
    public final int mo17066a() {
        return this.f28505c.mo17152a();
    }

    /* renamed from: b */
    public final long mo17068b() {
        return ((aait) this.f28504b.f164949b).f28223c;
    }

    /* renamed from: c */
    public final aait mo17069c() {
        bxvd bxvd = this.f28504b;
        bxvd.mo73625a((GeneratedMessageLite) this.f28505c.mo17154b());
        return (aait) bxvd.mo74062i();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aamv) {
            return mo17069c().equals(((aamv) obj).mo17069c());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo17069c()});
    }

    public final String toString() {
        aait aait = (aait) this.f28504b.f164949b;
        int i = aait.f28228h;
        String str = aait.f28222b;
        String valueOf = String.valueOf(this.f28505c);
        long j = ((aait) this.f28504b.f164949b).f28229i;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 83 + String.valueOf(valueOf).length());
        sb.append("Network type: ");
        sb.append(i);
        sb.append("\nId: ");
        sb.append(str);
        sb.append("\nHB algorithm: ");
        sb.append(valueOf);
        sb.append("\nReconnect delay: ");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public final synchronized void mo17067a(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        bxvd bxvd = this.f28504b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aait aait = (aait) bxvd.f164949b;
        aait aait2 = aait.f28219k;
        aait.f28221a |= 2;
        aait.f28223c = currentTimeMillis;
        this.f28505c.mo17153a(i);
    }
}
