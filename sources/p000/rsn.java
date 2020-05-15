package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.logging.Level;

/* renamed from: rsn */
final /* synthetic */ class rsn implements Runnable {

    /* renamed from: a */
    private final rso f43592a;

    /* renamed from: b */
    private final bnsw f43593b;

    public rsn(rso rso, bnsw bnsw) {
        this.f43592a = rso;
        this.f43593b = bnsw;
    }

    public final void run() {
        bpwj bpwj;
        bxvd bxvd;
        rso rso = this.f43592a;
        bnsw bnsw = this.f43593b;
        if (rso.f43595b == null) {
            rso.f43595b = new rsp(rso.f43596c, new bryy("com.google.android.gms", "20.15.15 (120300-{{cl}})"), new rsq(rso.f43594a));
        }
        rsp rsp = rso.f43595b;
        rsq rsq = rsp.f43600c;
        if (cdjt.f181077a.mo6606a().mo77763a() && bnsw.mo68446k().mo68397b(srn.f45045a) != null && ((Integer) bnsw.mo68446k().mo68397b(srn.f45045a)).intValue() != 0) {
            if (rsq.f43602a.contains(rsp.m34358a(sgj.m35206a(((Integer) bnsw.mo68446k().mo68397b(srn.f45045a)).intValue()))) && rsq.mo25078a()) {
                bryy bryy = rsp.f43599b;
                String a = bryy.m114909a(bnsw);
                Throwable th = (Throwable) bnsw.mo68446k().mo68397b(bnrw.f132044a);
                if ((a == null || a.isEmpty()) && th == null) {
                    bpwj = null;
                } else {
                    bnsc f = bnsw.mo68441f();
                    Level c = bnsw.mo68438c();
                    String a2 = f.mo68449a();
                    String b = f.mo68450b();
                    bxvd da = bpwj.f139502i.mo74144da();
                    bptw bptw = bryy.f143701a;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpwj bpwj2 = (bpwj) da.f164949b;
                    bptw.getClass();
                    bpwj2.f139505b = bptw;
                    bpwj2.f139504a |= 1;
                    String name = Thread.currentThread().getName();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpwj bpwj3 = (bpwj) da.f164949b;
                    name.getClass();
                    bpwj3.f139504a |= 2;
                    bpwj3.f139506c = name;
                    int intValue = c.intValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpwj bpwj4 = (bpwj) da.f164949b;
                    int i = bpwj4.f139504a | 4;
                    bpwj4.f139504a = i;
                    bpwj4.f139507d = intValue;
                    a2.getClass();
                    int i2 = i | 8;
                    bpwj4.f139504a = i2;
                    bpwj4.f139508e = a2;
                    b.getClass();
                    int i3 = i2 | 16;
                    bpwj4.f139504a = i3;
                    bpwj4.f139509f = b;
                    if (a != null) {
                        a.getClass();
                        bpwj4.f139504a = i3 | 64;
                        bpwj4.f139510g = a;
                    }
                    if (th != null) {
                        bxvd da2 = bpwm.f139527d.mo74144da();
                        bxvd a3 = bqbp.m112520a(th);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bpwm bpwm = (bpwm) da2.f164949b;
                        bpwl bpwl = (bpwl) a3.mo74062i();
                        bpwl.getClass();
                        bpwm.f139530b = bpwl;
                        bpwm.f139529a |= 1;
                        while (true) {
                            Throwable cause = th.getCause();
                            if (!(cause == null || cause == th)) {
                                bxvd a4 = bqbp.m112520a(th.getCause());
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bpwm bpwm2 = (bpwm) da2.f164949b;
                                bpwl bpwl2 = (bpwl) a4.mo74062i();
                                bpwl2.getClass();
                                if (!bpwm2.f139531c.mo73666a()) {
                                    bpwm2.f139531c = GeneratedMessageLite.m124021a(bpwm2.f139531c);
                                }
                                bpwm2.f139531c.add(bpwl2);
                                th = th.getCause();
                            }
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpwj bpwj5 = (bpwj) da.f164949b;
                        bpwm bpwm3 = (bpwm) da2.mo74062i();
                        bpwm3.getClass();
                        bpwj5.f139511h = bpwm3;
                        bpwj5.f139504a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                    bpwj = (bpwj) da.mo74062i();
                }
                if (bpwj != null) {
                    bxvd = bnsw.mo68442g() != null ? bryy.mo70092a(bpwj, bnsw.mo68443h()) : bryy.mo70092a(bpwj, new Object[0]);
                } else {
                    bxvd = null;
                }
                if (bxvd != null) {
                    String d = bnsw.mo68441f().mo68452d();
                    if (d != null) {
                        bxvd da3 = brzg.f143731c.mo74144da();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        brzg brzg = (brzg) da3.f164949b;
                        d.getClass();
                        brzg.f143733a |= 1;
                        brzg.f143734b = d;
                        ByteString aL = ((brzg) da3.mo74062i()).mo73639aL();
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        brzd brzd = (brzd) bxvd.f164949b;
                        brzd brzd2 = brzd.f143718f;
                        aL.getClass();
                        brzd.f143720a |= 8;
                        brzd.f143723d = aL;
                    }
                    sgj a5 = sgj.m35206a(((Integer) bnsw.mo68446k().mo68397b(srn.f45045a)).intValue());
                    qws qws = (qws) rsp.f43598a.get(a5);
                    if (qws == null) {
                        qws qws2 = new qws(rsp.f43601d.f43590a, rsp.m34358a(a5), null);
                        rsp.f43598a.put(a5, qws2);
                        qws = qws2;
                    }
                    qwo a6 = qws.mo24335a(((brzd) bxvd.mo74062i()).serializeToBytes());
                    a6.mo24328b(bryy.m114910b(bnsw));
                    a6.mo24327b();
                }
            }
        }
    }
}
