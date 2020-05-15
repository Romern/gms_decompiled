package p000;

import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;

/* renamed from: aqhe */
public final /* synthetic */ class aqhe implements aubq {

    /* renamed from: a */
    public static final aubq f86105a = new aqhe();

    private aqhe() {
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        sek sek = GoogleServicesChimeraActivity.f107625c;
        if (aucb.mo50384b()) {
            sek sek2 = GoogleServicesChimeraActivity.f107625c;
            String valueOf = String.valueOf(aucb.mo50386d());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Audit recorded. result=");
            sb.append(valueOf);
            sek2.mo25414c(sb.toString(), new Object[0]);
            return;
        }
        GoogleServicesChimeraActivity.f107625c.mo25419f("Exception writing audit records", aucb.mo50387e(), new Object[0]);
    }
}
