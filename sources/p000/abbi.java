package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService;

/* renamed from: abbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class abbi extends deu implements aasf {

    /* renamed from: A */
    protected int f56985A;

    /* renamed from: y */
    public HelpConfig f56986y;

    /* renamed from: z */
    public abcr f56987z;

    /* renamed from: g */
    public final HelpConfig mo18626g() {
        return this.f56986y;
    }

    /* renamed from: h */
    public final abcr mo18627h() {
        return this.f56987z;
    }

    /* renamed from: k */
    public Context mo18630k() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f56986y = HelpConfig.m66349a(this, bundle, getIntent());
        this.f56987z = new abcr(this);
        boolean a = aarq.m46802a(this.f56986y);
        int i = C0126R.style.gh_ActivityStyleWithDarkActionBar;
        if (!a && this.f56986y.f78801A.f31623a == 0) {
            i = C0126R.style.gh_ActivityStyle;
        }
        setTheme(i);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        abcr abcr = this.f56987z;
        if (abcr != null) {
            abcr.close();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f56985A = 24;
        finish();
        return true;
    }

    public void onPause() {
        ReportBatchedMetricsChimeraGcmTaskService.m66601a(this, this.f56986y);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        ReportBatchedMetricsChimeraGcmTaskService.m66602a(this, this.f56986y.f78827b);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("EXTRA_HELP_CONFIG", this.f56986y);
        super.onSaveInstanceState(bundle);
    }
}
