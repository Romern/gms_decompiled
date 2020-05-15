package p000;

/* renamed from: smd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class smd extends smj {

    /* renamed from: f */
    private final String f44728f;

    public smd(String str, int i, int i2, int i3) {
        super(i, i2, i3);
        this.f44728f = str;
        int[] iArr = smj.f44758a;
        for (int i4 : iArr) {
            this.f44760b.put(Integer.valueOf(i4), new smc(this.f44728f, i, i2, i4, i3));
        }
    }

    /* renamed from: a */
    public final smc mo25747b(int i) {
        return (smc) super.mo25747b(i);
    }

    public final String toString() {
        smc a = mo25747b(-1);
        return a + super.toString();
    }

    /* renamed from: a */
    public final void mo25746a(smi smi) {
        if (mo25748b(smi)) {
            smc smc = (smc) smi;
            mo25747b(-1).mo25738a(smc);
            mo25747b(smc.f44750n).mo25738a(smc);
        }
    }

    /* renamed from: b */
    public final boolean mo25748b(smi smi) {
        if (!(smi instanceof smc)) {
            return false;
        }
        smc smc = (smc) smi;
        int i = smc.f44750n;
        if (!this.f44728f.equals(smc.f44719b) || this.f44761c != smc.f44748l || this.f44762d != smc.f44749m || this.f44763e != smc.f44751o || i < 0) {
            return false;
        }
        if (i <= 3 || i == 7) {
            return true;
        }
        return false;
    }
}
