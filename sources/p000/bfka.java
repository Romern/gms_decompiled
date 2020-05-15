package p000;

import java.io.File;
import java.util.Locale;

/* renamed from: bfka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfka extends bfhp {

    /* renamed from: a */
    final /* synthetic */ bfkb f114257a;

    /* renamed from: b */
    private File f114258b;

    public bfka(bfkb bfkb) {
        this.f114257a = bfkb;
    }

    /* renamed from: a */
    public final void mo61486a() {
        bfft bfft;
        if (this.f114257a.mo61754a() && (bfft = this.f114257a.f114268p) != null) {
            bfft.mo61629c();
        }
    }

    /* renamed from: j */
    public final void mo61504j() {
        bfft bfft;
        if (cfaj.m138529c() && this.f114257a.mo61754a() && (bfft = this.f114257a.f114268p) != null) {
            bfft.mo61628b();
        }
    }

    /* renamed from: a */
    public final void mo61489a(int i, String str) {
        if (this.f114258b == null) {
            this.f114258b = new File(str).getParentFile();
        }
    }

    /* renamed from: a */
    public final void mo61490a(int i, String str, String str2) {
        boolean z;
        if (this.f114257a.mo61754a()) {
            if (this.f114257a.f114267o != -1) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            bfft bfft = this.f114257a.f114268p;
            if (bfft != null) {
                bfft.mo61628b();
            }
            if (str2.length() == 0) {
                new String("Failed to write file: ");
            } else {
                "Failed to write file: ".concat(str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo61491a(bfhd bfhd) {
        boolean z;
        int i;
        bfkb bfkb = this.f114257a;
        if (bfkb.f114268p != null && bfkb.mo61754a()) {
            if (this.f114257a.f114267o != -1) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            long c = this.f114257a.f114049c.mo62776c();
            if (bfhd == null || bfhd.mo61688a() != 0) {
                i = this.f114257a.f114269q ? 2 : 1;
            } else {
                i = 3;
            }
            bfjc.m96991a(this.f114257a.f114048b.mo62760o(), false);
            bfkb bfkb2 = this.f114257a;
            long j = bfkb2.f114267o;
            bfkb2.m97088a(j, j, c, i, true);
            return;
        }
        String valueOf = String.valueOf(this.f114258b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("Skipping onLastSegmentSaved because NLP is disabled. ");
        sb.append(valueOf);
        sb.toString();
        File file = this.f114258b;
        if (file != null) {
            bhcy.m100662a(file);
            Locale locale = Locale.US;
            new Object[1][0] = this.f114258b.getPath();
        }
    }

    /* renamed from: a */
    public final void mo60954a(String str) {
        boolean z;
        if (this.f114257a.mo61754a()) {
            bfkb bfkb = this.f114257a;
            if (bfkb.f114268p == null || bfkb.f114267o == -1) {
                z = false;
            } else {
                z = true;
            }
            bmxy.m108600b(z);
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                new String("Failed to collect: ");
            } else {
                "Failed to collect: ".concat(valueOf);
            }
            bfjc.m96991a(this.f114257a.f114048b.mo62760o(), false);
            bfkb bfkb2 = this.f114257a;
            bfkb2.m97088a(bfkb2.f114267o, -1, bfkb2.f114049c.mo62776c(), 29, true);
        }
    }
}
