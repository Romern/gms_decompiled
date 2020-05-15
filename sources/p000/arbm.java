package p000;

import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: arbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arbm extends ahia {

    /* renamed from: a */
    final /* synthetic */ arbr f87289a;

    public arbm(arbr arbr) {
        this.f87289a = arbr;
    }

    /* renamed from: a */
    public final void mo20142a(String str) {
        this.f87289a.mo48371a(str);
    }

    /* renamed from: a */
    public final void mo20144a(String str, ahhz ahhz) {
        String str2 = this.f87289a.f87304g;
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
            String a = aroa.m73209a(ahhz.f67229b, this.f87289a.f87306i);
            Logger logger2 = arbr.f87299b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 42);
            sb2.append("Forwarding pin (");
            sb2.append(a);
            sb2.append(") to bootstrap controller.");
            logger2.logVerbose(sb2.toString(), new Object[0]);
            if (cgpg.m146449c()) {
                VerificationInfo verificationInfo = new VerificationInfo(a, this.f87289a.f87306i.f135131g);
                armu armu = this.f87289a.f87302e;
                if (armu != null) {
                    armu.mo48350a(verificationInfo);
                    return;
                }
                return;
            }
            armu armu2 = this.f87289a.f87302e;
            if (armu2 != null) {
                armu2.mo48351a(a);
                return;
            }
            return;
        }
        Logger logger3 = arbr.f87299b;
        String str4 = this.f87289a.f87304g;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 84 + String.valueOf(str4).length());
        sb3.append("Connection endpoint id (");
        sb3.append(str);
        sb3.append(") does not match endpoint ID we connected with (");
        sb3.append(str4);
        sb3.append(")! Skipping.");
        logger3.mo25416d(sb3.toString(), new Object[0]);
    }

    /* renamed from: a */
    public final void mo20145a(String str, ahid ahid) {
        String str2 = this.f87289a.f87304g;
        if (str2 == null || !str2.equals(str)) {
            Logger Logger = arbr.f87299b;
            String str3 = this.f87289a.f87304g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 84 + String.valueOf(str3).length());
            sb.append("Connection endpoint id (");
            sb.append(str);
            sb.append(") does not match endpoint ID we connected with (");
            sb.append(str3);
            sb.append(")! Skipping.");
            Logger.mo25416d(sb.toString(), new Object[0]);
        } else if (!ahid.f67235a.mo17710c()) {
            arbr.f87299b.mo25418e("Unsuccessful connection.", new Object[0]);
            arbr.f87299b.mo25412b("Status: %s", ahid.f67235a);
            armu armu = this.f87289a.f87302e;
            if (armu != null) {
                armu.mo48348a(10584);
            }
        } else {
            arbr arbr = this.f87289a;
            aqzd a = arbr.f87308k.mo48295a();
            a.f87135a = true;
            arbr.f87308k = a.mo48294a();
            arbr.f87299b.logVerbose("Connection complete.", new Object[0]);
            arha arha = new arha(this.f87289a.f87300c, str);
            armu armu2 = this.f87289a.f87302e;
            if (armu2 != null) {
                armu2.mo48349a(arha, null);
            }
        }
    }
}
