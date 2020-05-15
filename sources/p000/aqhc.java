package p000;

import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.setupdesign.items.Item;

/* renamed from: aqhc */
final /* synthetic */ class aqhc implements bizt {

    /* renamed from: a */
    private final GoogleServicesChimeraActivity f86103a;

    public aqhc(GoogleServicesChimeraActivity googleServicesChimeraActivity) {
        this.f86103a = googleServicesChimeraActivity;
    }

    /* renamed from: a */
    public final void mo47885a(bizl bizl) {
        GoogleServicesChimeraActivity googleServicesChimeraActivity = this.f86103a;
        if (!(bizl instanceof Item)) {
            sek sek = GoogleServicesChimeraActivity.f107625c;
            String valueOf = String.valueOf(bizl);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("item is not an instanceof Item: ");
            sb.append(valueOf);
            sek.mo25418e(sb.toString(), new Object[0]);
            return;
        }
        googleServicesChimeraActivity.mo58956a((String) null, ((Item) bizl).f151489c);
    }
}
