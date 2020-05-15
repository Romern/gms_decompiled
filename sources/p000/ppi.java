package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: ppi */
final /* synthetic */ class ppi implements Callable {

    /* renamed from: a */
    private final pyy f40018a;

    /* renamed from: b */
    private final ClientContext f40019b;

    public ppi(pyy pyy, ClientContext clientContext) {
        this.f40018a = pyy;
        this.f40019b = clientContext;
    }

    public final Object call() {
        pyy pyy = this.f40018a;
        ClientContext clientContext = this.f40019b;
        bsim bsim = bsim.f144733a;
        if (pyy.f40696c == null) {
            pyy.f40696c = chtv.m149566a(chtu.UNARY, "google.internal.home.foyer.v1.HomeDevicesService/ListDeviceStates", ciie.m150370a(bsim.f144733a), ciie.m150370a(bsin.f144735b));
        }
        return (bsin) pyy.f40697a.mo25553a(pyy.f40696c, clientContext, bsim, (long) pyy.f40695b, TimeUnit.MILLISECONDS);
    }
}
