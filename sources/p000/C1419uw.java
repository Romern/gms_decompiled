package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: uw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1419uw extends ActionMode {

    /* renamed from: a */
    final Context f27289a;

    /* renamed from: b */
    final C1414ur f27290b;

    public C1419uw(Context context, C1414ur urVar) {
        this.f27289a = context;
        this.f27290b = urVar;
    }

    public final void finish() {
        this.f27290b.mo16030c();
    }

    public final View getCustomView() {
        return this.f27290b.mo16035h();
    }

    public final Menu getMenu() {
        return new C1461wk(this.f27289a, (C1179lz) this.f27290b.mo16027b());
    }

    public final MenuInflater getMenuInflater() {
        return this.f27290b.mo16022a();
    }

    public final CharSequence getSubtitle() {
        return this.f27290b.mo16033f();
    }

    public final Object getTag() {
        return this.f27290b.f27272d;
    }

    public final CharSequence getTitle() {
        return this.f27290b.mo16032e();
    }

    public final boolean getTitleOptionalHint() {
        return this.f27290b.f27273e;
    }

    public final void invalidate() {
        this.f27290b.mo16031d();
    }

    public final boolean isTitleOptional() {
        return this.f27290b.mo16034g();
    }

    public final void setCustomView(View view) {
        this.f27290b.mo16024a(view);
    }

    public final void setSubtitle(int i) {
        this.f27290b.mo16028b(i);
    }

    public final void setTag(Object obj) {
        this.f27290b.f27272d = obj;
    }

    public final void setTitle(int i) {
        this.f27290b.mo16023a(i);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f27290b.mo16026a(z);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f27290b.mo16025a(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f27290b.mo16029b(charSequence);
    }
}
