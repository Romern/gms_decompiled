package p000;

import android.view.View;

/* renamed from: tfd */
final /* synthetic */ class tfd implements View.OnLongClickListener {

    /* renamed from: a */
    private final tfg f45817a;

    /* renamed from: b */
    private final String f45818b;

    public tfd(tfg tfg, String str) {
        this.f45817a = tfg;
        this.f45818b = str;
    }

    public final boolean onLongClick(View view) {
        tfg tfg = this.f45817a;
        the.m36959a(tfg.f45825c.getContext(), this.f45818b).show();
        return true;
    }
}
