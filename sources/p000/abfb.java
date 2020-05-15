package p000;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: abfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfb {

    /* renamed from: a */
    public final String f57327a;

    /* renamed from: b */
    public final Context f57328b;

    /* renamed from: c */
    public final HelpConfig f57329c;

    /* renamed from: d */
    public final bqgj f57330d;

    /* renamed from: e */
    public final aaxx f57331e;

    /* renamed from: f */
    public final abcr f57332f;

    public abfb(String str, Context context, HelpConfig helpConfig, bqgj bqgj, aaxx aaxx, abcr abcr) {
        this.f57327a = str;
        this.f57328b = context;
        this.f57329c = helpConfig;
        this.f57330d = bqgj;
        this.f57331e = aaxx;
        this.f57332f = abcr;
    }

    /* renamed from: a */
    public static void m47606a(String str, bqgj bqgj, Context context, HelpConfig helpConfig, aaxx aaxx, abcr abcr) {
        bqgj.execute(new abfa(new abfb(str, context.getApplicationContext(), helpConfig, bqgj, aaxx, abcr)));
    }
}
