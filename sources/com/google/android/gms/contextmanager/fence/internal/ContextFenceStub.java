package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContextFenceStub extends AwarenessFence implements tkp {
    public static final Parcelable.Creator CREATOR = new tkl();

    /* renamed from: a */
    private bxcm f30628a;

    /* renamed from: b */
    private byte[] f30629b;

    /* renamed from: c */
    private ArrayList f30630c;

    /* renamed from: d */
    private tli f30631d;

    /* renamed from: e */
    private tli f30632e;

    /* renamed from: f */
    private tkw f30633f;

    /* renamed from: g */
    private tlb f30634g;

    /* renamed from: h */
    private tkc f30635h;

    /* renamed from: i */
    private tlf f30636i;

    /* renamed from: j */
    private tlc f30637j;

    /* renamed from: k */
    private tkz f30638k;

    /* renamed from: l */
    private tkd f30639l;

    /* renamed from: m */
    private tkg f30640m;

    /* renamed from: n */
    private tkx f30641n;

    /* renamed from: o */
    private tlj f30642o;

    /* renamed from: p */
    private tky f30643p;

    /* renamed from: q */
    private tld f30644q;

    /* renamed from: r */
    private tkv f30645r;

    /* renamed from: s */
    private tlh f30646s;

    /* renamed from: t */
    private tll f30647t;

    /* renamed from: u */
    private tlg f30648u;

    /* renamed from: v */
    private tlm f30649v;

    public ContextFenceStub(bxcm bxcm) {
        sdo.m34959a(bxcm);
        this.f30628a = bxcm;
        this.f30629b = null;
        m22866j();
    }

    /* renamed from: a */
    public static ContextFenceStub m22862a(tlb tlb) {
        sdo.m34959a(tlb);
        bxcj bxcj = (bxcj) bxcm.f162813z.mo74144da();
        bxcl bxcl = bxcl.PLACE_FENCE;
        if (bxcj.f164950c) {
            bxcj.mo74035c();
            bxcj.f164950c = false;
        }
        bxcm bxcm = (bxcm) bxcj.f164949b;
        bxcm.f162815b = bxcl.f162810z;
        int i = bxcm.f162814a | 1;
        bxcm.f162814a = i;
        bxec bxec = tlb.f46237a;
        bxec.getClass();
        bxcm.f162819f = bxec;
        bxcm.f162814a = i | 8;
        return new ContextFenceStub((bxcm) bxcj.mo74062i());
    }

    /* renamed from: i */
    private final void m22865i() {
        if (this.f30628a == null) {
            try {
                this.f30628a = (bxcm) GeneratedMessageLite.m124016a(bxcm.f162813z, this.f30629b, bxus.m123744c());
                this.f30629b = null;
            } catch (bxwf e) {
                dst.m9254a("ContextFenceStub", "Could not deserialize context fence bytes.", e);
                throw new IllegalStateException(e);
            }
        }
        m22866j();
    }

    /* renamed from: j */
    private final void m22866j() {
        bxcm bxcm = this.f30628a;
        if (bxcm == null && this.f30629b != null) {
            return;
        }
        if (bxcm != null && this.f30629b == null) {
            return;
        }
        if (bxcm != null && this.f30629b != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (bxcm == null && this.f30629b == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* renamed from: b */
    public final void mo18033b(Set set) {
        set.add(Integer.valueOf(mo18036d()));
        int d = mo18036d();
        if (d == 1 || d == 2 || d == 3 || d == 22) {
            set.add(Integer.valueOf(mo18036d()));
            ArrayList e = mo18037e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                ((ContextFenceStub) e.get(i)).mo18033b(set);
            }
        }
    }

    /* renamed from: c */
    public final bxcm mo18035c() {
        m22865i();
        return this.f30628a;
    }

    /* renamed from: d */
    public final int mo18036d() {
        m22865i();
        bxcm bxcm = this.f30628a;
        if ((bxcm.f162814a & 1) == 0) {
            return 0;
        }
        bxcl a = bxcl.m122571a(bxcm.f162815b);
        if (a == null) {
            a = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        }
        return a.f162810z;
    }

    /* renamed from: e */
    public final ArrayList mo18037e() {
        m22865i();
        if (this.f30630c == null) {
            this.f30630c = new ArrayList(this.f30628a.f162816c.size());
            bxwc bxwc = this.f30628a.f162816c;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                this.f30630c.add(new ContextFenceStub((bxcm) bxwc.get(i)));
            }
        }
        return this.f30630c;
    }

    /* renamed from: f */
    public final tlb mo18038f() {
        m22865i();
        bxcm bxcm = this.f30628a;
        if ((bxcm.f162814a & 8) == 0) {
            return null;
        }
        if (this.f30634g == null) {
            bxec bxec = bxcm.f162819f;
            if (bxec == null) {
                bxec = bxec.f163078i;
            }
            this.f30634g = new tlb(bxec);
        }
        return this.f30634g;
    }

    /* renamed from: g */
    public final boolean mo18039g() {
        int d = mo18036d();
        if (d == 1 || d == 2 || d == 3 || d == 22) {
            ArrayList e = mo18037e();
            int size = e.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                ContextFenceStub contextFenceStub = (ContextFenceStub) e.get(i);
                bxcm bxcm = this.f30628a;
                if ((bxcm.f162814a & 1048576) != 0) {
                    bxeh bxeh = bxcm.f162835w;
                    if (bxeh == null) {
                        bxeh = bxeh.f163098c;
                    }
                    if (bxeh != null) {
                        bxcm bxcm2 = contextFenceStub.f30628a;
                        bxvd bxvd = (bxvd) bxcm2.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) bxcm2);
                        bxcj bxcj = (bxcj) bxvd;
                        if (bxcj.f164950c) {
                            bxcj.mo74035c();
                            bxcj.f164950c = false;
                        }
                        bxcm bxcm3 = (bxcm) bxcj.f164949b;
                        bxvu bxvu = bxcm.f162812v;
                        bxeh.getClass();
                        bxcm3.f162835w = bxeh;
                        bxcm3.f162814a |= 1048576;
                        contextFenceStub.f30628a = (bxcm) bxcj.mo74062i();
                        z = true;
                    } else {
                        bxcm bxcm4 = contextFenceStub.f30628a;
                        bxvd bxvd2 = (bxvd) bxcm4.mo74142c(5);
                        bxvd2.mo73625a((GeneratedMessageLite) bxcm4);
                        bxcj bxcj2 = (bxcj) bxvd2;
                        if (bxcj2.f164950c) {
                            bxcj2.mo74035c();
                            bxcj2.f164950c = false;
                        }
                        bxcm bxcm5 = (bxcm) bxcj2.f164949b;
                        bxvu bxvu2 = bxcm.f162812v;
                        bxcm5.f162835w = null;
                        bxcm5.f162814a &= -1048577;
                        contextFenceStub.f30628a = (bxcm) bxcj2.mo74062i();
                        z = true;
                    }
                }
                z |= contextFenceStub.mo18039g();
            }
            if (z) {
                ArrayList arrayList = new ArrayList(this.f30628a.f162816c.size());
                ArrayList e2 = mo18037e();
                int size2 = e2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList.add(((ContextFenceStub) e2.get(i2)).mo18035c());
                }
                bxcm bxcm6 = this.f30628a;
                bxvd bxvd3 = (bxvd) bxcm6.mo74142c(5);
                bxvd3.mo73625a((GeneratedMessageLite) bxcm6);
                bxcj bxcj3 = (bxcj) bxvd3;
                if (bxcj3.f164950c) {
                    bxcj3.mo74035c();
                    bxcj3.f164950c = false;
                }
                bxvu bxvu3 = bxcm.f162812v;
                ((bxcm) bxcj3.f164949b).f162816c = GeneratedMessageLite.m124030de();
                bxcj3.mo73563a(arrayList);
                this.f30628a = (bxcm) bxcj3.mo74062i();
                this.f30630c = null;
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final tkp mo18040h() {
        switch (mo18036d()) {
            case 1:
            case 2:
            case 3:
            case 22:
                return null;
            case 4:
                m22865i();
                bxcm bxcm = this.f30628a;
                if ((bxcm.f162814a & 2) == 0) {
                    return null;
                }
                if (this.f30631d == null) {
                    bxex bxex = bxcm.f162817d;
                    if (bxex == null) {
                        bxex = bxex.f163147g;
                    }
                    this.f30631d = new tli(bxex);
                }
                return this.f30631d;
            case 5:
                m22865i();
                bxcm bxcm2 = this.f30628a;
                if ((bxcm2.f162814a & 4) == 0) {
                    return null;
                }
                if (this.f30633f == null) {
                    bxdn bxdn = bxcm2.f162818e;
                    if (bxdn == null) {
                        bxdn = bxdn.f163044j;
                    }
                    this.f30633f = new tkw(bxdn);
                }
                return this.f30633f;
            case 6:
                return mo18038f();
            case 7:
                m22865i();
                bxcm bxcm3 = this.f30628a;
                if ((bxcm3.f162814a & 16) == 0) {
                    return null;
                }
                if (this.f30635h == null) {
                    bxbu bxbu = bxcm3.f162820g;
                    if (bxbu == null) {
                        bxbu = bxbu.f162734e;
                    }
                    this.f30635h = new tkc(bxbu);
                }
                return this.f30635h;
            case 8:
                m22865i();
                bxcm bxcm4 = this.f30628a;
                if ((bxcm4.f162814a & 32) == 0) {
                    return null;
                }
                if (this.f30636i == null) {
                    bxen bxen = bxcm4.f162821h;
                    if (bxen == null) {
                        bxen = bxen.f163109e;
                    }
                    this.f30636i = new tlf(bxen);
                }
                return this.f30636i;
            case 9:
                m22865i();
                bxcm bxcm5 = this.f30628a;
                if ((bxcm5.f162814a & 64) == 0) {
                    return null;
                }
                if (this.f30637j == null) {
                    bxeg bxeg = bxcm5.f162822i;
                    if (bxeg == null) {
                        bxeg = bxeg.f163090g;
                    }
                    this.f30637j = new tlc(bxeg);
                }
                return this.f30637j;
            case 10:
                m22865i();
                bxcm bxcm6 = this.f30628a;
                if ((bxcm6.f162814a & 128) == 0) {
                    return null;
                }
                if (this.f30638k == null) {
                    bxdy bxdy = bxcm6.f162823j;
                    if (bxdy == null) {
                        bxdy = bxdy.f163071d;
                    }
                    this.f30638k = new tkz(bxdy);
                }
                return this.f30638k;
            case 11:
                m22865i();
                bxcm bxcm7 = this.f30628a;
                if ((bxcm7.f162814a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    return null;
                }
                if (this.f30639l == null) {
                    bxbx bxbx = bxcm7.f162824k;
                    if (bxbx == null) {
                        bxbx = bxbx.f162741i;
                    }
                    this.f30639l = new tkd(bxbx);
                }
                return this.f30639l;
            case 12:
                m22865i();
                bxcm bxcm8 = this.f30628a;
                if ((bxcm8.f162814a & 512) == 0) {
                    return null;
                }
                if (this.f30640m == null) {
                    bxcb bxcb = bxcm8.f162825l;
                    if (bxcb == null) {
                        bxcb = bxcb.f162759d;
                    }
                    this.f30640m = new tkg(bxcb);
                }
                return this.f30640m;
            case 13:
                m22865i();
                bxcm bxcm9 = this.f30628a;
                if ((bxcm9.f162814a & 1024) == 0) {
                    return null;
                }
                if (this.f30641n == null) {
                    bxds bxds = bxcm9.f162826m;
                    if (bxds == null) {
                        bxds = bxds.f163058h;
                    }
                    this.f30641n = new tkx(bxds);
                }
                return this.f30641n;
            case 14:
            default:
                dst.m9257b("ContextFenceStub", "Unknown fence stub type=%s", Integer.valueOf(mo18036d()));
                return null;
            case 15:
                m22865i();
                bxcm bxcm10 = this.f30628a;
                if ((bxcm10.f162814a & 8192) == 0) {
                    return null;
                }
                if (this.f30642o == null) {
                    bxfa bxfa = bxcm10.f162827n;
                    if (bxfa == null) {
                        bxfa = bxfa.f163156c;
                    }
                    this.f30642o = new tlj(bxfa);
                }
                return this.f30642o;
            case 16:
                m22865i();
                bxcm bxcm11 = this.f30628a;
                if ((bxcm11.f162814a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) == 0) {
                    return null;
                }
                if (this.f30645r == null) {
                    bxcs bxcs = bxcm11.f162828o;
                    if (bxcs == null) {
                        bxcs = bxcs.f162983c;
                    }
                    this.f30645r = new tkv(bxcs);
                }
                return this.f30645r;
            case 17:
                m22865i();
                bxcm bxcm12 = this.f30628a;
                if ((bxcm12.f162814a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) == 0) {
                    return null;
                }
                if (this.f30643p == null) {
                    bxdv bxdv = bxcm12.f162829p;
                    if (bxdv == null) {
                        bxdv = bxdv.f163066b;
                    }
                    this.f30643p = new tky(bxdv);
                }
                return this.f30643p;
            case 18:
                m22865i();
                bxcm bxcm13 = this.f30628a;
                if ((bxcm13.f162814a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == 0) {
                    return null;
                }
                if (this.f30644q == null) {
                    bxek bxek = bxcm13.f162830q;
                    if (bxek == null) {
                        bxek = bxek.f163104b;
                    }
                    this.f30644q = new tld(bxek);
                }
                return this.f30644q;
            case 19:
                m22865i();
                bxcm bxcm14 = this.f30628a;
                if ((bxcm14.f162814a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) == 0) {
                    return null;
                }
                if (this.f30646s == null) {
                    bxer bxer = bxcm14.f162831r;
                    if (bxer == null) {
                        bxer = bxer.f163118d;
                    }
                    this.f30646s = new tlh(bxer);
                }
                return this.f30646s;
            case 20:
                m22865i();
                bxcm bxcm15 = this.f30628a;
                if ((bxcm15.f162814a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) == 0) {
                    return null;
                }
                if (this.f30632e == null) {
                    bxex bxex2 = bxcm15.f162832s;
                    if (bxex2 == null) {
                        bxex2 = bxex.f163147g;
                    }
                    this.f30632e = new tli(bxex2);
                }
                return this.f30632e;
            case 21:
                m22865i();
                bxcm bxcm16 = this.f30628a;
                if ((bxcm16.f162814a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) == 0) {
                    return null;
                }
                if (this.f30647t == null) {
                    bxfd bxfd = bxcm16.f162833t;
                    if (bxfd == null) {
                        bxfd = bxfd.f163162g;
                    }
                    this.f30647t = new tll(bxfd);
                }
                return this.f30647t;
            case 23:
                m22865i();
                bxcm bxcm17 = this.f30628a;
                if ((bxcm17.f162814a & 2097152) == 0) {
                    return null;
                }
                if (this.f30648u == null) {
                    bxeo bxeo = bxcm17.f162836x;
                    if (bxeo == null) {
                        bxeo = bxeo.f163115a;
                    }
                    this.f30648u = new tlg(bxeo);
                }
                return this.f30648u;
            case 24:
                m22865i();
                bxcm bxcm18 = this.f30628a;
                if ((bxcm18.f162814a & 4194304) == 0) {
                    return null;
                }
                if (this.f30649v == null) {
                    bxfg bxfg = bxcm18.f162837y;
                    if (bxfg == null) {
                        bxfg = bxfg.f163172e;
                    }
                    this.f30649v = new tlm(bxfg);
                }
                return this.f30649v;
        }
    }

    public final String toString() {
        m22865i();
        return this.f30628a.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35052a(parcel, 2, mo18034b(), false);
        see.m35062b(parcel, a);
    }

    public ContextFenceStub(byte[] bArr) {
        this.f30628a = null;
        this.f30629b = bArr;
        m22866j();
    }

    /* renamed from: b */
    public final byte[] mo18034b() {
        byte[] bArr = this.f30629b;
        return bArr == null ? this.f30628a.mo73642k() : bArr;
    }

    /* renamed from: a */
    public static ContextFenceStub m22863a(tli tli) {
        bxcj bxcj;
        sdo.m34959a(tli);
        if (tli.f46240b.f163154f) {
            bxcj = (bxcj) bxcm.f162813z.mo74144da();
            bxcl bxcl = bxcl.LOCAL_TIME_FENCE;
            if (bxcj.f164950c) {
                bxcj.mo74035c();
                bxcj.f164950c = false;
            }
            bxcm bxcm = (bxcm) bxcj.f164949b;
            bxcm.f162815b = bxcl.f162810z;
            int i = bxcm.f162814a | 1;
            bxcm.f162814a = i;
            bxex bxex = tli.f46240b;
            bxex.getClass();
            bxcm.f162832s = bxex;
            bxcm.f162814a = 262144 | i;
        } else {
            bxcj = (bxcj) bxcm.f162813z.mo74144da();
            bxcl bxcl2 = bxcl.TIME_FENCE;
            if (bxcj.f164950c) {
                bxcj.mo74035c();
                bxcj.f164950c = false;
            }
            bxcm bxcm2 = (bxcm) bxcj.f164949b;
            bxcm2.f162815b = bxcl2.f162810z;
            int i2 = bxcm2.f162814a | 1;
            bxcm2.f162814a = i2;
            bxex bxex2 = tli.f46240b;
            bxex2.getClass();
            bxcm2.f162817d = bxex2;
            bxcm2.f162814a = i2 | 2;
        }
        return new ContextFenceStub((bxcm) bxcj.mo74062i());
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static List m22864a(Collection r4) {
        ArrayList arrayList = new ArrayList(r4.size());
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((ContextFenceStub) r4.get(i)).mo18035c());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final int mo18031a() {
        tkp h = mo18040h();
        if (h != null) {
            return h.mo18031a();
        }
        return -2;
    }

    /* renamed from: a */
    public final void mo18032a(Set set) {
        int d = mo18036d();
        if (!(d == 1 || d == 2 || d == 3)) {
            if (d != 22) {
                tkp h = mo18040h();
                if (h == null) {
                    dst.m9257b("ContextFenceStub", "Expected a primitive fence for type=%s", Integer.valueOf(mo18036d()));
                } else {
                    set.add(Integer.valueOf(h.mo18031a()));
                }
                if ((this.f30628a.f162814a & 1048576) == 0) {
                    return;
                }
                if (!(h instanceof tkw)) {
                    dst.m9257b("ContextFenceStub", "Predictive fences are not supported for context: %s", Integer.valueOf(h.mo18031a()));
                    set.add(-3);
                    return;
                }
                tkw tkw = (tkw) h;
                set.addAll(Collections.singletonList(46));
                return;
            } else if ((this.f30628a.f162814a & 1048576) == 0) {
                dst.m9256b("ContextFenceStub", "Predictive fence without predictive parameters.");
                set.add(-3);
                return;
            }
        }
        ArrayList e = mo18037e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            ((ContextFenceStub) e.get(i)).mo18032a(set);
        }
    }
}
