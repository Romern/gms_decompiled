package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Pair;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: azbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azbx {

    /* renamed from: c */
    private static WeakReference f98929c = new WeakReference(null);

    /* renamed from: a */
    private final Context f98930a;

    /* renamed from: b */
    private aytp f98931b;

    private azbx(Context context) {
        this.f98930a = context;
    }

    /* renamed from: a */
    public static synchronized azbx m85232a(Context context) {
        azbx azbx;
        synchronized (azbx.class) {
            azbx = (azbx) f98929c.get();
            if (azbx == null) {
                azbx = new azbx(context.getApplicationContext());
                f98929c = new WeakReference(azbx);
            }
        }
        return azbx;
    }

    /* renamed from: b */
    public final synchronized void mo54585b() {
        azox.m85982b();
        azph.m85998a(this.f98930a).mo55125a(1653);
        try {
            if (!cfeo.f183719a.mo6606a().mo80950aJ()) {
                mo54586c().mo54427a();
            } else if (this.f98931b == null) {
                azph.m85998a(this.f98930a).mo55126a(1654, 3);
            } else {
                mo54586c().mo54427a();
            }
        } catch (IllegalStateException e) {
            azph.m85998a(this.f98930a).mo55126a(1654, 35);
        }
        this.f98931b = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized aytp mo54586c() {
        Executor executor = azox.f99803a;
        if (this.f98931b == null) {
            azdl a = azdl.m85412a(this.f98930a);
            if (!a.mo54770e() || a.mo54790l() == null || a.mo54789k() == null) {
                throw new IllegalStateException("Shouldn't use signal client when not registered");
            }
            this.f98931b = new aytp("Matchstick", this.f98930a, new Pair(a.mo54789k(), a.mo54790l()));
        }
        return this.f98931b;
    }

    /* JADX WARN: Type inference failed for: r13v8, types: [ciwb], assign insn: 0x0207: CONSTRUCTOR  (r13v8 ? I:ciwb) = (r14v1 int), (r2v38 int), (r15v7 cixh), (r5v18 int), (r12v10 civs), (r27v0 cive), (r28v0 ciwc) call: ciwb.<init>(int, int, cixh, int, civs, cive, ciwc):void type: CONSTRUCTOR */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final synchronized cbil mo54582a(aznz aznz, cbil cbil) {
        cbav cbav;
        bqgg bqgg;
        int i;
        ciwc ciwc;
        cixh cixh;
        cbmh cbmh;
        int i2;
        cbmh cbmh2;
        int i3;
        cbil cbil2 = cbil;
        synchronized (this) {
            azox.m85982b();
            if (cbil2 == null) {
                azoj.m85933c("encryption", "Null content", new Object[0]);
                return null;
            } else if (!aznz.mo55105c()) {
                azoj.m85933c("encryption", "Only 1:1 conversation is supported", new Object[0]);
                return null;
            } else if (aznz.mo55106d()) {
                if (cbil2.f177259a == 3) {
                    bxvd da = cbav.f176502d.mo74144da();
                    cbax cbax = cbax.f176512b;
                    bxvd bxvd = (bxvd) cbax.mo74142c(5);
                    bxvd.mo73625a((bxvk) cbax);
                    if (cbil2.f177259a == 3) {
                        cbmh = (cbmh) cbil2.f177260b;
                    } else {
                        cbmh = cbmh.f177621c;
                    }
                    int a = cipj.m150694a(cbmh.f177623a);
                    if (a == 0) {
                        a = 1;
                    }
                    int i4 = a - 2;
                    if (i4 != 1) {
                        i2 = i4 != 2 ? 2 : 4;
                    } else {
                        i2 = 3;
                    }
                    if (cbil2.f177259a == 3) {
                        cbmh2 = (cbmh) cbil2.f177260b;
                    } else {
                        cbmh2 = cbmh.f177621c;
                    }
                    bxwc bxwc = cbmh2.f177624b;
                    int size = bxwc.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < size) {
                        cbmg cbmg = (cbmg) bxwc.get(i5);
                        bxvd da2 = cbaw.f176507d.mo74144da();
                        String str = cbmg.f177618a;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        cbaw cbaw = (cbaw) da2.f164949b;
                        str.getClass();
                        cbaw.f176509a = str;
                        cbaw.f176510b = i2 - 2;
                        int i7 = cbmg.f177620c;
                        if (i7 != 2) {
                            i3 = i7 != 3 ? 2 : 5;
                        } else {
                            i3 = 4;
                        }
                        ((cbaw) da2.f164949b).f176511c = i3 - 2;
                        int i8 = i6 + 1;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        cbax cbax2 = (cbax) bxvd.f164949b;
                        cbaw cbaw2 = (cbaw) da2.mo74062i();
                        cbaw2.getClass();
                        if (!cbax2.f176514a.mo73666a()) {
                            cbax2.f176514a = bxvk.m124021a(cbax2.f176514a);
                        }
                        cbax2.f176514a.set(i6, cbaw2);
                        i5++;
                        i6 = i8;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cbav cbav2 = (cbav) da.f164949b;
                    cbax cbax3 = (cbax) bxvd.mo74062i();
                    cbax3.getClass();
                    cbav2.f176505b = cbax3;
                    cbav2.f176504a = 8;
                    cbav = (cbav) da.mo74062i();
                } else {
                    azoj.m85933c("encryption", "Only message receipt supported", new Object[0]);
                    cbav = null;
                }
                if (cbav != null) {
                    new Object[1][0] = cbav;
                    LocalEntityId a2 = azcm.m85302a(azcl.m85289a(this.f98930a).getReadableDatabase(), aznz);
                    try {
                        aytp c = mo54586c();
                        String localEntityId = a2.toString();
                        byte[] k = cbav.mo73642k();
                        if (localEntityId == null) {
                            bqgg = null;
                        } else if (c.f98459b.mo54425b(new civo(localEntityId))) {
                            civo civo = new civo(localEntityId);
                            aytn aytn = c.f98459b;
                            civn civn = new civn(aytn, aytn, aytn, aytn, civo);
                            synchronized (civn.f191532a) {
                                ciwo a3 = civn.f191533b.mo54423a(civn.f191536e);
                                ciwq ciwq = a3.f191602a;
                                ciwh e = ciwq.mo86616e();
                                ciwi b = e.mo86605b();
                                civs f = ciwq.mo86617f();
                                int i9 = ciwq.f191608a.f191653f;
                                int b2 = ciwq.mo86613b();
                                ciwc = new ciwc(b2, b.f191594b, f, e.f191591b, i9, civn.m151046a(b2, b, k), ciwq.mo86615d(), ciwq.mo86614c());
                                cixb cixb = ciwq.f191608a;
                                if ((cixb.f191648a & 128) != 0) {
                                    try {
                                        cixa cixa = cixb.f191656i;
                                        if (cixa == null) {
                                            cixa = cixa.f191640e;
                                        }
                                        if ((cixa.f191642a & 1) != 0) {
                                            cixa cixa2 = ciwq.f191608a.f191656i;
                                            if (cixa2 == null) {
                                                cixa2 = cixa.f191640e;
                                            }
                                            cixh = cixh.m151114a(Integer.valueOf(cixa2.f191643b));
                                        } else {
                                            cixh = cixg.f191671a;
                                        }
                                        cixa cixa3 = ciwq.f191608a.f191656i;
                                        if (cixa3 == null) {
                                            cixa3 = cixa.f191640e;
                                        }
                                        int i10 = cixa3.f191644c;
                                        cixa cixa4 = ciwq.f191608a.f191656i;
                                        if (cixa4 == null) {
                                            cixa4 = cixa.f191640e;
                                        }
                                        ciwp ciwp = new ciwp(cixh, i10, civq.m151054b(cixa4.f191645d.mo73780k()));
                                        ciwc = new ciwb(b2, ciwq.f191608a.f191658k, ciwp.f191605a, ciwp.f191606b, ciwp.f191607c, ciwq.mo86615d(), ciwc);
                                    } catch (civg e2) {
                                        throw new AssertionError(e2);
                                    }
                                }
                                ciwh a4 = e.mo86604a();
                                bxvd da3 = ciwx.f191621d.mo74144da();
                                bxtx a5 = bxtx.m123261a(a4.f191590a);
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                ciwx ciwx = (ciwx) da3.f164949b;
                                a5.getClass();
                                int i11 = 2 | ciwx.f191623a;
                                ciwx.f191623a = i11;
                                ciwx.f191625c = a5;
                                int i12 = a4.f191591b;
                                ciwx.f191623a = i11 | 1;
                                ciwx.f191624b = i12;
                                ciwx ciwx2 = (ciwx) da3.mo74062i();
                                ciwz ciwz = ciwq.f191608a.f191654g;
                                if (ciwz == null) {
                                    ciwz = ciwz.f191633f;
                                }
                                bxvd bxvd2 = (bxvd) ciwz.mo74142c(5);
                                bxvd2.mo73625a((bxvk) ciwz);
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                ciwz ciwz2 = (ciwz) bxvd2.f164949b;
                                ciwx2.getClass();
                                ciwz2.f191638d = ciwx2;
                                ciwz2.f191635a |= 4;
                                ciwz ciwz3 = (ciwz) bxvd2.mo74062i();
                                cixb cixb2 = ciwq.f191608a;
                                bxvd bxvd3 = (bxvd) cixb2.mo74142c(5);
                                bxvd3.mo73625a((bxvk) cixb2);
                                ciww ciww = (ciww) bxvd3;
                                if (ciww.f164950c) {
                                    ciww.mo74035c();
                                    ciww.f164950c = false;
                                }
                                cixb cixb3 = (cixb) ciww.f164949b;
                                cixb cixb4 = cixb.f191646m;
                                ciwz3.getClass();
                                cixb3.f191654g = ciwz3;
                                cixb3.f191648a |= 32;
                                ciwq.f191608a = (cixb) ciww.mo74062i();
                                civn.f191533b.mo54424a(civn.f191536e, a3);
                            }
                            bqgg = bqga.m112775a(new aytj(ciwc.mo86602a(), ciwc.mo86603b() == 3 ? 12 : 11));
                        } else {
                            throw new IllegalStateException("rpcClient mist be not null in order to get prekeys");
                        }
                        aytj aytj = (aytj) bqgg.get();
                        if (aytj == null) {
                            azoj.m85933c("encryption", "Failed to encrypt msg", new Object[0]);
                            return null;
                        }
                        bxvd da4 = cbil.f177257h.mo74144da();
                        bxvd da5 = cbmp.f177663b.mo74144da();
                        bxtx a6 = bxtx.m123261a(aytj.f98448a);
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        a6.getClass();
                        ((cbmp) da5.f164949b).f177665a = a6;
                        cbmp cbmp = (cbmp) da5.mo74062i();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        cbil cbil3 = (cbil) da4.f164949b;
                        cbmp.getClass();
                        cbil3.f177260b = cbmp;
                        cbil3.f177259a = 11;
                        if (aytj.f98449b != 11) {
                            i = 13;
                        } else {
                            i = 12;
                        }
                        cbil3.f177261c = cbik.m127887a(i);
                        cbil cbil4 = (cbil) da4.mo74062i();
                        return cbil4;
                    } catch (IllegalStateException | InterruptedException | ExecutionException e3) {
                        azoj.m85931a("encryption", e3, "Failed to encrypt msg", new Object[0]);
                        return null;
                    }
                } else {
                    Object[] objArr = new Object[1];
                    int b3 = cbik.m127888b(cbil2.f177261c);
                    objArr[0] = Integer.valueOf(cbik.m127887a(b3 == 0 ? 1 : b3));
                    azoj.m85933c("encryption", "Unsupported format: %s", objArr);
                    return null;
                }
            } else {
                azoj.m85933c("encryption", "Not an encrypted conversation", new Object[0]);
                return null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0243, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0249, code lost:
        r9 = (p000.cixb) r12.f164949b;
        r3.getClass();
        r9.f191648a |= 4;
        r9.f191651d = r3;
        r2.f191608a = (p000.cixb) r12.mo74062i();
        r3 = r10.f191582a.f191526a;
        r9 = r2.f191608a;
        r12 = (p000.bxvd) r9.mo74142c(5);
        r12.mo73625a((p000.bxvk) r9);
        r12 = (p000.ciww) r12;
        r3 = p000.bxtx.m123261a(r3.mo86588a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x027c, code lost:
        if (r12.f164950c != false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027f, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0285, code lost:
        r9 = (p000.cixb) r12.f164949b;
        r3.getClass();
        r9.f191648a |= 2;
        r9.f191650c = r3;
        r2.f191608a = (p000.cixb) r12.mo74062i();
        r3 = new java.io.ByteArrayOutputStream();
        r11 = new byte[32];
        java.util.Arrays.fill(r11, (byte) -1);
        r3.write(r11);
        r3.write(p000.civq.m151053a(r10.f191586e.f191525a, r10.f191583b.f191541b));
        r3.write(p000.civq.m151053a(r10.f191587f, r10.f191582a.f191527b));
        r3.write(p000.civq.m151053a(r10.f191587f, r10.f191583b.f191541b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02db, code lost:
        if (r10.f191584c.mo86624a() == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02dd, code lost:
        r3.write(p000.civq.m151053a(r10.f191587f, ((p000.civt) r10.f191584c.mo86625b()).f191541b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02f0, code lost:
        r3 = r3.toByteArray();
        r11 = new p000.civy();
        r3 = p000.cixd.m151109a(r11.mo86600a(r3, "WhisperText".getBytes(), 64), 32, 32);
        r9 = new p000.ciwj(new p000.ciwk(r11, r3[0]), new p000.ciwh(r11, r3[1], 0));
        r2.mo86610a(r10.f191585d, r9.f191598b);
        r2.mo86611a(r9.f191597a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r2 = r4.f191602a;
        r3 = r2.f191608a;
        r10 = (p000.bxvd) r3.mo74142c(5);
        r10.mo73625a((p000.bxvk) r3);
        r10 = (p000.ciww) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x033d, code lost:
        if (r10.f164950c != false) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0340, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0346, code lost:
        r3 = (p000.cixb) r10.f164949b;
        r3.f191648a |= 512;
        r3.f191658k = 0;
        r2.f191608a = (p000.cixb) r10.mo74062i();
        r2 = r4.f191602a;
        r3 = r7.f191548b;
        r9 = r2.f191608a;
        r11 = (p000.bxvd) r9.mo74142c(5);
        r11.mo73625a((p000.bxvk) r9);
        r11 = (p000.ciww) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x036f, code lost:
        if (r11.f164950c != false) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0372, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0378, code lost:
        r9 = (p000.cixb) r11.f164949b;
        r9.f191648a |= com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        r9.f191657j = r3;
        r2.f191608a = (p000.cixb) r11.mo74062i();
        r2 = r4.f191602a;
        r3 = r7.f191553g.mo86595a();
        r9 = r2.f191608a;
        r11 = (p000.bxvd) r9.mo74142c(5);
        r11.mo73625a((p000.bxvk) r9);
        r11 = (p000.ciww) r11;
        r3 = p000.bxtx.m123261a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03a8, code lost:
        if (r11.f164950c != false) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03ab, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03b1, code lost:
        r9 = (p000.cixb) r11.f164949b;
        r3.getClass();
        r9.f191648a |= 2048;
        r9.f191659l = r3;
        r2.f191608a = (p000.cixb) r11.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03ce, code lost:
        if (r7.f191549c.mo86624a() == false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03df, code lost:
        if (((java.lang.Integer) r7.f191549c.mo86625b()).intValue() == 16777215) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03e1, code lost:
        r2 = r7.f191549c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03e4, code lost:
        r2 = p000.cixg.f191671a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x043e, code lost:
        throw new p000.civh("No such SignedPreKeyRecord!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r4 == 13) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0155, code lost:
        r2 = r5.f191529b;
        r9 = r7.f191550d;
        r2 = ((p000.aytn) r2).f98454b.f98462a;
        p000.ayti.m84787a();
        r2 = (p000.ciws) p000.ayti.m84786a(r2.f98447a, 1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016a, code lost:
        if (r2 == null) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016c, code lost:
        r2 = r2.mo86618a();
        r9 = new p000.ciwf();
        r9.f191581f = r7.f191553g;
        r9.f191580e = r7.f191551e;
        r9.f191576a = r5.f191530c.mo54421a();
        r9.f191577b = r2;
        r9.f191579d = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018f, code lost:
        if (r7.f191549c.mo86624a() == false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0191, code lost:
        r2 = r5.f191528a;
        r10 = ((java.lang.Integer) r7.f191549c.mo86625b()).intValue();
        r2 = ((p000.aytn) r2).f98453a.f98452a;
        p000.ayti.m84787a();
        r2 = (p000.ciwm) p000.ayti.m84786a(r2.f98447a, 0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b0, code lost:
        if (r2 == null) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b2, code lost:
        r9.f191578c = p000.cixh.m151114a(r2.mo86607a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c4, code lost:
        throw new p000.civh("No such PreKeyRecord!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c5, code lost:
        r9.f191578c = p000.cixg.f191671a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01cb, code lost:
        if (r4.f191604c != false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01cd, code lost:
        r4.mo86608a(new p000.ciwq());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d5, code lost:
        r2 = r4.f191602a;
        r10 = new p000.ciwg(r9.f191576a, r9.f191577b, r9.f191579d, r9.f191578c, r9.f191580e, r9.f191581f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r3 = r2.f191608a;
        r11 = (p000.bxvd) r3.mo74142c(5);
        r11.mo73625a((p000.bxvk) r3);
        r11 = (p000.ciww) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0206, code lost:
        if (r11.f164950c != false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0209, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x020f, code lost:
        r3 = (p000.cixb) r11.f164949b;
        r9 = p000.cixb.f191646m;
        r3.f191648a |= 1;
        r3.f191649b = 3;
        r2.f191608a = (p000.cixb) r11.mo74062i();
        r3 = r10.f191586e;
        r9 = r2.f191608a;
        r12 = (p000.bxvd) r9.mo74142c(5);
        r12.mo73625a((p000.bxvk) r9);
        r12 = (p000.ciww) r12;
        r3 = p000.bxtx.m123261a(r3.mo86588a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0240, code lost:
        if (r12.f164950c != false) goto L_0x0243;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0402 A[Catch:{ IOException -> 0x042f, all -> 0x00e9, all -> 0x043f }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0155 A[EDGE_INSN: B:361:0x0155->B:78:0x0155 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0106 A[Catch:{ IOException -> 0x042f, all -> 0x00e9, all -> 0x043f }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013b A[Catch:{ IOException -> 0x042f, all -> 0x00e9, all -> 0x043f }] */
    /* renamed from: a */
    public final synchronized cbil mo54583a(LocalEntityId localEntityId, aznz aznz, cbil cbil) {
        cbmp cbmp;
        byte[] bArr;
        cbin cbin;
        cbif cbif;
        cbih cbih;
        cbiv cbiv;
        byte[] a;
        Cursor query;
        cive cive;
        cixh cixh;
        Iterator it;
        cbil cbil2 = cbil;
        synchronized (this) {
            try {
                azox.m85982b();
                if (cbil2 != null) {
                    int b = cbik.m127888b(cbil2.f177261c);
                    int i = 12;
                    if (b != 0) {
                        if (b == 12) {
                            if (!aznz.mo55105c()) {
                                azoj.m85933c("encryption", "Only 1:1 conversation is supported", new Object[0]);
                                return null;
                            } else if (aznz.mo55106d()) {
                                if (cbil2.f177259a == 11) {
                                    cbmp = (cbmp) cbil2.f177260b;
                                } else {
                                    cbmp = cbmp.f177663b;
                                }
                                byte[] k = cbmp.f177665a.mo73780k();
                                int b2 = cbik.m127888b(cbil2.f177261c);
                                if (b2 != 0) {
                                    if (b2 == 12) {
                                        i = 11;
                                    }
                                }
                                aytj aytj = new aytj(k, i);
                                try {
                                    aytp c = mo54586c();
                                    String localEntityId2 = localEntityId.toString();
                                    civo civo = new civo(localEntityId2);
                                    aytn aytn = c.f98459b;
                                    civn civn = new civn(aytn, aytn, aytn, aytn, civo);
                                    if (aytj.f98449b - 2 != 9) {
                                        ciwb ciwb = new ciwb(aytj.f98448a);
                                        c.f98459b.mo54422a(localEntityId2, ciwb.f191551e);
                                        synchronized (civn.f191532a) {
                                            try {
                                                ciwo a2 = civn.f191533b.mo54423a(civn.f191536e);
                                                civm civm = civn.f191534c;
                                                cive cive2 = ciwb.f191551e;
                                                ciwl ciwl = civm.f191530c;
                                                String str = civm.f191531d.f191537a;
                                                ayti ayti = ((aytn) ciwl).f98455c.f98450a;
                                                ayti.m84787a();
                                                query = ayti.f98447a.query("crypto_identity_keys", new String[]{"identity_key"}, "sender=?", new String[]{str}, null, null, null, null);
                                                if (query != null) {
                                                    try {
                                                        if (query.moveToFirst()) {
                                                            cive = new cive(query.getBlob(0));
                                                            query.close();
                                                            if (cive != null) {
                                                                if (!cive.equals(cive2)) {
                                                                    throw new civp();
                                                                }
                                                            }
                                                            int i2 = ciwb.f191547a;
                                                            byte[] a3 = ciwb.f191553g.mo86595a();
                                                            if (a2.f191602a.mo86613b() != i2 || !Arrays.equals(a3, a2.f191602a.mo86612a())) {
                                                                it = a2.f191603b.iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        break;
                                                                    }
                                                                    ciwq ciwq = (ciwq) it.next();
                                                                    if (ciwq.mo86613b() == i2 && Arrays.equals(a3, ciwq.mo86612a())) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            cixh = cixg.f191671a;
                                                            civm.f191530c.mo54422a(civm.f191531d.f191537a, cive2);
                                                            bArr = civn.mo86591a(a2, ciwb.f191552f);
                                                            civn.f191533b.mo54424a(civn.f191536e, a2);
                                                            if (cixh.mo86624a()) {
                                                                ciwn ciwn = civn.f191535d;
                                                                int intValue = ((Integer) cixh.mo86625b()).intValue();
                                                                ayti ayti2 = ((aytn) ciwn).f98453a.f98452a;
                                                                ayti.m84787a();
                                                                ayti2.f98447a.delete("crypto_pre_keys", "key_type=? AND key_id=?", new String[]{"0", String.valueOf(intValue)});
                                                            }
                                                        }
                                                    } catch (civg e) {
                                                        aytl.m84793a("DatabaseOperations", "EncryptionIdentityKey: Sender %s has invalid identity key", str);
                                                    }
                                                }
                                                if (query != null) {
                                                    query.close();
                                                }
                                                cive = null;
                                                if (cive != null) {
                                                }
                                                int i22 = ciwb.f191547a;
                                                byte[] a32 = ciwb.f191553g.mo86595a();
                                                it = a2.f191603b.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                    }
                                                }
                                                cixh = cixg.f191671a;
                                                civm.f191530c.mo54422a(civm.f191531d.f191537a, cive2);
                                                bArr = civn.mo86591a(a2, ciwb.f191552f);
                                                civn.f191533b.mo54424a(civn.f191536e, a2);
                                                if (cixh.mo86624a()) {
                                                }
                                            } catch (IOException e2) {
                                                throw new AssertionError(e2);
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    } else {
                                        ciwc ciwc = new ciwc(aytj.f98448a);
                                        synchronized (civn.f191532a) {
                                            if (civn.f191533b.mo54425b(civn.f191536e)) {
                                                ciwo a4 = civn.f191533b.mo54423a(civn.f191536e);
                                                a = civn.mo86591a(a4, ciwc);
                                                civn.f191533b.mo54424a(civn.f191536e, a4);
                                            } else {
                                                String valueOf = String.valueOf(civn.f191536e);
                                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                                                sb.append("No session for: ");
                                                sb.append(valueOf);
                                                throw new civl(sb.toString());
                                            }
                                        }
                                        bArr = a;
                                    }
                                    cbav cbav = (cbav) azol.m85935a((bxxk) cbav.f176502d.mo74142c(7), bArr);
                                    if (cbav == null) {
                                        return null;
                                    }
                                    bxvd da = cbil.f177257h.mo74144da();
                                    bxte bxte = cbav.f176506c;
                                    if (bxte != null) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bxte.getClass();
                                        ((cbil) da.f164949b).f177262d = bxte;
                                    }
                                    int i3 = cbav.f176504a;
                                    if (i3 == 1) {
                                        cbbb cbbb = (cbbb) cbav.f176505b;
                                        if (cbbb != null) {
                                            bxvd da2 = cbiv.f177303b.mo74144da();
                                            String str2 = cbbb.f176527a;
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            str2.getClass();
                                            ((cbiv) da2.f164949b).f177305a = str2;
                                            cbiv = (cbiv) da2.mo74062i();
                                        } else {
                                            cbiv = null;
                                        }
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        cbil cbil3 = (cbil) da.f164949b;
                                        cbiv.getClass();
                                        cbil3.f177260b = cbiv;
                                        cbil3.f177259a = 1;
                                        cbil3.f177261c = cbik.m127887a(3);
                                    } else if (i3 == 3) {
                                        cbat cbat = (cbat) cbav.f176505b;
                                        if (cbat != null) {
                                            bxvd da3 = cbih.f177242h.mo74144da();
                                            if (!cbat.f176491c.isEmpty()) {
                                                String str3 = cbat.f176491c;
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                str3.getClass();
                                                ((cbih) da3.f164949b).f177246c = str3;
                                            }
                                            if (!cbat.f176490b.isEmpty()) {
                                                String str4 = cbat.f176490b;
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                str4.getClass();
                                                ((cbih) da3.f164949b).f177245b = str4;
                                            }
                                            if (!cbat.f176489a.isEmpty()) {
                                                String str5 = cbat.f176489a;
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                str5.getClass();
                                                ((cbih) da3.f164949b).f177244a = str5;
                                            }
                                            if (!cbat.f176492d.isEmpty()) {
                                                String str6 = cbat.f176492d;
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                str6.getClass();
                                                ((cbih) da3.f164949b).f177247d = str6;
                                            }
                                            if (!cbat.f176494f.isEmpty()) {
                                                String str7 = cbat.f176494f;
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                str7.getClass();
                                                ((cbih) da3.f164949b).f177249f = str7;
                                            }
                                            if (!azpi.m86080b(cbat.f176493e.mo73780k())) {
                                                bxvd da4 = cbio.f177277c.mo74144da();
                                                bxvd da5 = cbhy.f177214d.mo74144da();
                                                bxtx bxtx = cbat.f176493e;
                                                if (da5.f164950c) {
                                                    da5.mo74035c();
                                                    da5.f164950c = false;
                                                }
                                                cbhy cbhy = (cbhy) da5.f164949b;
                                                bxtx.getClass();
                                                cbhy.f177216a = 1;
                                                cbhy.f177217b = bxtx;
                                                cbhy cbhy2 = (cbhy) da5.mo74062i();
                                                if (da4.f164950c) {
                                                    da4.mo74035c();
                                                    da4.f164950c = false;
                                                }
                                                cbhy2.getClass();
                                                ((cbio) da4.f164949b).f177279a = cbhy2;
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                cbio cbio = (cbio) da4.mo74062i();
                                                cbio.getClass();
                                                ((cbih) da3.f164949b).f177248e = cbio;
                                            }
                                            cbih = (cbih) da3.mo74062i();
                                        } else {
                                            cbih = null;
                                        }
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        cbil cbil4 = (cbil) da.f164949b;
                                        cbih.getClass();
                                        cbil4.f177260b = cbih;
                                        cbil4.f177259a = 6;
                                        cbil4.f177261c = cbik.m127887a(6);
                                    } else if (i3 != 6) {
                                        azoj.m85933c("encryption", "Unsupported msg", new Object[0]);
                                    } else {
                                        cbau cbau = (cbau) cbav.f176505b;
                                        if (cbau != null) {
                                            bxvd da6 = cbin.f177270f.mo74144da();
                                            if (!cbau.f176499c.isEmpty()) {
                                                String str8 = cbau.f176499c;
                                                if (da6.f164950c) {
                                                    da6.mo74035c();
                                                    da6.f164950c = false;
                                                }
                                                cbin cbin2 = (cbin) da6.f164949b;
                                                str8.getClass();
                                                cbin2.f177272a = 2;
                                                cbin2.f177273b = str8;
                                            } else {
                                                bxtx bxtx2 = cbau.f176498b;
                                                if (da6.f164950c) {
                                                    da6.mo74035c();
                                                    da6.f164950c = false;
                                                }
                                                cbin cbin3 = (cbin) da6.f164949b;
                                                bxtx2.getClass();
                                                cbin3.f177272a = 5;
                                                cbin3.f177273b = bxtx2;
                                            }
                                            String str9 = cbau.f176500d;
                                            str9.getClass();
                                            ((cbin) da6.f164949b).f177274c = str9;
                                            cbas cbas = cbau.f176501e;
                                            if (cbas == null) {
                                                cbas = cbas.f176484b;
                                            }
                                            if (cbas != null) {
                                                bxvd da7 = cbif.f177235b.mo74144da();
                                                if (cbas.f176486a != null) {
                                                    bxvd da8 = cbiq.f177285d.mo74144da();
                                                    cbba cbba = cbas.f176486a;
                                                    if (cbba == null) {
                                                        cbba = cbba.f176520d;
                                                    }
                                                    bxtx bxtx3 = cbba.f176522a;
                                                    if (da8.f164950c) {
                                                        da8.mo74035c();
                                                        da8.f164950c = false;
                                                    }
                                                    bxtx3.getClass();
                                                    ((cbiq) da8.f164949b).f177287a = bxtx3;
                                                    cbba cbba2 = cbas.f176486a;
                                                    if (cbba2 == null) {
                                                        cbba2 = cbba.f176520d;
                                                    }
                                                    bxtx bxtx4 = cbba2.f176523b;
                                                    if (da8.f164950c) {
                                                        da8.mo74035c();
                                                        da8.f164950c = false;
                                                    }
                                                    bxtx4.getClass();
                                                    ((cbiq) da8.f164949b).f177288b = bxtx4;
                                                    cbba cbba3 = cbas.f176486a;
                                                    if (cbba3 == null) {
                                                        cbba3 = cbba.f176520d;
                                                    }
                                                    int i4 = cbba3.f176524c;
                                                    if (da8.f164950c) {
                                                        da8.mo74035c();
                                                        da8.f164950c = false;
                                                    }
                                                    ((cbiq) da8.f164949b).f177289c = i4;
                                                    if (da7.f164950c) {
                                                        da7.mo74035c();
                                                        da7.f164950c = false;
                                                    }
                                                    cbiq cbiq = (cbiq) da8.mo74062i();
                                                    cbiq.getClass();
                                                    ((cbif) da7.f164949b).f177237a = cbiq;
                                                }
                                                cbif = (cbif) da7.mo74062i();
                                            } else {
                                                cbif = null;
                                            }
                                            if (cbif != null) {
                                                if (da6.f164950c) {
                                                    da6.mo74035c();
                                                    da6.f164950c = false;
                                                }
                                                cbif.getClass();
                                                ((cbin) da6.f164949b).f177276e = cbif;
                                            }
                                            if (!cbau.f176497a.mo73779j()) {
                                                bxvd da9 = cbio.f177277c.mo74144da();
                                                bxvd da10 = cbhy.f177214d.mo74144da();
                                                bxtx bxtx5 = cbau.f176497a;
                                                if (da10.f164950c) {
                                                    da10.mo74035c();
                                                    da10.f164950c = false;
                                                }
                                                cbhy cbhy3 = (cbhy) da10.f164949b;
                                                bxtx5.getClass();
                                                cbhy3.f177216a = 1;
                                                cbhy3.f177217b = bxtx5;
                                                cbhy cbhy4 = (cbhy) da10.mo74062i();
                                                if (da9.f164950c) {
                                                    da9.mo74035c();
                                                    da9.f164950c = false;
                                                }
                                                cbhy4.getClass();
                                                ((cbio) da9.f164949b).f177279a = cbhy4;
                                                if (da6.f164950c) {
                                                    da6.mo74035c();
                                                    da6.f164950c = false;
                                                }
                                                cbio cbio2 = (cbio) da9.mo74062i();
                                                cbio2.getClass();
                                                ((cbin) da6.f164949b).f177275d = cbio2;
                                            }
                                            cbin = (cbin) da6.mo74062i();
                                        } else {
                                            cbin = null;
                                        }
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        cbil cbil5 = (cbil) da.f164949b;
                                        cbin.getClass();
                                        cbil5.f177260b = cbin;
                                        cbil5.f177259a = 2;
                                        cbil5.f177261c = cbik.m127887a(4);
                                    }
                                    cbil cbil6 = (cbil) da.mo74062i();
                                    return cbil6;
                                } catch (bxzp | civd | civg | civh | civi | civj | civk | civl | civp | IllegalStateException e3) {
                                    azoj.m85931a("encryption", e3, "Failed to decrypt msg", new Object[0]);
                                    return null;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            } else {
                                azoj.m85933c("encryption", "Not an encrypted conversation", new Object[0]);
                                return null;
                            }
                        }
                    }
                    int b3 = cbik.m127888b(cbil2.f177261c);
                    if (b3 == 0) {
                    }
                }
                azoj.m85933c("encryption", "Not a encrypted msg", new Object[0]);
                return null;
            } finally {
                Throwable th3 = th;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public final synchronized List mo54584a() {
        bxvd da;
        cbmj cbmj;
        azox.m85982b();
        try {
            da = cbnr.f177750d.mo74144da();
            aytp c = mo54586c();
            int bx = (int) cfeo.f183719a.mo6606a().mo81043bx();
            ArrayList arrayList = new ArrayList();
            int b = c.f98458a.mo54420b();
            for (int i = 0; i < bx; i++) {
                b = aytp.m84804a(b);
                ciwm ciwm = new ciwm(b, civq.m151051a());
                ayti ayti = c.f98459b.f98453a.f98452a;
                ayti.m84787a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("key_type", (Integer) 0);
                contentValues.put("key_id", Integer.valueOf(b));
                contentValues.put("key_record", ciwm.f191601a.mo73642k());
                contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                ayti.f98447a.insertWithOnConflict("crypto_pre_keys", null, contentValues, 5);
                bxvd da2 = cbmj.f177631d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((cbmj) da2.f164949b).f177633a = b;
                bxtx a = bxtx.m123261a(ciwm.mo86607a().f191540a.mo86595a());
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                a.getClass();
                ((cbmj) da2.f164949b).f177634b = a;
                arrayList.add((cbmj) da2.mo74062i());
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbnr cbnr = (cbnr) da.f164949b;
            if (!cbnr.f177753b.mo73666a()) {
                cbnr.f177753b = bxvk.m124021a(cbnr.f177753b);
            }
            bxsy.m123078a(arrayList, cbnr.f177753b);
            aytp c2 = mo54586c();
            try {
                int a2 = aytp.m84804a(c2.f98458a.mo54420b());
                civf a3 = c2.f98459b.mo54421a();
                civt a4 = civq.m151051a();
                ciws ciws = new ciws(a2, System.currentTimeMillis(), a4, civq.m151052a(a3.f191527b, a4.f191540a.mo86595a()));
                ayti ayti2 = c2.f98459b.f98454b.f98462a;
                ayti.m84787a();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("key_type", (Integer) 1);
                contentValues2.put("key_id", Integer.valueOf(a2));
                contentValues2.put("key_record", ciws.f191609a.mo73642k());
                contentValues2.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                ayti2.f98447a.insertWithOnConflict("crypto_pre_keys", null, contentValues2, 5);
                bxvd da3 = cbmj.f177631d.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((cbmj) da3.f164949b).f177633a = a2;
                bxtx a5 = bxtx.m123261a(ciws.mo86618a().f191540a.mo86595a());
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                a5.getClass();
                ((cbmj) da3.f164949b).f177634b = a5;
                bxtx a6 = bxtx.m123261a(ciws.f191609a.f191666e.mo73780k());
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                a6.getClass();
                ((cbmj) da3.f164949b).f177635c = a6;
                cbmj = (cbmj) da3.mo74062i();
            } catch (civg e) {
                aytl.m84794a("SignalClient", e, "cannot generate signed prekey", new Object[0]);
                cbmj = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbnr cbnr2 = (cbnr) da.f164949b;
            cbmj.getClass();
            if (!cbnr2.f177754c.mo73666a()) {
                cbnr2.f177754c = bxvk.m124021a(cbnr2.f177754c);
            }
            cbnr2.f177754c.add(cbmj);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbnr) da.f164949b).f177752a = 3;
        } catch (IllegalStateException e2) {
            azoj.m85931a("encryption", e2, "Failed to generate prekeys bundle", new Object[0]);
            return null;
        }
        return bngx.m109356a((cbnr) da.mo74062i());
    }
}
