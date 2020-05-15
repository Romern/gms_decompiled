package p000;

/* renamed from: asho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class asho {
    /* renamed from: a */
    public final void mo49160a(ashf ashf) {
        try {
            mo49159a(ashf.mo49154a());
        } catch (camq e) {
            int i = e.f175310a;
            if (i == 401 || i == 403) {
                ashf.mo49155b();
                mo49159a(ashf.mo49154a());
                return;
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo49159a(String str);
}
