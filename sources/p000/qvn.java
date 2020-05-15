package p000;

import android.util.Base64;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: qvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qvn {

    /* renamed from: a */
    public static final imo f42243a = new qvm();

    /* renamed from: e */
    private static final Logger f42244e = qqu.m32672c("CryptographerManager");

    /* renamed from: b */
    public final qvt f42245b = ((qvt) qvt.f42265a.mo13145b());

    /* renamed from: c */
    public final izm f42246c;

    /* renamed from: d */
    public final Object f42247d;

    /* renamed from: f */
    private final qta f42248f = ((qta) qta.f42084i.mo13145b());

    public qvn() {
        rpr b = rpr.m34216b();
        izn a = izo.m16377a();
        a.f22004a = "chromesync";
        this.f42246c = izl.m16372a(b, a.mo13531a());
        this.f42247d = new Object();
    }

    /* renamed from: a */
    public final qqy mo24287a(acyr acyr) {
        qqy b;
        synchronized (this.f42247d) {
            b = mo24289b(acyr);
        }
        return b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bxwc, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: b */
    public final qqy mo24289b(acyr acyr) {
        bstx c = this.f42245b.mo24300c(acyr);
        bmxv bmxv = (bmxv) this.f42248f.mo24253a(acyr, qta.f42076a);
        if (!bmxv.mo66813a()) {
            bstz bstz = c.f147076c;
            if (bstz == null) {
                bstz = bstz.f147086g;
            }
            bsty a = bsty.m116191a(bstz.f147089b);
            if (a == null) {
                a = bsty.UNRECOGNIZED;
            }
            if (!a.equals(bsty.TRUSTED_VAULT_PASSPHRASE)) {
                bstz bstz2 = c.f147076c;
                if (bstz2 == null) {
                    bstz2 = bstz.f147086g;
                }
                if (qqy.m32675a(bstz2)) {
                    try {
                        bngx<byte[]> a2 = bngx.m109355a(bnjd.m109575a((Iterable) c.f147075b, qvl.f42242a));
                        bstz bstz3 = c.f147076c;
                        if (bstz3 == null) {
                            bstz3 = bstz.f147086g;
                        }
                        sdo.checkIfNull(a2, "keystoreKeys cannot be null");
                        sdo.checkIfNull(bstz3, "nigoriSpecifics cannot be null");
                        sdo.m34974b(qqy.m32675a(bstz3));
                        if (a2.isEmpty()) {
                            throw new qra("Empty keystore keys.");
                        } else if (bstz3.f147090c == null) {
                            throw new qra("Empty keystore decryptor token in Nigori node.");
                        } else if (bstz3.f147088a != null) {
                            ArrayList arrayList = new ArrayList();
                            for (byte[] bArr : a2) {
                                arrayList.add(qqz.m32679a(Base64.encodeToString(bArr, 2)));
                            }
                            qqz qqz = (qqz) bnjd.m109595d(arrayList);
                            qqy qqy = new qqy(arrayList, qqz.f41985a);
                            qui qui = bstz3.f147090c;
                            if (qui == null) {
                                qui = qui.f42142d;
                            }
                            byte[] a3 = qqy.mo24213a(qui);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(qqz.m32680a((quk) GeneratedMessageLite.m124016a(quk.f42153e, a3, bxus.m123744c())));
                            arrayList2.add(qqz);
                            qqy qqy2 = new qqy(arrayList2, qqz.f41985a);
                            qui qui2 = bstz3.f147088a;
                            if (qui2 == null) {
                                qui2 = qui.f42142d;
                            }
                            arrayList2.addAll(qqy.m32673a(qqy2, qui2));
                            qui qui3 = bstz3.f147088a;
                            if (qui3 == null) {
                                qui3 = qui.f42142d;
                            }
                            qqy qqy3 = new qqy(arrayList2, qui3.f42145b);
                            try {
                                this.f42248f.mo24254a(acyr, qta.f42076a, bmxv.m108566b(qqy3.mo24211a().mo24214a()));
                                return qqy3;
                            } catch (qra e) {
                                throw new qrp(qrq.m32743a(e), "Failed to save the encryption key.", e);
                            }
                        } else {
                            throw new qra("Empty key bag in Nigori node.");
                        }
                    } catch (bxwf e2) {
                        throw new qra("Unable to parse the keystore decryptor token.", e2);
                    } catch (qqw | qra e3) {
                        this.f42245b.mo24297a(acyr);
                        throw new qrp(qrq.m32743a(e3), "Invalid metadata.", e3);
                    }
                } else {
                    throw new qrp(1537);
                }
            } else {
                bstz bstz4 = c.f147076c;
                if (bstz4 == null) {
                    bstz4 = bstz.f147086g;
                }
                try {
                    List list = (List) aucu.m76782a(this.f42246c.mo13529c(acyr.f61088b));
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            try {
                                return qqy.m32674a(qqz.m32681a(((SharedKey) list.get(size)).f10906b), bstz4);
                            } catch (qqw | qra e4) {
                                f42244e.mo25416d("SharedKey failed to decrypt key bag.", new Object[0]);
                            }
                        } else {
                            try {
                                izm izm = this.f42246c;
                                String str = acyr.f61088b;
                                roz b = rpa.m34196b();
                                b.f43472a = new jan(str);
                                b.f43473b = new Feature[]{kaz.f23678a};
                                aucu.m76782a(((rjx) izm).mo24701a(b.mo24977a()));
                                throw new qrp(1025, "Local keys not valid.");
                            } catch (InterruptedException | ExecutionException e5) {
                                if (e5.getCause() instanceof rjp) {
                                    throw qrp.m32740a((rjp) e5.getCause());
                                }
                                throw new qrp(1025, e5);
                            }
                        }
                    }
                } catch (InterruptedException | ExecutionException e6) {
                    if (e6.getCause() instanceof rjp) {
                        throw qrp.m32740a((rjp) e6.getCause());
                    }
                    throw new qrp(1025, e6);
                }
            }
        } else {
            try {
                qqz a4 = qqz.m32680a((quk) bmxv.mo66814b());
                bstz bstz5 = c.f147076c;
                if (bstz5 == null) {
                    bstz5 = bstz.f147086g;
                }
                return qqy.m32674a(a4, bstz5);
            } catch (qqw | qra e7) {
                this.f42245b.mo24297a(acyr);
                throw new qrp(qrq.m32743a(e7), "Invalid metadata or passphrase.", e7);
            }
        }
    }

    /* renamed from: c */
    public final bmxv mo24290c(acyr acyr) {
        bmxv b = this.f42245b.mo24299b(acyr);
        if (!b.mo66813a() || ((bstx) b.mo66814b()).f147076c == null) {
            return bmvz.f131120a;
        }
        bstz bstz = ((bstx) b.mo66814b()).f147076c;
        if (bstz == null) {
            bstz = bstz.f147086g;
        }
        bsty a = bsty.m116191a(bstz.f147089b);
        if (a == null) {
            a = bsty.UNRECOGNIZED;
        }
        return bmxv.m108566b(a);
    }

    /* renamed from: a */
    public final boolean mo24288a(acyr acyr, qqz qqz) {
        bstx c = this.f42245b.mo24300c(acyr);
        bstz bstz = c.f147076c;
        if (bstz == null) {
            bstz = bstz.f147086g;
        }
        if (!qqy.m32675a(bstz)) {
            try {
                bstz bstz2 = c.f147076c;
                if (bstz2 == null) {
                    bstz2 = bstz.f147086g;
                }
                qqy.m32674a(qqz, bstz2);
                this.f42248f.mo24254a(acyr, qta.f42076a, bmxv.m108566b(qqz.mo24214a()));
                return true;
            } catch (qra e) {
                return false;
            } catch (qqw e2) {
                throw new qrp(qrq.m32743a(e2), "Failed to create cryptographer.", e2);
            }
        } else {
            throw new qrp(769, "The cryptographer is supposed to be created using keystore keys.");
        }
    }
}
