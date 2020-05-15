package p000;

import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.HashMap;

/* renamed from: bhvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhvt {

    /* renamed from: a */
    final /* synthetic */ bhvu f119701a;

    /* renamed from: b */
    private final int f119702b;

    /* renamed from: c */
    private final long f119703c;

    public bhvt(bhvu bhvu, long j, int i) {
        this.f119701a = bhvu;
        this.f119703c = j;
        this.f119702b = i;
    }

    /* renamed from: a */
    public final void mo64345a(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f119703c;
        bhuk bhuk = this.f119701a.f119704a;
        int i = this.f119702b;
        bicx bicx = (bicx) bhuk;
        bpnx a = bicx.mo64529a((int) (elapsedRealtime - j));
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx = (bpnx) bxvd.f164949b;
        bpnx bpnx2 = bpnx.f138442j;
        int i2 = 3;
        bpnx.f138446c = 3;
        bpnx.f138444a |= 2;
        bpoj bpoj = bpnx.f138449f;
        if (bpoj == null) {
            bpoj = bpoj.f138532f;
        }
        bxvd bxvd2 = (bxvd) bpoj.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) bpoj);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bpoj bpoj2 = (bpoj) bxvd2.f164949b;
        int i3 = bpoj2.f138534a | 1;
        bpoj2.f138534a = i3;
        bpoj2.f138535b = i;
        bpoj2.f138534a = i3 | 8;
        bpoj2.f138538e = z;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx3 = (bpnx) bxvd.f164949b;
        bpoj bpoj3 = (bpoj) bxvd2.mo74062i();
        bpoj3.getClass();
        bpnx3.f138449f = bpoj3;
        bpnx3.f138444a |= 16;
        if (!cghh.m145423d()) {
            i2 = 2;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx4 = (bpnx) bxvd.f164949b;
        bpnx4.f138452i = i2 - 1;
        bpnx4.f138444a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bicx.mo64534a(bicx.mo64532a((bpnx) bxvd.mo74062i()));
    }

    /* renamed from: a */
    public final void mo64346a(bvoa[] bvoaArr, bvnp[] bvnpArr, boolean z) {
        int length;
        bvoa[] bvoaArr2 = bvoaArr;
        bvnp[] bvnpArr2 = bvnpArr;
        boolean z2 = z;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f119703c;
        int i = 0;
        for (bvoa bvoa : bvoaArr2) {
            int i2 = bvoa.f164961ai;
            if (i2 == -1) {
                i2 = bxxm.f165037a.mo74228a(bvoa).mo74223b(bvoa);
                bvoa.f164961ai = i2;
            }
            i += i2;
        }
        int i3 = 0;
        while (true) {
            length = bvnpArr2.length;
            if (i3 >= length) {
                break;
            }
            bvnp bvnp = bvnpArr2[i3];
            int i4 = bvnp.f164961ai;
            if (i4 == -1) {
                i4 = bxxm.f165037a.mo74228a(bvnp).mo74223b(bvnp);
                bvnp.f164961ai = i4;
            }
            i += i4;
            i3++;
        }
        bhuk bhuk = this.f119701a.f119704a;
        int i5 = this.f119702b;
        int length2 = bvoaArr2.length;
        bicx bicx = (bicx) bhuk;
        bpnx a = bicx.mo64529a((int) elapsedRealtime);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx = (bpnx) bxvd.f164949b;
        bpnx bpnx2 = bpnx.f138442j;
        int i6 = 1;
        bpnx.f138446c = 1;
        bpnx.f138444a |= 2;
        bxvd da = bpoj.f138532f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpoj bpoj = (bpoj) da.f164949b;
        int i7 = bpoj.f138534a | 1;
        bpoj.f138534a = i7;
        bpoj.f138535b = i5;
        int i8 = i7 | 2;
        bpoj.f138534a = i8;
        bpoj.f138536c = length2;
        int i9 = i8 | 4;
        bpoj.f138534a = i9;
        bpoj.f138537d = i;
        bpoj.f138534a = i9 | 8;
        bpoj.f138538e = z2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx3 = (bpnx) bxvd.f164949b;
        bpoj bpoj2 = (bpoj) da.mo74062i();
        bpoj2.getClass();
        bpnx3.f138449f = bpoj2;
        bpnx3.f138444a |= 16;
        int i10 = !cghh.m145423d() ? 2 : 3;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpnx bpnx4 = (bpnx) bxvd.f164949b;
        bpnx4.f138452i = i10 - 1;
        bpnx4.f138444a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bicx.mo64534a(bicx.mo64532a((bpnx) bxvd.mo74062i()));
        bhvu bhvu = this.f119701a;
        bhty bhty = bhvu.f119705b;
        if (bhty != null) {
            bhty.f119600o += i;
        }
        bhso bhso = bhvu.f119706c;
        if (bhso != null) {
            bhtp bhtp = bhso.f119477b;
            HashMap hashMap = new HashMap();
            int i11 = 0;
            while (i11 < length) {
                bvnp bvnp2 = bvnpArr2[i11];
                if ((bvnp2.f156958a & i6) != 0) {
                    long[] jArr = new long[bvnp2.f156960c.size()];
                    for (int i12 = 0; i12 < bvnp2.f156960c.size(); i12++) {
                        jArr[i12] = bvnp2.f156960c.mo74160a(i12);
                    }
                    hashMap.put(Long.valueOf(bvnp2.f156959b), jArr);
                }
                i11++;
                i6 = 1;
            }
            bhtl bhtl = (bhtl) bhtp;
            bhtl.f119556g.execute(new bhte(bhtl, hashMap, z2));
            bhtp bhtp2 = bhso.f119477b;
            HashMap hashMap2 = new HashMap();
            for (bvoa bvoa2 : bvoaArr2) {
                if ((bvoa2.f156996a & i6) != 0) {
                    bvni bvni = bvoa2.f156997b;
                    if (bvni == null) {
                        bvni = bvni.f156861b;
                    }
                    hashMap2.put(Long.valueOf(bvni.f156863a), bvoa2);
                }
            }
            bhtl bhtl2 = (bhtl) bhtp2;
            bhtl2.f119556g.execute(new bhtf(bhtl2, hashMap2, z2));
            if (!z2 && bvnpArr2.length > 0 && bvoaArr2.length > 0 && bhso.f119481f < 2) {
                bhso.mo64223a(bhso.f119480e, bhso.f119479d, bhsv.f119501c);
            }
        }
    }
}
