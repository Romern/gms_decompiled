package p000;

import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: pdv */
final /* synthetic */ class pdv implements Runnable {

    /* renamed from: a */
    private final pdx f38888a;

    public pdv(pdx pdx) {
        this.f38888a = pdx;
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [int], assign insn: 0x006f: ARRAY_LENGTH  (r9v8 ? I:int) = (r9v7 byte[]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int):void
     arg types: [java.lang.String, short]
     candidates:
      bnsi.a(java.lang.String, byte):void
      bnsi.a(java.lang.String, long):void
      bnsi.a(java.lang.String, java.lang.Object):void
      bnsi.a(java.lang.String, short):void
      bnsi.a(java.lang.String, java.lang.Object[]):void
      bnsi.a(java.lang.String, int):void */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void run() {
        boolean z;
        short s;
        String str;
        int i;
        bixd bixd;
        int i2;
        int i3;
        String str2;
        String str3 = "unknown";
        pdx pdx = this.f38888a;
        byte[] bArr = new byte[1028];
        short s2 = 1;
        pdx.f38892c = true;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        boolean z2 = true;
        while (pdx.f38892c && pdx.mo22938a(bArr, 0, 4)) {
            short s3 = wrap.getShort();
            if (s3 <= 1020) {
                short s4 = wrap.getShort();
                if (pdx.mo22938a(bArr, 4, s3 + 4)) {
                    pdz pdz = pdx.f38893d;
                    bnsn bnsn = pdz.f38896a;
                    if (pdz.f38911O != null) {
                        Pair a = pcm.m30203a(bArr, 2, s3 + 2);
                        if (a != null) {
                            byte[] k = ((bxxc) a.second).mo73642k();
                            ByteBuffer a2 = pdx.f38893d.mo22942a(((Integer) a.first).intValue(), k);
                            System.arraycopy(a2.array(), 0, bArr, 0, a2.array().length);
                            s4 = ((Integer) a.first).shortValue();
                            ? length = k.length;
                            z = z2;
                            s = length;
                        } else {
                            s = s3;
                            z = false;
                        }
                    } else {
                        z = z2;
                        s = s3;
                    }
                    if (!z) {
                        str = str3;
                    } else if (s > 0) {
                        pdz pdz2 = pdx.f38893d;
                        pdz2.f38912P.mo22596a();
                        if (s4 == s2) {
                            str = str3;
                            bixe bixe = (bixe) pdz.m30228a((bxxk) bixe.f122174d.mo74142c(7), bArr, 4, s);
                            if (pcm.m30215d(bixe.f122177b)) {
                                pdz2.f38931h = bixe.f122177b;
                                if ((bixe.f122176a & 2) != 0) {
                                    pdz2.f38932i = bixe.f122178c;
                                }
                                pdz2.f38942s = true;
                                pdz2.f38941r = SystemClock.elapsedRealtime();
                                pdz2.mo22948a(dcm.WIFI_PROJECTION_START_REQUESTED);
                                pdz2.mo22949a(pdz2.f38931h, pdz2.f38932i);
                                pdz2.f38912P.mo22596a();
                                bxvd da = bixf.f122179e.mo74144da();
                                if (!da.f164950c) {
                                    i = 0;
                                } else {
                                    da.mo74035c();
                                    i = 0;
                                    da.f164950c = false;
                                }
                                bixf bixf = (bixf) da.f164949b;
                                bixf.f122184d = i;
                                bixf.f122181a |= 4;
                                pdz2.mo22947a((bixf) da.mo74062i(), 7);
                            } else {
                                pdz2.mo22944a(5);
                            }
                        } else if (s4 == 7) {
                            str = str3;
                            pdz2.f38935l.set(false);
                            bixf bixf2 = (bixf) pdz.m30228a((bxxk) bixf.f122179e.mo74142c(7), bArr, 4, s);
                            if (bixf2 != null) {
                                int a3 = biwy.m102920a(bixf2.f122184d);
                                if (a3 == 0) {
                                    a3 = 13;
                                }
                                int i4 = a3 - 12;
                                if (i4 == -6) {
                                    if (pdz2.f38898B) {
                                        pcj pcj = pdz2.f38902F;
                                        if (pcj.f38839f.get() == 0) {
                                            pcj.f38838e.post(null);
                                            pcj.f38839f.incrementAndGet();
                                        } else {
                                            pcj.f38838e.removeCallbacks(null);
                                            double d = (double) pcj.f38835b;
                                            double pow = Math.pow(pcj.f38837d, (double) (pcj.f38839f.get() - 1));
                                            Double.isNaN(d);
                                            long j = (long) (d * pow);
                                            pcj.f38840g = j;
                                            if (j >= pcj.f38836c) {
                                                pcj.f38834a.mo22694a(bpea.WIFI_START_EXPONENTIAL_RETRY_MAX_DELAY_REACHED);
                                            } else {
                                                pcj.f38839f.incrementAndGet();
                                                pcj.f38838e.postDelayed(new pch(pcj), pcj.f38840g);
                                            }
                                        }
                                    }
                                    pdz2.mo22948a(dcm.START_WIFI_REQUEST_FAILED_WIFI_NOT_YET_STARTED);
                                    pdz2.f38902F.mo22904b();
                                } else if (i4 == -5) {
                                    pdz2.f38902F.mo22904b();
                                    pdz2.mo22948a(dcm.START_WIFI_REQUEST_FAILED_WIFI_DISABLED);
                                } else if (i4 == -4) {
                                    pdz2.f38902F.mo22904b();
                                    pdz2.mo22948a(dcm.START_WIFI_REQUEST_FAILED_ALREADY_STARTED);
                                } else if (i4 != 0) {
                                    bnsi b = pdz.f38896a.mo68387b();
                                    b.mo68432a("pdz", "a", 1578, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    b.mo68405a("Unexpected Wifi Response Message");
                                } else {
                                    pdz2.f38902F.mo22904b();
                                    if (pcm.m30215d(bixf2.f122182b)) {
                                        pdz2.f38931h = bixf2.f122182b;
                                        if ((bixf2.f122181a & 2) != 0) {
                                            pdz2.f38932i = bixf2.f122183c;
                                        }
                                        pdz2.mo22948a(dcm.START_WIFI_REQUEST_SUCCESS);
                                        pdz2.mo22949a(pdz2.f38931h, pdz2.f38932i);
                                    } else {
                                        pdz2.mo22944a(9);
                                    }
                                }
                            }
                        } else if (s4 == 3) {
                            str = str3;
                            bixb bixb = (bixb) pdz.m30228a((bxxk) bixb.f122154e.mo74142c(7), bArr, 4, s);
                            String a4 = pcm.m30207a(bixb.f122156a);
                            String str4 = bixb.f122158c;
                            String a5 = pcm.m30207a(bixb.f122157b);
                            bixd a6 = bixd.m102925a(bixb.f122159d);
                            if (a6 != null) {
                                bixd = a6;
                            } else {
                                bixd = bixd.UNKNOWN_SECURITY_MODE;
                            }
                            pdz2.mo22951a(a4, str4, a5, bixd, pdz2.f38931h, pdz2.f38932i);
                        } else if (s4 != 4) {
                            bnsi b2 = pdz.f38896a.mo68387b();
                            b2.mo68432a("pdz", "a", 1044, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            b2.mo68409a("Unexpected message type: %s", (int) s4);
                            str = str3;
                        } else {
                            bixg bixg = (bixg) pdz.m30228a((bxxk) bixg.f122185d.mo74142c(7), bArr, 4, s);
                            int i5 = bixg.f122187a;
                            pdz2.f38933j = i5;
                            int i6 = bixg.f122188b;
                            pdz2.f38934k = i6;
                            int[] a7 = bqcn.m112584a(bixg.f122189c);
                            bxvd da2 = bixh.f122191f.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bixh bixh = (bixh) da2.f164949b;
                            int i7 = bixh.f122193a | 1;
                            bixh.f122193a = i7;
                            bixh.f122194b = i5;
                            bixh.f122193a = i7 | 2;
                            bixh.f122195c = i6;
                            if (i5 == 0) {
                                i2 = 12;
                            } else {
                                i2 = 11;
                            }
                            if (i5 != 1) {
                                i3 = i2;
                            } else {
                                i3 = (a7 == null || (!pdz2.f38899C ? a7.length <= 0 : !pdz2.f38907K.mo22905a(a7))) ? 4 : 12;
                            }
                            if (i6 <= 0) {
                                pdz2.f38912P.mo22596a();
                            }
                            int i8 = Build.VERSION.SDK_INT;
                            try {
                                str = str3;
                                try {
                                    str2 = C1133kh.m17835a(pdz2.f38929f, "android.permission.READ_PHONE_STATE") != 0 ? str : Build.getSerial();
                                } catch (SecurityException e) {
                                    str2 = str;
                                    if (da2.f164950c) {
                                    }
                                    bixh bixh2 = (bixh) da2.f164949b;
                                    str2.getClass();
                                    int i9 = bixh2.f122193a | 4;
                                    bixh2.f122193a = i9;
                                    bixh2.f122196d = str2;
                                    bixh2.f122197e = i3 - 12;
                                    bixh2.f122193a = i9 | 8;
                                    pdz2.mo22947a(da2.mo74062i(), 5);
                                    if (i3 == 12) {
                                    }
                                    pdz2.mo22948a(dcm.VERSION_CHECK_COMPLETE);
                                    wrap.clear();
                                    z2 = z;
                                    str3 = str;
                                    s2 = 1;
                                }
                            } catch (SecurityException e2) {
                                str = str3;
                                str2 = str;
                                if (da2.f164950c) {
                                }
                                bixh bixh22 = (bixh) da2.f164949b;
                                str2.getClass();
                                int i92 = bixh22.f122193a | 4;
                                bixh22.f122193a = i92;
                                bixh22.f122196d = str2;
                                bixh22.f122197e = i3 - 12;
                                bixh22.f122193a = i92 | 8;
                                pdz2.mo22947a(da2.mo74062i(), 5);
                                if (i3 == 12) {
                                }
                                pdz2.mo22948a(dcm.VERSION_CHECK_COMPLETE);
                                wrap.clear();
                                z2 = z;
                                str3 = str;
                                s2 = 1;
                            }
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bixh bixh222 = (bixh) da2.f164949b;
                            str2.getClass();
                            int i922 = bixh222.f122193a | 4;
                            bixh222.f122193a = i922;
                            bixh222.f122196d = str2;
                            bixh222.f122197e = i3 - 12;
                            bixh222.f122193a = i922 | 8;
                            pdz2.mo22947a(da2.mo74062i(), 5);
                            if (i3 == 12) {
                                pdz2.f38904H.mo22692a(pdz2.f38938o, i5, i6, SystemClock.elapsedRealtime() - pdz2.f38940q, pdz2.f38936m);
                                pdz2.mo22948a(dcm.FOUND_COMPATIBLE_WIFI_NETWORK);
                            } else if (i3 == 4) {
                                pdz2.f38904H.mo22691a(pdz2.f38938o, i5, i6, 305, pdz2.f38936m);
                                pdz2.mo22948a(dcm.NO_COMPATIBLE_WIFI_CHANNEL_FOUND);
                                bnsi b3 = pdz.f38896a.mo68387b();
                                b3.mo68432a("pdz", "a", 900, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                b3.mo68420a("WiFi channels not supported: %s", Arrays.toString(a7));
                                pdz2.f38944u.post(new pdn(pdz2));
                            } else {
                                pdz2.f38904H.mo22691a(pdz2.f38938o, i5, i6, 2, pdz2.f38936m);
                                pdz2.mo22948a(dcm.NO_COMPATIBLE_WIFI_VERSION_FOUND);
                                bnsi b4 = pdz.f38896a.mo68387b();
                                b4.mo68432a("pdz", "a", 911, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                b4.mo68411a("HU version mismatch, requested major version: %d, phone using version: %d", i5, 1);
                                pdz2.f38944u.post(new pcw(pdz2));
                            }
                            pdz2.mo22948a(dcm.VERSION_CHECK_COMPLETE);
                        }
                    } else {
                        str = str3;
                    }
                    wrap.clear();
                    z2 = z;
                    str3 = str;
                    s2 = 1;
                } else {
                    return;
                }
            } else {
                bnsi b5 = pdz.f38896a.mo68387b();
                b5.mo68432a("pdx", "b", 1345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b5.mo68409a("Message exceeding max read size of %d bytes", 1024);
                pdx.f38893d.mo22948a(dcm.RFCOMM_READ_FAILURE);
                pdx.f38893d.mo22960g();
                return;
            }
        }
    }
}
