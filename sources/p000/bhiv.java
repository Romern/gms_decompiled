package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* renamed from: bhiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhiv {

    /* renamed from: A */
    static final int[] f118741A = new int[0];

    /* renamed from: E */
    public static final /* synthetic */ int f118742E = 0;

    /* renamed from: a */
    static final TimeInterpolator f118743a = bhdl.f118329c;

    /* renamed from: v */
    static final int[] f118744v = {16842919, 16842910};

    /* renamed from: w */
    static final int[] f118745w = {16843623, 16842908, 16842910};

    /* renamed from: x */
    static final int[] f118746x = {16842908, 16842910};

    /* renamed from: y */
    static final int[] f118747y = {16843623, 16842910};

    /* renamed from: z */
    static final int[] f118748z = {16842910};

    /* renamed from: B */
    public final FloatingActionButton f118749B;

    /* renamed from: C */
    public ViewTreeObserver.OnPreDrawListener f118750C;

    /* renamed from: D */
    final bhil f118751D;

    /* renamed from: F */
    private final bhka f118752F;

    /* renamed from: G */
    private final Rect f118753G = new Rect();

    /* renamed from: H */
    private final RectF f118754H = new RectF();

    /* renamed from: I */
    private final RectF f118755I = new RectF();

    /* renamed from: J */
    private final Matrix f118756J = new Matrix();

    /* renamed from: b */
    bhlx f118757b;

    /* renamed from: c */
    public bhlr f118758c;

    /* renamed from: d */
    Drawable f118759d;

    /* renamed from: e */
    public bhih f118760e;

    /* renamed from: f */
    Drawable f118761f;

    /* renamed from: g */
    public boolean f118762g;

    /* renamed from: h */
    final boolean f118763h = true;

    /* renamed from: i */
    public float f118764i;

    /* renamed from: j */
    public float f118765j;

    /* renamed from: k */
    public float f118766k;

    /* renamed from: l */
    public int f118767l;

    /* renamed from: m */
    public bhdp f118768m;

    /* renamed from: n */
    public bhdp f118769n;

    /* renamed from: o */
    public Animator f118770o;

    /* renamed from: p */
    public bhdp f118771p;

    /* renamed from: q */
    public bhdp f118772q;

    /* renamed from: r */
    public float f118773r;

    /* renamed from: s */
    public float f118774s = 1.0f;

    /* renamed from: t */
    public int f118775t;

    /* renamed from: u */
    public int f118776u = 0;

    public bhiv(FloatingActionButton floatingActionButton, bhil bhil) {
        this.f118749B = floatingActionButton;
        this.f118751D = bhil;
        bhka bhka = new bhka();
        this.f118752F = bhka;
        bhka.mo63893a(f118744v, m100941a(new bhis(this)));
        this.f118752F.mo63893a(f118745w, m100941a(new bhir(this)));
        this.f118752F.mo63893a(f118746x, m100941a(new bhir(this)));
        this.f118752F.mo63893a(f118747y, m100941a(new bhir(this)));
        this.f118752F.mo63893a(f118748z, m100941a(new bhit(this)));
        this.f118752F.mo63893a(f118741A, m100941a(new bhiq(this)));
        this.f118773r = this.f118749B.getRotation();
    }

    /* renamed from: a */
    private static final ValueAnimator m100941a(bhiu bhiu) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f118743a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(bhiu);
        valueAnimator.addUpdateListener(bhiu);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: a */
    public float mo63823a() {
        return this.f118764i;
    }

    /* renamed from: b */
    public final void mo63831b() {
        mo63825a(this.f118774s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo63833c() {
        return !this.f118762g || this.f118749B.mo71165b() >= this.f118767l;
    }

    /* renamed from: d */
    public void mo63834d() {
        bhka bhka = this.f118752F;
        ValueAnimator valueAnimator = bhka.f118890c;
        if (valueAnimator != null) {
            valueAnimator.end();
            bhka.f118890c = null;
        }
    }

    /* renamed from: e */
    public final void mo63835e() {
        Rect rect = this.f118753G;
        mo63828a(rect);
        C1244oj.m19767a(this.f118761f, "Didn't initialize content background");
        if (mo63836f()) {
            this.f118751D.mo63812a(new InsetDrawable(this.f118761f, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.f118751D.mo63812a(this.f118761f);
        }
        bhil bhil = this.f118751D;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        bhil.f118728a.f151184c.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = bhil.f118728a;
        int i5 = floatingActionButton.f151182a;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    /* renamed from: f */
    public boolean mo63836f() {
        return true;
    }

    /* renamed from: g */
    public boolean mo63837g() {
        return true;
    }

    /* renamed from: h */
    public bhlr mo63838h() {
        bhlx bhlx = this.f118757b;
        C1244oj.m19766a(bhlx);
        return new bhlr(bhlx);
    }

    /* renamed from: i */
    public final boolean mo63839i() {
        return C1280ps.m19868C(this.f118749B) && !this.f118749B.isInEditMode();
    }

    /* renamed from: j */
    public void mo63840j() {
        int i = Build.VERSION.SDK_INT;
        bhlr bhlr = this.f118758c;
        if (bhlr != null) {
            bhlr.mo63946b((int) this.f118773r);
        }
    }

    /* renamed from: a */
    private final void m100942a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f118749B.getDrawable();
        if (drawable != null && this.f118775t != 0) {
            RectF rectF = this.f118754H;
            RectF rectF2 = this.f118755I;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f2 = (float) this.f118775t;
            rectF2.set(0.0f, 0.0f, f2, f2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f3 = ((float) this.f118775t) / 2.0f;
            matrix.postScale(f, f, f3, f3);
        }
    }

    /* renamed from: b */
    public final void mo63832b(float f) {
        bhlr bhlr = this.f118758c;
        if (bhlr != null) {
            bhlr.mo63949d(f);
        }
    }

    /* renamed from: a */
    public final AnimatorSet mo63824a(bhdp bhdp, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f118749B, View.ALPHA, f);
        bhdp.mo63572a("opacity").mo63577a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f118749B, View.SCALE_X, f2);
        bhdp.mo63572a("scale").mo63577a(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f118749B, View.SCALE_Y, f2);
        bhdp.mo63572a("scale").mo63577a(ofFloat3);
        int i2 = Build.VERSION.SDK_INT;
        arrayList.add(ofFloat3);
        m100942a(f3, this.f118756J);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f118749B, new bhdn(), new bhio(this), new Matrix(this.f118756J));
        bhdp.mo63572a("iconScale").mo63577a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        bhdm.m100677a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: a */
    public final void mo63825a(float f) {
        this.f118774s = f;
        Matrix matrix = this.f118756J;
        m100942a(f, matrix);
        this.f118749B.setImageMatrix(matrix);
    }

    /* renamed from: a */
    public void mo63826a(float f, float f2, float f3) {
        mo63835e();
        mo63832b(f);
    }

    /* renamed from: a */
    public void mo63827a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        bhlr h = mo63838h();
        this.f118758c = h;
        h.setTintList(colorStateList);
        if (mode != null) {
            this.f118758c.setTintMode(mode);
        }
        this.f118758c.mo63968s();
        this.f118758c.mo63942a(this.f118749B.getContext());
        bhlf bhlf = new bhlf(new bhle(new bhlr(this.f118758c.mo63954h())));
        bhlf.setTintList(bhlg.m101096b(colorStateList2));
        this.f118759d = bhlf;
        bhlr bhlr = this.f118758c;
        C1244oj.m19766a(bhlr);
        this.f118761f = new LayerDrawable(new Drawable[]{bhlr, bhlf});
    }

    /* renamed from: a */
    public void mo63828a(Rect rect) {
        int i;
        if (this.f118762g) {
            i = (this.f118767l - this.f118749B.mo71165b()) / 2;
        } else {
            i = 0;
        }
        float a = this.f118763h ? mo63823a() + this.f118766k : 0.0f;
        int max = Math.max(i, (int) Math.ceil((double) a));
        int max2 = Math.max(i, (int) Math.ceil((double) (a * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: a */
    public final void mo63829a(bhlx bhlx) {
        this.f118757b = bhlx;
        bhlr bhlr = this.f118758c;
        if (bhlr != null) {
            bhlr.mo63916a(bhlx);
        }
        Drawable drawable = this.f118759d;
        if (drawable instanceof bhmg) {
            ((bhmg) drawable).mo63916a(bhlx);
        }
        bhih bhih = this.f118760e;
        if (bhih != null) {
            bhih.f118714h = bhlx;
            bhih.invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo63830a(int[] iArr) {
        bhjz bhjz;
        ValueAnimator valueAnimator;
        bhka bhka = this.f118752F;
        int size = bhka.f118888a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bhjz = null;
                break;
            }
            bhjz = (bhjz) bhka.f118888a.get(i);
            if (StateSet.stateSetMatches(bhjz.f118886a, iArr)) {
                break;
            }
            i++;
        }
        bhjz bhjz2 = bhka.f118889b;
        if (bhjz != bhjz2) {
            if (!(bhjz2 == null || (valueAnimator = bhka.f118890c) == null)) {
                valueAnimator.cancel();
                bhka.f118890c = null;
            }
            bhka.f118889b = bhjz;
            if (bhjz != null) {
                bhka.f118890c = bhjz.f118887b;
                bhka.f118890c.start();
            }
        }
    }
}
