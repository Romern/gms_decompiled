package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.ExperimentTokens;

/* renamed from: anhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhg extends angu {

    /* renamed from: a */
    public final anhj f76862a;

    /* renamed from: b */
    private final angj f76863b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anhg(angj angj, String str, String str2, String str3, String str4, String str5) {
        super("GetExperimentTokensOperationCall", str == null ? caif.f174663j : caif.f174664k, !"com.google.android.gms".equals(str5));
        sdo.m34959a(angj);
        this.f76863b = angj;
        this.f76862a = new anhj(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        anhj anhj = this.f76862a;
        caho caho = (caho) cahp.f174572m.mo74144da();
        String str = anhj.f76873a;
        if (str != null) {
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp = (cahp) caho.f164949b;
            str.getClass();
            cahp.f174574a |= 1;
            cahp.f174575b = str;
        }
        String str2 = anhj.f76874b;
        if (str2 != null) {
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp2 = (cahp) caho.f164949b;
            str2.getClass();
            cahp2.mo74648c();
            cahp2.f174577d.add(str2);
        }
        return (cahp) caho.mo74062i();
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        this.f76863b.mo41787a(Status.f30107a, this.f76862a.mo41836b(anfw));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76863b.mo41787a(status, (ExperimentTokens) null);
    }
}
