package com.google.android.gms.feedback;

import android.app.ActivityManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.googlehelp.feedback.Screenshot;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AnnotateScreenshotChimeraActivity extends Activity {

    /* renamed from: a */
    public DrawableView f31484a;

    /* renamed from: b */
    boolean f31485b;

    /* renamed from: c */
    private View f31486c;

    /* renamed from: d */
    private View f31487d;

    /* renamed from: e */
    private View f31488e;

    /* renamed from: f */
    private View f31489f;

    /* renamed from: g */
    private View f31490g;

    /* renamed from: h */
    private View f31491h;

    /* renamed from: i */
    private View f31492i;

    /* renamed from: j */
    private View f31493j;

    /* renamed from: k */
    private FrameLayout f31494k;

    /* renamed from: l */
    private int f31495l;

    /* renamed from: m */
    private int f31496m;

    /* renamed from: n */
    private int f31497n;

    /* renamed from: a */
    private final void m23347a(ImageView imageView) {
        aayh.m47249a(imageView, this, aayi.m47263a(this, C0126R.attr.ghf_greyIconColor));
    }

    /* renamed from: b */
    public final void mo18580b() {
        if (aayi.m47270b() && aayi.m47271b(this, C0126R.attr.gf_isInDarkMode)) {
            findViewById(C0126R.C0129id.gf_select_blackout_view).setBackground(C1133kh.m17836a(this, (int) C0126R.C0127drawable.gf_circle_drawable_blackout_with_stroke));
        }
        this.f31484a.mo18583a((int) cdtr.m134945g(), (int) cdtr.m134944f());
        View view = this.f31487d;
        int i = this.f31497n;
        view.setPadding(i, i, i, i);
        this.f31486c.setPadding(0, 0, 0, 0);
    }

    /* renamed from: c */
    public final void mo18581c() {
        ((LinearLayout) this.f31488e).removeAllViews();
    }

    /* renamed from: d */
    public final void mo18582d() {
        FeedbackChimeraActivity.m23364a(this.f31484a.f31502e);
        finish();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo18582d();
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.setLocation(motionEvent.getX() - ((float) this.f31496m), motionEvent.getY() - ((float) this.f31495l));
        this.f31484a.onTouchEvent(motionEvent);
        return true;
    }

    public final void onWindowFocusChanged(boolean z) {
        int i;
        int i2;
        if (!this.f31485b) {
            if (aaya.m47228a(cefe.m136708b())) {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                if (!FeedbackChimeraActivity.m23368l() ? displayMetrics.widthPixels <= displayMetrics.heightPixels : displayMetrics.heightPixels <= displayMetrics.widthPixels) {
                    if (!FeedbackChimeraActivity.m23369m() || !FeedbackChimeraActivity.f31579m) {
                        Screenshot screenshot = FeedbackChimeraActivity.f31574e.f51515b;
                        ErrorReport g = FeedbackChimeraActivity.f31574e.mo29517g();
                        if (g.f31566v == null) {
                            i2 = screenshot.f78922a;
                            i = screenshot.f78923b;
                        } else {
                            int i3 = g.f31568x;
                            int i4 = g.f31567w;
                            i2 = i3;
                            i = i4;
                        }
                        Rect rect = new Rect();
                        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                        Pair a = wxb.m42439a(getResources(), rect, i2, i, false);
                        new wvb(this, ((Integer) a.first).intValue(), ((Integer) a.second).intValue()).executeOnExecutor(snp.m35702a(9), new Void[0]);
                        return;
                    }
                }
            }
            mo18579a(FeedbackChimeraActivity.f31575f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!FeedbackChimeraActivity.m23369m()) {
            finish();
            return;
        }
        boolean a = aayi.m47267a();
        int i = C0126R.style.gf_DarkActivityStyle;
        if (a) {
            wwy wwy = FeedbackChimeraActivity.f31574e;
            if (wwy != null) {
                ErrorReport g = wwy.mo29517g();
                if (g == null) {
                    setTheme(C0126R.style.gf_DayNightActivityStyle);
                } else {
                    aayi.m47264a(this, g, (int) C0126R.style.gf_LightActivityStyle, (int) C0126R.style.gf_DarkActivityStyle, (int) C0126R.style.gf_DayNightActivityStyle);
                }
            } else {
                setTheme(C0126R.style.gf_DayNightActivityStyle);
            }
        } else if (aayi.m47270b()) {
            wwy wwy2 = FeedbackChimeraActivity.f31574e;
            if (wwy2 == null) {
                i = C0126R.style.gf_LightActivityStyle;
            } else if (!aayi.m47268a(wwy2.mo29517g())) {
                i = C0126R.style.gf_LightActivityStyle;
            }
            setTheme(i);
        } else {
            setTheme(C0126R.style.gf_ActivityStyleDark);
        }
        setContentView((int) C0126R.C0128layout.annotate_screenshot_ui);
        this.f31484a = (DrawableView) findViewById(C0126R.C0129id.gf_drawable_view);
        this.f31486c = findViewById(C0126R.C0129id.gf_blackout_layout);
        this.f31487d = findViewById(C0126R.C0129id.gf_highlight_layout);
        this.f31488e = findViewById(C0126R.C0129id.gf_info_text_layout);
        this.f31489f = findViewById(C0126R.C0129id.gf_menu_layout);
        this.f31490g = findViewById(C0126R.C0129id.gf_close_view);
        this.f31491h = findViewById(C0126R.C0129id.gf_undo_view);
        this.f31492i = findViewById(C0126R.C0129id.gf_done_view);
        this.f31493j = findViewById(C0126R.C0129id.gf_got_it_text_view);
        this.f31494k = (FrameLayout) findViewById(C0126R.C0129id.gf_contain_drawable);
        this.f31497n = (int) getResources().getDimension(C0126R.dimen.gf_selected_border_padding);
        if (aayi.m47270b()) {
            m23347a((ImageView) this.f31490g);
            m23347a((ImageView) this.f31491h);
            m23347a((ImageView) this.f31492i);
        }
        this.f31486c.setOnClickListener(new wuu(this));
        this.f31490g.setOnClickListener(new wuv(this));
        this.f31487d.setOnClickListener(new wuw(this));
        this.f31491h.setOnClickListener(new wux(this));
        this.f31492i.setOnClickListener(new wuy(this));
        this.f31493j.setOnClickListener(new wuz(this));
        new adzt(Looper.getMainLooper()).postDelayed(new wva(this), cdtr.f181715a.mo6606a().mo78316o());
        if (FeedbackChimeraActivity.m23368l()) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(0);
        }
        Intent intent = getIntent();
        if (!aayi.m47270b() && intent != null && intent.hasExtra("EXTRA_ACTION_BAR_COLOR_RES_ID")) {
            int intExtra = intent.getIntExtra("EXTRA_ACTION_BAR_COLOR_RES_ID", -1);
            int i2 = Build.VERSION.SDK_INT;
            if (intExtra != 0) {
                getWindow().setStatusBarColor(C1165lm.m19352a(intExtra, C1133kh.m17843b(this, C0126R.color.material_grey_black_1000), 0.2f));
            }
            String string = getString(C0126R.string.gf_report_feedback);
            int i3 = Build.VERSION.SDK_INT;
            if (intExtra == 0) {
                intExtra = ThemeSettings.m23410a(this);
            }
            setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, intExtra));
        }
    }

    /* renamed from: a */
    public final void mo18578a() {
        if (aayi.m47270b() && aayi.m47271b(this, C0126R.attr.gf_isInDarkMode)) {
            findViewById(C0126R.C0129id.gf_select_blackout_view).setBackground(C1133kh.m17836a(this, (int) C0126R.C0127drawable.gf_circle_drawable_blackout_without_stroke));
        }
        this.f31484a.mo18583a((int) cdtr.f181715a.mo6606a().mo78307f(), (int) cdtr.m134941c());
        View view = this.f31486c;
        int i = this.f31497n;
        view.setPadding(i, i, i, i);
        this.f31487d.setPadding(0, 0, 0, 0);
    }

    /* renamed from: a */
    public final void mo18579a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        this.f31484a.getLayoutParams().width = width;
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        this.f31495l = rect.top + this.f31489f.getHeight() + ((ViewGroup.MarginLayoutParams) this.f31494k.getLayoutParams()).topMargin;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f31496m = (displayMetrics.widthPixels - width) / 2;
        this.f31494k.getLayoutParams().width = width;
        this.f31494k.setLeft(this.f31496m);
        this.f31494k.setRight(displayMetrics.widthPixels - this.f31496m);
        DrawableView drawableView = this.f31484a;
        drawableView.f31499b = bitmap;
        drawableView.f31502e = bitmap.copy(bitmap.getConfig(), true);
        drawableView.f31500c = new Canvas(drawableView.f31499b);
        drawableView.f31500c.drawBitmap(drawableView.f31499b, 0.0f, 0.0f, drawableView.f31498a);
        this.f31485b = true;
    }
}
