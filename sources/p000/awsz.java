package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: awsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsz implements awpj {

    /* renamed from: c */
    private static final long f95074c = TimeUnit.DAYS.toMillis(1);

    /* renamed from: a */
    public final SharedPreferences f95075a;

    /* renamed from: b */
    public final long f95076b;

    /* renamed from: d */
    private final Context f95077d;

    public awsz(Context context) {
        long j = f95074c;
        this.f95077d = context;
        this.f95075a = context.getSharedPreferences("com.google.android.gms.wallet.service.ib.TransactionContextStorage", 0);
        this.f95076b = j;
    }

    /* renamed from: a */
    public final byak mo52546a(String str) {
        String string = this.f95075a.getString(str, null);
        if (string != null) {
            bjvz a = bjwb.m104763a(string);
            if (a.mo65575a(0) >= System.currentTimeMillis()) {
                return (byak) a.mo65576a((bxxk) byak.f165269i.mo74142c(7), (bxxc) null);
            }
            SharedPreferences.Editor edit = this.f95075a.edit();
            edit.remove(str);
            edit.apply();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo52088a() {
        new awpd(this.f95077d, this.f95075a, 16).execute(new Void[0]);
    }
}
