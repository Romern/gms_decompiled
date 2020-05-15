package p000;

import android.content.Context;
import com.google.android.gms.backup.BackUpNowConfig;

/* renamed from: lus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lus extends rjx implements lsi {

    /* renamed from: a */
    public static final /* synthetic */ int f33008a = 0;

    /* renamed from: b */
    private static final rjo f33009b = new rjo("BackUpNow.API", f33011d, f33010c);

    /* renamed from: c */
    private static final rje f33010c = new rje();

    /* renamed from: d */
    private static final rjl f33011d = new lur();

    public lus(Context context) {
        super(context, f33009b, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public final void mo19586a(BackUpNowConfig backUpNowConfig) {
        roz b = rpa.m34196b();
        b.f43472a = new luo(backUpNowConfig);
        mo24732b(b.mo24977a());
    }
}
