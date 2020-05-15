package p000;

import android.content.Context;
import android.net.Uri;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.data.internal.PlusImageView;

/* renamed from: aoac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoac extends anzq implements View.OnClickListener {

    /* renamed from: i */
    public static final Uri f77977i = sds.m34979a("plus_one_button_popup_beak_up");

    /* renamed from: j */
    public static final Uri f77978j = sds.m34979a("plus_one_button_popup_beak_down");

    /* renamed from: k */
    public static final Uri f77979k = sds.m34979a("plus_one_button_popup_bg");

    /* renamed from: A */
    public final anuw f77980A = new anzw(this);

    /* renamed from: B */
    private final Context f77981B;

    /* renamed from: C */
    private final ImageView f77982C;

    /* renamed from: D */
    private View.OnClickListener f77983D;

    /* renamed from: E */
    private final anul f77984E;

    /* renamed from: F */
    private final Runnable f77985F = new anzt(this);

    /* renamed from: G */
    private final rjz f77986G = new anzx(this);

    /* renamed from: H */
    private final rjz f77987H = new anzy(this);

    /* renamed from: I */
    private final rka f77988I = new anzz(this);

    /* renamed from: J */
    private final rka f77989J = new aoaa(this);

    /* renamed from: K */
    private final String f77990K;

    /* renamed from: l */
    public final Display f77991l;

    /* renamed from: m */
    public PopupWindow f77992m;

    /* renamed from: n */
    public boolean f77993n;

    /* renamed from: o */
    public final ImageView f77994o;

    /* renamed from: p */
    public final anuy f77995p;

    /* renamed from: q */
    public final anuy f77996q;

    /* renamed from: r */
    public antb f77997r;

    /* renamed from: s */
    public anta f77998s;

    /* renamed from: t */
    public ConnectionResult f77999t;

    /* renamed from: u */
    protected boolean f78000u;

    /* renamed from: v */
    protected boolean f78001v;

    /* renamed from: w */
    protected boolean f78002w;

    /* renamed from: x */
    public boolean f78003x;

    /* renamed from: y */
    public final anus f78004y = new anzu(this);

    /* renamed from: z */
    public final anus f78005z = new anzv();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aoac(Context context, int i, int i2, String str, String str2) {
        super(context, i, i2, str);
        anul anul = anuy.f77749a;
        this.f77984E = anul;
        this.f77981B = context;
        this.f77991l = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        ImageView imageView = new ImageView(this.f77981B);
        this.f77994o = imageView;
        imageView.setImageURI(f77977i);
        ImageView imageView2 = new ImageView(this.f77981B);
        this.f77982C = imageView2;
        imageView2.setImageURI(f77979k);
        setOnClickListener(this);
        this.f77990K = str2;
        anwk anwk = new anwk(this.f77981B);
        anwk.mo42334a("https://www.googleapis.com/auth/pos");
        String str3 = this.f77990K;
        if (str3 != null) {
            anwk.f77819a = str3;
        }
        anuy a = this.f77984E.mo42292a(this.f77981B, anwk.mo42333a(), this.f77986G, this.f77988I);
        mo42496a(this.f77995p);
        this.f77995p = a;
        anwk anwk2 = new anwk(this.f77981B);
        anwk2.mo42335b();
        this.f77996q = this.f77984E.mo42292a(this.f77981B, anwk2.mo42333a(), this.f77987H, this.f77989J);
        mo42496a(this.f77995p);
        setTag(new antu(this));
    }

    /* renamed from: a */
    private final void m65680a(FrameLayout frameLayout) {
        Uri uri;
        aoab aoab = new aoab(this, frameLayout);
        ImageView imageView = new ImageView(this.f77981B);
        if (!aoab.f77971a) {
            uri = f77977i;
        } else {
            uri = f77978j;
        }
        imageView.setImageURI(uri);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, aoab.f77974d);
        int i = aoab.f77972b;
        aoab.getClass();
        int i2 = aoab.f77973c;
        aoab.getClass();
        layoutParams.setMargins(i, 0, i2, 0);
        frameLayout.addView(imageView, layoutParams);
        PopupWindow popupWindow = new PopupWindow(frameLayout, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight());
        this.f77992m = popupWindow;
        popupWindow.setOutsideTouchable(true);
        if (this.f77993n) {
            this.f77992m.showAtLocation(this, 51, aoab.f77975e, aoab.f77976f);
            removeCallbacks(this.f77985F);
            postDelayed(this.f77985F, 3000);
        }
    }

    /* renamed from: b */
    private final FrameLayout m65681b(View view) {
        FrameLayout frameLayout = new FrameLayout(this.f77981B);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2));
        return frameLayout;
    }

    /* renamed from: g */
    private final boolean m65682g() {
        return this.f77998s != null;
    }

    /* renamed from: h */
    private final void m65683h() {
        PopupWindow popupWindow;
        if (this.f77993n && (popupWindow = this.f77992m) != null) {
            popupWindow.dismiss();
            this.f77992m = null;
        }
    }

    /* renamed from: i */
    private final void m65684i() {
        String c;
        if (this.f77993n && this.f78000u) {
            this.f78000u = false;
            anta anta = this.f77998s;
            if (anta == null || (c = anta.mo42213c()) == null) {
                mo42498b(3);
                return;
            }
            View a = mo42493a("plus_popup_text");
            ((TextView) a.findViewWithTag("text")).setText(c);
            m65680a(m65681b(a));
        }
    }

    /* renamed from: c */
    public final void mo42499c() {
        super.mo42499c();
        m65683h();
        m65684i();
    }

    /* renamed from: d */
    public final void mo42500d() {
        antb antb;
        super.mo42500d();
        m65683h();
        if (this.f77993n && this.f78000u) {
            this.f78000u = false;
            if (!(this.f77998s == null || (antb = this.f77997r) == null)) {
                String b = antb.mo42215b();
                String c = this.f77998s.mo42213c();
                String a = this.f77997r.mo42214a();
                if (!(c == null || a == null)) {
                    c = String.format(c, a);
                }
                String string = this.f77998s.f77709a.getString("visibility");
                if (!(b == null || c == null || string == null)) {
                    View a2 = mo42493a("plus_popup_confirmation");
                    PlusImageView plusImageView = new PlusImageView(this.f77981B);
                    plusImageView.mo46570a(this.f77995p);
                    float applyDimension = TypedValue.applyDimension(1, 32.0f, getResources().getDisplayMetrics());
                    rzh rzh = new rzh(b);
                    rzh.mo25266a((int) applyDimension);
                    plusImageView.mo46568a(anuc.m65336a(rzh.mo25265a()));
                    ((FrameLayout) a2.findViewWithTag("profile_image")).addView(plusImageView, 0);
                    ((TextView) a2.findViewWithTag("text")).setText(c);
                    m65680a(m65681b(a2));
                    return;
                }
            }
            mo42498b(3);
        }
    }

    /* renamed from: f */
    public final boolean mo42508f() {
        return this.f77995p.mo24648p();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo42508f() && !this.f77995p.mo24649q()) {
            this.f77995p.mo42332x();
        }
        this.f77993n = true;
    }

    public void onClick(View view) {
        this.f77945c.toggle();
        if (this.f78001v) {
            return;
        }
        if (!this.f78003x) {
            this.f78000u = true;
            if (!m65682g()) {
                this.f78000u = false;
                if (this.f77949g != null && mo42508f()) {
                    this.f77995p.mo42315a(this.f78004y, this.f77949g);
                    this.f78001v = true;
                }
            } else if (!m65682g() || !this.f77998s.mo42211a()) {
                if (this.f77949g != null && mo42508f()) {
                    this.f77995p.mo42316a(this.f78004y, this.f77949g, this.f77998s.mo42212b());
                    this.f78001v = true;
                }
            } else if (mo42508f()) {
                this.f77995p.mo42328b(this.f78004y, this.f77949g);
                this.f78001v = true;
            }
            mo42507a(view);
            return;
        }
        mo42507a(view);
        this.f78002w = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (mo42508f() || this.f77995p.mo24649q()) {
            this.f77995p.mo14032j();
        }
        this.f77993n = false;
        PopupWindow popupWindow = this.f77992m;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.f77992m = null;
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != this) {
            this.f77983D = onClickListener;
        } else {
            super.setOnClickListener(this);
        }
    }

    /* renamed from: b */
    public final void mo42497b() {
        super.mo42497b();
        m65683h();
        m65684i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42507a(View view) {
        View.OnClickListener onClickListener = this.f77983D;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
