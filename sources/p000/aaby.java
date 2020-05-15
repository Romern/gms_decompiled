package p000;

import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.util.Locale;
import java.util.Random;

/* renamed from: aaby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaby implements bljm {

    /* renamed from: a */
    private int f27912a = 0;

    /* renamed from: b */
    private int f27913b = 0;

    /* renamed from: c */
    private final aaaw f27914c;

    /* renamed from: d */
    private final aaaw f27915d;

    public aaby(Random random) {
        this.f27914c = new aaaw(random, 14400000);
        this.f27915d = new aaaw(random, 14400000);
    }

    /* renamed from: a */
    private static final bliz m21075a(bljz bljz) {
        bxwc bxwc = bljz.f126717d;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            bliz bliz = (bliz) bxwc.get(i);
            i++;
            if (bliz.f126652d == -1) {
                return bliz;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static final String m21077b(bljz bljz) {
        bliz a = m21075a(bljz);
        return a != null ? a.f126650b : "UNKNOWN";
    }

    /* renamed from: a */
    public final synchronized void mo16706a(int i, int i2) {
        this.f27912a = i;
        this.f27913b = i2;
    }

    /* renamed from: a */
    static String m21076a(bljc bljc) {
        String str;
        String str2 = null;
        if (bljc.mo66589b()) {
            bmxv bmxv = ((aabk) bljc.mo66588a()).f27886b;
            if (bmxv.mo66813a() && (((cimz) bmxv.mo66814b()).f190880a & 32) != 0) {
                zzq zzq = ((cimz) bmxv.mo66814b()).f190881b;
                if (zzq == null) {
                    zzq = zzq.f56322f;
                }
                if ((zzq.f56324a & 1) != 0) {
                    zzp zzp = zzq.f56325b;
                    if (zzp == null) {
                        zzp = zzp.f56314g;
                    }
                    if ((zzp.f56316a & 1) != 0) {
                        str = zzp.f56317b;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                zzr zzr = zzq.f56327d;
                if (zzr == null) {
                    zzr = zzr.f56329d;
                }
                if ((zzr.f56331a & 1) != 0) {
                    str2 = zzr.f56332b;
                }
                return String.format("module=%s, caller=%s", str2, str);
            }
        }
        str = null;
        return String.format("module=%s, caller=%s", str2, str);
    }

    /* renamed from: a */
    public final synchronized void mo16707a(bljz bljz, SparseArray sparseArray) {
        String str;
        if (this.f27912a <= 0) {
            if (this.f27913b <= 0) {
                return;
            }
        }
        bxwc bxwc = bljz.f126717d;
        int size = bxwc.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((bliz) bxwc.get(i2)).f126655g;
        }
        String b = m21077b(bljz);
        int a = this.f27914c.mo16670a(b, bljz.f126719f, 1);
        int a2 = this.f27915d.mo16670a(b, bljz.f126719f, i);
        if (a < this.f27913b) {
            if (a2 < this.f27912a) {
                return;
            }
        }
        this.f27914c.mo16671a(b);
        this.f27915d.mo16671a(b);
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(a);
        objArr[1] = Integer.valueOf(a2);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        long j = bljz.f126719f;
        Locale locale = Locale.US;
        Object[] objArr2 = new Object[3];
        objArr2[0] = m21077b(bljz);
        bliz a3 = m21075a(bljz);
        if (a3 != null) {
            bljf bljf = (bljf) sparseArray.get(a3.f126651c);
            str = bljf != null ? m21076a(bljf.m107236a(blkn.f126753a, bljf, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS)) : "<no context>";
        } else {
            str = "<no root>";
        }
        objArr2[1] = str;
        objArr2[2] = Long.valueOf((elapsedRealtime - j) / 1000);
        sb.append(String.format(locale, "%s, %s, age: %ds, spans:", objArr2));
        bxwc bxwc2 = bljz.f126717d;
        int size2 = bxwc2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            bliz bliz = (bliz) bxwc2.get(i3);
            int i4 = bliz.f126655g;
            int i5 = (int) bliz.f126654f;
            if (i4 < 3) {
                if (i5 < 3) {
                }
            }
            sb.append(String.format(Locale.US, " (%s: %dms CPU, %dms real)", bliz.f126650b, Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        objArr[2] = sb.toString();
        Log.e("GmsTraceAlert", String.format("%d traces used %dms CPU. Sample: %s", objArr));
    }
}
