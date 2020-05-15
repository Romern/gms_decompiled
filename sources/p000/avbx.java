package p000;

import android.accounts.Account;
import android.content.Context;
import android.util.SparseArray;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.HashSet;

/* renamed from: avbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avbx extends avau {

    /* renamed from: k */
    private final avfw f92932k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avbx(Context context, avdl avdl, ClientContext clientContext, String str, avap avap, byte[] bArr) {
        super(context, avdl, clientContext, str, "WriteConsentOperation", avap, bArr);
        avfw avfw = new avfw(context);
        this.f92932k = avfw;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02d8, code lost:
        throw new p000.aaaj(10, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e1, code lost:
        throw new p000.aaaj(4505, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ea, code lost:
        throw new p000.aaaj(4503, null);
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d2 A[ExcHandler: avbp (e avbp), Splitter:B:1:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02d9 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:1:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02e2 A[ExcHandler: bxwf (e bxwf), Splitter:B:1:0x0010] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        avap avap;
        boolean z;
        boolean z2;
        Status status;
        super.mo6502a(context);
        bxvd da = bxsu.f164744f.mo74144da();
        try {
            mo51133b();
            da.mo73635b(this.f92880b, bxus.m123744c());
            String c = mo51134c();
            bxre a = aviz.m78598a(this.f92882c, c);
            if (a != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxsu bxsu = (bxsu) da.f164949b;
                a.getClass();
                bxsu.f164747b = a;
                bxsu.f164746a |= 1;
            }
            String a2 = m78158a(((bxsu) da.f164949b).f164748c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxsu bxsu2 = (bxsu) da.f164949b;
            a2.getClass();
            bxsu2.f164746a |= 2;
            bxsu2.f164748c = a2;
            avap = ((avau) this).f92879a;
            ClientContext clientContext = this.f92884e;
            bxsu bxsu3 = (bxsu) da.mo74062i();
            avap.mo51119a();
            sgv sgv = avap.f92854a.f92853a;
            StringBuilder sb = new StringBuilder();
            String a3 = shd.m35267a(String.valueOf(bxsu3.f164748c));
            StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 25);
            sb2.append("/users/");
            sb2.append(a3);
            sb2.append("/consent?alt=proto");
            sb.append(sb2.toString());
            bxsv bxsv = (bxsv) sgv.mo25513a(clientContext, 2, sb.toString(), bxsu3.mo73642k(), bxsv.f164751e);
            avap.mo51120a("WriteConsent", (String) null);
            bxrf bxrf = bxsv.f164754b;
            if (bxrf == null) {
                bxrf = bxrf.f164550c;
            }
            aviz.m78599a(bxrf, this.f92882c, c);
            if (bxsv.f164755c.size() > 0) {
                mo51129a().mo51140a((bxsd[]) bxsv.f164755c.toArray(new bxsd[0]));
                avcc a4 = mo51129a();
                bxsd[] bxsdArr = (bxsd[]) bxsv.f164755c.toArray(new bxsd[0]);
                String str = ((bxsu) da.f164949b).f164750e;
                if (a4.f92944a) {
                    avch avch = a4.f92945b;
                    HashSet hashSet = new HashSet();
                    for (bxsd bxsd : bxsdArr) {
                        hashSet.add(Integer.valueOf(bxsd.f164667b));
                    }
                    if (avch.mo51152a(hashSet)) {
                        status = a4.mo51139a(bxsdArr, str);
                    } else {
                        status = Status.f30107a;
                    }
                } else {
                    status = Status.f30109c;
                }
                if (!status.mo17710c()) {
                    throw new aaaj(status.f30115i, status.f30116j);
                }
            }
            mo51131a(0);
            this.f92883d.mo51164d(Status.f30107a, bxsv.mo73642k());
            avfg avfg = new avfg(avfv.m78451a(this.f92882c).mo51196a(this.f92886g, snp.m35702a(10)), this.f92889j);
            auzj a5 = avfg.mo51188a();
            if (a5 != null && (a5.f92829a & 1) != 0) {
                SparseArray sparseArray = new SparseArray();
                bxpe bxpe = a5.f92830b;
                if (bxpe == null) {
                    bxpe = bxpe.f164247d;
                }
                for (bxpd bxpd : bxpe.f164250b) {
                    sparseArray.put(avjl.m78613a(bxpd.f164243b), bxpd);
                }
                for (bxse bxse : bxsv.f164756d) {
                    bxpd bxpd2 = (bxpd) sparseArray.get(bxse.f164671a);
                    if (bxpd2 != null) {
                        bxvd bxvd = (bxvd) bxpd2.mo74142c(5);
                        bxvd.mo73625a((bxvk) bxpd2);
                        int a6 = bxsn.m123069a(bxse.f164672b);
                        if (a6 == 0) {
                            a6 = 1;
                        }
                        if (a6 - 1 == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bxpd bxpd3 = (bxpd) bxvd.f164949b;
                        bxpd3.f164242a |= 2;
                        bxpd3.f164244c = z;
                        int a7 = bxsn.m123069a(bxse.f164672b);
                        if (a7 == 0) {
                            a7 = 1;
                        }
                        if (a7 - 1 == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bxpd bxpd4 = (bxpd) bxvd.f164949b;
                        bxpd4.f164242a |= 4;
                        bxpd4.f164245d = z2;
                        sparseArray.put(bxse.f164671a, (bxpd) bxvd.mo74062i());
                    }
                }
                bxvd da2 = bxpe.f164247d.mo74144da();
                bxpe bxpe2 = a5.f92830b;
                if (bxpe2 == null) {
                    bxpe2 = bxpe.f164247d;
                }
                for (bxpd bxpd5 : bxpe2.f164250b) {
                    bxpd bxpd6 = (bxpd) sparseArray.get(avjl.m78613a(bxpd5.f164243b));
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bxpe bxpe3 = (bxpe) da2.f164949b;
                    bxpd6.getClass();
                    if (!bxpe3.f164250b.mo73666a()) {
                        bxpe3.f164250b = bxvk.m124021a(bxpe3.f164250b);
                    }
                    bxpe3.f164250b.add(bxpd6);
                }
                bxvd da3 = auzj.f92827d.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                auzj auzj = (auzj) da3.f164949b;
                bxpe bxpe4 = (bxpe) da2.mo74062i();
                bxpe4.getClass();
                auzj.f92830b = bxpe4;
                auzj.f92829a |= 1;
                if ((a5.f92829a & 2) != 0) {
                    long j = a5.f92831c;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    auzj auzj2 = (auzj) da3.f164949b;
                    auzj2.f92829a |= 2;
                    auzj2.f92831c = j;
                }
                auzj auzj3 = (auzj) da3.mo74062i();
                auzj a8 = avfg.mo51189a(auzj3);
                avfw avfw = this.f92932k;
                Account account = this.f92886g;
                bxpe bxpe5 = auzj3.f92830b;
                if (bxpe5 == null) {
                    bxpe5 = bxpe.f164247d;
                }
                avfw.mo51199a(account, bxpe5, a8);
            }
        } catch (gid e) {
            gid gid = e;
            avap.mo51120a("WriteConsent", "AUTH");
            throw gid;
        } catch (VolleyError e2) {
            VolleyError volleyError = e2;
            avap.mo51120a("WriteConsent", avap.m78142a(volleyError));
            throw volleyError;
        } catch (bxwf e3) {
        } catch (IOException e4) {
        } catch (avbp e5) {
        } catch (gid e6) {
            throw new aaaj(4504, null);
        } catch (VolleyError e7) {
            throw mo51128a(e7);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo51131a(status.f30115i);
        this.f92883d.mo51164d(status, null);
    }
}
