package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.concurrent.Semaphore;

/* renamed from: bwaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwaj extends bwaw {

    /* renamed from: a */
    public final Semaphore f158657a = new Semaphore(0);

    /* renamed from: b */
    public bwai f158658b;

    /* renamed from: d */
    private final String f158659d;

    /* renamed from: e */
    private final String f158660e;

    /* renamed from: f */
    private final String f158661f;

    public bwaj(String str, String str2, String str3) {
        bwan.m121656a(str, "apiKey");
        this.f158659d = str;
        bwan.m121656a(str2, "packageName");
        this.f158660e = str2;
        bwan.m121656a(str3, "certFingerprint");
        this.f158661f = str3;
        synchronized (this) {
            this.f158658b = null;
        }
    }

    /* renamed from: a */
    public final int mo73402a() {
        return 132;
    }

    /* renamed from: b */
    public final boolean mo73405b() {
        return true;
    }

    /* renamed from: c */
    public final void mo73406c() {
        super.mo73406c();
        this.f158657a.release();
    }

    /* renamed from: a */
    public final void mo73403a(DataOutputStream dataOutputStream) {
        bxvd da = cang.f175361e.mo74144da();
        String str = this.f158659d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cang cang = (cang) da.f164949b;
        str.getClass();
        int i = cang.f175363a | 1;
        cang.f175363a = i;
        cang.f175364b = str;
        String str2 = this.f158660e;
        str2.getClass();
        int i2 = i | 2;
        cang.f175363a = i2;
        cang.f175365c = str2;
        String str3 = this.f158661f;
        str3.getClass();
        cang.f175363a = i2 | 4;
        cang.f175366d = str3;
        bwao.m121658a(dataOutputStream, (cang) da.mo74062i());
    }

    /* renamed from: a */
    public final boolean mo73404a(DataInputStream dataInputStream) {
        int a;
        String str;
        Long l;
        canj canj = (canj) bwao.m121657a((bxxk) canj.f175368f.mo74142c(7), dataInputStream);
        Long l2 = null;
        if ((canj.f175370a & 1) == 0 || !((a = cani.m126821a(canj.f175371b)) == 0 || a == 1)) {
            synchronized (this) {
                this.f158658b = new bwai(false, null, null, null);
            }
        } else {
            int i = canj.f175370a;
            if ((i & 2) != 0) {
                str = canj.f175372c;
            } else {
                str = null;
            }
            if ((i & 4) != 0) {
                l = Long.valueOf(canj.f175373d);
            } else {
                l = null;
            }
            if ((canj.f175370a & 8) != 0) {
                l2 = Long.valueOf(canj.f175374e);
            }
            synchronized (this) {
                this.f158658b = new bwai(true, str, l, l2);
            }
        }
        return true;
    }
}
