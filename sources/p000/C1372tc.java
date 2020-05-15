package p000;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.p002v7.app.AppCompatViewInflater;
import android.support.p002v7.view.menu.ExpandedMenuView;
import android.support.p002v7.widget.ActionBarContextView;
import android.support.p002v7.widget.AppCompatEditText;
import android.support.p002v7.widget.AppCompatImageButton;
import android.support.p002v7.widget.AppCompatImageView;
import android.support.p002v7.widget.AppCompatSpinner;
import android.support.p002v7.widget.ContentFrameLayout;
import android.support.p002v7.widget.Toolbar;
import android.support.p002v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.ref.WeakReference;

/* renamed from: tc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1372tc extends C1353sk implements LayoutInflater.Factory2, C1441vr {

    /* renamed from: D */
    private static final C1245ok f27069D = new C1245ok();

    /* renamed from: E */
    private static final int[] f27070E = {16842836};

    /* renamed from: F */
    private static final boolean f27071F = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: G */
    private static final boolean f27072G = true;

    /* renamed from: A */
    int f27073A;

    /* renamed from: B */
    public Rect f27074B;

    /* renamed from: C */
    public Rect f27075C;

    /* renamed from: H */
    private C1363su f27076H;

    /* renamed from: I */
    private CharSequence f27077I;

    /* renamed from: J */
    private C1360sr f27078J;

    /* renamed from: K */
    private C1371tb f27079K;

    /* renamed from: L */
    private boolean f27080L;

    /* renamed from: M */
    private TextView f27081M;

    /* renamed from: N */
    private boolean f27082N;

    /* renamed from: O */
    private boolean f27083O;

    /* renamed from: P */
    private boolean f27084P;

    /* renamed from: Q */
    private C1370ta[] f27085Q;

    /* renamed from: R */
    private boolean f27086R;

    /* renamed from: S */
    private boolean f27087S;

    /* renamed from: T */
    private boolean f27088T;

    /* renamed from: U */
    private boolean f27089U;

    /* renamed from: V */
    private int f27090V = -100;

    /* renamed from: W */
    private int f27091W;

    /* renamed from: X */
    private boolean f27092X;

    /* renamed from: Y */
    private boolean f27093Y;

    /* renamed from: Z */
    private C1366sx f27094Z;

    /* renamed from: aa */
    private C1366sx f27095aa;

    /* renamed from: ab */
    private final Runnable f27096ab = new C1354sl(this);

    /* renamed from: ac */
    private boolean f27097ac;

    /* renamed from: ad */
    private AppCompatViewInflater f27098ad;

    /* renamed from: d */
    final Object f27099d;

    /* renamed from: e */
    final Context f27100e;

    /* renamed from: f */
    public Window f27101f;

    /* renamed from: g */
    final C1352sj f27102g;

    /* renamed from: h */
    C1341rz f27103h;

    /* renamed from: i */
    MenuInflater f27104i;

    /* renamed from: j */
    public C1525yu f27105j;

    /* renamed from: k */
    C1414ur f27106k;

    /* renamed from: l */
    ActionBarContextView f27107l;

    /* renamed from: m */
    public PopupWindow f27108m;

    /* renamed from: n */
    public Runnable f27109n;

    /* renamed from: o */
    C1285px f27110o = null;

    /* renamed from: p */
    public boolean f27111p = true;

    /* renamed from: q */
    ViewGroup f27112q;

    /* renamed from: r */
    public View f27113r;

    /* renamed from: s */
    boolean f27114s;

    /* renamed from: t */
    boolean f27115t;

    /* renamed from: u */
    boolean f27116u;

    /* renamed from: v */
    boolean f27117v;

    /* renamed from: w */
    boolean f27118w;

    /* renamed from: x */
    public C1370ta f27119x;

    /* renamed from: y */
    boolean f27120y;

    /* renamed from: z */
    boolean f27121z;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    public C1372tc(Context context, Window window, C1352sj sjVar, Object obj) {
        Integer num;
        C1351si siVar = null;
        this.f27100e = context;
        this.f27102g = sjVar;
        this.f27099d = obj;
        if (this.f27090V == -100 && (obj instanceof Dialog)) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof C1351si)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        siVar = (C1351si) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (siVar != null) {
                this.f27090V = siVar.mo15921e().mo15950i();
            }
        }
        if (this.f27090V == -100 && (num = (Integer) f27069D.get(this.f27099d.getClass().getName())) != null) {
            this.f27090V = num.intValue();
            f27069D.remove(this.f27099d.getClass().getName());
        }
        if (window != null) {
            m20291a(window);
        }
        C1497xt.m20822a();
    }

    /* renamed from: a */
    private static final Configuration m20290a(Context context, int i, Configuration configuration) {
        int i2;
        if (i != 1) {
            i2 = i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: b */
    private final C1366sx m20293b(Context context) {
        if (this.f27094Z == null) {
            if (C1384to.f27149a == null) {
                Context applicationContext = context.getApplicationContext();
                C1384to.f27149a = new C1384to(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f27094Z = new C1367sy(this, C1384to.f27149a);
        }
        return this.f27094Z;
    }

    /* renamed from: c */
    private final C1366sx m20295c(Context context) {
        if (this.f27095aa == null) {
            this.f27095aa = new C1364sv(this, context);
        }
        return this.f27095aa;
    }

    /* renamed from: g */
    private final void m20296g(int i) {
        this.f27073A = (1 << i) | this.f27073A;
        if (!this.f27121z) {
            C1280ps.m19891a(this.f27101f.getDecorView(), this.f27096ab);
            this.f27121z = true;
        }
    }

    /* renamed from: v */
    private final void m20297v() {
        m20299x();
        if (this.f27114s && this.f27103h == null) {
            Object obj = this.f27099d;
            if (obj instanceof Activity) {
                this.f27103h = new C1389tt((Activity) obj, this.f27115t);
            } else if (obj instanceof Dialog) {
                this.f27103h = new C1389tt((Dialog) obj);
            }
            C1341rz rzVar = this.f27103h;
            if (rzVar != null) {
                rzVar.mo15861d(this.f27097ac);
            }
        }
    }

    /* renamed from: w */
    private final void m20298w() {
        if (this.f27101f == null) {
            Object obj = this.f27099d;
            if (obj instanceof Activity) {
                m20291a(((Activity) obj).getWindow());
            }
        }
        if (this.f27101f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: x */
    private final void m20299x() {
        ViewGroup viewGroup;
        Context context;
        if (!this.f27080L) {
            TypedArray obtainStyledAttributes = this.f27100e.obtainStyledAttributes(C1390tu.f27201j);
            if (obtainStyledAttributes.hasValue(115)) {
                if (obtainStyledAttributes.getBoolean(124, false)) {
                    mo15945d(1);
                } else if (obtainStyledAttributes.getBoolean(115, false)) {
                    mo15945d(108);
                }
                if (obtainStyledAttributes.getBoolean(116, false)) {
                    mo15945d(109);
                }
                if (obtainStyledAttributes.getBoolean(117, false)) {
                    mo15945d(10);
                }
                this.f27117v = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                m20298w();
                this.f27101f.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f27100e);
                if (this.f27118w) {
                    viewGroup = this.f27116u ? (ViewGroup) from.inflate((int) C0126R.C0128layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate((int) C0126R.C0128layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.f27117v) {
                    viewGroup = (ViewGroup) from.inflate((int) C0126R.C0128layout.abc_dialog_title_material, (ViewGroup) null);
                    this.f27115t = false;
                    this.f27114s = false;
                } else if (this.f27114s) {
                    TypedValue typedValue = new TypedValue();
                    this.f27100e.getTheme().resolveAttribute(C0126R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C1416ut(this.f27100e, typedValue.resourceId);
                    } else {
                        context = this.f27100e;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate((int) C0126R.C0128layout.abc_screen_toolbar, (ViewGroup) null);
                    C1525yu yuVar = (C1525yu) viewGroup.findViewById(C0126R.C0129id.decor_content_parent);
                    this.f27105j = yuVar;
                    yuVar.mo1258a(mo15998q());
                    if (this.f27115t) {
                        this.f27105j.mo1262b(109);
                    }
                    if (this.f27082N) {
                        this.f27105j.mo1262b(2);
                    }
                    if (this.f27083O) {
                        this.f27105j.mo1262b(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    int i = Build.VERSION.SDK_INT;
                    C1280ps.m19895a(viewGroup, new C1355sm(this));
                    if (this.f27105j == null) {
                        this.f27081M = (TextView) viewGroup.findViewById(C0126R.C0129id.title);
                    }
                    aek.m625b(viewGroup);
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0126R.C0129id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f27101f.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f27101f.setContentView(viewGroup);
                    contentFrameLayout.f1208i = new C1356sn(this);
                    this.f27112q = viewGroup;
                    CharSequence s = mo16000s();
                    if (!TextUtils.isEmpty(s)) {
                        C1525yu yuVar2 = this.f27105j;
                        if (yuVar2 == null) {
                            C1341rz rzVar = this.f27103h;
                            if (rzVar == null) {
                                TextView textView = this.f27081M;
                                if (textView != null) {
                                    textView.setText(s);
                                }
                            } else {
                                rzVar.mo15857c(s);
                            }
                        } else {
                            yuVar2.mo1259a(s);
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f27112q.findViewById(16908290);
                    View decorView = this.f27101f.getDecorView();
                    contentFrameLayout2.f1207h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (C1280ps.m19868C(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f27100e.obtainStyledAttributes(C1390tu.f27201j);
                    if (contentFrameLayout2.f1201b == null) {
                        contentFrameLayout2.f1201b = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(122, contentFrameLayout2.f1201b);
                    if (contentFrameLayout2.f1202c == null) {
                        contentFrameLayout2.f1202c = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(123, contentFrameLayout2.f1202c);
                    if (obtainStyledAttributes2.hasValue(120)) {
                        if (contentFrameLayout2.f1203d == null) {
                            contentFrameLayout2.f1203d = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.f1203d);
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        if (contentFrameLayout2.f1204e == null) {
                            contentFrameLayout2.f1204e = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.f1204e);
                    }
                    if (obtainStyledAttributes2.hasValue(118)) {
                        if (contentFrameLayout2.f1205f == null) {
                            contentFrameLayout2.f1205f = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(118, contentFrameLayout2.f1205f);
                    }
                    if (obtainStyledAttributes2.hasValue(119)) {
                        if (contentFrameLayout2.f1206g == null) {
                            contentFrameLayout2.f1206g = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(119, contentFrameLayout2.f1206g);
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f27080L = true;
                    C1370ta f = mo15995f(0);
                    if (this.f27120y) {
                        return;
                    }
                    if (f == null || f.f27058j == null) {
                        m20296g(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f27114s + ", windowActionBarOverlay: " + this.f27115t + ", android:windowIsFloating: " + this.f27117v + ", windowActionModeOverlay: " + this.f27116u + ", windowNoTitle: " + this.f27118w + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    /* renamed from: y */
    private final void m20300y() {
        if (this.f27080L) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: z */
    private final int m20301z() {
        int i = this.f27090V;
        return i == -100 ? C1353sk.f27026a : i;
    }

    /* renamed from: a */
    public final void mo15934a(int i) {
        this.f27091W = i;
    }

    /* renamed from: d */
    public final void mo15944d() {
        this.f27089U = false;
        C1341rz a = mo15933a();
        if (a != null) {
            a.mo15864e(false);
        }
    }

    /* renamed from: e */
    public final void mo15946e() {
        C1341rz a = mo15933a();
        if (a != null) {
            a.mo15864e(true);
        }
    }

    /* renamed from: f */
    public final C1370ta mo15995f(int i) {
        C1370ta[] taVarArr = this.f27085Q;
        if (taVarArr == null || taVarArr.length <= i) {
            C1370ta[] taVarArr2 = new C1370ta[(i + 1)];
            if (taVarArr != null) {
                System.arraycopy(taVarArr, 0, taVarArr2, 0, taVarArr.length);
            }
            this.f27085Q = taVarArr2;
            taVarArr = taVarArr2;
        }
        C1370ta taVar = taVarArr[i];
        if (taVar != null) {
            return taVar;
        }
        C1370ta taVar2 = new C1370ta(i);
        taVarArr[i] = taVar2;
        return taVar2;
    }

    /* renamed from: h */
    public final void mo15949h() {
        LayoutInflater from = LayoutInflater.from(this.f27100e);
        if (from.getFactory() == null) {
            C1259oy.m19819a(from, this);
        } else if (!(from.getFactory2() instanceof C1372tc)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: i */
    public final int mo15950i() {
        return this.f27090V;
    }

    /* renamed from: j */
    public final void mo15951j() {
        m20292a(true);
    }

    /* renamed from: k */
    public final void mo15952k() {
        String str;
        this.f27087S = true;
        m20292a(false);
        m20298w();
        Object obj = this.f27099d;
        if (obj instanceof Activity) {
            try {
                str = C1094ix.m16257c((Activity) obj);
            } catch (IllegalArgumentException e) {
                str = null;
            }
            if (str != null) {
                C1341rz rzVar = this.f27103h;
                if (rzVar == null) {
                    this.f27097ac = true;
                } else {
                    rzVar.mo15861d(true);
                }
            }
        }
        synchronized (C1353sk.f27028c) {
            C1353sk.m20236a(this);
            C1353sk.f27027b.add(new WeakReference(this));
        }
        this.f27088T = true;
    }

    /* renamed from: l */
    public final void mo15953l() {
        m20299x();
    }

    /* renamed from: m */
    public final void mo15954m() {
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo15985a(str, context, attributeSet);
    }

    /* renamed from: p */
    public final void mo15955p() {
        C1341rz a;
        if (this.f27114s && this.f27080L && (a = mo15933a()) != null) {
            a.mo15875n();
        }
        C1497xt.m20824b().mo16511a(this.f27100e);
        m20292a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Window.Callback mo15998q() {
        return this.f27101f.getCallback();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final Context mo15999r() {
        C1341rz a = mo15933a();
        Context g = a != null ? a.mo15868g() : null;
        return g == null ? this.f27100e : g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final CharSequence mo16000s() {
        Object obj = this.f27099d;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f27077I;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo16001t() {
        ViewGroup viewGroup;
        return this.f27080L && (viewGroup = this.f27112q) != null && C1280ps.m19868C(viewGroup);
    }

    /* renamed from: u */
    public final void mo16002u() {
        C1285px pxVar = this.f27110o;
        if (pxVar != null) {
            pxVar.mo15707a();
        }
    }

    /* renamed from: c */
    public final void mo15942c() {
        this.f27089U = true;
        mo15951j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    public final void mo15948g() {
        C1341rz rzVar;
        C1366sx sxVar;
        C1366sx sxVar2;
        synchronized (C1353sk.f27028c) {
            C1353sk.m20236a(this);
        }
        if (this.f27121z) {
            this.f27101f.getDecorView().removeCallbacks(this.f27096ab);
        }
        this.f27089U = false;
        this.f27120y = true;
        if (this.f27090V != -100) {
            Object obj = this.f27099d;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f27069D.put(this.f27099d.getClass().getName(), Integer.valueOf(this.f27090V));
                rzVar = this.f27103h;
                if (rzVar != null) {
                    rzVar.mo15874m();
                }
                sxVar = this.f27094Z;
                if (sxVar != null) {
                    sxVar.mo15979e();
                }
                sxVar2 = this.f27095aa;
                if (sxVar2 == null) {
                    sxVar2.mo15979e();
                    return;
                }
                return;
            }
        }
        f27069D.remove(this.f27099d.getClass().getName());
        rzVar = this.f27103h;
        if (rzVar != null) {
        }
        sxVar = this.f27094Z;
        if (sxVar != null) {
        }
        sxVar2 = this.f27095aa;
        if (sxVar2 == null) {
        }
    }

    /* renamed from: c */
    public final void mo15943c(int i) {
        m20299x();
        ViewGroup viewGroup = (ViewGroup) this.f27112q.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f27100e).inflate(i, viewGroup);
        this.f27076H.f27342b.onContentChanged();
    }

    /* renamed from: d */
    public final void mo15945d(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (!this.f27118w || i != 108) {
            if (this.f27114s && i == 1) {
                this.f27114s = false;
            }
            if (i == 1) {
                m20300y();
                this.f27118w = true;
            } else if (i == 2) {
                m20300y();
                this.f27082N = true;
            } else if (i == 5) {
                m20300y();
                this.f27083O = true;
            } else if (i == 10) {
                m20300y();
                this.f27116u = true;
            } else if (i == 108) {
                m20300y();
                this.f27114s = true;
            } else if (i != 109) {
                this.f27101f.requestFeature(i);
            } else {
                m20300y();
                this.f27115t = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo15994e(int i) {
        C1370ta f;
        C1370ta f2 = mo15995f(i);
        if (f2.f27058j != null) {
            Bundle bundle = new Bundle();
            f2.f27058j.mo16245c(bundle);
            if (bundle.size() > 0) {
                f2.f27067s = bundle;
            }
            f2.f27058j.mo16252e();
            f2.f27058j.clear();
        }
        f2.f27066r = true;
        f2.f27065q = true;
        if ((i == 108 || i == 0) && this.f27105j != null && (f = mo15995f(0)) != null) {
            f.f27061m = false;
            mo15992a(f, (KeyEvent) null);
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return mo15985a(str, context, attributeSet);
    }

    /* renamed from: f */
    public final void mo15947f() {
        C1341rz a = mo15933a();
        if (a == null || !a.mo15872k()) {
            m20296g(0);
        }
    }

    /* renamed from: a */
    private final void m20291a(Window window) {
        if (this.f27101f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C1363su)) {
                C1363su suVar = new C1363su(this, callback);
                this.f27076H = suVar;
                window.setCallback(suVar);
                adr a = adr.m522a(this.f27100e, (AttributeSet) null, f27070E);
                Drawable b = a.mo453b(0);
                if (b != null) {
                    window.setBackgroundDrawable(b);
                }
                a.mo450a();
                this.f27101f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: tc.a(ta, boolean):void
     arg types: [ta, int]
     candidates:
      tc.a(android.content.Context, int):int
      tc.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      tc.a(ta, android.view.KeyEvent):boolean
      tc.a(vt, android.view.MenuItem):boolean
      sk.a(android.app.Activity, sj):sk
      sk.a(android.app.Dialog, sj):sk
      sk.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      vr.a(vt, android.view.MenuItem):boolean
      tc.a(ta, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0151, code lost:
        if (r14.f27056h != null) goto L_0x0156;
     */
    /* renamed from: b */
    private final void m20294b(C1370ta taVar, KeyEvent keyEvent) {
        int i;
        ExpandedMenuView expandedMenuView;
        ViewGroup.LayoutParams layoutParams;
        if (!taVar.f27063o && !this.f27120y) {
            if (taVar.f27049a != 0 || (this.f27100e.getResources().getConfiguration().screenLayout & 15) != 4) {
                Window.Callback q = mo15998q();
                if (q == null || q.onMenuOpened(taVar.f27049a, taVar.f27058j)) {
                    WindowManager windowManager = (WindowManager) this.f27100e.getSystemService("window");
                    if (windowManager != null && mo15992a(taVar, keyEvent)) {
                        ViewGroup viewGroup = taVar.f27055g;
                        if (viewGroup == null || taVar.f27065q) {
                            if (viewGroup == null) {
                                Context r = mo15999r();
                                TypedValue typedValue = new TypedValue();
                                Resources.Theme newTheme = r.getResources().newTheme();
                                newTheme.setTo(r.getTheme());
                                newTheme.resolveAttribute(C0126R.attr.actionBarPopupTheme, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    newTheme.applyStyle(typedValue.resourceId, true);
                                }
                                newTheme.resolveAttribute(C0126R.attr.panelMenuListTheme, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    newTheme.applyStyle(typedValue.resourceId, true);
                                } else {
                                    newTheme.applyStyle(2132018552, true);
                                }
                                C1416ut utVar = new C1416ut(r, 0);
                                utVar.getTheme().setTo(newTheme);
                                taVar.f27060l = utVar;
                                TypedArray obtainStyledAttributes = utVar.obtainStyledAttributes(C1390tu.f27201j);
                                taVar.f27050b = obtainStyledAttributes.getResourceId(84, 0);
                                taVar.f27054f = obtainStyledAttributes.getResourceId(1, 0);
                                obtainStyledAttributes.recycle();
                                taVar.f27055g = new C1368sz(this, taVar.f27060l);
                                taVar.f27051c = 81;
                                if (taVar.f27055g == null) {
                                    return;
                                }
                            } else if (taVar.f27065q && viewGroup.getChildCount() > 0) {
                                taVar.f27055g.removeAllViews();
                            }
                            View view = taVar.f27057i;
                            if (view == null) {
                                if (taVar.f27058j != null) {
                                    if (this.f27079K == null) {
                                        this.f27079K = new C1371tb(this);
                                    }
                                    C1371tb tbVar = this.f27079K;
                                    if (taVar.f27058j != null) {
                                        if (taVar.f27059k == null) {
                                            taVar.f27059k = new C1439vp(taVar.f27060l);
                                            C1439vp vpVar = taVar.f27059k;
                                            vpVar.f27414g = tbVar;
                                            taVar.f27058j.mo16224a(vpVar);
                                        }
                                        C1439vp vpVar2 = taVar.f27059k;
                                        ViewGroup viewGroup2 = taVar.f27055g;
                                        if (vpVar2.f27411d == null) {
                                            vpVar2.f27411d = (ExpandedMenuView) vpVar2.f27409b.inflate((int) C0126R.C0128layout.abc_expanded_menu_layout, viewGroup2, false);
                                            if (vpVar2.f27415h == null) {
                                                vpVar2.f27415h = new C1438vo(vpVar2);
                                            }
                                            vpVar2.f27411d.setAdapter((ListAdapter) vpVar2.f27415h);
                                            vpVar2.f27411d.setOnItemClickListener(vpVar2);
                                        }
                                        expandedMenuView = vpVar2.f27411d;
                                    } else {
                                        expandedMenuView = null;
                                    }
                                    taVar.f27056h = expandedMenuView;
                                }
                                taVar.f27065q = true;
                                return;
                            }
                            taVar.f27056h = view;
                            if (taVar.f27056h != null && (taVar.f27057i != null || taVar.f27059k.mo16208c().getCount() > 0)) {
                                ViewGroup.LayoutParams layoutParams2 = taVar.f27056h.getLayoutParams();
                                if (layoutParams2 == null) {
                                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                                }
                                taVar.f27055g.setBackgroundResource(taVar.f27050b);
                                ViewParent parent = taVar.f27056h.getParent();
                                if (parent instanceof ViewGroup) {
                                    ((ViewGroup) parent).removeView(taVar.f27056h);
                                }
                                taVar.f27055g.addView(taVar.f27056h, layoutParams2);
                                if (!taVar.f27056h.hasFocus()) {
                                    taVar.f27056h.requestFocus();
                                }
                                i = -2;
                            }
                            taVar.f27065q = true;
                            return;
                        }
                        View view2 = taVar.f27057i;
                        if (view2 == null || (layoutParams = view2.getLayoutParams()) == null || layoutParams.width != -1) {
                            i = -2;
                        } else {
                            i = -1;
                        }
                        taVar.f27062n = false;
                        int i2 = taVar.f27052d;
                        int i3 = taVar.f27053e;
                        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                        layoutParams3.gravity = taVar.f27051c;
                        layoutParams3.windowAnimations = taVar.f27054f;
                        windowManager.addView(taVar.f27055g, layoutParams3);
                        taVar.f27063o = true;
                        return;
                    }
                    return;
                }
                mo15989a(taVar, true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    private final void m20292a(boolean z) {
        C1366sx sxVar;
        Object obj;
        if (!this.f27120y) {
            int z2 = m20301z();
            Configuration a = m20290a(this.f27100e, mo15984a(this.f27100e, z2), (Configuration) null);
            boolean z3 = false;
            if (!this.f27093Y && (this.f27099d instanceof Activity)) {
                PackageManager packageManager = this.f27100e.getPackageManager();
                if (packageManager != null) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f27100e, this.f27099d.getClass()), 269221888);
                        this.f27092X = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
                    } catch (PackageManager.NameNotFoundException e) {
                        this.f27092X = false;
                    }
                }
                int i2 = this.f27100e.getResources().getConfiguration().uiMode & 48;
                int i3 = a.uiMode & 48;
                if (i2 != i3 && z && !z3 && this.f27087S && (f27071F || this.f27088T)) {
                    Object obj2 = this.f27099d;
                    if ((obj2 instanceof Activity) && !((Activity) obj2).isChild()) {
                        int i4 = Build.VERSION.SDK_INT;
                        ((Activity) this.f27099d).recreate();
                        obj = this.f27099d;
                        if (obj instanceof C1351si) {
                            C1351si siVar = (C1351si) obj;
                        }
                        if (z2 == 0) {
                            m20293b(this.f27100e).mo15978d();
                        } else {
                            C1366sx sxVar2 = this.f27094Z;
                            if (sxVar2 != null) {
                                sxVar2.mo15979e();
                            }
                            if (z2 == 3) {
                                m20295c(this.f27100e).mo15978d();
                                return;
                            }
                        }
                        sxVar = this.f27095aa;
                        if (sxVar != null) {
                            sxVar.mo15979e();
                            return;
                        }
                        return;
                    }
                }
                if (i2 != i3) {
                    Resources resources = this.f27100e.getResources();
                    Configuration configuration = new Configuration(resources.getConfiguration());
                    configuration.uiMode = i3 | (resources.getConfiguration().uiMode & -49);
                    resources.updateConfiguration(configuration, null);
                    int i5 = Build.VERSION.SDK_INT;
                    int i6 = this.f27091W;
                    if (i6 != 0) {
                        this.f27100e.setTheme(i6);
                        int i7 = Build.VERSION.SDK_INT;
                        this.f27100e.getTheme().applyStyle(this.f27091W, true);
                    }
                    if (z3) {
                        Object obj3 = this.f27099d;
                        if (obj3 instanceof Activity) {
                            Activity activity = (Activity) obj3;
                            if (activity instanceof C0013ak) {
                                if (((C0013ak) activity).getLifecycle().mo556a().mo482a(C0007ae.STARTED)) {
                                    activity.onConfigurationChanged(configuration);
                                }
                            } else if (this.f27089U) {
                                activity.onConfigurationChanged(configuration);
                            }
                        }
                    }
                    obj = this.f27099d;
                    if (obj instanceof C1351si) {
                    }
                }
                if (z2 == 0) {
                }
                sxVar = this.f27095aa;
                if (sxVar != null) {
                }
            }
            this.f27093Y = true;
            z3 = this.f27092X;
            int i22 = this.f27100e.getResources().getConfiguration().uiMode & 48;
            int i32 = a.uiMode & 48;
            Object obj22 = this.f27099d;
            int i42 = Build.VERSION.SDK_INT;
            ((Activity) this.f27099d).recreate();
            obj = this.f27099d;
            if (obj instanceof C1351si) {
            }
            if (z2 == 0) {
            }
            sxVar = this.f27095aa;
            if (sxVar != null) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo15984a(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                int i2 = Build.VERSION.SDK_INT;
                if (((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() != 0) {
                    return m20293b(context).mo15974a();
                }
                return -1;
            } else if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    return m20295c(context).mo15974a();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i;
    }

    /* renamed from: a */
    public final Context mo15932a(Context context) {
        this.f27087S = true;
        int a = mo15984a(context, m20301z());
        Configuration configuration = null;
        if (f27072G && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m20290a(context, a, (Configuration) null));
                return context;
            } catch (IllegalStateException e) {
            }
        }
        if (context instanceof C1416ut) {
            try {
                ((C1416ut) context).mo16092a(m20290a(context, a, (Configuration) null));
                return context;
            } catch (IllegalStateException e2) {
            }
        }
        if (!f27071F) {
            return context;
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (!(configuration3 == null || configuration2.diff(configuration3) == 0)) {
                    if (configuration2.fontScale != configuration3.fontScale) {
                        configuration.fontScale = configuration3.fontScale;
                    }
                    if (configuration2.mcc != configuration3.mcc) {
                        configuration.mcc = configuration3.mcc;
                    }
                    if (configuration2.mnc != configuration3.mnc) {
                        configuration.mnc = configuration3.mnc;
                    }
                    int i = Build.VERSION.SDK_INT;
                    LocaleList locales = configuration2.getLocales();
                    LocaleList locales2 = configuration3.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration3.locale;
                    }
                    if (configuration2.touchscreen != configuration3.touchscreen) {
                        configuration.touchscreen = configuration3.touchscreen;
                    }
                    if (configuration2.keyboard != configuration3.keyboard) {
                        configuration.keyboard = configuration3.keyboard;
                    }
                    if (configuration2.keyboardHidden != configuration3.keyboardHidden) {
                        configuration.keyboardHidden = configuration3.keyboardHidden;
                    }
                    if (configuration2.navigation != configuration3.navigation) {
                        configuration.navigation = configuration3.navigation;
                    }
                    if (configuration2.navigationHidden != configuration3.navigationHidden) {
                        configuration.navigationHidden = configuration3.navigationHidden;
                    }
                    if (configuration2.orientation != configuration3.orientation) {
                        configuration.orientation = configuration3.orientation;
                    }
                    if ((configuration2.screenLayout & 15) != (configuration3.screenLayout & 15)) {
                        configuration.screenLayout |= configuration3.screenLayout & 15;
                    }
                    if ((configuration2.screenLayout & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC) != (configuration3.screenLayout & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC)) {
                        configuration.screenLayout |= configuration3.screenLayout & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC;
                    }
                    if ((configuration2.screenLayout & 48) != (configuration3.screenLayout & 48)) {
                        configuration.screenLayout |= configuration3.screenLayout & 48;
                    }
                    if ((configuration2.screenLayout & 768) != (configuration3.screenLayout & 768)) {
                        configuration.screenLayout |= configuration3.screenLayout & 768;
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if ((configuration2.colorMode & 3) != (configuration3.colorMode & 3)) {
                        configuration.colorMode |= configuration3.colorMode & 3;
                    }
                    if ((configuration2.colorMode & 12) != (configuration3.colorMode & 12)) {
                        configuration.colorMode |= configuration3.colorMode & 12;
                    }
                    if ((configuration2.uiMode & 15) != (configuration3.uiMode & 15)) {
                        configuration.uiMode |= configuration3.uiMode & 15;
                    }
                    if ((configuration2.uiMode & 48) != (configuration3.uiMode & 48)) {
                        configuration.uiMode |= configuration3.uiMode & 48;
                    }
                    if (configuration2.screenWidthDp != configuration3.screenWidthDp) {
                        configuration.screenWidthDp = configuration3.screenWidthDp;
                    }
                    if (configuration2.screenHeightDp != configuration3.screenHeightDp) {
                        configuration.screenHeightDp = configuration3.screenHeightDp;
                    }
                    if (configuration2.smallestScreenWidthDp != configuration3.smallestScreenWidthDp) {
                        configuration.smallestScreenWidthDp = configuration3.smallestScreenWidthDp;
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    if (configuration2.densityDpi != configuration3.densityDpi) {
                        configuration.densityDpi = configuration3.densityDpi;
                    }
                }
            }
            Configuration a2 = m20290a(context, a, configuration);
            C1416ut utVar = new C1416ut(context, 2132018564);
            utVar.mo16092a(a2);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = utVar.getTheme();
                    int i4 = Build.VERSION.SDK_INT;
                    C1162lj.m19222a(theme);
                }
            } catch (NullPointerException e3) {
            }
            return utVar;
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("Application failed to obtain resources from itself", e4);
        }
    }

    /* renamed from: b */
    public final MenuInflater mo15939b() {
        if (this.f27104i == null) {
            m20297v();
            C1341rz rzVar = this.f27103h;
            this.f27104i = new C1422uz(rzVar != null ? rzVar.mo15868g() : this.f27100e);
        }
        return this.f27104i;
    }

    /* renamed from: b */
    public final View mo15940b(int i) {
        m20299x();
        return this.f27101f.findViewById(i);
    }

    /* renamed from: b */
    public final void mo15941b(View view, ViewGroup.LayoutParams layoutParams) {
        m20299x();
        ((ViewGroup) this.f27112q.findViewById(16908290)).addView(view, layoutParams);
        this.f27076H.f27342b.onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15993b(C1443vt vtVar) {
        if (!this.f27084P) {
            this.f27084P = true;
            this.f27105j.mo1277j();
            Window.Callback q = mo15998q();
            if (q != null && !this.f27120y) {
                q.onPanelClosed(108, vtVar);
            }
            this.f27084P = false;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String], assign insn: 0x0128: CONST  (r4v2 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View], assign insn: PHI: (r4v3 ?) = (r4v4 ?), (r4v2 ?), (r4v5 ?), (r4v6 ?), (r4v9 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:106:0x0208, B:95:0x01db, B:99:0x01ec, B:90:0x01cd, B:105:0x0200] */
    /* JADX WARN: Type inference failed for: r4v4, assign insn: 0x0208: MOVE  (r4v4 ? I:?[OBJECT, ARRAY]) = (r3v2 android.view.View) */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object[]], assign insn: 0x0200: IGET  (r8v5 ? I:java.lang.Object[]) = (r0v1 android.support.v7.app.AppCompatViewInflater) android.support.v7.app.AppCompatViewInflater.c java.lang.Object[] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object[]], assign insn: 0x01f8: IGET  (r9v8 ? I:java.lang.Object[]) = (r0v1 android.support.v7.app.AppCompatViewInflater) android.support.v7.app.AppCompatViewInflater.c java.lang.Object[] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object[]], assign insn: 0x01db: IGET  (r8v7 ? I:java.lang.Object[]) = (r0v1 android.support.v7.app.AppCompatViewInflater) android.support.v7.app.AppCompatViewInflater.c java.lang.Object[] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object[]], assign insn: 0x01ec: IGET  (r8v8 ? I:java.lang.Object[]) = (r0v1 android.support.v7.app.AppCompatViewInflater) android.support.v7.app.AppCompatViewInflater.c java.lang.Object[] */
    /* JADX WARN: Type inference failed for: r4v5, assign insn: 0x01f2: MOVE  (r4v5 ? I:?[OBJECT, ARRAY]) = (r3v7 android.view.View) */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object[]], assign insn: 0x01cd: IGET  (r9v15 ? I:java.lang.Object[]) = (r0v1 android.support.v7.app.AppCompatViewInflater) android.support.v7.app.AppCompatViewInflater.c java.lang.Object[] */
    /* JADX WARN: Type inference failed for: r4v6, assign insn: 0x01d3: MOVE  (r4v6 ? I:?[OBJECT, ARRAY]) = (r8v9 android.view.View) */
    /* JADX WARN: Type inference failed for: r4v9, assign insn: 0x0128: CONST  (r4v9 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e4, code lost:
        if (r8.equals("Spinner") != false) goto L_0x0128;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    public final View mo15985a(String str, Context context, AttributeSet attributeSet) {
        View view;
        if (this.f27098ad == null) {
            String string = this.f27100e.obtainStyledAttributes(C1390tu.f27201j).getString(114);
            if (string == null) {
                this.f27098ad = new AppCompatViewInflater();
            } else {
                try {
                    this.f27098ad = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f27098ad = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.f27098ad;
        aed.m595a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1390tu.f27189A, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Context utVar = (resourceId == 0 || ((context instanceof C1416ut) && ((C1416ut) context).f27274a == resourceId)) ? context : new C1416ut(context, resourceId);
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case -339785223:
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 13;
                    break;
                }
                c = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        ? r4 = 0;
        r4 = 0;
        switch (c) {
            case 0:
                view = appCompatViewInflater.mo1201a(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            case 1:
                view = new AppCompatImageView(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            case 2:
                view = appCompatViewInflater.mo1204b(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            case 3:
                view = new AppCompatEditText(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            case 4:
                view = new AppCompatSpinner(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            case 5:
                view = new AppCompatImageButton(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            case 6:
                view = appCompatViewInflater.mo1205c(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            case 7:
                view = appCompatViewInflater.mo1206d(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            case 8:
                view = new C1494xq(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            case 9:
                view = appCompatViewInflater.mo1207e(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            case 10:
                view = new C1500xw(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            case 11:
                view = new C1505ya(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            case 12:
                view = new C1506yb(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            case 13:
                view = new C1522yr(utVar, attributeSet);
                appCompatViewInflater.mo1203a(view, str);
                break;
            default:
                view = r4;
                break;
        }
        if (view == null && context != utVar) {
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(r4, "class");
            }
            try {
                Object[] objArr = appCompatViewInflater.f1084c;
                objArr[0] = utVar;
                objArr[1] = attributeSet;
                if (str.indexOf(46) != -1) {
                    View a = appCompatViewInflater.mo1202a(utVar, str, r4);
                    ? r9 = appCompatViewInflater.f1084c;
                    r9[0] = r4;
                    r9[1] = r4;
                    r4 = a;
                } else {
                    int i = 0;
                    while (true) {
                        if (i < AppCompatViewInflater.f1081b.length) {
                            View a2 = appCompatViewInflater.mo1202a(utVar, str, AppCompatViewInflater.f1081b[i]);
                            if (a2 != null) {
                                ? r8 = appCompatViewInflater.f1084c;
                                r8[0] = r4;
                                r8[1] = r4;
                                r4 = a2;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            } catch (Exception e) {
            } finally {
                ? r92 = appCompatViewInflater.f1084c;
                r92[0] = r4;
                r92[1] = r4;
            }
        } else {
            r4 = view;
        }
        if (r4 != 0) {
            Context context2 = r4.getContext();
            if (context2 instanceof ContextWrapper) {
                int i2 = Build.VERSION.SDK_INT;
                if (C1280ps.m19872G(r4)) {
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, AppCompatViewInflater.f1080a);
                    String string2 = obtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        r4.setOnClickListener(new C1375tf(r4, string2));
                    }
                    obtainStyledAttributes2.recycle();
                }
            }
        }
        return r4;
    }

    /* renamed from: a */
    public final C1341rz mo15933a() {
        m20297v();
        return this.f27103h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1370ta mo15986a(Menu menu) {
        C1370ta[] taVarArr = this.f27085Q;
        int length = taVarArr != null ? taVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C1370ta taVar = taVarArr[i];
            if (taVar != null && taVar.f27058j == menu) {
                return taVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1414ur mo15987a(C1413uq uqVar) {
        C1414ur urVar;
        Context context;
        mo16002u();
        C1414ur urVar2 = this.f27106k;
        if (urVar2 != null) {
            urVar2.mo16030c();
        }
        C1352sj sjVar = this.f27102g;
        if (sjVar == null || this.f27120y) {
            urVar = null;
        } else {
            try {
                urVar = sjVar.mo8633bv();
            } catch (AbstractMethodError e) {
                urVar = null;
            }
        }
        if (urVar == null) {
            if (this.f27107l == null) {
                if (this.f27117v) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f27100e.getTheme();
                    theme.resolveAttribute(C0126R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = this.f27100e.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new C1416ut(this.f27100e, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = this.f27100e;
                    }
                    this.f27107l = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, (int) C0126R.attr.actionModePopupWindowStyle);
                    this.f27108m = popupWindow;
                    C1333rr.m20100a(popupWindow, 2);
                    this.f27108m.setContentView(this.f27107l);
                    this.f27108m.setWidth(-1);
                    context.getTheme().resolveAttribute(C0126R.attr.actionBarSize, typedValue, true);
                    this.f27107l.f27536e = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                    this.f27108m.setHeight(-2);
                    this.f27109n = new C1358sp(this);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f27112q.findViewById(C0126R.C0129id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.f1363a = LayoutInflater.from(mo15999r());
                        this.f27107l = (ActionBarContextView) viewStubCompat.mo1717a();
                    }
                }
            }
            if (this.f27107l != null) {
                mo16002u();
                this.f27107l.mo1240a();
                C1417uu uuVar = new C1417uu(this.f27107l.getContext(), this.f27107l, uqVar);
                if (uqVar.mo15961a(uuVar, uuVar.f27279a)) {
                    uuVar.mo16031d();
                    this.f27107l.mo1244a(uuVar);
                    this.f27106k = uuVar;
                    if (mo16001t()) {
                        this.f27107l.setAlpha(0.0f);
                        C1285px m = C1280ps.m19931m(this.f27107l);
                        m.mo15708a(1.0f);
                        this.f27110o = m;
                        m.mo15711a(new C1359sq(this));
                    } else {
                        this.f27107l.setAlpha(1.0f);
                        this.f27107l.setVisibility(0);
                        this.f27107l.sendAccessibilityEvent(32);
                        if (this.f27107l.getParent() instanceof View) {
                            C1280ps.m19937s((View) this.f27107l.getParent());
                        }
                    }
                    if (this.f27108m != null) {
                        this.f27101f.getDecorView().post(this.f27109n);
                    }
                } else {
                    this.f27106k = null;
                }
            }
        } else {
            this.f27106k = urVar;
        }
        return this.f27106k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15988a(int i, C1370ta taVar, Menu menu) {
        if (menu == null) {
            if (taVar == null) {
                C1370ta[] taVarArr = this.f27085Q;
                if (i < taVarArr.length) {
                    taVar = taVarArr[i];
                }
            }
            if (taVar != null) {
                menu = taVar.f27058j;
            }
        }
        if ((taVar == null || taVar.f27063o) && !this.f27120y) {
            this.f27076H.f27342b.onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    public final void mo15935a(Toolbar toolbar) {
        if (this.f27099d instanceof Activity) {
            C1341rz a = mo15933a();
            if (!(a instanceof C1389tt)) {
                this.f27104i = null;
                if (a != null) {
                    a.mo15874m();
                }
                if (toolbar != null) {
                    C1381tl tlVar = new C1381tl(toolbar, mo16000s(), this.f27076H);
                    this.f27103h = tlVar;
                    this.f27101f.setCallback(tlVar.f27137c);
                } else {
                    this.f27103h = null;
                    this.f27101f.setCallback(this.f27076H);
                }
                mo15947f();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: a */
    public final void mo15936a(View view) {
        m20299x();
        ViewGroup viewGroup = (ViewGroup) this.f27112q.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f27076H.f27342b.onContentChanged();
    }

    /* renamed from: a */
    public final void mo15937a(View view, ViewGroup.LayoutParams layoutParams) {
        m20299x();
        ViewGroup viewGroup = (ViewGroup) this.f27112q.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f27076H.f27342b.onContentChanged();
    }

    /* renamed from: a */
    public final void mo15938a(CharSequence charSequence) {
        this.f27077I = charSequence;
        C1525yu yuVar = this.f27105j;
        if (yuVar == null) {
            C1341rz rzVar = this.f27103h;
            if (rzVar == null) {
                TextView textView = this.f27081M;
                if (textView != null) {
                    textView.setText(charSequence);
                    return;
                }
                return;
            }
            rzVar.mo15857c(charSequence);
            return;
        }
        yuVar.mo1259a(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15989a(C1370ta taVar, boolean z) {
        ViewGroup viewGroup;
        C1525yu yuVar;
        if (z && taVar.f27049a == 0 && (yuVar = this.f27105j) != null && yuVar.mo1267e()) {
            mo15993b(taVar.f27058j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f27100e.getSystemService("window");
        if (!(windowManager == null || !taVar.f27063o || (viewGroup = taVar.f27055g) == null)) {
            windowManager.removeView(viewGroup);
            if (z) {
                mo15988a(taVar.f27049a, taVar, (Menu) null);
            }
        }
        taVar.f27061m = false;
        taVar.f27062n = false;
        taVar.f27063o = false;
        taVar.f27056h = null;
        taVar.f27065q = true;
        if (this.f27119x == taVar) {
            this.f27119x = null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: tc.a(ta, boolean):void
     arg types: [ta, int]
     candidates:
      tc.a(android.content.Context, int):int
      tc.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      tc.a(ta, android.view.KeyEvent):boolean
      tc.a(vt, android.view.MenuItem):boolean
      sk.a(android.app.Activity, sj):sk
      sk.a(android.app.Dialog, sj):sk
      sk.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      vr.a(vt, android.view.MenuItem):boolean
      tc.a(ta, boolean):void */
    /* renamed from: a */
    public final void mo132a(C1443vt vtVar) {
        C1525yu yuVar = this.f27105j;
        if (yuVar != null && yuVar.mo1265d() && (!ViewConfiguration.get(this.f27100e).hasPermanentMenuKey() || this.f27105j.mo1268f())) {
            Window.Callback q = mo15998q();
            if (this.f27105j.mo1267e()) {
                this.f27105j.mo1275h();
                if (!this.f27120y) {
                    q.onPanelClosed(108, mo15995f(0).f27058j);
                }
            } else if (q != null && !this.f27120y) {
                if (this.f27121z && (1 & this.f27073A) != 0) {
                    this.f27101f.getDecorView().removeCallbacks(this.f27096ab);
                    this.f27096ab.run();
                }
                C1370ta f = mo15995f(0);
                C1443vt vtVar2 = f.f27058j;
                if (vtVar2 != null && !f.f27066r && q.onPreparePanel(0, f.f27057i, vtVar2)) {
                    q.onMenuOpened(108, f.f27058j);
                    this.f27105j.mo1270g();
                }
            }
        } else {
            C1370ta f2 = mo15995f(0);
            f2.f27065q = true;
            mo15989a(f2, false);
            m20294b(f2, (KeyEvent) null);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: tc.a(ta, boolean):void
     arg types: [ta, int]
     candidates:
      tc.a(android.content.Context, int):int
      tc.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      tc.a(ta, android.view.KeyEvent):boolean
      tc.a(vt, android.view.MenuItem):boolean
      sk.a(android.app.Activity, sj):sk
      sk.a(android.app.Dialog, sj):sk
      sk.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      vr.a(vt, android.view.MenuItem):boolean
      tc.a(ta, boolean):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b5  */
    /* renamed from: a */
    public final boolean mo15990a(KeyEvent keyEvent) {
        AudioManager audioManager;
        boolean z;
        Object obj = this.f27099d;
        if (((obj instanceof C1257ow) || (obj instanceof C1374te)) && this.f27101f.getDecorView() != null) {
            C1280ps.m19882a();
        }
        boolean z2 = true;
        if (keyEvent.getKeyCode() == 82 && this.f27076H.f27342b.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            if (keyCode == 4) {
                boolean z3 = this.f27086R;
                this.f27086R = false;
                C1370ta f = mo15995f(0);
                if (f == null || !f.f27063o) {
                    C1414ur urVar = this.f27106k;
                    if (urVar == null) {
                        C1341rz a = mo15933a();
                        if (a == null || !a.mo15873l()) {
                            return false;
                        }
                        return true;
                    }
                    urVar.mo16030c();
                    return true;
                } else if (z3) {
                    return true;
                } else {
                    mo15989a(f, true);
                    return true;
                }
            } else if (keyCode != 82) {
                return false;
            } else {
                if (this.f27106k != null) {
                    return true;
                }
                C1370ta f2 = mo15995f(0);
                C1525yu yuVar = this.f27105j;
                if (yuVar == null || !yuVar.mo1265d() || ViewConfiguration.get(this.f27100e).hasPermanentMenuKey()) {
                    boolean z4 = f2.f27063o;
                    if (z4 || f2.f27062n) {
                        mo15989a(f2, true);
                        z = z4;
                    } else if (!f2.f27061m) {
                        return true;
                    } else {
                        if (f2.f27066r) {
                            f2.f27061m = false;
                            if (!mo15992a(f2, keyEvent)) {
                                return true;
                            }
                        }
                        m20294b(f2, keyEvent);
                        audioManager = (AudioManager) this.f27100e.getApplicationContext().getSystemService("audio");
                        if (audioManager == null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                        return true;
                    }
                } else if (this.f27105j.mo1267e()) {
                    z = this.f27105j.mo1275h();
                } else if (this.f27120y || !mo15992a(f2, keyEvent)) {
                    return true;
                } else {
                    z = this.f27105j.mo1270g();
                }
                if (!z) {
                    return true;
                }
                audioManager = (AudioManager) this.f27100e.getApplicationContext().getSystemService("audio");
                if (audioManager == null) {
                }
            }
        } else if (keyCode == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z2 = false;
            }
            this.f27086R = z2;
            return false;
        } else if (keyCode != 82) {
            return false;
        } else {
            if (keyEvent.getRepeatCount() != 0) {
                return true;
            }
            C1370ta f3 = mo15995f(0);
            if (f3.f27063o) {
                return true;
            }
            mo15992a(f3, keyEvent);
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo15991a(C1370ta taVar, int i, KeyEvent keyEvent) {
        C1443vt vtVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!taVar.f27061m && !mo15992a(taVar, keyEvent)) || (vtVar = taVar.f27058j) == null) {
            return false;
        }
        return vtVar.performShortcut(i, keyEvent, 1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: tc.a(ta, boolean):void
     arg types: [ta, int]
     candidates:
      tc.a(android.content.Context, int):int
      tc.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      tc.a(ta, android.view.KeyEvent):boolean
      tc.a(vt, android.view.MenuItem):boolean
      sk.a(android.app.Activity, sj):sk
      sk.a(android.app.Dialog, sj):sk
      sk.a(android.view.View, android.view.ViewGroup$LayoutParams):void
      vr.a(vt, android.view.MenuItem):boolean
      tc.a(ta, boolean):void */
    /* renamed from: a */
    public final boolean mo15992a(C1370ta taVar, KeyEvent keyEvent) {
        boolean z;
        C1525yu yuVar;
        int i;
        C1525yu yuVar2;
        Resources.Theme theme;
        C1525yu yuVar3;
        if (this.f27120y) {
            return false;
        }
        if (taVar.f27061m) {
            return true;
        }
        C1370ta taVar2 = this.f27119x;
        if (!(taVar2 == null || taVar2 == taVar)) {
            mo15989a(taVar2, false);
        }
        Window.Callback q = mo15998q();
        if (q != null) {
            taVar.f27057i = q.onCreatePanelView(taVar.f27049a);
        }
        int i2 = taVar.f27049a;
        if (i2 == 0) {
            z = true;
        } else {
            z = i2 == 108;
        }
        if (z && (yuVar3 = this.f27105j) != null) {
            yuVar3.mo1276i();
        }
        if (taVar.f27057i == null && (!z || !(this.f27103h instanceof C1381tl))) {
            C1443vt vtVar = taVar.f27058j;
            if (vtVar == null || taVar.f27066r) {
                if (vtVar == null) {
                    Context context = this.f27100e;
                    int i3 = taVar.f27049a;
                    if ((i3 == 0 || i3 == 108) && this.f27105j != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(C0126R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(C0126R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(C0126R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C1416ut utVar = new C1416ut(context, 0);
                            utVar.getTheme().setTo(theme);
                            context = utVar;
                        }
                    }
                    C1443vt vtVar2 = new C1443vt(context);
                    vtVar2.f27424b = this;
                    taVar.mo15983a(vtVar2);
                    if (taVar.f27058j == null) {
                        return false;
                    }
                }
                if (z && this.f27105j != null) {
                    if (this.f27078J == null) {
                        this.f27078J = new C1360sr(this);
                    }
                    this.f27105j.mo1257a(taVar.f27058j, this.f27078J);
                }
                taVar.f27058j.mo16252e();
                if (!q.onCreatePanelMenu(taVar.f27049a, taVar.f27058j)) {
                    taVar.mo15983a(null);
                    if (z && (yuVar2 = this.f27105j) != null) {
                        yuVar2.mo1257a(null, this.f27078J);
                    }
                    return false;
                }
                taVar.f27066r = false;
            }
            taVar.f27058j.mo16252e();
            Bundle bundle = taVar.f27067s;
            if (bundle != null) {
                taVar.f27058j.mo16250d(bundle);
                taVar.f27067s = null;
            }
            if (q.onPreparePanel(0, taVar.f27057i, taVar.f27058j)) {
                if (keyEvent != null) {
                    i = keyEvent.getDeviceId();
                } else {
                    i = -1;
                }
                boolean z2 = KeyCharacterMap.load(i).getKeyboardType() != 1;
                taVar.f27064p = z2;
                taVar.f27058j.setQwertyMode(z2);
                taVar.f27058j.mo16253f();
            } else {
                if (z && (yuVar = this.f27105j) != null) {
                    yuVar.mo1257a(null, this.f27078J);
                }
                taVar.f27058j.mo16253f();
                return false;
            }
        }
        taVar.f27061m = true;
        taVar.f27062n = false;
        this.f27119x = taVar;
        return true;
    }

    /* renamed from: a */
    public final boolean mo133a(C1443vt vtVar, MenuItem menuItem) {
        C1370ta a;
        Window.Callback q = mo15998q();
        if (q == null || this.f27120y || (a = mo15986a((Menu) vtVar.mo16261j())) == null) {
            return false;
        }
        return q.onMenuItemSelected(a.f27049a, menuItem);
    }
}
