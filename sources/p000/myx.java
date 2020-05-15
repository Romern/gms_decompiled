package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: myx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class myx {

    /* renamed from: a */
    public static final lvn f34991a = new lvn("FullBackupQuotaBlacklist");

    /* renamed from: b */
    public final sqv f34992b;

    /* renamed from: c */
    public final long f34993c = TimeUnit.HOURS.toMillis(ccnf.f179489a.mo6606a().mo76414H());

    /* renamed from: d */
    public final SharedPreferences f34994d;

    public myx(Context context) {
        srb srb = srb.f45012a;
        bmxy.m108581a(srb);
        this.f34992b = srb;
        this.f34994d = context.getSharedPreferences("Dolly.QuotaBlacklist", 0);
    }
}
