package p000;

import android.util.Pair;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azkg extends soa {

    /* renamed from: a */
    final /* synthetic */ CardChimeraActivity f99553a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azkg(CardChimeraActivity cardChimeraActivity) {
        super(9);
        this.f99553a = cardChimeraActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0055, code lost:
        if (p000.azdl.m85417e(r2.f111239w) == 1) goto L_0x0059;
     */
    public final void run() {
        Pair pair;
        if (!cfec.m138765b()) {
            pair = new Pair(Boolean.valueOf(this.f99553a.mo60423z().mo54802x()), Boolean.valueOf(this.f99553a.mo60423z().mo54770e()));
        } else {
            Boolean valueOf = Boolean.valueOf(this.f99553a.mo60423z().mo54802x());
            boolean z = true;
            if (this.f99553a.mo60423z().mo54770e()) {
                this.f99553a.mo60423z();
                CardChimeraActivity cardChimeraActivity = this.f99553a;
                int i = CardChimeraActivity.f111167L;
            }
            z = false;
            pair = new Pair(valueOf, Boolean.valueOf(z));
        }
        this.f99553a.runOnUiThread(new azkf(this, pair));
    }
}
