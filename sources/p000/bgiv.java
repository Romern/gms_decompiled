package p000;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* renamed from: bgiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgiv implements bwdf {

    /* renamed from: a */
    final /* synthetic */ bgiw f116557a;

    /* renamed from: b */
    private final LinkedList f116558b;

    /* renamed from: c */
    private volatile bglz f116559c;

    /* renamed from: d */
    private bwdc f116560d;

    /* renamed from: e */
    private volatile long f116561e = 0;

    /* renamed from: f */
    private bgmn f116562f;

    /* renamed from: g */
    private final bgnq f116563g;

    /* renamed from: h */
    private final int f116564h;

    public bgiv(bgiw bgiw, int i, bgnq bgnq) {
        String str;
        this.f116557a = bgiw;
        this.f116564h = i;
        int i2 = i - 1;
        if (i2 != 0) {
            str = i2 != 1 ? "-device-location-query" : "-upload";
        } else {
            str = "-query";
        }
        if (str.length() == 0) {
            new String("LegacyGlsClientMasf");
        } else {
            "LegacyGlsClientMasf".concat(str);
        }
        this.f116563g = bgnq;
        this.f116558b = new LinkedList();
    }

    /* renamed from: a */
    private final void m99034a(bsax bsax) {
        boolean z;
        int i;
        bfos bfos;
        this.f116560d = null;
        this.f116562f = null;
        if (bsax != null) {
            i = bsax.mo70122c();
            z = true;
        } else {
            z = false;
            i = -1;
        }
        int i2 = this.f116564h - 1;
        if (i2 == 0) {
            bfos = bfos.GLS_QUERY_RESPONSE;
        } else if (i2 != 1) {
            bfos = bfos.GLS_DEVICE_LOCATION_RESPONSE;
        } else {
            bfos = bfos.GLS_UPLOAD_RESPONSE;
        }
        bgfx.m98780a(this.f116557a.f116569e, bfos, z, i);
        this.f116557a.f116567c.mo62925c(this.f116563g);
        if (this.f116558b.size() > 0) {
            mo62873a((bgit) this.f116558b.remove());
        }
    }

    /* renamed from: a */
    private final boolean m99035a() {
        int i = this.f116564h;
        return i == 1 || i == 2;
    }

    /* renamed from: b */
    private final void m99036b() {
        int i = this.f116564h - 1;
        if (i == 0) {
            bmxy.m108581a(this.f116562f);
            this.f116557a.f116568d.mo62847a(new bgiu(this, null, this.f116562f));
        } else if (i != 1) {
            this.f116557a.f116568d.mo62842a((bsax) null);
        } else {
            this.f116557a.f116568d.mo62850b((bsax) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo62873a(bgit bgit) {
        int i;
        List a;
        if (this.f116560d == null) {
            bsax bsax = bgit.f116549a;
            bgmj bgmj = bgit.f116551c;
            bglz bglz = bgit.f116552d;
            bgmn bgmn = bgit.f116553e;
            this.f116557a.f116567c.mo62923b(this.f116563g, 5000, bgmj);
            if (bsax != null) {
                i = bsax.mo70122c();
            } else {
                i = -1;
            }
            int i2 = this.f116564h - 1;
            if (i2 == 0) {
                this.f116557a.f116569e.mo62050a(bfos.GLS_QUERY, i, bgit.f116550b);
            } else if (i2 != 1) {
                this.f116557a.f116569e.mo62049a(bfos.GLS_DEVICE_LOCATION_QUERY, i);
            } else {
                this.f116557a.f116569e.mo62049a(bfos.GLS_UPLOAD, i);
            }
            this.f116559c = bglz;
            this.f116562f = bgmn;
            bsax.mo70118b(1, bgij.m99010a(this.f116557a.f116565a, Locale.getDefault()));
            if (m99035a()) {
                bsax.mo70134g(7, this.f116557a.f116570f.mo61409c());
            }
            if (bsax.mo70138j(4) > 0) {
                bsax.mo70131f(4, 0);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bsax.mo70110a((OutputStream) byteArrayOutputStream);
                int i3 = this.f116564h - 1;
                bwdc bwdc = new bwdc(i3 != 0 ? i3 != 1 ? "g:loc/dl" : "g:loc/ul" : "g:loc/ql", byteArrayOutputStream.toByteArray());
                this.f116560d = bwdc;
                bwdc.mo73504a(this);
                if (!(bgmj == null || (a = bgmj.mo63003a()) == null || a.isEmpty())) {
                    int intValue = ((Integer) a.get(this.f116557a.f116571g.nextInt(a.size()))).intValue();
                    bwdc.mo73506b(intValue);
                    String valueOf = String.valueOf(a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                    sb.append("Will blame networking on uid: ");
                    sb.append(intValue);
                    sb.append(" all uids=");
                    sb.append(valueOf);
                    sb.toString();
                }
                try {
                    this.f116561e = (long) bwdc.mo73503f();
                } catch (IOException e) {
                    this.f116561e = 0;
                }
                if (this.f116564h == 2) {
                    bmxy.m108581a(bglz);
                    if (!bglz.mo62999a(this.f116561e)) {
                        this.f116560d = null;
                        m99036b();
                        m99034a((bsax) null);
                        return;
                    }
                }
                long j = this.f116561e;
                StringBuilder sb2 = new StringBuilder(43);
                sb2.append("Sending ");
                sb2.append(j);
                sb2.append(" bytes to MASF.");
                sb2.toString();
                this.f116557a.f116572h.mo73469a(bwdc);
            } catch (Exception e2) {
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb3.append("query(): unable to write request to payload: ");
                sb3.append(valueOf2);
                sb3.toString();
                m99036b();
                m99034a((bsax) null);
            }
        } else {
            this.f116558b.add(bgit);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf A[SYNTHETIC, Splitter:B:42:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e7 A[Catch:{ Exception -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010d A[Catch:{ Exception -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0147 A[SYNTHETIC, Splitter:B:61:0x0147] */
    /* renamed from: a */
    public final synchronized void mo61638a(bwdg bwdg, bwdh bwdh) {
        int i;
        InputStream inputStream;
        StringBuilder sb;
        bsax bsax;
        if (bwdg == this.f116560d) {
            bsax bsax2 = null;
            bsax2 = null;
            InputStream inputStream2 = null;
            bsax2 = null;
            try {
                inputStream = bwdh.mo73459b();
                try {
                    if (bwdh.f158896b == 200) {
                        bsax = bhcr.m100642a(inputStream, bgox.f117047an);
                        int c = bsax.mo70122c();
                        StringBuilder sb2 = new StringBuilder(27);
                        sb2.append("Received ");
                        sb2.append(c);
                        sb2.append(" bytes.");
                        sb2.toString();
                        if (bsax.mo70114b(1) == 0) {
                            if (bsax.mo70137i(3)) {
                                String f = bsax.mo70132f(3);
                                if (!TextUtils.isEmpty(f)) {
                                    bgij.m99012a(this.f116557a.f116565a, f);
                                }
                            }
                        }
                        if (m99035a() && bsax.mo70137i(5)) {
                            this.f116557a.f116570f.mo61406a(bsax.mo70129e(5));
                        }
                    } else {
                        bsax = null;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e) {
                            String valueOf = String.valueOf(e);
                            sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
                            sb.append("closing: ");
                            sb.append(valueOf);
                            sb.toString();
                            i = this.f116564h - 1;
                            if (i == 0) {
                            }
                            m99034a(bsax2);
                        }
                    }
                    bsax2 = bsax;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        String valueOf2 = String.valueOf(e);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
                        sb3.append("requestCompleted(): ");
                        sb3.append(valueOf2);
                        sb3.toString();
                        if (inputStream != null) {
                        }
                        i = this.f116564h - 1;
                        if (i == 0) {
                        }
                        m99034a(bsax2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Exception e3) {
                                String valueOf3 = String.valueOf(e3);
                                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 9);
                                sb4.append("closing: ");
                                sb4.append(valueOf3);
                                sb4.toString();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                inputStream = null;
                String valueOf22 = String.valueOf(e);
                StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf22).length() + 20);
                sb32.append("requestCompleted(): ");
                sb32.append(valueOf22);
                sb32.toString();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e5) {
                        String valueOf4 = String.valueOf(e5);
                        sb = new StringBuilder(String.valueOf(valueOf4).length() + 9);
                        sb.append("closing: ");
                        sb.append(valueOf4);
                        sb.toString();
                        i = this.f116564h - 1;
                        if (i == 0) {
                        }
                        m99034a(bsax2);
                    }
                }
                i = this.f116564h - 1;
                if (i == 0) {
                }
                m99034a(bsax2);
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                }
                throw th;
            }
            i = this.f116564h - 1;
            if (i == 0) {
                String valueOf5 = String.valueOf(bsax2);
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 24);
                sb5.append("Posting GLS response is ");
                sb5.append(valueOf5);
                sb5.toString();
                bmxy.m108581a(this.f116562f);
                this.f116557a.f116568d.mo62847a(new bgiu(this, bsax2, this.f116562f));
            } else if (i != 1) {
                this.f116557a.f116568d.mo62842a(bsax2);
            } else {
                this.f116557a.f116568d.mo62850b(bsax2);
                if (this.f116561e > 0) {
                    bmxy.m108581a(this.f116559c);
                    this.f116559c.mo63000b(this.f116561e);
                }
            }
            m99034a(bsax2);
        } else {
            throw new RuntimeException("Response to unexpected request.");
        }
    }

    /* renamed from: a */
    public final synchronized void mo61639a(bwdg bwdg, Exception exc) {
        if (bwdg == this.f116560d) {
            String valueOf = String.valueOf(exc);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("requestFailed: ");
            sb.append(valueOf);
            sb.toString();
            if (this.f116564h == 2 && (exc instanceof bwce) && this.f116561e > 0) {
                bmxy.m108581a(this.f116559c);
                this.f116559c.mo63000b(this.f116561e);
            }
            m99036b();
            m99034a((bsax) null);
        } else {
            throw new RuntimeException("Response to unexpected request.");
        }
    }
}
