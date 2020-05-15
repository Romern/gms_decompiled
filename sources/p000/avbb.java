package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;

/* renamed from: avbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avbb extends avau {
    public avbb(Context context, avdl avdl, ClientContext clientContext, String str, avap avap, byte[] bArr) {
        super(context, avdl, clientContext, str, "FetchSettingsOperation", avap, bArr);
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        super.mo6502a(context);
        bxry bxry = (bxry) bxrz.f164639h.mo74144da();
        try {
            mo51133b();
            bxry.mo73635b(this.f92880b, bxus.m123744c());
            bxss bxss = ((bxrz) bxry.f164949b).f164646f;
            if (bxss == null) {
                bxss = bxss.f164728i;
            }
            bxvd a = mo51130a(bxss);
            String c = mo51134c();
            bxre a2 = aviz.m78598a(context, c);
            if (a2 != null) {
                if (bxry.f164950c) {
                    bxry.mo74035c();
                    bxry.f164950c = false;
                }
                bxrz bxrz = (bxrz) bxry.f164949b;
                a2.getClass();
                bxrz.f164642b = a2;
                bxrz.f164641a |= 1;
            }
            String a3 = m78158a(((bxrz) bxry.f164949b).f164643c);
            if (bxry.f164950c) {
                bxry.mo74035c();
                bxry.f164950c = false;
            }
            bxrz bxrz2 = (bxrz) bxry.f164949b;
            a3.getClass();
            bxrz2.f164641a |= 2;
            bxrz2.f164643c = a3;
            if (m78159a(bxrz2.f164643c, c)) {
                avcc a4 = mo51129a();
                avcb a5 = a4.mo51137a();
                if (a5 != null) {
                    if (Status.f30107a.equals(a5.f92942a)) {
                        if (bxry.f164950c) {
                            bxry.mo74035c();
                            bxry.f164950c = false;
                        }
                        ((bxrz) bxry.f164949b).f164647g = GeneratedMessageLite.m124030de();
                        bxry.mo73616a(a5.f92943b);
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
            if (bxry.f164950c) {
                bxry.mo74035c();
                bxry.f164950c = false;
            }
            bxrz bxrz3 = (bxrz) bxry.f164949b;
            bxss bxss4 = (bxss) a.mo74062i();
            bxss4.getClass();
            bxrz3.f164646f = bxss4;
            bxrz3.f164641a |= 8;
            bxsb a6 = ((avau) this).f92879a.mo51118a(this.f92884e, (bxrz) bxry.mo74062i());
            bxrf bxrf = a6.f164655b;
            if (bxrf == null) {
                bxrf = bxrf.f164550c;
            }
            aviz.m78599a(bxrf, this.f92882c, c);
            mo51131a(0);
            this.f92883d.mo51161a(Status.f30107a, a6.serializeToBytes());
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
        this.f92883d.mo51161a(status, (byte[]) null);
    }
}
