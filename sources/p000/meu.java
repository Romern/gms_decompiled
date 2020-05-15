package p000;

import android.content.Context;
import android.provider.Settings;

/* renamed from: meu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class meu {

    /* renamed from: a */
    public static final Object f33545a = new Object();

    /* renamed from: b */
    public final Context f33546b;

    /* renamed from: c */
    public final lvp f33547c;

    /* renamed from: d */
    public final lvr f33548d = lvr.f33060a;

    public meu(Context context) {
        this.f33546b = context;
        this.f33547c = new lvp(this.f33546b);
    }

    /* renamed from: a */
    public final void mo19898a() {
        synchronized (f33545a) {
            int i = Settings.Secure.getInt(this.f33546b.getContentResolver(), "migrate_backup_enabled", -1);
            lvr.m24472a("migrate_backup_enabled", i, lvr.f33062c);
            if (i != -1) {
                lvp lvp = this.f33547c;
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                lvp.mo19642a(z);
                this.f33548d.mo19653b(this.f33546b, -1);
            }
        }
    }

    /* renamed from: b */
    public final void mo19899b() {
        synchronized (f33545a) {
            int i = Settings.Secure.getInt(this.f33546b.getContentResolver(), "migrate_full_data_aware_original", -1);
            lvr.m24472a("migrate_full_data_aware_original", i, lvr.f33061b);
            if (i != -1) {
                lvr lvr = this.f33548d;
                Context context = this.f33546b;
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                lvr.mo19654b(context, z);
                this.f33548d.mo19649a(this.f33546b, -1);
            }
        }
    }
}
