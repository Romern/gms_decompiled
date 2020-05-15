package p000;

import android.accounts.Account;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.Closeable;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: bapk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bapk implements Closeable {

    /* renamed from: a */
    public final baqc f101485a;

    /* renamed from: b */
    public final baqk f101486b;

    /* renamed from: c */
    public final bygz f101487c;

    /* renamed from: d */
    public final Account f101488d;

    /* renamed from: e */
    public final bygv f101489e;

    /* renamed from: f */
    public baqa f101490f;

    /* renamed from: g */
    public baqa f101491g;

    /* renamed from: h */
    public boolean f101492h;

    /* renamed from: i */
    public boolean f101493i;

    /* renamed from: j */
    public boolean f101494j;

    /* renamed from: k */
    final /* synthetic */ bapl f101495k;

    /* renamed from: l */
    public int f101496l;

    /* renamed from: m */
    private final String f101497m;

    /* renamed from: n */
    private long f101498n;

    public bapk(bapl bapl, baqc baqc, baqk baqk, bygv bygv, bygz bygz, Account account, long j) {
        this.f101495k = bapl;
        this.f101485a = baqc;
        this.f101486b = baqk;
        this.f101489e = bygv;
        this.f101487c = bygz;
        this.f101497m = ((babq) bapl.f101502d.get(bygy.m124802a(bygz.f166412a))).mo55563a(bygz);
        this.f101488d = account;
        Long a = baqc.mo55846a();
        if (a == null || a.longValue() != j) {
            baqv baqv = this.f101495k.f101513o;
            long elapsedRealtime = (SystemClock.elapsedRealtime() - Math.max(this.f101495k.f101512n.mo32686h() * 1000, this.f101495k.f101512n.mo32689k() * 1000)) - 1;
            this.f101498n = elapsedRealtime;
            baqc.mo55848a(j, elapsedRealtime);
        } else {
            this.f101498n = baqc.mo55854d().longValue();
        }
        this.f101490f = baqc.mo55851b();
        this.f101491g = baqc.mo55852c();
        this.f101496l = 1;
    }

    /* renamed from: a */
    public static final long m87322a(byjk byjk) {
        bxun bxun = byjk.f166667d;
        if (bxun == null) {
            bxun = bxun.f164861c;
        }
        long j = bxun.f164863a * 1000;
        bxun bxun2 = byjk.f166667d;
        if (bxun2 == null) {
            bxun2 = bxun.f164861c;
        }
        return j + (((long) bxun2.f164864b) / 1000000);
    }

    /* renamed from: b */
    public static final int m87325b(byjk byjk) {
        return !byjk.f166666c ? 1 : 2;
    }

    /* renamed from: a */
    public final boolean mo55866a(long j, long j2) {
        return this.f101496l != 1 || j - this.f101498n <= j2;
    }

    public final void close() {
        this.f101485a.close();
    }

    /* renamed from: b */
    public final void mo55867b() {
        if (this.f101496l != 4) {
            baqa baqa = this.f101490f;
            bapz d = baqa.mo55841d();
            d.mo55882a(baqa.mo55838a() + 1);
            baqa a = d.mo55881a();
            this.f101490f = a;
            try {
                this.f101485a.mo55850a(a);
            } catch (banv e) {
                ((achw) this.f101495k.f101499a.mo16713a()).mo25418e("Storing channel state failed", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static final bqaq m87323a(baqd baqd) {
        int i = baqd.f101553a;
        if (i == 2) {
            return bqaq.UNKNOWN_HOST;
        }
        if (i == 1) {
            return bqaq.UNSUPPORTED_PROTOCOL;
        }
        if (i == 3) {
            return bqaq.PENDING_LOCAL_CHANGES;
        }
        if (i == 4) {
            return bqaq.CONNECT_EXCEPTION;
        }
        if (i == 5) {
            return bqaq.UNAUTHENTICATED;
        }
        if (i == 6) {
            return bqaq.UNAVAILABLE;
        }
        if (i == 7) {
            return bqaq.DEADLINE_EXCEEDED;
        }
        return bqaq.UNDEFINED;
    }

    /* renamed from: a */
    public static final bygq m87324a(bygv bygv, String str) {
        String str2;
        bxwc bxwc = bygv.f166393d;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            bygq bygq = (bygq) bxwc.get(i);
            if (bygq.f166369a == 1) {
                str2 = (String) bygq.f166370b;
            } else {
                str2 = "";
            }
            i++;
            if (str2.equals(str)) {
                return bygq;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append("Configuration for app ");
        sb.append(str);
        sb.append(" is missing");
        throw new banv(sb.toString());
    }

    /* renamed from: a */
    public final baog mo55858a(String str) {
        try {
            return this.f101495k.f101501c.mo55832b(str, this.f101488d, this.f101487c);
        } catch (baoh e) {
            throw new banv("Write callback failure", e);
        }
    }

    /* renamed from: a */
    public final void mo55859a() {
        mo55863a(babm.m86492a(this.f101488d, this.f101487c));
    }

    /* renamed from: a */
    public final void mo55860a(int i) {
        int i2 = this.f101496l;
        if (i2 != i) {
            int i3 = i2 - 1;
            if (i2 != 0) {
                boolean z = false;
                if (i3 != 0) {
                    if (i3 == 1) {
                        if (i == 1 || i == 3 || i == 4) {
                            z = true;
                        }
                        bmxy.m108588a(z);
                    } else if (i3 != 2) {
                        if (i3 == 3) {
                            bmxy.m108600b(false);
                        }
                    }
                    this.f101496l = i;
                    return;
                }
                if (i == 2) {
                    z = true;
                }
                bmxy.m108588a(z);
                this.f101496l = i;
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo55861a(long j, int i, boolean z) {
        baqv baqv = this.f101495k.f101513o;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!mo55866a(elapsedRealtime, j)) {
            mo55867b();
            if (!this.f101495k.mo55876a(elapsedRealtime, 0)) {
                this.f101495k.mo55871a(elapsedRealtime, i, z);
                achw achw = (achw) this.f101495k.f101499a.mo16713a();
                Object[] objArr = {this.f101488d, this.f101487c};
                return;
            }
            return;
        }
        achw achw2 = (achw) this.f101495k.f101499a.mo16713a();
        Object[] objArr2 = {this.f101488d, this.f101487c};
    }

    /* renamed from: a */
    public final void mo55862a(long j, boolean z, baqa baqa, Long l, boolean z2, boolean z3, bxvd bxvd) {
        boolean z4;
        Long l2;
        baqa baqa2 = baqa;
        bxvd bxvd2 = bxvd;
        baqv baqv = this.f101495k.f101513o;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f101495k.f101512n.mo32682d()) {
            bpxz a = baqz.m87422a(this.f101487c);
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            bpyi bpyi = (bpyi) bxvd2.f164949b;
            bpyi bpyi2 = bpyi.f139852o;
            a.getClass();
            bpyi.f139855b = a;
            bpyi.f139854a |= 1;
        } else {
            String str = this.f101497m;
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            bpyi bpyi3 = (bpyi) bxvd2.f164949b;
            bpyi bpyi4 = bpyi.f139852o;
            str.getClass();
            bpyi3.f139854a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            bpyi3.f139867n = str;
        }
        bpyi bpyi5 = (bpyi) bxvd2.f164949b;
        bpyi5.f139854a |= 8;
        bpyi5.f139858e = (int) (elapsedRealtime - j);
        if (this.f101495k.f101512n.mo32682d()) {
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            bpyi bpyi6 = (bpyi) bxvd2.f164949b;
            bpyi6.f139854a |= 4096;
            bpyi6.f139865l = z;
            if (l != null) {
                l2 = Long.valueOf(j - l.longValue());
            } else {
                l2 = null;
            }
            baqa baqa3 = this.f101491g;
            bnia bnia = new bnia();
            Iterator it = EnumSet.complementOf(EnumSet.of(bqao.UNRECOGNIZED)).iterator();
            while (it.hasNext()) {
                bqao bqao = (bqao) it.next();
                if (baqa2.mo55885a(bqao) != baqa3.mo55885a(bqao)) {
                    bnia.mo67629b(bqao);
                }
            }
            bnic<bqao> a2 = bnia.mo67751a();
            if (l2 != null) {
                long longValue = l2.longValue();
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                bpyi bpyi7 = (bpyi) bxvd2.f164949b;
                bpyi7.f139854a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                bpyi7.f139863j = longValue;
            }
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            bpyi bpyi8 = (bpyi) bxvd2.f164949b;
            if (!bpyi8.f139864k.mo73666a()) {
                bpyi8.f139864k = GeneratedMessageLite.m124019a(bpyi8.f139864k);
            }
            for (bqao bqao2 : a2) {
                bpyi8.f139864k.mo74153d(bqao2.mo3214a());
            }
        }
        if (this.f101495k.f101512n.mo32683e()) {
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            bpyi bpyi9 = (bpyi) bxvd2.f164949b;
            bpyi9.f139854a |= 8192;
            bpyi9.f139866m = z2;
        }
        bqaq a3 = bqaq.m112480a(((bpyi) bxvd2.f164949b).f139856c);
        if (a3 == null) {
            a3 = bqaq.UNDEFINED;
        }
        if (a3 == bqaq.SUCCESS) {
            this.f101491g = baqa2;
            this.f101498n = elapsedRealtime;
            if (this.f101496l != 4) {
                try {
                    this.f101485a.mo55849a(elapsedRealtime, baqa2);
                } catch (banv e) {
                    ((achw) this.f101495k.f101499a.mo16713a()).mo25418e("Storing synced channel state failed", new Object[0]);
                }
            }
            if (z3) {
                this.f101495k.f101505g.mo55913b(this.f101488d, this.f101487c);
            }
        }
        boolean c = baqa.m87369c(this.f101490f, this.f101491g);
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        bpyi bpyi10 = (bpyi) bxvd2.f164949b;
        int i = bpyi10.f139854a | 16;
        bpyi10.f139854a = i;
        bpyi10.f139859f = c;
        int i2 = this.f101496l;
        if (i2 == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        bpyi10.f139854a = i | 32;
        bpyi10.f139860g = z4;
        if (i2 == 3 || i2 == 4) {
            mo55859a();
        } else {
            mo55860a(1);
        }
        ((bads) this.f101495k.f101504f.mo16713a()).mo32749a((bpyi) bxvd.mo74062i());
        ((achw) this.f101495k.f101499a.mo16713a()).logVerbose("Sync complete; result=%s", a3);
    }

    /* renamed from: a */
    public final void mo55863a(babm babm) {
        this.f101495k.f101509k.remove(babm);
        try {
            close();
        } catch (IOException e) {
            ((achw) this.f101495k.f101499a.mo16713a()).mo25418e("Channel close failed", new Object[0]);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [bqao, java.lang.Long]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    public final void mo55864a(bqao bqao) {
        if (this.f101496l != 4) {
            baqa baqa = this.f101490f;
            bapz d = baqa.mo55841d();
            long a = baqa.mo55885a(bqao);
            bnhe bnhe = d.f101550a;
            if (bnhe != null) {
                EnumMap enumMap = new EnumMap(bnhe);
                enumMap.put((Object) bqao, (Object) Long.valueOf(a + 1));
                d.mo55883a(bnmt.m109791a(enumMap));
                baqa a2 = d.mo55881a();
                this.f101490f = a2;
                try {
                    this.f101485a.mo55850a(a2);
                } catch (banv e) {
                    ((achw) this.f101495k.f101499a.mo16713a()).mo25418e("Storing channel state failed", new Object[0]);
                }
            } else {
                throw new IllegalStateException("Property \"triggers\" has not been set");
            }
        }
    }

    /* renamed from: a */
    public final void mo55865a(boolean z, long j, long j2, int i, boolean z2) {
        int i2;
        long j3 = j;
        long j4 = j2;
        baqv baqv = this.f101495k.f101513o;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((!z || mo55866a(elapsedRealtime, j3) || this.f101495k.mo55876a(elapsedRealtime, 0)) && !this.f101495k.mo55875a(elapsedRealtime)) {
            int i3 = i;
            if (!this.f101495k.mo55876a(elapsedRealtime, j4)) {
                bapl bapl = this.f101495k;
                bapl.f101510l = true;
                bapl.f101511m = elapsedRealtime + j4;
                bamc bamc = bapl.f101500b;
                long j5 = j3 / 1000;
                long j6 = j4 / 1000;
                if (!bapl.f101512n.mo32685g()) {
                    i2 = 3;
                } else {
                    i2 = i3;
                }
                bamc.mo32790a(true, j5, j6, i2, z2, false, null);
                achw achw = (achw) this.f101495k.f101499a.mo16713a();
                Object[] objArr = {Long.valueOf(j2), this.f101488d, this.f101487c};
                return;
            }
            achw achw2 = (achw) this.f101495k.f101499a.mo16713a();
            Object[] objArr2 = {this.f101488d, this.f101487c};
            return;
        }
        this.f101495k.mo55871a(elapsedRealtime, i, z2);
        achw achw3 = (achw) this.f101495k.f101499a.mo16713a();
        Object[] objArr3 = {Long.valueOf(j2), this.f101488d, this.f101487c};
    }
}
