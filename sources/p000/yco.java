package p000;

import android.content.DialogInterface;
import com.felicanetworks.mfc.C0126R;

/* renamed from: yco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yco implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ ycp f53604a;

    public yco(ycp ycp) {
        this.f53604a = ycp;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f53604a.f53606b.f53613a.getButton(-1).setTextColor(this.f53604a.f53606b.f53617f.getResources().getColor(C0126R.color.google_blue500));
    }
}
