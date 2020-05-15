package p000;

import com.google.android.gms.pay.PayCardArtInfo;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;
import java.util.ArrayList;

/* renamed from: atnx */
public final /* synthetic */ class atnx implements aubt {

    /* renamed from: a */
    private final TapUiChimeraActivity f90575a;

    /* renamed from: b */
    private final ArrayList f90576b;

    public atnx(TapUiChimeraActivity tapUiChimeraActivity, ArrayList arrayList) {
        this.f90575a = tapUiChimeraActivity;
        this.f90576b = arrayList;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        TapUiChimeraActivity tapUiChimeraActivity = this.f90575a;
        ArrayList arrayList = this.f90576b;
        bnsl bnsl = (bnsl) TapUiChimeraActivity.f108685b.mo68387b();
        bnsl.mo68437a(exc);
        bnsl.mo68405a("Fetching card art failed.");
        tapUiChimeraActivity.f108723p = ((PayCardArtInfo) arrayList.get(0)).f81541a;
    }
}
