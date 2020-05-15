package p000;

import android.content.SyncResult;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: anbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anbh implements anaz {

    /* renamed from: B */
    public static final /* synthetic */ int f76538B = 0;

    /* renamed from: A */
    public int f76539A;

    /* renamed from: C */
    private final List f76540C;

    /* renamed from: a */
    public final SyncResult f76541a;

    /* renamed from: b */
    public final Map f76542b;

    /* renamed from: c */
    public final Map f76543c;

    /* renamed from: d */
    public final Map f76544d;

    /* renamed from: e */
    public final List f76545e;

    /* renamed from: f */
    public final List f76546f;

    /* renamed from: g */
    public boolean f76547g;

    /* renamed from: h */
    public boolean f76548h;

    /* renamed from: i */
    public boolean f76549i;

    /* renamed from: j */
    public int f76550j;

    /* renamed from: k */
    public int f76551k;

    /* renamed from: l */
    public final long f76552l;

    /* renamed from: m */
    public int f76553m;

    /* renamed from: n */
    public int f76554n;

    /* renamed from: o */
    public int f76555o;

    /* renamed from: p */
    public long f76556p;

    /* renamed from: q */
    public String f76557q;

    /* renamed from: r */
    public anbg f76558r;

    /* renamed from: s */
    public boolean f76559s;

    /* renamed from: t */
    public boolean f76560t;

    /* renamed from: u */
    public amnd f76561u;

    /* renamed from: v */
    public boolean f76562v;

    /* renamed from: w */
    public bmxv f76563w;

    /* renamed from: x */
    public bmxv f76564x;

    /* renamed from: y */
    public bmxv f76565y;

    /* renamed from: z */
    public final Map f76566z;

    public anbh() {
        this.f76542b = new HashMap();
        this.f76543c = new HashMap();
        this.f76544d = new HashMap();
        this.f76545e = new ArrayList();
        this.f76546f = new ArrayList();
        this.f76540C = new ArrayList();
        this.f76547g = false;
        this.f76548h = false;
        this.f76549i = false;
        int i = amko.f75073a;
        this.f76539A = 1;
        this.f76550j = 0;
        this.f76551k = 0;
        this.f76552l = SystemClock.elapsedRealtime();
        this.f76554n = 0;
        this.f76555o = 0;
        this.f76556p = 0;
        this.f76557q = null;
        this.f76559s = false;
        this.f76560t = false;
        this.f76561u = null;
        this.f76562v = false;
        this.f76563w = bmvz.f131120a;
        this.f76564x = bmvz.f131120a;
        this.f76565y = bmvz.f131120a;
        this.f76566z = new HashMap();
        this.f76541a = new SyncResult();
    }

    /* renamed from: a */
    public final long mo41629a() {
        return this.f76541a.stats.numIoExceptions + this.f76541a.stats.numParseExceptions + this.f76541a.stats.numAuthExceptions;
    }

    /* renamed from: b */
    public final void mo41639b() {
        this.f76554n++;
    }

    /* renamed from: c */
    public final void mo41640c() {
        this.f76560t = true;
    }

    /* renamed from: d */
    public final amlb[] mo41641d() {
        List list = this.f76540C;
        return (amlb[]) list.toArray(new amlb[list.size()]);
    }

    /* renamed from: a */
    public final bmxv mo41630a(amjf amjf, amkb amkb, amjd amjd) {
        amnl amnl = (amnl) this.f76543c.get(new anbe(amjf, amkb, amjd));
        return amnl != null ? bmxv.m108566b(Integer.valueOf(amnl.f75508c)) : bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo41631a(amjf amjf, amkb amkb, amjd amjd, int i) {
        if (i >= 0) {
            bxvd da = amnl.f75504f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amnl amnl = (amnl) da.f164949b;
            amnl.f75507b = amjf.f74994h;
            int i2 = amnl.f75506a | 1;
            amnl.f75506a = i2;
            amnl.f75509d = amkb.f75052f;
            int i3 = i2 | 4;
            amnl.f75506a = i3;
            amnl.f75510e = amjd.f74984d;
            int i4 = i3 | 8;
            amnl.f75506a = i4;
            amnl.f75506a = i4 | 2;
            amnl.f75508c = i;
            this.f76543c.put(new anbe(amjf, amkb, amjd), (amnl) da.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo41632a(amjf amjf, ammz ammz, String str, Exception exc) {
        String str2;
        String str3 = "UNKNOWN_";
        if (amjf == amjf.CONTACT) {
            str2 = "CONTACT_";
        } else {
            str2 = amjf != amjf.GROUP ? amjf == amjf.PHOTO ? "PHOTO_" : str3 : "GROUP_";
        }
        if (ammz == ammz.INSERT) {
            str3 = "INSERT_";
        } else if (ammz == ammz.UPDATE) {
            str3 = "UPDATE_";
        } else if (ammz == ammz.REMOVE) {
            str3 = "DELETE_";
        }
        this.f76558r = new anbg(TextUtils.concat(str2, str3, str).toString(), exc);
    }

    /* renamed from: a */
    public final void mo41633a(amlb amlb) {
        this.f76540C.add(amlb);
    }

    /* renamed from: a */
    public final void mo41634a(ammw ammw) {
        this.f76563w = bmxv.m108566b(ammw);
    }

    /* renamed from: a */
    public final void mo41635a(ammz ammz, amjf amjf, anay anay, int i) {
        anbd anbd = new anbd(ammz, amjf, true);
        if (!this.f76544d.containsKey(anbd)) {
            this.f76544d.put(anbd, new HashMap());
        }
        Map map = (Map) this.f76544d.get(anbd);
        if (!map.containsKey(anay)) {
            bxvd da = amnb.f75414g.mo74144da();
            int b = anay.mo41621b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amnb amnb = (amnb) da.f164949b;
            int i2 = b - 1;
            if (b != 0) {
                amnb.f75417b = i2;
                amnb.f75416a |= 1;
                amjx a = anay.mo41620a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amnb amnb2 = (amnb) da.f164949b;
                amnb2.f75420e = a.f75042x;
                amnb2.f75416a |= 8;
                int c = anay.mo41622c();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amnb amnb3 = (amnb) da.f164949b;
                int i3 = c - 1;
                if (c != 0) {
                    amnb3.f75421f = i3;
                    amnb3.f75416a |= 16;
                    map.put(anay, da);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        bxvd bxvd = (bxvd) map.get(anay);
        if (i == 1) {
            int i4 = ((amnb) bxvd.f164949b).f75418c + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amnb amnb4 = (amnb) bxvd.f164949b;
            amnb amnb5 = amnb.f75414g;
            amnb4.f75416a |= 2;
            amnb4.f75418c = i4;
            return;
        }
        int i5 = ((amnb) bxvd.f164949b).f75419d + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        amnb amnb6 = (amnb) bxvd.f164949b;
        amnb amnb7 = amnb.f75414g;
        amnb6.f75416a |= 4;
        amnb6.f75419d = i5;
    }

    public anbh(SyncResult syncResult) {
        this.f76542b = new HashMap();
        this.f76543c = new HashMap();
        this.f76544d = new HashMap();
        this.f76545e = new ArrayList();
        this.f76546f = new ArrayList();
        this.f76540C = new ArrayList();
        this.f76547g = false;
        this.f76548h = false;
        this.f76549i = false;
        this.f76539A = 1;
        this.f76550j = 0;
        this.f76551k = 0;
        this.f76552l = SystemClock.elapsedRealtime();
        this.f76554n = 0;
        this.f76555o = 0;
        this.f76556p = 0;
        this.f76557q = null;
        this.f76559s = false;
        this.f76560t = false;
        this.f76561u = null;
        this.f76562v = false;
        this.f76563w = bmvz.f131120a;
        this.f76564x = bmvz.f131120a;
        this.f76565y = bmvz.f131120a;
        this.f76566z = new HashMap();
        this.f76541a = syncResult;
    }

    /* renamed from: a */
    public final void mo41636a(ammz ammz, amjf amjf, boolean z, int i, int i2) {
        bxvd bxvd;
        if (i2 > 0) {
            anbd anbd = new anbd(ammz, amjf, z);
            if (this.f76542b.containsKey(anbd)) {
                amnc amnc = (amnc) this.f76542b.get(anbd);
                bxvd = (bxvd) amnc.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) amnc);
            } else {
                bxvd da = amnc.f75422l.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amnc amnc2 = (amnc) da.f164949b;
                amnc2.f75425b = ammz.f75412e;
                int i3 = amnc2.f75424a | 1;
                amnc2.f75424a = i3;
                amnc2.f75426c = amjf.f74994h;
                int i4 = i3 | 2;
                amnc2.f75424a = i4;
                amnc2.f75424a = i4 | 4;
                amnc2.f75427d = z;
                bxvd = da;
            }
            if (i == 1) {
                int i5 = ((amnc) bxvd.f164949b).f75428e + i2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                amnc amnc3 = (amnc) bxvd.f164949b;
                amnc amnc4 = amnc.f75422l;
                amnc3.f75424a = 8 | amnc3.f75424a;
                amnc3.f75428e = i5;
            } else if (i == 2) {
                int i6 = ((amnc) bxvd.f164949b).f75429f + i2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                amnc amnc5 = (amnc) bxvd.f164949b;
                amnc amnc6 = amnc.f75422l;
                amnc5.f75424a |= 16;
                amnc5.f75429f = i6;
            } else if (i == 3) {
                int i7 = ((amnc) bxvd.f164949b).f75430g + i2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                amnc amnc7 = (amnc) bxvd.f164949b;
                amnc amnc8 = amnc.f75422l;
                amnc7.f75424a |= 32;
                amnc7.f75430g = i7;
            } else if (i == 4) {
                int i8 = ((amnc) bxvd.f164949b).f75431h + i2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                amnc amnc9 = (amnc) bxvd.f164949b;
                amnc amnc10 = amnc.f75422l;
                amnc9.f75424a |= 64;
                amnc9.f75431h = i8;
            } else if (i == 7) {
                int i9 = ((amnc) bxvd.f164949b).f75433j + i2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                amnc amnc11 = (amnc) bxvd.f164949b;
                amnc amnc12 = amnc.f75422l;
                amnc11.f75424a |= 512;
                amnc11.f75433j = i9;
            } else if (i == 8) {
                int i10 = ((amnc) bxvd.f164949b).f75434k + i2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                amnc amnc13 = (amnc) bxvd.f164949b;
                amnc amnc14 = amnc.f75422l;
                amnc13.f75424a |= 1024;
                amnc13.f75434k = i10;
            }
            this.f76542b.put(anbd, (amnc) bxvd.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo41637a(amni amni) {
        this.f76545e.add(amni);
    }

    /* renamed from: a */
    public final void mo41638a(amnj amnj) {
        this.f76546f.add(amnj);
    }
}
