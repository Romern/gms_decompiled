package p000;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;

/* renamed from: bgoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgoj implements bglz, bhba {

    /* renamed from: a */
    public final bgol f116920a;

    /* renamed from: b */
    public final bgoo f116921b;

    /* renamed from: c */
    public final bgoo f116922c;

    /* renamed from: d */
    public final bgoo f116923d;

    /* renamed from: e */
    public final bgoo f116924e;

    /* renamed from: f */
    public final bgmk f116925f;

    /* renamed from: g */
    public boolean f116926g;

    public bgoj(bgmk bgmk, bgmm bgmm) {
        bgol bgol = new bgol(bgmm, bgmk.mo62777d(), bgmk.mo62776c());
        this.f116925f = bgmk;
        this.f116920a = bgol;
        long c = bgmk.mo62776c();
        File i = bgol.f116934f.mo62789i();
        if (i == null) {
            bgol.mo63038b(c);
        } else {
            BufferedInputStream bufferedInputStream = null;
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(new File(i, "cp_state")));
                try {
                    DataInputStream dataInputStream = new DataInputStream(bufferedInputStream2);
                    if (dataInputStream.readUnsignedShort() == 1) {
                        bsax a = bhcr.m100642a(dataInputStream, bgox.f117078bR);
                        long c2 = a.mo70124c(1);
                        long c3 = a.mo70124c(2);
                        if (c3 > 0) {
                            bsax e = a.mo70129e(3);
                            bsax e2 = a.mo70129e(4);
                            bsax e3 = a.mo70129e(5);
                            bsax e4 = a.mo70129e(6);
                            bgol.f116930b.mo63047a(c, c2, c3, e);
                            bgol.f116931c.mo63047a(c, c2, c3, e2);
                            bgol.f116932d.mo63047a(c, c2, c3, e3);
                            bgol.f116933e.mo63047a(c, c2, c3, e4);
                        } else {
                            bgol.mo63038b(c);
                        }
                    } else {
                        bgol.mo63038b(c);
                    }
                } catch (IOException e5) {
                    bgol.mo63038b(c);
                } catch (Exception e6) {
                    try {
                        bgol.mo63038b(c);
                    } catch (FileNotFoundException e7) {
                        bufferedInputStream = bufferedInputStream2;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        bgol.m99519a(bufferedInputStream);
                        throw th;
                    }
                }
                bgol.m99519a(bufferedInputStream2);
                bgol.m99519a(bufferedInputStream2);
            } catch (FileNotFoundException e8) {
                try {
                    bgol.mo63038b(c);
                    bgol.m99519a(bufferedInputStream);
                    bgol.mo63036a(c);
                    this.f116921b = bgol.f116930b;
                    this.f116922c = bgol.f116931c;
                    this.f116923d = bgol.f116932d;
                    this.f116924e = bgol.f116933e;
                    this.f116926g = true;
                    Locale locale = Locale.US;
                    new Object[1][0] = this.f116921b;
                    Locale locale2 = Locale.US;
                    new Object[1][0] = this.f116922c;
                    Locale locale3 = Locale.US;
                    new Object[1][0] = this.f116923d;
                    Locale locale4 = Locale.US;
                    new Object[1][0] = this.f116924e;
                } catch (Throwable th2) {
                    th = th2;
                    bgol.m99519a(bufferedInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bgol.m99519a(bufferedInputStream);
                throw th;
            }
        }
        bgol.mo63036a(c);
        this.f116921b = bgol.f116930b;
        this.f116922c = bgol.f116931c;
        this.f116923d = bgol.f116932d;
        this.f116924e = bgol.f116933e;
        this.f116926g = true;
        Locale locale5 = Locale.US;
        new Object[1][0] = this.f116921b;
        Locale locale22 = Locale.US;
        new Object[1][0] = this.f116922c;
        Locale locale32 = Locale.US;
        new Object[1][0] = this.f116923d;
        Locale locale42 = Locale.US;
        new Object[1][0] = this.f116924e;
    }

    /* renamed from: a */
    public final void mo61420a() {
        this.f116921b.mo63054c();
        this.f116922c.mo63054c();
        this.f116923d.mo63054c();
    }

    /* renamed from: a */
    public final synchronized void mo63034a(boolean z) {
        this.f116926g = z;
    }

    /* renamed from: b */
    public final synchronized void mo63000b(long j) {
        if (this.f116926g) {
            long c = this.f116925f.mo62776c();
            this.f116921b.mo63053b(j, c);
            Locale locale = Locale.US;
            Object[] objArr = {Long.valueOf(j), this.f116921b};
            this.f116920a.mo63036a(c);
            return;
        }
        Locale locale2 = Locale.US;
        new Object[1][0] = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo61425a(bsax bsax, long j) {
        bsax bsax2;
        bsax a = this.f116921b.mo63045a();
        bsax a2 = this.f116922c.mo63045a();
        bsax a3 = this.f116923d.mo63045a();
        if (a == null && a2 == null && a3 == null) {
            bsax2 = null;
        } else {
            bsax bsax3 = new bsax(bgox.f117053at);
            if (a != null) {
                bsax3.mo70118b(1, a);
            }
            if (a2 != null) {
                bsax3.mo70118b(2, a2);
            }
            if (a3 != null) {
                bsax3.mo70118b(3, a3);
            }
            bsax2 = bsax3;
        }
        if (bsax2 != null) {
            bsax.mo70118b(13, bsax2);
        }
    }

    /* renamed from: a */
    public final void mo61426a(bxvd bxvd, long j) {
        bunb b = this.f116921b.mo63052b();
        bunb b2 = this.f116922c.mo63052b();
        bunb b3 = this.f116923d.mo63052b();
        if (b != null && b2 != null && b3 != null) {
            bxvd da = bumu.f154275e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bumu bumu = (bumu) da.f164949b;
            b.getClass();
            bumu.f154278b = b;
            int i = bumu.f154277a | 1;
            bumu.f154277a = i;
            b2.getClass();
            bumu.f154279c = b2;
            int i2 = i | 2;
            bumu.f154277a = i2;
            b3.getClass();
            bumu.f154280d = b3;
            bumu.f154277a = i2 | 4;
            bumu bumu2 = (bumu) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            buna buna = (buna) bxvd.f164949b;
            buna buna2 = buna.f154289i;
            bumu2.getClass();
            buna.f154296f = bumu2;
            buna.f154291a |= 1024;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo62999a(long j) {
        if (this.f116926g) {
            boolean a = this.f116921b.mo63050a(j, this.f116925f.mo62776c(), true);
            Locale locale = Locale.US;
            Object[] objArr = {Boolean.valueOf(a), Long.valueOf(j), this.f116921b};
            return a;
        }
        Locale locale2 = Locale.US;
        new Object[1][0] = Long.valueOf(j);
        return true;
    }
}
