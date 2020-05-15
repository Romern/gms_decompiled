package p000;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: jem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class jem extends jeg implements TextWatcher {

    /* renamed from: a */
    private Boolean f22288a;

    /* renamed from: f */
    protected FrameLayout f22289f;

    /* renamed from: g */
    protected View f22290g;

    /* renamed from: h */
    protected boolean f22291h = true;

    /* renamed from: i */
    protected TextView f22292i;

    /* renamed from: j */
    protected int f22293j;

    /* renamed from: k */
    protected final View.OnClickListener f22294k = new jeh(this);

    /* renamed from: l */
    public final View.OnClickListener f22295l = new jei(this);

    /* renamed from: m */
    private final TextView.OnEditorActionListener f22296m = new jej(this);

    /* renamed from: a */
    public static boolean m16600a(String str) {
        return str.indexOf(46) < str.length() + -1 && str.indexOf(46) > 0 && str.indexOf(64) < 0;
    }

    public final void afterTextChanged(Editable editable) {
        mo7730f();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7729c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo7747d() {
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int keyCode2 = keyEvent.getKeyCode();
        int keyCode3 = keyEvent.getKeyCode();
        int keyCode4 = keyEvent.getKeyCode();
        int keyCode5 = keyEvent.getKeyCode();
        if (keyCode != 4) {
            if (!keyEvent.isSystem() || keyCode2 == 82 || keyCode3 == 5 || keyCode4 == 24 || keyCode5 == 25) {
                return super.dispatchKeyEvent(keyEvent);
            }
            return true;
        } else if (this.f22291h) {
            return super.dispatchKeyEvent(keyEvent);
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final View mo13658e() {
        FrameLayout frameLayout = this.f22289f;
        if (frameLayout != null) {
            return frameLayout.getChildAt(0);
        }
        return null;
    }

    /* renamed from: f */
    public void mo7730f() {
    }

    public final void finish() {
        super.finish();
        int i = Build.VERSION.SDK_INT;
        overridePendingTransition(17432576, 17432577);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (((java.lang.Boolean) p000.ilp.f21300b.invoke(r0, new java.lang.Object[0])).booleanValue() != false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    public void onCreate(Bundle bundle) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        super.onCreate(bundle);
        if (!isFinishing()) {
            if (ilp.f21299a != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(this);
                if (ilp.f21300b != null) {
                }
                if (mo7747d()) {
                    requestWindowFeature(9);
                    if (ilp.f21299a != null) {
                        try {
                            Object invoke = ilp.f21299a.invoke(this, new Object[0]);
                            ilp.f21302d.invoke(invoke, false);
                        } catch (Exception e) {
                        }
                    }
                    if (ilp.f21299a != null) {
                        try {
                            Object invoke2 = ilp.f21299a.invoke(this, new Object[0]);
                            if (invoke2 != null) {
                                ilp.f21303e.invoke(invoke2, false);
                            }
                        } catch (Exception e2) {
                        }
                    }
                    this.f22289f = new FrameLayout(this);
                    mo13659g();
                    if (bundle != null) {
                        this.f22293j = bundle.getInt("nextRequest");
                    }
                    int i = Build.VERSION.SDK_INT;
                    findViewById = findViewById(C0126R.C0129id.next_button);
                    if (findViewById != null) {
                        findViewById.setBackgroundResource(C0126R.C0127drawable.auth_btn_dir_next_holo_dark);
                    }
                    findViewById2 = findViewById(C0126R.C0129id.back_button);
                    if (findViewById2 != null) {
                        findViewById2.setBackgroundResource(C0126R.C0127drawable.auth_btn_dir_prev_holo_dark);
                    }
                    findViewById3 = findViewById(C0126R.C0129id.cancel_button);
                    if (findViewById3 != null) {
                        findViewById3.setBackgroundResource(C0126R.C0127drawable.auth_btn_dir_prev_holo_dark);
                    }
                    super.setContentView(this.f22289f);
                }
            }
            requestWindowFeature(1);
            this.f22289f = new FrameLayout(this);
            mo13659g();
            if (bundle != null) {
            }
            int i2 = Build.VERSION.SDK_INT;
            findViewById = findViewById(C0126R.C0129id.next_button);
            if (findViewById != null) {
            }
            findViewById2 = findViewById(C0126R.C0129id.back_button);
            if (findViewById2 != null) {
            }
            findViewById3 = findViewById(C0126R.C0129id.cancel_button);
            if (findViewById3 != null) {
            }
            super.setContentView(this.f22289f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        View findViewById;
        super.onRestoreInstanceState(bundle);
        int i = bundle.getInt("currentFocus", -1);
        if (i != -1 && (findViewById = findViewById(i)) != null) {
            findViewById.requestFocus();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        View currentFocus = getCurrentFocus();
        bundle.putInt("currentFocus", currentFocus != null ? currentFocus.getId() : -1);
        bundle.putInt("nextRequest", this.f22293j);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void setContentView(int i) {
        setContentView(getLayoutInflater().inflate(i, (ViewGroup) null));
    }

    public final void setTitle(int i) {
        setTitle(getString(i));
    }

    public final void startActivity(Intent intent) {
        super.startActivity(intent);
        int i = Build.VERSION.SDK_INT;
        overridePendingTransition(17432576, 17432577);
    }

    public final void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        int i2 = Build.VERSION.SDK_INT;
        overridePendingTransition(17432576, 17432577);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13655a(View view, boolean z) {
        if (z) {
            this.f22290g = view;
        }
        if (view instanceof EditText) {
            ((EditText) view).setOnEditorActionListener(this.f22296m);
        } else {
            view.setOnClickListener(this.f22295l);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo13659g() {
        int i = Build.VERSION.SDK_INT;
        if (this.f22282e) {
            Boolean bool = this.f22288a;
            if (bool == null || !bool.booleanValue()) {
                this.f22288a = true;
                View decorView = getWindow().getDecorView();
                decorView.getViewTreeObserver().addOnPreDrawListener(new jek(decorView));
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 5634);
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setStatusBarColor(17170445);
                getWindow().setNavigationBarColor(17170445);
                return;
            }
            return;
        }
        mo13660h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo13660h() {
        int i = Build.VERSION.SDK_INT;
        Boolean bool = this.f22288a;
        if (bool == null || bool.booleanValue()) {
            this.f22288a = false;
            View decorView = getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnPreDrawListener(new jel(decorView));
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5635);
            getWindow().clearFlags(Integer.MIN_VALUE);
        }
    }

    public final void setContentView(View view) {
        this.f22289f.addView(view);
        this.f22292i = (TextView) findViewById(C0126R.C0129id.title);
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = (TextView) findViewById(C0126R.C0129id.title);
        this.f22292i = textView;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            super.setTitle(charSequence);
        }
    }
}
