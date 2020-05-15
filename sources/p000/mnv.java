package p000;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.p032g1.restore.G1RestoreApiChimeraService;
import com.google.android.gms.backup.p032g1.restore.G1RestoreApiStub$1;
import com.google.android.gms.backup.p032g1.restore.VerifyAutoRestoreIntentOperation;
import com.google.android.gms.backup.p032g1.restore.mms.StartMmsRestoreIntentOperation;
import com.google.android.gms.backup.p032g1.restore.photos.StartPhotosRestoreIntentOperation;

/* renamed from: mnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mnv extends mol implements aaai {

    /* renamed from: a */
    public static final lvn f34062a = new lvn("G1RestoreApi");

    /* renamed from: b */
    private final lvt f34063b = lvt.f33072a;

    /* renamed from: c */
    private final G1RestoreApiChimeraService f34064c;

    /* renamed from: d */
    private final aaag f34065d;

    public mnv(G1RestoreApiChimeraService g1RestoreApiChimeraService, aaag aaag) {
        this.f34064c = g1RestoreApiChimeraService;
        this.f34065d = aaag;
    }

    /* renamed from: a */
    public final void mo20203a(String str) {
        Settings.Secure.putString(this.f34064c.getApplicationContext().getContentResolver(), "restore_ancestor_id", str);
    }

    /* renamed from: a */
    public final boolean mo20208a() {
        return true;
    }

    /* renamed from: b */
    public final void mo20209b(boolean z, String str) {
        this.f34063b.mo19676d(this.f34064c.getApplicationContext(), z);
        if (!ccls.m130542u()) {
            Context applicationContext = this.f34064c.getApplicationContext();
            if (!z) {
                str = null;
            }
            Settings.Secure.putString(applicationContext.getContentResolver(), "photos_restore_account_name", str);
        }
    }

    /* renamed from: a */
    public final void mo20204a(mot mot, String str) {
        this.f34065d.mo16658a(new mnx(mot, str));
    }

    /* renamed from: a */
    public final void mo20205a(boolean z, String str) {
        this.f34063b.mo19670a(this.f34064c.getApplicationContext(), z);
        if (!ccls.m130542u()) {
            Context applicationContext = this.f34064c.getApplicationContext();
            if (!z) {
                str = null;
            }
            Settings.Secure.putString(applicationContext.getContentResolver(), "mms_restore_account_name", str);
        }
    }

    /* renamed from: b */
    public final void mo20210b(boolean z, boolean z2) {
        if (z) {
            this.f34063b.mo19677e(this.f34064c, false);
            this.f34063b.mo19680f(this.f34064c, false);
        }
        if (z2) {
            Settings.Secure.putInt(this.f34064c.getContentResolver(), "photos_restore_enabled", 0);
            Intent startIntent = IntentOperation.getStartIntent(this.f34064c, VerifyAutoRestoreIntentOperation.class, "com.google.android.gms.backup.g1.VERIFY_AUTO_RESTORE");
            if (startIntent != null) {
                this.f34064c.startService(startIntent);
                return;
            }
            return;
        }
        this.f34063b.mo19676d(this.f34064c, true);
        Intent startIntent2 = IntentOperation.getStartIntent(this.f34064c, StartPhotosRestoreIntentOperation.class, "com.google.android.gms.backup.g1.START_PHOTOS_RESTORE");
        if (startIntent2 != null) {
            this.f34064c.startService(startIntent2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lvt.a(android.content.Context, boolean):void
     arg types: [com.google.android.gms.backup.g1.restore.G1RestoreApiChimeraService, int]
     candidates:
      lvt.a(android.content.Context, long):void
      lvt.a(android.content.Context, boolean):void */
    /* renamed from: a */
    public final void mo20206a(boolean z, mou mou) {
        G1RestoreApiStub$1 g1RestoreApiStub$1 = new G1RestoreApiStub$1(new snr(new sns(10)), mou);
        if (z) {
            this.f34063b.mo19671b(this.f34064c, false);
            this.f34063b.mo19673c(this.f34064c, false);
        }
        this.f34063b.mo19670a((Context) this.f34064c, true);
        Intent startIntent = IntentOperation.getStartIntent(this.f34064c, StartMmsRestoreIntentOperation.class, "com.google.android.gms.backup.g1.START_MMS_RESTORE");
        if (startIntent != null) {
            startIntent.putExtra("resultReceiver", g1RestoreApiStub$1);
            this.f34064c.startService(startIntent);
        }
    }

    /* renamed from: b */
    public final boolean mo20211b() {
        return ccls.f179387a.mo6606a().mo76358t();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lvt.a(android.content.Context, boolean):void
     arg types: [com.google.android.gms.backup.g1.restore.G1RestoreApiChimeraService, int]
     candidates:
      lvt.a(android.content.Context, long):void
      lvt.a(android.content.Context, boolean):void */
    /* renamed from: a */
    public final void mo20207a(boolean z, boolean z2) {
        if (z) {
            this.f34063b.mo19671b(this.f34064c, false);
            this.f34063b.mo19673c(this.f34064c, false);
        }
        if (z2) {
            Settings.Secure.putInt(this.f34064c.getContentResolver(), "mms_restore_enabled", 0);
            Intent startIntent = IntentOperation.getStartIntent(this.f34064c, VerifyAutoRestoreIntentOperation.class, "com.google.android.gms.backup.g1.VERIFY_AUTO_RESTORE");
            if (startIntent != null) {
                this.f34064c.startService(startIntent);
                return;
            }
            return;
        }
        this.f34063b.mo19670a((Context) this.f34064c, true);
        Intent startIntent2 = IntentOperation.getStartIntent(this.f34064c, StartMmsRestoreIntentOperation.class, "com.google.android.gms.backup.g1.START_MMS_RESTORE");
        if (startIntent2 != null) {
            this.f34064c.startService(startIntent2);
        }
    }
}
