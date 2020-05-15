package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: ugj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ugj extends ugi {

    /* renamed from: f */
    private static final sbw f47531f = new sbw("BinaryDiffUploader", "");

    /* renamed from: g */
    private static final Pattern f47532g = Pattern.compile("\\AUser-provided checksum does not match received payload content.*");

    /* renamed from: h */
    private static final Pattern f47533h = Pattern.compile("\\ARevision not found.*");

    /* renamed from: i */
    private final uff f47534i;

    /* renamed from: j */
    private final AtomicBoolean f47535j;

    /* renamed from: k */
    private final blbj f47536k;

    /* renamed from: l */
    private final vcx f47537l;

    /* renamed from: m */
    private final vct f47538m;

    /* renamed from: n */
    private final String f47539n;

    /* renamed from: o */
    private final String f47540o;

    /* renamed from: p */
    private final List f47541p = new ArrayList();

    private ugj(Context context, ugt ugt, uff uff, ufb ufb, AtomicBoolean atomicBoolean, blbj blbj, ugl ugl, vcx vcx, vct vct, ugv ugv, String str, String str2) {
        super(context, ugt, ufb, ugv);
        sdo.m34959a(uff);
        this.f47534i = uff;
        sdo.m34959a(atomicBoolean);
        this.f47535j = atomicBoolean;
        sdo.m34959a(blbj);
        this.f47536k = blbj;
        sdo.m34959a(ugl);
        sdo.m34959a(vcx);
        this.f47537l = vcx;
        sdo.m34959a(vct);
        this.f47538m = vct;
        sdo.m34959a((Object) str);
        this.f47540o = str;
        sdo.m34959a((Object) str2);
        this.f47539n = str2;
    }

    /* renamed from: a */
    public static ugj m38333a(Context context, ugt ugt, uff uff, uhn uhn, ufb ufb, AtomicBoolean atomicBoolean, blbj blbj, ugl ugl, vcx vcx, ugv ugv) {
        ujx ujx;
        ugt ugt2 = ugt;
        sdo.m34959a(uhn);
        vct a = vcx.mo28269a();
        if (!twx.m37577a(tww.BINARY_DIFF_UPLOAD) || !atomicBoolean.get()) {
            a.mo28244c(5);
            a.mo28240a();
            return null;
        }
        if (!ugt2.f47564c && ugt2.f47565d != null && ugt2.f47566e >= ((long) ((Integer) twy.f46891r.mo58455c()).intValue()) && ugt2.f47566e >= ((long) ((Integer) twy.f46892s.mo58455c()).intValue())) {
            if (ugt2.f47566e <= 4194304) {
                try {
                    ujx = uhn.mo27400a(ugt2.f47562a, ugt2.f47565d);
                } catch (uaa e) {
                    ujx = null;
                } catch (urd e2) {
                    f47531f.mo25378c("BinaryDiffUploader", String.format("Bad DriveID: %s", ugt2.f47565d), e2);
                    a.mo28244c(6);
                    a.mo28240a();
                    return null;
                }
                if (ujx != null && ujx.mo27628n() != null && ujx.mo27630o() != null) {
                    return new ugj(context, ugt, uff, ufb, atomicBoolean, blbj, ugl, vcx, a, ugv, ujx.mo27628n(), ujx.mo27630o());
                }
                f47531f.mo25372b("BinaryDiffUploader", "Cannot find any valid hash/revId to base diff on");
                a.mo28244c(6);
                a.mo28240a();
                return null;
            }
            f47531f.mo25371b("Target file size is bigger than Multipart max size");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo27326c() {
        return "";
    }

    /* renamed from: e */
    public final bngx mo27329e() {
        return bngx.m109368a((Collection) this.f47541p);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02a9, code lost:
        r2 = r0;
        r8 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02ae, code lost:
        r6 = r0;
        r8 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c9, code lost:
        r2 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02ce, code lost:
        r6 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d2, code lost:
        r2 = r0;
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d6, code lost:
        r2 = r0;
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        p000.ugj.f47531f.mo25376c("Unable to get response");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a8 A[ExcHandler: all (r0v19 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:31:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ad A[ExcHandler: ugr (r0v18 'e' ugr A[CUSTOM_DECLARE]), Splitter:B:31:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02c8 A[ExcHandler: all (r0v15 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:15:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02cd A[ExcHandler: ugr (r0v14 'e' ugr A[CUSTOM_DECLARE]), Splitter:B:15:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0246 A[Catch:{ vex -> 0x02b9, IOException -> 0x02b2, ugr -> 0x02ad, all -> 0x02a8 }] */
    /* renamed from: a */
    public final vkr mo27328a(ugs ugs, vfk vfk, ClientContext clientContext) {
        ufj ufj;
        vpz vpz;
        ugm ugm;
        Throwable th;
        ugm ugm2;
        vpz vpz2;
        vex vex;
        vpz vpz3;
        ugm ugm3;
        IOException iOException;
        ugr ugr;
        ugu a;
        boolean z;
        ugn ugn;
        blbn blbn;
        int i;
        ugs ugs2 = ugs;
        vfk vfk2 = vfk;
        ClientContext clientContext2 = clientContext;
        this.f47530e = 1;
        ugs2.mo27021a(this.f47527b.f47566e);
        try {
            long j = this.f47527b.f47566e;
            blbj blbj = this.f47536k;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108588a(z);
            double d = blbj.f125830c;
            double d2 = (double) j;
            Double.isNaN(d2);
            double sqrt = Math.sqrt((d2 / 1048576.0d) / d);
            double d3 = (double) blbj.f125831d;
            Double.isNaN(d3);
            int max = Math.max(blbj.f125828a, Math.min(blbj.f125829b, ((int) Math.round((sqrt * 1048576.0d) / d3)) * blbj.f125831d));
            f47531f.mo25369a("File size = %d, chunk size: %d", Long.valueOf(j), Integer.valueOf(max));
            vpz = this.f47534i.mo27284b(this.f47540o);
            try {
                vpz a2 = this.f47527b.mo27348a();
                ufj = new ufj(a2, "SHA-1");
                try {
                    ugn = new ugn();
                    ugn.mo27346a();
                    blbm blbm = new blbm(max);
                    bmxy.m108581a(vpz);
                    blbl blbl = new blbl(blbf.m106974a(max));
                    byte[] bArr = new byte[blbm.f125836a];
                    while (true) {
                        int read = vpz.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        blbl.mo66454a(bArr, 0, read);
                    }
                    blbn = blbl.mo66452a();
                    vpz.mo28736a();
                } catch (IOException | vpy e) {
                    f47531f.mo25378c("BinaryDiffUploader", String.format("Unable to create hash summary in %s", this.f47526a), e);
                    blbn = null;
                } catch (ugr e2) {
                } catch (Throwable th2) {
                }
                if (blbn != null) {
                    this.f47538m.mo28241a(ugn.mo27347b());
                    blbp blbp = new blbp();
                    blbp.f125850a = blbn;
                    blbp.f125851b = ufj;
                    blbq a3 = blbp.mo66466a();
                    ugm a4 = ugl.m38339a(this.f47526a, mo27325b(), "PUT", clientContext2, vfk2);
                    try {
                        a4.mo27336a("X-Goog-Upload-Protocol", "multipart");
                        a4.mo27336a("X-Goog-Diff-Content-Encoding", this.f47539n);
                        String str = this.f47527b.f47567f;
                        if (str != null) {
                            a4.mo27336a("If-Match", str);
                        }
                        a4.mo27341c(this.f47527b.f47563b);
                        long d4 = a4.mo27343d();
                        ugn.mo27346a();
                        a4.mo27345f();
                        a4.mo27339b("application/octet-stream");
                        a3.mo66467a(a4.mo27344e());
                        a4.f47547a++;
                        this.f47538m.mo28243b(ugn.mo27347b());
                        a4.mo27337a("text/plain", String.format("X-Goog-Hash: sha1=%s", sqd.m35968b(ufj.f47436a.digest())).getBytes("UTF-8"));
                        this.f47538m.mo28242a(a4.mo27343d() - d4);
                        a2.mo28736a();
                        int a5 = a4.mo27334a();
                        f47531f.mo25369a("HTTP upload status %d", Integer.valueOf(a5));
                        String a6 = a4.mo27335a("X-GUploader-UploadID");
                        if (a6 != null) {
                            this.f47541p.add(a6);
                        }
                        if (a5 != 201) {
                            if (a5 != 200) {
                                f47531f.mo25369a("Upload ID: %s", a6);
                                ugt ugt = this.f47527b;
                                if (a5 == 400) {
                                    if (!"invalid_protocol".equals(a4.mo27335a("X-GUploader-Request-Result"))) {
                                        vpf a7 = vpg.m41004a(a4.mo27340c());
                                        vpg.m41005a(400, a7);
                                        if (!f47532g.matcher(a7.f49704a).matches()) {
                                            if (!a7.mo28720a(110)) {
                                                if (a7.mo28720a(99)) {
                                                    i = 7;
                                                    f47531f.mo25369a("Binary diff failed, reason: %s", Integer.valueOf(i));
                                                    if (i != 3 || i == 4 || i == 7) {
                                                        f47531f.mo25372b("BinaryDiffUploader", "Binary diff upload disabled");
                                                        this.f47535j.set(false);
                                                    } else if (i == 8) {
                                                        throw new ugq("Conflict uploading");
                                                    }
                                                    this.f47538m.mo28244c(i);
                                                    StringBuilder sb = new StringBuilder(37);
                                                    sb.append("Upload failed HTTP status ");
                                                    sb.append(a5);
                                                    throw new ugr(sb.toString());
                                                } else if (!"checksumMismatch".equals(a7.f49705b)) {
                                                }
                                            }
                                        }
                                        i = 4;
                                        f47531f.mo25369a("Binary diff failed, reason: %s", Integer.valueOf(i));
                                        if (i != 3) {
                                        }
                                        f47531f.mo25372b("BinaryDiffUploader", "Binary diff upload disabled");
                                        this.f47535j.set(false);
                                        this.f47538m.mo28244c(i);
                                        StringBuilder sb2 = new StringBuilder(37);
                                        sb2.append("Upload failed HTTP status ");
                                        sb2.append(a5);
                                        throw new ugr(sb2.toString());
                                    }
                                    i = 3;
                                    f47531f.mo25369a("Binary diff failed, reason: %s", Integer.valueOf(i));
                                    if (i != 3) {
                                    }
                                    f47531f.mo25372b("BinaryDiffUploader", "Binary diff upload disabled");
                                    this.f47535j.set(false);
                                    this.f47538m.mo28244c(i);
                                    StringBuilder sb22 = new StringBuilder(37);
                                    sb22.append("Upload failed HTTP status ");
                                    sb22.append(a5);
                                    throw new ugr(sb22.toString());
                                }
                                if (a5 == 404) {
                                    vpf a8 = vpg.m41004a(a4.mo27340c());
                                    boolean z2 = a8.f49706c != null && f47533h.matcher(a8.f49706c).matches();
                                    boolean z3 = a8.mo28720a(45) && a8.mo28721b(68);
                                    if (z2) {
                                        i = 2;
                                    } else if (z3) {
                                        i = 2;
                                    }
                                    f47531f.mo25369a("Binary diff failed, reason: %s", Integer.valueOf(i));
                                    if (i != 3) {
                                    }
                                    f47531f.mo25372b("BinaryDiffUploader", "Binary diff upload disabled");
                                    this.f47535j.set(false);
                                    this.f47538m.mo28244c(i);
                                    StringBuilder sb222 = new StringBuilder(37);
                                    sb222.append("Upload failed HTTP status ");
                                    sb222.append(a5);
                                    throw new ugr(sb222.toString());
                                }
                                i = sdg.m34949a(Integer.valueOf(a5), ugt.f47569h) ? 8 : 1;
                                f47531f.mo25369a("Binary diff failed, reason: %s", Integer.valueOf(i));
                                if (i != 3) {
                                }
                                f47531f.mo25372b("BinaryDiffUploader", "Binary diff upload disabled");
                                this.f47535j.set(false);
                                this.f47538m.mo28244c(i);
                                StringBuilder sb2222 = new StringBuilder(37);
                                sb2222.append("Upload failed HTTP status ");
                                sb2222.append(a5);
                                throw new ugr(sb2222.toString());
                            }
                        }
                        ugs.mo27020a();
                        vkt vkt = new vkt(ugv.m38380a(a4.mo27338b()), clientContext2, a4.mo27335a("X-Server-Object-Version"));
                        this.f47538m.mo28240a();
                        srz.m36171a(a4);
                        srz.m36171a((Closeable) vpz);
                        srz.m36171a((Closeable) ufj);
                        return vkt;
                    } catch (vex e3) {
                        vex = e3;
                        vpz3 = vpz;
                        ugm3 = a4;
                        try {
                            throw vex;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (IOException e4) {
                        iOException = e4;
                        vpz2 = vpz;
                        ugm2 = a4;
                        try {
                            f47531f.mo25371b("Input stream verification failed");
                            throw new ugr("Upload exception", iOException);
                        } catch (Throwable th4) {
                            th = th4;
                            vpz = vpz2;
                            ugm = ugm2;
                            this.f47538m.mo28240a();
                            srz.m36171a(ugm);
                            srz.m36171a((Closeable) vpz);
                            srz.m36171a((Closeable) ufj);
                            throw th;
                        }
                    } catch (ugr e5) {
                    } catch (Throwable th5) {
                    }
                } else {
                    throw new ugr("Cannot create hash summary from source stream");
                }
            } catch (vex e6) {
                vex = e6;
                vpz3 = vpz;
                ufj = null;
                ugm3 = null;
                throw vex;
            } catch (IOException e7) {
                iOException = e7;
                vpz2 = vpz;
                ufj = null;
                ugm2 = null;
                f47531f.mo25371b("Input stream verification failed");
                throw new ugr("Upload exception", iOException);
            } catch (ugr e8) {
                ugr = e8;
                ugm = null;
                ufj = null;
                try {
                    f47531f.mo25373b("BinaryDiffUploader", "Binary diff upload failed, trying alternate uploader", ugr);
                    a = this.f47529d.mo27352a(this.f47527b, vpu.m41034a(), this.f47537l, false);
                    vkr a9 = a.mo27328a(ugs2, vfk2, clientContext2);
                    this.f47530e = a.mo27324a();
                    this.f47541p.addAll(a.mo27329e());
                    this.f47538m.mo28240a();
                    srz.m36171a(ugm);
                    srz.m36171a((Closeable) vpz);
                    srz.m36171a((Closeable) ufj);
                    return a9;
                } catch (Throwable th6) {
                    th = th6;
                    this.f47538m.mo28240a();
                    srz.m36171a(ugm);
                    srz.m36171a((Closeable) vpz);
                    srz.m36171a((Closeable) ufj);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                ugm = null;
                ufj = null;
                this.f47538m.mo28240a();
                srz.m36171a(ugm);
                srz.m36171a((Closeable) vpz);
                srz.m36171a((Closeable) ufj);
                throw th;
            }
        } catch (vex e9) {
            vex = e9;
            vpz3 = null;
            ufj = null;
            ugm3 = null;
            throw vex;
        } catch (IOException e10) {
            iOException = e10;
            vpz2 = null;
            ufj = null;
            ugm2 = null;
            f47531f.mo25371b("Input stream verification failed");
            throw new ugr("Upload exception", iOException);
        } catch (ugr e11) {
            ugr = e11;
            ugm = null;
            vpz = null;
            ufj = null;
            f47531f.mo25373b("BinaryDiffUploader", "Binary diff upload failed, trying alternate uploader", ugr);
            a = this.f47529d.mo27352a(this.f47527b, vpu.m41034a(), this.f47537l, false);
            vkr a92 = a.mo27328a(ugs2, vfk2, clientContext2);
            this.f47530e = a.mo27324a();
            this.f47541p.addAll(a.mo27329e());
            this.f47538m.mo28240a();
            srz.m36171a(ugm);
            srz.m36171a((Closeable) vpz);
            srz.m36171a((Closeable) ufj);
            return a92;
        } catch (Throwable th8) {
            th = th8;
            ugm = null;
            vpz = null;
            ufj = null;
            this.f47538m.mo28240a();
            srz.m36171a(ugm);
            srz.m36171a((Closeable) vpz);
            srz.m36171a((Closeable) ufj);
            throw th;
        }
    }
}
