package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import com.android.setupwizardlib.TemplateLayout;
import com.android.setupwizardlib.view.HeaderRecyclerView;

@Deprecated
/* renamed from: bmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmv implements bmt {

    /* renamed from: a */
    public final TemplateLayout f5170a;

    /* renamed from: b */
    public final RecyclerView f5171b;

    /* renamed from: c */
    public View f5172c;

    /* renamed from: d */
    public Drawable f5173d;

    /* renamed from: e */
    private final blx f5174e = new blx(this.f5170a.getContext());

    /* renamed from: f */
    private Drawable f5175f;

    /* renamed from: g */
    private int f5176g;

    /* renamed from: h */
    private int f5177h;

    public bmv(TemplateLayout templateLayout, RecyclerView recyclerView) {
        this.f5170a = templateLayout;
        this.f5171b = recyclerView;
        this.f5170a.getContext();
        recyclerView.setLayoutManager(new aah());
        if (recyclerView instanceof HeaderRecyclerView) {
            this.f5172c = ((HeaderRecyclerView) recyclerView).f7236a;
        }
        this.f5171b.addItemDecoration(this.f5174e);
    }

    /* renamed from: a */
    public final void mo3289a() {
        InsetDrawable insetDrawable;
        int i = Build.VERSION.SDK_INT;
        if (this.f5170a.isLayoutDirectionResolved()) {
            if (this.f5175f == null) {
                this.f5175f = this.f5174e.f5125a;
            }
            Drawable drawable = this.f5175f;
            int i2 = this.f5176g;
            int i3 = this.f5177h;
            TemplateLayout templateLayout = this.f5170a;
            int i4 = Build.VERSION.SDK_INT;
            if (templateLayout.getLayoutDirection() == 1) {
                insetDrawable = new InsetDrawable(drawable, i3, 0, i2, 0);
            } else {
                insetDrawable = new InsetDrawable(drawable, i2, 0, i3, 0);
            }
            this.f5173d = insetDrawable;
            this.f5174e.mo3256a(insetDrawable);
        }
    }

    /* renamed from: a */
    public final void mo3290a(int i, int i2) {
        this.f5176g = i;
        this.f5177h = i2;
        mo3289a();
    }

    /* renamed from: a */
    public final void mo3291a(abh abh) {
        this.f5171b.setAdapter(abh);
    }
}
