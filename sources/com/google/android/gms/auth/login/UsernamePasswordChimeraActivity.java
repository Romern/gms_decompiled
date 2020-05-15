package com.google.android.gms.auth.login;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.android.setupwizard.navigationbar.SetupWizardNavBar;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UsernamePasswordChimeraActivity extends jem implements View.OnFocusChangeListener, blv {

    /* renamed from: a */
    protected EditText f11035a;

    /* renamed from: m */
    protected EditText f11036m;

    /* renamed from: n */
    public boolean f11037n;

    /* renamed from: o */
    public boolean f11038o;

    /* renamed from: p */
    protected String f11039p = "";

    /* renamed from: q */
    protected String f11040q = "";

    /* renamed from: r */
    private View f11041r;

    /* renamed from: s */
    private View f11042s;

    /* renamed from: t */
    private boolean f11043t;

    /* renamed from: u */
    private long f11044u;

    /* renamed from: v */
    private String f11045v;

    /* renamed from: w */
    private String f11046w;

    /* renamed from: x */
    private boolean f11047x;

    /* renamed from: y */
    private boolean f11048y;

    /* renamed from: b */
    private final String m6690b(String str) {
        String str2;
        Resources resources = getResources();
        if (TextUtils.isEmpty(str)) {
            str = null;
        } else if (!str.contains("@")) {
            String valueOf = String.valueOf(str);
            String string = resources.getString(C0126R.string.auth_gmail_host_name);
            if (ilp.m15664a() && "de".equalsIgnoreCase(ryv.m34681a(this, "device_country", null))) {
                string = resources.getString(C0126R.string.auth_googlemail_host_name);
            }
            if (string != null) {
                String valueOf2 = String.valueOf(string);
                str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            } else {
                throw new IllegalStateException("Couldn't find gmail_host_name");
            }
        }
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (!jem.m16600a(str)) {
                    String[] split = str.split("@");
                    if (split.length == 2 && jem.m16600a(split[1])) {
                        str2 = split[1];
                    }
                } else {
                    str2 = str;
                }
                if (str2.length() <= 0 || str.trim().indexOf(64) <= 0) {
                    return null;
                }
            }
            str2 = "";
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public final void mo3251a() {
    }

    /* renamed from: b */
    public final void mo3253b() {
    }

    /* renamed from: c */
    public final void mo7729c() {
        if (this.f11047x) {
            this.f11045v = this.f11035a.getText().toString();
        }
        this.f11046w = this.f11036m.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("account_name", this.f11045v);
        intent.putExtra("password", this.f11046w);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo7747d() {
        return true;
    }

    /* renamed from: f */
    public final void mo7730f() {
        boolean z;
        boolean z2;
        Editable text = this.f11035a.getText();
        Editable text2 = this.f11036m.getText();
        boolean z3 = true;
        if (this.f11037n || TextUtils.isEmpty(text) || m6690b(text.toString()) == null) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f11047x) {
            z = true;
        }
        if (this.f11038o || TextUtils.isEmpty(text2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z) {
            z3 = false;
        } else if (!z2) {
            z3 = false;
        }
        View view = this.f11041r;
        if (view != null) {
            view.setEnabled(z3);
            this.f11041r.setFocusable(z3);
        }
    }

    /* renamed from: i */
    public final void mo7748i() {
        setResult(6);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        this.f11045v = bundle.getString("account_name");
        this.f11046w = bundle.getString("password");
        this.f11047x = bundle.getBoolean("is_adding_account", false);
        this.f11048y = bundle.getBoolean("is_confirming_credentials", false);
        if (!TextUtils.isEmpty(this.f11045v)) {
            this.f11039p = this.f11045v;
        }
        int i = Build.VERSION.SDK_INT;
        bjbx bjbx = new bjbx(this);
        setContentView(bjbx);
        bjbx.mo64986a((int) C0126R.string.common_login_error_title, (int) C0126R.C0128layout.auth_login_activity_content);
        ((TextView) findViewById(C0126R.C0129id.browser_signin_button)).setOnClickListener(new jfi(this));
        this.f11035a = (EditText) findViewById(C0126R.C0129id.username_edit);
        this.f11036m = (EditText) findViewById(C0126R.C0129id.password_edit);
        if (this.f11047x) {
            this.f11035a.setFilters(new InputFilter[]{new jfj(this)});
            this.f11035a.setOnFocusChangeListener(this);
            this.f11035a.addTextChangedListener(this);
            String str = this.f11045v;
            if (str != null) {
                this.f11035a.setText(str);
                this.f11036m.requestFocus();
                this.f11043t = true;
            } else {
                this.f11035a.requestFocus();
            }
        } else {
            if (!this.f11048y) {
                ((TextView) findViewById(C0126R.C0129id.title)).setText((int) C0126R.string.auth_relogin_activity_title);
            }
            this.f11035a.setVisibility(8);
            TextView textView = (TextView) findViewById(C0126R.C0129id.username_fixed);
            textView.setText(this.f11045v);
            textView.setVisibility(0);
            this.f11036m.requestFocus();
        }
        this.f11036m.setFilters(new InputFilter[]{new jfk(this)});
        this.f11036m.setOnFocusChangeListener(this);
        this.f11036m.addTextChangedListener(this);
        mo13655a(this.f11036m, false);
        if (TextUtils.isEmpty(this.f11035a.getText())) {
            this.f11035a.setText(this.f11039p);
        }
        if (TextUtils.isEmpty(this.f11036m.getText())) {
            this.f11036m.setText(this.f11040q);
        }
        mo7730f();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuItem add = menu.add(0, 1, 0, (int) C0126R.string.auth_sign_in_browser);
        add.setIcon((int) C0126R.C0127drawable.auth_ic_menu_account);
        if (ilp.f21301c != null) {
            try {
                ilp.f21301c.invoke(add, 4);
            } catch (Exception e) {
            }
        }
        return true;
    }

    public final void onFocusChange(View view, boolean z) {
        EditText editText = this.f11035a;
        if (view != editText || z || !this.f11047x) {
            EditText editText2 = this.f11036m;
            if (view == editText2 && !z) {
                if (this.f11038o) {
                    editText2.setError(getText(C0126R.string.auth_invalid_password_character));
                } else if (TextUtils.isEmpty(editText2.getText().toString())) {
                    this.f11036m.setError(getText(C0126R.string.auth_field_cant_be_blank));
                }
            }
        } else if (!this.f11037n) {
            String obj = editText.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                this.f11035a.setError(getText(C0126R.string.auth_field_cant_be_blank));
                return;
            }
            String b = m6690b(obj);
            if (b != null) {
                this.f11035a.setText(b);
                this.f11035a.setError(null);
                return;
            }
            this.f11035a.setError(getString(C0126R.string.auth_invalid_username));
        } else {
            editText.setError(getString(C0126R.string.auth_invalid_login_character));
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 1) {
            mo7748i();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.f11044u = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        EditText editText = this.f11035a;
        if (editText != null) {
            if (editText.getText().length() == 0) {
                this.f11035a.setText(this.f11039p);
            }
            EditText editText2 = this.f11035a;
            editText2.setTextKeepState(editText2.getText());
            mo7730f();
            this.f11035a.setError(null);
            if (System.currentTimeMillis() - this.f11044u > 1000) {
                this.f11036m.setTextKeepState(this.f11040q);
                if (this.f11043t) {
                    this.f11036m.requestFocus();
                } else {
                    this.f11035a.requestFocus();
                }
            }
            if (TextUtils.isEmpty(this.f11040q)) {
                this.f11038o = false;
                this.f11036m.setError(null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("account_name", this.f11045v);
        bundle.putString("password", this.f11046w);
        bundle.putBoolean("is_adding_account", this.f11047x);
        bundle.putBoolean("is_confirming_credentials", this.f11048y);
    }

    /* renamed from: a */
    public final void mo3252a(SetupWizardNavBar setupWizardNavBar) {
        Button button = setupWizardNavBar.f7192a;
        this.f11041r = button;
        mo13655a(button, true);
        Button button2 = setupWizardNavBar.f7193b;
        this.f11042s = button2;
        if (button2 != null) {
            button2.setOnClickListener(this.f22294k);
            this.f22291h = true;
        }
        boolean z = this.f22282e;
        setupWizardNavBar.mo4069a(z, z);
    }
}
