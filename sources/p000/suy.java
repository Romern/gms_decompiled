package p000;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.widget.phone.SwitchBar;

/* renamed from: suy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class suy extends deu implements sux {

    /* renamed from: b */
    private SwitchBar f45206b;

    /* renamed from: a */
    public final void mo15271a(boolean z) {
        mo26142e(z);
    }

    /* renamed from: b */
    public final void mo26139b(boolean z) {
        this.f45206b.setVisibility(!z ? 8 : 0);
    }

    /* renamed from: c */
    public final void mo26140c(boolean z) {
        this.f45206b.mo17943a(z);
    }

    /* renamed from: d */
    public final void mo26141d(boolean z) {
        this.f45206b.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo26142e(boolean z);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1341rz aW = mo8628aW();
        if (aW != null) {
            aW.mo15853b(true);
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        SwitchBar switchBar = (SwitchBar) findViewById(C0126R.C0129id.switch_bar);
        this.f45206b = switchBar;
        if (switchBar != null) {
            switchBar.setVisibility(0);
            this.f45206b.f30418a = this;
            PackageManager packageManager = getPackageManager();
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(getComponentName(), 0);
                SwitchBar switchBar2 = this.f45206b;
                CharSequence loadLabel = activityInfo.loadLabel(packageManager);
                switchBar2.f30419b = loadLabel;
                switchBar2.setContentDescription(loadLabel);
            } catch (PackageManager.NameNotFoundException e) {
                bqye.m113758a(e);
            }
        } else {
            throw new IllegalStateException("SwitchBar missing from layout");
        }
    }
}
