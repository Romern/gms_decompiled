package p000;

import com.google.android.gms.pay.GetPayCardArtResponse;
import com.google.android.gms.pay.PayCardArt;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atnw */
public final /* synthetic */ class atnw implements aubw {

    /* renamed from: a */
    private final TapUiChimeraActivity f90574a;

    public atnw(TapUiChimeraActivity tapUiChimeraActivity) {
        this.f90574a = tapUiChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        TapUiChimeraActivity tapUiChimeraActivity = this.f90574a;
        bnre i = bngx.m109370a((Object[]) ((GetPayCardArtResponse) obj).f81494a).listIterator();
        while (i.hasNext()) {
            tapUiChimeraActivity.runOnUiThread(new atny(tapUiChimeraActivity, (PayCardArt) i.next()));
        }
    }
}
