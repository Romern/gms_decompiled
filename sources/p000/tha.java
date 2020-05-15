package p000;

import android.view.View;

/* renamed from: tha */
final /* synthetic */ class tha implements View.OnLongClickListener {

    /* renamed from: a */
    private final thb f45996a;

    /* renamed from: b */
    private final View f45997b;

    public tha(thb thb, View view) {
        this.f45996a = thb;
        this.f45997b = view;
    }

    public final boolean onLongClick(View view) {
        the.m36959a(this.f45997b.getContext(), this.f45996a.f45998a).show();
        return true;
    }
}
