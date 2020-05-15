package com.google.android.gms.backup.settings.p033ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.backup.settings.ui.BackupNowPreference */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupNowPreference extends Preference {

    /* renamed from: a */
    private static final lvn f29108a = new lvn("BackupNowPreference");

    /* renamed from: b */
    private Button f29109b;

    /* renamed from: c */
    private boolean f29110c;

    /* renamed from: d */
    private boolean f29111d;

    /* renamed from: e */
    private final mvd f29112e;

    public BackupNowPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new mvd(context));
    }

    /* renamed from: g */
    private final void m21946g() {
        boolean z;
        if (this.f29109b != null) {
            boolean z2 = false;
            f29108a.mo25412b("Updating UI Button state.", new Object[0]);
            if (myh.m25748a()) {
                f29108a.mo25412b("isBackupInProgress [%b]", Boolean.valueOf(this.f29110c));
            } else {
                f29108a.mo25412b("isBackupInProgress [%b]. isUnlockRequired [%b]", Boolean.valueOf(this.f29110c), Boolean.valueOf(this.f29111d));
            }
            if (myh.m25748a() || !this.f29111d) {
                z = false;
            } else {
                z = true;
            }
            mvd mvd = this.f29112e;
            boolean z3 = this.f29110c;
            bxvd da = mqu.f34353d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mqu mqu = (mqu) da.f164949b;
            int i = mqu.f34355a | 1;
            mqu.f34355a = i;
            mqu.f34356b = z3;
            mqu.f34355a = 2 | i;
            mqu.f34357c = z;
            mqu mqu2 = (mqu) da.mo74062i();
            bxvd da2 = mqy.f34367f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            mqy mqy = (mqy) da2.f164949b;
            mqu2.getClass();
            mqy.f34373e = mqu2;
            int i2 = mqy.f34369a | 64;
            mqy.f34369a = i2;
            mqy.f34372d = 10;
            mqy.f34369a = i2 | 4;
            mvd.mo20268a((mqy) da2.mo74062i());
            Button button = this.f29109b;
            if (!this.f29110c && !z) {
                z2 = true;
            }
            button.setEnabled(z2);
        }
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        f29108a.mo25409a("onBindViewHolder", new Object[0]);
        super.mo1956a(aoq);
        Button button = (Button) aoq.mo2241c(C0126R.C0129id.backup_now_button);
        this.f29109b = button;
        button.setOnClickListener(new mvm(this));
        m21946g();
    }

    /* renamed from: i */
    public final void mo17252i(boolean z) {
        this.f29110c = z;
        m21946g();
    }

    /* renamed from: j */
    public final void mo17253j(boolean z) {
        this.f29111d = z;
        m21946g();
    }

    public BackupNowPreference(Context context, AttributeSet attributeSet, mvd mvd) {
        super(context, attributeSet);
        this.f1571A = C0126R.C0128layout.backup_now_button;
        this.f1607w = false;
        mo1987b(false);
        this.f29112e = mvd;
    }
}
