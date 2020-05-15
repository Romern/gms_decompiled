package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.gcm.GcmChimeraService;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

/* renamed from: aano */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aano implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aans f28588a;

    /* renamed from: b */
    final /* synthetic */ bxuc f28589b;

    /* renamed from: c */
    final /* synthetic */ aanr f28590c;

    public aano(aanr aanr, aans aans, bxuc bxuc) {
        this.f28590c = aanr;
        this.f28588a = aans;
        this.f28589b = bxuc;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:209:0x0013 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:197:0x0013 */
    /* JADX WARN: Type inference failed for: r6v0, assign insn: 0x0010: CONST  (r6v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v2, assign insn: PHI: (r6v2 ?) = (r6v3 ?), (r6v1 int) binds: [B:210:0x0013, B:209:0x0013] */
    /* JADX WARN: Type inference failed for: r6v3, assign insn: 0x0282: CONST  (r6v3 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0218, code lost:
        if (r0 != false) goto L_0x021a;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r6v1, types: [boolean, int], assign insn: PHI: (r6v1 int) = (r6v0 ?), (r6v2 ?) binds: [B:3:0x0010, B:197:0x0013] */
    public final void run() {
        byte b;
        Throwable th;
        boolean z;
        aanr aanr = this.f28590c;
        aans aans = this.f28588a;
        bxuc bxuc = this.f28589b;
        try {
            aans.f28643j = bxuc.mo73785C();
            ? r6 = 0;
            boolean z2 = false;
            while (aans.f28639f) {
                try {
                    b = bxuc.mo73785C();
                } catch (IOException e) {
                    b = -1;
                }
                try {
                    blji a = aabl.m21058a(aanr.f28628u, "readMessage");
                    try {
                        aanr.f28627t.mo49111a(500);
                        if (aans.f28639f) {
                            if (b >= 0) {
                                int t = bxuc.mo73811t();
                                int i = aanr.f28621n + t + 2;
                                aanr.f28621n = i;
                                if (t > 128) {
                                    aanr.f28621n = i + 1;
                                }
                                byte[] bArr = new byte[r6];
                                if (t > 0) {
                                    bArr = bxuc.mo73795e(t);
                                }
                                bxxc a2 = aane.m21625a(b, bArr);
                                aamy.m21599a(r6, b, a2, aans.f28650q, aans.f28651r);
                                aanr.f28620m++;
                                if (a2 instanceof blng) {
                                    blng blng = (blng) a2;
                                    blmq blmq = blng.f126965a;
                                    if (blmq == null) {
                                        blmq = blmq.f126884c;
                                    }
                                    if (blmq.f126886a == 0) {
                                        aanr.f28629v = r6;
                                        aanr.f28619l = 0;
                                        aanr.f28617j = r6;
                                        aanr.f28618k = r6;
                                        aanr.f28616i++;
                                        aanr.f28613f = true;
                                        aanr.f28614g = System.currentTimeMillis();
                                        Socket socket = aans.f28635b;
                                        if (socket != null) {
                                            socket.setSoTimeout((int) cecz.f182285a.mo6606a().mo78796O());
                                        }
                                        aans.f28640g = true;
                                        synchronized (aanr.f28612e) {
                                            aanr.f28612e.clear();
                                        }
                                        synchronized (aanr.f28615h) {
                                            synchronized (aans.f28648o) {
                                                aans.f28648o.addAll(aanr.f28615h);
                                            }
                                            aanr.f28615h.clear();
                                        }
                                        aanr.mo17141a(aans, aane.m21626b(blng));
                                        aanr.mo17145a(blng);
                                        if (a != null) {
                                            try {
                                                a.close();
                                            } catch (IOException e2) {
                                                z2 = true;
                                                try {
                                                    if (!aans.f28644k) {
                                                        aanr.mo17146b(aans, 19);
                                                    } else {
                                                        aanr.mo17146b(aans, 28);
                                                    }
                                                    aanr.mo17148j();
                                                    r6 = 0;
                                                } catch (Throwable th2) {
                                                    aanr.mo17148j();
                                                    throw th2;
                                                }
                                            }
                                        }
                                        aanr.mo17148j();
                                        z2 = true;
                                    } else {
                                        aanr.mo17145a(blng);
                                        aanr.f28618k++;
                                        aanr.mo17146b(aans, 4);
                                        if (a != null) {
                                            a.close();
                                        }
                                    }
                                } else if (!z2) {
                                    aanr.mo17146b(aans, 14);
                                    if (a != null) {
                                        a.close();
                                    }
                                } else {
                                    if (a2 instanceof blmw) {
                                        blms blms = (blms) blmt.f126897e.mo74144da();
                                        int e3 = aanr.f28624q.mo19573e();
                                        if (e3 != -1) {
                                            if (blms.f164950c) {
                                                blms.mo74035c();
                                                blms.f164950c = r6;
                                            }
                                            blmt blmt = (blmt) blms.f164949b;
                                            blmt.f126899a |= 16;
                                            blmt.f126902d = e3;
                                            aanr.f28624q.f32819i = e3;
                                        }
                                        aanr.m21668a(aans, blms);
                                    }
                                    if (!(a2 instanceof blmn)) {
                                        aanr.mo17141a(aans, aane.m21626b(a2));
                                        if (a2 instanceof blna) {
                                            blmr blmr = ((blna) a2).f126927d;
                                            if (blmr == null) {
                                                blmr = blmr.f126891d;
                                            }
                                            if (blmr.f126894b == 12) {
                                                aanr.mo17143a(aans, ((blnh) bxvk.m124007a(blnh.f126972b, bxtx.m123258a(blmr.f126895c))).f126974a);
                                                aamc aamc = aanr.f28623p;
                                                aajt aajt = aanr.f28625r;
                                                if (!aytw.m84813a(aamc.f28439b)) {
                                                    StringBuilder sb = new StringBuilder();
                                                    ArrayList arrayList = new ArrayList();
                                                    aamc.mo17001a(new aalz(aajt, arrayList, sb, aanr));
                                                    if (sb.length() > 0) {
                                                        Object[] objArr = new Object[1];
                                                        objArr[r6] = sb.toString();
                                                        GcmChimeraService.m24303a("Resent %s", objArr);
                                                    }
                                                    aamc.mo16998a(arrayList);
                                                }
                                            }
                                        }
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        aamy.m21598a(a2);
                                        aanr.f28626s.mo17126c(true);
                                        aanr.f28624q.mo19572d();
                                        boolean z3 = a2 instanceof blmp;
                                        if (z3) {
                                            aajt.m21355a(new aajm(aanr.f28625r, (blmp) a2, elapsedRealtime));
                                        }
                                        if (!aytw.m84813a(aanr.f28622o) && !aanr.f28626s.mo17128e()) {
                                            Context context = aanr.f28622o;
                                            if (aebw.m51603a()) {
                                                aebw.m51602a(context, aapx.CLOUD_MESSAGE_RECEIVED);
                                            } else {
                                                aphm.m70306c();
                                            }
                                        }
                                        if (z3) {
                                            blmp blmp = (blmp) a2;
                                            z = blmp.f126881p;
                                            String str = blmp.f126873h;
                                            if (!bmxx.m108577a(str)) {
                                                synchronized (aanr.f28612e) {
                                                    aanr.f28612e.add(str);
                                                }
                                                aanr.f28623p.mo17002a(str);
                                            }
                                        } else {
                                            z = false;
                                        }
                                        synchronized (aans.f28646m) {
                                            int i2 = aans.f28650q + 1;
                                            aans.f28650q = i2;
                                            if (((long) (i2 - aans.f28649p)) >= ceby.f182241a.mo6606a().mo78747a()) {
                                            }
                                            aanr.m21665a(aans);
                                        }
                                        if (a != null) {
                                            a.close();
                                        }
                                        aanr.mo17148j();
                                        r6 = 0;
                                    } else {
                                        aanr.mo17146b(aans, 18);
                                        if (a != null) {
                                            a.close();
                                        }
                                    }
                                }
                            } else {
                                if (!aans.f28644k) {
                                    StringBuilder sb2 = new StringBuilder(45);
                                    sb2.append("Unexpected connection close (FIN) ");
                                    sb2.append((int) b);
                                    sb2.toString();
                                    aanr.mo17146b(aans, 20);
                                } else {
                                    aanr.mo17146b(aans, 28);
                                }
                                if (a != null) {
                                    a.close();
                                }
                            }
                        } else if (a != null) {
                            a.close();
                        }
                        aanr.mo17148j();
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        if (a != null) {
                            a.close();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                } catch (Throwable th4) {
                    bqye.m113761a(th, th4);
                }
            }
        } catch (IOException e5) {
            aanr.mo17146b(aans, 16);
        }
    }
}
