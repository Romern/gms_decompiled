package p000;

import android.content.Context;
import android.os.Build;
import android.os.DropBoxManager;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: aqfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqfv {

    /* renamed from: d */
    public static final int f86007d = 2;

    /* renamed from: e */
    public static final int f86008e = 3;

    /* renamed from: a */
    public aqap f86009a = ((aqap) aqaq.f85424P.mo74144da());

    /* renamed from: b */
    public final aqfa f86010b;

    /* renamed from: c */
    public final aqef f86011c;

    /* renamed from: f */
    private aqaq f86012f = null;

    /* renamed from: g */
    private final List f86013g;

    /* renamed from: h */
    private final Map f86014h = new HashMap();

    /* renamed from: i */
    private final Context f86015i;

    static {
        aqfv.class.getCanonicalName();
    }

    public aqfv(Context context, aqfa aqfa, aqef aqef) {
        DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
        this.f86010b = aqfa;
        this.f86015i = context;
        this.f86011c = aqef;
        this.f86013g = new ArrayList();
    }

    /* renamed from: a */
    public static apzg m71533a(aqed aqed, boolean z) {
        int length;
        if (aqed == null) {
            return null;
        }
        bxvd da = apzg.f85233l.mo74144da();
        boolean z2 = aqed.f85850d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        apzg apzg = (apzg) da.f164949b;
        apzg.f85235a |= 2;
        apzg.f85237c = z2;
        byte[] bArr = aqed.f85848b;
        if (bArr != null) {
            bxtx a = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            apzg apzg2 = (apzg) da.f164949b;
            a.getClass();
            apzg2.f85235a |= 4;
            apzg2.f85238d = a;
        }
        String str = aqed.f85847a;
        if (str != null) {
            apzg apzg3 = (apzg) da.f164949b;
            str.getClass();
            apzg3.f85235a |= 1;
            apzg3.f85236b = str;
        }
        byte[][] bArr2 = aqed.f85849c;
        if (!(bArr2 == null || (length = bArr2.length) == 0)) {
            for (int i = 0; i < length; i++) {
                byte[] bArr3 = aqed.f85849c[i];
                if (bArr3 != null) {
                    bxtx a2 = bxtx.m123261a(bArr3);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    apzg apzg4 = (apzg) da.f164949b;
                    a2.getClass();
                    if (!apzg4.f85239e.mo73666a()) {
                        apzg4.f85239e = bxvk.m124021a(apzg4.f85239e);
                    }
                    apzg4.f85239e.add(a2);
                }
            }
        }
        if (aqed.f85856j) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            apzg apzg5 = (apzg) da.f164949b;
            apzg5.f85235a |= 32;
            apzg5.f85245k = true;
        }
        int i2 = aqed.f85851e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        apzg apzg6 = (apzg) da.f164949b;
        int i3 = apzg6.f85235a | 8;
        apzg6.f85235a = i3;
        apzg6.f85240f = i2;
        int i4 = aqed.f85855i;
        apzg6.f85235a = i3 | 16;
        apzg6.f85244j = i4;
        if (z) {
            List list = aqed.f85852f;
            if (list != null && list.size() > 0) {
                for (int i5 = 0; i5 < aqed.f85852f.size(); i5++) {
                    String str2 = (String) aqed.f85852f.get(i5);
                    if (str2 != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apzg apzg7 = (apzg) da.f164949b;
                        str2.getClass();
                        if (!apzg7.f85241g.mo73666a()) {
                            apzg7.f85241g = bxvk.m124021a(apzg7.f85241g);
                        }
                        apzg7.f85241g.add(str2);
                    }
                }
            }
            String[] strArr = aqed.f85853g;
            if (strArr != null && (r1 = strArr.length) > 0) {
                for (String str3 : strArr) {
                    if (str3 != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apzg apzg8 = (apzg) da.f164949b;
                        str3.getClass();
                        if (!apzg8.f85242h.mo73666a()) {
                            apzg8.f85242h = bxvk.m124021a(apzg8.f85242h);
                        }
                        apzg8.f85242h.add(str3);
                    }
                }
            }
            List list2 = aqed.f85854h;
            if (list2 != null && list2.size() > 0) {
                List list3 = aqed.f85854h;
                int size = list3.size();
                for (int i6 = 0; i6 < size; i6++) {
                    aqee aqee = (aqee) list3.get(i6);
                    bxvd da2 = aqah.f85378f.mo74144da();
                    String str4 = aqee.f85857a;
                    if (str4 != null) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        aqah aqah = (aqah) da2.f164949b;
                        str4.getClass();
                        aqah.f85380a |= 1;
                        aqah.f85381b = str4;
                    }
                    boolean z3 = aqee.f85858b;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    aqah aqah2 = (aqah) da2.f164949b;
                    int i7 = aqah2.f85380a | 2;
                    aqah2.f85380a = i7;
                    aqah2.f85382c = z3;
                    boolean z4 = aqee.f85859c;
                    int i8 = i7 | 4;
                    aqah2.f85380a = i8;
                    aqah2.f85383d = z4;
                    String str5 = aqee.f85860d;
                    if (str5 != null) {
                        str5.getClass();
                        aqah2.f85380a = i8 | 8;
                        aqah2.f85384e = str5;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    apzg apzg9 = (apzg) da.f164949b;
                    aqah aqah3 = (aqah) da2.mo74062i();
                    aqah3.getClass();
                    if (!apzg9.f85243i.mo73666a()) {
                        apzg9.f85243i = bxvk.m124021a(apzg9.f85243i);
                    }
                    apzg9.f85243i.add(aqah3);
                }
            }
        }
        return (apzg) da.mo74062i();
    }

    /* renamed from: a */
    public final bxvd mo47842a(bxtx bxtx) {
        if (this.f86014h.containsKey(bxtx)) {
            return (bxvd) this.f86014h.get(bxtx);
        }
        bxvd da = apze.f85221e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        apze apze = (apze) da.f164949b;
        bxtx.getClass();
        apze.f85223a |= 1;
        apze.f85224b = bxtx;
        this.f86014h.put(bxtx, da);
        return da;
    }

    /* renamed from: a */
    public final void mo47843a() {
        if (this.f86012f != null) {
            throw new IllegalStateException("Message already finalized");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47844a(long j) {
        int i;
        mo47843a();
        aqap aqap = this.f86009a;
        if (aqap.f164950c) {
            aqap.mo74035c();
            aqap.f164950c = false;
        }
        aqaq aqaq = (aqaq) aqap.f164949b;
        aqaq aqaq2 = aqaq.f85424P;
        aqaq.f85441a |= 1;
        aqaq.f85443c = 20000000;
        String a = this.f86010b.f85935b.mo47806a("shared_uuid");
        if (a != null) {
            aqap aqap2 = this.f86009a;
            if (aqap2.f164950c) {
                aqap2.mo74035c();
                aqap2.f164950c = false;
            }
            aqaq aqaq3 = (aqaq) aqap2.f164949b;
            a.getClass();
            aqaq3.f85441a |= 4;
            aqaq3.f85445e = a;
        }
        String a2 = this.f86010b.f85935b.mo47806a("uuid");
        if (TextUtils.isEmpty(a2)) {
            aqap aqap3 = this.f86009a;
            String uuid = UUID.randomUUID().toString();
            if (aqap3.f164950c) {
                aqap3.mo74035c();
                aqap3.f164950c = false;
            }
            aqaq aqaq4 = (aqaq) aqap3.f164949b;
            uuid.getClass();
            aqaq4.f85441a |= 8;
            aqaq4.f85446f = uuid;
            aqap aqap4 = this.f86009a;
            if (aqap4.f164950c) {
                aqap4.mo74035c();
                aqap4.f164950c = false;
            }
            aqaq aqaq5 = (aqaq) aqap4.f164949b;
            aqaq5.f85441a |= 2;
            aqaq5.f85444d = false;
        } else {
            aqap aqap5 = this.f86009a;
            if (aqap5.f164950c) {
                aqap5.mo74035c();
                aqap5.f164950c = false;
            }
            aqaq aqaq6 = (aqaq) aqap5.f164949b;
            a2.getClass();
            aqaq6.f85441a |= 8;
            aqaq6.f85446f = a2;
            aqap aqap6 = this.f86009a;
            if (aqap6.f164950c) {
                aqap6.mo74035c();
                aqap6.f164950c = false;
            }
            aqaq aqaq7 = (aqaq) aqap6.f164949b;
            aqaq7.f85441a |= 2;
            aqaq7.f85444d = true;
        }
        String d = this.f86010b.mo47812d();
        if (!TextUtils.isEmpty(d)) {
            aqap aqap7 = this.f86009a;
            if (aqap7.f164950c) {
                aqap7.mo74035c();
                aqap7.f164950c = false;
            }
            aqaq aqaq8 = (aqaq) aqap7.f164949b;
            d.getClass();
            aqaq8.f85441a |= 32;
            aqaq8.f85448h = d;
        }
        aqap aqap8 = this.f86009a;
        boolean b = this.f86010b.f85935b.mo47807b("is_sidewinder_device");
        if (aqap8.f164950c) {
            aqap8.mo74035c();
            aqap8.f164950c = false;
        }
        aqaq aqaq9 = (aqaq) aqap8.f164949b;
        aqaq9.f85441a |= 1024;
        aqaq9.f85453m = b;
        String str = Build.FINGERPRINT;
        mo47843a();
        if (str != null) {
            aqap aqap9 = this.f86009a;
            if (aqap9.f164950c) {
                aqap9.mo74035c();
                aqap9.f164950c = false;
            }
            aqaq aqaq10 = (aqaq) aqap9.f164949b;
            str.getClass();
            aqaq10.f85441a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aqaq10.f85451k = str;
        }
        mo47843a();
        aqed a3 = this.f86011c.mo47769a("android");
        if (a3 != null) {
            aqap aqap10 = this.f86009a;
            apzg a4 = m71533a(a3, false);
            if (aqap10.f164950c) {
                aqap10.mo74035c();
                aqap10.f164950c = false;
            }
            aqaq aqaq11 = (aqaq) aqap10.f164949b;
            a4.getClass();
            aqaq11.f85452l = a4;
            aqaq11.f85441a |= 512;
        }
        mo47843a();
        bxvd da = aqai.f85385e.mo74144da();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = (((aqai) da.f164949b).f85390d + currentTimeMillis) - j;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aqai aqai = (aqai) da.f164949b;
        aqai.f85387a |= 4;
        aqai.f85390d = j2;
        aqez aqez = this.f86010b.f85935b;
        long j3 = aqez.f85933a.getLong("snet_wake_interval_ms");
        if (j3 == 0) {
            j3 = aqez.f85933a.getLong("wake_interval_ms");
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aqai aqai2 = (aqai) da.f164949b;
        aqai2.f85387a |= 1;
        aqai2.f85388b = j3;
        aqfw aqfw = new aqfw(this.f86015i);
        long b2 = aqfw.mo47854b();
        if (b2 == -1) {
            aqfw.mo47855b(currentTimeMillis);
            aqap aqap11 = this.f86009a;
            if (aqap11.f164950c) {
                aqap11.mo74035c();
                aqap11.f164950c = false;
            }
            aqaq aqaq12 = (aqaq) aqap11.f164949b;
            aqai aqai3 = (aqai) da.mo74062i();
            aqai3.getClass();
            aqaq12.f85449i = aqai3;
            aqaq12.f85441a |= 64;
        } else {
            long j4 = currentTimeMillis - b2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aqai aqai4 = (aqai) da.f164949b;
            aqai4.f85387a |= 2;
            aqai4.f85389c = j4;
            aqfw.mo47855b(currentTimeMillis);
            aqap aqap12 = this.f86009a;
            if (aqap12.f164950c) {
                aqap12.mo74035c();
                aqap12.f164950c = false;
            }
            aqaq aqaq13 = (aqaq) aqap12.f164949b;
            aqai aqai5 = (aqai) da.mo74062i();
            aqai5.getClass();
            aqaq13.f85449i = aqai5;
            aqaq13.f85441a |= 64;
        }
        mo47843a();
        int i2 = Build.VERSION.SDK_INT;
        try {
            i = aqfy.m71562b();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            mo47846a((Throwable) new RuntimeException("Unable to get user id", e));
            i = -1;
        }
        if (i == 0) {
            aqap aqap13 = this.f86009a;
            if (aqap13.f164950c) {
                aqap13.mo74035c();
                aqap13.f164950c = false;
            }
            aqaq aqaq14 = (aqaq) aqap13.f164949b;
            aqaq14.f85439N = 1;
            aqaq14.f85442b |= 1024;
        } else if (i == -1) {
            aqap aqap14 = this.f86009a;
            if (aqap14.f164950c) {
                aqap14.mo74035c();
                aqap14.f164950c = false;
            }
            aqaq aqaq15 = (aqaq) aqap14.f164949b;
            aqaq15.f85439N = 0;
            aqaq15.f85442b |= 1024;
        } else {
            aqap aqap15 = this.f86009a;
            if (aqap15.f164950c) {
                aqap15.mo74035c();
                aqap15.f164950c = false;
            }
            aqaq aqaq16 = (aqaq) aqap15.f164949b;
            aqaq16.f85439N = 2;
            aqaq16.f85442b |= 1024;
        }
        if (cgkt.f187180a.mo6606a().mo84000C() && cgkt.f187180a.mo6606a().mo84050y()) {
            aqap aqap16 = this.f86009a;
            if (aqap16.f164950c) {
                aqap16.mo74035c();
                aqap16.f164950c = false;
            }
            aqaq aqaq17 = (aqaq) aqap16.f164949b;
            aqaq17.f85442b |= 2048;
            aqaq17.f85440O = true;
        }
        aqap aqap17 = this.f86009a;
        List list = this.f86013g;
        if (aqap17.f164950c) {
            aqap17.mo74035c();
            aqap17.f164950c = false;
        }
        aqaq aqaq18 = (aqaq) aqap17.f164949b;
        if (!aqaq18.f85447g.mo73666a()) {
            aqaq18.f85447g = bxvk.m124021a(aqaq18.f85447g);
        }
        bxsy.m123078a(list, aqaq18.f85447g);
        for (bxvd bxvd : this.f86014h.values()) {
            aqap aqap18 = this.f86009a;
            if (aqap18.f164950c) {
                aqap18.mo74035c();
                aqap18.f164950c = false;
            }
            aqaq aqaq19 = (aqaq) aqap18.f164949b;
            apze apze = (apze) bxvd.mo74062i();
            apze.getClass();
            if (!aqaq19.f85428C.mo73666a()) {
                aqaq19.f85428C = bxvk.m124021a(aqaq19.f85428C);
            }
            aqaq19.f85428C.add(apze);
        }
        this.f86012f = (aqaq) this.f86009a.mo74062i();
        if (this.f86010b.f85935b.mo47807b("clearcut_idle_logging_enabled")) {
            qws a5 = qws.m33019a(this.f86015i, "ANDROID_SNET_IDLE");
            byte[] k = this.f86012f.mo73642k();
            if (cgkt.m145941m()) {
                int length = k.length;
                if (length <= 4096) {
                    a5.mo24337a(cagz.UNMETERED_OR_DAILY);
                } else if (length <= 102400) {
                    a5.mo24337a(cagz.UNMETERED_ONLY);
                }
            }
            a5.mo24335a(k).mo24327b();
        }
        cgkr.m145927c();
        this.f86009a = (aqap) aqaq.f85424P.mo74144da();
        this.f86012f = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47845a(Exception exc) {
        mo47843a();
        StringWriter stringWriter = new StringWriter();
        bqye.m113760a(exc, new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        aqez aqez = this.f86010b.f85935b;
        int i = aqez.f85933a.getInt("snet_max_exception_string_size");
        if (i == 0) {
            i = aqez.f85933a.getInt("max_exception_string_size");
        }
        this.f86013g.add(stringWriter2.substring(0, Math.min(i, stringWriter2.length())));
    }

    /* renamed from: a */
    public final void mo47846a(Throwable th) {
        mo47843a();
        this.f86013g.add(th.toString());
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, java.util.Collection], assign insn: 0x0027: IGET  (r8v0 ? I:java.util.Collection) = (r3v1 aqep) aqep.b java.util.Collection */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47847a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aqep aqep = (aqep) list.get(i);
            if (!(aqep.f85892a == null || aqep.f85893b == null)) {
                bxvd da = apzl.f85267c.mo74144da();
                List list2 = aqep.f85892a;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    apzg a = m71533a((aqed) list2.get(i2), false);
                    if (a != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apzl apzl = (apzl) da.f164949b;
                        a.getClass();
                        if (!apzl.f85269a.mo73666a()) {
                            apzl.f85269a = bxvk.m124021a(apzl.f85269a);
                        }
                        apzl.f85269a.add(a);
                    }
                }
                ? r8 = aqep.f85893b;
                int size3 = r8.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    aqej aqej = (aqej) r8.get(i3);
                    if (aqej.mo47771a() != null) {
                        bxvd da2 = apzk.f85262d.mo74144da();
                        String a2 = aqej.mo47771a();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        apzk apzk = (apzk) da2.f164949b;
                        a2.getClass();
                        apzk.f85264a |= 1;
                        apzk.f85265b = a2;
                        int b = aqej.mo47772b();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        apzk apzk2 = (apzk) da2.f164949b;
                        apzk2.f85264a |= 2;
                        apzk2.f85266c = b;
                        apzk apzk3 = (apzk) da2.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apzl apzl2 = (apzl) da.f164949b;
                        apzk3.getClass();
                        if (!apzl2.f85270b.mo73666a()) {
                            apzl2.f85270b = bxvk.m124021a(apzl2.f85270b);
                        }
                        apzl2.f85270b.add(apzk3);
                    }
                }
                if (((apzl) da.f164949b).f85269a.size() > 0 && ((apzl) da.f164949b).f85270b.size() > 0) {
                    aqap aqap = this.f86009a;
                    apzl apzl3 = (apzl) da.mo74062i();
                    if (aqap.f164950c) {
                        aqap.mo74035c();
                        aqap.f164950c = false;
                    }
                    aqaq aqaq = (aqaq) aqap.f164949b;
                    aqaq aqaq2 = aqaq.f85424P;
                    apzl3.getClass();
                    if (!aqaq.f85433H.mo73666a()) {
                        aqaq.f85433H = bxvk.m124021a(aqaq.f85433H);
                    }
                    aqaq.f85433H.add(apzl3);
                }
            }
        }
    }
}
