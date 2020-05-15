package p000;

import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* renamed from: acpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acpy {

    /* renamed from: a */
    private final ClientContext f60457a;

    /* renamed from: b */
    private final acpz f60458b;

    public acpy(ClientContext clientContext, acpz acpz) {
        this.f60457a = clientContext;
        this.f60458b = acpz;
    }

    /* renamed from: a */
    public final acqs mo33010a(acqo acqo) {
        sdo.m34959a(acqo);
        acpz acpz = this.f60458b;
        if (TextUtils.isEmpty(acpz.f60459j) || (!acpz.f60459j.startsWith("https") && (!acpz.f60459j.startsWith("http://127.0.0.1:1738") || !((Boolean) abzt.f58899an.mo58455c()).booleanValue()))) {
            absg.m48184a("Invalid base URL for context engine.");
            return null;
        }
        bxvd da = acqc.f60461c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        acqc acqc = (acqc) da.f164949b;
        acqo.getClass();
        acqc.f60464b = acqo;
        acqc.f60463a |= 2;
        try {
            acqd acqd = (acqd) this.f60458b.mo25515a(this.f60457a, 1, "context", ((acqc) da.mo74062i()).mo73642k(), acqd.f60466b, ((Long) abzt.f59001u.mo58455c()).longValue(), 12802);
            if (acqd != null) {
                try {
                    bxtx bxtx = acqd.f60468a;
                    bxus c = bxus.m123744c();
                    acqs acqs = acqs.f60532b;
                    try {
                        bxuc h = bxtx.mo73764h();
                        bxvk bxvk = (bxvk) acqs.mo74142c(4);
                        bxxv a = bxxm.f165037a.mo74228a(bxvk);
                        a.mo74220a(bxvk, bxud.m123454a(h), c);
                        a.mo74225d(bxvk);
                        h.mo73787a(0);
                        bxvk.m124027b(bxvk);
                        return (acqs) bxvk;
                    } catch (IOException e) {
                        if (!(e.getCause() instanceof bxwf)) {
                            throw new bxwf(e.getMessage());
                        }
                        throw ((bxwf) e.getCause());
                    } catch (RuntimeException e2) {
                        if (e2.getCause() instanceof bxwf) {
                            throw ((bxwf) e2.getCause());
                        }
                        throw e2;
                    } catch (bxwf e3) {
                        throw e3;
                    } catch (bxwf e4) {
                        throw e4;
                    }
                } catch (bxwf e5) {
                    absg.m48192b("Server response bad parse: %s", e5.getMessage());
                    return null;
                }
            } else {
                absg.m48191b("Received a null IcingResponse");
                return null;
            }
        } catch (gid e6) {
            absg.m48192b("Auth error while executing icing server request: %s", e6.getMessage());
            return null;
        } catch (VolleyError e7) {
            absg.m48192b("Failed to execute icing server request: %s", e7.getMessage());
            return null;
        } catch (TimeoutException e8) {
            absg.m48191b("Request to the icing server timed out");
            return null;
        }
    }
}
