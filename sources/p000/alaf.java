package p000;

import android.accounts.Account;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.Activity;
import com.google.android.gms.octarine.widget.OctarineToolbar;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.Arrays;

/* renamed from: alaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alaf implements akwb {

    /* renamed from: a */
    public final deu f73207a;

    /* renamed from: b */
    public final ViewGroup f73208b;

    /* renamed from: c */
    public final View f73209c;

    /* renamed from: d */
    public final akzl f73210d;

    /* renamed from: e */
    public String f73211e;

    /* renamed from: f */
    public String f73212f;

    /* renamed from: g */
    public View f73213g;

    /* renamed from: h */
    public OctarineToolbar f73214h;

    /* renamed from: i */
    public MenuItem f73215i;

    /* renamed from: j */
    public AccountParticleDisc f73216j;

    /* renamed from: k */
    public int f73217k = 2;

    /* renamed from: l */
    public int f73218l = 2;

    /* renamed from: m */
    private boolean f73219m;

    /* renamed from: n */
    private final int f73220n;

    /* renamed from: o */
    private final int f73221o;

    public alaf(deu deu, int i, int i2, akzl akzl) {
        ViewGroup viewGroup = (ViewGroup) deu.findViewById(C0126R.C0129id.octarine_webview_frame);
        View findViewById = deu.findViewById(C0126R.C0129id.octarine_webview_swipe_refresh_layout);
        sdo.m34959a(deu);
        this.f73207a = deu;
        sdo.m34959a(viewGroup);
        this.f73208b = viewGroup;
        sdo.m34959a(findViewById);
        this.f73209c = findViewById;
        this.f73220n = i;
        this.f73221o = i2;
        this.f73210d = akzl;
        if (cfri.m142691b()) {
            akzl.f73168c.mo2445a(this.f73207a, new akzy(this));
        }
        akzl.f73166a.mo2445a(this.f73207a, new akzz(this));
        akzl.f73167b.mo2445a(this.f73207a, new alaa(this));
    }

    /* renamed from: f */
    private final void m60734f() {
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) this.f73207a.getLayoutInflater().inflate((int) C0126R.C0128layout.octarine_account_disc, (ViewGroup) null);
        this.f73216j = accountParticleDisc;
        bqgj a = snp.m35702a(9);
        allp a2 = allq.m61232a();
        a2.f73626a = byug.ACCOUNT_SETTINGS_MOBILE.f168292ja;
        allq a3 = a2.mo40491a();
        bdej bdej = new bdej(a);
        AccountParticleDisc.m94876a(this.f73207a.getApplicationContext(), bdej, a, new bddp(), new bddr(this.f73207a.getApplicationContext(), a, a3), bddo.class);
        accountParticleDisc.mo60576a(bdej, bddo.class);
        mo40048e();
    }

    /* renamed from: a */
    public final Bundle mo40039a() {
        Bundle bundle = new Bundle();
        int i = this.f73217k;
        int i2 = i - 1;
        String str = null;
        if (i != 0) {
            bundle.putInt("upButtonAction", i2);
            int i3 = this.f73218l;
            int i4 = i3 - 1;
            if (i3 != 0) {
                bundle.putInt("accountDisplay", i4);
                bundle.putString("helpContext", this.f73211e);
                bundle.putString("helpUrl", this.f73212f);
                OctarineToolbar octarineToolbar = this.f73214h;
                if (octarineToolbar != null) {
                    CharSequence charSequence = octarineToolbar.f81418w;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    bundle.putString("title", str);
                }
                SparseArray sparseArray = new SparseArray();
                View view = this.f73213g;
                if (view != null) {
                    view.saveHierarchyState(sparseArray);
                    bundle.putSparseParcelableArray("toolbar", sparseArray);
                }
                return bundle;
            }
            throw null;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo40043b() {
        int i;
        View view = this.f73213g;
        if (view != null) {
            i = view.getHeight();
            if (i > 0) {
                return i;
            }
        } else {
            i = 0;
        }
        TypedValue typedValue = new TypedValue();
        return this.f73207a.getTheme().resolveAttribute(16843499, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, this.f73207a.getResources().getDisplayMetrics()) : i;
    }

    /* renamed from: c */
    public final void mo40045c() {
        int i;
        Object obj;
        if (this.f73215i != null) {
            sre.m36087g(this.f73207a);
            if (cfri.m142691b()) {
                AccountParticleDisc accountParticleDisc = this.f73216j;
                if (accountParticleDisc == null || !accountParticleDisc.mo60579b() || ((obj = this.f73216j.f111381h) != null && !((bddo) obj).mo57896b().equals(this.f73210d.mo40018a()))) {
                    m60734f();
                }
            } else {
                m60734f();
            }
            this.f73215i.setActionView(this.f73216j);
            this.f73216j.setOnClickListener(new alab(this));
            if (cfri.m142691b() && !this.f73219m) {
                TypedValue typedValue = new TypedValue();
                if (this.f73207a.getTheme().resolveAttribute(C0126R.attr.octProfileOverlayAlphaPercent, typedValue, true)) {
                    i = typedValue.data;
                } else {
                    i = MfiClientException.TYPE_MFICLIENT_STARTED;
                }
                int a = adyg.m51398a(adyg.m51405b(this.f73207a, C0126R.attr.octBackground, C0126R.color.google_white), akvo.f72966a);
                this.f73216j.setForeground(new ColorDrawable(Color.argb(i, Color.red(a), Color.green(a), Color.blue(a))));
            }
            mo40041a(this.f73215i, this.f73210d.mo40018a(), this.f73210d.mo40022b());
        }
    }

    /* renamed from: d */
    public final void mo40046d() {
        if (cfri.m142691b()) {
            this.f73219m = true;
            AccountParticleDisc accountParticleDisc = this.f73216j;
            if (accountParticleDisc != null) {
                accountParticleDisc.setForeground(null);
            }
        }
    }

    /* renamed from: e */
    public final void mo40048e() {
        AccountParticleDisc accountParticleDisc = this.f73216j;
        if (accountParticleDisc != null && accountParticleDisc.f111381h == null && this.f73210d.mo40018a() != null && this.f73210d.mo40022b() != null) {
            AccountParticleDisc accountParticleDisc2 = this.f73216j;
            bddn g = bddo.m90606g();
            g.mo57907a(this.f73210d.mo40018a());
            g.f105375a = this.f73210d.mo40022b();
            accountParticleDisc2.mo60577a(g.mo57906a());
        }
    }

    /* renamed from: d */
    public final void mo40047d(String str) {
        akzl akzl = this.f73210d;
        if (!str.equals(akzl.f73166a.mo2448b())) {
            akzl.f73166a.mo2450b(str);
            akzl.f73167b.mo2450b((Object) null);
            akzl.f73168c.mo2450b(new Account(str, "com.google"));
            akzl.mo40021a(str, (Runnable) null);
        }
    }

    /* renamed from: a */
    public final void mo39902a(int i) {
        if (i != 1) {
            this.f73218l = i;
            if (this.f73214h != null) {
                this.f73207a.invalidateOptionsMenu();
            }
        }
    }

    /* renamed from: b */
    public final void mo40044b(int i) {
        ViewGroup.LayoutParams layoutParams = this.f73209c.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.topMargin != i) {
                ((ViewGroup.MarginLayoutParams) this.f73209c.getLayoutParams()).setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.f73209c.requestLayout();
            }
        }
    }

    /* renamed from: a */
    public final void mo39903a(long j) {
        View view = this.f73213g;
        if (view != null && view.getVisibility() == 0) {
            if (cfri.m142693d()) {
                this.f73209c.setEnabled(false);
            }
            int b = mo40043b();
            mo40044b(0);
            if (j > 0) {
                this.f73209c.setTranslationY((float) b);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ObjectAnimator.ofFloat(this.f73213g, View.TRANSLATION_Y, (float) (-b))).with(ObjectAnimator.ofFloat(this.f73209c, View.TRANSLATION_Y, 0.0f));
                animatorSet.setDuration(j).addListener(new alac(this));
                animatorSet.start();
                return;
            }
            this.f73209c.setTranslationY(0.0f);
            this.f73213g.setVisibility(8);
            this.f73213g.setTranslationY((float) (-b));
            return;
        }
        mo40044b(0);
        this.f73209c.setTranslationY(0.0f);
    }

    /* renamed from: b */
    public final void mo39905b(long j) {
        if (this.f73213g == null) {
            mo40044b(0);
            this.f73209c.setTranslationY(0.0f);
            return;
        }
        if (cfri.m142693d()) {
            this.f73209c.setEnabled(true);
        }
        int b = mo40043b();
        if (this.f73213g.getVisibility() == 0) {
            this.f73209c.setTranslationY(0.0f);
            mo40044b(b);
        } else if (j > 0) {
            mo40044b(0);
            if (this.f73213g.getY() >= 0.0f) {
                this.f73213g.setTranslationY((float) (-b));
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.f73213g, View.TRANSLATION_Y, 0.0f)).with(ObjectAnimator.ofFloat(this.f73209c, View.TRANSLATION_Y, (float) b));
            animatorSet.setDuration(j);
            animatorSet.addListener(new alad(this, b));
            animatorSet.start();
        } else {
            mo40044b(b);
            this.f73209c.setTranslationY(0.0f);
            this.f73213g.setVisibility(0);
            this.f73213g.setTranslationY(0.0f);
        }
    }

    /* renamed from: a */
    public final void mo40040a(Bundle bundle) {
        View view;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("toolbar");
        if (sparseParcelableArray == null || sparseParcelableArray.size() <= 0 || (view = this.f73213g) == null) {
            OctarineToolbar octarineToolbar = this.f73214h;
            if (octarineToolbar != null) {
                octarineToolbar.mo44780f(this.f73220n);
            }
        } else {
            view.restoreHierarchyState(sparseParcelableArray);
        }
        mo39904a(bundle.getString("title"));
        this.f73217k = bsmp.m115983a(bundle.getInt("upButtonAction", 1));
        int i = this.f73221o;
        int i2 = i - 1;
        if (i != 0) {
            mo39902a(bsmn.m115981a(bundle.getInt("accountDisplay", i2)));
            mo39906b(bundle.getString("helpContext"));
            mo39907c(bundle.getString("helpUrl"));
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public final void mo39907c(String str) {
        this.f73212f = stm.m36300b(str);
        this.f73207a.invalidateOptionsMenu();
    }

    /* renamed from: b */
    public final void mo39906b(String str) {
        this.f73211e = stm.m36300b(str);
        this.f73207a.invalidateOptionsMenu();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40041a(MenuItem menuItem, String str, String str2) {
        if (menuItem != null && menuItem.getActionView() != null) {
            String string = this.f73207a.getString(C0126R.string.common_asm_google_account_title);
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(": ");
            if (str2 != null) {
                sb.append(str2);
                sb.append(" ");
            }
            sb.append("(");
            sb.append(str);
            sb.append(")");
            C1280ps.m19906b(menuItem.getActionView(), 1);
            menuItem.getActionView().setContentDescription(sb.toString());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo40042a(View view, Activity activity) {
        boolean z;
        if (!cfri.m142691b() || this.f73219m) {
            if (cfri.m142691b()) {
                int i = this.f73218l;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i2 == 3) {
                    res res = new res();
                    res.mo24564a(Arrays.asList("com.google"));
                    res.f42827e = "com.google.android.gms";
                    res.mo24565b();
                    res.f42825c = activity.getResources().getString(C0126R.string.common_choose_account);
                    res.f42828f = 1001;
                    res.mo24566c();
                    activity.startActivityForResult(rew.m33488a(res.mo24563a()), 10);
                    return;
                }
            }
            if (C1221nn.m19678a(akzn.m60713a()) == 1) {
                z = true;
            } else {
                z = false;
            }
            String a = this.f73210d.mo40018a();
            String b = this.f73210d.mo40022b();
            View inflate = ((LayoutInflater) this.f73207a.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.octarine_account_popup, (ViewGroup) this.f73207a.findViewById(C0126R.C0129id.octarine_webview_frame), false);
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.account_display_name);
            TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.account_name);
            if (b == null) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(b);
            }
            textView2.setText(a);
            if (z) {
                textView.setGravity(3);
                textView2.setGravity(3);
            } else {
                textView.setGravity(5);
                textView2.setGravity(5);
            }
            PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
            popupWindow.setBackgroundDrawable(new ColorDrawable(C1133kh.m17843b(view.getContext(), C0126R.color.google_transparent)));
            popupWindow.setFocusable(true);
            popupWindow.setOutsideTouchable(true);
            inflate.setVisibility(4);
            popupWindow.showAsDropDown(view, 0, 0);
            inflate.addOnLayoutChangeListener(new alae(inflate, popupWindow, z, view));
        }
    }

    /* renamed from: a */
    public final void mo39904a(String str) {
        OctarineToolbar octarineToolbar = this.f73214h;
        if (octarineToolbar != null) {
            octarineToolbar.mo1679a(str);
            if (this.f73209c != null && !TextUtils.isEmpty(str)) {
                this.f73209c.announceForAccessibility(str);
            }
        }
    }
}
