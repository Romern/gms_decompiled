package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: bfad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfad implements bfae {

    /* renamed from: a */
    private final bfai f113230a;

    /* renamed from: b */
    private final bupn f113231b;

    public bfad(Context context) {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        String sb2 = sb.toString();
        String str3 = Build.VERSION.RELEASE;
        bxvd da = bupn.f154656b.mo74144da();
        bxvd da2 = bupm.f154651d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bupm bupm = (bupm) da2.f164949b;
        sb2.getClass();
        bupm.f154653a = sb2;
        str3.getClass();
        bupm.f154654b = str3;
        "20.15.15 (120300-{{cl}})".getClass();
        bupm.f154655c = "20.15.15 (120300-{{cl}})";
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bupm bupm2 = (bupm) da2.mo74062i();
        bupm2.getClass();
        ((bupn) da.f164949b).f154658a = bupm2;
        this.f113231b = (bupn) da.mo74062i();
        this.f113230a = new bfai(new shl(context, cfav.f183552a.mo6606a().voilaTileApiHostname(), 443, context.getApplicationInfo().uid, 1536));
    }

    /* renamed from: a */
    public final bupn mo61339a() {
        return this.f113231b;
    }

    public final void close() {
        this.f113230a.f113237a.mo25561g();
    }

    /* renamed from: a */
    public final bupq mo61340a(bupp bupp) {
        ClientContext clientContext = new ClientContext();
        clientContext.f30216f = "com.google.android.gms";
        try {
            bfai bfai = this.f113230a;
            if (bfai.f113236b == null) {
                bfai.f113236b = chtv.m149566a(chtu.UNARY, "google.internal.android.location.voilatile.v1.VoilaTileService/FindTiles", ciie.m150370a(bupp.f154663c), ciie.m150370a(bupq.f154667b));
            }
            return (bupq) bfai.f113237a.mo25553a(bfai.f113236b, clientContext, bupp, 10000, TimeUnit.MILLISECONDS);
        } catch (gid e) {
            throw new chuw(chuv.f189223j.mo85692c(e));
        }
    }
}
