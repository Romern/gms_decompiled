package p000;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import java.util.Iterator;

/* renamed from: aiby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiby extends buqn {

    /* renamed from: a */
    final /* synthetic */ Intent f68646a;

    /* renamed from: b */
    final /* synthetic */ String f68647b;

    /* renamed from: c */
    final /* synthetic */ String f68648c;

    /* renamed from: d */
    final /* synthetic */ boolean f68649d;

    /* renamed from: e */
    final /* synthetic */ aics f68650e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiby(aics aics, String str, Intent intent, String str2, String str3, boolean z) {
        super(str);
        this.f68650e = aics;
        this.f68646a = intent;
        this.f68647b = str2;
        this.f68648c = str3;
        this.f68649d = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahst.a(ahyz, boolean):void
     arg types: [ahyz, int]
     candidates:
      ahst.a(java.lang.String, bmzi):java.lang.Object
      ahst.a(java.lang.String, int):void
      ahst.a(java.lang.String, java.lang.String):void
      ahst.a(java.lang.String, boolean):void
      ahst.a(java.util.List, int):void
      ahst.a(ahyz, boolean):void */
    public final void run() {
        aiaa aiaa;
        byte[] byteArrayExtra = this.f68646a.getByteArrayExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY");
        aics aics = this.f68650e;
        String str = this.f68647b;
        ahsu ahsu = aics.f68722s;
        if (ahsu == null || !str.equals(ahsu.mo37088m())) {
            Iterator it = aics.f68705b.mo37048c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    aiaa = null;
                    break;
                }
                ahsu ahsu2 = (ahsu) it.next();
                if (str.equals(ahsu2.mo37088m())) {
                    aiaa = aics.m56976a(ahsu2);
                    break;
                }
            }
        } else {
            aiaa = aics.m56976a(aics.f68722s);
        }
        if (aiaa != null) {
            bxvd bxvd = (bxvd) aiaa.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) aiaa);
            if (cfoj.m141569s()) {
                if (buqx.m120262c(this.f68648c) != null) {
                    srn srn = ahsd.f67925a;
                    String c = buqx.m120262c(this.f68648c);
                    if (c != null) {
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        aiaa aiaa2 = (aiaa) bxvd.f164949b;
                        c.getClass();
                        aiaa2.f68513a |= 32;
                        aiaa2.f68520h = c;
                    } else {
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        aiaa aiaa3 = (aiaa) bxvd.f164949b;
                        aiaa3.f68513a &= -33;
                        aiaa3.f68520h = aiaa.f68501K.f68520h;
                    }
                } else {
                    String a = ((ahvp) ahgz.m55754a(this.f68650e.f68708e, ahvp.class)).mo37208a();
                    if (a != null) {
                        String string = this.f68650e.f68708e.getString(C0126R.string.fast_pair_device_name, a, ((aiaa) bxvd.f164949b).f68520h);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        aiaa aiaa4 = (aiaa) bxvd.f164949b;
                        string.getClass();
                        aiaa4.f68513a |= 32;
                        aiaa4.f68520h = string;
                    }
                }
            }
            srn srn2 = ahsd.f67925a;
            aiaa aiaa5 = (aiaa) bxvd.f164949b;
            byte[] b = bnzi.m110902d().mo68722a(bqce.m112562a(byteArrayExtra, aynj.m84359a(this.f68648c))).mo68740b();
            burs e = burt.m120312e();
            e.mo73048a((aiaa) bxvd.mo74062i());
            e.mo73049a(ByteString.m123261a(byteArrayExtra));
            e.mo73051b(ByteString.m123261a(b));
            e.mo73050a(this.f68647b);
            burt a2 = e.mo73047a();
            if (cfoj.m141575y() && this.f68649d) {
                buru buru = this.f68650e.f68710g;
                buru.mo73058a(buru.mo73068d(), a2, new aibx(this, byteArrayExtra, aiaa));
            } else {
                buru buru2 = this.f68650e.f68710g;
                buru2.mo73058a(buru2.mo73068d(), a2, (bqfp) null);
            }
            bxvd da = ahyz.f68425p.mo74144da();
            String str2 = this.f68648c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ahyz ahyz = (ahyz) da.f164949b;
            str2.getClass();
            ahyz.f68427a |= 1;
            ahyz.f68428b = str2;
            ByteString a3 = ByteString.m123261a(byteArrayExtra);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ahyz ahyz2 = (ahyz) da.f164949b;
            a3.getClass();
            int i = 2 | ahyz2.f68427a;
            ahyz2.f68427a = i;
            ahyz2.f68429c = a3;
            String str3 = aiaa.f68537y;
            str3.getClass();
            ahyz2.f68427a = i | 512;
            ahyz2.f68437k = str3;
            byzb byzb = aiaa.f68511I;
            if (byzb == null) {
                byzb = byzb.f169045j;
            }
            da.mo74022ab(new bxvv(byzb.f169052f, byzb.f169044g));
            aiaa aiaa6 = (aiaa) bxvd.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ahyz ahyz3 = (ahyz) da.f164949b;
            aiaa6.getClass();
            ahyz3.f68439n = aiaa6;
            ahyz3.f68427a |= 1024;
            ahyz ahyz4 = (ahyz) da.mo74062i();
            this.f68650e.f68705b.mo37036a(ahyz4);
            if (cfoj.f184966a.mo6606a().mo82092aP()) {
                if (!cfoj.m141549ad()) {
                    ((ahvf) ahgz.m55754a(this.f68650e.f68708e, ahvf.class)).mo37201a("android.bluetooth.device.action.ACL_CONNECTED", ahyz4);
                } else if (((ahvf) ahgz.m55754a(this.f68650e.f68708e, ahvf.class)).mo37201a("android.bluetooth.device.action.ACL_CONNECTED", ahyz4)) {
                    this.f68650e.f68705b.mo37037a(ahyz4, true);
                }
            }
        } else {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPair: Could not find matching nearby item for %s.", this.f68647b);
        }
        this.f68650e.f68722s = null;
    }
}
