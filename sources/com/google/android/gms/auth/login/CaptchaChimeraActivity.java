package com.google.android.gms.auth.login;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.android.setupwizard.navigationbar.SetupWizardNavBar;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CaptchaChimeraActivity extends jem implements View.OnClickListener, blv {

    /* renamed from: a */
    private EditText f10989a;

    /* renamed from: m */
    private Button f10990m;

    /* renamed from: n */
    private Button f10991n;

    /* renamed from: o */
    private ImageView f10992o;

    /* renamed from: p */
    private Bitmap f10993p;

    /* renamed from: a */
    public final void mo3251a() {
    }

    /* renamed from: b */
    public final void mo3253b() {
    }

    /* renamed from: c */
    public final void mo7729c() {
        String obj = this.f10989a.getText().toString();
        setResult(-1, new Intent().putExtra("answer", obj).setAction(obj));
        finish();
    }

    /* renamed from: f */
    public final void mo7730f() {
        boolean z = !TextUtils.isEmpty(this.f10989a.getText());
        this.f10990m.setEnabled(z);
        this.f10990m.setFocusable(z);
    }

    public void onClick(View view) {
        if (view == this.f10991n) {
            setResult(1);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f10993p = (Bitmap) getIntent().getExtras().getParcelable("bitmap");
        } else {
            this.f10993p = (Bitmap) bundle.getParcelable("bitmap");
        }
        int i = Build.VERSION.SDK_INT;
        bjbx bjbx = new bjbx(this);
        setContentView(bjbx);
        bjbx.mo64986a((int) C0126R.string.auth_ui_activity_authenticating, (int) C0126R.C0128layout.auth_captcha_activity_content);
        ImageView imageView = (ImageView) findViewById(C0126R.C0129id.captcha_image_view);
        this.f10992o = imageView;
        imageView.setImageBitmap(this.f10993p);
        EditText editText = (EditText) findViewById(C0126R.C0129id.captcha_answer_edit);
        this.f10989a = editText;
        editText.addTextChangedListener(this);
        mo13655a(this.f10989a, false);
        mo7730f();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("bitmap", this.f10993p);
    }

    /* renamed from: a */
    public final void mo3252a(SetupWizardNavBar setupWizardNavBar) {
        this.f10990m = setupWizardNavBar.f7192a;
        this.f10991n = setupWizardNavBar.f7193b;
        boolean z = this.f22282e;
        setupWizardNavBar.mo4069a(z, z);
        this.f10991n.setOnClickListener(this);
        mo13655a(this.f10990m, true);
    }
}
