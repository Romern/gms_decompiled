package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bbwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbwq implements bbpk, bbpl, bbpu, bbqx {

    /* renamed from: A */
    public final bbue f103599A;

    /* renamed from: B */
    private final Executor f103600B;

    /* renamed from: C */
    private final HashSet f103601C;

    /* renamed from: D */
    private BroadcastReceiver f103602D;

    /* renamed from: a */
    public final Context f103603a;

    /* renamed from: b */
    public final bbxw f103604b;

    /* renamed from: c */
    public final bbpi f103605c;

    /* renamed from: d */
    public final bqgj f103606d;

    /* renamed from: e */
    public final bbyw f103607e;

    /* renamed from: f */
    public final bcfx f103608f;

    /* renamed from: g */
    public final bbsi f103609g;

    /* renamed from: h */
    public final Object f103610h = new Object();

    /* renamed from: i */
    public final Object f103611i = new Object();

    /* renamed from: j */
    public final Random f103612j;

    /* renamed from: k */
    public final bbxo f103613k;

    /* renamed from: l */
    final Map f103614l = new HashMap();

    /* renamed from: m */
    final Map f103615m = new HashMap();

    /* renamed from: n */
    public final Handler f103616n = new Handler(Looper.getMainLooper());

    /* renamed from: o */
    public bbpg f103617o;

    /* renamed from: p */
    public bbpf f103618p;

    /* renamed from: q */
    public bbpv f103619q;

    /* renamed from: r */
    public final Map f103620r;

    /* renamed from: s */
    public HashSet f103621s;

    /* renamed from: t */
    public final Map f103622t;

    /* renamed from: u */
    public final bbqr f103623u;

    /* renamed from: v */
    public final Runnable f103624v;

    /* renamed from: w */
    public final bbqr f103625w;

    /* renamed from: x */
    public final Runnable f103626x;

    /* renamed from: y */
    public final bbqr f103627y;

    /* renamed from: z */
    public final Runnable f103628z;

    public bbwq(Context context, bbxw bbxw, bbyw bbyw, bbsi bbsi, Map map, bbpi bbpi, bcfx bcfx, bbue bbue) {
        new HashMap();
        this.f103623u = new bbwj(this);
        this.f103624v = new bbwk(this);
        this.f103625w = new bbwm(this);
        this.f103626x = new bbwn(this);
        this.f103627y = new bbwo(this);
        this.f103628z = new bbwp(this);
        this.f103603a = context;
        this.f103604b = bbxw;
        this.f103607e = bbyw;
        this.f103609g = bbsi;
        this.f103605c = bbpi;
        this.f103606d = bboz.m88304a().f103024a;
        this.f103608f = bcfx;
        this.f103622t = new HashMap();
        this.f103601C = new HashSet();
        this.f103620r = map;
        this.f103600B = bqgs.m112813a((Executor) this.f103606d);
        this.f103612j = new Random();
        this.f103599A = bbue;
        this.f103613k = new bbxo();
    }

    /* renamed from: a */
    public static final bcsp m88518a(bcsp bcsp, bchq bchq, long j) {
        byte[] bArr;
        int length;
        bcso m = bcsp.mo57329m();
        bbon.m88284a();
        m.mo57462a(Long.valueOf(System.currentTimeMillis() + j));
        m.mo57465a(true);
        if (!TextUtils.isEmpty(bchq.mo56841a())) {
            m.mo57467b(bchq.mo56841a());
        }
        if (bchq.mo56843c().mo66813a()) {
            m.mo57463a((String) bchq.mo56843c().mo66814b());
            m.mo57468b(true);
        } else if (bchq.mo56844d().mo66813a() && (length = (bArr = (byte[]) bchq.mo56844d().mo66814b()).length) > 0) {
            m.mo57458a(BitmapFactory.decodeByteArray(bArr, 0, length));
        }
        if (!bchq.mo56848g().isEmpty()) {
            m.mo57464a(bchq.mo56848g());
        }
        return m.mo57457a();
    }

    /* renamed from: b */
    public final bdar mo56327b(bcoh bcoh, ConversationId conversationId) {
        return m88519a(bcoh, conversationId, bbvt.f103542a, bbwd.f103572a);
    }

    /* renamed from: c */
    public final bdal mo56473c(bcoh bcoh) {
        return this.f103607e.mo56561a(bcoh);
    }

    /* renamed from: d */
    public final bbub mo56475d(bcoh bcoh) {
        return bbub.m88472a(this.f103603a, bcoh, this.f103604b, this, this, mo56473c(bcoh), this.f103618p, this.f103619q, this.f103609g, this, this.f103620r);
    }

    /* renamed from: b */
    public final void mo56328b(bcoh bcoh) {
        mo56475d(bcoh).mo56426d();
    }

    /* renamed from: c */
    public final void mo56331c(bcoh bcoh, ConversationId conversationId) {
        this.f103606d.mo25812a(new bbuy(this, bcoh, conversationId));
    }

    /* renamed from: b */
    public final void mo56329b(bcoh bcoh, String str) {
        bmxv a = this.f103604b.mo56500a(bcoh, str);
        if (a.mo66813a()) {
            this.f103606d.mo25812a(new bbvd(this, bcoh, str, a));
        }
    }

    /* renamed from: c */
    public final synchronized void mo56474c(List list) {
        HashSet hashSet = this.f103621s;
        if (hashSet == null) {
            this.f103621s = new HashSet(list);
        } else {
            hashSet.addAll(list);
        }
        this.f103616n.removeCallbacks(this.f103624v);
        this.f103624v.run();
        if (this.f103602D == null) {
            this.f103602D = new bbwh(this);
            this.f103603a.registerReceiver(this.f103602D, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: d */
    public final void mo56332d(bcoh bcoh, ConversationId conversationId) {
        this.f103606d.mo25812a(new bbva(this, bcoh, conversationId));
        for (bclf bclf : this.f103620r.values()) {
            bclf.mo56975a(conversationId);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo56330b(List list) {
        HashSet hashSet = this.f103621s;
        if (hashSet != null) {
            if (!hashSet.isEmpty()) {
                this.f103621s.removeAll(list);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    mo56475d((bcoh) list.get(i)).mo56429g();
                }
                if (this.f103621s.isEmpty()) {
                    this.f103616n.removeCallbacks(this.f103624v);
                    BroadcastReceiver broadcastReceiver = this.f103602D;
                    if (broadcastReceiver != null) {
                        this.f103603a.unregisterReceiver(broadcastReceiver);
                        this.f103602D = null;
                    }
                }
            }
        }
        bbos.m88289a("LiMsgController", "No accounts with open bind channel");
    }

    /* renamed from: a */
    private final bdar m88519a(bcoh bcoh, ConversationId conversationId, bmxz bmxz, bmxz bmxz2) {
        return bdak.m90446a(mo56473c(bcoh).mo56610a(conversationId), new bbwf(this, conversationId, bmxz, bmxz2, bcoh));
    }

    /* renamed from: a */
    public final bctr mo56307a(ConversationId conversationId, String str) {
        bcti a = bcqa.m89619a(str);
        bmxv b = bmxv.m108566b(str);
        bmvz bmvz = bmvz.f131120a;
        bnhe bnhe = bnoj.f131912b;
        bcte p = bctr.m89953p();
        bmvz.mo66812a("");
        bbon.m88284a();
        p.mo57520c(String.format("%s%s-%s", "", UUID.randomUUID().toString(), Long.valueOf(System.currentTimeMillis())));
        p.f104841a = 2;
        p.mo57506a(bctk.f104862e);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bbon.m88284a();
        p.mo57512a(Long.valueOf(timeUnit.toMicros(System.currentTimeMillis())));
        p.mo57511a(conversationId);
        p.mo57505a(a);
        p.mo57513a(str);
        p.mo57510a(conversationId.mo60498a());
        bctq bctq = bctq.f104880a;
        p.mo57503a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC);
        p.mo57518c();
        p.mo57514a(bnhe);
        p.mo57521d((String) ((bmyg) b).f131198a);
        return p.mo57502a();
    }

    /* renamed from: a */
    public final bdar mo56308a(bcoh bcoh, int i, int i2) {
        return bdak.m90446a(mo56473c(bcoh).mo56606a(i, i2), new bbuf(this, bcoh));
    }

    /* renamed from: a */
    public final bdar mo56309a(bcoh bcoh, ConversationId conversationId) {
        return m88519a(bcoh, conversationId, bbuz.f103484a, bbvj.f103515a);
    }

    /* renamed from: a */
    public final bdar mo56310a(bcoh bcoh, ConversationId conversationId, int i) {
        return mo56473c(bcoh).mo56611a(conversationId, i);
    }

    /* renamed from: a */
    public final bdar mo56311a(bcoh bcoh, ConversationId conversationId, Integer num, Integer num2) {
        return mo56312a(bcoh, conversationId, num, num2, bctq.f104884e);
    }

    /* renamed from: a */
    public final bdar mo56312a(bcoh bcoh, ConversationId conversationId, Integer num, Integer num2, bctq[] bctqArr) {
        return new bdah(bbqt.m88418a(bbqt.m88417a(this.f103603a).f103171m, this.f103606d), new bbug(this, bcoh, conversationId, num, num2, bctqArr), this.f103606d);
    }

    /* renamed from: a */
    public final bdar mo56313a(bcoh bcoh, String str, ConversationId conversationId) {
        return mo56473c(bcoh).mo56613a(str, conversationId);
    }

    /* renamed from: a */
    public final bmxv mo56314a(bcoh bcoh, String str) {
        return this.f103604b.mo56500a(bcoh, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x014f A[Catch:{ JSONException -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c7 A[Catch:{ JSONException -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0230 A[Catch:{ JSONException -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0238 A[Catch:{ JSONException -> 0x0248 }] */
    /* renamed from: a */
    public final bmxv mo56315a(bctr bctr) {
        bmxv bmxv;
        bmxv bmxv2;
        bbos.m88289a("LiMsgController", "encode message ");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("MESSAGE_ID", bctr.mo57359a());
            int o = bctr.mo57375o();
            int i = o - 1;
            if (o != 0) {
                jSONObject.put("MESSAGE_TYPE", i);
                jSONObject.put("CAPABILITY", bctr.mo57370j());
                bmxv g = bctr.mo57360b().mo60552g();
                if (!g.mo66813a()) {
                    return bmvz.f131120a;
                }
                jSONObject.put("SENDER", g.mo66814b());
                bmxv g2 = bctr.mo57361c().mo60559g();
                if (!g2.mo66813a()) {
                    return bmvz.f131120a;
                }
                jSONObject.put("CONVERSATION_ID", g2.mo66814b());
                jSONObject.put("SERVER_TIMESTAMP_US", bctr.mo57362d());
                bmxv e = bctr.mo57363e();
                if (e.mo66813a()) {
                    jSONObject.put("FALLBACK", e.mo66814b());
                }
                bcti f = bctr.mo57365f();
                bbos.m88289a("LiMsgController", "encode message content");
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    int a = f.mo57180a();
                    int i2 = a - 1;
                    if (a != 0) {
                        jSONObject2.put("TYPE", i2);
                        String a2 = bctf.m89915a(f.mo57180a());
                        StringBuilder sb = new StringBuilder(a2.length() + 24);
                        sb.append("message content type is ");
                        sb.append(a2);
                        bbos.m88289a("LiMsgController", sb.toString());
                        int a3 = f.mo57180a();
                        int i3 = a3 - 1;
                        if (a3 != 0) {
                            if (i3 == 1) {
                                jSONObject2.put("TEXT", f.mo57192d());
                            } else if (i3 == 2) {
                                if (this.f103620r.containsKey(f.mo57184b().mo57379a())) {
                                    bmxv a4 = ((bclf) this.f103620r.get(f.mo57184b().mo57379a())).mo56971a().mo56968a(f.mo57184b());
                                    if (a4.mo66813a()) {
                                        jSONObject2.put("CUSTOM", a4.mo66814b());
                                    } else {
                                        bbos.m88294d("LiMsgController", "failed to encode message content");
                                        bmxv = bmvz.f131120a;
                                    }
                                } else {
                                    bbos.m88294d("LiMsgController", "failed to convert MessageContent to JSONObject without handler");
                                    bmxv = bmvz.f131120a;
                                }
                                if (bmxv.mo66813a()) {
                                }
                            } else if (i3 == 3) {
                                bmxv d = f.mo57188c().mo57568d();
                                if (d.mo66813a()) {
                                    jSONObject2.put("RICH_TEXT", d.mo66814b());
                                } else {
                                    bmxv = bmvz.f131120a;
                                    if (bmxv.mo66813a()) {
                                        jSONObject.put("MESSAGE_CONTENT", bmxv.mo66814b());
                                        jSONObject.put("MESSAGE_STATUS", bctr.mo57366g().f104871m);
                                        bmxv h = bctr.mo57367h();
                                        if (h.mo66813a()) {
                                            jSONObject.put("SNIPPET", h.mo66814b());
                                        }
                                        bcto k = bctr.mo57371k();
                                        JSONObject jSONObject3 = new JSONObject();
                                        try {
                                            jSONObject3.put("TYPE", k.mo57200a().f104888h);
                                            bctq bctq = bctq.f104880a;
                                            if (k.mo57200a().ordinal() == 2) {
                                                bmxv i4 = k.mo57207b().mo57533i();
                                                if (i4.mo66813a()) {
                                                    jSONObject3.put("OVERLAY", i4.mo66814b());
                                                } else {
                                                    bbos.m88294d("Message", "Failed to convert overlay to JSONObject in rendering details");
                                                    bmxv2 = bmvz.f131120a;
                                                    if (!bmxv2.mo66813a()) {
                                                        jSONObject.put("RENDERING_DETAILS", bmxv2.mo66814b());
                                                        if (!bctr.mo57369i().isEmpty()) {
                                                            bnrd a5 = bctr.mo57369i().keySet().iterator();
                                                            while (a5.hasNext()) {
                                                                String str = (String) a5.next();
                                                                try {
                                                                    jSONObject.put(str, ((bxye) bxvk.m124007a(bxye.f165087b, ((bxte) bxvk.m124007a(bxte.f164763c, (bxtx) bctr.mo57369i().get(str))).f164766b)).f165089a);
                                                                } catch (bxwf | IllegalArgumentException e2) {
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put("INTENDED_RENDERING_TYPE", bctr.mo57372l());
                                                        jSONObject.put("FILTERABLE_FLAGS", bctr.mo57373m());
                                                        return bmxv.m108566b(jSONObject);
                                                    }
                                                    bbos.m88294d("LiMsgController", "rendering detail is empty");
                                                    return bmvz.f131120a;
                                                }
                                            }
                                            bmxv2 = bmxv.m108566b(jSONObject3);
                                        } catch (JSONException e3) {
                                            bbos.m88292b("Message", "failed to convert RenderingDetails to JSONObject.", e3);
                                            bmxv2 = bmvz.f131120a;
                                        }
                                        if (!bmxv2.mo66813a()) {
                                        }
                                    } else {
                                        bbos.m88294d("LiMsgController", "message content is empty");
                                        return bmvz.f131120a;
                                    }
                                }
                            }
                            bmxv = bmxv.m108566b(jSONObject2);
                            if (bmxv.mo66813a()) {
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } catch (JSONException e4) {
                    bbos.m88294d("LiMsgController", "failed to convert MessageContent to JSONObject");
                    bmxv = bmvz.f131120a;
                }
            } else {
                throw null;
            }
        } catch (JSONException e5) {
            bbos.m88294d("LiMsgController", "failed to convert JSONObject to Message");
            return bmvz.f131120a;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02e0 A[Catch:{ JSONException -> 0x0426 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x01ad A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x02d8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0197 A[Catch:{ JSONException -> 0x00ce }] */
    /* renamed from: a */
    public final bmxv mo56316a(JSONObject jSONObject) {
        String str;
        char c;
        bbwq bbwq;
        bmxv bmxv;
        String str2;
        bmxv bmxv2;
        String str3 = "Message";
        String str4 = "LiMsgController";
        try {
            bcte p = bctr.m89953p();
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                Iterator<String> it = keys;
                HashMap hashMap2 = hashMap;
                String str5 = str4;
                String str6 = str3;
                bcte bcte = p;
                switch (next.hashCode()) {
                    case -1852633547:
                        if (next.equals("SENDER")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1343652611:
                        if (next.equals("SNIPPET")) {
                            c = 8;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1339465791:
                        if (next.equals("INTENDED_RENDERING_TYPE")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1205599117:
                        if (next.equals("MESSAGE_ID")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -646189233:
                        if (next.equals("RENDERING_DETAILS")) {
                            c = 10;
                            break;
                        }
                        c = 65535;
                        break;
                    case -298577640:
                        if (next.equals("CAPABILITY")) {
                            c = 9;
                            break;
                        }
                        c = 65535;
                        break;
                    case 697939543:
                        if (next.equals("CONVERSATION_ID")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 802036737:
                        if (next.equals("MESSAGE_CONTENT")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1060768914:
                        if (next.equals("MESSAGE_TYPE")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1135343107:
                        if (next.equals("SERVER_TIMESTAMP_US")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1458000714:
                        if (next.equals("MESSAGE_STATUS")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1543870178:
                        if (next.equals("FALLBACK")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1639498938:
                        try {
                            if (next.equals("FILTERABLE_FLAGS")) {
                                c = 12;
                                break;
                            }
                            c = 65535;
                            break;
                        } catch (JSONException e) {
                            e = e;
                            str = str5;
                            bbos.m88292b(str, "failed to convert JSONObject to Message.", e);
                            return bmvz.f131120a;
                        }
                    default:
                        c = 65535;
                        break;
                }
                str = "TYPE";
                switch (c) {
                    case 0:
                        bcte.mo57520c(jSONObject.getString("MESSAGE_ID"));
                        str3 = str6;
                        str4 = str5;
                        p = bcte;
                        keys = it;
                        hashMap = hashMap2;
                        break;
                    case 1:
                        bcte.f104841a = bctl.m89930a(jSONObject.getInt("MESSAGE_TYPE"));
                        str3 = str6;
                        str4 = str5;
                        p = bcte;
                        keys = it;
                        hashMap = hashMap2;
                        break;
                    case 2:
                        String str7 = str5;
                        String str8 = str6;
                        bcte bcte2 = bcte;
                        bmxv a = ContactId.m94828a(jSONObject.getJSONObject("SENDER"));
                        if (a.mo66813a()) {
                            bcte2.mo57510a((ContactId) a.mo66814b());
                            str3 = str8;
                            str4 = str7;
                            p = bcte2;
                            keys = it;
                            hashMap = hashMap2;
                            break;
                        } else {
                            bbos.m88294d(str7, "failed to get sender when decoding message JSONObject.");
                            return bmvz.f131120a;
                        }
                    case 3:
                        String str9 = str5;
                        String str10 = str6;
                        bcte bcte3 = bcte;
                        bmxv a2 = ConversationId.m94838a(jSONObject.getJSONObject("CONVERSATION_ID"));
                        if (a2.mo66813a()) {
                            bcte3.mo57511a((ConversationId) a2.mo66814b());
                            str3 = str10;
                            str4 = str9;
                            p = bcte3;
                            keys = it;
                            hashMap = hashMap2;
                            break;
                        } else {
                            bbos.m88294d(str9, "failed to get conversationId when decoding message JSONObject.");
                            return bmvz.f131120a;
                        }
                    case 4:
                        bcte.mo57512a(Long.valueOf(jSONObject.getLong("SERVER_TIMESTAMP_US")));
                        str3 = str6;
                        str4 = str5;
                        p = bcte;
                        keys = it;
                        hashMap = hashMap2;
                        break;
                    case 5:
                        bcte.mo57513a(jSONObject.getString("FALLBACK"));
                        str3 = str6;
                        str4 = str5;
                        p = bcte;
                        keys = it;
                        hashMap = hashMap2;
                        break;
                    case 6:
                        String str11 = str6;
                        bcte bcte4 = bcte;
                        JSONObject jSONObject2 = jSONObject.getJSONObject("MESSAGE_CONTENT");
                        try {
                            int b = bctf.m89916b(jSONObject2.getInt(str)) - 1;
                            if (b == 0) {
                                bbwq = this;
                                str = str5;
                                bmxv = bmxv.m108566b(bcqa.m89618a(bxtx.f164797b));
                            } else if (b == 1) {
                                bbwq = this;
                                str = str5;
                                bmxv = bmxv.m108566b(bcqa.m89619a(jSONObject2.getString("TEXT")));
                            } else if (b == 2) {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("CUSTOM");
                                bbwq = this;
                                try {
                                    if (bbwq.f103620r.containsKey(jSONObject3.getString(str))) {
                                        bmxv a3 = ((bclf) bbwq.f103620r.get(jSONObject3.getString(str))).mo56971a().mo56969a(jSONObject3);
                                        bmxv = a3.mo66813a() ? bmxv.m108566b(bcqa.m89616a((bcth) a3.mo66814b())) : bmvz.f131120a;
                                        str = str5;
                                    } else {
                                        str = str5;
                                        try {
                                            bbos.m88294d(str, "failed to convert JSONObject to MessageContent without handler");
                                            bmxv = bmvz.f131120a;
                                        } catch (JSONException e2) {
                                            bbos.m88294d(str, "failed to convert JSONObject to MessageContent");
                                            bmxv = bmvz.f131120a;
                                            if (!bmxv.mo66813a()) {
                                            }
                                        }
                                    }
                                } catch (JSONException e3) {
                                    str = str5;
                                    bbos.m88294d(str, "failed to convert JSONObject to MessageContent");
                                    bmxv = bmvz.f131120a;
                                    if (!bmxv.mo66813a()) {
                                    }
                                }
                            } else if (b != 3) {
                                bmxv = bmxv.m108566b(bcpu.f104666a);
                                bbwq = this;
                                str = str5;
                            } else {
                                bmxv a4 = bcuo.m90041a(jSONObject2.getJSONObject("RICH_TEXT"));
                                bmxv = a4.mo66813a() ? bmxv.m108566b(bcqa.m89617a((bcuo) a4.mo66814b())) : bmvz.f131120a;
                                bbwq = this;
                                str = str5;
                            }
                        } catch (JSONException e4) {
                            bbwq = this;
                            str = str5;
                            bbos.m88294d(str, "failed to convert JSONObject to MessageContent");
                            bmxv = bmvz.f131120a;
                            if (!bmxv.mo66813a()) {
                            }
                        }
                        if (!bmxv.mo66813a()) {
                            bcte4.mo57505a((bcti) bmxv.mo66814b());
                            str3 = str11;
                            str4 = str;
                            p = bcte4;
                            keys = it;
                            hashMap = hashMap2;
                            break;
                        } else {
                            bbos.m88294d(str, "failed to get message content when decoding message JSONObject.");
                            return bmvz.f131120a;
                        }
                    case 7:
                        bcte.mo57506a(bctk.m89929a(jSONObject.getInt("MESSAGE_STATUS")));
                        str3 = str6;
                        p = bcte;
                        keys = it;
                        hashMap = hashMap2;
                        str4 = str5;
                        break;
                    case 8:
                        bcte.mo57521d(jSONObject.getString("SNIPPET"));
                        str3 = str6;
                        p = bcte;
                        keys = it;
                        hashMap = hashMap2;
                        str4 = str5;
                        break;
                    case 9:
                        bcte.mo57503a(jSONObject.getInt("CAPABILITY"));
                        str3 = str6;
                        p = bcte;
                        keys = it;
                        hashMap = hashMap2;
                        str4 = str5;
                        break;
                    case 10:
                        bcte bcte5 = bcte;
                        JSONObject optJSONObject = jSONObject.optJSONObject("RENDERING_DETAILS");
                        try {
                            bctq bctq = bctq.f104880a;
                            int ordinal = bctq.m89952a(optJSONObject.getInt(str)).ordinal();
                            if (ordinal == 0) {
                                str2 = str6;
                                bmxv2 = bmxv.m108566b(bcqb.f104671a);
                            } else if (ordinal == 1) {
                                str2 = str6;
                                bmxv2 = bmxv.m108566b(bcqe.f104674a);
                            } else if (ordinal == 2) {
                                bmxv a5 = bctn.m89939a(optJSONObject.getJSONObject("OVERLAY"));
                                if (a5.mo66813a()) {
                                    bmxv2 = bmxv.m108566b(bcqg.m89626a((bctn) a5.mo66814b()));
                                    str2 = str6;
                                } else {
                                    str2 = str6;
                                    try {
                                        bbos.m88294d(str2, "Failed to get overlay from JSONObject in rendering details");
                                        bmxv2 = bmvz.f131120a;
                                    } catch (JSONException e5) {
                                        e = e5;
                                        bbos.m88292b(str2, "failed to convert RenderingDetails from JSONObject", e);
                                        bmxv2 = bmvz.f131120a;
                                        if (bmxv2.mo66813a()) {
                                        }
                                    }
                                }
                            } else if (ordinal != 3) {
                                str2 = str6;
                                bmxv2 = bmvz.f131120a;
                            } else {
                                bmxv2 = bmxv.m108566b(bcqc.f104672a);
                                str2 = str6;
                            }
                        } catch (JSONException e6) {
                            e = e6;
                            str2 = str6;
                            bbos.m88292b(str2, "failed to convert RenderingDetails from JSONObject", e);
                            bmxv2 = bmvz.f131120a;
                            if (bmxv2.mo66813a()) {
                            }
                        }
                        if (bmxv2.mo66813a()) {
                            bcte5.mo57507a((bcto) bmxv2.mo66814b());
                            str3 = str2;
                            p = bcte5;
                            keys = it;
                            hashMap = hashMap2;
                            str4 = str5;
                            break;
                        } else {
                            return bmvz.f131120a;
                        }
                    case 11:
                        bcte.mo57519c(jSONObject.getInt("INTENDED_RENDERING_TYPE"));
                        p = bcte;
                        keys = it;
                        hashMap = hashMap2;
                        str4 = str5;
                        str3 = str6;
                        break;
                    case 12:
                        bcte.mo57516b(jSONObject.getInt("FILTERABLE_FLAGS"));
                        p = bcte;
                        keys = it;
                        hashMap = hashMap2;
                        str4 = str5;
                        str3 = str6;
                        break;
                    default:
                        JSONObject jSONObject4 = jSONObject;
                        str = str5;
                        String str12 = str6;
                        bcte bcte6 = bcte;
                        try {
                            bxvd da = bxte.f164763c.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            "type.googleapis.com/google.protobuf.StringValue".getClass();
                            ((bxte) da.f164949b).f164765a = "type.googleapis.com/google.protobuf.StringValue";
                            bxtx aL = bxye.m124404a(jSONObject4.getString(next)).mo73639aL();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aL.getClass();
                            ((bxte) da.f164949b).f164766b = aL;
                            HashMap hashMap3 = hashMap2;
                            hashMap3.put(next, ((bxte) da.mo74062i()).mo73639aL());
                            str3 = str12;
                            hashMap = hashMap3;
                            p = bcte6;
                            keys = it;
                            str4 = str;
                            break;
                        } catch (JSONException e7) {
                            e = e7;
                            break;
                        }
                }
            }
            p.mo57514a(hashMap);
            return bmxv.m108566b(p.mo57502a());
        } catch (JSONException e8) {
            e = e8;
            str = str4;
            bbos.m88292b(str, "failed to convert JSONObject to Message.", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public final bqgg mo56468a(bcoh bcoh, bcsp bcsp) {
        bqgg bqgg;
        if (!bcsp.mo57319c().mo66813a()) {
            return bqga.m112775a(bcsp);
        }
        Pair create = Pair.create(bcoh, Pair.create(bcsp.mo57317a(), (String) bcsp.mo57319c().mo66814b()));
        synchronized (this.f103611i) {
            bqgg = (bqgg) this.f103615m.get(create);
            if (bqgg == null) {
                bcfx bcfx = this.f103608f;
                bcnr q = bcns.m89409q();
                q.mo57011b(37);
                q.mo57012b(bcoh.mo57058b().mo57074e());
                q.mo57010a(bcoh.mo57059c().mo73781l());
                q.mo57008a(bcsp.mo57317a());
                bcfx.mo56753a(q.mo57002a());
                if (!bcsp.mo57319c().mo66813a()) {
                    bqgg = bqga.m112775a(bcsp);
                } else {
                    bqgg b = this.f103606d.mo25819b(new bbqd(this.f103603a, (String) bcsp.mo57319c().mo66814b()));
                    bqga.m112781a(b, new bbwi(this, bcoh, bcsp), bqfb.INSTANCE);
                    bqgg = bqdx.m112673a(b, new bbvu(this, bcsp, bcoh), bqfb.INSTANCE);
                }
                this.f103615m.put(create, bqgg);
                bqgg.mo741a(new bbvs(this, create), bqfb.INSTANCE);
            } else {
                bbos.m88289a("LiMsgController", "conversationSync or conversationImageFetch already pending for conversation");
            }
        }
        return bqgg;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbwq.a(bcoh, bctr, boolean):bqgg
     arg types: [bcoh, bctr, int]
     candidates:
      bbwq.a(bcsp, bchq, long):bcsp
      bbwq.a(bcoh, int, int):bdar
      bbwq.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, int):bdar
      bbwq.a(bcoh, java.lang.String, com.google.android.libraries.messaging.lighter.model.ConversationId):bdar
      bbwq.a(bcoh, bctr, int):bqgg
      bbwq.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, java.lang.String):void
      bbwq.a(bcoh, java.lang.String, bcsp):void
      bbpk.a(bcoh, int, int):bdar
      bbpk.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, int):bdar
      bbpk.a(bcoh, java.lang.String, com.google.android.libraries.messaging.lighter.model.ConversationId):bdar
      bbpk.a(bcoh, bctr, int):bqgg
      bbpk.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, java.lang.String):void
      bbwq.a(bcoh, bctr, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo56317a(bcoh bcoh, bctr bctr) {
        return mo56469a(bcoh, bctr, true);
    }

    /* renamed from: a */
    public final bqgg mo56318a(bcoh bcoh, bctr bctr, int i) {
        bqgy c = bqgy.m112818c();
        this.f103600B.execute(new bbuh(this, bctr, bcoh, c, i));
        return bqdx.m112674a(c, new bbui(this, bcoh, bctr, i), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56469a(bcoh bcoh, bctr bctr, boolean z) {
        bqgy c = bqgy.m112818c();
        this.f103600B.execute(new bbup(this, bctr, z, bcoh, c));
        return c;
    }

    /* renamed from: a */
    public final bqgg mo56319a(bcoh bcoh, ConversationId conversationId, bcop bcop, String str, bmxv bmxv) {
        return bqga.m112771a(new bbus(this, bcoh, conversationId, bcop, str, bmxv), this.f103606d);
    }

    /* renamed from: a */
    public final bqgg mo56320a(bcoh bcoh, byte[] bArr) {
        bmxv a = this.f103604b.mo56501a(bcoh, bArr);
        if (a.mo66813a()) {
            return this.f103606d.mo25819b(new bbvg(this, bcoh, a));
        }
        return bqga.m112775a((Object) false);
    }

    /* renamed from: a */
    public final bqgg mo56321a(ConversationId conversationId, bcoh bcoh) {
        bqgg a = bqga.m112771a(new bbvb(this, conversationId, this.f103607e.mo56561a(bcoh).mo56654d(conversationId), bcoh), this.f103606d);
        return bqga.m112783b(a).mo69216a(new bbvc(this, a, bcoh, conversationId), this.f103606d);
    }

    /* renamed from: a */
    public final synchronized void mo56470a() {
        if (!this.f103621s.isEmpty()) {
            Iterator it = this.f103621s.iterator();
            while (it.hasNext()) {
                mo56475d((bcoh) it.next()).mo56432j();
            }
        }
    }

    /* renamed from: a */
    public final void mo56343a(int i) {
        bbxo bbxo = this.f103613k;
        if (bbxo.f103694c != i) {
            bbxo.f103694c = i;
            bbxo.mo56492a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo56471a(long j) {
        bbov.m88299a();
        bcei c = bcej.m88869c();
        c.f104034a = "Resend Delivery Receipts";
        c.mo56735a(bcen.f104044e);
        bcej a = c.mo56734a();
        Iterator it = this.f103601C.iterator();
        while (it.hasNext()) {
            bcoh bcoh = (bcoh) it.next();
            bdal c2 = mo56473c(bcoh);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bbon.m88284a();
            bnhe b = c2.mo56640b(timeUnit.toMicros(System.currentTimeMillis() - j));
            bnrd a2 = b.keySet().iterator();
            while (a2.hasNext()) {
                ConversationId conversationId = (ConversationId) a2.next();
                bqga.m112786c(this.f103604b.mo56502a(bcoh, conversationId, (List) b.get(conversationId), a)).mo69216a(new bbvw(this, bcoh, b, conversationId), this.f103606d);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo56322a(bcoh bcoh) {
        String valueOf = String.valueOf(bcoh.mo57058b().mo57074e().mo60492a());
        bbos.m88289a("LiMsgController", valueOf.length() == 0 ? new String("BindV2 startMessaging() called manually for ") : "BindV2 startMessaging() called manually for ".concat(valueOf));
        mo56474c(bngx.m109356a(bcoh));
    }

    /* renamed from: a */
    public final void mo56323a(bcoh bcoh, ConversationId conversationId, String str) {
        bqga.m112786c(bqdx.m112674a(bbqt.m88418a(bbqt.m88417a(this.f103603a).f103093O, this.f103606d), new bbuq(this, bcoh, conversationId, str), bqfb.INSTANCE)).mo69216a(new bbur(this, bcoh, conversationId), bqfb.INSTANCE);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbwq.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, java.lang.Integer, java.lang.Integer):bdar
     arg types: [bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, int, int]
     candidates:
      bbwq.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, bmxz, bmxz):bdar
      bbwq.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, java.lang.Integer, java.lang.Integer):bdar */
    /* renamed from: a */
    public final void mo56472a(bcoh bcoh, String str, bcsp bcsp) {
        mo56311a(bcoh, bcsp.mo57317a(), (Integer) 1, (Integer) 0).mo57830c(new bbve(this, bcoh, str));
    }

    /* renamed from: a */
    public final void mo56324a(bcoh bcoh, List list) {
        this.f103606d.mo25812a(new bbux(this, bcoh, list));
    }

    /* renamed from: a */
    public final void mo56325a(bcoh bcoh, bctr... bctrArr) {
        this.f103606d.execute(new bbvp(this, bcoh, bctrArr));
    }

    /* renamed from: a */
    public final synchronized void mo56326a(List list) {
        boolean isEmpty = this.f103601C.isEmpty();
        this.f103601C.addAll(list);
        if (isEmpty) {
            this.f103616n.post(this.f103626x);
        }
    }
}
