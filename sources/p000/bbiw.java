package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Map;

/* renamed from: bbiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbiw {

    /* renamed from: a */
    private final bbib f102757a;

    /* renamed from: b */
    private final bmzi f102758b;

    /* renamed from: c */
    private final bbis f102759c;

    public bbiw(String str, String str2, String str3, bmzi bmzi, bbis bbis) {
        bxvd da = bbib.f102689f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bbib bbib = (bbib) da.f164949b;
        str.getClass();
        int i = bbib.f102691a | 4;
        bbib.f102691a = i;
        bbib.f102693c = str;
        bbib.f102691a = i | 2;
        bbib.f102692b = 1;
        if (!aeev.m51768e()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbib bbib2 = (bbib) da.f164949b;
            str3.getClass();
            bbib2.f102691a |= 16;
            bbib2.f102695e = str3;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbib bbib3 = (bbib) da.f164949b;
            str2.getClass();
            bbib3.f102691a |= 8;
            bbib3.f102694d = str2;
        }
        this.f102757a = (bbib) da.mo74062i();
        this.f102758b = bmzn.m108681a(bmzi);
        this.f102759c = bbis;
    }

    /* renamed from: a */
    public final void mo56159a(bbnq bbnq, int i, int i2, bxvp bxvp, bbix bbix, boolean z) {
        int h = aeev.m51771h();
        if (this.f102759c.mo35048a((long) h)) {
            bxvd da = bbih.f102715l.mo74144da();
            long b = bbnq.mo56213b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbih bbih = (bbih) da.f164949b;
            bbih.f102717a |= 2;
            bbih.f102719c = b;
            long d = bbnq.mo56215d();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbih bbih2 = (bbih) da.f164949b;
            bbih2.f102717a |= 8;
            bbih2.f102721e = d;
            long c = bbnq.mo56214c();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbih bbih3 = (bbih) da.f164949b;
            int i3 = 4;
            int i4 = bbih3.f102717a | 4;
            bbih3.f102717a = i4;
            bbih3.f102720d = c;
            bbih3.f102718b = i - 1;
            bbih3.f102717a = i4 | 1;
            int i5 = i2 - 1;
            if (i2 != 0) {
                if (i5 == 0) {
                    i3 = 2;
                } else if (i5 == 1) {
                    i3 = 3;
                } else if (i5 != 2) {
                    i3 = 1;
                }
                bbih bbih4 = (bbih) da.f164949b;
                bbih4.f102726j = i3 - 1;
                bbih4.f102717a |= 128;
                bnrd a = bbnq.mo56212a().entrySet().iterator();
                while (a.hasNext()) {
                    Map.Entry entry = (Map.Entry) a.next();
                    bxvd da2 = bbig.f102710d.mo74144da();
                    int a2 = ((bxvp) ((Enum) entry.getKey())).mo3214a();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bbig bbig = (bbig) da2.f164949b;
                    bbig.f102712a |= 1;
                    bbig.f102713b = a2;
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bbig bbig2 = (bbig) da2.f164949b;
                    bbig2.f102712a |= 2;
                    bbig2.f102714c = longValue;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bbih bbih5 = (bbih) da.f164949b;
                    bbig bbig3 = (bbig) da2.mo74062i();
                    bbig3.getClass();
                    if (!bbih5.f102725i.mo73666a()) {
                        bbih5.f102725i = GeneratedMessageLite.m124021a(bbih5.f102725i);
                    }
                    bbih5.f102725i.add(bbig3);
                }
                if (bxvp != null) {
                    int a3 = bxvp.mo3214a();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bbih bbih6 = (bbih) da.f164949b;
                    bbih6.f102717a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bbih6.f102727k = a3;
                }
                if (bbix != null) {
                    int a4 = bbix.mo56154a().mo3214a();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bbih bbih7 = (bbih) da.f164949b;
                    bbih7.f102717a |= 16;
                    bbih7.f102722f = a4;
                    Integer b2 = bbix.mo56155b();
                    if (b2 != null) {
                        int intValue = b2.intValue();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bbih bbih8 = (bbih) da.f164949b;
                        bbih8.f102717a |= 32;
                        bbih8.f102723g = intValue;
                    }
                }
                if (z) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bbih bbih9 = (bbih) da.f164949b;
                    bbih9.f102717a |= 64;
                    bbih9.f102724h = true;
                }
                bxvd da3 = bbii.f102728c.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bbii bbii = (bbii) da3.f164949b;
                bbih bbih10 = (bbih) da.mo74062i();
                bbih10.getClass();
                bbii.f102731b = bbih10;
                bbii.f102730a = 1 | bbii.f102730a;
                bbii bbii2 = (bbii) da3.mo74062i();
                bbin bbin = (bbin) this.f102758b.mo6606a();
                bxvd da4 = bbic.f102696f.mo74144da();
                bbib bbib = this.f102757a;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bbic bbic = (bbic) da4.f164949b;
                bbib.getClass();
                bbic.f102702e = bbib;
                int i6 = bbic.f102698a | 32;
                bbic.f102698a = i6;
                bbic.f102698a = i6 | 16;
                bbic.f102701d = h;
                bbii2.getClass();
                bbic.f102700c = bbii2;
                bbic.f102699b = 6;
                bbin.mo56151a(3001, (bbic) da4.mo74062i());
                return;
            }
            throw null;
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo56160a(bbnq bbnq, int i, bbix bbix) {
        int h = aeev.m51771h();
        if (this.f102759c.mo35048a((long) h)) {
            bxvd da = bbih.f102715l.mo74144da();
            long b = bbnq.mo56213b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbih bbih = (bbih) da.f164949b;
            bbih.f102717a |= 2;
            bbih.f102719c = b;
            long d = bbnq.mo56215d();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbih bbih2 = (bbih) da.f164949b;
            bbih2.f102717a |= 8;
            bbih2.f102721e = d;
            long c = bbnq.mo56214c();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbih bbih3 = (bbih) da.f164949b;
            int i2 = bbih3.f102717a | 4;
            bbih3.f102717a = i2;
            bbih3.f102720d = c;
            bbih3.f102718b = i - 1;
            bbih3.f102717a = i2 | 1;
            if (bbix != null) {
                int a = bbix.mo56154a().mo3214a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bbih bbih4 = (bbih) da.f164949b;
                bbih4.f102717a |= 16;
                bbih4.f102722f = a;
                Integer b2 = bbix.mo56155b();
                if (b2 != null) {
                    int intValue = b2.intValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bbih bbih5 = (bbih) da.f164949b;
                    bbih5.f102717a |= 32;
                    bbih5.f102723g = intValue;
                }
            }
            bxvd da2 = bbii.f102728c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bbii bbii = (bbii) da2.f164949b;
            bbih bbih6 = (bbih) da.mo74062i();
            bbih6.getClass();
            bbii.f102731b = bbih6;
            bbii.f102730a |= 1;
            bbii bbii2 = (bbii) da2.mo74062i();
            bbin bbin = (bbin) this.f102758b.mo6606a();
            bxvd da3 = bbic.f102696f.mo74144da();
            bbib bbib = this.f102757a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bbic bbic = (bbic) da3.f164949b;
            bbib.getClass();
            bbic.f102702e = bbib;
            int i3 = bbic.f102698a | 32;
            bbic.f102698a = i3;
            bbic.f102698a = i3 | 16;
            bbic.f102701d = h;
            bbii2.getClass();
            bbic.f102700c = bbii2;
            bbic.f102699b = 6;
            bbin.mo56151a(3001, (bbic) da3.mo74062i());
        }
    }
}
