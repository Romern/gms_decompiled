package p000;

import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;
import java.util.List;

/* renamed from: atnp */
final /* synthetic */ class atnp implements Runnable {

    /* renamed from: a */
    private final TapUiChimeraActivity f90564a;

    /* renamed from: b */
    private final List f90565b;

    public atnp(TapUiChimeraActivity tapUiChimeraActivity, List list) {
        this.f90564a = tapUiChimeraActivity;
        this.f90565b = list;
    }

    public final void run() {
        this.f90564a.mo59418a(this.f90565b);
    }
}
