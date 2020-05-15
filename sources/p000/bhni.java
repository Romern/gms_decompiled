package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: bhni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhni implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ bhnk f119129a;

    public bhni(bhnk bhnk) {
        this.f119129a = bhnk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r0.f119137d == r4) goto L_0x0018;
     */
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        bhnk bhnk = this.f119129a;
        bhnj bhnj = (bhnj) message.obj;
        synchronized (bhnk.f119134a) {
            if (bhnk.f119136c == bhnj) {
            }
            bhnk.mo64039a(bhnj, 2);
        }
        return true;
    }
}
