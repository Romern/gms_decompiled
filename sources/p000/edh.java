package p000;

import com.google.android.gms.awareness.snapshot.internal.Snapshot;

/* renamed from: edh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class edh extends dqi {

    /* renamed from: a */
    final /* synthetic */ edn f14723a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public edh(edn edn, String str, Object... objArr) {
        super(str, objArr);
        this.f14723a = edn;
    }

    /* renamed from: a */
    public final void mo9444a(Exception exc) {
        int i;
        edn edn = this.f14723a;
        if (exc instanceof rjp) {
            i = ((rjp) exc).mo24655a();
        } else {
            i = 8;
        }
        edn.mo10003a(i, (Snapshot) null);
    }
}
