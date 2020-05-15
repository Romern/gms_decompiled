package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.people.phenotype.CommitGmsPhenotypeOperation;
import com.google.android.gms.people.phenotype.CommitUiPhenotypeOperation;
import com.google.android.gms.people.phenotype.RegisterPhenotypeOperation;

/* renamed from: amii */
public final /* synthetic */ class amii implements aubq {

    /* renamed from: a */
    private final RegisterPhenotypeOperation f74936a;

    /* renamed from: b */
    private final Context f74937b;

    /* renamed from: c */
    private final String f74938c;

    /* renamed from: d */
    private final Intent f74939d;

    public amii(RegisterPhenotypeOperation registerPhenotypeOperation, Context context, String str, Intent intent) {
        this.f74936a = registerPhenotypeOperation;
        this.f74937b = context;
        this.f74938c = str;
        this.f74939d = intent;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        Intent intent;
        RegisterPhenotypeOperation registerPhenotypeOperation = this.f74936a;
        Context context = this.f74937b;
        String str = this.f74938c;
        Intent intent2 = this.f74939d;
        if ("com.google.android.gms.people.ui".equalsIgnoreCase(str)) {
            intent = IntentOperation.getStartIntent(context, CommitUiPhenotypeOperation.class, "com.google.android.gms.phenotype.UPDATE");
        } else {
            intent = IntentOperation.getStartIntent(context, CommitGmsPhenotypeOperation.class, "com.google.android.gms.phenotype.UPDATE");
        }
        registerPhenotypeOperation.startService(intent);
        if (aucb.mo50384b() && str.equals("com.google.android.gms.people")) {
            context.getSharedPreferences("ppl_first_sdk", 0).edit().putInt("com.google.android.gms.people.firstSdk", RegisterPhenotypeOperation.m68069a(context, intent2)).commit();
        }
    }
}
