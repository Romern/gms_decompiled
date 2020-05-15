package p000;

import android.content.Context;
import android.view.View;
import com.google.android.gms.mdi.download.p054ui.DebugUiChimeraActivity;

/* renamed from: afpx */
public final /* synthetic */ class afpx implements View.OnClickListener {

    /* renamed from: a */
    private final DebugUiChimeraActivity f64532a;

    public afpx(DebugUiChimeraActivity debugUiChimeraActivity) {
        this.f64532a = debugUiChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rjx.<init>(android.content.Context, boolean[]):void
     arg types: [com.google.android.gms.mdi.download.ui.DebugUiChimeraActivity, ?[OBJECT, ARRAY]]
     candidates:
      rjx.<init>(android.content.Context, allq):void
      rjx.<init>(android.content.Context, auzy):void
      rjx.<init>(android.content.Context, avty):void
      rjx.<init>(android.content.Context, rjg):void
      rjx.<init>(android.content.Context, rjw):void
      rjx.<init>(android.content.Context, byte[]):void
      rjx.<init>(android.content.Context, char[]):void
      rjx.<init>(android.content.Context, float[]):void
      rjx.<init>(android.content.Context, int[]):void
      rjx.<init>(android.content.Context, short[]):void
      rjx.<init>(android.content.Context, boolean[]):void */
    public void onClick(View view) {
        DebugUiChimeraActivity debugUiChimeraActivity = this.f64532a;
        rjx rjx = new rjx((Context) debugUiChimeraActivity, (boolean[]) null);
        rjx.mo24705a(true).mo50373a(new afqe(debugUiChimeraActivity, rjx));
    }
}
