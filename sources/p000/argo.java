package p000;

import com.google.android.gms.phenotype.Configurations;

/* renamed from: argo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class argo implements aubw {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        Logger Logger = argr.f87699a;
        String valueOf = String.valueOf((Configurations) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
        sb.append("Syncing smartdevice configuration successfully. configs=");
        sb.append(valueOf);
        Logger.mo25412b(sb.toString(), new Object[0]);
    }
}
