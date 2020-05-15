package p000;

import com.google.android.gms.gass.internal.ProgramResponse;
import java.io.IOException;

/* renamed from: dau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dau implements Runnable {

    /* renamed from: a */
    final /* synthetic */ dav f12703a;

    public dau(dav dav) {
        this.f12703a = dav;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x016e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r1.f12707d.mo16843a(4002, java.lang.System.currentTimeMillis() - r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x017c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x017d, code lost:
        r12.f12703a.f12707d.mo16843a(2023, -1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r4 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r4 = r4.f28157a;
        r6 = r4.f12814b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r10 = r4.f12815c;
        r9 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r9 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4 = new p000.aagm(r1.f12704a, r1.f12708e, r9, r10, r1.f12707d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r5 = (com.google.android.gms.gass.internal.ProgramResponse) r4.f28073b.poll(50000, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.mo16864a(2009, r4.f28074c, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1 = r12.f12703a;
        r2 = java.lang.System.currentTimeMillis();
        r4 = r1.f12705b.mo16890a();
        r5 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x018d A[SYNTHETIC] */
    public final void run() {
        dav dav;
        long currentTimeMillis;
        ProgramResponse programResponse;
        aagm aagm;
        synchronized (this.f12703a.f12711h) {
            if (!this.f12703a.f12712i) {
                this.f12703a.f12712i = true;
            } else {
                return;
            }
        }
        synchronized (this.f12703a.f12711h) {
            this.f12703a.f12712i = false;
        }
        return;
        aagm.mo16863a(3004, aagm.f28074c);
        if (programResponse != null) {
            if (programResponse.f32767c == 7) {
                aagb.f28052a = 3;
            } else {
                aagb.f28052a = 2;
            }
        }
        if (programResponse == null) {
            programResponse = aagm.m21221c();
        }
        byte[] bArr = programResponse.f32766b;
        if (bArr != null) {
            if (bArr.length != 0) {
                ByteString a = ByteString.m123261a(bArr);
                bxus c = bxus.m123744c();
                dch dch = dch.f12805e;
                try {
                    bxuc h = a.mo73764h();
                    GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) dch.mo74142c(4);
                    bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                    a2.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c);
                    a2.mo74225d(GeneratedMessageLite);
                    h.mo73787a(0);
                    GeneratedMessageLite.m124027b(GeneratedMessageLite);
                    dch dch2 = (dch) GeneratedMessageLite;
                    dci dci = dch2.f12808b;
                    if (dci == null) {
                        dci = dci.f12811g;
                    }
                    if (!dci.f12814b.isEmpty()) {
                        dci dci2 = dch2.f12808b;
                        if (dci2 == null) {
                            dci2 = dci.f12811g;
                        }
                        if (!dci2.f12815c.isEmpty() && dch2.f12810d.getKey().length != 0) {
                            aaia a3 = dav.f12705b.mo16890a();
                            if (a3 != null) {
                                dci dci3 = a3.f28157a;
                                dci dci4 = dch2.f12808b;
                                if (dci4 == null) {
                                    dci4 = dci.f12811g;
                                }
                                if (dci4.f12814b.equals(dci3.f12814b)) {
                                    dci dci5 = dch2.f12808b;
                                    if (dci5 == null) {
                                        dci5 = dci.f12811g;
                                    }
                                    if (dci5.f12815c.equals(dci3.f12815c)) {
                                    }
                                }
                            }
                            if (!dav.f12705b.mo16892a(dch2, dav.f12709f)) {
                                dav.f12707d.mo16842a(4009, System.currentTimeMillis() - currentTimeMillis);
                            } else {
                                dav.f12706c.mo16897a(dav.f12705b.mo16890a());
                                dav.f12710g = System.currentTimeMillis() / 1000;
                            }
                            synchronized (this.f12703a.f12711h) {
                            }
                        }
                    }
                    dav.f12707d.mo16842a(5010, System.currentTimeMillis() - currentTimeMillis);
                    synchronized (this.f12703a.f12711h) {
                    }
                } catch (IOException e) {
                    if (!(e.getCause() instanceof bxwf)) {
                        throw new bxwf(e.getMessage());
                    }
                    throw ((bxwf) e.getCause());
                } catch (RuntimeException e2) {
                    if (e2.getCause() instanceof bxwf) {
                        throw ((bxwf) e2.getCause());
                    }
                    throw e2;
                } catch (bxwf e3) {
                    throw e3;
                } catch (bxwf e4) {
                    throw e4;
                }
            }
        }
        dav.f12707d.mo16842a(5009, System.currentTimeMillis() - currentTimeMillis);
        synchronized (this.f12703a.f12711h) {
        }
    }
}
