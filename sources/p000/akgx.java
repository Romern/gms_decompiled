package p000;

import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: akgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class akgx implements akdt {

    /* renamed from: a */
    private boolean f71920a;

    /* renamed from: d */
    public final ShareTarget f71921d;

    /* renamed from: e */
    public final ajud f71922e;

    /* renamed from: f */
    public final Map f71923f = new C1223np();

    /* renamed from: g */
    public final BigDecimal f71924g;

    /* renamed from: h */
    public BigDecimal f71925h;

    /* renamed from: i */
    final /* synthetic */ akgy f71926i;

    public akgx(akgy akgy, ShareTarget shareTarget, ajud ajud) {
        this.f71926i = akgy;
        this.f71920a = false;
        this.f71921d = shareTarget;
        this.f71922e = ajud;
        this.f71925h = BigDecimal.ZERO;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        List b = shareTarget.mo44499b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            Attachment attachment = (Attachment) b.get(i);
            long b2 = akgy.mo39393b(attachment);
            if (b2 == -1) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68432a("akgx", "<init>", 3619, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Failed to retrieve payload for: %s", attachment);
            } else {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a("akgx", "<init>", 3622, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68415a("Tracking payload %d", b2);
                Map map = this.f71923f;
                Long valueOf = Long.valueOf(b2);
                attachment.mo44383a();
                map.put(valueOf, new akgw());
                bigDecimal = bigDecimal.add(new BigDecimal(Long.toString(attachment.mo44383a())));
            }
        }
        this.f71924g = bigDecimal;
    }

    /* renamed from: c */
    private final void m59535c() {
        float f;
        Iterator it = this.f71923f.values().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((akgw) it.next()).f71919b != 2) {
                    break;
                }
            } else {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                bnsl.mo68432a("akgx", "c", 3807, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("All payloads are complete");
                if (!mo39352a()) {
                    for (akgw akgw : this.f71923f.values()) {
                        akgw.f71919b = 3;
                    }
                } else {
                    mo39367a(2);
                    ajud ajud = this.f71922e;
                    ShareTarget shareTarget = this.f71921d;
                    ajub ajub = new ajub(6);
                    ajub.mo38917a(100.0f);
                    ajud.mo38711a(shareTarget, ajub.mo38916a());
                    mo39368b(2);
                    return;
                }
            }
        }
        for (akgw akgw2 : this.f71923f.values()) {
            if (akgw2.f71919b == 4) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a("akgx", "c", 3821, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Payloads cancelled");
                mo39353b();
                mo39367a(4);
                this.f71922e.mo38711a(this.f71921d, new ajub(9).mo38916a());
                mo39368b(3);
                return;
            }
        }
        for (akgw akgw3 : this.f71923f.values()) {
            if (akgw3.f71919b == 3) {
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl3.mo68432a("akgx", "c", 3831, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Payloads failed");
                mo39353b();
                mo39367a(3);
                this.f71922e.mo38711a(this.f71921d, new ajub(7).mo38916a());
                mo39368b(4);
                return;
            }
        }
        if (!((Attachment) this.f71921d.mo44499b().get(0)).mo44387e()) {
            this.f71925h = BigDecimal.ZERO;
            for (akgw akgw4 : this.f71923f.values()) {
                this.f71925h = this.f71925h.add(new BigDecimal(Long.toString(akgw4.f71918a)));
            }
            f = this.f71925h.multiply(new BigDecimal("100")).divide(this.f71924g, 1).floatValue();
        } else {
            f = 50.0f;
        }
        srn srn = ajvp.f71371a;
        ajud ajud2 = this.f71922e;
        ShareTarget shareTarget2 = this.f71921d;
        ajub ajub2 = new ajub(5);
        ajub2.mo38917a(f);
        ajud2.mo38711a(shareTarget2, ajub2.mo38916a());
    }

    /* renamed from: a */
    public final void mo39367a(int i) {
        String str;
        ShareTarget shareTarget = this.f71921d;
        if (shareTarget.f81036i) {
            str = this.f71926i.mo39413j(shareTarget);
        } else {
            str = this.f71926i.mo39418m(shareTarget);
        }
        if (str == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akgx", "a", 3675, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to disconnect. No endpointId found for ShareTarget %s", this.f71921d);
        } else if (i != 2) {
            this.f71926i.f71940g.mo39295b(str);
        } else if (!this.f71921d.f81036i) {
            srn srn = ajvp.f71371a;
            ahfi b = ahfi.m55635b(new akgt(this, str), cfov.f185185a.mo6606a().mo82297aF(), this.f71926i.f71937d);
            akdd o = this.f71926i.mo39422o(this.f71921d);
            if (o != null) {
                o.mo39250a(new akgu(this, b));
            }
        } else {
            this.f71926i.f71940g.mo39295b(str);
        }
    }

    /* renamed from: a */
    public boolean mo39352a() {
        return true;
    }

    /* renamed from: b */
    public void mo39353b() {
        akgy.m59565l();
    }

    /* renamed from: b */
    public final void mo39368b(int i) {
        if (!this.f71920a) {
            double uptimeMillis = (double) (SystemClock.uptimeMillis() - this.f71926i.f71955v);
            Double.isNaN(uptimeMillis);
            double d = uptimeMillis / 1000.0d;
            double doubleValue = this.f71925h.divide(new BigDecimal(1048576)).divide(BigDecimal.valueOf(Math.max(d, 0.001d)), 3, RoundingMode.DOWN).doubleValue();
            if (this.f71921d.f81036i) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                bnsl.mo68432a("akgx", "b", 3788, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                String a = bvje.m121170a(i);
                if (i != 0) {
                    bnsl.mo68425a("Incoming payload transfer has completed with status %s in %.2f seconds = %.2f MB/s", a, Double.valueOf(d), Double.valueOf(doubleValue));
                    akgy akgy = this.f71926i;
                    ajvg ajvg = akgy.f71948o;
                    long j = akgy.f71954u;
                    long longValue = this.f71925h.longValue();
                    bxvd d2 = ajvh.m59107d(19);
                    bxvd da = bvfm.f155885e.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvfm bvfm = (bvfm) da.f164949b;
                    int i2 = bvfm.f155887a | 1;
                    bvfm.f155887a = i2;
                    bvfm.f155888b = j;
                    int i3 = i2 | 2;
                    bvfm.f155887a = i3;
                    bvfm.f155889c = longValue;
                    int i4 = i - 1;
                    if (i != 0) {
                        bvfm.f155890d = i4;
                        bvfm.f155887a = i3 | 4;
                        bvfm bvfm2 = (bvfm) da.mo74062i();
                        if (d2.f164950c) {
                            d2.mo74035c();
                            d2.f164950c = false;
                        }
                        bvgd bvgd = (bvgd) d2.f164949b;
                        bvgd bvgd2 = bvgd.f155960B;
                        bvfm2.getClass();
                        bvgd.f155983t = bvfm2;
                        bvgd.f155964a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                        ajvg.mo38956a(new ajuz((bvgd) d2.mo74062i()));
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a("akgx", "b", 3796, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                String a2 = bvje.m121170a(i);
                if (i != 0) {
                    bnsl2.mo68425a("Outgoing payload transfer has completed with status %s in %.2f seconds = %.2f MB/s", a2, Double.valueOf(d), Double.valueOf(doubleValue));
                    akgy akgy2 = this.f71926i;
                    ajvg ajvg2 = akgy2.f71948o;
                    long j2 = akgy2.f71953t;
                    long longValue2 = this.f71925h.longValue();
                    bxvd d3 = ajvh.m59107d(17);
                    bxvd da2 = bvft.f155916e.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvft bvft = (bvft) da2.f164949b;
                    int i5 = bvft.f155918a | 1;
                    bvft.f155918a = i5;
                    bvft.f155919b = j2;
                    int i6 = i5 | 2;
                    bvft.f155918a = i6;
                    bvft.f155920c = longValue2;
                    int i7 = i - 1;
                    if (i != 0) {
                        bvft.f155921d = i7;
                        bvft.f155918a = i6 | 4;
                        bvft bvft2 = (bvft) da2.mo74062i();
                        if (d3.f164950c) {
                            d3.mo74035c();
                            d3.f164950c = false;
                        }
                        bvgd bvgd3 = (bvgd) d3.f164949b;
                        bvgd bvgd4 = bvgd.f155960B;
                        bvft2.getClass();
                        bvgd3.f155981r = bvft2;
                        bvgd3.f155964a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                        ajvg2.mo38957a(new ajva((bvgd) d3.mo74062i()));
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            this.f71920a = true;
        }
    }

    /* renamed from: a */
    public final void mo39248a(long j, long j2, int i) {
        this.f71926i.mo39385a(new akgs(this, j, j2, i));
    }
}
