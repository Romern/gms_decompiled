package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.widget.SectionIndexer;
import com.felicanetworks.mfc.C0126R;

/* renamed from: voi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class voi {

    /* renamed from: y */
    private static final int[] f49647y = {16842919};

    /* renamed from: z */
    private static final int[] f49648z = new int[0];

    /* renamed from: A */
    private final Paint f49649A;

    /* renamed from: a */
    public final Drawable f49650a;

    /* renamed from: b */
    public final Drawable f49651b;

    /* renamed from: c */
    public final Drawable f49652c;

    /* renamed from: d */
    public final int f49653d;

    /* renamed from: e */
    public final int f49654e;

    /* renamed from: f */
    public int f49655f;

    /* renamed from: g */
    public final RectF f49656g;

    /* renamed from: h */
    public final int f49657h;

    /* renamed from: i */
    public final RecyclerView f49658i;

    /* renamed from: j */
    public boolean f49659j;

    /* renamed from: k */
    public int f49660k;

    /* renamed from: l */
    public int f49661l = -1;

    /* renamed from: m */
    public boolean f49662m;

    /* renamed from: n */
    public Object[] f49663n;

    /* renamed from: o */
    public String f49664o;

    /* renamed from: p */
    public boolean f49665p;

    /* renamed from: q */
    public final voh f49666q;

    /* renamed from: r */
    public int f49667r;

    /* renamed from: s */
    public final Handler f49668s = new adzt();

    /* renamed from: t */
    public abh f49669t;

    /* renamed from: u */
    public SectionIndexer f49670u;

    /* renamed from: v */
    public boolean f49671v;

    /* renamed from: w */
    public final View f49672w;

    /* renamed from: x */
    public final vog f49673x;

    public voi(Context context, RecyclerView recyclerView, View view, vog vog) {
        this.f49658i = recyclerView;
        this.f49672w = view;
        sdo.m34959a(vog);
        this.f49673x = vog;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843574, 16843577});
        this.f49650a = m40920a(context, obtainStyledAttributes.getResourceId(0, C0126R.C0127drawable.drive_scrollbar_handle_accelerated_anim2));
        this.f49654e = context.getResources().getDimensionPixelSize(C0126R.dimen.drive_fastscroll_thumb_width);
        this.f49653d = context.getResources().getDimensionPixelSize(C0126R.dimen.drive_fastscroll_thumb_height);
        this.f49671v = true;
        this.f49651b = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        this.f49652c = m40920a(context, (int) C0126R.C0127drawable.drive_menu_submenu_background);
        this.f49659j = true;
        mo28696d();
        this.f49657h = context.getResources().getDimensionPixelSize(C0126R.dimen.drive_fastscroll_overlay_size);
        this.f49656g = new RectF();
        this.f49666q = new voh(this);
        Paint paint = new Paint();
        this.f49649A = paint;
        paint.setAntiAlias(true);
        this.f49649A.setTextAlign(Paint.Align.CENTER);
        this.f49649A.setTextSize((float) (this.f49657h / 2));
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842806});
        ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(obtainStyledAttributes2.getIndex(0));
        obtainStyledAttributes2.recycle();
        this.f49649A.setColor(colorStateList.getDefaultColor());
        this.f49649A.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f49667r = 0;
        mo28697e();
    }

    /* renamed from: e */
    private final void mo28697e() {
        int[] iArr = this.f49667r != 3 ? f49648z : f49647y;
        Drawable drawable = this.f49650a;
        if (drawable != null && drawable.isStateful()) {
            this.f49650a.setState(iArr);
        }
        Drawable drawable2 = this.f49651b;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f49651b.setState(iArr);
        }
    }

    /* renamed from: b */
    public final int mo28692b() {
        return mo28694c(this.f49658i.getWidth());
    }

    /* renamed from: c */
    public final int mo28694c(int i) {
        if (!vog.LEFT.equals(this.f49673x)) {
            return i - this.f49654e;
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo28696d() {
        abh adapter = this.f49658i.getAdapter();
        this.f49670u = null;
        this.f49669t = adapter;
        if (adapter instanceof vme) {
            vnz vnz = ((vme) adapter).f49492e;
            SectionIndexer sectionIndexer = vnz == null ? vme.f49490d : vnz.f49610a;
            this.f49670u = sectionIndexer;
            this.f49663n = sectionIndexer.getSections();
        } else if (!(adapter instanceof SectionIndexer)) {
            this.f49663n = new String[]{" "};
        } else {
            SectionIndexer sectionIndexer2 = (SectionIndexer) adapter;
            this.f49670u = sectionIndexer2;
            this.f49663n = sectionIndexer2.getSections();
        }
    }

    /* renamed from: a */
    static final Drawable m40920a(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getResources().getDrawable(i, context.getTheme());
    }

    /* renamed from: b */
    public final int mo28693b(int i) {
        return vog.LEFT.equals(this.f49673x) ? this.f49654e : i;
    }

    /* renamed from: c */
    public final void mo28695c() {
        this.f49650a.setBounds(mo28692b(), 0, mo28689a(), this.f49653d);
        this.f49650a.setAlpha(208);
    }

    /* renamed from: a */
    public final int mo28689a() {
        return mo28693b(this.f49658i.getWidth());
    }

    /* renamed from: a */
    public void mo28690a(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.f49672w.invalidate(mo28692b(), this.f49655f, mo28689a(), this.f49655f + this.f49653d);
                    }
                }
            } else if (this.f49667r != 2) {
                mo28695c();
            }
            this.f49668s.removeCallbacks(this.f49666q);
        } else {
            this.f49668s.removeCallbacks(this.f49666q);
            this.f49672w.invalidate();
        }
        this.f49667r = i;
        mo28697e();
    }

    /* renamed from: a */
    public final boolean mo28691a(float f, float f2) {
        if (f <= ((float) mo28692b()) || f >= ((float) mo28689a())) {
            return false;
        }
        int i = this.f49655f;
        return f2 >= ((float) i) && f2 <= ((float) (i + this.f49653d));
    }
}
