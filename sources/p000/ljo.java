package p000;

/* renamed from: ljo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ljo implements bqfp {

    /* renamed from: a */
    final /* synthetic */ ljq f26201a;

    public ljo(ljq ljq) {
        this.f26201a = ljq;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ljq ljq = this.f26201a;
            if (ljq.f26206h.compareAndSet(false, true)) {
                bxvd da = lad.f25522f.mo74144da();
                String str = ljq.f26204f.f23841b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lad lad = (lad) da.f164949b;
                str.getClass();
                lad.f25524a = str;
                String str2 = ljq.f26205g.f23841b;
                str2.getClass();
                lad.f25525b = str2;
                lad.f25526c = lac.m18843a(3);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lad lad2 = (lad) da.f164949b;
                lad2.f25528e = true;
                lad2.f25527d = false;
                ljq.f26203e.mo14905f(new ljm(da));
            }
            this.f26201a.mo15208i();
            return;
        }
        this.f26201a.mo15204h();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) ljq.f26202d.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68405a("Failed to read whitelist data.");
        this.f26201a.mo15204h();
    }
}
