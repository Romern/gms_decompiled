package p000;

import android.os.Looper;
import android.os.Message;

/* renamed from: roa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class roa extends adzt {

    /* renamed from: a */
    final /* synthetic */ rod f43425a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public roa(rod rod, Looper looper) {
        super(looper);
        this.f43425a = rod;
    }

    public final void handleMessage(Message message) {
        boolean z = true;
        if (message.what != 1) {
            z = false;
        }
        sdo.m34974b(z);
        roc roc = (roc) message.obj;
        Object obj = this.f43425a.f43428a;
        if (obj != null) {
            try {
                roc.mo11649a(obj);
            } catch (RuntimeException e) {
                roc.mo11648a();
                throw e;
            }
        } else {
            roc.mo11648a();
        }
    }
}
