package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: anhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhm extends angu {

    /* renamed from: a */
    private final angj f76883a;

    /* renamed from: b */
    private final anhn f76884b;

    public anhm(angj angj, String str) {
        super("GetServingVersionOperationCall", caif.GET_SERVING_VERSION, !str.equals("com.google.android.gms"));
        sdo.m34959a(angj);
        this.f76883a = angj;
        this.f76884b = new anhn(str);
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        anhn anhn = this.f76884b;
        caho caho = (caho) cahp.f174572m.mo74144da();
        String str = anhn.f76885a;
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
        long j = anhn.f76886b;
        if (caho.f164950c) {
            caho.mo74035c();
            caho.f164950c = false;
        }
        cahp cahp2 = (cahp) caho.f164949b;
        cahp2.f174574a |= 32;
        cahp2.f174582i = j;
        return (cahp) caho.mo74062i();
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        anhn anhn = this.f76884b;
        long a = anfh.m64155a(anfw);
        anhn.f76886b = a;
        this.f76883a.mo41791b(Status.f30107a, Long.valueOf(a).longValue());
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76883a.mo41791b(status, -1);
    }
}
