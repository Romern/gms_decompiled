package p000;

import android.app.Dialog;
import android.content.Context;

/* renamed from: bjlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjlt extends Dialog {

    /* renamed from: a */
    final /* synthetic */ bjlu f122947a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bjlt(bjlu bjlu, Context context) {
        super(context);
        this.f122947a = bjlu;
    }

    public final void onBackPressed() {
        this.f122947a.f122948a.mo65299E();
    }
}
