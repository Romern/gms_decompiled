package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;

/* renamed from: avaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avaz extends avau {
    public avaz(Context context, avdl avdl, ClientContext clientContext, String str, avap avap, byte[] bArr) {
        super(context, avdl, clientContext, str, "FetchOverviewConfigOperation", avap, bArr);
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        super.mo6502a(context);
        if (chbo.m148123b()) {
            avet.m78388a().mo51185a();
            return;
        }
        bxrv bxrv = (bxrv) bxrw.f164625g.mo74144da();
        try {
            mo51133b();
            bxrv.mo73635b(this.f92880b, bxus.m123744c());
            bxss bxss = ((bxrw) bxrv.f164949b).f164631e;
            if (bxss == null) {
                bxss = bxss.f164728i;
            }
            bxvd a = mo51130a(bxss);
            String c = mo51134c();
            bxre a2 = aviz.m78598a(this.f92882c, c);
            if (a2 != null) {
                if (bxrv.f164950c) {
                    bxrv.mo74035c();
                    bxrv.f164950c = false;
                }
                bxrw bxrw = (bxrw) bxrv.f164949b;
                a2.getClass();
                bxrw.f164628b = a2;
                bxrw.f164627a |= 1;
            }
            String a3 = m78158a(((bxrw) bxrv.f164949b).f164629c);
            if (bxrv.f164950c) {
                bxrv.mo74035c();
                bxrv.f164950c = false;
            }
            bxrw bxrw2 = (bxrw) bxrv.f164949b;
            a3.getClass();
            bxrw2.f164627a |= 2;
            bxrw2.f164629c = a3;
            if (m78159a(bxrw2.f164629c, c)) {
                avcc a4 = mo51129a();
                avcb a5 = a4.mo51137a();
                if (a5 != null) {
                    if (Status.f30107a.equals(a5.f92942a)) {
                        if (bxrv.f164950c) {
                            bxrv.mo74035c();
                            bxrv.f164950c = false;
                        }
                        ((bxrw) bxrv.f164949b).f164632f = GeneratedMessageLite.m124030de();
                        bxrv.mo73615a(a5.f92943b);
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
            if (bxrv.f164950c) {
                bxrv.mo74035c();
                bxrv.f164950c = false;
            }
            bxrw bxrw3 = (bxrw) bxrv.f164949b;
            bxss bxss4 = (bxss) a.mo74062i();
            bxss4.getClass();
            bxrw3.f164631e = bxss4;
            bxrw3.f164627a |= 8;
            bxrx a6 = ((avau) this).f92879a.mo51117a(this.f92884e, (bxrw) bxrv.mo74062i());
            bxrf bxrf = a6.f164636b;
            if (bxrf == null) {
                bxrf = bxrf.f164550c;
            }
            aviz.m78599a(bxrf, this.f92882c, c);
            mo51131a(0);
            this.f92883d.mo51162b(Status.f30107a, a6.serializeToBytes());
        } catch (gid e) {
            throw new aaaj(4504, null);
        } catch (VolleyError e2) {
            throw mo51128a(e2);
        } catch (bxwf e3) {
            throw new aaaj(4503, null);
        } catch (IOException e4) {
            throw new aaaj(4505, null);
        } catch (avbp e5) {
            throw new aaaj(10, null);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo51131a(status.f30115i);
        this.f92883d.mo51162b(status, null);
    }
}
