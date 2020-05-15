package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.webrtc.PeerConnection;

/* renamed from: aitb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aitb implements aith {

    /* renamed from: a */
    private final aitc f69670a;

    /* renamed from: b */
    private final aiss f69671b;

    /* renamed from: c */
    private final String f69672c;

    /* renamed from: d */
    private aitl f69673d;

    public aitb(aitc aitc, aiss aiss, String str) {
        this.f69670a = aitc;
        this.f69671b = aiss;
        this.f69672c = str;
    }

    /* renamed from: a */
    private static cbmo m57883a(aiss aiss) {
        bxvd da = cbmo.f177654h.mo74144da();
        String uuid = UUID.randomUUID().toString();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo cbmo = (cbmo) da.f164949b;
        uuid.getClass();
        cbmo.f177656a = uuid;
        "Nearby".getClass();
        cbmo.f177658c = "Nearby";
        cbma b = m57884b(aiss);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((cbmo) da.f164949b).f177662g = b;
        bxvd da2 = cbly.f177579g.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbly) da2.f164949b).f177586f = 1;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cbly cbly = (cbly) da2.f164949b;
        cbly.f177581a = 1;
        cbly.f177582b = 24;
        cbly.f177583c = 0;
        cbly.f177584d = 4;
        cbly cbly2 = (cbly) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbly2.getClass();
        ((cbmo) da.f164949b).f177660e = cbly2;
        return (cbmo) da.mo74062i();
    }

    /* renamed from: b */
    private static cbma m57884b(aiss aiss) {
        bxvd da = cbma.f177591f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbma cbma = (cbma) da.f164949b;
        "Nearby".getClass();
        cbma.f177595c = "Nearby";
        cbma.f177593a = cipg.m150690a(29);
        String str = aiss.f69653a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((cbma) da.f164949b).f177594b = str;
        bxvd da2 = cbmd.f177603c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbmd) da2.f164949b).f177606b = ciph.m150692a(4);
        String country = bute.m120428b().getCountry();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        country.getClass();
        ((cbmd) da2.f164949b).f177605a = country;
        cbmd cbmd = (cbmd) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmd.getClass();
        ((cbma) da.f164949b).f177597e = cbmd;
        return (cbma) da.mo74062i();
    }

    /* renamed from: d */
    private final synchronized void m57885d() {
        if (!m57886e()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aitb", "d", 174, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Skipping stop receiving messages. We are not currently receiving messages from tachyon.");
            return;
        }
        this.f69673d.mo37998a();
        this.f69673d = null;
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aitb", "d", 181, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Stopped receiving messages from tachyon.");
    }

    /* renamed from: e */
    private final boolean m57886e() {
        return this.f69673d != null;
    }

    /* renamed from: a */
    public final synchronized boolean mo37985a() {
        return true;
    }

    /* renamed from: c */
    public final synchronized List mo37991c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        try {
            aitc aitc = this.f69670a;
            aitj aitj = aitc.f69678e;
            ClientContext clientContext = aitc.f69674a;
            aiss aiss = this.f69671b;
            bxvd da = cbkd.f177393c.mo74144da();
            cbmo a = m57883a(aiss);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbkd cbkd = (cbkd) da.f164949b;
            a.getClass();
            cbkd.f177395a = a;
            "skylift_prod".getClass();
            cbkd.f177396b = "skylift_prod";
            cbcd cbcd = aitj.mo37997a(clientContext, (cbkd) da.mo74062i()).f177399a;
            if (cbcd == null) {
                cbcd = cbcd.f176642b;
            }
            for (cbce cbce : cbcd.f176644a) {
                String str = cbce.f176648b;
                String str2 = cbce.f176649c;
                for (String str3 : cbce.f176647a) {
                    ciuk a2 = PeerConnection.IceServer.m151192a(str3);
                    a2.f191487a = str;
                    a2.f191488b = str2;
                    arrayList.add(a2.mo86580a());
                }
            }
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aitb", "c", 203, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Got %d ice servers from tachyon.", arrayList.size());
        } catch (chuw | gid e) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("aitb", "c", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to get ice servers from tachyon.");
        }
        return arrayList;
    }

    /* renamed from: b */
    public final synchronized boolean mo37990b() {
        if (m57886e()) {
            m57885d();
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized boolean mo37986a(ailt ailt) {
        synchronized (this) {
            if (m57886e()) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aitb", "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Skipping receive messages. We are already receiving messages from tachyon.");
                return false;
            }
            this.f69673d = this.f69670a.f69677d;
            bqgy c = bqgy.m112818c();
            try {
                aitl aitl = this.f69673d;
                ClientContext clientContext = this.f69670a.f69674a;
                aiss aiss = this.f69671b;
                String str = this.f69672c;
                bxvd da = cbkq.f177436c.mo74144da();
                cbmo a = m57883a(aiss);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbkq cbkq = (cbkq) da.f164949b;
                a.getClass();
                cbkq.f177438a = a;
                str.getClass();
                cbkq.f177439b = str;
                cbkq cbkq2 = (cbkq) da.mo74062i();
                aita aita = new aita(c, ailt);
                if (aitl.f69705d == null) {
                    aitl.f69705d = chtv.m149566a(chtu.SERVER_STREAMING, "google.internal.communications.instantmessaging.v1.Messaging/ReceiveMessagesExpress", ciie.m150370a(cbkq.f177436c), ciie.m150370a(cbkx.f177453c));
                }
                aitl.f69706a.mo25555a(aitl.f69705d, clientContext, cbkq2, aita, (long) aitl.f69703b, TimeUnit.MILLISECONDS);
                if (!ahhf.m55777b("TachyonExpressSignalingMessenger.readyToReceiveMessages", c, cfnv.m140757S())) {
                    return false;
                }
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aitb", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Receiving messages from tachyon.");
                return true;
            } catch (chuw | gid e) {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("aitb", "a", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Failed to receive messages from tachyon.");
                return false;
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo37987a(aiss aiss, byte[] bArr) {
        try {
            aitc aitc = this.f69670a;
            aiti aiti = aitc.f69676c;
            ClientContext clientContext = aitc.f69674a;
            aiss aiss2 = this.f69671b;
            String str = this.f69672c;
            bxvd da = cbll.f177527e.mo74144da();
            cbmo a = m57883a(aiss2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbll cbll = (cbll) da.f164949b;
            a.getClass();
            cbll.f177529a = a;
            str.getClass();
            cbll.f177530b = str;
            bxvd da2 = cbkj.f177405k.mo74144da();
            String uuid = UUID.randomUUID().toString();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cbkj cbkj = (cbkj) da2.f164949b;
            uuid.getClass();
            cbkj.f177409c = uuid;
            cbkj.f177410d = cbki.m127937a(6);
            bxtx a2 = bxtx.m123261a(bArr);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cbkj cbkj2 = (cbkj) da2.f164949b;
            a2.getClass();
            cbkj2.f177411e = a2;
            cbkj2.f177416j = cbkh.m127935a(4);
            cbkj cbkj3 = (cbkj) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbkj3.getClass();
            ((cbll) da.f164949b).f177532d = cbkj3;
            cbma b = m57884b(aiss);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b.getClass();
            ((cbll) da.f164949b).f177531c = b;
            cbll cbll2 = (cbll) da.mo74062i();
            if (aiti.f69694d == null) {
                aiti.f69694d = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Messaging/SendMessageExpress", ciie.m150370a(cbll.f177527e), ciie.m150370a(cblm.f177533a));
            }
            cblm cblm = (cblm) aiti.f69695a.mo25553a(aiti.f69694d, clientContext, cbll2, (long) aiti.f69692b, TimeUnit.MILLISECONDS);
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aitb", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Sent message to tachyon.");
        } catch (chuw | gid e) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("aitb", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to send message to tachyon.");
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized boolean mo37988a(Executor executor) {
        executor.execute(new aisy(this));
        return true;
    }

    /* renamed from: a */
    public final synchronized boolean mo37989a(Executor executor, aiss aiss, byte[] bArr) {
        executor.execute(new aisz(this, aiss, bArr));
        return true;
    }
}
