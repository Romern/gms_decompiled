package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;
import java.security.NoSuchAlgorithmException;

/* renamed from: lwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lwc {

    /* renamed from: a */
    public static final lvn f33098a = new lvn("CryptoSettings");

    /* renamed from: b */
    public static final bnic f33099b = bnic.m109492a("isInitialized", "activeSecondary", "nextSecondary", "secondaryKeyLastRotatedAt");

    /* renamed from: c */
    public final rtj f33100c;

    /* renamed from: d */
    private final Context f33101d;

    /* renamed from: e */
    private RecoveryController f33102e;

    private lwc(rtj rtj, Context context) {
        sdo.m34959a(rtj);
        this.f33100c = rtj;
        sdo.m34959a(context);
        this.f33101d = context;
    }

    /* renamed from: a */
    public static lwc m24524a(Context context) {
        return new lwc(new rtj(context, "crypto_settings", true), context);
    }

    /* renamed from: c */
    private final bmxv m24525c(String str) {
        return bmxv.m108567c(this.f33100c.getString(str, null));
    }

    /* renamed from: e */
    private final synchronized RecoveryController m24527e() {
        if (this.f33102e == null) {
            this.f33102e = RecoveryController.getInstance(this.f33101d);
        }
        return this.f33102e;
    }

    /* renamed from: b */
    public final bmxv mo19695b() {
        return m24525c("nextSecondary");
    }

    /* renamed from: d */
    public final void mo19699d() {
        SharedPreferences.Editor edit = this.f33100c.edit();
        edit.remove("nextSecondary");
        edit.apply();
    }

    /* renamed from: c */
    private static String m24526c(Account account) {
        if (account == null) {
            return "";
        }
        String str = account.name;
        String str2 = account.type;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("::");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo19696b(Account account) {
        SharedPreferences.Editor edit = this.f33100c.edit();
        if (account == null) {
            try {
                edit.remove("lastUsedBackupAccount");
            } catch (NoSuchAlgorithmException e) {
                f33098a.mo25415d("Unable to create hash", e, new Object[0]);
                return;
            }
        } else {
            edit.putString("lastUsedBackupAccount", m24526c(account));
        }
        edit.apply();
    }

    /* renamed from: a */
    public final bmxv mo19691a() {
        return m24525c("activeSecondary");
    }

    /* renamed from: c */
    public final boolean mo19698c() {
        return this.f33100c.getBoolean("isInitialized", false);
    }

    /* renamed from: a */
    public final void mo19692a(long j) {
        SharedPreferences.Editor edit = this.f33100c.edit();
        edit.putLong("secondaryKeyLastRotatedAt", j);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo19693a(String str) {
        mo19697b(str);
        SharedPreferences.Editor edit = this.f33100c.edit();
        edit.putString("activeSecondary", str);
        edit.apply();
    }

    /* renamed from: a */
    public final boolean mo19694a(Account account) {
        sdo.m34959a(account);
        String string = this.f33100c.getString("lastUsedBackupAccount", null);
        if (string != null) {
            try {
                return string.equals(m24526c(account));
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo19697b(String str) {
        try {
            if (!m24527e().getAliases().contains(str)) {
                throw new lwg(String.valueOf(str).concat(" is not in RecoveryController"));
            }
        } catch (InternalRecoveryServiceException e) {
            throw new lwg((Throwable) e);
        }
    }
}
