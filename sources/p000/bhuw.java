package p000;

import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;

/* renamed from: bhuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhuw implements bhvr {

    /* renamed from: a */
    final /* synthetic */ bhux f119660a;

    /* renamed from: b */
    private final long f119661b;

    public bhuw(bhux bhux, long j) {
        this.f119660a = bhux;
        this.f119661b = j;
    }

    /* renamed from: a */
    public final void mo64330a() {
        this.f119660a.f119669e.mo64318a(5, 5, 1, 0);
        bhwp a = bhuj.m101555a();
        StringBuilder sb = new StringBuilder(58);
        sb.append("Failed to download model weights. Status code: 7");
        a.mo64360b(sb.toString());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f119661b;
        bhuk bhuk = this.f119660a.f119669e;
        long j2 = elapsedRealtime - j;
        bpnx b = bicx.m101968b();
        bxvd bxvd = (bxvd) b.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) b);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx = (bpnx) bxvd.f164949b;
        bpnx bpnx2 = bpnx.f138442j;
        int i = 3;
        bpnx.f138446c = 3;
        bpnx.f138444a |= 2;
        bicx bicx = (bicx) bhuk;
        int c = bicx.mo64536c();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx3 = (bpnx) bxvd.f164949b;
        bpnx3.f138448e = c - 1;
        int i2 = bpnx3.f138444a | 8;
        bpnx3.f138444a = i2;
        bpnx3.f138444a = i2 | 4;
        bpnx3.f138447d = (int) j2;
        int d = bicx.mo64537d();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx4 = (bpnx) bxvd.f164949b;
        bpnx4.f138451h = d - 1;
        bpnx4.f138444a |= 128;
        if (!cghh.m145424e()) {
            i = 2;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx5 = (bpnx) bxvd.f164949b;
        bpnx5.f138452i = i - 1;
        bpnx5.f138444a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bicx.mo64534a(bicx.mo64532a((bpnx) bxvd.mo74062i()));
        this.f119660a.f119666b = 0;
    }

    /* renamed from: a */
    public final void mo64331a(bvmm bvmm) {
        bhun bhun;
        int i;
        bhuj.m101555a();
        int i2 = bvmm.f164961ai;
        if (i2 == -1) {
            i2 = bxxm.f165037a.mo74228a(bvmm).mo74223b(bvmm);
            bvmm.f164961ai = i2;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Downloaded models. Bytes: ");
        sb.append(i2);
        sb.toString();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f119661b;
        bhuk bhuk = this.f119660a.f119669e;
        long j2 = elapsedRealtime - j;
        int i3 = bvmm.f164961ai;
        if (i3 == -1) {
            i3 = bxxm.f165037a.mo74228a(bvmm).mo74223b(bvmm);
            bvmm.f164961ai = i3;
        }
        bpnx b = bicx.m101968b();
        bxvd bxvd = (bxvd) b.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) b);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx = (bpnx) bxvd.f164949b;
        bpnx bpnx2 = bpnx.f138442j;
        bpnx.f138446c = 1;
        bpnx.f138444a |= 2;
        bicx bicx = (bicx) bhuk;
        int c = bicx.mo64536c();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx3 = (bpnx) bxvd.f164949b;
        bpnx3.f138448e = c - 1;
        int i4 = bpnx3.f138444a | 8;
        bpnx3.f138444a = i4;
        bpnx3.f138444a = i4 | 4;
        bpnx3.f138447d = (int) j2;
        bxvd da = bpoi.f138528c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpoi bpoi = (bpoi) da.f164949b;
        bpoi.f138530a |= 1;
        bpoi.f138531b = i3;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx4 = (bpnx) bxvd.f164949b;
        bpoi bpoi2 = (bpoi) da.mo74062i();
        bpoi2.getClass();
        bpnx4.f138450g = bpoi2;
        bpnx4.f138444a |= 64;
        int d = bicx.mo64537d();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx5 = (bpnx) bxvd.f164949b;
        bpnx5.f138451h = d - 1;
        bpnx5.f138444a |= 128;
        int i5 = !cghh.m145424e() ? 2 : 3;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx6 = (bpnx) bxvd.f164949b;
        bpnx6.f138452i = i5 - 1;
        bpnx6.f138444a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bicx.mo64534a(bicx.mo64532a((bpnx) bxvd.mo74062i()));
        try {
            if (bvmm.f156762c.size() == 1) {
                bvpf[] bvpfArr = {(bvpf) bvmm.f156762c.get(0)};
                bhun a = bhuy.m101591a(bvpfArr, bicy.m101985d());
                bhux bhux = this.f119660a;
                if (a != null && ((bhun = bhux.f119668d) == null || (i = bhun.f119646e) == 0 || a.f119646e != i)) {
                    bhux.f119669e.mo64318a(5, 2, 2, a.f119646e);
                    if (!cgfo.m145040b()) {
                        this.f119660a.mo64333a(a);
                        bhux bhux2 = this.f119660a;
                        bhux2.f119670f.execute(new bhur(bhux2, bvpfArr));
                        return;
                    }
                    this.f119660a.mo64335a(bvpfArr);
                    bhux bhux3 = this.f119660a;
                    bhux3.mo64334a(new bhuv(bhux3, 0));
                    return;
                }
                bhux.f119670f.execute(new bhuq(bhux));
                return;
            }
            throw new IOException("Invalid response");
        } catch (IOException e) {
            this.f119660a.f119669e.mo64318a(5, 4, 1, 0);
            bhuj.m101555a().mo64360b("Failed to parse downloaded model weights");
            this.f119660a.f119666b = 0;
        }
    }
}
