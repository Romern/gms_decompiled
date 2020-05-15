package com.google.android.gms.backup.settings.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupOptInChimeraActivity extends Activity {

    /* renamed from: a */
    public static bmzi f29065a = bmzn.m108681a(muj.f34773a);

    /* renamed from: b */
    public static bmzi f29066b = bmzn.m108681a(muk.f34774a);

    /* renamed from: c */
    public boolean f29067c;

    /* renamed from: d */
    private BroadcastReceiver f29068d;

    static {
        new lvn("BackupOptInChimeraActivity");
    }

    public BackupOptInChimeraActivity() {
        lvr lvr = lvr.f33060a;
    }

    /* renamed from: a */
    public static bsqh m21915a(List list, Integer num) {
        bxvd da = bsqh.f146634g.mo74144da();
        if (list != null) {
            bsqp bsqp = (bsqp) bsqq.f146675b.mo74144da();
            bsqp.mo70704a(list);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsqh bsqh = (bsqh) da.f164949b;
            bsqq bsqq = (bsqq) bsqp.mo74062i();
            bsqq.getClass();
            bsqh.f146639d = bsqq;
            bsqh.f146636a |= 4;
        }
        bsqp bsqp2 = (bsqp) bsqq.f146675b.mo74144da();
        bsqp2.mo70703a(num.intValue());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqh bsqh2 = (bsqh) da.f164949b;
        bsqq bsqq2 = (bsqq) bsqp2.mo74062i();
        bsqq2.getClass();
        bsqh2.f146641f = bsqq2;
        bsqh2.f146636a |= 16;
        return (bsqh) da.mo74062i();
    }

    public final void onBackPressed() {
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        bjbb bjbb = new bjbb(bjbc.m103136a());
        bjbb.f122457a = 2132018260;
        bjbb.f122458b = false;
        setTheme(bjbb.mo64964a().mo64965a(getIntent()));
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.activity_target_opt_in);
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("deferredSetup", false)) {
            int i = Build.VERSION.SDK_INT;
        }
        setResult(1);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        aki.m919a(this).mo872a(this.f29068d);
        this.f29068d = null;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f29068d = new aacn("backup") {
            /* class com.google.android.gms.backup.settings.component.BackupOptInChimeraActivity.C15591 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                Bundle extras = intent.getExtras();
                if (extras != null && "backup_opt_in_learn_more".equals(extras.getString("id"))) {
                    BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                    mum mum = new mum();
                    mum.f34776a = backupOptInChimeraActivity;
                    mum.show(BackupOptInChimeraActivity.this.getSupportFragmentManager(), "dialog");
                }
            }
        };
        aki.m919a(this).mo873a(this.f29068d, new IntentFilter("com.google.android.setupwizard.LINK_SPAN_CLICKED"));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("confirm-disable-back-dialog-shown", false);
        bundle.putBoolean("learn-more-dialog-shown", this.f29067c);
        super.onSaveInstanceState(bundle);
    }
}
