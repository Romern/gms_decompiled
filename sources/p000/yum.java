package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: yum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yum implements bqfp {

    /* renamed from: a */
    private static final srn f54648a = zvt.m46581a();

    /* renamed from: b */
    private final zcl f54649b;

    public yum(zcl zcl) {
        this.f54649b = zcl;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void mo6480a(Status status) {
        try {
            this.f54649b.mo30933a(status);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f54648a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Couldn't send callback to client for %s", status);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) f54648a.mo68387b();
        bnsl.mo68437a(th);
        bnsl.mo68405a("Unhandled exception on request");
        if (th instanceof IOException) {
            mo6480a(new Status(5008));
        } else {
            mo6480a(Status.f30109c);
        }
    }
}
