package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: hjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hjg {

    /* renamed from: a */
    public static final adcb f19886a = adca.m50150a(hjf.f19885a);

    /* renamed from: b */
    private final SharedPreferences f19887b;

    public hjg(Context context) {
        this.f19887b = context.getSharedPreferences("com.google.android.gms.auth.api.credentials.save_confirmation_dialog_manager", 0);
    }

    /* renamed from: a */
    public final synchronized void mo12576a(String str) {
        this.f19887b.edit().putLong(str, System.currentTimeMillis()).commit();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        return true;
     */
    /* renamed from: b */
    public final synchronized boolean mo12577b(String str) {
        if (this.f19887b.contains(str)) {
            if (this.f19887b.getLong(str, System.currentTimeMillis()) + ccdd.f178778a.mo6606a().mo75789b() >= System.currentTimeMillis()) {
                return false;
            }
            this.f19887b.edit().remove(str).commit();
        }
    }
}
