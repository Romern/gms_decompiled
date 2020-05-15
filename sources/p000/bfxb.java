package p000;

import android.location.Location;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: bfxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxb {

    /* renamed from: a */
    public final C1245ok f115570a = new C1245ok();

    /* renamed from: b */
    public final bfyi f115571b = ((bfyi) bfyj.f115690d.mo74144da());

    /* renamed from: c */
    private ArrayBlockingQueue f115572c = null;

    /* renamed from: d */
    private ArrayBlockingQueue f115573d = null;

    /* renamed from: e */
    private final int f115574e;

    public bfxb() {
        int geofencingLogRecordSize = (int) cexh.f183491a.mo6606a().geofencingLogRecordSize();
        if (geofencingLogRecordSize > 0) {
            if (cexh.m138383b()) {
                this.f115573d = new ArrayBlockingQueue(geofencingLogRecordSize);
            } else {
                this.f115572c = new ArrayBlockingQueue(geofencingLogRecordSize);
            }
        }
        this.f115574e = geofencingLogRecordSize;
    }

    /* renamed from: a */
    public final void mo62410a(int i, int i2) {
        if (cexh.m138385d()) {
            mo62417a(new bfxe(i, i2));
        }
    }

    /* renamed from: b */
    public final void mo62419b(int i, int i2) {
        if (cexh.m138385d()) {
            mo62417a(new bfxi(i, i2));
        }
    }

    /* renamed from: a */
    public final void mo62411a(int i, int i2, bfwf bfwf) {
        if (!cexh.m138385d()) {
            return;
        }
        if (bfwf != null) {
            mo62417a(new bfxl(i, bfwf.mo62357e(), i2));
        } else {
            mo62417a(new bfxl(i, null, i2));
        }
    }

    /* renamed from: a */
    public final void mo62412a(int i, Location location, int i2) {
        if (cexh.m138386e()) {
            mo62417a(new bfxh(i, location, i2));
        }
    }

    /* renamed from: a */
    public final void mo62413a(int i, List list, int i2, boolean z) {
        mo62417a(new bfxg(i, i2, z, list, this.f115570a, this.f115571b));
    }

    /* renamed from: a */
    public final void mo62414a(int i, boolean z, int i2) {
        if (cexh.m138386e()) {
            mo62417a(new bfxm(i, z, i2));
        }
    }

    /* renamed from: a */
    public final void mo62415a(int i, boolean z, String str) {
        mo62417a(new bfxn(i, str, z));
    }

    /* renamed from: a */
    public final synchronized void mo62416a(bfwz bfwz) {
        ArrayBlockingQueue arrayBlockingQueue = this.f115572c;
        if (arrayBlockingQueue != null) {
            if (arrayBlockingQueue.remainingCapacity() == 0) {
                this.f115572c.poll();
            }
            this.f115572c.add(bfwz);
        }
    }

    /* renamed from: a */
    public final synchronized void mo62417a(bfxk bfxk) {
        ArrayBlockingQueue arrayBlockingQueue = this.f115573d;
        if (arrayBlockingQueue != null) {
            if (arrayBlockingQueue.remainingCapacity() == 0) {
                this.f115573d.poll();
            }
            this.f115573d.add(bfxk);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015f, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo62418a(PrintWriter printWriter, List list) {
        int i = this.f115574e;
        StringBuilder sb = new StringBuilder(32);
        sb.append("LogRecords: capacity=");
        sb.append(i);
        printWriter.println(sb.toString());
        if (cexh.m138383b()) {
            if (this.f115573d != null) {
                bxvd da = bfxs.f115613d.mo74144da();
                Iterator it = list.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    bfwf bfwf = (bfwf) it.next();
                    this.f115570a.put(bfwf, Integer.valueOf(i2));
                    this.f115571b.mo62421a(bfwf.mo62357e());
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bfxs bfxs = (bfxs) da.f164949b;
                    if (!bfxs.f115617c.mo73666a()) {
                        bfxs.f115617c = bxvk.m124019a(bfxs.f115617c);
                    }
                    bfxs.f115617c.mo74153d(i2);
                    i2++;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long c = cexh.m138384c();
                Iterator it2 = this.f115573d.iterator();
                while (it2.hasNext()) {
                    bfxk bfxk = (bfxk) it2.next();
                    if (currentTimeMillis - ((bfxw) bfxk.f115591a.f164949b).f115635d <= c) {
                        bfxw a = bfxk.mo62420a();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bfxs bfxs2 = (bfxs) da.f164949b;
                        a.getClass();
                        if (!bfxs2.f115615a.mo73666a()) {
                            bfxs2.f115615a = bxvk.m124021a(bfxs2.f115615a);
                        }
                        bfxs2.f115615a.add(a);
                    }
                }
                bfyj bfyj = (bfyj) this.f115571b.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bfyj.getClass();
                ((bfxs) da.f164949b).f115616b = bfyj;
                bxvk g = da.mo74062i();
                printWriter.printf("### %s START ###%n", "GeofencerDumpsysLogMessage");
                try {
                    printWriter.println(boan.f132470d.mo68784a(bfcj.f113387a, 120).mo68794a(g.mo73642k()));
                } catch (RuntimeException e) {
                    printWriter.printf("ERROR: %s%n", e.getMessage());
                }
                printWriter.printf("### %s END ###%n", "GeofencerDumpsysLogMessage");
                this.f115570a.clear();
                bfyi bfyi = this.f115571b;
                bfyi.f164949b = (bxvk) bfyi.f164949b.mo74142c(4);
            }
        } else if (this.f115572c != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long c2 = cexh.m138384c();
            Iterator it3 = this.f115572c.iterator();
            while (it3.hasNext()) {
                bfwz bfwz = (bfwz) it3.next();
                if (currentTimeMillis2 - bfwz.f115568b <= c2) {
                    bfwz.mo62393a(printWriter);
                }
            }
        }
    }
}
