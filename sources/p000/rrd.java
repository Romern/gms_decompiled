package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.chimera.FragmentActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: rrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rrd extends FragmentActivity {

    /* renamed from: a */
    public rrq f43541a;

    /* renamed from: b */
    private boolean f43542b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25037a(String str, boolean z) {
        if (cbzk.m128961c()) {
            rrp.m34303a(this, str);
        } else {
            rrp.m34304a(this, str, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public rrq mo25038i() {
        return rrq.m34308a(getIntent().getBundleExtra("ui_parameters"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo25039j() {
        return this.f43541a.f43552a;
    }

    public final void onAttachedToWindow() {
        if (this.f43541a.f43554c) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = this.f43541a.f43555d;
            attributes.height = this.f43541a.f43556e;
            if (this.f43541a.f43553b) {
                window.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
            }
            window.setAttributes(attributes);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f43541a = mo25038i();
        this.f43542b = intent.getBooleanExtra("use_immersive_mode", false);
        if (cbzk.m128961c()) {
            rrp.m34305a(this, this.f43542b, this);
        }
        mo25037a(this.f43541a.f43552a, this.f43542b);
    }
}
