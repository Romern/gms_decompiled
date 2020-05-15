package p000;

import java.io.File;

/* renamed from: atek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atek {

    /* renamed from: a */
    public static final srn f90187a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public final askf f90188b;

    /* renamed from: c */
    public final int f90189c;

    public atek(askf askf, int i) {
        this.f90188b = askf;
        this.f90189c = i;
    }

    /* renamed from: a */
    public final File mo49899a() {
        File file = new File(this.f90188b.f89126d.getFilesDir(), "quick_access_wallet");
        file.mkdirs();
        return file;
    }

    /* renamed from: b */
    public final String[] mo49900b() {
        askf askf = this.f90188b;
        return new String[]{askf.f89123a, askf.f89125c, String.valueOf(this.f90189c)};
    }
}
