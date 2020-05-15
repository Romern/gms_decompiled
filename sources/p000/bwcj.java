package p000;

import java.io.IOException;

/* renamed from: bwcj */
final /* synthetic */ class bwcj implements Runnable {

    /* renamed from: a */
    private final bwcm f158819a;

    /* renamed from: b */
    private final bwcp f158820b;

    /* renamed from: c */
    private final bwdg[] f158821c;

    /* renamed from: d */
    private final int f158822d;

    public bwcj(bwcm bwcm, bwcp bwcp, bwdg[] bwdgArr, int i) {
        this.f158819a = bwcm;
        this.f158820b = bwcp;
        this.f158821c = bwdgArr;
        this.f158822d = i;
    }

    public final void run() {
        IOException iOException;
        bwdh bwdh;
        bwdf g;
        bwcm bwcm = this.f158819a;
        bwcp bwcp = this.f158820b;
        bwdg[] bwdgArr = this.f158821c;
        int i = this.f158822d;
        int i2 = 0;
        if (bwcp.mo73480f()) {
            synchronized (bwcm.f158833f) {
                int length = bwdgArr.length;
                while (i2 < length) {
                    bwdg bwdg = bwdgArr[i2];
                    long j = ((bwcq) bwcp).f158853d;
                    bwdg.f158889b = 3000 + j;
                    bwdg.f158890c = j + 5000;
                    i2++;
                }
                bwcm.mo73466b();
            }
        } else if (bwcp.mo73481g()) {
            try {
                if (!bwcp.mo73479d()) {
                    int a = bwcp.mo73485a();
                    String h = bwcp.mo73491h();
                    if (a != 200) {
                        bwcm.mo73465a(bwdgArr, new bwce(a));
                    } else {
                        if (h != null) {
                            if (h.equals("application/binary")) {
                                try {
                                    bwcm.f158835h += (int) bwcp.mo73490e();
                                    bwde bwde = new bwde(bwcp.mo73492j());
                                    int i3 = 0;
                                    while (true) {
                                        bwdg bwdg2 = null;
                                        if (i3 >= bwdgArr.length) {
                                            break;
                                        }
                                        bwcf bwcf = bwde.f158887b;
                                        if (bwcf != null) {
                                            synchronized (bwcf.f158815d) {
                                                while (!bwcf.f158816e) {
                                                    try {
                                                        bwcf.f158815d.wait();
                                                    } catch (InterruptedException e) {
                                                    }
                                                }
                                            }
                                            bwde.f158887b = null;
                                        }
                                        int readInt = bwde.f158886a.readInt();
                                        int readUnsignedShort = bwde.f158886a.readUnsignedShort();
                                        if (readUnsignedShort == 33024) {
                                            bwde.f158887b = new bwcf(bwde.f158886a, readInt);
                                            bwdh = new bwdd(bwde.f158887b);
                                        } else if (readUnsignedShort == 33025) {
                                            bwde.f158887b = new bwcf(bwde.f158886a, readInt);
                                            bwdh = new bwda(bwde.f158887b);
                                        } else {
                                            bwde.f158886a.skipBytes(readInt);
                                            bwdh = null;
                                        }
                                        if (bwdh == null) {
                                            break;
                                        }
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= bwdgArr.length) {
                                                break;
                                            }
                                            bwdg bwdg3 = bwdgArr[i4];
                                            if (bwdg3 != null) {
                                                if (bwdg3.mo73499c() == bwdh.mo73499c()) {
                                                    bwdgArr[i4] = null;
                                                    bwdg2 = bwdg3;
                                                    break;
                                                }
                                            }
                                            i4++;
                                        }
                                        if (bwdg2 == null) {
                                            try {
                                                bwdh.mo73459b().read(new byte[bwdh.mo73458a()]);
                                            } catch (IOException e2) {
                                            }
                                            bwdh.mo73512d();
                                        } else {
                                            if (bwdg2.mo73511j() && (g = bwdg2.mo73508g()) != null) {
                                                g.mo61638a(bwdg2, bwdh);
                                            }
                                            bwdh.mo73512d();
                                        }
                                        i3++;
                                    }
                                    if (bwde.f158887b != null) {
                                        bwde.f158887b = null;
                                    }
                                    bwde.f158886a.close();
                                    bwde.f158886a = null;
                                    iOException = new IOException("Request didn't complete");
                                } catch (Exception e3) {
                                } catch (Exception e4) {
                                    iOException = new IOException("Request didn't complete");
                                } catch (Throwable th) {
                                    bwcm.mo73465a(bwdgArr, new IOException("Request didn't complete"));
                                    throw th;
                                }
                                bwcm.mo73465a(bwdgArr, iOException);
                            }
                        }
                        bwcm.mo73465a(bwdgArr, new IOException("Bad content-type"));
                    }
                } else {
                    bwcm.mo73465a(bwdgArr, bwcp.mo73473c());
                }
                while (i2 < bwdgArr.length) {
                    bwdg bwdg4 = bwdgArr[i2];
                    if (bwdg4 != null) {
                        bwdg4.mo73500d();
                    }
                    i2++;
                }
                bwcm.f158834g += i;
            } finally {
                bwcm.mo73466b();
                bwcp.mo73488b();
            }
        }
    }
}
