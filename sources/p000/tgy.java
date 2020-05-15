package p000;

import android.view.View;

/* renamed from: tgy */
public final /* synthetic */ class tgy implements View.OnLongClickListener {

    /* renamed from: a */
    private final tgz f45988a;

    /* renamed from: b */
    private final View f45989b;

    public tgy(tgz tgz, View view) {
        this.f45988a = tgz;
        this.f45989b = view;
    }

    public final boolean onLongClick(View view) {
        the.m36959a(this.f45989b.getContext(), this.f45988a.f45993d).show();
        return true;
    }
}
