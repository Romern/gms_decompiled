package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: zyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zyt extends IntentOperation {

    /* renamed from: a */
    protected Context f56226a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo19210a(zzi zzi);

    public final void onCreate() {
        this.f56226a = getApplicationContext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a5, code lost:
        if (p000.ceai.m135819b() == r8.f56282p) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r8 != false) goto L_0x0030;
     */
    public final void onHandleIntent(Intent intent) {
        boolean z;
        boolean equals = "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction());
        if (!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || !"com.google.android.gms.fonts".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            z = false;
        } else {
            z = true;
        }
        if (!equals) {
            if (!z) {
                return;
            }
        }
        bdxy a = bdxy.m91563a(getBaseContext().getContentResolver(), anef.m64088a("com.google.android.gms.fonts"));
        if (a != null) {
            a.mo58435b();
        }
        zzi zzi = zzi.f56267a;
        if (ceal.m135826d() != zzi.f56278l) {
            if (ceal.m135826d()) {
                zzk.m46754a(zzi, this.f56226a);
                zyh.m46683c("GServicesReceiver", "update scheduler scheduled", new Object[0]);
            } else {
                aeat.m51532a(this.f56226a).mo33986a("FontsUpdateCheck", "com.google.android.gms.fonts.update.UpdateSchedulerService");
                zyh.m46683c("FontsUpdateScheduler", "update cancelled", new Object[0]);
                zyh.m46683c("GServicesReceiver", "update scheduler cancelled", new Object[0]);
            }
        }
        if (ceao.m135838c() == zzi.f56279m) {
            long d = ceao.m135839d();
            if (zzi.f56281o <= 0) {
                zzi.mo31629d();
            }
            if (d == zzi.f56281o) {
            }
        }
        mo19210a(zzi);
        zzi.mo31629d();
    }
}
