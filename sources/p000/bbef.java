package p000;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: bbef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbef implements bbem {

    /* renamed from: a */
    private final bbdd f102469a;

    /* renamed from: b */
    private final befa f102470b;

    /* renamed from: c */
    private final bauy f102471c;

    /* renamed from: d */
    private final String f102472d;

    /* renamed from: e */
    private final bbep f102473e;

    /* renamed from: f */
    private final bavr f102474f;

    /* renamed from: g */
    private final int f102475g;

    /* renamed from: h */
    private final Executor f102476h;

    /* renamed from: i */
    private final int f102477i;

    public bbef(bbdd bbdd, befa befa, bauy bauy, int i, bbep bbep, bavr bavr, int i2, Executor executor) {
        this.f102469a = bbdd;
        this.f102470b = befa;
        this.f102471c = bauy;
        this.f102477i = i;
        this.f102472d = bbfe.m87923b(bauy);
        this.f102473e = bbep;
        this.f102474f = bavr;
        this.f102475g = i2;
        this.f102476h = executor;
    }

    /* renamed from: a */
    static bqgg m87874a(bavq bavq, bauy bauy, int i, bbdd bbdd, Executor executor) {
        bavt a = bbdd.m87829a(bauy, i);
        return bqdx.m112674a(bbdd.mo56079a(a), new bbed(a, bavq, bbdd, executor), executor);
    }

    /* renamed from: a */
    public final bqgg mo56087a() {
        return m87874a(bavq.DOWNLOAD_FAILED, this.f102471c, this.f102477i, this.f102469a, this.f102476h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r9 != 2) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0167, code lost:
        r12 = r0.mo60649e(r3);
        r14 = r0.mo60649e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0171, code lost:
        if (r12 <= r14) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0173, code lost:
        r6 = p000.bpwz.f139594g.mo74144da();
        r7 = r5.f101919b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017d, code lost:
        if (r6.f164950c != false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0180, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0186, code lost:
        r8 = (p000.bpwz) r6.f164949b;
        r7.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018d, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r3 = r8.f139596a | 1;
        r8.f139596a = r3;
        r8.f139597b = r7;
        r3 = r3 | 2;
        r8.f139596a = r3;
        r8.f139598c = r10;
        r5 = r5.f101920c;
        r5.getClass();
        r8.f139596a = r3 | 4;
        r8.f139599d = r5;
        r9.mo34982a((p000.bpwz) r6.mo74062i(), 3, r12, r14, r11.f101850b, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bc, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01f7  */
    /* renamed from: a */
    public final bqgg mo56088a(Uri uri) {
        Throwable th;
        OutputStream outputStream;
        Throwable th2;
        Uri uri2;
        Uri uri3;
        Uri uri4 = uri;
        bauy bauy = this.f102471c;
        String str = (bauy.f101849a & 32) != 0 ? bauy.f101856h : bauy.f101854f;
        try {
            befa befa = this.f102470b;
            int i = bbeh.f102478a;
            int i2 = 1;
            if (befa.mo60647c(uri4)) {
                int a = baux.m87590a(bauy.f101853e);
                if (a == 0) {
                }
                if (bbeh.m87882a(befa, uri4, str)) {
                    if ((this.f102471c.f101849a & 32) != 0) {
                        Uri a2 = bbeg.m87877a(uri);
                        if (bbfe.m87922a(this.f102471c)) {
                            bbep bbep = this.f102473e;
                            befa befa2 = this.f102470b;
                            bavr bavr = this.f102474f;
                            int i3 = this.f102475g;
                            String str2 = this.f102471c.f101850b;
                            befa2.mo60643a(uri4, new bbeo(a2), new beer[0]);
                            try {
                                bxvd da = bpwz.f139594g.mo74144da();
                                String str3 = bavr.f101919b;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bpwz bpwz = (bpwz) da.f164949b;
                                str3.getClass();
                                int i4 = bpwz.f139596a | 1;
                                bpwz.f139596a = i4;
                                bpwz.f139597b = str3;
                                int i5 = i4 | 2;
                                bpwz.f139596a = i5;
                                bpwz.f139598c = i3;
                                String str4 = bavr.f101920c;
                                str4.getClass();
                                bpwz.f139596a = i5 | 4;
                                bpwz.f139599d = str4;
                                bbep.mo34982a((bpwz) da.mo74062i(), 5, ((Long) befa2.mo60643a(a2, behu.m95068a(), new beer[0])).longValue(), befa2.mo60649e(uri4), str2, 0);
                                befa2.mo60644a(uri4);
                            } catch (IOException e) {
                                Object[] objArr = {"DownloaderCallbackImpl", uri4};
                            }
                        } else {
                            Uri.Builder buildUpon = uri.buildUpon();
                            bzny bzny = this.f102471c.f101855g;
                            if (bzny == null) {
                                bzny = bzny.f170777b;
                            }
                            Uri build = buildUpon.encodedFragment(beij.m95138a(bzny)).build();
                            bbep bbep2 = this.f102473e;
                            befa befa3 = this.f102470b;
                            bavr bavr2 = this.f102474f;
                            int i6 = this.f102475g;
                            bauy bauy2 = this.f102471c;
                            try {
                                InputStream inputStream = (InputStream) befa3.mo60643a(build, behs.m95063a(), new beer[0]);
                                try {
                                    outputStream = (OutputStream) befa3.mo60643a(a2, behw.m95072a(), new beer[0]);
                                    boav.m111013a(inputStream, outputStream);
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    try {
                                        if ((bauy2.f101849a & 32) != 0) {
                                            bzny bzny2 = bauy2.f101855g;
                                            if (bzny2 == null) {
                                                bzny2 = bzny.f170777b;
                                            }
                                            Iterator it = bzny2.f170779a.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    uri2 = a2;
                                                    break;
                                                } else if (((bznx) it.next()).f170775a == i2) {
                                                    break;
                                                } else {
                                                    i2 = 1;
                                                }
                                            }
                                        } else {
                                            uri2 = a2;
                                        }
                                        befa3.mo60644a(build);
                                    } catch (IOException e2) {
                                        uri2 = a2;
                                        Object[] objArr2 = {"DownloaderCallbackImpl", build};
                                        uri3 = uri2;
                                        if (!bbeh.m87882a(this.f102470b, uri3, this.f102472d)) {
                                        }
                                        return m87874a(bavq.DOWNLOAD_COMPLETE, this.f102471c, this.f102477i, this.f102469a, this.f102476h);
                                    }
                                    uri3 = uri2;
                                    if (!bbeh.m87882a(this.f102470b, uri3, this.f102472d)) {
                                        bbev.m87906a("%s: Final file checksum verification failed. %s.", "DownloaderCallbackImpl", uri3);
                                        bauo a3 = bauq.m87573a();
                                        a3.f101791a = baup.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                                        throw a3.mo55987a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e3) {
                                bbev.m87908a(e3, "%s: Failed to apply download transform for file %s.", "DownloaderCallbackImpl", build);
                                bauo a4 = bauq.m87573a();
                                a4.f101791a = baup.DOWNLOAD_TRANSFORM_IO_ERROR;
                                a4.f101793c = e3;
                                throw a4.mo55987a();
                            } catch (Throwable th4) {
                                bqye.m113761a(th, th4);
                            }
                        }
                    }
                    return m87874a(bavq.DOWNLOAD_COMPLETE, this.f102471c, this.f102477i, this.f102469a, this.f102476h);
                }
                bbev.m87910b("%s: Downloaded file at uri = %s, checksum = %s verification failed", "FileValidator", uri4, str);
                bauo a5 = bauq.m87573a();
                a5.f101791a = baup.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
                throw a5.mo55987a();
            }
            bbev.m87910b("%s: Downloaded file %s is not present at %s", "FileValidator", bbfe.m87923b(bauy), uri4);
            bauo a6 = bauq.m87573a();
            a6.f101791a = baup.DOWNLOADED_FILE_NOT_FOUND_ERROR;
            throw a6.mo55987a();
            throw th2;
        } catch (IOException e4) {
            bbev.m87908a(e4, "%s: Failed to validate download file %s", "FileValidator", bbfe.m87923b(bauy));
            bauo a7 = bauq.m87573a();
            a7.f101791a = baup.UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR;
            a7.f101793c = e4;
            throw a7.mo55987a();
        } catch (IllegalArgumentException e5) {
            bbev.m87908a(e5, "%s: Exception while trying to serialize download transform", "DownloaderCallbackImpl");
            bauo a8 = bauq.m87573a();
            a8.f101791a = baup.UNABLE_TO_SERIALIZE_DOWNLOAD_TRANSFORM_ERROR;
            a8.f101793c = e5;
            throw a8.mo55987a();
        } catch (IOException e6) {
            bbev.m87908a(e6, "%s: Failed to apply zip download transform for file %s.", "DownloaderCallbackImpl", uri4);
            bauo a9 = bauq.m87573a();
            a9.f101791a = baup.DOWNLOAD_TRANSFORM_IO_ERROR;
            a9.f101793c = e6;
            throw a9.mo55987a();
        } catch (bauq e7) {
            return bqga.m112777a((Throwable) e7);
        }
    }
}
