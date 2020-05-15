package p000;

import java.nio.charset.Charset;
import java.util.logging.Level;

/* renamed from: ciaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ciaj extends chwr {

    /* renamed from: a */
    private static final chsf f189661a;

    /* renamed from: b */
    private static final chtn f189662b;

    /* renamed from: c */
    private chuv f189663c;

    /* renamed from: d */
    private chtr f189664d;

    /* renamed from: e */
    private Charset f189665e = bmwy.f131158c;

    /* renamed from: f */
    private boolean f189666f;

    static {
        ciai ciai = new ciai();
        f189661a = ciai;
        f189662b = chsg.m149481a(":status", ciai);
    }

    protected ciaj(int i, ciez ciez, cifh cifh) {
        super(i, ciez, cifh);
    }

    /* renamed from: c */
    private static Charset m149921c(chtr chtr) {
        String str = (String) chtr.mo85652b(ciag.f189649f);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception e) {
            }
        }
        return bmwy.f131158c;
    }

    /* renamed from: d */
    private static void m149922d(chtr chtr) {
        chtr.mo85655c(f189662b);
        chtr.mo85655c(chsh.f189093b);
        chtr.mo85655c(chsh.f189092a);
    }

    /* renamed from: e */
    private static final chuv m149923e(chtr chtr) {
        Integer num = (Integer) chtr.mo85652b(f189662b);
        if (num == null) {
            return chuv.f189228o.mo85687a("Missing HTTP status code");
        }
        String str = (String) chtr.mo85652b(ciag.f189649f);
        if (ciag.m149916a(str)) {
            return null;
        }
        chuv a = ciag.m149908a(num.intValue());
        String valueOf = String.valueOf(str);
        return a.mo85690b(valueOf.length() == 0 ? new String("invalid content-type: ") : "invalid content-type: ".concat(valueOf));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.b(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.b(int, int):void
      bmxy.b(boolean, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010a A[RETURN] */
    /* renamed from: a */
    public final void mo85866a(chtr chtr) {
        chuv a;
        String valueOf;
        StringBuilder sb;
        chrn chrn;
        bmxy.m108582a(chtr, "headers");
        chuv chuv = this.f189663c;
        if (chuv != null) {
            String valueOf2 = String.valueOf(chtr);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 9);
            sb2.append("headers: ");
            sb2.append(valueOf2);
            this.f189663c = chuv.mo85690b(sb2.toString());
            return;
        }
        try {
            if (!this.f189666f) {
                Integer num = (Integer) chtr.mo85652b(f189662b);
                if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                    this.f189666f = true;
                    chuv e = m149923e(chtr);
                    this.f189663c = e;
                    if (e == null) {
                        m149922d(chtr);
                        bmxy.m108601b(!this.f189423s, "Received headers on closed stream");
                        chuy[] chuyArr = this.f189419o.f189993b;
                        for (chuy chuy : chuyArr) {
                        }
                        String str = (String) chtr.mo85652b(ciag.f189647d);
                        String str2 = (String) chtr.mo85652b(ciag.f189645b);
                        if (str2 != null) {
                            chro chro = (chro) this.f189421q.f189049c.get(str2);
                            if (chro != null) {
                                chrn = chro.f189045a;
                            } else {
                                chrn = null;
                            }
                            if (chrn == null) {
                                mo85734a(chuv.f189228o.mo85687a(String.format("Can't find decompressor for %s", str2)).mo85691b());
                                a = this.f189663c;
                                if (a == null) {
                                    valueOf = String.valueOf(chtr);
                                    sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
                                } else {
                                    return;
                                }
                            } else if (chrn != chrc.f189024a) {
                                chyg chyg = this.f189414j;
                                bmxy.m108601b(true, (Object) "Already set full stream decompressor");
                                bmxy.m108582a(chrn, "Can't pass an empty decompressor");
                                ((cidf) chyg).f189882c = chrn;
                            }
                        }
                        this.f189420p.mo85794a(chtr);
                        a = this.f189663c;
                        if (a == null) {
                        }
                    } else {
                        String valueOf3 = String.valueOf(chtr);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 9);
                        sb3.append("headers: ");
                        sb3.append(valueOf3);
                        this.f189663c = e.mo85690b(sb3.toString());
                        this.f189664d = chtr;
                        this.f189665e = m149921c(chtr);
                    }
                } else {
                    a = this.f189663c;
                    if (a != null) {
                        valueOf = String.valueOf(chtr);
                        sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
                    } else {
                        return;
                    }
                }
            } else {
                a = chuv.f189228o.mo85687a("Received headers twice");
                this.f189663c = a;
                if (a != null) {
                    valueOf = String.valueOf(chtr);
                    sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
                } else {
                    return;
                }
            }
            sb.append("headers: ");
            sb.append(valueOf);
            this.f189663c = a.mo85690b(sb.toString());
            this.f189664d = chtr;
            this.f189665e = m149921c(chtr);
        } catch (Throwable th) {
            chuv chuv2 = this.f189663c;
            if (chuv2 != null) {
                String valueOf4 = String.valueOf(chtr);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 9);
                sb4.append("headers: ");
                sb4.append(valueOf4);
                this.f189663c = chuv2.mo85690b(sb4.toString());
                this.f189664d = chtr;
                this.f189665e = m149921c(chtr);
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo85733a(chuv chuv, boolean z, chtr chtr);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ciaj.a(chuv, boolean, chtr):void
     arg types: [chuv, int, chtr]
     candidates:
      chwr.a(chuv, chxt, chtr):void
      ciaj.a(chuv, boolean, chtr):void */
    /* renamed from: b */
    public final void mo85868b(chtr chtr) {
        chuv chuv;
        chuv chuv2;
        bmxy.m108582a(chtr, "trailers");
        chuv chuv3 = this.f189663c;
        if (chuv3 == null && !this.f189666f) {
            chuv3 = m149923e(chtr);
            this.f189663c = chuv3;
            if (chuv3 != null) {
                this.f189664d = chtr;
            }
        }
        if (chuv3 == null) {
            chuv chuv4 = (chuv) chtr.mo85652b(chsh.f189093b);
            if (chuv4 != null) {
                chuv = chuv4.mo85687a((String) chtr.mo85652b(chsh.f189092a));
            } else if (this.f189666f) {
                chuv = chuv.f189217d.mo85687a("missing GRPC status in response");
            } else {
                Integer num = (Integer) chtr.mo85652b(f189662b);
                if (num != null) {
                    chuv2 = ciag.m149908a(num.intValue());
                } else {
                    chuv2 = chuv.f189228o.mo85687a("missing HTTP status code");
                }
                chuv = chuv2.mo85690b("missing GRPC status, inferred error from HTTP status code");
            }
            m149922d(chtr);
            bmxy.m108582a(chuv, "status");
            bmxy.m108582a(chtr, "trailers");
            if (this.f189423s) {
                chwm.f189381q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{chuv, chtr});
                return;
            }
            chuy[] chuyArr = this.f189419o.f189993b;
            for (chuy chuy : chuyArr) {
            }
            mo85777b(chuv, false, chtr);
            return;
        }
        String valueOf = String.valueOf(chtr);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append("trailers: ");
        sb.append(valueOf);
        chuv b = chuv3.mo85690b(sb.toString());
        this.f189663c = b;
        mo85733a(b, false, this.f189664d);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ciaj.a(chuv, boolean, chtr):void
     arg types: [chuv, int, chtr]
     candidates:
      chwr.a(chuv, chxt, chtr):void
      ciaj.a(chuv, boolean, chtr):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85867a(cidy cidy, boolean z) {
        chuv chuv = this.f189663c;
        boolean z2 = false;
        if (chuv != null) {
            String a = ciec.m150113a(cidy, this.f189665e);
            this.f189663c = chuv.mo85690b(a.length() == 0 ? new String("DATA-----------------------------\n") : "DATA-----------------------------\n".concat(a));
            cidy.close();
            if (this.f189663c.f189234t.length() > 1000 || z) {
                mo85733a(this.f189663c, false, this.f189664d);
            }
        } else if (this.f189666f) {
            bmxy.m108582a(cidy, "frame");
            boolean z3 = true;
            try {
                if (!this.f189423s) {
                    try {
                        chyg chyg = this.f189414j;
                        bmxy.m108582a(cidy, "data");
                        if (((cidf) chyg).mo85982a() || ((cidf) chyg).f189885f) {
                            cidy.close();
                        } else {
                            ((cidf) chyg).f189883d.mo85808a(cidy);
                            try {
                                ((cidf) chyg).mo85984c();
                            } catch (Throwable th) {
                                th = th;
                                z3 = false;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            mo85734a(th2);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } else {
                    chwm.f189381q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                    cidy.close();
                }
                if (z) {
                    this.f189663c = chuv.f189228o.mo85687a("Received unexpected EOS on DATA frame from server.");
                    chtr chtr = new chtr();
                    this.f189664d = chtr;
                    mo85777b(this.f189663c, false, chtr);
                }
            } catch (Throwable th4) {
                th = th4;
                z2 = true;
                if (z2) {
                    cidy.close();
                }
                throw th;
            }
        } else {
            mo85733a(chuv.f189228o.mo85687a("headers not received before payload"), false, new chtr());
        }
    }
}
