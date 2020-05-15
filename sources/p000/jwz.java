package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.config.ModuleManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: jwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jwz extends FragmentActivity implements jxe, jyb {

    /* renamed from: i */
    public static final imr f23428i = imr.m15727a("ui_parameters");

    /* renamed from: j */
    public static final imr f23429j = imr.m15727a("useImmersiveMode");

    /* renamed from: k */
    public static final imr f23430k = imr.m15727a("theme");

    /* renamed from: CM */
    private ims f23431CM;

    /* renamed from: CN */
    private boolean f23432CN;

    /* renamed from: CO */
    private rrq f23433CO;

    /* renamed from: l */
    public jyc f23434l;

    /* renamed from: m */
    protected imj f23435m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7874a(int i, Intent intent) {
        this.f23434l.mo14218a(i);
        setResult(i, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo7384b();

    /* access modifiers changed from: protected */
    /* renamed from: ba */
    public void mo7716ba() {
        String str = this.f23433CO.f43552a;
        if (cbzk.m128961c()) {
            rrp.m34303a(this, str);
        } else {
            rrp.m34304a(this, str, this.f23432CN);
        }
    }

    /* renamed from: bb */
    public boolean mo14094bb() {
        return true;
    }

    /* renamed from: f */
    public final rrq mo14203f() {
        rrq rrq = this.f23433CO;
        if (rrq != null) {
            return rrq;
        }
        throw new IllegalStateException("Must not access ui parameters before they are initialized.");
    }

    /* renamed from: g */
    public final ims mo14202g() {
        ims ims = this.f23431CM;
        if (ims != null) {
            return ims;
        }
        throw new IllegalStateException("Must not access state before fragment onCreate().");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo14204h() {
        this.f23434l.mo14220b();
    }

    /* renamed from: i */
    public final boct mo14205i() {
        return (boct) this.f23434l.f23509a.mo74062i();
    }

    /* renamed from: j */
    public final bxvd mo14206j() {
        return this.f23434l.f23509a;
    }

    public final void onAttachedToWindow() {
        if (this.f23433CO.f43554c) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = this.f23433CO.f43555d;
            attributes.height = this.f23433CO.f43556e;
            if (this.f23433CO.f43553b) {
                window.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
            }
            window.setAttributes(attributes);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        rrq rrq;
        super.onCreate(bundle);
        this.f23431CM = jxj.m17464a(this, bundle);
        jyc a = jyc.m17496a(this, this, this);
        this.f23434l = a;
        a.mo14219a(mo7384b());
        try {
            ModuleManager.ModuleInfo currentModule = ModuleManager.get(this).getCurrentModule();
            this.f23434l.mo14221b(currentModule.moduleVersion);
            this.f23434l.mo14222b(currentModule.moduleId);
        } catch (IllegalStateException e) {
        }
        Bundle bundle2 = (Bundle) mo14202g().mo13146a(f23428i);
        if (bundle2 == null) {
            rrq = rrq.m34308a(null);
            rrq.f43552a = (String) mo14202g().mo13146a(f23430k);
        } else {
            rrq = rrq.m34308a(bundle2);
        }
        this.f23433CO = rrq;
        this.f23432CN = ((Boolean) mo14202g().mo13147a(f23429j, false)).booleanValue();
        if (cbzk.m128961c()) {
            rrp.m34305a(this, this.f23432CN, this);
        }
        mo7716ba();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (isFinishing()) {
            mo14204h();
            this.f23434l.mo14223c();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (cbzk.m128961c()) {
            if (this.f23432CN) {
                imj imj = this.f23435m;
                if (imj != null) {
                    imj.mo7886b(getWindow());
                }
            } else {
                imj imj2 = this.f23435m;
                if (imj2 != null) {
                    imj2.mo7887b(getWindow(), this);
                }
            }
        }
        this.f23434l.mo14217a();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f23434l.mo14220b();
        jxj.m17466a(this.f23431CM, bundle);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (isFinishing()) {
            mo14204h();
            this.f23434l.mo14223c();
        }
        super.onStop();
    }
}
