package p000;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import java.util.List;

/* renamed from: quw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class quw {

    /* renamed from: a */
    private final quu f42212a;

    /* renamed from: b */
    private final String f42213b;

    /* renamed from: c */
    private final float f42214c;

    public quw(Context context) {
        this.f42212a = new quu(new sgv(context, (String) qqv.f41971h.mo58455c(), (String) qqv.f41972i.mo58455c(), false, false, (String) qqv.f41973j.mo58455c(), null, "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk"), context.getPackageName());
        this.f42213b = C1189mi.m19638a(C1188mh.m19636a(context.getResources().getConfiguration()).mo15465c()).mo15464b();
        this.f42214c = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    private static bngx m32930b(List list) {
        bngs j = bngx.m109377j();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bytw bytw = (bytw) list.get(i);
            bxvd bxvd = (bxvd) bytw.mo74142c(5);
            bxvd.mo73625a((bxvk) bytw);
            String a = qqt.m32667a(bytw.f167728b);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bytw bytw2 = (bytw) bxvd.f164949b;
            bytw bytw3 = bytw.f167725e;
            a.getClass();
            bytw2.f167727a |= 1;
            bytw2.f167728b = a;
            j.mo67668c((bytw) bxvd.mo74062i());
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    public final byuc mo24282a(List list) {
        bxvd da = byub.f167753d.mo74144da();
        bnfi a = bnfi.m109235a(list).mo67501a(quv.f42211a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byub byub = (byub) da.f164949b;
        if (!byub.f167756b.mo73666a()) {
            byub.f167756b = bxvk.m124021a(byub.f167756b);
        }
        bxsy.m123078a(a, byub.f167756b);
        bxvd da2 = byua.f167744h.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byua byua = (byua) da2.f164949b;
        int i = byua.f167746a | 8;
        byua.f167746a = i;
        byua.f167750e = true;
        int i2 = i | 1;
        byua.f167746a = i2;
        byua.f167747b = true;
        String str = this.f42213b;
        str.getClass();
        byua.f167746a = i2 | 4;
        byua.f167749d = str;
        int ceil = (int) Math.ceil((double) (this.f42214c * 26.0f));
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byua byua2 = (byua) da2.f164949b;
        int i3 = byua2.f167746a | 2;
        byua2.f167746a = i3;
        byua2.f167748c = ceil;
        int i4 = i3 | 16;
        byua2.f167746a = i4;
        byua2.f167751f = true;
        byua2.f167746a = i4 | 32;
        byua2.f167752g = true;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byub byub2 = (byub) da.f164949b;
        byua byua3 = (byua) da2.mo74062i();
        byua3.getClass();
        byub2.f167757c = byua3;
        byub2.f167755a |= 1;
        byub byub3 = (byub) da.mo74062i();
        try {
            quu quu = this.f42212a;
            sgv sgv = quu.f42210d;
            StringBuilder sb = new StringBuilder();
            sb.append("/affiliation:lookup?alt=proto");
            if (!TextUtils.isEmpty(quu.f42208b)) {
                String valueOf = String.valueOf(shd.m35267a(quu.f42208b));
                sb.append(valueOf.length() == 0 ? new String("&key=") : "&key=".concat(valueOf));
            }
            byuc byuc = (byuc) sgv.mo25516a(sb.toString(), byub3.mo73642k(), byuc.f167758c, quu.f42207a, quu.f42209c);
            bxvd bxvd = (bxvd) byuc.mo74142c(5);
            bxvd.mo73625a((bxvk) byuc);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((byuc) bxvd.f164949b).f167760a = bxvk.m124030de();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((byuc) bxvd.f164949b).f167761b = bxvk.m124030de();
            for (byts byts : byuc.f167760a) {
                bxvd bxvd2 = (bxvd) byts.mo74142c(5);
                bxvd2.mo73625a((bxvk) byts);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                byts byts2 = byts.f167713b;
                ((byts) bxvd2.f164949b).f167715a = bxvk.m124030de();
                bngx b = m32930b(byts.f167715a);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                byts byts3 = (byts) bxvd2.f164949b;
                byts3.mo74506c();
                bxsy.m123078a(b, byts3.f167715a);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                byuc byuc2 = (byuc) bxvd.f164949b;
                byts byts4 = (byts) bxvd2.mo74062i();
                byts4.getClass();
                if (!byuc2.f167760a.mo73666a()) {
                    byuc2.f167760a = bxvk.m124021a(byuc2.f167760a);
                }
                byuc2.f167760a.add(byts4);
            }
            for (byty byty : byuc.f167761b) {
                bxvd bxvd3 = (bxvd) byty.mo74142c(5);
                bxvd3.mo73625a((bxvk) byty);
                bytx bytx = (bytx) bxvd3;
                if (bytx.f164950c) {
                    bytx.mo74035c();
                    bytx.f164950c = false;
                }
                byty byty2 = byty.f167731d;
                ((byty) bytx.f164949b).f167734b = bxvk.m124030de();
                bngx b2 = m32930b(byty.f167734b);
                if (bytx.f164950c) {
                    bytx.mo74035c();
                    bytx.f164950c = false;
                }
                byty byty3 = (byty) bytx.f164949b;
                byty3.mo74508c();
                bxsy.m123078a(b2, byty3.f167734b);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                byuc byuc3 = (byuc) bxvd.f164949b;
                byty byty4 = (byty) bytx.mo74062i();
                byty4.getClass();
                if (!byuc3.f167761b.mo73666a()) {
                    byuc3.f167761b = bxvk.m124021a(byuc3.f167761b);
                }
                byuc3.f167761b.add(byty4);
            }
            return (byuc) bxvd.mo74062i();
        } catch (gid e) {
            throw new qrp(qrq.m32742a(e), "Error when fetching affiliations.", e);
        } catch (VolleyError e2) {
            throw new qrp(513, "Error when fetching affiliations.", e2);
        }
    }
}
