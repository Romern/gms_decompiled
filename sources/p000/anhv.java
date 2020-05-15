package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;

/* renamed from: anhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhv extends angu {

    /* renamed from: a */
    private final angj f76904a;

    /* renamed from: b */
    private final String f76905b;

    /* renamed from: c */
    private final anhw f76906c;

    public anhv(angj angj, String str, int i, String[] strArr, byte[] bArr, String str2, String str3, String str4) {
        super("RegisterSyncOperationCall", caif.REGISTER_SYNC);
        sdo.m34959a(angj);
        this.f76904a = angj;
        this.f76905b = str;
        this.f76906c = new anhw(str, i, strArr, bArr, str2, str3, str4);
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        anhw anhw = this.f76906c;
        caho caho = (caho) cahp.f174572m.mo74144da();
        String str = anhw.f76909c.f142144d;
        if (caho.f164950c) {
            caho.mo74035c();
            caho.f164950c = false;
        }
        cahp cahp = (cahp) caho.f164949b;
        str.getClass();
        int i = cahp.f174574a | 1;
        cahp.f174574a = i;
        cahp.f174575b = str;
        braj braj = anhw.f76909c;
        int i2 = braj.f142145e;
        cahp.f174574a = i | 2;
        cahp.f174576c = i2;
        caho.mo74646a(braj.f142146f);
        anhx anhx = anhw.f76910d;
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
        String str2 = anhw.f76907a;
        if (str2 != null) {
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp3 = (cahp) caho.f164949b;
            str2.getClass();
            cahp3.f174574a |= 4;
            cahp3.f174579f = str2;
        }
        return (cahp) caho.mo74062i();
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        String str;
        anhw anhw = this.f76906c;
        anhw.mo41838a(context);
        anhw.f76910d = anhy.m64443a(context, anhw.f76909c, anhw.f76907a);
        anhw.mo41839a(context, true);
        braj braj = anhw.f76909c;
        String str2 = braj.f142144d;
        String str3 = anhw.f76907a;
        String str4 = anhw.f76908b;
        if (braj.f142142b == 7) {
            str = (String) braj.f142143c;
        } else {
            str = "";
        }
        new anhe(str2, str3, str4, str2, str);
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* renamed from: c */
    public final cahz mo41830c() {
        cahw cahw = this.f76906c.f76911e;
        if (cahw != null) {
            return (cahz) cahw.mo74062i();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        String str;
        anhw anhw = this.f76906c;
        anhw.mo41838a(context);
        anhw.f76910d = anhy.m64442a(context, anfw, anhw.f76909c, anhw.f76907a);
        anhw.mo41839a(context, false);
        braj braj = anhw.f76909c;
        String str2 = braj.f142144d;
        String str3 = anhw.f76907a;
        String str4 = anhw.f76908b;
        if (braj.f142142b == 7) {
            str = (String) braj.f142143c;
        } else {
            str = "";
        }
        Configurations a = new anhe(str2, str3, str4, str2, str).mo41834a(context, anfw);
        if (anhs.m64428a(this.f76905b, this.f76906c.f76910d.f76914c)) {
            anij.m64478a(context, this.f76906c.f76910d.f76914c, this.f76905b);
        }
        this.f76904a.mo41785a(Status.f30107a, a);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76904a.mo41785a(status, (Configurations) null);
    }
}
