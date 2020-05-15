package p000;

import android.content.SharedPreferences;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zun {

    /* renamed from: a */
    private final SharedPreferences f55943a;

    /* renamed from: b */
    private final zum f55944b;

    /* renamed from: c */
    private final zsr f55945c;

    static {
        zvt.m46581a();
    }

    public zun(SharedPreferences sharedPreferences, zum zum, zsr zsr) {
        this.f55943a = sharedPreferences;
        this.f55944b = zum;
        this.f55945c = zsr;
    }

    /* renamed from: a */
    private static int m46507a(zuu zuu, zra zra, long j) {
        try {
            bngx e = zra.mo31357e(j);
            if (e.isEmpty()) {
                return 0;
            }
            cabb cabb = (cabb) zuu.mo30704a((List) e).get((long) ((int) ceab.m135732e()), TimeUnit.SECONDS);
            bxvw bxvw = cabb.f172408b;
            bxvw bxvw2 = cabb.f172409c;
            zra.mo31344a(bxvw);
            zra.mo31348a(bnic.m109495a((Collection) bxvw2));
            return e.size();
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e2) {
            throw yqh.m44583a(e2);
        }
    }

    /* renamed from: b */
    private final int m46508b(zuu zuu, zre zre) {
        String string = this.f55943a.getString("PAGE_TOKEN", null);
        while (true) {
            try {
                yre yre = (yre) zuu.mo30703a(string).get((long) ((int) ceab.m135732e()), TimeUnit.SECONDS);
                yre.f54482b.size();
                yre.f54481a.size();
                bngx bngx = yre.f54481a;
                bngx bngx2 = yre.f54482b;
                String str = yre.f54486f;
                int size = bngx2.size();
                for (int i = 0; i < size; i++) {
                    cadz cadz = (cadz) bngx2.get(i);
                    try {
                        zre.mo31393a(cadz, 16);
                        this.f55944b.mo31530a(cadz);
                    } catch (Exception e) {
                    }
                }
                int size2 = bngx.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    cadz cadz2 = (cadz) bngx.get(i2);
                    try {
                        cadz a = zpc.m45934a(cadz2, zre, yym.m45036a(cadz2));
                        if (a == null) {
                            zre.mo31394b(cadz2, 16);
                            this.f55944b.mo31530a(cadz2);
                        } else {
                            zre.mo31395c(cadz2, 16);
                            this.f55944b.mo31530a(a);
                        }
                    } catch (Exception e2) {
                    }
                }
                this.f55943a.edit().putString("PAGE_TOKEN", str).apply();
                if (!yre.mo30686a()) {
                    return yre.f54482b.size() + yre.f54481a.size();
                }
                string = str;
            } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                throw yqh.m44583a(e3);
            }
        }
    }

    /* renamed from: a */
    public final void mo31532a(zuu zuu, zre zre) {
        long currentTimeMillis = System.currentTimeMillis();
        int a = m46507a(zuu, zre, currentTimeMillis);
        long currentTimeMillis2 = System.currentTimeMillis();
        long currentTimeMillis3 = System.currentTimeMillis();
        int b = m46508b(zuu, zre);
        long currentTimeMillis4 = System.currentTimeMillis();
        zsr zsr = this.f55945c;
        bxvd bxvd = zsr.f55829a;
        int i = ((bpgw) bxvd.f164949b).f137587o + a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpgw bpgw = (bpgw) bxvd.f164949b;
        bpgw bpgw2 = bpgw.f137569C;
        bpgw.f137573a |= 8192;
        bpgw.f137587o = i;
        bxvd bxvd2 = zsr.f55829a;
        int i2 = ((bpgw) bxvd2.f164949b).f137588p + b;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bpgw bpgw3 = (bpgw) bxvd2.f164949b;
        bpgw3.f137573a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        bpgw3.f137588p = i2;
        long j = currentTimeMillis2 - currentTimeMillis;
        bxvd bxvd3 = zsr.f55829a;
        int i3 = (int) (currentTimeMillis4 - currentTimeMillis3);
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bpgw bpgw4 = (bpgw) bxvd3.f164949b;
        bpgw4.f137573a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        bpgw4.f137592t = i3;
        bxvd bxvd4 = zsr.f55829a;
        int i4 = (int) j;
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        bpgw bpgw5 = (bpgw) bxvd4.f164949b;
        bpgw5.f137573a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        bpgw5.f137591s = i4;
    }
}
