package p000;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* renamed from: cawf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawf extends cipr {

    /* renamed from: a */
    final /* synthetic */ cawg f176225a;

    public cawf(cawg cawg) {
        this.f176225a = cawg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final IOException mo74998a(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* renamed from: b */
    public final void mo75000b() {
        if (mo86274d()) {
            throw mo74998a((IOException) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74999a() {
        this.f176225a.mo75004b(cavl.CANCEL);
    }
}
