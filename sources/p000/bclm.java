package p000;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: bclm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bclm {

    /* renamed from: a */
    private static final bnhe f104433a = bnhe.m109409a(cbei.PHOTO, "photos", cbei.RICH_CARD, "rich_card");

    /* renamed from: a */
    private static bcfz m89247a(bcoh bcoh, cbma cbma, List list) {
        bcfy bcfy = new bcfy();
        ConversationId a = bclg.m89239a(cbma, bcoh);
        if (a != null) {
            bcfy.f104102a = a;
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cbma cbma2 = (cbma) list.get(i);
                ContactId a2 = bclg.m89238a(cbma2);
                if (a2 == null) {
                    String str = cbma2.f177594b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
                    sb.append("Failed to convert Id: ");
                    sb.append(str);
                    sb.append(" to ContactId");
                    bbos.m88294d("MsgProtoConverter", sb.toString());
                } else {
                    arrayList.add(a2);
                }
            }
            bchl b = bchm.m89027b();
            b.mo56888a(arrayList);
            bcfy.f104103b = b.mo56887a();
            String str2 = bcfy.f104102a == null ? " conversationId" : "";
            if (bcfy.f104103b == null) {
                str2 = str2.concat(" groupInfoChanges");
            }
            if (str2.isEmpty()) {
                return new bcgo(bcfy.f104102a, bcfy.f104103b);
            }
            String valueOf = String.valueOf(str2);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        throw new NullPointerException("Null conversationId");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015b  */
    /* renamed from: a */
    private static bchu m89248a(bcoh bcoh, String str, cbmv cbmv) {
        cbmx cbmx;
        cbdx cbdx;
        bxwf e;
        bchr g = bchu.m89062g();
        g.mo56898a(str);
        cbdx cbdx2 = null;
        bchd bchd = new bchd(null);
        bchd.mo56884a(false);
        cbmi cbmi = cbmv.f177687c;
        String str2 = "";
        if (cbmi != null) {
            bxty bxty = cbmi.f177629c;
            if (bxty != null) {
                try {
                    cbdx = (cbdx) bxvk.m124007a(cbdx.f176806b, bxty.f164801a);
                    try {
                        "Lighter".getClass();
                        if (cbdx.f176808a.containsKey("Lighter")) {
                            bchd.mo56884a(true);
                        }
                        cbdx2 = cbdx;
                    } catch (bxwf e2) {
                        e = e2;
                        bbos.m88292b("MsgProtoConverter", "Error parsing AppData", e);
                        cbdx2 = cbdx;
                        cbmx = cbmv.f177686b;
                        if (cbmx == null) {
                        }
                        if (cbmx.f177694a != null) {
                        }
                        if (bchd.f104160b == null) {
                        }
                        if (!str2.isEmpty()) {
                        }
                    }
                } catch (bxwf e3) {
                    cbdx = null;
                    e = e3;
                    bbos.m88292b("MsgProtoConverter", "Error parsing AppData", e);
                    cbdx2 = cbdx;
                    cbmx = cbmv.f177686b;
                    if (cbmx == null) {
                    }
                    if (cbmx.f177694a != null) {
                    }
                    if (bchd.f104160b == null) {
                    }
                    if (!str2.isEmpty()) {
                    }
                }
            }
            cbmx = cbmv.f177686b;
            if (cbmx == null) {
                cbmx = cbmx.f177692e;
            }
            if (cbmx.f177694a != null) {
                cbmx cbmx2 = cbmv.f177686b;
                if (cbmx2 == null) {
                    cbmx2 = cbmx.f177692e;
                }
                cbma cbma = cbmx2.f177694a;
                if (cbma == null) {
                    cbma = cbma.f177591f;
                }
                bchd.f104159a = bmxv.m108566b(bclg.m89239a(cbma, bcoh));
                bchp l = bchq.m89041l();
                l.mo56896c(str2);
                l.mo56891a(str2);
                l.mo56892a(new HashMap());
                cbmi cbmi2 = cbmv.f177687c;
                if (cbmi2 == null) {
                    cbmi2 = cbmi.f177625e;
                }
                if (cbmi2.f177627a != null) {
                    cbmi cbmi3 = cbmv.f177687c;
                    if (cbmi3 == null) {
                        cbmi3 = cbmi.f177625e;
                    }
                    bxye bxye = cbmi3.f177627a;
                    if (bxye == null) {
                        bxye = bxye.f165087b;
                    }
                    l.mo56896c(bxye.f165089a);
                }
                cbmi cbmi4 = cbmv.f177687c;
                if (cbmi4 == null) {
                    cbmi4 = cbmi.f177625e;
                }
                if (cbmi4.f177630d != null) {
                    cbmi cbmi5 = cbmv.f177687c;
                    if (cbmi5 == null) {
                        cbmi5 = cbmi.f177625e;
                    }
                    bxye bxye2 = cbmi5.f177630d;
                    if (bxye2 == null) {
                        bxye2 = bxye.f165087b;
                    }
                    l.mo56895b(bxye2.f165089a);
                } else {
                    cbmi cbmi6 = cbmv.f177687c;
                    if (cbmi6 == null) {
                        cbmi6 = cbmi.f177625e;
                    }
                    if (cbmi6.f177628b != null) {
                        cbmi cbmi7 = cbmv.f177687c;
                        if (cbmi7 == null) {
                            cbmi7 = cbmi.f177625e;
                        }
                        cbme cbme = cbmi7.f177628b;
                        if (cbme == null) {
                            cbme = cbme.f177607c;
                        }
                        l.mo56891a(cbme.f177610b);
                        cbmi cbmi8 = cbmv.f177687c;
                        if (cbmi8 == null) {
                            cbmi8 = cbmi.f177625e;
                        }
                        cbme cbme2 = cbmi8.f177628b;
                        if (cbme2 == null) {
                            cbme2 = cbme.f177607c;
                        }
                        l.mo56893a(cbme2.f177609a.mo73780k());
                    }
                }
                if (cbdx2 != null) {
                    HashMap hashMap = new HashMap();
                    Map unmodifiableMap = Collections.unmodifiableMap(cbdx2.f176808a);
                    for (String str3 : unmodifiableMap.keySet()) {
                        hashMap.put(str3, ((bxte) unmodifiableMap.get(str3)).mo73642k());
                    }
                    l.mo56892a(hashMap);
                }
                l.mo56890a(bngx.m109376e());
                l.mo56894b(bngx.m109376e());
                bchd.f104161c = bmxv.m108566b(l.mo56889a());
            }
        }
        if (bchd.f104160b == null) {
            str2 = " syncBlockStatus";
        }
        if (!str2.isEmpty()) {
            throw new IllegalStateException(str2.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str2));
        }
        g.f104181a = new bcge(new bcgq(bchd.f104159a, bchd.f104160b.booleanValue(), bchd.f104161c));
        return g.mo56897a();
    }

    /* renamed from: a */
    private static bcia m89249a(bcte bcte, cbff cbff, ContactId contactId, ConversationId conversationId, bcoh bcoh, cbkj cbkj, bcnt bcnt) {
        int i;
        int i2;
        HashMap hashMap = new HashMap();
        Map unmodifiableMap = Collections.unmodifiableMap(cbff.f176906m);
        for (String str : unmodifiableMap.keySet()) {
            hashMap.put(str, ((bxte) unmodifiableMap.get(str)).mo73639aL());
        }
        bcte.mo57514a(hashMap);
        bcte.mo57513a(cbff.f176904k);
        boolean equals = contactId.equals(conversationId.mo60498a());
        boolean z = false;
        if (equals || cbff.f176908o) {
            i = 1;
        } else {
            i = 0;
        }
        bcte.mo57516b(i);
        bcte.mo57520c(cbff.f176900g);
        if (!equals) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        bcte.f104841a = i2;
        bcte.mo57506a(!equals ? bctk.f104859b : bctk.f104865h);
        bcte.mo57521d(cbff.f176907n);
        bcte.mo57510a(contactId);
        bcte.mo57511a(conversationId);
        bcte.mo57512a(Long.valueOf(cbff.f176901h));
        bctr a = bcte.mo57502a();
        bcrt bcrt = (bcrt) a;
        if (bcrt.f104752j != -1) {
            bcnr q = bcns.m89409q();
            q.mo57011b(10011);
            q.mo57012b(bcoh.mo57058b().mo57074e());
            q.mo57010a(bcoh.mo57059c().mo73781l());
            q.mo57013b(cbkj.f177409c);
            q.mo57016e(bcrt.f104752j);
            bcnt.mo56753a(q.mo57002a());
        }
        bchx k = bcia.m89091k();
        k.f104189b = new bcgj(a);
        if (equals || cbff.f176908o) {
            z = true;
        }
        k.mo56911a(z);
        return k.mo56909a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:169:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02de  */
    /* renamed from: a */
    private static bmxv m89250a(Context context, bcoh bcoh, cbff cbff, bcnt bcnt) {
        cbfd cbfd;
        bmxv bmxv;
        cbfd cbfd2;
        bmxv bmxv2;
        cbfd cbfd3;
        cbfd cbfd4;
        cbfd cbfd5;
        cbei cbei = cbei.UNKNOWN;
        if (cbff.f176896c == 105) {
            cbfd = (cbfd) cbff.f176897d;
        } else {
            cbfd = cbfd.f176887c;
        }
        int b = cbem.m127779b(cbfd.f176889a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        int i2 = b - 2;
        int i3 = 3;
        int i4 = 4;
        int i5 = 0;
        if (i2 == 2) {
            cbdl cbdl = cbff.f176903j;
            if (cbdl == null) {
                cbdl = cbdl.f176754d;
            }
            ConversationId a = bcli.m89241a(bcoh, cbdl);
            ContactId a2 = m89257a(cbff);
            if (a.mo60498a().equals(a2)) {
                bmxv = bmvz.f131120a;
            } else {
                try {
                    if (cbff.f176896c == 105) {
                        cbfd2 = (cbfd) cbff.f176897d;
                    } else {
                        cbfd2 = cbfd.f176887c;
                    }
                    bxte bxte = cbfd2.f176890b;
                    if (bxte == null) {
                        bxte = bxte.f164763c;
                    }
                    cbfl cbfl = (cbfl) bxvk.m124007a(cbfl.f176931c, bxte.f164766b);
                    int i6 = cbfl.f176933a;
                    if (i6 == 0) {
                        i3 = 2;
                    } else if (i6 != 1) {
                        i3 = i6 != 2 ? 0 : 4;
                    }
                    if (i3 == 0) {
                        i3 = 1;
                    }
                    int i7 = i3 - 2;
                    if (i7 == 1) {
                        i5 = 1;
                    } else if (i7 == 2) {
                        i5 = 2;
                    }
                    bcib g = bcic.m89110g();
                    g.mo56924a(cbff.f176900g);
                    g.mo56923a(a);
                    g.mo56922a(a2);
                    g.mo56920a(i5);
                    g.mo56921a(cbfl.f176934b);
                    g.mo56925b(cbff.f176901h);
                    bmxv = bmxv.m108566b(g.mo56919a());
                } catch (bxwf e) {
                    bbos.m88292b("TypingIndicatorProtos", "Failed to parse typing indicator", e);
                    bmxv = bmvz.f131120a;
                }
            }
            if (!bmxv.mo66813a()) {
                return bmvz.f131120a;
            }
            bchx k = bcia.m89091k();
            bcic bcic = (bcic) bmxv.mo66814b();
            if (bcic != null) {
                k.f104189b = new bcgm(bcic);
                k.mo56911a(true);
                return bmxv.m108566b(k.mo56909a());
            }
            throw null;
        } else if (i2 == 4) {
            try {
                if (cbff.f176896c == 105) {
                    cbfd3 = (cbfd) cbff.f176897d;
                } else {
                    cbfd3 = cbfd.f176887c;
                }
                bxte bxte2 = cbfd3.f176890b;
                if (bxte2 == null) {
                    bxte2 = bxte.f164763c;
                }
                cbfj cbfj = (cbfj) bxvk.m124007a(cbfj.f176924c, bxte2.f164766b);
                int i8 = cbfj.f176927b;
                if (i8 == 0) {
                    i4 = 2;
                } else if (i8 == 1) {
                    i4 = 3;
                } else if (i8 != 2) {
                    i4 = i8 != 3 ? 0 : 5;
                }
                if (i4 == 0) {
                    i4 = 1;
                }
                int i9 = i4 - 2;
                if (i9 == 1) {
                    i = 0;
                } else if (i9 == 2) {
                    i = 2;
                } else if (i9 != 3) {
                    String valueOf = String.valueOf(cbff.f176900g);
                    bbos.m88294d("ReceiptProtos", valueOf.length() == 0 ? new String("Unrecognized receipt type ") : "Unrecognized receipt type ".concat(valueOf));
                    bmxv2 = bmvz.f131120a;
                    if (bmxv2.mo66813a()) {
                        return bmvz.f131120a;
                    }
                    bchx k2 = bcia.m89091k();
                    bchw bchw = (bchw) bmxv2.mo66814b();
                    if (bchw != null) {
                        k2.f104189b = new bcgl(bchw);
                        k2.mo56911a(cbff.f176908o);
                        return bmxv.m108566b(k2.mo56909a());
                    }
                    throw null;
                }
                cbds cbds = cbff.f176902i;
                if (cbds == null) {
                    cbds = cbds.f176782e;
                }
                ContactId a3 = bclk.m89246a(cbds);
                cbdl cbdl2 = cbff.f176903j;
                if (cbdl2 == null) {
                    cbdl2 = cbdl.f176754d;
                }
                ConversationId a4 = bcli.m89241a(bcoh, cbdl2);
                ArrayList arrayList = new ArrayList();
                bxwc bxwc = cbfj.f176926a;
                int size = bxwc.size();
                while (i5 < size) {
                    arrayList.add(((cbfi) bxwc.get(i5)).f176923a);
                    i5++;
                }
                bchv f = bchw.m89075f();
                f.mo56907a(cbff.f176900g);
                f.mo56908a(arrayList);
                f.mo56906a(a4);
                f.mo56904a(i);
                f.mo56905a(a3);
                bmxv2 = bmxv.m108566b(f.mo56903a());
            } catch (bxwf e2) {
                bbos.m88292b("ReceiptProtos", "Failed to parse receipt", e2);
                bmxv2 = bmvz.f131120a;
            }
            if (bmxv2.mo66813a()) {
            }
        } else if (i2 != 9) {
            if (cbff.f176896c == 105) {
                cbfd5 = (cbfd) cbff.f176897d;
            } else {
                cbfd5 = cbfd.f176887c;
            }
            int b2 = cbem.m127779b(cbfd5.f176889a);
            if (b2 != 0) {
                i = b2;
            }
            String valueOf2 = String.valueOf(Integer.toString(cbem.m127778a(i)));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 44);
            sb.append("UNKNOWN EVENT type LighterMessage received :");
            sb.append(valueOf2);
            bbos.m88289a("MsgProtoConverter", sb.toString());
            return bmvz.f131120a;
        } else {
            try {
                if (cbff.f176896c == 105) {
                    cbfd4 = (cbfd) cbff.f176897d;
                } else {
                    cbfd4 = cbfd.f176887c;
                }
                bxte bxte3 = cbfd4.f176890b;
                if (bxte3 == null) {
                    bxte3 = bxte.f164763c;
                }
                bxtx bxtx = bxte3.f164766b;
                bxus c = bxus.m123744c();
                cbcz cbcz = cbcz.f176713c;
                try {
                    bxuc h = bxtx.mo73764h();
                    bxvk bxvk = (bxvk) cbcz.mo74142c(4);
                    bxxv a5 = bxxm.f165037a.mo74228a(bxvk);
                    a5.mo74220a(bxvk, bxud.m123454a(h), c);
                    a5.mo74225d(bxvk);
                    h.mo73787a(0);
                    bxvk.m124027b(bxvk);
                    cbcz cbcz2 = (cbcz) bxvk;
                    cbdl cbdl3 = cbff.f176903j;
                    if (cbdl3 == null) {
                        cbdl3 = cbdl.f176754d;
                    }
                    ConversationId a6 = bcli.m89241a(bcoh, cbdl3);
                    int i10 = cbcz2.f176715a;
                    if (i10 == 0) {
                        i3 = 2;
                    } else if (i10 != 1) {
                        i3 = 0;
                    }
                    if (i3 == 0) {
                        i3 = 1;
                    }
                    if (i3 - 2 != 1) {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Unsupported CloudUpdate eventType: ");
                        sb2.append(i10);
                        bbos.m88294d("MsgProtoConverter", sb2.toString());
                    } else if (bbqe.m88387a(context).mo56358b()) {
                        try {
                            bxte bxte4 = cbcz2.f176716b;
                            if (bxte4 == null) {
                                bxte4 = bxte.f164763c;
                            }
                            bxtx bxtx2 = bxte4.f164766b;
                            bxus c2 = bxus.m123744c();
                            cbcy cbcy = cbcy.f176710b;
                            try {
                                bxuc h2 = bxtx2.mo73764h();
                                bxvk bxvk2 = (bxvk) cbcy.mo74142c(4);
                                bxxv a7 = bxxm.f165037a.mo74228a(bxvk2);
                                a7.mo74220a(bxvk2, bxud.m123454a(h2), c2);
                                a7.mo74225d(bxvk2);
                                h2.mo73787a(0);
                                bxvk.m124027b(bxvk2);
                                long j = ((cbcy) bxvk2).f176712a;
                                bchf bchf = new bchf();
                                bchf.f104162a = new bcga(new bcgt(a6, j));
                                String str = "";
                                if (bchf.f104162a == null) {
                                    str = " oneOfType";
                                }
                                if (str.isEmpty()) {
                                    bcgr bcgr = new bcgr(bchf.f104162a);
                                    bchx k3 = bcia.m89091k();
                                    k3.f104189b = new bcgi(bcgr);
                                    k3.mo56911a(true);
                                    return bmxv.m108566b(k3.mo56909a());
                                }
                                throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
                            } catch (IOException e3) {
                                if (!(e3.getCause() instanceof bxwf)) {
                                    throw new bxwf(e3.getMessage());
                                }
                                throw ((bxwf) e3.getCause());
                            } catch (RuntimeException e4) {
                                if (e4.getCause() instanceof bxwf) {
                                    throw ((bxwf) e4.getCause());
                                }
                                throw e4;
                            } catch (bxwf e5) {
                                throw e5;
                            } catch (bxwf e6) {
                                throw e6;
                            }
                        } catch (bxwf e7) {
                            bbos.m88292b("MsgProtoConverter", "Error parsing DeleteConversationEventDetails: ", e7);
                            bcnr q = bcns.m89409q();
                            q.mo57011b(10034);
                            bcnt.mo56753a(q.mo57002a());
                        }
                    }
                    return bmvz.f131120a;
                } catch (IOException e8) {
                    if (!(e8.getCause() instanceof bxwf)) {
                        throw new bxwf(e8.getMessage());
                    }
                    throw ((bxwf) e8.getCause());
                } catch (RuntimeException e9) {
                    if (e9.getCause() instanceof bxwf) {
                        throw ((bxwf) e9.getCause());
                    }
                    throw e9;
                } catch (bxwf e10) {
                    throw e10;
                } catch (bxwf e11) {
                    throw e11;
                }
            } catch (bxwf e12) {
                bbos.m88292b("MsgProtoConverter", "Error parsing CloudUpdate LighterMessage: ", e12);
                bcnr q2 = bcns.m89409q();
                q2.mo57011b(10033);
                bcnt.mo56753a(q2.mo57002a());
                return bmvz.f131120a;
            }
        }
    }

    /* renamed from: a */
    public static bmxv m89251a(cbkj cbkj) {
        int b = cbkh.m127936b(cbkj.f177416j);
        if (b == 0) {
            b = 1;
        }
        return (b == 4 || b == 7) ? bmvz.f131120a : bmxv.m108566b(cbkj.f177409c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ed, code lost:
        if (r0.f176828f == 1) goto L_0x01f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a99  */
    /* renamed from: a */
    public static bmxv m89252a(cbkj cbkj, bcoh bcoh, Context context, Map map, bcnt bcnt) {
        bmxv bmxv;
        cbmw cbmw;
        cbmx cbmx;
        cbdx cbdx;
        cbmt cbmt;
        cbmz cbmz;
        cbmv cbmv;
        int i;
        bcte bcte;
        cbff cbff;
        cbcx cbcx;
        int size;
        int i2;
        bngx a;
        bmxv bmxv2;
        int i3;
        String str;
        String str2;
        cbfk cbfk;
        int i4;
        String str3;
        cbec cbec;
        cbec cbec2;
        cbec cbec3;
        cbec cbec4;
        cbec cbec5;
        cbec cbec6;
        cbec cbec7;
        cbec cbec8;
        cbkj cbkj2 = cbkj;
        bcoh bcoh2 = bcoh;
        Context context2 = context;
        bcnt bcnt2 = bcnt;
        cbei cbei = cbei.UNKNOWN;
        int b = cbki.m127938b(cbkj2.f177410d);
        if (b == 0) {
            b = 1;
        }
        int i5 = b - 2;
        String str4 = "";
        if (i5 == 5) {
            String str5 = "MsgProtoConverter";
            try {
                cbkg cbkg = (cbkg) bxvk.m124007a(cbkg.f177400d, cbkj2.f177411e);
                int a2 = cbkf.m127933a(cbkg.f177404c);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i6 = a2 - 2;
                if (i6 != 5) {
                    if (i6 != 6) {
                        if (i6 != 7) {
                            if (i6 != 8) {
                                int a3 = cbkf.m127933a(cbkg.f177404c);
                                if (a3 == 0) {
                                    a3 = 1;
                                }
                                if (a3 != 1) {
                                    StringBuilder sb = new StringBuilder(49);
                                    sb.append("UNSUPPORTED ");
                                    sb.append(a3 - 2);
                                    sb.append("type GroupMessage received");
                                    bbos.m88294d(str5, sb.toString());
                                } else {
                                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                                }
                            } else {
                                if (cbkg.f177402a == 108) {
                                    cbmv = (cbmv) cbkg.f177403b;
                                } else {
                                    cbmv = cbmv.f177683d;
                                }
                                String valueOf = String.valueOf(cbmv);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 33);
                                sb2.append("ChangeGroupProfilePush received: ");
                                sb2.append(valueOf);
                                bbos.m88289a(str5, sb2.toString());
                                bchx k = bcia.m89091k();
                                k.mo56910a(m89248a(bcoh2, cbkj2.f177409c, cbmv));
                                bmxv = bmxv.m108566b(k.mo56909a());
                            }
                        } else if (((Boolean) bbqt.m88417a(context).f103091M.mo58455c()).booleanValue()) {
                            if (cbkg.f177402a == 107) {
                                cbmz = (cbmz) cbkg.f177403b;
                            } else {
                                cbmz = cbmz.f177701d;
                            }
                            String valueOf2 = String.valueOf(cbmz);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
                            sb3.append("KickGroupUsersPush received: ");
                            sb3.append(valueOf2);
                            bbos.m88289a(str5, sb3.toString());
                            cbmx cbmx2 = cbmz.f177704b;
                            if (cbmx2 == null) {
                                cbmx2 = cbmx.f177692e;
                            }
                            if (cbmx2.f177694a != null && !cbmz.f177705c.isEmpty()) {
                                bchr g = bchu.m89062g();
                                g.mo56898a(cbkj2.f177409c);
                                cbmx cbmx3 = cbmz.f177704b;
                                if (cbmx3 == null) {
                                    cbmx3 = cbmx.f177692e;
                                }
                                cbma cbma = cbmx3.f177694a;
                                if (cbma == null) {
                                    cbma = cbma.f177591f;
                                }
                                g.f104181a = new bcgg(m89247a(bcoh2, cbma, cbmz.f177705c));
                                bchu a4 = g.mo56897a();
                                bchx k2 = bcia.m89091k();
                                k2.mo56910a(a4);
                                bmxv = bmxv.m108566b(k2.mo56909a());
                            } else {
                                bmxv = bmvz.f131120a;
                            }
                        }
                    } else if (((Boolean) bbqt.m88417a(context).f103090L.mo58455c()).booleanValue()) {
                        if (cbkg.f177402a == 106) {
                            cbmt = (cbmt) cbkg.f177403b;
                        } else {
                            cbmt = cbmt.f177676d;
                        }
                        String valueOf3 = String.valueOf(cbmt);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 28);
                        sb4.append("AddGroupUsersPush received: ");
                        sb4.append(valueOf3);
                        bbos.m88289a(str5, sb4.toString());
                        cbmx cbmx4 = cbmt.f177679b;
                        if (cbmx4 == null) {
                            cbmx4 = cbmx.f177692e;
                        }
                        if (cbmx4.f177694a != null && !cbmt.f177680c.isEmpty()) {
                            bchr g2 = bchu.m89062g();
                            g2.mo56898a(cbkj2.f177409c);
                            cbmx cbmx5 = cbmt.f177679b;
                            if (cbmx5 == null) {
                                cbmx5 = cbmx.f177692e;
                            }
                            cbma cbma2 = cbmx5.f177694a;
                            if (cbma2 == null) {
                                cbma2 = cbma.f177591f;
                            }
                            g2.f104181a = new bcgc(m89247a(bcoh2, cbma2, cbmt.f177680c));
                            bchu a5 = g2.mo56897a();
                            bchx k3 = bcia.m89091k();
                            k3.mo56910a(a5);
                            bmxv = bmxv.m108566b(k3.mo56909a());
                        } else {
                            bmxv = bmvz.f131120a;
                        }
                    }
                } else if (((Boolean) bbqt.m88417a(context).f103092N.mo58455c()).booleanValue()) {
                    if (cbkg.f177402a == 105) {
                        cbmw = (cbmw) cbkg.f177403b;
                    } else {
                        cbmw = cbmw.f177688c;
                    }
                    String valueOf4 = String.valueOf(cbmw);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 26);
                    sb5.append("CreateGroupPush received: ");
                    sb5.append(valueOf4);
                    bbos.m88289a(str5, sb5.toString());
                    cbmx cbmx6 = cbmw.f177691b;
                    if (cbmx6 == null) {
                        cbmx6 = cbmx.f177692e;
                    }
                    if (cbmx6.f177694a != null) {
                        cbmx cbmx7 = cbmw.f177691b;
                        if (cbmx7 == null) {
                            cbmx7 = cbmx.f177692e;
                        }
                        if (cbmx7.f177695b != null) {
                            bchr g3 = bchu.m89062g();
                            g3.mo56898a(cbkj2.f177409c);
                            cbmx cbmx8 = cbmw.f177691b;
                            if (cbmx8 != null) {
                                cbmx = cbmx8;
                            } else {
                                cbmx = cbmx.f177692e;
                            }
                            bcso n = bcsp.m89835n();
                            cbma cbma3 = cbmx.f177694a;
                            if (cbma3 == null) {
                                cbma3 = cbma.f177591f;
                            }
                            n.mo57461a(bclg.m89239a(cbma3, bcoh2));
                            cbmk cbmk = cbmx.f177695b;
                            if (cbmk == null) {
                                cbmk = cbmk.f177636e;
                            }
                            n.mo57467b(cbmk.f177638a);
                            cbmk cbmk2 = cbmx.f177695b;
                            if (cbmk2 == null) {
                                cbmk2 = cbmk.f177636e;
                            }
                            n.mo57463a(cbmk2.f177639b);
                            n.mo57468b(false);
                            n.mo57465a(false);
                            n.mo57462a((Long) -1L);
                            cbmk cbmk3 = cbmx.f177695b;
                            if (cbmk3 == null) {
                                cbmk3 = cbmk.f177636e;
                            }
                            if (cbmk3.f177640c.mo73780k().length > 0) {
                                cbmk cbmk4 = cbmx.f177695b;
                                if (cbmk4 == null) {
                                    cbmk4 = cbmk.f177636e;
                                }
                                byte[] k4 = cbmk4.f177640c.mo73780k();
                                cbmk cbmk5 = cbmx.f177695b;
                                if (cbmk5 == null) {
                                    cbmk5 = cbmk.f177636e;
                                }
                                n.mo57458a(BitmapFactory.decodeByteArray(k4, 0, cbmk5.f177640c.mo73780k().length));
                            }
                            try {
                                cbmk cbmk6 = cbmx.f177695b;
                                if (cbmk6 == null) {
                                    cbmk6 = cbmk.f177636e;
                                }
                                cbdx = (cbdx) bxvk.m124007a(cbdx.f176806b, cbmk6.f177641d);
                            } catch (bxwf e) {
                                bbos.m88292b(str5, "Error parsing AppData", e);
                                cbdx = null;
                            }
                            if (cbdx != null) {
                                HashMap hashMap = new HashMap();
                                Map unmodifiableMap = Collections.unmodifiableMap(cbdx.f176808a);
                                for (String str6 : unmodifiableMap.keySet()) {
                                    hashMap.put(str6, ((bxte) unmodifiableMap.get(str6)).mo73642k());
                                }
                                n.mo57464a(hashMap);
                            }
                            bchi bchi = new bchi(null);
                            bchi.f104163a = n.mo57457a();
                            bxwc bxwc = cbmx.f177697d;
                            ArrayList arrayList = new ArrayList();
                            int size2 = bxwc.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                cbmy cbmy = (cbmy) bxwc.get(i7);
                                cbma cbma4 = cbmy.f177700a;
                                if (cbma4 != null) {
                                    ContactId a6 = bclg.m89238a(cbma4);
                                    if (a6 == null) {
                                        cbma cbma5 = cbmy.f177700a;
                                        if (cbma5 == null) {
                                            cbma5 = cbma.f177591f;
                                        }
                                        String str7 = cbma5.f177594b;
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(str7).length() + 35);
                                        sb6.append("Failed to convert Id: ");
                                        sb6.append(str7);
                                        sb6.append(" to ContactId");
                                        bbos.m88294d(str5, sb6.toString());
                                    } else {
                                        arrayList.add(a6);
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                bchl b2 = bchm.m89027b();
                                b2.mo56888a(arrayList);
                                bchi.f104164b = bmxv.m108566b(b2.mo56887a());
                            }
                            if (bchi.f104163a == null) {
                                str4 = " conversation";
                            }
                            if (!str4.isEmpty()) {
                                throw new IllegalStateException(str4.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str4));
                            }
                            g3.f104181a = new bcgf(new bcgs(bchi.f104163a, bchi.f104164b));
                            bchu a7 = g3.mo56897a();
                            bchx k5 = bcia.m89091k();
                            k5.mo56910a(a7);
                            bmxv = bmxv.m108566b(k5.mo56909a());
                        }
                    }
                    bmxv = bmvz.f131120a;
                }
                bmxv = bmvz.f131120a;
            } catch (bxwf e2) {
                bbos.m88292b(str5, "Error parsing GroupMessage", e2);
                bmxv = bmvz.f131120a;
            }
        } else if (i5 == 7) {
            String str8 = "MsgProtoConverter";
            try {
                cblu cblu = (cblu) bxvk.m124007a(cblu.f177563d, cbkj2.f177411e);
                bchr g4 = bchu.m89062g();
                g4.mo56898a(cbkj2.f177409c);
                int a8 = cipn.m150698a(cblu.f177567c);
                if (a8 == 0) {
                    a8 = 1;
                }
                switch (a8 - 2) {
                    case 13:
                    case 14:
                    case 15:
                        bchb bchb = new bchb();
                        bchb.f104158a = true;
                        if (bchb.f104158a == null) {
                            str4 = " syncBlockStatus";
                        }
                        if (str4.isEmpty()) {
                            g4.f104181a = new bcgd(new bcgp(bchb.f104158a.booleanValue()));
                            bchx k6 = bcia.m89091k();
                            k6.mo56910a(g4.mo56897a());
                            bmxv = bmxv.m108566b(k6.mo56909a());
                            break;
                        } else {
                            throw new IllegalStateException(str4.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str4));
                        }
                    default:
                        bbos.m88294d(str8, "UNSUPPORTED type UserDataMessage received");
                        bmxv = bmvz.f131120a;
                        break;
                }
            } catch (bxwf e3) {
                bbos.m88292b(str8, "Error parsing UserDataMessage", e3);
                bmxv = bmvz.f131120a;
            }
        } else if (i5 != 24) {
            bcnr q = bcns.m89409q();
            q.mo57011b(15);
            q.mo57012b(bcoh.mo57058b().mo57074e());
            q.mo57010a(bcoh.mo57059c().mo73781l());
            q.mo57013b(cbkj2.f177409c);
            q.mo57003a(52);
            bcnt2.mo56753a(q.mo57002a());
            String valueOf5 = String.valueOf(cbkj2.f177409c);
            bbos.m88294d("MsgProtoConverter", valueOf5.length() == 0 ? new String("Unsupported InboxMessage received: ") : "Unsupported InboxMessage received: ".concat(valueOf5));
            return bmvz.f131120a;
        } else {
            try {
                cbff cbff2 = (cbff) bxvk.m124007a(cbff.f176892t, cbkj2.f177411e);
                String valueOf6 = String.valueOf(cbff2);
                StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf6).length() + 25);
                sb7.append("LighterMessage received: ");
                sb7.append(valueOf6);
                bbos.m88289a("MsgProtoConverter", sb7.toString());
                cbdl cbdl = cbff2.f176903j;
                if (cbdl == null) {
                    cbdl = cbdl.f176754d;
                }
                ConversationId a9 = bcli.m89241a(bcoh2, cbdl);
                ContactId a10 = m89257a(cbff2);
                bcte p = bctr.m89953p();
                p.mo57519c(cbff2.f176911r);
                int i8 = cbff2.f176911r;
                if (i8 != 0) {
                    i = i8 != 1 ? i8 != 2 ? 0 : 4 : 3;
                } else {
                    i = 2;
                }
                if (i == 0) {
                    i = 1;
                }
                int i9 = i - 2;
                if (i9 == 0) {
                    p.mo57507a(bcqb.f104671a);
                } else if (i9 != 1) {
                    if (i9 != 2) {
                        p.mo57518c();
                    } else {
                        bctm h = bctn.m89940h();
                        if (cbff2.f176898e == 151) {
                            cbec2 = (cbec) cbff2.f176899f;
                        } else {
                            cbec2 = cbec.f176821g;
                        }
                        cbdj cbdj = cbec2.f176823a;
                        if (cbdj == null) {
                            cbdj = cbdj.f176740j;
                        }
                        bmxv a11 = bclb.m89215a(context2, cbdj, bmvz.f131120a, bmxv.m108566b(cbff2.f176900g));
                        bcoo j = bcov.m89535j();
                        j.mo57094c();
                        h.mo57527a((bcov) a11.mo66812a(j.mo57085a()));
                        if (cbff2.f176898e == 151) {
                            cbec3 = (cbec) cbff2.f176899f;
                        } else {
                            cbec3 = cbec.f176821g;
                        }
                        h.mo57529a(cbec3.f176824b);
                        if (cbff2.f176898e == 151) {
                            cbec4 = (cbec) cbff2.f176899f;
                        } else {
                            cbec4 = cbec.f176821g;
                        }
                        h.mo57532c(cbec4.f176826d);
                        if (cbff2.f176898e == 151) {
                            cbec5 = (cbec) cbff2.f176899f;
                        } else {
                            cbec5 = cbec.f176821g;
                        }
                        h.mo57530a(cbec5.f176825c);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        bbon.m88284a();
                        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                        if (cbff2.f176898e == 151) {
                            cbec6 = (cbec) cbff2.f176899f;
                        } else {
                            cbec6 = cbec.f176821g;
                        }
                        h.mo57526a((int) (seconds + ((long) cbec6.f176826d)));
                        if (cbff2.f176898e == 151) {
                            cbec7 = (cbec) cbff2.f176899f;
                        } else {
                            cbec7 = cbec.f176821g;
                        }
                        cbdr cbdr = cbec7.f176827e;
                        if (cbdr == null) {
                            cbdr = cbdr.f176775f;
                        }
                        h.mo57528a(bclj.m89242a(cbdr));
                        if (cbff2.f176898e == 151) {
                            cbec8 = (cbec) cbff2.f176899f;
                        } else {
                            cbec8 = cbec.f176821g;
                        }
                        h.mo57531b(cbec8.f176828f);
                        p.mo57507a(bcqg.m89626a(h.mo57525a()));
                    }
                } else if (bbqe.m88387a(context).mo56364h()) {
                    p.mo57507a(bcqe.f104674a);
                } else {
                    p.mo57507a(bcqb.f104671a);
                }
                if (bbpw.m88374a(context).mo56349a().contains(Integer.valueOf(cbff2.f176910q))) {
                    bcte = p;
                } else if (cbff2.f176910q != 0) {
                    cbei a12 = cbei.m127772a(cbff2.f176905l);
                    if (a12 == null) {
                        a12 = cbei.UNRECOGNIZED;
                    }
                    if (a12 != cbei.CHIPS_ONLY) {
                        if (cbff2.f176911r == 2) {
                            if (cbff2.f176898e == 151) {
                                cbec = (cbec) cbff2.f176899f;
                            } else {
                                cbec = cbec.f176821g;
                            }
                        }
                        bbqe a13 = bbqe.m88387a(context);
                        if (a13.mo56357a(22, a13.f103062a.f103134ac)) {
                            cbfg cbfg = cbff2.f176912s;
                            if (cbfg == null) {
                                cbfg = cbfg.f176913b;
                            }
                            int i10 = cbfg.f176915a;
                            int i11 = i10 != 0 ? i10 != 1 ? 0 : 3 : 2;
                            if (i11 == 0) {
                                i11 = 1;
                            }
                            if (i11 - 2 != 1) {
                                bmxv = m89253a(cbkj, bcoh, bcnt, cbff2, a9, a10, p);
                            } else {
                                int i12 = cbff2.f176910q;
                                StringBuilder sb8 = new StringBuilder(58);
                                sb8.append("Message dropped due to unsupported capability: ");
                                sb8.append(i12);
                                bbos.m88289a("MsgProtoConverter", sb8.toString());
                                bcnr q2 = bcns.m89409q();
                                q2.mo57011b(15);
                                q2.mo57013b(cbff2.f176900g);
                                q2.mo57012b(bcoh.mo57058b().mo57074e());
                                q2.mo57010a(bcoh.mo57059c().mo73781l());
                                q2.mo57003a(57);
                                bcnt2.mo56753a(q2.mo57002a());
                                bmxv = bmvz.f131120a;
                            }
                        } else {
                            bmxv = m89253a(cbkj, bcoh, bcnt, cbff2, a9, a10, p);
                        }
                    }
                    bmxv = bmvz.f131120a;
                } else {
                    bcte = p;
                }
                bcte.mo57503a(-1);
                cbei a14 = cbei.m127772a(cbff2.f176905l);
                if (a14 == null) {
                    a14 = cbei.UNRECOGNIZED;
                }
                int ordinal = a14.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        cbff = cbff2;
                        if (cbff.f176896c == 102) {
                            cbfk = (cbfk) cbff.f176897d;
                        } else {
                            cbfk = cbfk.f176928b;
                        }
                        bcte.mo57517b(cbfk.f176930a);
                    } else if (ordinal != 3) {
                        switch (ordinal) {
                            case 6:
                                bmxv = m89250a(context2, bcoh2, cbff2, bcnt2);
                                break;
                            case 7:
                                cbff = cbff2;
                                if (bbqe.m88387a(context).mo56366j() && cbff.f176896c == 106) {
                                    bcuo a15 = bcly.m89263a(bcoh2, context2, (cbgf) cbff.f176897d, cbff.f176900g, bcnt2);
                                    bcte.mo57508a(a15);
                                    bcnr q3 = bcns.m89409q();
                                    q3.mo57011b(23);
                                    q3.mo57013b(cbff.f176900g);
                                    q3.mo57012b(bcoh.mo57058b().mo57074e());
                                    q3.mo57010a(bcoh.mo57059c().mo73781l());
                                    if (!a15.mo57401b()) {
                                        i4 = 111;
                                    } else {
                                        i4 = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                                    }
                                    q3.mo57003a(i4);
                                    bcnt2.mo56753a(q3.mo57002a());
                                    break;
                                } else {
                                    bcte.mo57509a(bxtx.f164797b);
                                    break;
                                }
                                break;
                            case 8:
                                cbff = cbff2;
                                if (bbqe.m88387a(context).mo56360d()) {
                                    bcte.mo57515b();
                                    bcte.mo57503a(-1);
                                    break;
                                } else {
                                    bmxv = bmvz.f131120a;
                                    break;
                                }
                            case 9:
                                try {
                                    str3 = "MsgProtoConverter";
                                    cbff = cbff2;
                                    try {
                                        if (m89261a(cbei.RICH_CARD, bcte, map, cbff2, bcoh, cbkj)) {
                                            bcnr q4 = bcns.m89409q();
                                            q4.mo57011b(10014);
                                            q4.mo57013b(cbff.f176900g);
                                            q4.mo57012b(bcoh.mo57058b().mo57074e());
                                            q4.mo57010a(bcoh.mo57059c().mo73781l());
                                            bcnt2.mo56753a(q4.mo57002a());
                                        }
                                    } catch (bcld e4) {
                                        e = e4;
                                        bbos.m88292b(str3, "Got unsupported rich card content.", e);
                                        bcnr q5 = bcns.m89409q();
                                        q5.mo57011b(10015);
                                        q5.mo57013b(cbff.f176900g);
                                        q5.mo57012b(bcoh.mo57058b().mo57074e());
                                        q5.mo57010a(bcoh.mo57059c().mo73781l());
                                        q5.mo57003a(e.f104430a);
                                        bcnt2.mo56753a(q5.mo57002a());
                                        bcte.mo57509a(bxtx.f164797b);
                                        bcte.mo57503a(-1);
                                        bchx d = m89249a(bcte, cbff, a10, a9, bcoh, cbkj, bcnt).mo56871d();
                                        cbcx = cbff.f176909p;
                                        if (cbcx == null) {
                                        }
                                        String str9 = cbff.f176900g;
                                        bxwc bxwc2 = cbcx.f176707c;
                                        String str10 = cbcx.f176705a;
                                        bngs j2 = bngx.m109377j();
                                        size = bxwc2.size();
                                        i2 = 0;
                                        while (i2 < size) {
                                        }
                                        String str11 = str9;
                                        a = j2.mo67664a();
                                        if (a.isEmpty()) {
                                        }
                                        if (bmxv2.mo66813a()) {
                                        }
                                        bmxv = bmxv.m108566b(d.mo56909a());
                                        if (!bmxv.mo66813a()) {
                                        }
                                        return bmxv;
                                    }
                                } catch (bcld e5) {
                                    e = e5;
                                    cbff = cbff2;
                                    str3 = "MsgProtoConverter";
                                    bbos.m88292b(str3, "Got unsupported rich card content.", e);
                                    bcnr q52 = bcns.m89409q();
                                    q52.mo57011b(10015);
                                    q52.mo57013b(cbff.f176900g);
                                    q52.mo57012b(bcoh.mo57058b().mo57074e());
                                    q52.mo57010a(bcoh.mo57059c().mo73781l());
                                    q52.mo57003a(e.f104430a);
                                    bcnt2.mo56753a(q52.mo57002a());
                                    bcte.mo57509a(bxtx.f164797b);
                                    bcte.mo57503a(-1);
                                    bchx d2 = m89249a(bcte, cbff, a10, a9, bcoh, cbkj, bcnt).mo56871d();
                                    cbcx = cbff.f176909p;
                                    if (cbcx == null) {
                                    }
                                    String str92 = cbff.f176900g;
                                    bxwc bxwc22 = cbcx.f176707c;
                                    String str102 = cbcx.f176705a;
                                    bngs j22 = bngx.m109377j();
                                    size = bxwc22.size();
                                    i2 = 0;
                                    while (i2 < size) {
                                    }
                                    String str112 = str92;
                                    a = j22.mo67664a();
                                    if (a.isEmpty()) {
                                    }
                                    if (bmxv2.mo66813a()) {
                                    }
                                    bmxv = bmxv.m108566b(d2.mo56909a());
                                    if (!bmxv.mo66813a()) {
                                    }
                                    return bmxv;
                                }
                                break;
                            default:
                                bbos.m88291b("MsgProtoConverter", "UNSUPPORTED type LighterMessage received");
                                bcte.mo57509a(bxtx.f164797b);
                                cbff = cbff2;
                                break;
                        }
                    } else {
                        cbff = cbff2;
                        String str12 = "MsgProtoConverter";
                        try {
                            m89261a(cbei.PHOTO, bcte, map, cbff, bcoh, cbkj);
                        } catch (bcld e6) {
                            bbos.m88294d(str12, "Photos handler threw an exception it didn't need to");
                            bcte.mo57509a(bxtx.f164797b);
                            bcte.mo57503a(-1);
                        }
                    }
                    bchx d22 = m89249a(bcte, cbff, a10, a9, bcoh, cbkj, bcnt).mo56871d();
                    if (cbff.f176909p != null && bbqe.m88387a(context).mo56360d()) {
                        cbcx = cbff.f176909p;
                        if (cbcx == null) {
                            cbcx = cbcx.f176703f;
                        }
                        String str922 = cbff.f176900g;
                        bxwc bxwc222 = cbcx.f176707c;
                        String str1022 = cbcx.f176705a;
                        bngs j222 = bngx.m109377j();
                        size = bxwc222.size();
                        i2 = 0;
                        while (i2 < size) {
                            cbcw cbcw = (cbcw) bxwc222.get(i2);
                            bxwc bxwc3 = bxwc222;
                            cbdj cbdj2 = cbcw.f176702e;
                            if (cbdj2 == null) {
                                cbdj2 = cbdj.f176740j;
                            }
                            int i13 = size;
                            String str13 = str1022;
                            bmxv a16 = bclb.m89215a(context2, cbdj2, bmxv.m108566b(str1022), bmxv.m108566b(str922));
                            if (a16.mo66813a()) {
                                bcur f = bcus.m90057f();
                                f.mo57572a(cbcw.f176698a);
                                f.mo57576b(cbcw.f176699b);
                                f.mo57573a((bcov) a16.mo66814b());
                                bbqe a17 = bbqe.m88387a(context);
                                str2 = str922;
                                if (a17.mo56357a(12, a17.f103062a.f103099U)) {
                                    f.mo57575a(cbcw.f176701d);
                                }
                                cbdr cbdr2 = cbcw.f176700c;
                                if (cbdr2 == null) {
                                    cbdr2 = cbdr.f176775f;
                                }
                                if (!cbdr2.f176777a.mo73779j()) {
                                    bcsy f2 = bcsz.m89872f();
                                    cbdr cbdr3 = cbcw.f176700c;
                                    if (cbdr3 == null) {
                                        cbdr3 = cbdr.f176775f;
                                    }
                                    f2.mo57490a(cbdr3.f176777a.mo73780k());
                                    cbdr cbdr4 = cbcw.f176700c;
                                    if (cbdr4 == null) {
                                        cbdr4 = cbdr.f176775f;
                                    }
                                    f2.mo57492c(cbdr4.f176779c);
                                    cbdr cbdr5 = cbcw.f176700c;
                                    if (cbdr5 == null) {
                                        cbdr5 = cbdr.f176775f;
                                    }
                                    f2.mo57491b(cbdr5.f176778b);
                                    cbdr cbdr6 = cbcw.f176700c;
                                    if (cbdr6 == null) {
                                        cbdr6 = cbdr.f176775f;
                                    }
                                    f2.mo57489a(cbdr6.f176781e);
                                    cbdr cbdr7 = cbcw.f176700c;
                                    if (cbdr7 == null) {
                                        cbdr7 = cbdr.f176775f;
                                    }
                                    if (cbdr7.f176780d != null) {
                                        cbdr cbdr8 = cbcw.f176700c;
                                        if (cbdr8 == null) {
                                            cbdr8 = cbdr.f176775f;
                                        }
                                        bzrt bzrt = cbdr8.f176780d;
                                        if (bzrt == null) {
                                            bzrt = bzrt.f171195e;
                                        }
                                        f2.mo57488a(bclc.m89223a(bzrt));
                                    }
                                    f.mo57574a(f2.mo57487a());
                                }
                                j222.mo67668c(f.mo57571a());
                            } else {
                                str2 = str922;
                            }
                            i2++;
                            size = i13;
                            bxwc222 = bxwc3;
                            str1022 = str13;
                            str922 = str2;
                        }
                        String str1122 = str922;
                        a = j222.mo67664a();
                        if (a.isEmpty()) {
                            bmxv2 = bmvz.f131120a;
                        } else {
                            int i14 = cbcx.f176708d;
                            int i15 = i14 != 0 ? i14 != 1 ? i14 != 2 ? 0 : 4 : 3 : 2;
                            if (i15 == 0) {
                                i15 = 1;
                            }
                            int i16 = i15 - 2;
                            if (i16 == 1) {
                                i3 = 1;
                            } else if (i16 != 2) {
                                bmxv2 = bmvz.f131120a;
                            } else {
                                i3 = 2;
                            }
                            bcut f3 = bcuu.m90069f();
                            f3.mo57579a(a);
                            f3.mo57581b(cbcx.f176705a);
                            f3.mo57578a(i3);
                            if (!TextUtils.isEmpty(cbcx.f176706b)) {
                                str = cbcx.f176706b;
                            } else {
                                str = str1122;
                            }
                            f3.mo57582c(str);
                            bbqe a18 = bbqe.m88387a(context);
                            if (a18.mo56357a(11, a18.f103062a.f103100V)) {
                                f3.mo57580a(cbcx.f176709e);
                            }
                            bmxv2 = bmxv.m108566b(f3.mo57577a());
                        }
                        if (bmxv2.mo66813a()) {
                            bcuu bcuu = (bcuu) bmxv2.mo66814b();
                            bcnr q6 = bcns.m89409q();
                            q6.mo57011b(10025);
                            q6.mo57012b(bcoh.mo57058b().mo57074e());
                            bcuv h2 = bcux.m90080h();
                            bcnv bcnv = new bcnv(null);
                            String a19 = bcuu.mo57416a();
                            if (a19 != null) {
                                bcnv.f104593a = a19;
                                bcnv.f104596d = Integer.valueOf(bcuu.mo57419d());
                                if (bcnv.f104593a == null) {
                                    str4 = " chipsId";
                                }
                                if (bcnv.f104596d == null) {
                                    str4 = str4.concat(" renderStyle");
                                }
                                if (!str4.isEmpty()) {
                                    String valueOf7 = String.valueOf(str4);
                                    throw new IllegalStateException(valueOf7.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf7));
                                }
                                h2.f104967a = bmxv.m108566b(new bcrb(new bcnu(bcnv.f104593a, bcnv.f104594b, bcnv.f104595c, bcnv.f104596d.intValue(), bcnv.f104597e)));
                                q6.mo57005a(h2.mo57583a());
                                q6.mo57010a(bcoh.mo57059c().mo73781l());
                                q6.mo57013b(cbff.f176900g);
                                bcnt2.mo56753a(q6.mo57002a());
                                d22.f104188a = bcuu;
                                d22.mo56909a();
                            } else {
                                throw new NullPointerException("Null chipsId");
                            }
                        }
                    }
                    bmxv = bmxv.m108566b(d22.mo56909a());
                } else {
                    bbos.m88294d("MsgProtoConverter", "UNKNOWN type LighterMessage received");
                    bmxv = bmvz.f131120a;
                }
            } catch (bxwf e7) {
                bbos.m88292b("MsgProtoConverter", "Error parsing LighterMessage", e7);
                bmxv = bmvz.f131120a;
            }
        }
        if (!bmxv.mo66813a()) {
            bcnr q7 = bcns.m89409q();
            q7.mo57011b(15);
            q7.mo57012b(bcoh.mo57058b().mo57074e());
            q7.mo57010a(bcoh.mo57059c().mo73781l());
            q7.mo57013b(cbkj2.f177409c);
            q7.mo57003a(53);
            bcnt2.mo56753a(q7.mo57002a());
        }
        return bmxv;
    }

    /* renamed from: a */
    private static bmxv m89253a(cbkj cbkj, bcoh bcoh, bcnt bcnt, cbff cbff, ConversationId conversationId, ContactId contactId, bcte bcte) {
        bcte.mo57509a(bxtx.m123261a(Base64.encode(cbkj.mo73642k(), 8)));
        bcte.mo57503a(cbff.f176910q);
        return bmxv.m108566b(m89249a(bcte, cbff, contactId, conversationId, bcoh, cbkj, bcnt));
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0168 A[ADDED_TO_REGION] */
    /* renamed from: a */
    public static cbff m89254a(Context context, bctr bctr, Map map) {
        bxvd bxvd;
        char c;
        cbei cbei = cbei.UNKNOWN;
        int a = bctr.mo57365f().mo57180a();
        int i = a - 1;
        if (a != 0) {
            if (i == 1) {
                bxvd = cbff.f176892t.mo74144da();
                cbei cbei2 = cbei.TEXT;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ((cbff) bxvd.f164949b).f176905l = cbei2.mo3214a();
                bxvd da = cbfk.f176928b.mo74144da();
                String d = bctr.mo57365f().mo57192d();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                d.getClass();
                ((cbfk) da.f164949b).f176930a = d;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cbff cbff = (cbff) bxvd.f164949b;
                cbfk cbfk = (cbfk) da.mo74062i();
                cbfk.getClass();
                cbff.f176897d = cbfk;
                cbff.f176896c = 102;
            } else if (i != 2) {
                if (i != 3) {
                    bxvd = cbff.f176892t.mo74144da();
                    cbei cbei3 = cbei.UNKNOWN;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    ((cbff) bxvd.f164949b).f176905l = cbei3.mo3214a();
                } else {
                    bxvd da2 = cbff.f176892t.mo74144da();
                    if (((Boolean) bbqt.m88417a(context).f103095Q.mo58455c()).booleanValue()) {
                        cbei cbei4 = cbei.RICH_TEXT;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        ((cbff) da2.f164949b).f176905l = cbei4.mo3214a();
                        cbgf a2 = bcly.m89264a(bctr.mo57365f().mo57188c());
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        cbff cbff2 = (cbff) da2.f164949b;
                        a2.getClass();
                        cbff2.f176897d = a2;
                        cbff2.f176896c = 106;
                    } else if (!bmxx.m108577a((String) bctr.mo57363e().mo66815c())) {
                        cbei cbei5 = cbei.TEXT;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        ((cbff) da2.f164949b).f176905l = cbei5.mo3214a();
                        bxvd da3 = cbfk.f176928b.mo74144da();
                        String str = (String) bctr.mo57363e().mo66814b();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        str.getClass();
                        ((cbfk) da3.f164949b).f176930a = str;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        cbff cbff3 = (cbff) da2.f164949b;
                        cbfk cbfk2 = (cbfk) da3.mo74062i();
                        cbfk2.getClass();
                        cbff3.f176897d = cbfk2;
                        cbff3.f176896c = 102;
                    } else {
                        cbei cbei6 = cbei.UNKNOWN;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        ((cbff) da2.f164949b).f176905l = cbei6.mo3214a();
                    }
                    bxvd = da2;
                }
            } else if (!map.containsKey(bctr.mo57365f().mo57184b().mo57379a())) {
                bxvd = cbff.f176892t.mo74144da();
                cbei cbei7 = cbei.UNKNOWN;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ((cbff) bxvd.f164949b).f176905l = cbei7.mo3214a();
            } else {
                String a3 = bctr.mo57365f().mo57184b().mo57379a();
                int hashCode = a3.hashCode();
                if (hashCode != -989034367) {
                    if (hashCode == -843123565 && a3.equals("rich_card")) {
                        c = 1;
                        if (c != 0 || c == 1) {
                            bxvd = ((bclf) map.get(bctr.mo57365f().mo57184b().mo57379a())).mo56971a().mo56970a(bctr);
                        } else {
                            bxvd = cbff.f176892t.mo74144da();
                            cbei cbei8 = cbei.UNKNOWN;
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            ((cbff) bxvd.f164949b).f176905l = cbei8.mo3214a();
                        }
                    }
                } else if (a3.equals("photos")) {
                    c = 0;
                    if (c != 0) {
                    }
                    bxvd = ((bclf) map.get(bctr.mo57365f().mo57184b().mo57379a())).mo56971a().mo56970a(bctr);
                }
                c = 65535;
                if (c != 0) {
                }
                bxvd = ((bclf) map.get(bctr.mo57365f().mo57184b().mo57379a())).mo56971a().mo56970a(bctr);
            }
            int j = bctr.mo57370j();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cbff cbff4 = cbff.f176892t;
            ((cbff) bxvd.f164949b).f176910q = j;
            cbds a4 = bclk.m89245a(bctr.mo57360b());
            String a5 = bctr.mo57359a();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cbff cbff5 = (cbff) bxvd.f164949b;
            a5.getClass();
            cbff5.f176900g = a5;
            a4.getClass();
            cbff5.f176902i = a4;
            cbdl a6 = bcli.m89240a(bctr.mo57361c());
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            a6.getClass();
            ((cbff) bxvd.f164949b).f176903j = a6;
            if (bctr.mo57363e().mo66813a()) {
                String str2 = (String) bctr.mo57363e().mo66814b();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                str2.getClass();
                ((cbff) bxvd.f164949b).f176904k = str2;
            }
            if (bctr.mo57367h().mo66813a()) {
                String str3 = (String) bctr.mo57367h().mo66814b();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                str3.getClass();
                ((cbff) bxvd.f164949b).f176907n = str3;
            }
            if (!bctr.mo57369i().isEmpty()) {
                bnrd a7 = bctr.mo57369i().keySet().iterator();
                while (a7.hasNext()) {
                    String str4 = (String) a7.next();
                    try {
                        bxte bxte = (bxte) bxvk.m124007a(bxte.f164763c, (bxtx) bctr.mo57369i().get(str4));
                        str4.getClass();
                        bxte.getClass();
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        cbff cbff6 = (cbff) bxvd.f164949b;
                        bxww bxww = cbff6.f176906m;
                        if (!bxww.f165014a) {
                            cbff6.f176906m = bxww.mo74203a();
                        }
                        cbff6.f176906m.put(str4, bxte);
                    } catch (bxwf e) {
                        bbos.m88292b("MsgProtoConverter", "Error parsing metadata map", e);
                    }
                }
            }
            return (cbff) bxvd.mo74062i();
        }
        throw null;
    }

    /* renamed from: a */
    public static cbff m89255a(String str, ConversationId conversationId, bmxv bmxv, String str2) {
        cbds a = bclk.m89245a(conversationId.mo60498a());
        bxvd da = cbff.f176892t.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbff cbff = (cbff) da.f164949b;
        str.getClass();
        cbff.f176900g = str;
        a.getClass();
        cbff.f176902i = a;
        cbdl a2 = bcli.m89240a(conversationId);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbff cbff2 = (cbff) da.f164949b;
        a2.getClass();
        cbff2.f176903j = a2;
        a.getClass();
        cbff2.f176895b = a;
        cbff2.f176894a = 5;
        cbei cbei = cbei.EVENT;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbff) da.f164949b).f176905l = cbei.mo3214a();
        bxvd da2 = cbfd.f176887c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbfd) da2.f164949b).f176889a = cbem.m127778a(8);
        bxvd da3 = bxte.f164763c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        "type.googleapis.com/google.internal.communications.instantmessaging.v1.ActionEvent".getClass();
        ((bxte) da3.f164949b).f164765a = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ActionEvent";
        bxvd da4 = cbez.f176874c.mo74144da();
        String str3 = (String) bmxv.mo66812a("");
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        cbez cbez = (cbez) da4.f164949b;
        str3.getClass();
        cbez.f176876a = str3;
        str2.getClass();
        cbez.f176877b = str2;
        bxtx aL = ((cbez) da4.mo74062i()).mo73639aL();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        aL.getClass();
        ((bxte) da3.f164949b).f164766b = aL;
        bxte bxte = (bxte) da3.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxte.getClass();
        ((cbfd) da2.f164949b).f176890b = bxte;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbff cbff3 = (cbff) da.f164949b;
        cbfd cbfd = (cbfd) da2.mo74062i();
        cbfd.getClass();
        cbff3.f176897d = cbfd;
        cbff3.f176896c = ErrorInfo.TYPE_SDU_MEMORY_FULL;
        return (cbff) da.mo74062i();
    }

    /* renamed from: a */
    public static cbff m89256a(String str, ConversationId conversationId, byte[] bArr, boolean z, boolean z2) {
        cbds a = bclk.m89245a(conversationId.mo60498a());
        bxvd da = cbff.f176892t.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbff cbff = (cbff) da.f164949b;
        str.getClass();
        cbff.f176900g = str;
        a.getClass();
        cbff.f176902i = a;
        cbdl a2 = bcli.m89240a(conversationId);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbff cbff2 = (cbff) da.f164949b;
        a2.getClass();
        cbff2.f176903j = a2;
        a.getClass();
        cbff2.f176895b = a;
        cbff2.f176894a = 5;
        cbei cbei = cbei.EVENT;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbff) da.f164949b).f176905l = cbei.mo3214a();
        bxvd da2 = cbfd.f176887c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbfd) da2.f164949b).f176889a = cbem.m127778a(7);
        bxvd da3 = bxte.f164763c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        "type.googleapis.com/google.internal.communications.instantmessaging.v1.ConversationIntentOpenedEvent".getClass();
        ((bxte) da3.f164949b).f164765a = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ConversationIntentOpenedEvent";
        bxvd da4 = cbfb.f176880d.mo74144da();
        bxtx a3 = bxtx.m123261a(bArr);
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        cbfb cbfb = (cbfb) da4.f164949b;
        a3.getClass();
        cbfb.f176882a = a3;
        cbfb.f176883b = z;
        cbfb.f176884c = z2;
        bxtx aL = ((cbfb) da4.mo74062i()).mo73639aL();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        aL.getClass();
        ((bxte) da3.f164949b).f164766b = aL;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxte bxte = (bxte) da3.mo74062i();
        bxte.getClass();
        ((cbfd) da2.f164949b).f176890b = bxte;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbff cbff3 = (cbff) da.f164949b;
        cbfd cbfd = (cbfd) da2.mo74062i();
        cbfd.getClass();
        cbff3.f176897d = cbfd;
        cbff3.f176896c = ErrorInfo.TYPE_SDU_MEMORY_FULL;
        return (cbff) da.mo74062i();
    }

    /* renamed from: a */
    public static ContactId m89257a(cbff cbff) {
        cbds cbds = cbff.f176902i;
        if (cbds == null) {
            cbds = cbds.f176782e;
        }
        return cbff.f176894a == 5 ? bclk.m89246a((cbds) cbff.f176895b) : bclk.m89246a(cbds);
    }

    /* renamed from: a */
    public static List m89258a(bcoh bcoh, List list) {
        bngs bngs = new bngs();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            bxvd da = cbmm.f177646c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cbmm) da.f164949b).f177648a = str;
            cbma a = bclg.m89237a(bcoh.mo57058b().mo57074e());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((cbmm) da.f164949b).f177649b = a;
            bngs.mo67668c((cbmm) da.mo74062i());
        }
        return bngs.mo67664a();
    }

    /* renamed from: a */
    public static List m89259a(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bmxv a = m89251a((cbkj) list.get(i));
            arrayList.getClass();
            a.mo66810a((bmxj) new bcll(arrayList));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List m89260a(List list, bcoh bcoh, Context context, Map map, bcnt bcnt) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bmxv a = m89252a((cbkj) list.get(i), bcoh, context, map, bcnt);
            if (a.mo66813a()) {
                arrayList.add((bcia) a.mo66814b());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m89261a(cbei cbei, bcte bcte, Map map, cbff cbff, bcoh bcoh, cbkj cbkj) {
        String str = (String) f104433a.get(cbei);
        if (map.containsKey(str)) {
            bcte.mo57505a(((bclf) map.get(str)).mo56971a().mo56967a(bcoh, cbff));
            return true;
        }
        bcte.mo57509a(bxtx.m123261a(Base64.encode(cbkj.mo73642k(), 8)));
        bcte.mo57503a(cbff.f176910q);
        return false;
    }
}
