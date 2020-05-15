package p000;

import com.android.volley.VolleyError;
import java.util.List;

/* renamed from: vfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vfm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ vfp f49176a;

    public vfm(vfp vfp) {
        this.f49176a = vfp;
    }

    public final void run() {
        uey uey;
        try {
            vfp vfp = this.f49176a;
            vfp.f49195h.clear();
            boolean z = false;
            while (true) {
                if (vfp.f49200m.mo28391b()) {
                    if (z) {
                        break;
                    }
                    uhn uhn = vfp.f49189b;
                    String a = uil.LAST_SYNC_SEQUENCE_NUMBER.f47705l.mo27700a();
                    String b = uim.f47706a.mo27735b();
                    String a2 = uim.f47706a.f48341a.mo27700a();
                    String a3 = ujr.ACCOUNT_ID.f47814c.mo27700a();
                    int length = String.valueOf(a).length();
                    StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(b).length() + String.valueOf(a2).length() + String.valueOf(a3).length());
                    sb.append("(SELECT ");
                    sb.append(a);
                    sb.append(" FROM ");
                    sb.append(b);
                    sb.append(" WHERE ");
                    sb.append(a2);
                    sb.append("=");
                    sb.append(a3);
                    sb.append(")");
                    String sb2 = sb.toString();
                    String a4 = ukm.LAST_SYNC_SEQUENCE_NUMBER.f48022aB.mo27700a();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a4).length() + 1 + String.valueOf(sb2).length());
                    sb3.append(a4);
                    sb3.append("<");
                    sb3.append(sb2);
                    uog a5 = uoh.m39060a(sb3.toString());
                    unp unp = ukm.PINNED.f48022aB;
                    long j = uml.UNPINNED.f48221d;
                    unp.mo27709b(1);
                    for (ujx ujx : ((ugx) uhn).mo27365a((uih) null, "EntryView", uoh.m39066a(uoh.m39068b(unp.mo27700a(), j), a5), (String) null).mo27502a()) {
                        vfp.f49188a.mo25369a("Stale pinned entry %s %s", ujx.mo27610g(), ujx.mo27538P());
                        if (!ujx.mo27566ab()) {
                            if (!ujx.mo27573ai()) {
                                uey = uey.m38255a(vfp.f49189b.mo27427c(ujx.mo27567ac()));
                            } else {
                                uey = vfp.mo28401b(ujx);
                                if (uey == null) {
                                }
                            }
                            try {
                                vfp.f49196i.mo28207a(uey, ujx.mo27616i(), vks.f49399a);
                            } catch (VolleyError | gid e) {
                                vfp.f49188a.mo25369a("%s sync failed", ujx);
                            }
                        }
                    }
                    List<ujx> a6 = ((ugx) vfp.f49189b).mo27365a((uih) null, "PinnedDownloadRequiredView", uoh.f48391a, (String) null).mo27502a();
                    synchronized (vfp.f49194g) {
                        for (ujx ujx2 : a6) {
                            if (vfp.f49194g.size() >= ((Integer) twy.f46843aa.mo58455c()).intValue()) {
                                break;
                            } else if (!vfp.f49194g.containsKey(ujx2.mo27551a())) {
                                uih c = vfp.f49189b.mo27427c(ujx2.mo27567ac());
                                veq a7 = vfp.f49199l.mo28379a(true, null);
                                a7.mo28374c(null);
                                int a8 = vfp.mo28397a(ujx2, a7);
                                if (a8 == 1) {
                                    vfp.f49188a.mo25368a("PinnedContentDownloader", "Queueing download of file (%s of %s): %s", Integer.valueOf(vfp.f49194g.size() + 1), twy.f46843aa.mo58455c(), ujx2.mo27551a());
                                    ukk a9 = ujx2.mo27551a();
                                    vfn vfn = new vfn(vfp, c, a9, a7);
                                    vfp.f49194g.put(a9, vfn);
                                    ((soc) vfp.f49193f).submit(vfn);
                                } else {
                                    vfp.mo28400a(ujx2, a8);
                                    a7.mo28378f();
                                }
                            }
                        }
                        z = vfp.f49194g.isEmpty();
                        if (!z) {
                            vfp.f49194g.wait();
                        }
                    }
                } else {
                    break;
                }
            }
            vfp.f49188a.mo25366a("PinnedContentDownloader", !z ? "Stopped downloading pinned content because the device is offline." : "Finished downloading pinned content.");
        } catch (InterruptedException e2) {
        } catch (Exception e3) {
            vfp.f49188a.mo25378c("PinnedContentDownloader", "Pinned content download task failed.", e3);
        }
    }
}
