package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: itu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itu extends aaab {

    /* renamed from: c */
    private static final Logger f21721c = new Logger(new String[]{"IncrementAndGetCounterOperation"}, (byte[]) null);

    /* renamed from: a */
    private final irn f21722a;

    /* renamed from: b */
    private final byte[] f21723b;

    public itu(irn irn, byte[] bArr) {
        super(129, "IncrementAndGetCounterOperation");
        this.f21722a = irn;
        this.f21723b = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        f21721c.mo25412b("IncrementAndGetCounter operation is called", new Object[0]);
        isn isn = new isn(context);
        isn.f21612a = 11;
        isx a = isw.m16064a(context, isn);
        try {
            isy a2 = a.f21632a.mo13218a(this.f21723b);
            byte[] a3 = a.f21633b.mo13229a(a2.f21640e, bsnm.FIDO);
            if (a3 == null) {
                if (ccfg.f178858a.mo6606a().mo75850b()) {
                    bxvd da = bsnn.f146304c.mo74144da();
                    bsnm bsnm = bsnm.FIDO;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((bsnn) da.f164949b).f146306a = bsnm.mo3214a();
                    bxvd da2 = bsns.f146327b.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ((bsns) da2.f164949b).f146329a = 0;
                    ByteString aL = ((bsns) da2.mo74062i()).mo73639aL();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aL.getClass();
                    ((bsnn) da.f164949b).f146307b = aL;
                    a3 = ((bsnn) da.mo74062i()).serializeToBytes();
                } else {
                    throw new isu("No feature metadata found in database.");
                }
            }
            long j = ((bsns) GeneratedMessageLite.m124007a(bsns.f146327b, ((bsnn) GeneratedMessageLite.m124014a(bsnn.f146304c, a3)).f146307b)).f146329a + 1;
            bxvd da3 = bsnn.f146304c.mo74144da();
            bsnm bsnm2 = bsnm.FIDO;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ((bsnn) da3.f164949b).f146306a = bsnm2.mo3214a();
            bxvd da4 = bsns.f146327b.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ((bsns) da4.f164949b).f146329a = j;
            ByteString aL2 = ((bsns) da4.mo74062i()).mo73639aL();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            aL2.getClass();
            ((bsnn) da3.f164949b).f146307b = aL2;
            a.f21633b.mo13228a(a2.f21640e, bsnm.FIDO, ((bsnn) da3.mo74062i()).serializeToBytes());
            isn.f21613b = 1;
            isn.mo13317a();
            this.f21722a.mo13299a(j);
        } catch (isu e) {
            a.f21634c.f21613b = 11;
            throw e;
        } catch (bxwf e2) {
            a.f21634c.f21613b = 12;
            throw new isu("Error parsing feature metadata.");
        } catch (isu e3) {
            isn.mo13317a();
            mo6503a(new Status(25508));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21722a.mo13300a(status);
    }
}
