package p000;

import android.content.Context;
import android.os.RemoteException;
import java.io.FileDescriptor;

/* renamed from: qbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qbp extends qbo {

    /* renamed from: c */
    private final FileDescriptor f40901c;

    public qbp(qbn qbn, qbx qbx, FileDescriptor fileDescriptor) {
        super("CollectDataOperation", qbn, qbx);
        this.f40901c = fileDescriptor;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        qbn qbn = this.f40899a;
        qbx qbx = this.f40900b;
        FileDescriptor fileDescriptor = this.f40901c;
        pvc pvc = qbn.f40879f;
        if (pvc != null) {
            qbn.f40886m = qbx;
            pvc.f40384s.execute(new puz(pvc, fileDescriptor));
        } else if (qbx != null) {
            try {
                qbx.mo23897a(2208);
            } catch (RemoteException e) {
            }
        }
    }
}
