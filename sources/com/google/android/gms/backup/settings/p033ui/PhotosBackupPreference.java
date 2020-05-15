package com.google.android.gms.backup.settings.p033ui;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.photos.backup.api.AutoBackupState;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.backup.settings.ui.PhotosBackupPreference */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhotosBackupPreference extends BackupPreference {

    /* renamed from: a */
    public static final lvn f29184a = new lvn("PhotosBackupPreference");

    /* renamed from: F */
    private boolean f29185F;

    /* renamed from: b */
    public final mxk f29186b;

    /* renamed from: c */
    public final Handler f29187c;

    /* renamed from: d */
    public final bmzi f29188d;

    /* renamed from: e */
    public String f29189e;

    /* renamed from: f */
    public String f29190f;

    /* renamed from: g */
    public boolean f29191g;

    /* renamed from: h */
    public String f29192h;

    /* renamed from: i */
    public final lvr f29193i;

    /* renamed from: j */
    public final beba f29194j;

    public PhotosBackupPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new mxk(context));
    }

    /* renamed from: a */
    public final String mo17271a(String str, String str2) {
        String str3;
        AutoBackupState a = this.f29186b.mo20293a();
        if (a != null) {
            str3 = a.f111401a;
        } else {
            str3 = null;
        }
        if (str2 != null && !str2.equals(str)) {
            f29184a.mo25412b("Drive backup account was changed from [%s] to [%s]", str, str2);
            if (str3 == null && str == null) {
                f29184a.mo25412b("Backup is being enabled; auto-changing the account for photo backup", new Object[0]);
                this.f29186b.mo20295a(str2);
                return str2;
            } else if (str != null && !sdg.m34949a(str3, str2)) {
                f29184a.mo25412b("Photos backup account [%s] is different; asking for confirmation", str3);
                this.f29187c.post(new mxm(this, str2));
                return str3;
            }
        }
        return str3;
    }

    /* renamed from: g */
    public final boolean mo17256g() {
        if (ccoa.m130956b() || ((Boolean) this.f29188d.mo6606a()).booleanValue()) {
            return true;
        }
        return myg.m25745b(this.f1595k);
    }

    /* renamed from: v */
    public final boolean mo17274v() {
        return myg.m25745b(this.f1595k);
    }

    /* renamed from: w */
    public final void mo17275w() {
        String str = this.f29190f;
        if (str == null) {
            mo17255a(ccod.m130983d() ? mvp.f34816c : mvp.f34815b);
        } else if (str.equals(this.f29189e)) {
            mo1966a((CharSequence) this.f29192h);
        } else {
            String str2 = this.f29192h;
            String str3 = this.f29190f;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
            sb.append(str2);
            sb.append("\n");
            sb.append(str3);
            mo1966a((CharSequence) sb.toString());
        }
    }

    public PhotosBackupPreference(Context context, AttributeSet attributeSet, mxk mxk) {
        super(context, attributeSet);
        this.f29194j = new beba(this);
        this.f29188d = bmzn.m108681a(mxl.f34892a);
        this.f29185F = true;
        this.f29189e = null;
        this.f29190f = null;
        this.f29191g = false;
        this.f29193i = lvr.f33060a;
        this.f29186b = mxk;
        mo1981a(false);
        this.f29187c = new adzt(context.getMainLooper());
        this.f29192h = mvp.f34817d.mo20275a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo2015s() {
        super.mo2014r();
        if (this.f29191g) {
            new soa(10, new mxq(this)).start();
        }
    }

    /* renamed from: a */
    public final List mo17254a(Account account) {
        String str;
        String str2;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        if (!this.f29185F) {
            str2 = this.f29189e;
        } else {
            str2 = str;
        }
        this.f29185F = false;
        return Arrays.asList(new mxu(this, str2, str), new mxv(this), new mxw(this));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo17272a(PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            Toast.makeText(this.f1595k, (int) C0126R.string.backup_launch_photos_settings_error, 0).show();
            f29184a.mo25411b("Failed to send intent", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo17273a(String str) {
        mba.m24785a(this.f1595k).setMessage(this.f1595k.getString(C0126R.string.drive_backup_content_photos_dialog_message, str)).setTitle((int) C0126R.string.drive_backup_content_photos_dialog_title).setPositiveButton((int) C0126R.string.drive_backup_content_photos_dialog_yes, new mxo(this, str)).setNegativeButton((int) C0126R.string.common_dismiss, (DialogInterface.OnClickListener) null).show();
    }
}
