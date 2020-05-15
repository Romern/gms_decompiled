package com.google.android.gms.auth.frp;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.setupdesign.GlifLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FreUnlockChimeraActivity extends jwz implements View.OnClickListener, LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    static final imr f10931a = imr.m15727a("key_frp_challenge_present");

    /* renamed from: b */
    public static final imr f10932b = imr.m15727a("key_device_owner_component");

    /* renamed from: c */
    public static final imr f10933c = imr.m15727a("key_device_owner_state");

    /* renamed from: d */
    public static final imr f10934d = imr.m15727a("key_dpc_installed");

    /* renamed from: e */
    private static final sek f10935e = ght.m13171a("AddAccount", "FreUnlockActivity");

    /* renamed from: f */
    private rrr f10936f;

    /* renamed from: g */
    private View f10937g;

    /* renamed from: h */
    private biyn f10938h;

    /* renamed from: n */
    private TextView f10939n;

    /* renamed from: o */
    private PendingIntent f10940o;

    /* renamed from: p */
    private ixl f10941p;

    /* renamed from: a */
    public static Intent m6632a(Context context, rrq rrq, boolean z, PersistentDeviceOwnerState persistentDeviceOwnerState, boolean z2) {
        Bundle bundle;
        ComponentName componentName;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.auth.frp.FreUnlockActivity");
        ims ims = new ims();
        imr imr = jwz.f23428i;
        String str = null;
        if (rrq != null) {
            bundle = rrq.mo25045a();
        } else {
            bundle = null;
        }
        ims.mo13148b(imr, bundle);
        ims.mo13148b(jwz.f23429j, Boolean.valueOf(z));
        ims.mo13148b(f10931a, Boolean.valueOf(z2));
        imr imr2 = f10932b;
        if (persistentDeviceOwnerState != null) {
            componentName = persistentDeviceOwnerState.f10958a;
        } else {
            componentName = null;
        }
        ims.mo13148b(imr2, componentName);
        imr imr3 = f10933c;
        if (persistentDeviceOwnerState != null) {
            str = persistentDeviceOwnerState.f10959b;
        }
        ims.mo13148b(imr3, str);
        intent.putExtras(ims.f21367a);
        return intent;
    }

    /* renamed from: c */
    private final ixl m6635c() {
        if (this.f10941p == null) {
            this.f10941p = new ixl(this);
        }
        return this.f10941p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "FreUnlockActivity";
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i != 2) {
                sek sek = f10935e;
                StringBuilder sb = new StringBuilder(53);
                sb.append("Unknown request code in onActivityResult: ");
                sb.append(i);
                sek.mo25412b(sb.toString(), new Object[0]);
            } else if (i2 == -1) {
                getSupportLoaderManager().initLoader(1, null, this);
            }
        } else if (i2 == 3) {
            m6634a(true);
        } else if (i2 == 2) {
            m6634a(false);
            if (!((Boolean) mo14202g().mo13146a(f10931a)).booleanValue()) {
                this.f10938h.f122315g.mo64885a(0);
            }
        } else {
            this.f10939n.setVisibility(8);
            if (i2 == -1) {
                mo14202g().mo13148b(f10934d, true);
                mo7712a((ComponentName) mo14202g().mo13146a(f10932b), (String) mo14202g().mo13146a(f10933c));
            }
        }
    }

    public void onClick(View view) {
        if (view == this.f10937g) {
            m6633a(1);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (mo14202g().mo13146a(f10932b) == null) {
            m6633a(-1);
            f10935e.mo25418e("Device owner component is missing.", new Object[0]);
            return;
        }
        getSupportLoaderManager().initLoader(3, null, this);
        rrr a = rrr.m34310a(this, C0126R.C0128layout.auth_fre_unlock_glif_activity);
        this.f10936f = a;
        rrp.m34302a(a.mo25046a());
        this.f10936f.mo25047a(getText(C0126R.string.auth_frp_start_reenroll_device_title));
        ViewGroup a2 = this.f10936f.mo25046a();
        setContentView(a2);
        this.f10938h = (biyn) ((GlifLayout) this.f10936f.mo25046a().findViewById(C0126R.C0129id.setup_wizard_layout)).mo71342a(biyn.class);
        biyo biyo = new biyo(this);
        biyo.mo64883a(C0126R.string.sud_next_button_label);
        biyo.f122327b = new jdk(this);
        biyo.f122328c = 5;
        biyo.f122329d = 2132018229;
        biyp a3 = biyo.mo64882a();
        this.f10938h.mo52733a(a3);
        biyo biyo2 = new biyo(this);
        biyo2.mo64883a(C0126R.string.common_skip);
        biyo2.f122327b = new jdl(this);
        biyo2.f122328c = 7;
        biyo2.f122329d = 2132018230;
        this.f10938h.mo52735b(biyo2.mo64882a());
        this.f10938h.f122315g.mo64885a(8);
        View findViewById = a2.findViewById(C0126R.C0129id.auth_frp_enter_device_credentials);
        this.f10937g = findViewById;
        findViewById.setOnClickListener(this);
        this.f10939n = (TextView) a2.findViewById(C0126R.C0129id.auth_frp_dpc_install_error);
        boolean booleanValue = ((Boolean) mo14202g().mo13147a(f10931a, false)).booleanValue();
        View view = this.f10937g;
        if (!booleanValue) {
            i2 = 8;
        }
        view.setVisibility(i2);
        this.f10937g.setEnabled(booleanValue);
        a3.mo64888a(true);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i == 1) {
            return new jdn(this, m6635c());
        }
        if (i == 2) {
            return new jdm(this, m6635c());
        }
        if (i == 3) {
            return new jdj(this, new jfs(rpr.m34216b()), ((ComponentName) mo14202g().mo13146a(f10932b)).getPackageName(), mo14202g().f21367a);
        }
        sek sek = f10935e;
        StringBuilder sb = new StringBuilder(29);
        sb.append("Unknown loader ID ");
        sb.append(i);
        sek.mo25418e(sb.toString(), new Object[0]);
        return null;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Bundle bundle = (Bundle) obj;
        int id = loader.getId();
        if (id == 1) {
            m6633a(111);
        } else if (id == 2) {
            m6633a(-1);
        } else if (id != 3) {
            sek sek = f10935e;
            int id2 = loader.getId();
            StringBuilder sb = new StringBuilder(29);
            sb.append("Unknown loader ID ");
            sb.append(id2);
            sek.mo25418e(sb.toString(), new Object[0]);
        } else {
            this.f10940o = (PendingIntent) bundle.getParcelable("pending_intent");
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* renamed from: a */
    private final void m6633a(int i) {
        mo7874a(i, (Intent) null);
    }

    /* renamed from: a */
    private final void m6634a(boolean z) {
        if (!z) {
            this.f10939n.setText((int) C0126R.string.auth_frp_install_dpc_error);
        } else {
            this.f10939n.setText((int) C0126R.string.auth_frp_install_dpc_recoverable_error);
        }
        this.f10939n.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo7711a() {
        PendingIntent pendingIntent = this.f10940o;
        if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                f10935e.mo25417e("Failed to start DPC install activity.", e, new Object[0]);
            }
        } else {
            f10935e.mo25418e("DPC install launching intent is not loaded yet.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo7712a(ComponentName componentName, String str) {
        Intent intent = new Intent("android.app.action.PROVISION_MANAGED_DEVICE_FROM_TRUSTED_SOURCE");
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.app.extra.PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME", componentName);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("android.app.extra.PERSISTENT_DEVICE_OWNER_STATE", str);
        bundle.putParcelable("android.app.extra.PROVISIONING_ADMIN_EXTRAS_BUNDLE", persistableBundle);
        intent.putExtras(bundle);
        startActivityForResult(intent, 2);
    }
}
