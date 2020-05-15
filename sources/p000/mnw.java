package p000;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.p032g1.restore.VerifyAutoRestoreIntentOperation;
import com.google.android.gms.backup.p032g1.restore.mms.StartMmsRestoreIntentOperation;
import com.google.android.gms.backup.p032g1.restore.photos.StartPhotosRestoreIntentOperation;

/* renamed from: mnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mnw implements bqfp {

    /* renamed from: a */
    final /* synthetic */ VerifyAutoRestoreIntentOperation f34066a;

    public mnw(VerifyAutoRestoreIntentOperation verifyAutoRestoreIntentOperation) {
        this.f34066a = verifyAutoRestoreIntentOperation;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Intent startIntent;
        Boolean bool = (Boolean) obj;
        if (!ccls.f179387a.mo6606a().mo76355q() || bool.booleanValue()) {
            lvt lvt = lvt.f33072a;
            int a = lvt.mo19668a(this.f34066a);
            int d = lvt.mo19675d(this.f34066a);
            if (a == 2 && d == 2) {
                VerifyAutoRestoreIntentOperation.f29049a.mo25409a("User opted out of G1 restores.", new Object[0]);
            } else if (a == 0) {
            } else {
                if (!ccls.m130525d() || d != 0) {
                    if (a == 1) {
                        int i = Build.VERSION.SDK_INT;
                        Intent startIntent2 = IntentOperation.getStartIntent(this.f34066a, StartMmsRestoreIntentOperation.class, "com.google.android.gms.backup.g1.START_MMS_RESTORE");
                        if (startIntent2 != null) {
                            this.f34066a.startService(startIntent2);
                        }
                    }
                    if (ccls.m130525d() && d == 1 && (startIntent = IntentOperation.getStartIntent(this.f34066a, StartPhotosRestoreIntentOperation.class, "com.google.android.gms.backup.g1.START_PHOTOS_RESTORE")) != null) {
                        this.f34066a.startService(startIntent);
                    }
                }
            }
        } else {
            VerifyAutoRestoreIntentOperation.f29049a.mo25409a("Not G1 user", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
    }
}
