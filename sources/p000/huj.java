package p000;

import com.google.android.gms.phenotype.Configurations;

/* renamed from: huj */
final /* synthetic */ class huj implements aubw {

    /* renamed from: a */
    static final aubw f20446a = new huj();

    private huj() {
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        sbw sbw = hum.f20450a;
        String valueOf = String.valueOf((Configurations) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("Phenotype configs loaded. configs=");
        sb.append(valueOf);
        sbw.mo25366a("AuthEarlyUpdate", sb.toString());
    }
}
