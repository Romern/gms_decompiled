package p000;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import java.util.List;
import java.util.Map;

/* renamed from: abfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abfa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ abfb f57326a;

    public abfa(abfb abfb) {
        this.f57326a = abfb;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abcx.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, abcr, boolean):void
     arg types: [android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, abcr, int]
     candidates:
      abcx.a(aasf, int, int, bzps):void
      abcx.a(aasf, int, bzps, int):void
      abcx.a(aasf, int, java.util.List, java.lang.String):void
      abcx.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, abcr, int):void
      abcx.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, abcr, bxvd):void
      abcx.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, abcr, bzps):void
      abcx.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, java.lang.String, abcr):void
      abcx.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, abcr, boolean):void */
    public final void run() {
        abfb abfb = this.f57326a;
        Context applicationContext = abfb.f57328b.getApplicationContext();
        HelpConfig helpConfig = abfb.f57329c;
        bqgj bqgj = abfb.f57330d;
        abcr abcr = abfb.f57332f;
        String str = abfb.f57327a;
        if (str == null) {
            str = "";
        }
        abey a = abez.m47601a(applicationContext, helpConfig, bqgj, abcr, str);
        int i = 0;
        if (!a.mo32061e()) {
            if (abfb.f57329c.mo43207B()) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                for (Map.Entry entry : a.f57323b.entrySet()) {
                    aasm aasm = (aasm) entry.getValue();
                    if (!aasm.mo31741w()) {
                        String valueOf2 = String.valueOf(valueOf);
                        String valueOf3 = String.valueOf(aasm.f56492b);
                        aasm.f56492b = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
                    } else {
                        List list = aasm.f56511u;
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            String valueOf4 = String.valueOf(valueOf);
                            String valueOf5 = String.valueOf((String) list.get(i2));
                            list.set(i2, valueOf5.length() == 0 ? new String(valueOf4) : valueOf4.concat(valueOf5));
                        }
                    }
                }
                abcx.m47493a(abfb.f57328b, abfb.f57329c, abfb.f57332f, true);
            }
            a.mo32057a(abfb.f57331e.mo31884a(a.mo32059c(), abfb.f57329c.f78827b));
            aazq.m47334a(abfb.f57328b, abfb.f57329c);
            while (true) {
                if (i >= a.mo32054a()) {
                    break;
                }
                aasm a2 = a.mo32055a(i);
                if (a2 != null && a2.f56506p) {
                    aasa a3 = new aasc(abfb.f57328b, abfb.f57329c).mo31695a();
                    a3.mo31689a("promoted_content_title", a2.f56496f);
                    a3.mo31689a("promoted_content_snippet", a2.mo31735r());
                    a3.mo31689a("promoted_content_url", a2.f56497g);
                    a3.mo31689a("promoted_content_image_base64", a2.f56507q);
                    a3.mo31689a("promoted_content_external_link_text", a2.f56508r);
                    a3.mo31687a("promoted_content_version", a2.f56514x);
                    a3.mo31687a("promoted_content_placement", a2.mo31742x().f170973d);
                    a3.mo31685a();
                    a.f57323b.remove(a2.f56492b);
                    break;
                }
                i++;
            }
            abfb.f57331e.mo31888a(a, abfb.f57329c.f78827b);
        } else if (abfb.f57329c.mo43207B()) {
            abcx.m47493a(abfb.f57328b, abfb.f57329c, abfb.f57332f, false);
        }
        GoogleHelpChimeraService.m66613a(abfb.f57329c);
    }
}
