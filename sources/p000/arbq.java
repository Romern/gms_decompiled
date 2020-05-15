package p000;

/* renamed from: arbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arbq extends ahia {

    /* renamed from: a */
    final /* synthetic */ arbr f87296a;

    /* renamed from: b */
    private final String f87297b;

    public arbq(arbr arbr, String str) {
        this.f87296a = arbr;
        this.f87297b = str;
    }

    /* renamed from: a */
    public final void mo20142a(String str) {
        this.f87296a.mo48371a(str);
    }

    /* renamed from: a */
    public final void mo20144a(String str, ahhz ahhz) {
        String str2 = this.f87296a.f87304g;
        if (str2 != null && str2.equals(str)) {
            Logger Logger = arbr.f87299b;
            String str3 = ahhz.f67228a;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 36 + String.valueOf(str).length());
            sb.append("Connection initiated from device:");
            sb.append(str3);
            sb.append(" (");
            sb.append(str);
            sb.append(")");
            Logger.logVerbose(sb.toString(), new Object[0]);
            String str4 = ahhz.f67229b;
            this.f87296a.f87305h = arhn.m72767a(2, str4, sqd.m35966a(this.f87297b));
            arbr arbr = this.f87296a;
            ahie ahie = arbr.f87300c;
            if (ahie != null) {
                ahie.mo36521a(str, new arnm(arbr.f87301d, arbr.f87311n));
                return;
            }
            return;
        }
        Logger logger2 = arbr.f87299b;
        String str5 = this.f87296a.f87304g;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 84 + String.valueOf(str5).length());
        sb2.append("Connection endpoint id (");
        sb2.append(str);
        sb2.append(") does not match endpoint ID we connected with (");
        sb2.append(str5);
        sb2.append(")! Skipping.");
        logger2.mo25416d(sb2.toString(), new Object[0]);
    }

    /* renamed from: a */
    public final void mo20145a(String str, ahid ahid) {
        String str2 = this.f87296a.f87304g;
        if (str2 == null || !str2.equals(str)) {
            Logger Logger = arbr.f87299b;
            String str3 = this.f87296a.f87304g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 84 + String.valueOf(str3).length());
            sb.append("Connection endpoint id (");
            sb.append(str);
            sb.append(") does not match endpoint ID we connected with (");
            sb.append(str3);
            sb.append(")! Skipping.");
            Logger.mo25416d(sb.toString(), new Object[0]);
        } else if (!ahid.f67235a.mo17710c()) {
            arbr.f87299b.mo25418e("Unsuccessful connection.", new Object[0]);
            armu armu = this.f87296a.f87302e;
            if (armu != null) {
                armu.mo48348a(10584);
            }
        } else {
            arbr arbr = this.f87296a;
            aqzd a = arbr.f87308k.mo48295a();
            a.f87135a = true;
            a.f87138d = true;
            arbr.f87308k = a.mo48294a();
        }
    }
}
