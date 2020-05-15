package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Configurations;

/* renamed from: ashb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ashb extends anfa {

    /* renamed from: d */
    private final Context f88961d;

    public ashb(Context context) {
        super(anef.m64089a(rpr.m34216b()), "com.google.android.metrics");
        this.f88961d = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25082a(Configurations configurations) {
        SharedPreferences sharedPreferences = this.f88961d.getSharedPreferences("com.google.android.metrics", 0);
        if (!configurations.f82079f) {
            sharedPreferences.edit().clear().commit();
        }
        anfa.m64130a(sharedPreferences, configurations.f82077d);
    }
}
