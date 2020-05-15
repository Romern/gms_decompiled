package p000;

import java.io.InputStream;

/* renamed from: cdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cdb implements cdd {

    /* renamed from: a */
    final /* synthetic */ InputStream f6566a;

    /* renamed from: b */
    final /* synthetic */ cgr f6567b;

    public cdb(InputStream inputStream, cgr cgr) {
        this.f6566a = inputStream;
        this.f6567b = cgr;
    }

    /* renamed from: a */
    public final int mo3731a(ccx ccx) {
        try {
            return ccx.mo3726a(this.f6566a, this.f6567b);
        } finally {
            this.f6566a.reset();
        }
    }
}
