package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;

/* renamed from: anhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhc extends angu {

    /* renamed from: a */
    private final angj f76846a;

    /* renamed from: b */
    private final anhe f76847b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anhc(angj angj, String str, String str2, String str3, String str4, String str5) {
        super("GetConfigurationSnapshotOperationCall", sdg.m34949a(str, str4) ? caif.f174660g : caif.f174649K);
        sdo.m34959a(angj);
        this.f76846a = angj;
        this.f76847b = new anhe(str, str2, str3, str4, str5);
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        anhe anhe = this.f76847b;
        caho caho = (caho) cahp.f174572m.mo74144da();
        String str = anhe.f76855a;
        if (str != null) {
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp = (cahp) caho.f164949b;
            str.getClass();
            cahp.f174574a |= 128;
            cahp.f174584k = str;
        }
        String str2 = anhe.f76858d;
        if (str2 != null) {
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp2 = (cahp) caho.f164949b;
            str2.getClass();
            cahp2.f174574a |= 1;
            cahp2.f174575b = str2;
        }
        String str3 = anhe.f76856b;
        if (str3 != null) {
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp3 = (cahp) caho.f164949b;
            str3.getClass();
            cahp3.f174574a |= 4;
            cahp3.f174579f = str3;
        }
        String str4 = anhe.f76857c;
        if (str4 != null) {
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp4 = (cahp) caho.f164949b;
            str4.getClass();
            cahp4.f174574a |= 8;
            cahp4.f174580g = str4;
        }
        return (cahp) caho.mo74062i();
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        try {
            this.f76846a.mo41785a(Status.f30107a, this.f76847b.mo41834a(context, anfw));
        } catch (anfx e) {
            if (e.f76790a == 29512 && anhs.m64428a(this.f76847b.f76858d, 21)) {
                anij.m64478a(context, 21, this.f76847b.f76858d);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76846a.mo41785a(status, (Configurations) null);
    }
}
