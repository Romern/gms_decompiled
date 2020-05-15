package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.view.GoogleAccountAvatar;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupChimeraActivity extends ajhe {

    /* renamed from: i */
    public TextView f80978i;

    /* renamed from: j */
    public TextView f80979j;

    /* renamed from: k */
    public TextView f80980k;

    /* renamed from: l */
    public ImageView f80981l;

    /* renamed from: m */
    public int f80982m;

    /* renamed from: n */
    public GoogleAccountAvatar f80983n;

    /* renamed from: o */
    private Button f80984o;

    /* renamed from: p */
    private final BroadcastReceiver f80985p = new aacn("nearby") {
        /* class com.google.android.gms.nearby.sharing.SetupChimeraActivity.C16201 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if ("com.google.android.gms.nearby.sharing.STATE_CHANGED".equals(intent.getAction())) {
                SetupChimeraActivity.this.mo44476i();
            }
        }
    };

    /* renamed from: a */
    public static Intent m67552a(Context context) {
        return new Intent().addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE).setClassName(context, "com.google.android.gms.nearby.sharing.SetupActivity");
    }

    /* renamed from: j */
    private final void m67554j() {
        this.f70615c.mo38912e().mo50373a(new ajqw(this));
    }

    /* renamed from: h */
    public final void mo44475h() {
        ajty ajty = this.f70615c;
        roz b = rpa.m34196b();
        b.f43472a = ajti.f71268a;
        b.f43473b = new Feature[]{ahca.f66970a};
        ajty.mo24732b(b.mo24977a());
        this.f70615c.mo38905b(true);
        setResult(-1);
        finishAfterTransition();
    }

    /* renamed from: i */
    public final void mo44476i() {
        if (!cfov.m142061n() || !sre.m36082b(this)) {
            m67554j();
            this.f70615c.mo38893G().mo50373a(new ajqx(this));
            this.f70615c.mo38910d().mo50373a(new ajqy(this));
            return;
        }
        m67554j();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        Account a;
        if (i != 1001) {
            if (i != 1002) {
                if (i != 1004) {
                    super.onActivityResult(i, i2, intent);
                } else if (i2 != -1) {
                    srn srn = ajvp.f71371a;
                    this.f70615c.mo38899a(0);
                } else {
                    srn srn2 = ajvp.f71371a;
                    mo44475h();
                }
            } else if (i2 == -1) {
                srn srn3 = ajvp.f71371a;
            }
        } else if (i2 == -1 && (a = akhu.m59724a(intent)) != null) {
            this.f70615c.mo38903a(a);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!cfov.m142066s()) {
            finish();
            return;
        }
        setContentView((int) C0126R.C0128layout.sharing_activity_setup);
        mo8626a((Toolbar) findViewById(C0126R.C0129id.toolbar));
        mo8628aW().mo15858c(false);
        findViewById(C0126R.C0129id.device_name_btn).setOnClickListener(new ajqh(this));
        this.f80978i = (TextView) findViewById(C0126R.C0129id.device_name);
        this.f80983n = (GoogleAccountAvatar) findViewById(C0126R.C0129id.change_account);
        View findViewById = findViewById(C0126R.C0129id.visibility);
        this.f80979j = (TextView) findViewById.findViewById(C0126R.C0129id.visibility_label);
        this.f80980k = (TextView) findViewById.findViewById(C0126R.C0129id.visibility_sublabel);
        this.f80981l = (ImageView) findViewById.findViewById(C0126R.C0129id.visibility_icon);
        if (!cfov.m142061n() || !sre.m36082b(this)) {
            findViewById.setOnClickListener(new ajqs(this));
        } else {
            findViewById.setVisibility(8);
            this.f80983n.setVisibility(8);
        }
        findViewById(C0126R.C0129id.cancel).setOnClickListener(new ajqt(this));
        Button button = (Button) findViewById(C0126R.C0129id.enable);
        this.f80984o = button;
        button.setOnClickListener(new ajqu(this));
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        ahhd.m55767a(this, this.f80985p, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
        mo44476i();
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("SetupActivity has started");
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        ahhd.m55766a(this, this.f80985p);
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("SetupActivity has stopped");
        super.onStop();
    }

    /* renamed from: a */
    public static Drawable m67553a(Context context, int i) {
        return new ajwz(new C1416ut(context, i));
    }

    /* renamed from: a */
    public final void mo44474a(CharSequence charSequence) {
        this.f70615c.mo38898a(charSequence).mo50371a(new ajqm(this));
    }
}
