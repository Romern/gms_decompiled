package p000;

/* renamed from: dwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwk extends tjx {

    /* renamed from: a */
    public final bxdf f14274a;

    public dwk(bxdf bxdf) {
        sdo.m34959a(bxdf);
        this.f14274a = bxdf;
    }

    /* renamed from: a */
    public static dwk m9635a(long j) {
        bxvd da = bxdf.f163018j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxdf bxdf = (bxdf) da.f164949b;
        bxdf.f163021b = 2;
        int i = bxdf.f163020a | 1;
        bxdf.f163020a = i;
        bxdf.f163020a = 2 | i;
        bxdf.f163022c = j;
        return new dwk((bxdf) da.mo74062i());
    }

    /* renamed from: b */
    public final long mo9781b() {
        return this.f14274a.f163022c;
    }

    /* renamed from: c */
    public final int mo9782c() {
        int a = bxdc.m122593a(this.f14274a.f163023d);
        if (a == 0) {
            a = 1;
        }
        return a - 1;
    }

    /* renamed from: d */
    public final long mo9783d() {
        return this.f14274a.f163027h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(mo9780a()));
        int a = mo9780a();
        if (a == 2) {
            sb.append(" intvl=");
            sb.append(mo9781b());
        } else if (a == 3) {
            sb.append(" intvl=");
            sb.append(mo9781b());
            sb.append(" pri=");
            sb.append(Integer.toString(mo9782c()));
        } else if (a == 6) {
            sb.append(" intvl=");
            sb.append(mo9783d());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static dwk m9636a(long j, int i) {
        bxvd da = bxdf.f163018j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxdf bxdf = (bxdf) da.f164949b;
        bxdf.f163021b = 3;
        int i2 = 1;
        int i3 = bxdf.f163020a | 1;
        bxdf.f163020a = i3;
        bxdf.f163020a = i3 | 2;
        bxdf.f163022c = j;
        int a = bxdc.m122593a(i);
        if (a != 0) {
            i2 = a;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxdf bxdf2 = (bxdf) da.f164949b;
        bxdf2.f163023d = i2 - 1;
        bxdf2.f163020a |= 4;
        return new dwk((bxdf) da.mo74062i());
    }

    /* renamed from: a */
    public final int mo9780a() {
        int a = bxde.m122595a(this.f14274a.f163021b);
        if (a == 0) {
            a = 1;
        }
        return a - 1;
    }
}
