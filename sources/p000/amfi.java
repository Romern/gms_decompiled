package p000;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.people.phenotype.RegisterPhenotypeOperation;

/* renamed from: amfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class amfi extends IntentOperation {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract SharedPreferences mo41188a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo41189b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo41190c() {
        return false;
    }

    public final void onDestroy() {
    }

    public final void onHandleIntent(Intent intent) {
        Intent startIntent;
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (mo41189b().equals(stringExtra)) {
            new amfh(anef.m64089a(this), mo41188a(), mo41189b()).mo25219a("");
            Intent intent2 = new Intent("com.google.android.gms.phenotype.COMMITTED");
            intent2.setPackage("com.google.android.gms");
            intent2.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", stringExtra);
            sendBroadcast(intent2);
            if (mo41190c()) {
                amig.m62939a();
                int intValue = Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83268Y()).intValue();
                if (intValue != amih.m62940a(this) && (startIntent = IntentOperation.getStartIntent(this, RegisterPhenotypeOperation.class, "com.google.android.gms.people.phenotype.PHENOTYPE_REGISTER_ACTION")) != null) {
                    startIntent.putExtra("mendel_package_name", "com.google.android.gms.people").putExtra("first_sdk_extra", intValue);
                    startService(startIntent);
                }
            }
        }
    }
}
