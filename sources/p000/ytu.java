package p000;

import android.os.Message;
import android.os.RemoteException;

/* renamed from: ytu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ytu extends snr {

    /* renamed from: b */
    private static final srn f54620b = zvt.m46581a();

    /* renamed from: a */
    public final ytt f54621a;

    /* renamed from: f */
    private final ytv f54622f;

    public ytu(ytt ytt, ytv ytv, sns sns) {
        super(sns);
        this.f54621a = ytt;
        this.f54622f = ytv;
    }

    /* renamed from: a */
    public final void mo30771a(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    public final void handleMessage(Message message) {
        try {
            bmxy.m108596a(this.f54622f.mo30773a(message.what, message.obj, this.f54621a), "Unexpected message %s", message);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f54620b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Error while delivering result of client request %s", message.obj);
        }
    }
}
