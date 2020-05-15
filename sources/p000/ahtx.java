package p000;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: ahtx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahtx extends buqn {

    /* renamed from: a */
    final /* synthetic */ Context f68037a;

    /* renamed from: b */
    final /* synthetic */ ahyz f68038b;

    /* renamed from: c */
    final /* synthetic */ String f68039c;

    /* renamed from: d */
    final /* synthetic */ bvkn f68040d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahtx(String str, Context context, ahyz ahyz, String str2, bvkn bvkn) {
        super(str);
        this.f68037a = context;
        this.f68038b = ahyz;
        this.f68039c = str2;
        this.f68040d = bvkn;
    }

    public final void run() {
        ahst ahst = (ahst) ahgz.m55754a(this.f68037a, ahst.class);
        String str = this.f68038b.f68428b;
        String str2 = this.f68039c;
        ahyz a = ahst.mo37033a(str);
        if (a != null) {
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            long a2 = ((sqv) ahgz.m55754a(ahst.f67963e, sqv.class)).mo20505a();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ahyz ahyz = (ahyz) bxvd.f164949b;
            int i = ahyz.f68427a | 64;
            ahyz.f68427a = i;
            ahyz.f68434h = a2;
            str2.getClass();
            int i2 = i | 32;
            ahyz.f68427a = i2;
            ahyz.f68433g = str2;
            ahyz.f68427a = i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ahyz.f68436j = true;
            ahst.mo37036a((ahyz) bxvd.mo74062i());
        }
        ((ahst) ahgz.m55754a(this.f68037a, ahst.class)).mo37041a(this.f68038b.f68428b, this.f68040d.f156447b);
    }
}
