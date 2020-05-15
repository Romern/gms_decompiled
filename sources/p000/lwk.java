package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* renamed from: lwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lwk implements lwj {

    /* renamed from: a */
    private static final lvn f33110a = new lvn("CryptoBackupServerImpl");

    /* renamed from: b */
    private final lwc f33111b;

    /* renamed from: c */
    private final lwn f33112c;

    /* renamed from: d */
    private final lzu f33113d;

    /* renamed from: e */
    private final lwi f33114e;

    /* renamed from: f */
    private final mbx f33115f;

    /* renamed from: g */
    private String f33116g;

    public lwk(lwn lwn, lwc lwc, lzu lzu, lwi lwi, mbx mbx) {
        this.f33111b = lwc;
        this.f33112c = lwn;
        this.f33113d = lzu;
        this.f33114e = lwi;
        this.f33115f = mbx;
    }

    /* renamed from: a */
    static final void m24550a(bxvd bxvd) {
        if (ccnx.f179588a.mo6606a().mo76502c()) {
            String uuid = UUID.randomUUID().toString();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            lsz lsz = (lsz) bxvd.f164949b;
            lsz lsz2 = lsz.f32870k;
            uuid.getClass();
            lsz.f32872a |= 16;
            lsz.f32880i = uuid;
        }
    }

    /* renamed from: a */
    private static boolean m24553a(int i) {
        return i == 503 || i == 401;
    }

    /* renamed from: b */
    private final String m24554b(bzsb bzsb, msk msk) {
        bzsa bzsa = bzsb.f171221b;
        if (bzsa.mo74560a("X-Server-Object-Version")) {
            return bzsa.mo74563c("X-Server-Object-Version");
        }
        this.f33115f.mo19830a(17, msk, 4, bzsb.f171220a);
        throw new mbi(String.format(Locale.US, "Completed Scotty request but %s response header was missing", "X-Server-Object-Version"));
    }

    /* renamed from: c */
    private final void m24556c(bxvd bxvd) {
        if (this.f33116g != null && ccnr.f179566a.mo6606a().mo76483d() && !ccoj.m131012b()) {
            String str = this.f33116g;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            lth lth = (lth) bxvd.f164949b;
            lth lth2 = lth.f32914q;
            str.getClass();
            lth.f32916a |= 1024;
            lth.f32924i = str;
        }
    }

    /* renamed from: d */
    private static final void m24557d(bxvd bxvd) {
        boolean z = true;
        if (((lth) bxvd.f164949b).f32926k.size() != 1) {
            z = false;
        }
        sdo.m34975b(z, "BackupRequest must contain 1 app.");
    }

    /* renamed from: b */
    private final void m24555b(bxvd bxvd) {
        bmxv a = this.f33111b.mo19691a();
        if (a.mo66813a()) {
            String str = (String) a.mo66814b();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            lth lth = (lth) bxvd.f164949b;
            lth lth2 = lth.f32914q;
            str.getClass();
            lth.f32916a |= 512;
            lth.f32923h = str;
            return;
        }
        throw new IllegalStateException("Cannot upload backup data without a secondary alias set as active.");
    }

    /* renamed from: a */
    private static final void m24551a(bxvd bxvd, mde mde) {
        bxvd da = lss.f32851d.mo74144da();
        bxvd da2 = bzxr.f171793c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzxr bzxr = (bzxr) da2.f164949b;
        bzxr.f171796b = 2;
        bzxr.f171795a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lss lss = (lss) da.f164949b;
        bzxr bzxr2 = (bzxr) da2.mo74062i();
        bzxr2.getClass();
        lss.f32855c = bzxr2;
        lss.f32853a |= 2;
        bxtx aL = mde.mo73639aL();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lss lss2 = (lss) da.f164949b;
        aL.getClass();
        lss2.f32853a |= 1;
        lss2.f32854b = aL;
        lss lss3 = (lss) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        lsz lsz = (lsz) bxvd.f164949b;
        lsz lsz2 = lsz.f32870k;
        lss3.getClass();
        lsz.f32879h = lss3;
        lsz.f32872a |= 8;
    }

    /* renamed from: a */
    private final void m24552a(bzsb bzsb, msk msk) {
        bzxu bzxu;
        int a;
        int a2;
        int a3;
        int i = bzsb.f171220a;
        if (i != 200) {
            if (ccno.f179554a.mo6606a().mo76472d()) {
                bzxu = mck.m24876a(bzsb);
            } else {
                bzxu = null;
            }
            if (bzxu == null || ((a = bzxt.m126308a(bzxu.f171801b)) != 0 && a == 3)) {
                if (f33110a.mo19637a(3)) {
                    try {
                        f33110a.mo25412b("Non-200 response body: %s", new String(boav.m111020a(bzsb.f171222c), StandardCharsets.UTF_8));
                        for (String str : bzsb.f171221b.mo74558a()) {
                            f33110a.mo25412b("%s: %s", str, bzsb.f171221b.mo74563c(str));
                        }
                    } catch (IOException e) {
                        f33110a.mo25411b("Unable to log non-200 response body", e, new Object[0]);
                    }
                }
                if (i != 470) {
                    this.f33115f.mo19830a(2, msk, 4, i);
                    if (m24553a(i)) {
                        throw new mbo(i);
                    }
                    throw new mbj(i);
                }
                this.f33115f.mo19830a(13, msk, 4, 470);
                throw new mbt("");
            }
            int a4 = bzxt.m126308a(bzxu.f171801b);
            if (a4 != 0 && a4 == 50007) {
                this.f33115f.mo19830a(13, msk, 4, i);
                throw new mbt("");
            } else if (ccnr.m130891c() && (a3 = bzxt.m126308a(bzxu.f171801b)) != 0 && a3 == 50008) {
                throw new mbp();
            } else if (!ccnr.f179566a.mo6606a().mo76484e() || (a2 = bzxt.m126308a(bzxu.f171801b)) == 0 || a2 != 50006) {
                this.f33115f.mo19830a(2, msk, 4, i);
                if (m24553a(i)) {
                    throw new mbo(i, null);
                }
                throw new mbj(i, null);
            } else {
                this.f33115f.mo19830a(15, msk, 4, i);
                throw new mbm();
            }
        }
    }

    /* renamed from: a */
    public final String mo19703a(bxvd bxvd, String str, byte[] bArr, mde mde) {
        m24557d(bxvd);
        m24555b(bxvd);
        m24556c(bxvd);
        lsz k = bxvd.mo74073k();
        bxvd bxvd2 = (bxvd) k.mo74142c(5);
        bxvd2.mo73625a((bxvk) k);
        m24551a(bxvd2, mde);
        m24550a(bxvd2);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        lth lth = lth.f32914q;
        ((lth) bxvd.f164949b).f32926k = bxvk.m124030de();
        bxvd.mo74059h(bxvd2);
        try {
            lwn lwn = this.f33112c;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            bzsb a = lwn.m24565a(lwn.f33121a.mo19687a((lth) bxvd.mo74062i(), str, (MessageDigest) null, new bzsf(byteArrayInputStream, 1048576)));
            m24552a(a, msk.ENCRYPTED_BACKUP_INCREMENTAL);
            return m24554b(a, msk.ENCRYPTED_BACKUP_INCREMENTAL);
        } catch (bzss | InterruptedException | ExecutionException e) {
            this.f33115f.mo19829a(16, msk.ENCRYPTED_BACKUP_INCREMENTAL, 4);
            throw new mbi("Error waiting for incremental upload", e);
        }
    }

    /* renamed from: a */
    public final String mo19704a(bxvd bxvd, byte[] bArr, mde mde) {
        m24557d(bxvd);
        m24555b(bxvd);
        m24556c(bxvd);
        lsz k = bxvd.mo74073k();
        bxvd bxvd2 = (bxvd) k.mo74142c(5);
        bxvd2.mo73625a((bxvk) k);
        m24551a(bxvd2, mde);
        m24550a(bxvd2);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        lth lth = lth.f32914q;
        ((lth) bxvd.f164949b).f32926k = bxvk.m124030de();
        bxvd.mo74059h(bxvd2);
        try {
            lwn lwn = this.f33112c;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            bzsb a = lwn.m24565a(lwn.f33121a.mo19688a((lth) bxvd.mo74062i(), null, new bzsf(byteArrayInputStream, 1048576)));
            m24552a(a, msk.ENCRYPTED_BACKUP_NON_INCREMENTAL);
            return m24554b(a, msk.ENCRYPTED_BACKUP_NON_INCREMENTAL);
        } catch (bzss | InterruptedException | ExecutionException e) {
            this.f33115f.mo19829a(16, msk.ENCRYPTED_BACKUP_NON_INCREMENTAL, 4);
            throw new mbi("Error waiting for non-incremental upload", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01bd, code lost:
        r1.f33115f.mo19829a(7, p000.msk.SET_ACTIVE_SECONDARY_KEY, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01cc, code lost:
        throw new p000.mbi(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ce, code lost:
        r6 = 4;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01de, code lost:
        r1.f33115f.mo19829a(9, p000.msk.SET_ACTIVE_SECONDARY_KEY, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ee, code lost:
        throw new p000.mbi(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ef, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f0, code lost:
        r2 = r0;
        r1.f33115f.mo19830a(2, p000.msk.SET_ACTIVE_SECONDARY_KEY, 4, r2.f33375a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fc, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01bc A[ExcHandler: mbb (r0v3 'e' mbb A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01dd A[ExcHandler: IOException (r0v1 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ef A[ExcHandler: mbf (r0v0 'e' mbf A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* renamed from: a */
    public final void mo19705a(String str, Map map) {
        try {
            lwi lwi = this.f33114e;
            long longValue = ((Long) spn.f44933b.mo25081c()).longValue();
            bxvd da = lth.f32914q.mo74144da();
            String a = may.m24782a(lwi.f33109a, "android");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lth lth = (lth) da.f164949b;
            a.getClass();
            int i = lth.f32916a | 16;
            lth.f32916a = i;
            lth.f32920e = a;
            lth.f32916a = i | 1;
            lth.f32917b = longValue;
            if (cckq.m130234b()) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lth lth2 = (lth) da.f164949b;
                lth2.f32916a |= 2;
                lth2.f32918c = longValue;
            }
            ltf[] ltfArr = new ltf[map.size()];
            int i2 = 0;
            for (String str2 : map.keySet()) {
                mde mde = (mde) map.get(str2);
                bxvd da2 = ltf.f32903d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ltf ltf = (ltf) da2.f164949b;
                str2.getClass();
                ltf.f32905a |= 1;
                ltf.f32906b = str2;
                bxvd da3 = lss.f32851d.mo74144da();
                bxvd da4 = bzxr.f171793c.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bzxr bzxr = (bzxr) da4.f164949b;
                bzxr.f171796b = 2;
                bzxr.f171795a |= 1;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                lss lss = (lss) da3.f164949b;
                bzxr bzxr2 = (bzxr) da4.mo74062i();
                bzxr2.getClass();
                lss.f32855c = bzxr2;
                lss.f32853a |= 2;
                bxtx aL = mde.mo73639aL();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                lss lss2 = (lss) da3.f164949b;
                aL.getClass();
                lss2.f32853a |= 1;
                lss2.f32854b = aL;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ltf ltf2 = (ltf) da2.f164949b;
                lss lss3 = (lss) da3.mo74062i();
                lss3.getClass();
                ltf2.f32907c = lss3;
                ltf2.f32905a |= 2;
                ltfArr[i2] = (ltf) da2.mo74062i();
                i2++;
            }
            bxvd da5 = ltg.f32908e.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            ltg ltg = (ltg) da5.f164949b;
            str.getClass();
            ltg.f32910a |= 1;
            ltg.f32911b = str;
            List asList = Arrays.asList(ltfArr);
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            ltg ltg2 = (ltg) da5.f164949b;
            if (!ltg2.f32912c.mo73666a()) {
                ltg2.f32912c = bxvk.m124021a(ltg2.f32912c);
            }
            bxsy.m123078a(asList, ltg2.f32912c);
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            ltg ltg3 = (ltg) da5.f164949b;
            ltg3.f32910a |= 2;
            ltg3.f32913d = true;
            ltg ltg4 = (ltg) da5.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lth lth3 = (lth) da.f164949b;
            ltg4.getClass();
            lth3.f32930o = ltg4;
            lth3.f32916a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            ltq a2 = this.f33113d.mo19791a(da);
            if (ccoj.m131012b()) {
                return;
            }
            if ((a2.f32973a & 8) != 0) {
                this.f33116g = a2.f32976d;
            } else {
                this.f33116g = null;
            }
        } catch (mbf e) {
        } catch (IOException e2) {
        } catch (mbh e3) {
            mbh mbh = e3;
            int i3 = 4;
            this.f33115f.mo19829a(i3, msk.SET_ACTIVE_SECONDARY_KEY, i3);
            throw new mbi(mbh);
        } catch (mbb e4) {
        }
    }
}
