package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.List;

/* renamed from: zdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zdz implements bqfp {

    /* renamed from: a */
    final /* synthetic */ yqe f54991a;

    /* renamed from: b */
    final /* synthetic */ caah f54992b;

    /* renamed from: c */
    final /* synthetic */ zkh f54993c;

    /* renamed from: d */
    final /* synthetic */ zeb f54994d;

    /* renamed from: e */
    final /* synthetic */ int f54995e;

    public zdz(zeb zeb, yqe yqe, caah caah, int i, zkh zkh) {
        this.f54994d = zeb;
        this.f54991a = yqe;
        this.f54992b = caah;
        this.f54995e = i;
        this.f54993c = zkh;
    }

    /* renamed from: a */
    private final void m45350a() {
        int i;
        String str = this.f54991a.f54380a;
        List list = (List) this.f54994d.f54999b.get(str);
        if (list != null) {
            list.remove(this.f54993c);
            if (list.isEmpty()) {
                this.f54994d.f54999b.remove(str, bngx.m109376e());
            }
            zeb zeb = this.f54994d;
            caah caah = this.f54992b;
            if (this.f54995e != 3) {
                i = MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA;
            } else {
                i = MfiClientException.TYPE_NO_ACCOUNT_INFO;
            }
            zeb.mo30971a(caah, i);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        int i;
        if (((Boolean) obj).booleanValue()) {
            srn srn = zeb.f54998a;
            zeb zeb = this.f54994d;
            caah caah = this.f54992b;
            if (this.f54995e != 3) {
                i = 48;
            } else {
                i = 49;
            }
            zeb.mo30971a(caah, i);
            return;
        }
        ((bnsl) zeb.f54998a.mo68387b()).mo68420a("Failed to add recording listener for %s", this.f54991a);
        m45350a();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) zeb.f54998a.mo68387b();
        bnsl.mo68437a(th);
        bnsl.mo68420a("Failed to add recording listener for %s", this.f54991a);
        m45350a();
    }
}
