package p000;

import android.os.SystemClock;
import com.android.volley.NetworkResponse;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: avap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avap {

    /* renamed from: a */
    public final avao f92854a;

    /* renamed from: b */
    private final avjn f92855b;

    /* renamed from: c */
    private long f92856c;

    public avap(avao avao, avjn avjn) {
        this.f92854a = avao;
        this.f92855b = avjn;
    }

    /* renamed from: a */
    public static final String m78142a(VolleyError volleyError) {
        NetworkResponse networkResponse;
        if ((volleyError instanceof TimeoutError) || (networkResponse = volleyError.networkResponse) == null) {
            return "NETWORK";
        }
        int i = networkResponse.statusCode;
        return (i < 500 || i >= 600) ? "OTHER" : "SERVER";
    }

    /* renamed from: a */
    public final bxrx mo51117a(ClientContext clientContext, bxrw bxrw) {
        mo51119a();
        try {
            sgv sgv = this.f92854a.f92853a;
            StringBuilder sb = new StringBuilder();
            String a = shd.m35267a(String.valueOf(bxrw.f164629c));
            StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 32);
            sb2.append("/users/");
            sb2.append(a);
            sb2.append("/overviewConfig?alt=proto");
            sb.append(sb2.toString());
            bxrx bxrx = (bxrx) sgv.mo25513a(clientContext, 1, sb.toString(), bxrw.mo73642k(), bxrx.f164633e);
            mo51120a("FetchOverviewConfig", (String) null);
            return bxrx;
        } catch (gid e) {
            mo51120a("FetchOverviewConfig", "AUTH");
            throw e;
        } catch (VolleyError e2) {
            mo51120a("FetchOverviewConfig", m78142a(e2));
            throw e2;
        }
    }

    /* renamed from: a */
    public final bxsb mo51118a(ClientContext clientContext, bxrz bxrz) {
        mo51119a();
        try {
            sgv sgv = this.f92854a.f92853a;
            StringBuilder sb = new StringBuilder();
            String a = shd.m35267a(String.valueOf(bxrz.f164643c));
            StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 26);
            sb2.append("/users/");
            sb2.append(a);
            sb2.append("/settings?alt=proto");
            sb.append(sb2.toString());
            bxsb bxsb = (bxsb) sgv.mo25513a(clientContext, 1, sb.toString(), bxrz.mo73642k(), bxsb.f164652f);
            mo51120a("FetchSettings", (String) null);
            return bxsb;
        } catch (gid e) {
            mo51120a("FetchSettings", "AUTH");
            throw e;
        } catch (VolleyError e2) {
            mo51120a("FetchSettings", m78142a(e2));
            throw e2;
        }
    }

    /* renamed from: a */
    public final void mo51119a() {
        this.f92856c = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void mo51120a(String str, String str2) {
        int i;
        if (this.f92855b != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f92856c;
            avjn avjn = this.f92855b;
            long j2 = elapsedRealtime - j;
            bxvd da = bspq.f146567d.mo74144da();
            bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
            bsmt bsmt = bsmt.UDC_MOBILE;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bspp bspp = (bspp) bxvf.f164949b;
            bspp.f146556b = bsmt.f145305dO;
            bspp.f146555a |= 1;
            if (!bmxx.m108577a(str2)) {
                i = 29005;
            } else {
                i = 29004;
            }
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bspp bspp2 = (bspp) bxvf.f164949b;
            bspp2.f146557c = i - 1;
            int i2 = bspp2.f146555a | 2;
            bspp2.f146555a = i2;
            bspp2.f146555a = i2 | 16;
            bspp2.f146560f = true;
            bxvd da2 = bsow.f146438g.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsow bsow = (bsow) da2.f164949b;
            str.getClass();
            bsow.f146440a |= 1;
            bsow.f146441b = str;
            String replace = chbe.m147975e().replace("https://", "");
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsow bsow2 = (bsow) da2.f164949b;
            replace.getClass();
            bsow2.f146440a |= 4;
            bsow2.f146443d = replace;
            String replace2 = chbe.m147974d().replace("/userdatacontrols/", "");
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsow bsow3 = (bsow) da2.f164949b;
            replace2.getClass();
            int i3 = bsow3.f146440a | 2;
            bsow3.f146440a = i3;
            bsow3.f146442c = replace2;
            int i4 = i3 | 8;
            bsow3.f146440a = i4;
            bsow3.f146444e = (int) j2;
            if (str2 != null) {
                str2.getClass();
                bsow3.f146440a = i4 | 16;
                bsow3.f146445f = str2;
            }
            bsow bsow4 = (bsow) da2.mo74062i();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bspp bspp3 = (bspp) bxvf.f164949b;
            bsow4.getClass();
            bspp3.f146561g = bsow4;
            bspp3.f146555a |= 32;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspq bspq = (bspq) da.f164949b;
            bspp bspp4 = (bspp) bxvf.mo74062i();
            bspp4.getClass();
            bspq.f146570b = bspp4;
            bspq.f146569a |= 1;
            avjn.mo51294a((bspq) da.mo74062i());
        }
    }
}
