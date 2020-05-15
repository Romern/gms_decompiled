package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Configurations;

/* renamed from: aeyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeyb extends anfa {

    /* renamed from: d */
    private final Context f63997d;

    public aeyb(Context context) {
        super(anef.m64089a(context), "com.google.android.gms.lockbox");
        this.f63997d = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25082a(Configurations configurations) {
        SharedPreferences sharedPreferences = this.f63997d.getSharedPreferences("com.google.android.gms.lockbox", 0);
        if (!configurations.f82079f) {
            sharedPreferences.edit().clear().commit();
        }
        anfa.m64130a(sharedPreferences, configurations.f82077d);
    }
}
