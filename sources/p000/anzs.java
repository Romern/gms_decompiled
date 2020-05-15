package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.internal.PlusSession;

/* renamed from: anzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anzs extends anzq implements View.OnClickListener, rjz, rka {

    /* renamed from: i */
    final anzr f77961i = new anzr(this);

    /* renamed from: j */
    private final anul f77962j;

    /* renamed from: k */
    private final anuy f77963k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anzs(Context context, int i, int i2, String str) {
        super(context, i, i2, str);
        anul anul = anuy.f77749a;
        anwk anwk = new anwk(context);
        anwk.mo42335b();
        PlusSession a = anwk.mo42333a();
        this.f77962j = anul;
        anuy a2 = anul.mo42292a(context, a, this, this);
        this.f77963k = a2;
        a2.mo42324a((rjz) this);
        this.f77963k.mo42325a((rka) this);
        mo42496a(this.f77963k);
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        String str = this.f77949g;
        if (str != null) {
            this.f77963k.mo42315a(this.f77961i, str);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        anuy anuy = this.f77963k;
        if (anuy != null && !anuy.mo24648p() && !this.f77963k.mo24649q()) {
            this.f77963k.mo42332x();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        anuy anuy = this.f77963k;
        if (anuy == null) {
            return;
        }
        if (anuy.mo24648p() || this.f77963k.mo24649q()) {
            this.f77963k.mo14032j();
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        int i = connectionResult.f30065c;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Failed to establish connection with status: ");
        sb.append(i);
        Log.w("PlusOneButtonView", sb.toString());
        mo42497b();
    }
}
