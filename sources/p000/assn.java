package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: assn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class assn implements asqr {

    /* renamed from: a */
    private static final srn f89605a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private static final astf f89606b = astf.m74754a(28160);

    /* renamed from: c */
    private static final astf f89607c = astf.m74754a(27904);

    /* renamed from: d */
    private static final astf f89608d = astf.m74754a(27270);

    /* renamed from: e */
    private static final astf f89609e = astf.m74754a(27264);

    /* renamed from: f */
    private static final astf f89610f = astf.m74754a(25219);

    /* renamed from: g */
    private final ArrayList f89611g = new ArrayList();

    /* renamed from: a */
    public final astf mo49385a(byte[] bArr) {
        try {
            if (bArr[0] != 0) {
                return f89606b;
            }
            if (bArr[1] != -92) {
                return f89607c;
            }
            if (bArr[2] != 4) {
                return f89608d;
            }
            if (bArr[3] != 0) {
                return f89608d;
            }
            if (!astc.m74747a(Arrays.copyOfRange(bArr, 5, bqcw.m112606a(bArr[4]) + 5)).equals(astc.f89631a)) {
                return f89609e;
            }
            return astf.m74756a(asta.m74734a(asta.m74731a(111, asta.m74733a(132, astc.f89631a.f89685k), asta.m74731a(165, asta.m74731a(48908, (assu[]) this.f89611g.toArray(new assu[0]))))), 36864);
        } catch (ArrayIndexOutOfBoundsException e) {
            bnsl bnsl = (bnsl) f89605a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("assn", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Invalid command structure");
            return f89610f;
        }
    }

    /* renamed from: a */
    public final void mo49435a(List list) {
        boolean z;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            assu assu = (assu) it.next();
            if (assu.f89619b == 97) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108588a(z);
            this.f89611g.add(assu);
        }
    }

    /* renamed from: a */
    public final astc[] mo49386a() {
        return new astc[]{astc.f89631a};
    }
}
