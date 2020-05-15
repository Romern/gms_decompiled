package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;

/* renamed from: hmw */
final /* synthetic */ class hmw implements Callable {

    /* renamed from: a */
    private final hna f20047a;

    /* renamed from: b */
    private final acyr f20048b;

    public hmw(hna hna, acyr acyr) {
        this.f20047a = hna;
        this.f20048b = acyr;
    }

    public final Object call() {
        Object a;
        bytq bytq;
        hna hna = this.f20047a;
        acyr acyr = this.f20048b;
        hns hns = hna.f20053b;
        hnl hnl = hns.f20087d;
        sdo.m34959a(hnl);
        sdo.m34959a(acyr);
        synchronized (hns.f20090c) {
            a = hns.f20089b.mo12631a(hnq.f20083a, new String[]{acyr.f61090d, hnl.f20074a}, new hnj(hnl), hnl.f20075b);
            if (a == null) {
                a = hnl.f20075b;
            }
        }
        bmxv bmxv = (bmxv) a;
        if (bmxv.mo66813a()) {
            bytq = (bytq) bmxv.mo66814b();
        } else {
            hnw hnw = hna.f20052a;
            try {
                bxvd da = bytp.f167699d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bytp bytp = (bytp) da.f164949b;
                bytp.f167701a |= 2;
                bytp.f167703c = true;
                bytr a2 = hnw.mo12638a((String) null);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bytp bytp2 = (bytp) da.f164949b;
                a2.getClass();
                bytp2.f167702b = a2;
                bytp2.f167701a |= 1;
                iee a3 = hnw.mo12641a();
                ClientContext a4 = hnw.mo12640a(acyr);
                bytp bytp3 = (bytp) da.mo74062i();
                sgv sgv = a3.f20793a;
                StringBuilder sb = new StringBuilder();
                sb.append("/phoneNumbers?alt=proto");
                if (!(bytp3 == null || (bytp3.f167701a & 1) == 0)) {
                    bytr bytr = bytp3.f167702b;
                    if (bytr == null) {
                        bytr = bytr.f167707e;
                    }
                    if ((bytr.f167709a & 1) != 0) {
                        sb.append("&header.playServicesVersion=");
                        bytr bytr2 = bytp3.f167702b;
                        if (bytr2 == null) {
                            bytr2 = bytr.f167707e;
                        }
                        sb.append(shd.m35267a(bytr2.f167710b));
                    }
                }
                if (!(bytp3 == null || (bytp3.f167701a & 1) == 0)) {
                    bytr bytr3 = bytp3.f167702b;
                    if (bytr3 == null) {
                        bytr3 = bytr.f167707e;
                    }
                    if ((bytr3.f167709a & 2) != 0) {
                        sb.append("&header.certificateSha1=");
                        bytr bytr4 = bytp3.f167702b;
                        if (bytr4 == null) {
                            bytr4 = bytr.f167707e;
                        }
                        sb.append(shd.m35267a(bytr4.f167711c));
                    }
                }
                if (!(bytp3 == null || (bytp3.f167701a & 1) == 0)) {
                    bytr bytr5 = bytp3.f167702b;
                    if (bytr5 == null) {
                        bytr5 = bytr.f167707e;
                    }
                    if ((bytr5.f167709a & 4) != 0) {
                        sb.append("&header.packageName=");
                        bytr bytr6 = bytp3.f167702b;
                        if (bytr6 == null) {
                            bytr6 = bytr.f167707e;
                        }
                        sb.append(shd.m35267a(bytr6.f167712d));
                    }
                }
                if (!(bytp3 == null || (bytp3.f167701a & 2) == 0)) {
                    sb.append("&isSyncRequest=");
                    sb.append(bytp3.f167703c);
                }
                bytq bytq2 = (bytq) sgv.mo25513a(a4, 0, sb.toString(), (byte[]) null, bytq.f167704b);
                hns hns2 = hna.f20053b;
                hnl hnl2 = hns.f20087d;
                bmxv b = bmxv.m108566b(bytq2);
                sdo.m34959a(hnl2);
                sdo.m34959a(acyr);
                synchronized (hns2.f20090c) {
                    hns2.f20089b.mo12632a(new hnk(hnl2, acyr.f61090d, b));
                }
                bytq = bytq2;
            } catch (VolleyError e) {
                throw hnw.m14662a(e);
            } catch (gid e2) {
                throw adbe.m50107a(e2);
            }
        }
        return bnfi.m109235a(bytq.f167706a).mo67501a(hmx.f20049a).mo67502a(hmy.f20050a).mo67501a(hmz.f20051a).mo67505b();
    }
}
