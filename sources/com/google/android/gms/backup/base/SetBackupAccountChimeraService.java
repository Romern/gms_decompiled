package com.google.android.gms.backup.base;

import android.accounts.Account;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.UserHandle;
import android.text.TextUtils;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetBackupAccountChimeraService extends TracingIntentService {

    /* renamed from: a */
    private static final lvn f29010a = new lvn("SetBackupAccountChimeraService");

    /* renamed from: b */
    private mbx f29011b;

    /* renamed from: c */
    private lsp f29012c;

    public SetBackupAccountChimeraService() {
        super("SetBackupAccountChimeraService");
    }

    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        if (f29010a.mo19637a(3)) {
            f29010a.mo25412b("SetBackupAccountChimeraService invoked", new Object[0]);
        }
        Account account = (Account) intent.getParcelableExtra("backupAccount");
        UserHandle userHandle = (UserHandle) intent.getParcelableExtra("backupUserHandle");
        if (account != null && !TextUtils.isEmpty(account.name)) {
            int i2 = Build.VERSION.SDK_INT;
            if (userHandle.isOwner()) {
                if (ccnx.f179588a.mo6606a().mo76505f()) {
                    if (this.f29011b == null) {
                        this.f29011b = new mbx(this);
                    }
                    if (getPackageManager().getNameForUid(Binder.getCallingUid()).equals("com.google.android.backuptransport")) {
                        this.f29011b.mo19842e(2);
                    } else {
                        this.f29011b.mo19842e(1);
                    }
                }
                if (cclc.f179324a.mo6606a().mo76263a()) {
                    f29010a.mo25416d("The SetBackupAccount service is disabled.", new Object[0]);
                    return;
                }
                f29010a.mo25414c("Setting backup account", new Object[0]);
                if (this.f29012c == null) {
                    this.f29012c = new lsp(this);
                }
                this.f29012c.mo19592a(account);
            }
        }
    }
}
