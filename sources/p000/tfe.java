package p000;

import android.view.View;

/* renamed from: tfe */
final /* synthetic */ class tfe implements View.OnLongClickListener {

    /* renamed from: a */
    private final tff f45819a;

    /* renamed from: b */
    private final String f45820b;

    public tfe(tff tff, String str) {
        this.f45819a = tff;
        this.f45820b = str;
    }

    public final boolean onLongClick(View view) {
        tff tff = this.f45819a;
        the.m36959a(tff.getContext(), this.f45820b).show();
        return true;
    }
}
