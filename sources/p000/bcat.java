package p000;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* renamed from: bcat */
final /* synthetic */ class bcat implements Callable {

    /* renamed from: a */
    private final bcav f103914a;

    /* renamed from: b */
    private final bcoh f103915b;

    /* renamed from: c */
    private final bcoz f103916c;

    public bcat(bcav bcav, bcoh bcoh, bcoz bcoz) {
        this.f103914a = bcav;
        this.f103915b = bcoh;
        this.f103916c = bcoz;
    }

    public final Object call() {
        long j;
        bcav bcav = this.f103914a;
        bcoh bcoh = this.f103915b;
        bcoz bcoz = this.f103916c;
        Cursor a = bcav.mo56665a(bcoh.mo57058b());
        try {
            if (!a.moveToFirst()) {
                bdae bdae = bcav.f103920a;
                bmxy.m108600b(bdae.mo54680c());
                j = bdae.mo54676a(bcav.mo56666a("registration"), bccg.m88798a(bcoh, bcoz), 0);
                bcav.mo56670a(j, bcoh.mo57058b());
            } else {
                long j2 = (long) a.getInt(bced.m88857a(1));
                bdae bdae2 = bcav.f103920a;
                bmxy.m108600b(bdae2.mo54680c());
                bdae2.mo54674a(bcav.mo56666a("registration"), bccg.m88798a(bcoh, bcoz), "registration_id =? AND tachyon_app_name =?", new String[]{Long.toString(j2), bcoh.mo57061e()});
                bcav.mo56670a(j2, bcoh.mo57058b());
                j = j2;
            }
            if (a != null) {
                a.close();
            }
            return Long.valueOf(j);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
