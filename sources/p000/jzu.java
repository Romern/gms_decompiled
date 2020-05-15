package p000;

/* renamed from: jzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jzu implements aubt {

    /* renamed from: a */
    final /* synthetic */ kaa f23589a;

    public jzu(kaa kaa) {
        this.f23589a = kaa;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        kaa kaa = this.f23589a;
        int a = ((rjp) exc).mo24655a();
        StringBuilder sb = new StringBuilder(49);
        sb.append("window.onFetchPhoneNumberInfo(");
        sb.append(a);
        sb.append(" , null)");
        kaa.mo14280f(sb.toString());
    }
}
