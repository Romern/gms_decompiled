package p000;

import android.content.Context;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.gass.internal.ProgramResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* renamed from: aahg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aahg extends aahl {

    /* renamed from: a */
    public final vyu f28125a;

    /* renamed from: c */
    private final aahj f28126c;

    /* renamed from: d */
    private final aagi f28127d;

    /* renamed from: e */
    private final dcg f28128e;

    public aahg(aahj aahj, vyu vyu, aagi aagi, dcg dcg) {
        this.f28126c = aahj;
        this.f28125a = vyu;
        this.f28127d = aagi;
        this.f28128e = dcg;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d2, code lost:
        if ((r0.getCause() instanceof p000.bxwf) != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00da, code lost:
        throw ((p000.bxwf) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00db, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e3, code lost:
        if ((r0.getCause() instanceof p000.bxwf) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ee, code lost:
        throw new p000.bxwf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f5, code lost:
        throw ((p000.bxwf) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0107 A[ExcHandler: InterruptedException | ExecutionException (e java.lang.Throwable), Splitter:B:8:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012c  */
    /* renamed from: a */
    public final int mo16868a(Context context, aaip aaip) {
        int i;
        Context context2 = context;
        long currentTimeMillis = System.currentTimeMillis();
        aaib aaib = new aaib(context2, this.f28128e);
        aaia a = aaib.mo16890a();
        vvw vvw = null;
        String str = a != null ? a.f28157a.f12814b : null;
        aahj aahj = this.f28126c;
        dcg dcg = this.f28128e;
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            byte[] bArr = (byte[]) bqdx.m112673a(aahj.f28134a.mo25819b(new aahh(context2)), new aahi(aahj, currentTimeMillis2, str, dcg), aahj.f28134a).get();
            aahj.f28136c.mo16858a(5006, System.currentTimeMillis() - currentTimeMillis2);
            long currentTimeMillis3 = System.currentTimeMillis();
            RequestFuture newFuture = RequestFuture.newFuture();
            aahj.f28135b.add(new sia(1, cebg.f182212a.mo6606a().mo78724a(), bArr, vvu.f50069c, newFuture, newFuture, null, null, false, new HashMap(), 21760, -1));
            try {
                vvu vvu = (vvu) newFuture.get();
                if (vvu != null) {
                    aahj.f28136c.mo16858a(5007, System.currentTimeMillis() - currentTimeMillis3);
                    ByteString bxtx = vvu.f50071a;
                    bxus c = bxus.m123744c();
                    vvw vvw2 = vvw.f50079j;
                    bxuc h = bxtx.mo73764h();
                    GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) vvw2.mo74142c(4);
                    bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                    a2.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c);
                    a2.mo74225d(GeneratedMessageLite);
                    h.mo73787a(0);
                    GeneratedMessageLite.m124027b(GeneratedMessageLite);
                    vvw = (vvw) GeneratedMessageLite;
                } else {
                    aahj.f28136c.mo16858a(4006, System.currentTimeMillis() - currentTimeMillis3);
                }
            } catch (InterruptedException | ExecutionException e) {
            } catch (bxwf e2) {
                e = e2;
                aahj.f28136c.mo16859a(2013, System.currentTimeMillis() - currentTimeMillis3, e);
                if (vvw == null) {
                }
                this.f28127d.mo16858a(4003, System.currentTimeMillis() - currentTimeMillis);
                return i;
            }
        } catch (InterruptedException | ExecutionException e3) {
            aahj.f28136c.mo16859a(2014, System.currentTimeMillis() - currentTimeMillis2, e3);
        }
        if (vvw == null) {
            i = 1;
        } else if (!vvw.f50086f) {
            String a3 = boan.f132472f.mo68794a(vvw.f50083c.getKey());
            String a4 = aaic.m21297a(vvw.f50082b.getKey());
            bxvd da = dci.f12811g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            dci dci = (dci) da.f164949b;
            a3.getClass();
            int i2 = dci.f12813a | 1;
            dci.f12813a = i2;
            dci.f12814b = a3;
            a4.getClass();
            dci.f12813a = i2 | 2;
            dci.f12815c = a4;
            vvw vvw3 = vvw;
            long currentTimeMillis4 = (System.currentTimeMillis() / 1000) + ((long) vvw.f50085e);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            dci dci2 = (dci) da.f164949b;
            dci2.f12813a |= 4;
            dci2.f12816d = currentTimeMillis4;
            long currentTimeMillis5 = System.currentTimeMillis() / 1000;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            dci dci3 = (dci) da.f164949b;
            int i3 = dci3.f12813a | 8;
            dci3.f12813a = i3;
            dci3.f12817e = currentTimeMillis5;
            vvw vvw4 = vvw3;
            int i4 = vvw4.f50085e;
            dci3.f12813a = i3 | 16;
            dci3.f12818f = (long) i4;
            dci dci4 = (dci) da.mo74062i();
            bxvd da2 = dch.f12805e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            dch dch = (dch) da2.f164949b;
            dci4.getClass();
            dch.f12808b = dci4;
            int i5 = dch.f12807a | 1;
            dch.f12807a = i5;
            ByteString bxtx2 = vvw4.f50084d;
            bxtx2.getClass();
            int i6 = i5 | 2;
            dch.f12807a = i6;
            dch.f12809c = bxtx2;
            ByteString bxtx3 = vvw4.f50082b;
            bxtx3.getClass();
            dch.f12807a = i6 | 4;
            dch.f12810d = bxtx3;
            try {
                ByteString a5 = ByteString.m123261a(new ProgramResponse(((dch) da2.mo74062i()).mo73639aL().getKey(), 5).f32766b);
                bxus c2 = bxus.m123744c();
                dch dch2 = dch.f12805e;
                try {
                    bxuc h2 = a5.mo73764h();
                    GeneratedMessageLite GeneratedMessageLite2 = (GeneratedMessageLite) dch2.mo74142c(4);
                    bxxv a6 = bxxm.f165037a.mo74228a(GeneratedMessageLite2);
                    a6.mo74220a(GeneratedMessageLite2, bxud.m123454a(h2), c2);
                    a6.mo74225d(GeneratedMessageLite2);
                    h2.mo73787a(0);
                    GeneratedMessageLite.m124027b(GeneratedMessageLite2);
                    if (!aaib.mo16892a((dch) GeneratedMessageLite2, new aahf(this))) {
                        this.f28127d.mo16858a(4008, System.currentTimeMillis() - currentTimeMillis);
                        return 1;
                    }
                    this.f28127d.mo16858a(5008, System.currentTimeMillis() - currentTimeMillis);
                    return 0;
                } catch (IOException e4) {
                    if (!(e4.getCause() instanceof bxwf)) {
                        throw new bxwf(e4.getMessage());
                    }
                    throw ((bxwf) e4.getCause());
                } catch (RuntimeException e5) {
                    if (e5.getCause() instanceof bxwf) {
                        throw ((bxwf) e5.getCause());
                    }
                    throw e5;
                } catch (bxwf e6) {
                    throw e6;
                } catch (bxwf e7) {
                    throw e7;
                }
            } catch (bxwf e8) {
                this.f28127d.mo16859a(2012, System.currentTimeMillis() - currentTimeMillis, e8);
                return 1;
            }
        } else {
            i = 1;
        }
        this.f28127d.mo16858a(4003, System.currentTimeMillis() - currentTimeMillis);
        return i;
    }
}
