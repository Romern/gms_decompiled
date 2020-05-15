package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;

/* renamed from: bhfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhfu {

    /* renamed from: a */
    public final MaterialButton f118486a;

    /* renamed from: b */
    public bhlx f118487b;

    /* renamed from: c */
    public int f118488c;

    /* renamed from: d */
    public int f118489d;

    /* renamed from: e */
    public int f118490e;

    /* renamed from: f */
    public int f118491f;

    /* renamed from: g */
    public int f118492g;

    /* renamed from: h */
    public int f118493h;

    /* renamed from: i */
    public PorterDuff.Mode f118494i;

    /* renamed from: j */
    public ColorStateList f118495j;

    /* renamed from: k */
    public ColorStateList f118496k;

    /* renamed from: l */
    public ColorStateList f118497l;

    /* renamed from: m */
    public Drawable f118498m;

    /* renamed from: n */
    public boolean f118499n = false;

    /* renamed from: o */
    public boolean f118500o = false;

    /* renamed from: p */
    public boolean f118501p;

    /* renamed from: q */
    public LayerDrawable f118502q;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public bhfu(MaterialButton materialButton, bhlx bhlx) {
        this.f118486a = materialButton;
        this.f118487b = bhlx;
    }

    /* renamed from: a */
    private final bhlr m100798a(boolean z) {
        LayerDrawable layerDrawable = this.f118502q;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (bhlr) ((LayerDrawable) ((InsetDrawable) this.f118502q.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: e */
    private final bhlr m100799e() {
        return m100798a(true);
    }

    /* renamed from: b */
    public final void mo63674b() {
        bhlr c = mo63675c();
        bhlr e = m100799e();
        if (c != null) {
            c.mo63941a((float) this.f118493h, this.f118496k);
            if (e != null) {
                e.mo63940a((float) this.f118493h, 0);
            }
        }
    }

    /* renamed from: c */
    public final bhlr mo63675c() {
        return m100798a(false);
    }

    /* renamed from: d */
    public final bhmg mo63676d() {
        LayerDrawable layerDrawable = this.f118502q;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f118502q.getNumberOfLayers() > 2) {
            return (bhmg) this.f118502q.getDrawable(2);
        }
        return (bhmg) this.f118502q.getDrawable(1);
    }

    /* renamed from: a */
    public final void mo63672a() {
        this.f118499n = true;
        this.f118486a.mo71041a(this.f118495j);
        this.f118486a.mo71042a(this.f118494i);
    }

    /* renamed from: a */
    public final void mo63673a(bhlx bhlx) {
        this.f118487b = bhlx;
        if (mo63675c() != null) {
            mo63675c().mo63916a(bhlx);
        }
        if (m100799e() != null) {
            m100799e().mo63916a(bhlx);
        }
        if (mo63676d() != null) {
            mo63676d().mo63916a(bhlx);
        }
    }
}
