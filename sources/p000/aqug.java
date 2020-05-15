package p000;

import android.content.Context;
import android.view.View;

/* renamed from: aqug */
final /* synthetic */ class aqug implements View.OnLongClickListener {

    /* renamed from: a */
    private final Context f86829a;

    /* renamed from: b */
    private final bzhw f86830b;

    public aqug(Context context, bzhw bzhw) {
        this.f86829a = context;
        this.f86830b = bzhw;
    }

    public final boolean onLongClick(View view) {
        tey.m36885a(this.f86829a, this.f86830b.f170130f).show();
        return true;
    }
}
