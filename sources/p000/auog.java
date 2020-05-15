package p000;

import android.os.Bundle;

/* renamed from: auog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auog implements bqfp {

    /* renamed from: a */
    final /* synthetic */ auol f92190a;

    public auog(auol auol) {
        this.f92190a = auol;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Bundle bundle = (Bundle) obj;
        auol.f92192a.mo50711a("onPostExecute", new Object[0]);
        synchronized (this.f92190a.f92195b) {
            auol auol = this.f92190a;
            auol.f92197d = bundle;
            if (bundle != null) {
                for (auoi auoi : auol.f92196c) {
                    aunx aunx = auol.f92192a;
                    String valueOf = String.valueOf(auoi);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
                    sb.append("listener: ");
                    sb.append(valueOf);
                    aunx.mo50711a(sb.toString(), new Object[0]);
                    auoi.mo50722h();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        auol.f92192a.mo50710a("Failed to retrieve preferences.", th, new Object[0]).mo50706a();
    }
}
