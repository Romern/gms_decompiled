package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: anht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anht extends angu {

    /* renamed from: a */
    private final angj f76898a;

    /* renamed from: b */
    private final String f76899b;

    /* renamed from: c */
    private final boolean f76900c;

    /* renamed from: d */
    private final anhu f76901d;

    /* JADX WARNING: Illegal instructions before constructor call */
    public anht(angj angj, String str, int i, String[] strArr, int[] iArr, byte[] bArr, boolean z, String str2) {
        super("RegisterOperationCall", !r7 ? caif.REGULAR_REGISTER : caif.WEAK_REGISTER);
        boolean z2 = z;
        sdo.m34959a(angj);
        this.f76898a = angj;
        this.f76899b = str;
        this.f76900c = z2;
        this.f76901d = new anhu(str, i, strArr, iArr, bArr, z, str2);
    }

    /* renamed from: b */
    private final void m64429b(Status status) {
        if (this.f76900c) {
            this.f76898a.mo41790b(status);
        } else {
            this.f76898a.mo41783a(status);
        }
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        anhu anhu = this.f76901d;
        caho caho = (caho) cahp.f174572m.mo74144da();
        String str = anhu.f76902a.f142144d;
        if (caho.f164950c) {
            caho.mo74035c();
            caho.f164950c = false;
        }
        cahp cahp = (cahp) caho.f164949b;
        str.getClass();
        int i = cahp.f174574a | 1;
        cahp.f174574a = i;
        cahp.f174575b = str;
        braj braj = anhu.f76902a;
        int i2 = braj.f142145e;
        cahp.f174574a = i | 2;
        cahp.f174576c = i2;
        caho.mo74646a(braj.f142146f);
        caho.mo74647b(anhu.f76902a.f142147g);
        anhx anhx = anhu.f76903b;
        if (anhx != null) {
            int i3 = anhx.f76914c - 1;
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp2 = (cahp) caho.f164949b;
            cahp2.f174574a |= 64;
            cahp2.f174583j = i3;
        }
        return (cahp) caho.mo74062i();
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        anhu anhu = this.f76901d;
        anhu.f76903b = anhy.m64443a(context, anhu.f76902a, null);
        anhx anhx = anhu.f76903b;
        if (anhs.m64428a(this.f76899b, anhx.f76914c)) {
            anij.m64478a(context, anhx.f76914c, this.f76899b);
        }
        m64429b(Status.f30107a);
    }

    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        anhu anhu = this.f76901d;
        anhu.f76903b = anhy.m64442a(context, anfw, anhu.f76902a, (String) null);
        anhx anhx = anhu.f76903b;
        if (anhs.m64428a(this.f76899b, anhx.f76914c)) {
            anij.m64478a(context, anhx.f76914c, this.f76899b);
        }
        m64429b(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        m64429b(status);
    }
}
