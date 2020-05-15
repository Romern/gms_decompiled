package p000;

import android.view.View;

/* renamed from: oyv */
final /* synthetic */ class oyv implements View.OnClickListener {

    /* renamed from: a */
    private final oyy f38637a;

    /* renamed from: b */
    private final boolean f38638b;

    public oyv(oyy oyy, boolean z) {
        this.f38637a = oyy;
        this.f38638b = z;
    }

    public void onClick(View view) {
        oyy oyy = this.f38637a;
        boolean z = this.f38638b;
        if (oyy.mo22803b() != null) {
            oyy.mo22803b().f38656b.mo22797a(oyy.mo22789a(), bpea.FRX_SCREEN_ACCEPT);
            oyy.mo22803b().mo22804a(!z ? 6 : 4);
        }
    }
}
