package p000;

import android.os.Handler;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.mfi.Card;
import org.json.JSONObject;

/* renamed from: cikr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cikr extends cikk {

    /* renamed from: a */
    private final Handler f190544a;

    /* renamed from: b */
    private final String f190545b;

    /* renamed from: c */
    private final Card f190546c;

    /* renamed from: d */
    private final JSONObject f190547d;

    /* renamed from: e */
    private final brhc f190548e;

    /* renamed from: f */
    private final brep f190549f;

    /* renamed from: g */
    private final breo f190550g;

    /* renamed from: h */
    private final brgl f190551h;

    /* renamed from: i */
    private final brgz f190552i;

    public cikr(String str, Card card, JSONObject jSONObject, brhc brhc, brgl brgl, brgz brgz, brep brep, Handler handler, breo breo) {
        super(brep);
        this.f190545b = str;
        this.f190546c = card;
        this.f190547d = jSONObject;
        this.f190548e = brhc;
        this.f190551h = brgl;
        this.f190552i = brgz;
        this.f190549f = brep;
        this.f190544a = handler;
        this.f190550g = breo;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69520a(Felica felica) {
        srn srn = atgf.f90279a;
        cikn cikn = new cikn();
        cikn.f190533b = m150518b(felica);
        cikn.f190535d = felica.getIDm();
        cikn.f190536e = felica.getContainerIssueInformation();
        byte[] iCCode = felica.getICCode();
        int length = iCCode.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < iCCode.length; i++) {
            bArr[(length - 1) - i] = iCCode[i];
        }
        cikn.f190537f = bArr;
        return cikn;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69522a(Object obj) {
        cikn cikn = (cikn) obj;
        srn srn = atgf.f90279a;
        if (!cikn.f190534c || !cikn.mo86214a()) {
            this.f190544a.post(new cilg(this.f190545b, this.f190546c, this.f190547d, this.f190548e, this.f190551h, this.f190552i, this.f190549f, this.f190544a, this.f190550g));
            return;
        }
        byte[] bArr = cikn.f190535d;
        String a = cikn.m150523a(bArr, 0, bArr.length - 1);
        byte[] bArr2 = cikn.f190537f;
        String a2 = cikn.m150523a(bArr2, 0, bArr2.length - 1);
        byte[] bArr3 = cikn.f190536e;
        this.f190544a.post(new cili(a, a2, cikn.m150523a(bArr3, 0, bArr3.length - 1), this.f190548e, this.f190551h, this.f190552i, this.f190549f, this.f190544a, null, this.f190550g));
    }
}
