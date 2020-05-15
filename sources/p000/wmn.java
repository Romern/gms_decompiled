package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: wmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wmn extends whz {

    /* renamed from: b */
    private final wgh f50894b;

    /* renamed from: c */
    private final String f50895c;

    /* renamed from: d */
    private final wgj f50896d;

    /* renamed from: e */
    private final String f50897e;

    /* renamed from: f */
    private final byte[] f50898f;

    public wmn(Context context, String str, wgh wgh, wgj wgj, String str2, byte[] bArr) {
        super(context);
        this.f50895c = str;
        this.f50896d = wgj;
        this.f50894b = wgh;
        this.f50897e = str2;
        this.f50898f = bArr;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bxvd da = brcx.f142447e.mo74144da();
        brak a = wgy.m41937a(getContext(), this.f50896d, this.f50894b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brcx brcx = (brcx) da.f164949b;
        a.getClass();
        brcx.f142450b = a;
        brcx.f142449a |= 1;
        bxvd da2 = braq.f142171c.mo74144da();
        bxvd da3 = brap.f142167c.mo74144da();
        String b = sqd.m35968b(this.f50898f);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        brap brap = (brap) da3.f164949b;
        b.getClass();
        brap.f142169a = 2;
        brap.f142170b = b;
        brap brap2 = (brap) da3.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        braq braq = (braq) da2.f164949b;
        brap2.getClass();
        braq.f142174b = brap2;
        braq.f142173a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brcx brcx2 = (brcx) da.f164949b;
        braq braq2 = (braq) da2.mo74062i();
        braq2.getClass();
        brcx2.f142452d = braq2;
        brcx2.f142449a |= 4;
        String str = this.f50897e;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brcx brcx3 = (brcx) da.f164949b;
            str.getClass();
            brcx3.f142449a |= 2;
            brcx3.f142451c = str;
        }
        try {
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(this.f50895c);
            brcx brcx4 = (brcx) da.mo74062i();
            if (wih.f50726r == null) {
                wih.f50726r = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/GetFamilyOnboardFlowConfig", ciie.m150370a(brcx.f142447e), ciie.m150370a(brda.f142459i));
            }
            brda brda = (brda) a2.f50732a.mo25553a(wih.f50726r, a3, brcx4, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            wgj wgj = this.f50896d;
            bral bral = brda.f142462b;
            if (bral == null) {
                bral = bral.f142158c;
            }
            wgy.m41938a(wgj, bral);
            return new why(true, brda);
        } catch (chuw | gid e) {
            sbw sbw = wgn.f50624a;
            return new why(false, null);
        }
    }
}
