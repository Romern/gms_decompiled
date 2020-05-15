package p000;

import android.os.Handler;
import com.felicanetworks.mfc.Block;
import com.felicanetworks.mfc.BlockList;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.FelicaException;

/* renamed from: cikw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cikw extends cikk {

    /* renamed from: a */
    private final Handler f190564a;

    /* renamed from: b */
    private final brhc f190565b;

    /* renamed from: c */
    private final String f190566c;

    /* renamed from: d */
    private final String f190567d;

    /* renamed from: e */
    private final brep f190568e;

    /* renamed from: f */
    private final breo f190569f;

    /* renamed from: g */
    private final brgl f190570g;

    /* renamed from: h */
    private final brgz f190571h;

    public cikw(Handler handler, String str, String str2, brhc brhc, brgl brgl, brgz brgz, brep brep, breo breo) {
        super(brep);
        this.f190564a = handler;
        this.f190566c = str;
        this.f190567d = str2;
        this.f190565b = brhc;
        this.f190570g = brgl;
        this.f190571h = brgz;
        this.f190568e = brep;
        this.f190569f = breo;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69520a(Felica felica) {
        boolean z;
        srn srn = atgf.f90279a;
        cikn cikn = new cikn();
        BlockList blockList = new BlockList();
        blockList.add(new Block(16523, 0));
        try {
            felica.read(blockList);
            z = true;
        } catch (FelicaException e) {
            if (e.getType() == 11) {
                z = false;
            } else {
                throw e;
            }
        }
        cikn.f190534c = z;
        cikn.f190533b = m150518b(felica);
        cikn.f190535d = felica.getIDm();
        byte[] iCCode = felica.getICCode();
        int length = iCCode.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < iCCode.length; i++) {
            bArr[(length - 1) - i] = iCCode[i];
        }
        cikn.f190537f = bArr;
        cikn.f190536e = felica.getContainerIssueInformation();
        return cikn;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69522a(Object obj) {
        cikn cikn = (cikn) obj;
        cilp cilp = new cilp(this.f190566c, this.f190567d, this.f190565b, this.f190570g, this.f190568e);
        srn srn = atgf.f90279a;
        if (!cikn.f190534c || !cikn.mo86214a()) {
            this.f190564a.post(cilp);
            return;
        }
        byte[] bArr = cikn.f190535d;
        String a = cikn.m150523a(bArr, 0, bArr.length - 1);
        byte[] bArr2 = cikn.f190537f;
        String a2 = cikn.m150523a(bArr2, 0, bArr2.length - 1);
        byte[] bArr3 = cikn.f190536e;
        this.f190564a.post(new cili(a, a2, cikn.m150523a(bArr3, 0, bArr3.length - 1), this.f190565b, this.f190570g, this.f190571h, this.f190568e, this.f190564a, cilp, this.f190569f));
    }
}
