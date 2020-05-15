package p000;

import android.content.Context;
import android.view.View;
import com.google.android.gms.mdi.download.p054ui.DebugUiChimeraActivity;

/* renamed from: afpv */
public final /* synthetic */ class afpv implements View.OnClickListener {

    /* renamed from: a */
    private final DebugUiChimeraActivity f64530a;

    public afpv(DebugUiChimeraActivity debugUiChimeraActivity) {
        this.f64530a = debugUiChimeraActivity;
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
        DebugUiChimeraActivity debugUiChimeraActivity = this.f64530a;
        rjx rjx = new rjx((Context) debugUiChimeraActivity, (boolean[]) null);
        rjx.mo24761o().mo50373a(new afqa(debugUiChimeraActivity, rjx));
    }
}
