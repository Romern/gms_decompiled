package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bdne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdne {

    /* renamed from: a */
    private static final bnrt f106051a = bnrt.m110178a("bdne");

    /* renamed from: b */
    private static final bnic f106052b = bnic.m109492a("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");

    /* renamed from: c */
    private static final Pattern f106053c = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");

    /* renamed from: d */
    private static final Pattern f106054d = Pattern.compile("([^\\?]+)(\\?+)");

    /* renamed from: e */
    private static final Pattern f106055e = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");

    /* renamed from: f */
    private static final Pattern f106056f = Pattern.compile("([a-zA-Z0-9-_]+)");

    /* renamed from: g */
    private static final Pattern f106057g = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");

    /* renamed from: h */
    private final boolean f106058h;

    /* renamed from: i */
    private final bdnq f106059i;

    /* renamed from: j */
    private final bmxv f106060j;

    public bdne(bmxv bmxv) {
        this.f106058h = ((bdnc) bmxv.mo66814b()).mo58195d();
        this.f106059i = ((bdnc) bmxv.mo66814b()).mo58194c();
        this.f106060j = ((bdnc) bmxv.mo66814b()).mo58196e();
    }

    /* renamed from: a */
    static String m91139a(String str) {
        Matcher matcher = f106055e.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: b */
    static String m91141b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f106057g.matcher(str);
        return matcher.find() ? matcher.replaceFirst("<ip>") : str;
    }

    /* renamed from: c */
    static String m91142c(String str) {
        if (str != null && !str.isEmpty()) {
            Matcher matcher = f106053c.matcher(str);
            if (matcher.find()) {
                return matcher.group(0);
            }
            bnrq bnrq = (bnrq) f106051a.mo68388c();
            bnrq.mo68432a("bdne", "c", 344, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68420a("contentType extraction failed for %s, skipping logging path", str);
        }
        return null;
    }

    /* renamed from: a */
    static String m91140a(String str, bdnq bdnq, boolean z) {
        boolean z2;
        if (str.isEmpty()) {
            return null;
        }
        if (bdnq != null && !z) {
            str = bdnq.mo58214a();
        }
        if (!z) {
            String a = m91139a(str);
            if (a != null) {
                str = a;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        Matcher matcher = f106054d.matcher(str);
        if (matcher.find()) {
            str = matcher.group(1);
            z2 = true;
        }
        String b = m91141b(str);
        if (b != null && !b.equals(str)) {
            z2 = true;
        }
        Matcher matcher2 = f106057g.matcher(b);
        if (matcher2.find()) {
            b = matcher2.replaceFirst("<ip>");
            z2 = true;
        }
        if (z2) {
            return b;
        }
        Matcher matcher3 = f106056f.matcher(b);
        if (!matcher3.find()) {
            return null;
        }
        return matcher3.group(1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4  */
    /* renamed from: a */
    public final cios mo58205a(bdnd... bdndArr) {
        String str;
        String str2;
        bxvd da = cinm.f190968b.mo74144da();
        int i = 0;
        while (i < bdndArr.length) {
            bxvd da2 = cinl.f190943w.mo74144da();
            int i2 = bdndArr[i].f106033e;
            if (i2 > 0) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cinl cinl = (cinl) da2.f164949b;
                cinl.f190945a |= 128;
                cinl.f190953i = i2;
            }
            int i3 = bdndArr[i].f106032d;
            if (i3 > 0) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cinl cinl2 = (cinl) da2.f164949b;
                cinl2.f190945a |= 64;
                cinl2.f190952h = i3;
            }
            long j = bdndArr[i].f106031c;
            if (j > 0) {
                int i4 = (int) j;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cinl cinl3 = (cinl) da2.f164949b;
                cinl3.f190945a |= 8;
                cinl3.f190949e = i4;
            }
            long j2 = bdndArr[i].f106030b;
            if (j2 > 0) {
                int i5 = (int) j2;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cinl cinl4 = (cinl) da2.f164949b;
                cinl4.f190945a |= 16;
                cinl4.f190950f = i5;
            }
            int i6 = bdndArr[i].f106038j;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cinl cinl5 = (cinl) da2.f164949b;
            cinl5.f190945a |= 32;
            cinl5.f190951g = i6;
            bdnd bdnd = bdndArr[i];
            int i7 = bdnd.f106048t;
            String str3 = bdnd.f106039k;
            if (str3 != null) {
                if (!str3.isEmpty()) {
                    Matcher matcher = f106053c.matcher(str3);
                    if (matcher.find()) {
                        str2 = matcher.group(0);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        cinl cinl6 = (cinl) da2.f164949b;
                        str2.getClass();
                        cinl6.f190945a |= 1;
                        cinl6.f190946b = str2;
                    } else {
                        bnrq bnrq = (bnrq) f106051a.mo68388c();
                        bnrq.mo68432a("bdne", "c", 344, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnrq.mo68420a("contentType extraction failed for %s, skipping logging path", str3);
                    }
                }
                str2 = null;
                if (da2.f164950c) {
                }
                cinl cinl62 = (cinl) da2.f164949b;
                str2.getClass();
                cinl62.f190945a |= 1;
                cinl62.f190946b = str2;
            }
            bdnd bdnd2 = bdndArr[i];
            String str4 = bdnd2.f106037i;
            cinl cinl7 = (cinl) da2.f164949b;
            cinl7.f190954j = 0;
            int i8 = cinl7.f190945a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            cinl7.f190945a = i8;
            String str5 = bdnd2.f106034f;
            if (str5 == null) {
                str = null;
            } else if (bdnd2.f106036h) {
                String str6 = bdnd2.f106035g;
                str5.getClass();
                cinl7.f190945a = i8 | 4;
                cinl7.f190948d = str5;
                str = null;
            } else {
                str = m91139a(str5);
                if (this.f106058h) {
                    bnrd a = f106052b.iterator();
                    while (true) {
                        if (!a.hasNext()) {
                            break;
                        } else if (str5.contains((String) a.next())) {
                            Matcher matcher2 = f106055e.matcher(m91140a(str5, this.f106059i, true));
                            String group = matcher2.matches() ? matcher2.group(2) : null;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            cinl cinl8 = (cinl) da2.f164949b;
                            group.getClass();
                            cinl8.f190945a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                            cinl8.f190963s = group;
                        }
                    }
                }
                String a2 = m91140a(str5, this.f106059i, false);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cinl cinl9 = (cinl) da2.f164949b;
                a2.getClass();
                cinl9.f190945a = 2 | cinl9.f190945a;
                cinl9.f190947c = a2;
            }
            if (str != null) {
                String b = m91141b(str);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cinl cinl10 = (cinl) da2.f164949b;
                b.getClass();
                cinl10.f190945a |= 1048576;
                cinl10.f190965u = b;
            }
            bdnd bdnd3 = bdndArr[i];
            String[] strArr = bdnd3.f106040l;
            cioa cioa = bdnd3.f106041m;
            if (cioa != null) {
                cinl cinl11 = (cinl) da2.f164949b;
                cioa.getClass();
                cinl11.f190955k = cioa;
                cinl11.f190945a |= 512;
            }
            cink cink = (cink) bmxv.m108567c(cink.m150634a(0)).mo66812a(cink.UNKNOWN);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cinl cinl12 = (cinl) da2.f164949b;
            cinl12.f190956l = cink.f190942c;
            cinl12.f190945a |= 1024;
            bxvd da3 = cini.f190934c.mo74144da();
            int i9 = bdndArr[i].f106049u;
            if (i9 != 0) {
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cini cini = (cini) da3.f164949b;
                cini.f190937b = i9 - 2;
                cini.f190936a |= 1;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cinl cinl13 = (cinl) da2.f164949b;
            cini cini2 = (cini) da3.mo74062i();
            cini2.getClass();
            cinl13.f190957m = cini2;
            cinl13.f190945a |= 2048;
            bdnd bdnd4 = bdndArr[i];
            cimz cimz = bdnd4.f106042n;
            long j3 = bdnd4.f106029a;
            if (j3 > 0) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cinl cinl14 = (cinl) da2.f164949b;
                cinl14.f190945a |= 8192;
                cinl14.f190958n = j3;
            }
            if (bdndArr[i].f106045q > 0) {
                bxvd da4 = cinf.f190928d.mo74144da();
                int i10 = bdndArr[i].f106045q;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                cinf cinf = (cinf) da4.f164949b;
                int i11 = cinf.f190930a | 1;
                cinf.f190930a = i11;
                cinf.f190931b = i10;
                if (bdndArr[i].f106046r > 0) {
                    cinf.f190930a = i11 | 2;
                    cinf.f190932c = 1;
                }
                cinf cinf2 = (cinf) da4.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cinl cinl15 = (cinl) da2.f164949b;
                cinf2.getClass();
                cinl15.f190966v = cinf2;
                cinl15.f190945a |= 4194304;
            }
            int i12 = bdndArr[i].f106050v;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cinl cinl16 = (cinl) da2.f164949b;
            int i13 = i12 - 1;
            if (i12 != 0) {
                cinl16.f190959o = i13;
                cinl16.f190945a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                int i14 = bdndArr[i].f106043o;
                int a3 = cino.m150641a(0);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cinl cinl17 = (cinl) da2.f164949b;
                int i15 = a3 - 1;
                if (a3 != 0) {
                    cinl17.f190960p = i15;
                    int i16 = cinl17.f190945a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                    cinl17.f190945a = i16;
                    bdnd bdnd5 = bdndArr[i];
                    int i17 = bdnd5.f106044p;
                    int i18 = i16 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                    cinl17.f190945a = i18;
                    cinl17.f190961q = 0;
                    int i19 = bdnd5.f106047s;
                    cinl17.f190945a = i18 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                    cinl17.f190962r = 0;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cinm cinm = (cinm) da.f164949b;
                    cinl cinl18 = (cinl) da2.mo74062i();
                    cinl18.getClass();
                    cinm.mo86261c();
                    cinm.f190970a.add(cinl18);
                    i++;
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        bxvd da5 = cios.f191113s.mo74144da();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        cios cios = (cios) da5.f164949b;
        cinm cinm2 = (cinm) da.mo74062i();
        cinm2.getClass();
        cios.f191121g = cinm2;
        cios.f191115a |= 32;
        try {
            if (this.f106060j.mo66813a()) {
                bmxv a4 = ((bdng) this.f106060j.mo66814b()).mo58207a();
                if (a4.mo66813a()) {
                    cimz cimz2 = (cimz) a4.mo66814b();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    cios cios2 = (cios) da5.f164949b;
                    cimz2.getClass();
                    cios2.f191126l = cimz2;
                    cios2.f191115a |= 8192;
                }
            }
        } catch (Exception e) {
            bnrq bnrq2 = (bnrq) f106051a.mo68388c();
            bnrq2.mo68437a(e);
            bnrq2.mo68432a("bdne", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq2.mo68405a("Exception while getting network metric extension!");
        }
        return (cios) da5.mo74062i();
    }
}
