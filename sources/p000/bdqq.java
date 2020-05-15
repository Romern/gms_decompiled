package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bdqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdqq implements bdqj {

    /* renamed from: a */
    static final bdqp f106268a = new bdqm();

    /* renamed from: b */
    static final bdqp f106269b = new bdqn();

    /* renamed from: c */
    static final bdqp f106270c = new bdqo();

    /* renamed from: d */
    private volatile qws f106271d;

    /* renamed from: e */
    private final Context f106272e;

    /* renamed from: f */
    private final sgf f106273f;

    /* renamed from: g */
    private final int f106274g;

    /* renamed from: h */
    private final bmzi f106275h;

    public bdqq() {
    }

    /* renamed from: a */
    static void m91305a(bdqp bdqp, bxxb bxxb) {
        if (TextUtils.isEmpty(bdqp.mo58301b(bxxb))) {
            bdqp.mo58300a(bxxb, bdfm.m90702a(bdqp.mo58299a(bxxb)));
        } else {
            bdqp.mo58300a(bxxb, null);
        }
        bdqp.mo58302c(bxxb);
    }

    public bdqq(Context context, sgf sgf, int i, bmzi bmzi) {
        this.f106272e = context;
        this.f106273f = sgf;
        this.f106274g = i;
        this.f106275h = bmzi;
    }

    /* renamed from: a */
    private static String[] m91306a(String str) {
        return str.replaceFirst("^/+", "").split("/+");
    }

    /* renamed from: a */
    public final void mo58298a(cios cios) {
        cagz cagz;
        int i = bdgs.f105600b;
        bxvd bxvd = (bxvd) cios.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) cios);
        m91305a(f106268a, bxvd);
        cios cios2 = (cios) bxvd.f164949b;
        if ((cios2.f191115a & 512) != 0) {
            ciml ciml = cios2.f191124j;
            if (ciml == null) {
                ciml = ciml.f190743c;
            }
            if ((ciml.f190745a & 1) != 0) {
                ciml ciml2 = ((cios) bxvd.f164949b).f191124j;
                if (ciml2 == null) {
                    ciml2 = ciml.f190743c;
                }
                cimk cimk = ciml2.f190746b;
                if (cimk == null) {
                    cimk = cimk.f190730k;
                }
                bxvd bxvd2 = (bxvd) cimk.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) cimk);
                m91305a(f106269b, bxvd2);
                ciml ciml3 = ((cios) bxvd.f164949b).f191124j;
                if (ciml3 == null) {
                    ciml3 = ciml.f190743c;
                }
                bxvd bxvd3 = (bxvd) ciml3.mo74142c(5);
                bxvd3.mo73625a((GeneratedMessageLite) ciml3);
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                ciml ciml4 = (ciml) bxvd3.f164949b;
                cimk cimk2 = (cimk) bxvd2.mo74062i();
                cimk2.getClass();
                ciml4.f190746b = cimk2;
                ciml4.f190745a |= 1;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cios cios3 = (cios) bxvd.f164949b;
                ciml ciml5 = (ciml) bxvd3.mo74062i();
                cios cios4 = cios.f191113s;
                ciml5.getClass();
                cios3.f191124j = ciml5;
                cios3.f191115a |= 512;
            }
        }
        cios cios5 = (cios) bxvd.f164949b;
        if ((cios5.f191115a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            ciom ciom = cios5.f191123i;
            if (ciom == null) {
                ciom = ciom.f191083k;
            }
            if (ciom.f191094j.size() != 0) {
                ciom ciom2 = ((cios) bxvd.f164949b).f191123i;
                if (ciom2 == null) {
                    ciom2 = ciom.f191083k;
                }
                bxvd bxvd4 = (bxvd) ciom2.mo74142c(5);
                bxvd4.mo73625a((GeneratedMessageLite) ciom2);
                ciok ciok = (ciok) bxvd4;
                for (int i2 = 0; i2 < ((ciom) ciok.f164949b).f191094j.size(); i2++) {
                    ciol ciol = (ciol) ((ciom) ciok.f164949b).f191094j.get(i2);
                    bxvd bxvd5 = (bxvd) ciol.mo74142c(5);
                    bxvd5.mo73625a((GeneratedMessageLite) ciol);
                    if (!TextUtils.isEmpty(((ciol) bxvd5.f164949b).f191080b)) {
                        if (bxvd5.f164950c) {
                            bxvd5.mo74035c();
                            bxvd5.f164950c = false;
                        }
                        ciol ciol2 = ciol.f191077e;
                        ((ciol) bxvd5.f164949b).f191081c = GeneratedMessageLite.m124029dd();
                        for (String str : m91306a(((ciol) bxvd5.f164949b).f191080b)) {
                            long longValue = bdfm.m90702a(str).longValue();
                            if (bxvd5.f164950c) {
                                bxvd5.mo74035c();
                                bxvd5.f164950c = false;
                            }
                            ciol ciol3 = (ciol) bxvd5.f164949b;
                            if (!ciol3.f191081c.mo73666a()) {
                                ciol3.f191081c = GeneratedMessageLite.m124020a(ciol3.f191081c);
                            }
                            ciol3.f191081c.mo74161a(longValue);
                        }
                    }
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    ciol ciol4 = (ciol) bxvd5.f164949b;
                    ciol ciol5 = ciol.f191077e;
                    ciol4.f191079a &= -2;
                    ciol4.f191080b = ciol.f191077e.f191080b;
                    if (ciok.f164950c) {
                        ciok.mo74035c();
                        ciok.f164950c = false;
                    }
                    ciom ciom3 = (ciom) ciok.f164949b;
                    ciol ciol6 = (ciol) bxvd5.mo74062i();
                    ciol6.getClass();
                    ciom3.mo86264c();
                    ciom3.f191094j.set(i2, ciol6);
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cios cios6 = (cios) bxvd.f164949b;
                ciom ciom4 = (ciom) ciok.mo74062i();
                cios cios7 = cios.f191113s;
                ciom4.getClass();
                cios6.f191123i = ciom4;
                cios6.f191115a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }
        cios cios8 = (cios) bxvd.f164949b;
        if ((cios8.f191115a & 32) != 0) {
            cinm cinm = cios8.f191121g;
            if (cinm == null) {
                cinm = cinm.f190968b;
            }
            if (cinm.f190970a.size() != 0) {
                cinm cinm2 = ((cios) bxvd.f164949b).f191121g;
                if (cinm2 == null) {
                    cinm2 = cinm.f190968b;
                }
                bxvd bxvd6 = (bxvd) cinm2.mo74142c(5);
                bxvd6.mo73625a((GeneratedMessageLite) cinm2);
                for (int i3 = 0; i3 < ((cinm) bxvd6.f164949b).f190970a.size(); i3++) {
                    cinl cinl = (cinl) ((cinm) bxvd6.f164949b).f190970a.get(i3);
                    bxvd bxvd7 = (bxvd) cinl.mo74142c(5);
                    bxvd7.mo73625a((GeneratedMessageLite) cinl);
                    if (!TextUtils.isEmpty(((cinl) bxvd7.f164949b).f190963s)) {
                        if (bxvd7.f164950c) {
                            bxvd7.mo74035c();
                            bxvd7.f164950c = false;
                        }
                        cinl cinl2 = cinl.f190943w;
                        ((cinl) bxvd7.f164949b).f190964t = GeneratedMessageLite.m124029dd();
                        String[] a = m91306a(((cinl) bxvd7.f164949b).f190963s);
                        int length = a.length;
                        long[] jArr = new long[length];
                        for (int i4 = 0; i4 < length; i4++) {
                            jArr[i4] = bdfm.m90702a(a[i4]).longValue();
                        }
                        for (int i5 = 0; i5 < length; i5++) {
                            long j = jArr[i5];
                            if (bxvd7.f164950c) {
                                bxvd7.mo74035c();
                                bxvd7.f164950c = false;
                            }
                            cinl cinl3 = (cinl) bxvd7.f164949b;
                            if (!cinl3.f190964t.mo73666a()) {
                                cinl3.f190964t = GeneratedMessageLite.m124020a(cinl3.f190964t);
                            }
                            cinl3.f190964t.mo74161a(j);
                        }
                    }
                    if (bxvd7.f164950c) {
                        bxvd7.mo74035c();
                        bxvd7.f164950c = false;
                    }
                    cinl cinl4 = (cinl) bxvd7.f164949b;
                    cinl cinl5 = cinl.f190943w;
                    cinl4.f190945a &= -262145;
                    cinl4.f190963s = cinl.f190943w.f190963s;
                    if (bxvd6.f164950c) {
                        bxvd6.mo74035c();
                        bxvd6.f164950c = false;
                    }
                    cinm cinm3 = (cinm) bxvd6.f164949b;
                    cinl cinl6 = (cinl) bxvd7.mo74062i();
                    cinl6.getClass();
                    cinm3.mo86261c();
                    cinm3.f190970a.set(i3, cinl6);
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cios cios9 = (cios) bxvd.f164949b;
                cinm cinm4 = (cinm) bxvd6.mo74062i();
                cios cios10 = cios.f191113s;
                cinm4.getClass();
                cios9.f191121g = cinm4;
                cios9.f191115a |= 32;
            }
        }
        cios cios11 = (cios) bxvd.f164949b;
        if ((cios11.f191115a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
            cinu cinu = cios11.f191127m;
            if (cinu == null) {
                cinu = cinu.f190982h;
            }
            if (cinu.f190987d.size() != 0) {
                cinu cinu2 = ((cios) bxvd.f164949b).f191127m;
                if (cinu2 == null) {
                    cinu2 = cinu.f190982h;
                }
                bxvd bxvd8 = (bxvd) cinu2.mo74142c(5);
                bxvd8.mo73625a((GeneratedMessageLite) cinu2);
                for (int i6 = 0; i6 < ((cinu) bxvd8.f164949b).f190987d.size(); i6++) {
                    cinx cinx = (cinx) ((cinu) bxvd8.f164949b).f190987d.get(i6);
                    bxvd bxvd9 = (bxvd) cinx.mo74142c(5);
                    bxvd9.mo73625a((GeneratedMessageLite) cinx);
                    m91305a(f106270c, bxvd9);
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    cinu cinu3 = (cinu) bxvd8.f164949b;
                    cinx cinx2 = (cinx) bxvd9.mo74062i();
                    cinx2.getClass();
                    cinu3.mo86262c();
                    cinu3.f190987d.set(i6, cinx2);
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cios cios12 = (cios) bxvd.f164949b;
                cinu cinu4 = (cinu) bxvd8.mo74062i();
                cios cios13 = cios.f191113s;
                cinu4.getClass();
                cios12.f191127m = cinu4;
                cios12.f191115a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            }
        }
        cios cios14 = (cios) bxvd.mo74062i();
        byte[] k = cios14.serializeToBytes();
        if (cdmr.m134059b()) {
            int i7 = cios14.f191115a;
            if ((i7 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 && (i7 & 4096) == 0 && (i7 & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) == 0) {
                int length2 = k.length;
                if (length2 > this.f106274g) {
                    Log.w("ClearcutTransmitter", String.format("Too large: %d", Integer.valueOf(length2)));
                    return;
                } else if (!this.f106273f.mo25492a()) {
                    Log.w("ClearcutTransmitter", "Dropped event; high load or sample rate");
                    return;
                }
            }
            if (((Boolean) this.f106275h.mo6606a()).booleanValue()) {
                qws qws = this.f106271d;
                if (qws == null) {
                    synchronized (this) {
                        qws = this.f106271d;
                        if (qws == null) {
                            qws = new qws(this.f106272e, "GMSCORE_ANDROID_PRIMES", null);
                            if (!cdmr.f181248a.mo6606a().mo77922v()) {
                                cagz = !cdmr.f181248a.mo6606a().mo77921u() ? cagz.DEFAULT : cagz.UNMETERED_ONLY;
                            } else {
                                cagz = cagz.UNMETERED_OR_DAILY;
                            }
                            qws.mo24337a(cagz);
                            this.f106271d = qws;
                        }
                    }
                }
                qws.mo24335a(k).mo24327b();
            }
        }
    }
}
