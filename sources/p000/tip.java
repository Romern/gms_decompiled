package p000;

import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: tip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tip {

    /* renamed from: a */
    public final bxvd f46141a;

    /* renamed from: b */
    private final List f46142b;

    public tip(int i, int i2, int i3) {
        int a = bxch.m122566a(i);
        a = a == 0 ? 1 : a;
        int a2 = bxcd.m122562a(i3);
        a2 = a2 == 0 ? 1 : a2;
        bxvd da = bxce.f162766k.mo74144da();
        String uuid = UUID.randomUUID().toString();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxce bxce = (bxce) da.f164949b;
        uuid.getClass();
        int i4 = bxce.f162768a | 1;
        bxce.f162768a = i4;
        bxce.f162769b = uuid;
        bxce.f162771d = a - 1;
        bxce.f162768a = i4 | 4;
        bxco b = tiq.m37051b(i2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxce bxce2 = (bxce) da.f164949b;
        bxce2.f162772e = b.f162973bD;
        int i5 = bxce2.f162768a | 8;
        bxce2.f162768a = i5;
        bxce2.f162773f = a2 - 1;
        bxce2.f162768a = i5 | 16;
        long currentTimeMillis = System.currentTimeMillis();
        bxvd da2 = bxcp.f162974g.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxcp bxcp = (bxcp) da2.f164949b;
        int i6 = 1 | bxcp.f162976a;
        bxcp.f162976a = i6;
        bxcp.f162977b = currentTimeMillis;
        int i7 = i6 | 2;
        bxcp.f162976a = i7;
        bxcp.f162978c = currentTimeMillis;
        bxcp.f162976a = i7 | 4;
        bxcp.f162979d = 0;
        bxcp bxcp2 = (bxcp) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxce bxce3 = (bxce) da.f164949b;
        bxcp2.getClass();
        bxce3.f162770c = bxcp2;
        bxce3.f162768a |= 2;
        this.f46141a = da;
        this.f46142b = new ArrayList();
    }

    /* renamed from: a */
    public final ContextData mo26570a() {
        bxvd bxvd = this.f46141a;
        if ((((bxce) bxvd.f164949b).f162768a & 32) == 0) {
            bxeu c = tka.m37120c(System.currentTimeMillis());
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bxce bxce = (bxce) bxvd.f164949b;
            bxce bxce2 = bxce.f162766k;
            c.getClass();
            bxce.f162774g = c;
            bxce.f162768a |= 32;
        }
        if (this.f46142b.size() > 0) {
            bxvd bxvd2 = this.f46141a;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bxce bxce3 = bxce.f162766k;
            ((bxce) bxvd2.f164949b).f162776i = bxvk.m124030de();
            List list = this.f46142b;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bxce bxce4 = (bxce) bxvd2.f164949b;
            if (!bxce4.f162776i.mo73666a()) {
                bxce4.f162776i = bxvk.m124021a(bxce4.f162776i);
            }
            bxsy.m123078a(list, bxce4.f162776i);
        }
        return new ContextData((bxce) this.f46141a.mo74062i());
    }

    /* renamed from: a */
    public final void mo26571a(long j) {
        boolean z;
        bxeu bxeu = ((bxce) this.f46141a.f164949b).f162774g;
        if (bxeu == null) {
            bxeu = bxeu.f163125e;
        }
        bxvd bxvd = (bxvd) bxeu.mo74142c(5);
        bxvd.mo73625a((bxvk) bxeu);
        int a = bxet.m122640a(((bxeu) bxvd.f164949b).f163128b);
        if (a == 0) {
            a = 3;
        }
        if (a == 2) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxeu bxeu2 = (bxeu) bxvd.f164949b;
        bxeu2.f163128b = 3;
        int i = bxeu2.f163127a | 1;
        bxeu2.f163127a = i;
        bxeu2.f163127a = i | 4;
        bxeu2.f163130d = j;
        bxvd bxvd2 = this.f46141a;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bxce bxce = (bxce) bxvd2.f164949b;
        bxeu bxeu3 = (bxeu) bxvd.mo74062i();
        bxce bxce2 = bxce.f162766k;
        bxeu3.getClass();
        bxce.f162774g = bxeu3;
        bxce.f162768a |= 32;
    }

    public tip(ContextData contextData) {
        sdo.m34959a(contextData);
        int a = bxch.m122566a(contextData.mo18017f());
        int a2 = bxcd.m122562a(contextData.mo18021i());
        a2 = a2 == 0 ? 1 : a2;
        a = a == 0 ? 1 : a;
        bxvd da = bxce.f162766k.mo74144da();
        String d = contextData.mo18014d();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxce bxce = (bxce) da.f164949b;
        d.getClass();
        int i = bxce.f162768a | 1;
        bxce.f162768a = i;
        bxce.f162769b = d;
        bxce.f162771d = a - 1;
        bxce.f162768a = i | 4;
        bxco h = contextData.mo18019h();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxce bxce2 = (bxce) da.f164949b;
        bxce2.f162772e = h.f162973bD;
        int i2 = bxce2.f162768a | 8;
        bxce2.f162768a = i2;
        bxce2.f162773f = a2 - 1;
        bxce2.f162768a = i2 | 16;
        int[] iArr = ContextData.f30618a;
        bxcp bxcp = contextData.f30620b.f162770c;
        bxcp = bxcp == null ? bxcp.f162974g : bxcp;
        long currentTimeMillis = System.currentTimeMillis();
        bxvd bxvd = (bxvd) bxcp.mo74142c(5);
        bxvd.mo73625a((bxvk) bxcp);
        int i3 = bxcp.f162979d + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxcp bxcp2 = (bxcp) bxvd.f164949b;
        int i4 = bxcp2.f162976a | 4;
        bxcp2.f162976a = i4;
        bxcp2.f162979d = i3;
        bxcp2.f162976a = i4 | 2;
        bxcp2.f162978c = currentTimeMillis;
        bxcp bxcp3 = (bxcp) bxvd.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxce bxce3 = (bxce) da.f164949b;
        bxcp3.getClass();
        bxce3.f162770c = bxcp3;
        bxce3.f162768a |= 2;
        bxeu bxeu = contextData.f30620b.f162774g;
        bxeu = bxeu == null ? bxeu.f163125e : bxeu;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxce bxce4 = (bxce) da.f164949b;
        bxeu.getClass();
        bxce4.f162774g = bxeu;
        bxce4.f162768a |= 32;
        this.f46141a = da;
        bxce bxce5 = contextData.f30620b;
        sdo.m34959a(da);
        sdo.m34959a(bxce5);
        if ((bxce5.f162768a & 64) != 0) {
            bxcf bxcf = bxce5.f162775h;
            bxcf = bxcf == null ? bxcf.f162779a : bxcf;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxce bxce6 = (bxce) da.f164949b;
            bxcf.getClass();
            bxce6.f162775h = bxcf;
            bxce6.f162768a |= 64;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxce bxce7 = (bxce) da.f164949b;
            bxce7.f162775h = null;
            bxce7.f162768a &= -65;
        }
        this.f46142b = new ArrayList(contextData.f30620b.f162776i);
    }

    /* renamed from: a */
    public final void mo26572a(bxuq bxuq, Object obj) {
        bxvd bxvd = this.f46141a;
        bxvf bxvf = (bxvf) bxcf.f162779a.mo74144da();
        bxvf.mo74125a(bxuq, obj);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxce bxce = (bxce) bxvd.f164949b;
        bxcf bxcf = (bxcf) bxvf.mo74062i();
        bxce bxce2 = bxce.f162766k;
        bxcf.getClass();
        bxce.f162775h = bxcf;
        bxce.f162768a |= 64;
    }

    /* renamed from: a */
    public final void mo26573a(tju tju) {
        sdo.m34959a(tju);
        bxvd bxvd = this.f46141a;
        bxdj bxdj = tju.f46219a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxce bxce = (bxce) bxvd.f164949b;
        bxce bxce2 = bxce.f162766k;
        bxdj.getClass();
        bxce.f162777j = bxdj;
        bxce.f162768a |= 128;
    }

    /* renamed from: a */
    public final void mo26574a(tka tka) {
        sdo.m34959a(tka);
        bxvd bxvd = this.f46141a;
        bxeu bxeu = tka.f46221a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxce bxce = (bxce) bxvd.f164949b;
        bxce bxce2 = bxce.f162766k;
        bxeu.getClass();
        bxce.f162774g = bxeu;
        bxce.f162768a |= 32;
    }
}
