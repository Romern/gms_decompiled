package p000;

/* renamed from: mfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mfo {

    /* renamed from: a */
    public int f33582a;

    /* renamed from: b */
    String f33583b;

    /* renamed from: c */
    int f33584c;

    /* renamed from: d */
    final /* synthetic */ mfp f33585d;

    public mfo(mfp mfp) {
        this.f33585d = mfp;
        m24962b();
    }

    /* renamed from: b */
    private final void m24962b() {
        mo19918a(0);
        this.f33583b = null;
    }

    /* renamed from: a */
    public final void mo19917a() {
        if (this.f33582a != 0) {
            lvn lvn = mfp.f33586a;
            int i = this.f33582a;
            String str = this.f33583b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append("finishBackup from: ");
            sb.append(i);
            sb.append(", package: ");
            sb.append(str);
            lvn.mo25412b(sb.toString(), new Object[0]);
            if (this.f33582a == 1 && this.f33584c != 0) {
                mfp.f33586a.mo25414c("Deleting partial backup data file: %s due to error: %d", this.f33583b, Integer.valueOf(this.f33584c));
                this.f33585d.mo19922b(this.f33583b).delete();
            }
            mfr.m24972a(this.f33585d.f33587b, this.f33582a, this.f33583b, this.f33584c);
            m24962b();
            return;
        }
        lvn lvn2 = mfp.f33586a;
        int i2 = this.f33582a;
        StringBuilder sb2 = new StringBuilder(74);
        sb2.append("finishBackup from: ");
        sb2.append(i2);
        sb2.append("; initializeDevice has cleared data already.");
        lvn2.mo25412b(sb2.toString(), new Object[0]);
    }

    /* renamed from: a */
    public final void mo19918a(int i) {
        lvn lvn = mfp.f33586a;
        int i2 = this.f33582a;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Moved from state ");
        sb.append(i2);
        sb.append(" to ");
        sb.append(i);
        lvn.mo25412b(sb.toString(), new Object[0]);
        this.f33582a = i;
    }

    /* renamed from: a */
    public final void mo19919a(String str) {
        int i = this.f33582a;
        if (i != 0 && (i != 3 || !"@pm@".equals(str))) {
            mfp.f33586a.mo25418e("Movement to illegal state performBackup.", new Object[0]);
        }
        this.f33583b = str;
        this.f33584c = 0;
        mo19918a(1);
    }
}
