package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.List;

/* renamed from: avay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avay extends avau {
    public avay(Context context, avdl avdl, ClientContext clientContext, String str, avap avap, byte[] bArr) {
        super(context, avdl, clientContext, str, "FetchConsentConfigOperation", avap, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a8, code lost:
        throw new p000.aaaj(10, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b1, code lost:
        throw new p000.aaaj(4505, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ba, code lost:
        throw new p000.aaaj(4503, null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a0 A[ExcHandler: avbp (e avbp), Splitter:B:1:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a9 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:1:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b2 A[ExcHandler: bxwf (e bxwf), Splitter:B:1:0x000c] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        avap avap;
        super.mo6502a(context);
        bxvd da = bxrt.f164599j.mo74144da();
        try {
            mo51133b();
            da.mo73635b(this.f92880b, bxus.m123744c());
            bxss bxss = ((bxrt) da.f164949b).f164607g;
            if (bxss == null) {
                bxss = bxss.f164728i;
            }
            bxvd a = mo51130a(bxss);
            String c = mo51134c();
            bxre a2 = aviz.m78598a(this.f92882c, c);
            if (a2 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxrt bxrt = (bxrt) da.f164949b;
                a2.getClass();
                bxrt.f164602b = a2;
                bxrt.f164601a |= 1;
            }
            String a3 = m78158a(((bxrt) da.f164949b).f164603c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxrt bxrt2 = (bxrt) da.f164949b;
            a3.getClass();
            bxrt2.f164601a |= 2;
            bxrt2.f164603c = a3;
            if (m78159a(bxrt2.f164603c, c)) {
                avcc a4 = mo51129a();
                avcb a5 = a4.mo51137a();
                if (a5 != null) {
                    if (Status.f30107a.equals(a5.f92942a)) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((bxrt) da.f164949b).f164608h = GeneratedMessageLite.m124030de();
                        List list = a5.f92943b;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bxrt bxrt3 = (bxrt) da.f164949b;
                        if (!bxrt3.f164608h.mo73666a()) {
                            bxrt3.f164608h = GeneratedMessageLite.m124021a(bxrt3.f164608h);
                        }
                        bxsy.m123078a(list, bxrt3.f164608h);
                    }
                }
                bxsr b = a4.mo51141b();
                if (b != null) {
                    if (a.f164950c) {
                        a.mo74035c();
                        a.f164950c = false;
                    }
                    bxss bxss2 = (bxss) a.f164949b;
                    b.getClass();
                    bxss2.f164737h = b;
                    bxss2.f164730a |= 128;
                } else {
                    if (a.f164950c) {
                        a.mo74035c();
                        a.f164950c = false;
                    }
                    bxss bxss3 = (bxss) a.f164949b;
                    bxss3.f164737h = null;
                    bxss3.f164730a &= -129;
                }
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxrt bxrt4 = (bxrt) da.f164949b;
            bxss bxss4 = (bxss) a.mo74062i();
            bxss4.getClass();
            bxrt4.f164607g = bxss4;
            bxrt4.f164601a |= 16;
            avap = ((avau) this).f92879a;
            ClientContext clientContext = this.f92884e;
            bxrt bxrt5 = (bxrt) da.mo74062i();
            avap.mo51119a();
            sgv sgv = avap.f92854a.f92853a;
            StringBuilder sb = new StringBuilder();
            String a6 = shd.m35267a(String.valueOf(bxrt5.f164603c));
            StringBuilder sb2 = new StringBuilder(String.valueOf(a6).length() + 31);
            sb2.append("/users/");
            sb2.append(a6);
            sb2.append("/consentConfig?alt=proto");
            sb.append(sb2.toString());
            bxru bxru = (bxru) sgv.mo25513a(clientContext, 1, sb.toString(), bxrt5.serializeToBytes(), bxru.f164610n);
            avap.mo51120a("FetchConsentConfig", (String) null);
            bxrf bxrf = bxru.f164613b;
            if (bxrf == null) {
                bxrf = bxrf.f164550c;
            }
            aviz.m78599a(bxrf, this.f92882c, c);
            mo51131a(0);
            this.f92883d.mo51163c(Status.f30107a, bxru.serializeToBytes());
        } catch (gid e) {
            avap.mo51120a("FetchConsentConfig", "AUTH");
            throw e;
        } catch (VolleyError e2) {
            avap.mo51120a("FetchConsentConfig", avap.m78142a(e2));
            throw e2;
        } catch (bxwf e3) {
        } catch (IOException e4) {
        } catch (avbp e5) {
        } catch (gid e6) {
            throw new aaaj(4504, null);
        } catch (VolleyError e7) {
            throw mo51128a(e7);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo51131a(status.f30115i);
        this.f92883d.mo51163c(status, null);
    }
}
