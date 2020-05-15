package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: vib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vib implements Runnable {

    /* renamed from: a */
    final /* synthetic */ vhz f49315a;

    public vib(vhz vhz) {
        this.f49315a = vhz;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:66:0x0093 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:62:0x0093 */
    /* JADX WARN: Type inference failed for: r8v0, assign insn: 0x001f: CONST  (r8v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean], assign insn: PHI: (r8v1 ?) = (r8v0 ?), (r8v2 ?) binds: [B:2:?, B:62:0x0093] */
    /* JADX WARN: Type inference failed for: r8v2, assign insn: PHI: (r8v2 ?) = (r8v3 ?), (r8v4 ?), (r8v1 ?) binds: [B:68:0x0093, B:67:0x0093, B:66:0x0093] */
    /* JADX WARN: Type inference failed for: r8v3, assign insn: 0x022c: CONST  (r8v3 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r8v4, assign insn: 0x0203: CONST  (r8v4 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d3, code lost:
        if (r0.f48227e != false) goto L_0x00d5;
     */
    public final void run() {
        vhz vhz = this.f49315a;
        vhu vhu = vhz.f49311e;
        ? r8 = 0;
        int i = 1;
        uig uig = new uig(vhu.f49296a, vhu.f49296a.mo27468a(umq.f48248a.mo27735b(), (String[]) null, uoh.m39066a(uoh.m39072b(ump.HAS_PENDING_CHANGES.f48247n.mo27717e(1L), ump.REQUIRES_SYNC.f48247n.mo27717e(1L), ump.HISTORY_LENGTH.f48247n.mo27715d((long) ((Integer) twy.f46858ap.mo58455c()).intValue())), uoh.m39072b(ump.ENTRY_ID.f48247n.mo27714d(), ump.RESOURCE_ID.f48247n.mo27714d())), (String) null), new umm(vhu.f49297b));
        try {
            vhz.f49307a.mo25369a("Syncing/compacting %s Realtime documents...", Integer.valueOf(uig.size()));
            Iterator it = uig.iterator();
            while (it.hasNext()) {
                vhb vhb = (vhb) it.next();
                try {
                    sbw sbw = vhz.f49307a;
                    Object[] objArr = new Object[i];
                    objArr[r8] = vhb;
                    sbw.mo25369a("Syncing/compacting realtime document: %s", objArr);
                    sdo.m34959a(vhb.f49249a);
                    String str = vhb.f49249a.f30728a;
                    vhs a = vhz.f49311e.mo28471a(vhb, r8);
                    if (a == null) {
                        try {
                            sbw sbw2 = vhz.f49307a;
                            Object[] objArr2 = new Object[i];
                            objArr2[r8] = vhb;
                            sbw2.mo25369a("Realtime document is in use; skipping: %s", objArr2);
                        } catch (bknn e) {
                            if (e.f124947a) {
                                vhz.f49307a.mo25369a("Fatal sync error for %s", str);
                                vhz.f49311e.mo28472a(Arrays.asList(vhb));
                            }
                            throw e;
                        } catch (Throwable th) {
                            if (a != null) {
                                new vhl(a, vhz.f49312f, false).mo6502a(vhz.f49308b);
                            }
                            throw th;
                        }
                    } else {
                        umn h = a.mo28470h();
                        if (h.f48228f) {
                        }
                        if (vhz.f49313g.mo28343a()) {
                            sbw sbw3 = vhz.f49307a;
                            Object[] objArr3 = new Object[i];
                            objArr3[r8] = str;
                            sbw3.mo25369a("Syncing Realtime document: %s", objArr3);
                            vhy vhy = new vhy(vhz, a);
                            uey a2 = vhz.f49310d.mo27392a(vhb.f49252d.f47683b, vhb.f49253e);
                            bknd bknd = new bknd((String) twy.f46862at.mo58455c(), "android", Integer.toString(6000000), new vgx(vhz.f49308b, a2), new vhv(vhy), new bkpg(new vhh(Integer.MAX_VALUE, Integer.valueOf(a2.mo27262a(vhz.f49308b).f30212b))), new vhx());
                            if (a.mo28463a()) {
                                bklw b = a.mo28464b();
                                bkpx bkpx = b.f124858a.f125099a;
                                bkrb bkrb = b.f124859b;
                                Logger logger = bkma.f124865a;
                                Level level = Level.INFO;
                                String valueOf = String.valueOf(str);
                                logger.logp(level, "com.google.apps.brix.api.client.cache.sync.OtStateSyncer", "syncOtState", valueOf.length() == 0 ? new String("Synchronizing file: ") : "Synchronizing file: ".concat(valueOf));
                                bknp b2 = bknd.mo66138b(str, bkpx.f125106c);
                                b2.mo66132c();
                                bkmo bkmo = new bkmo(b2, null, bklx.f124860a, new bkly(), bkpx);
                                bkmo.mo66121a(new bklz(vhy, bkrb, b2));
                                bkmo.mo66115a();
                            } else {
                                bknd.mo66136a(str, vhy);
                            }
                            if (!vhy.f49303b.await(60, TimeUnit.SECONDS)) {
                                throw new TimeoutException("Sync timed out.");
                            } else if (!vhy.f49304c) {
                                throw vhy.f49305d;
                            }
                        } else {
                            vhz.f49307a.mo25369a("Skipping sync for Realtime document (device is offline): %s", vhb);
                        }
                        new vhm(a, vhz.f49309c).mo6502a(vhz.f49308b);
                        new vhl(a, vhz.f49312f, false).mo6502a(vhz.f49308b);
                        i = 1;
                        r8 = 0;
                    }
                } catch (Exception e2) {
                    vhz.f49307a.mo25376c(String.format("Unexpected error during sync/compaction for Realtime document: %s", vhb));
                    i = 1;
                    r8 = 0;
                }
            }
            vhz.f49307a.mo25371b("Syncing/compacting complete.");
        } catch (Exception e3) {
            vhz.f49307a.mo25376c("Syncing/compacting failed.");
        } catch (Throwable th2) {
            uig.close();
            throw th2;
        }
        uig.close();
    }
}
