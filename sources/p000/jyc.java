package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: jyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jyc {

    /* renamed from: d */
    private static final sek f23505d = ght.m13171a("MetricsHelper");

    /* renamed from: e */
    private static final imr f23506e = imr.m15727a("MetricsHelper.event");

    /* renamed from: f */
    private static final imr f23507f = imr.m15727a("MetricsHelper.last_resume_time");

    /* renamed from: g */
    private static final imr f23508g = imr.m15727a("MetricsHelper.foreground_duration");

    /* renamed from: a */
    public final bxvd f23509a;

    /* renamed from: b */
    public final bxvd f23510b = boco.f132581g.mo74144da();

    /* renamed from: c */
    public bxvd f23511c;

    /* renamed from: h */
    private final jxe f23512h;

    /* renamed from: i */
    private final jyb f23513i;

    /* renamed from: j */
    private final jyj f23514j;

    /* renamed from: k */
    private boolean f23515k = false;

    public jyc(jxe jxe, jyb jyb, jyj jyj) {
        byte[] bArr;
        this.f23512h = jxe;
        this.f23513i = jyb;
        this.f23514j = jyj;
        this.f23509a = boct.f132600I.mo74144da();
        if (this.f23512h.mo14202g().mo13149b(f23506e) && (bArr = (byte[]) this.f23512h.mo14202g().mo13146a(f23506e)) != null && bArr.length > 0) {
            try {
                this.f23509a.mo73633b(bArr);
            } catch (bxwf e) {
                f23505d.mo25410a((Throwable) e);
            }
        }
        boct boct = (boct) this.f23509a.f164949b;
        if ((boct.f132610a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
            bxvd bxvd = this.f23510b;
            boco boco = boct.f132623n;
            bxvd.mo73625a((bxvk) (boco == null ? boco.f132581g : boco));
        }
        boct boct2 = (boct) this.f23509a.f164949b;
        if ((boct2.f132610a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
            bofn bofn = boct2.f132625p;
            bofn = bofn == null ? bofn.f132923f : bofn;
            bxvd bxvd2 = (bxvd) bofn.mo74142c(5);
            bxvd2.mo73625a((bxvk) bofn);
            this.f23511c = bxvd2;
        }
    }

    /* renamed from: a */
    public static jyc m17496a(Context context, jxe jxe, jyb jyb) {
        return new jyc(jxe, jyb, new jyj(context));
    }

    /* renamed from: b */
    public final void mo14220b() {
        long longValue = ((Long) this.f23512h.mo14202g().mo13147a(f23507f, -1L)).longValue();
        if (longValue != -1) {
            long longValue2 = ((Long) this.f23512h.mo14202g().mo13147a(f23508g, 0L)).longValue() + (SystemClock.elapsedRealtime() - longValue);
            this.f23512h.mo14202g().mo13148b(f23508g, Long.valueOf(longValue2));
            this.f23512h.mo14202g().f21367a.remove(f23507f.f21366a);
            bxvd bxvd = this.f23510b;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boco boco = (boco) bxvd.f164949b;
            boco boco2 = boco.f132581g;
            boco.f132583a |= 4;
            boco.f132586d = longValue2;
        }
        bxvd bxvd2 = this.f23509a;
        boco boco3 = (boco) this.f23510b.mo74062i();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        boct boct = (boct) bxvd2.f164949b;
        boct boct2 = boct.f132600I;
        boco3.getClass();
        boct.f132623n = boco3;
        boct.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bxvd bxvd3 = this.f23511c;
        if (bxvd3 != null) {
            bxvd bxvd4 = this.f23509a;
            bofn bofn = (bofn) bxvd3.mo74062i();
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            boct boct3 = (boct) bxvd4.f164949b;
            bofn.getClass();
            boct3.f132625p = bofn;
            boct3.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        }
        this.f23512h.mo14202g().mo13148b(f23506e, ((boct) this.f23509a.mo74062i()).mo73642k());
    }

    /* renamed from: c */
    public final void mo14223c() {
        if (!this.f23515k) {
            this.f23515k = true;
            bxvd bxvd = this.f23509a;
            boco boco = (boco) this.f23510b.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boct boct = (boct) bxvd.f164949b;
            boct boct2 = boct.f132600I;
            boco.getClass();
            boct.f132623n = boco;
            boct.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            bxvd bxvd2 = this.f23511c;
            if (bxvd2 != null) {
                bxvd bxvd3 = this.f23509a;
                bofn bofn = (bofn) bxvd2.mo74062i();
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                boct boct3 = (boct) bxvd3.f164949b;
                bofn.getClass();
                boct3.f132625p = bofn;
                boct3.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            }
            jyb jyb = this.f23513i;
            if (jyb == null || jyb.mo14094bb()) {
                if (f23505d.mo19637a(3)) {
                    f23505d.mo25412b("Sending Clearcut event:\n%s", new String(((boct) this.f23509a.mo74062i()).mo73642k()));
                }
                this.f23514j.mo14224a((boct) this.f23509a.mo74062i());
            }
        }
    }

    /* renamed from: a */
    public final void mo14217a() {
        this.f23512h.mo14202g().mo13148b(f23507f, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* renamed from: a */
    public final void mo14218a(int i) {
        bxvd bxvd = this.f23510b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boco boco = (boco) bxvd.f164949b;
        boco boco2 = boco.f132581g;
        boco.f132583a |= 2;
        boco.f132585c = i;
    }

    /* renamed from: a */
    public final void mo14219a(String str) {
        bxvd bxvd = this.f23510b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boco boco = (boco) bxvd.f164949b;
        boco boco2 = boco.f132581g;
        str.getClass();
        boco.f132583a |= 1;
        boco.f132584b = str;
    }

    /* renamed from: b */
    public final void mo14221b(int i) {
        bxvd bxvd = this.f23510b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boco boco = (boco) bxvd.f164949b;
        boco boco2 = boco.f132581g;
        boco.f132583a |= 8;
        boco.f132587e = i;
    }

    /* renamed from: b */
    public final void mo14222b(String str) {
        bxvd bxvd = this.f23510b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boco boco = (boco) bxvd.f164949b;
        boco boco2 = boco.f132581g;
        str.getClass();
        boco.f132583a |= 16;
        boco.f132588f = str;
    }
}
