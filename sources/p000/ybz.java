package p000;

import android.content.DialogInterface;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ybz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ybz implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ ycc f53578a;

    public ybz(ycc ycc) {
        this.f53578a = ycc;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f53578a.f53583b.getButton(-1).setTextColor(this.f53578a.f53582a.getResources().getColor(C0126R.color.google_blue500));
    }
}
