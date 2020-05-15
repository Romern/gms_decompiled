package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: wmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wmk extends whz {

    /* renamed from: b */
    private final wgh f50881b;

    /* renamed from: c */
    private final String f50882c;

    /* renamed from: d */
    private final wgj f50883d;

    public wmk(Context context, String str, wgh wgh, wgj wgj) {
        super(context);
        this.f50882c = str;
        this.f50883d = wgj;
        this.f50881b = wgh;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = brbf.f142241d.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f50883d, this.f50881b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brbf brbf = (brbf) da.f164949b;
        a.getClass();
        brbf.f142244b = a;
        int i = brbf.f142243a | 1;
        brbf.f142243a = i;
        String str = this.f50881b.f50617a;
        str.getClass();
        brbf.f142243a = i | 2;
        brbf.f142245c = str;
        brbf brbf2 = (brbf) da.mo74062i();
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f50882c);
            if (wih.f50731w == null) {
                wih.f50731w = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/CloneFamilyProductCorrelationIdState", ciie.m150370a(brbf.f142241d), ciie.m150370a(brbg.f142246b));
            }
            brbg brbg = (brbg) a2.f50732a.mo25553a(wih.f50731w, a3, brbf2, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            String valueOf = String.valueOf(brbg);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Clone family product correlation id: ");
            sb.append(valueOf);
            sb.toString();
            sbw sbw = wgn.f50624a;
            wgj wgj = this.f50883d;
            bral bral = brbg.f142248a;
            if (bral == null) {
                bral = bral.f142158c;
            }
            wgy.m41938a(wgj, bral);
            return new why(true, brbg);
        } catch (chuw | gid e) {
            sbw sbw2 = wgn.f50624a;
            return new why(false, null);
        }
    }
}
