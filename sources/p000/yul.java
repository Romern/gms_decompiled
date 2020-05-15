package p000;

import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: yul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class yul implements bqfp {

    /* renamed from: a */
    private static final srn f54647a = zvt.m46581a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo30785a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo30786a(IInterface iInterface);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        try {
            mo30786a((IInterface) obj);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f54647a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Couldn't talk to remote service");
            mo30785a();
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) f54647a.mo68387b();
        bnsl.mo68437a(th);
        bnsl.mo68405a("Failed to connect to remote service");
        mo30785a();
    }
}
