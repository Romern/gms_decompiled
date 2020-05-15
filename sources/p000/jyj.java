package p000;

import android.content.Context;
import java.io.File;

/* renamed from: jyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jyj {

    /* renamed from: a */
    public static final sek f23524a = ght.m13171a("MetricsLogger");

    /* renamed from: b */
    public final jyh f23525b;

    /* renamed from: c */
    public final ilg f23526c;

    /* renamed from: d */
    private final Context f23527d;

    public jyj(Context context) {
        this.f23527d = context.getApplicationContext();
        if (jyh.f23521b == null) {
            jyh.f23521b = new jyh(context);
        }
        this.f23525b = jyh.f23521b;
        this.f23526c = ilv.m15681b(this.f23527d);
    }

    /* renamed from: a */
    public static final String m17509a(Context context) {
        String valueOf = String.valueOf(context.getFilesDir());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append(valueOf);
        sb.append("/auth_account_metrics");
        return sb.toString();
    }

    /* renamed from: c */
    private final void m17510c(boct boct) {
        if (jyi.f23523a == null) {
            jyi.f23523a = new jyi();
        }
        aucb E = avtz.m79338b(this.f23527d).mo24673E();
        E.mo50373a(new jyd(this, boct));
        E.mo50372a(new jye(this));
        E.mo50370a(new jyf(this));
    }

    /* renamed from: b */
    public final void mo14225b(boct boct) {
        if (bjbq.m103166a(this.f23527d)) {
            m17510c(boct);
        }
    }

    /* renamed from: a */
    public final void mo14224a(boct boct) {
        if (!bjbq.m103166a(this.f23527d)) {
            bjbm a = bjbm.m103160a(this.f23527d);
            String a2 = m17509a(this.f23527d);
            bqgj b = snp.m35704b(9);
            bqfl.m112747c(bqga.m112775a((Object) null));
            bjbp a3 = bjbp.m103162a(a.f122475a, b);
            if (a2 != null) {
                File file = new File(a3.f122482c, a2);
                if (file.exists() || file.mkdirs()) {
                    a3.f122481b = file;
                } else {
                    bjbu bjbu = bjbp.f122479a;
                    String valueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    sb.append("Unable to create subdirectory = ");
                    sb.append(valueOf);
                    bjbu.mo64983b(sb.toString());
                }
            }
            bqga.m112781a(a3.mo64976a(boct.mo73642k()), new jyg(this), snp.m35704b(9));
            return;
        }
        sre.m36087g(this.f23527d);
        m17510c(boct);
    }
}
