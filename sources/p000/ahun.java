package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: ahun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahun extends buqn {

    /* renamed from: a */
    final /* synthetic */ String f68102a;

    /* renamed from: b */
    final /* synthetic */ ahsu f68103b;

    /* renamed from: c */
    final /* synthetic */ byte[] f68104c;

    /* renamed from: d */
    final /* synthetic */ Context f68105d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahun(String str, String str2, ahsu ahsu, byte[] bArr, Context context) {
        super(str);
        this.f68102a = str2;
        this.f68103b = ahsu;
        this.f68104c = bArr;
        this.f68105d = context;
    }

    public final void run() {
        ahyz ahyz;
        String c = buqx.m120262c(this.f68102a);
        aiaa aiaa = this.f68103b.f67969b;
        if (!TextUtils.isEmpty(c)) {
            bxvd bxvd = (bxvd) aiaa.mo74142c(5);
            bxvd.mo73625a((bxvk) aiaa);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aiaa aiaa2 = (aiaa) bxvd.f164949b;
            aiaa aiaa3 = aiaa.f68501K;
            c.getClass();
            aiaa2.f68513a |= 32;
            aiaa2.f68520h = c;
            aiaa = (aiaa) bxvd.mo74062i();
        }
        if (cfoj.m141549ad()) {
            bxvd da = ahyz.f68425p.mo74144da();
            String str = this.f68102a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ahyz ahyz2 = (ahyz) da.f164949b;
            str.getClass();
            ahyz2.f68427a |= 1;
            ahyz2.f68428b = str;
            bxtx a = bxtx.m123261a(this.f68104c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ahyz ahyz3 = (ahyz) da.f164949b;
            a.getClass();
            ahyz3.f68427a |= 2;
            ahyz3.f68429c = a;
            String G = this.f68103b.mo37060G();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ahyz ahyz4 = (ahyz) da.f164949b;
            G.getClass();
            ahyz4.f68427a |= 512;
            ahyz4.f68437k = G;
            da.mo74022ab(this.f68103b.mo37093r());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ahyz ahyz5 = (ahyz) da.f164949b;
            aiaa.getClass();
            ahyz5.f68439n = aiaa;
            int i = ahyz5.f68427a | 1024;
            ahyz5.f68427a = i;
            ahyz5.f68427a = i | 2048;
            ahyz5.f68440o = true;
            ahyz = (ahyz) da.mo74062i();
        } else {
            bxvd da2 = ahyz.f68425p.mo74144da();
            String str2 = this.f68102a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ahyz ahyz6 = (ahyz) da2.f164949b;
            str2.getClass();
            ahyz6.f68427a = 1 | ahyz6.f68427a;
            ahyz6.f68428b = str2;
            bxtx a2 = bxtx.m123261a(this.f68104c);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ahyz ahyz7 = (ahyz) da2.f164949b;
            a2.getClass();
            ahyz7.f68427a |= 2;
            ahyz7.f68429c = a2;
            String G2 = this.f68103b.mo37060G();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ahyz ahyz8 = (ahyz) da2.f164949b;
            G2.getClass();
            ahyz8.f68427a |= 512;
            ahyz8.f68437k = G2;
            da2.mo74022ab(this.f68103b.mo37093r());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ahyz ahyz9 = (ahyz) da2.f164949b;
            aiaa.getClass();
            ahyz9.f68439n = aiaa;
            ahyz9.f68427a |= 1024;
            ahyz = (ahyz) da2.mo74062i();
        }
        ((ahst) ahgz.m55754a(this.f68105d, ahst.class)).mo37036a(ahyz);
        ((ahvf) ahgz.m55754a(this.f68105d, ahvf.class)).mo37201a("android.bluetooth.device.action.ACL_CONNECTED", ahyz);
    }
}
