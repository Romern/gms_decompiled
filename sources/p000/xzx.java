package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: xzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xzx implements Runnable {

    /* renamed from: i */
    private static final Logger f53493i = new Logger(new String[]{"UsbRequestOperation"}, (short[]) null);

    /* renamed from: a */
    public final xzu f53494a;

    /* renamed from: b */
    private final xwj f53495b;

    /* renamed from: c */
    private final xlm f53496c;

    /* renamed from: d */
    private final xft f53497d;

    /* renamed from: e */
    private final xws f53498e;

    /* renamed from: f */
    private final xfo f53499f;

    /* renamed from: g */
    private final xzy f53500g;

    /* renamed from: h */
    private final Handler f53501h;

    public xzx(Context context, xwj xwj, xlm xlm, xft xft, xws xws, xfo xfo, xzu xzu, Handler handler, xzy xzy) {
        bmxy.m108581a(context);
        bmxy.m108581a(xwj);
        this.f53495b = xwj;
        bmxy.m108581a(xlm);
        this.f53496c = xlm;
        bmxy.m108581a(xft);
        this.f53497d = xft;
        this.f53498e = xws;
        bmxy.m108581a(xfo);
        this.f53499f = xfo;
        bmxy.m108581a(xzu);
        this.f53494a = xzu;
        bmxy.m108581a(handler);
        this.f53501h = handler;
        bmxy.m108581a(xzy);
        this.f53500g = xzy;
    }

    public final void run() {
        ResponseData responseData;
        bqgg c;
        try {
            xfo xfo = this.f53499f;
            this.f53496c.mo29908b().get();
            try {
                responseData = this.f53497d.mo29706a(xfo);
                c = this.f53496c.mo29909c();
            } catch (xfv e) {
                f53493i.mo25417e("Error when communicating with the security key.", e, new Object[0]);
                this.f53498e.mo30184a(this.f53495b, e);
                responseData = e.mo29712a();
                c = this.f53496c.mo29909c();
            }
            c.get();
        } catch (InterruptedException | ExecutionException e2) {
            f53493i.mo25417e("Error when communicating with the security key.", e2, new Object[0]);
            this.f53498e.mo30184a(this.f53495b, adbe.m50109a(e2.getCause()));
            responseData = xfv.m42834a(28416).mo29712a();
        } catch (Throwable th) {
            this.f53496c.mo29909c().get();
            throw th;
        }
        xzy xzy = this.f53500g;
        xfw xfw = xzy.f53505c;
        if (xfw != null) {
            xfw.f52152a = true;
        }
        Future future = xzy.f53503a;
        if (future == null) {
            xzy.f53502d.mo25416d("isCancelled check invoked on Usb request operation that has not been assigned yet", new Object[0]);
        } else if (future.isCancelled()) {
            return;
        }
        this.f53501h.post(new xzv(this, responseData));
    }
}
