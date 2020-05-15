package p000;

import android.bluetooth.BluetoothSocket;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: pdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pdx {

    /* renamed from: a */
    public final BluetoothSocket f38890a;

    /* renamed from: b */
    public final OutputStream f38891b = this.f38890a.getOutputStream();

    /* renamed from: c */
    public boolean f38892c;

    /* renamed from: d */
    final /* synthetic */ pdz f38893d;

    /* renamed from: e */
    private final InputStream f38894e;

    public pdx(pdz pdz, BluetoothSocket bluetoothSocket) {
        this.f38893d = pdz;
        this.f38890a = bluetoothSocket;
        this.f38894e = bluetoothSocket.getInputStream();
    }

    /* renamed from: a */
    public final void mo22937a() {
        this.f38892c = false;
        try {
            this.f38890a.close();
        } catch (IOException e) {
        }
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [int], assign insn: 0x006d: ARRAY_LENGTH  (r8v8 ? I:int) = (r8v7 byte[]) */
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
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    public final /* synthetic */ void mo22939b() {
        boolean z;
        short s;
        String str;
        int i;
        bixd bixd;
        int i2;
        int i3;
        String str2;
        String str3 = "unknown";
        byte[] bArr = new byte[1028];
        short s2 = 1;
        this.f38892c = true;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        boolean z2 = true;
        while (this.f38892c && mo22938a(bArr, 0, 4)) {
            short s3 = wrap.getShort();
            if (s3 <= 1020) {
                short s4 = wrap.getShort();
                if (mo22938a(bArr, 4, s3 + 4)) {
                    pdz pdz = this.f38893d;
                    bnsn bnsn = pdz.f38896a;
                    if (pdz.f38911O != null) {
                        Pair a = pcm.m30203a(bArr, 2, s3 + 2);
                        if (a != null) {
                            byte[] k = ((bxxc) a.second).serializeToBytes();
                            ByteBuffer a2 = this.f38893d.mo22942a(((Integer) a.first).intValue(), k);
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
                        pdz pdz2 = this.f38893d;
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
                            short s5 = bixh.f122193a | s2;
                            bixh.f122193a = s5;
                            bixh.f122194b = i5;
                            bixh.f122193a = s5 | 2;
                            bixh.f122195c = i6;
                            if (i5 == 0) {
                                i2 = 12;
                            } else {
                                i2 = 11;
                            }
                            if (i5 != s2) {
                                i3 = i2;
                            } else {
                                i3 = (a7 == null || (!pdz2.f38899C ? a7.length <= 0 : !pdz2.f38907K.mo22905a(a7))) ? 4 : 12;
                            }
                            if (i6 <= 0) {
                                pdz2.f38912P.mo22596a();
                            }
                            int i7 = Build.VERSION.SDK_INT;
                            try {
                                str2 = C1133kh.m17835a(pdz2.f38929f, "android.permission.READ_PHONE_STATE") != 0 ? str3 : Build.getSerial();
                            } catch (SecurityException e) {
                                str2 = str3;
                            }
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bixh bixh2 = (bixh) da2.f164949b;
                            str2.getClass();
                            str = str3;
                            int i8 = bixh2.f122193a | 4;
                            bixh2.f122193a = i8;
                            bixh2.f122196d = str2;
                            bixh2.f122197e = i3 - 12;
                            bixh2.f122193a = i8 | 8;
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
                this.f38893d.mo22948a(dcm.RFCOMM_READ_FAILURE);
                this.f38893d.mo22960g();
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo22938a(byte[] bArr, int i, int i2) {
        while (i < i2) {
            try {
                int read = this.f38894e.read(bArr, i, i2 - i);
                if (read >= 0) {
                    i += read;
                } else {
                    bnsi b = pdz.f38896a.mo68387b();
                    b.mo68432a("pdx", "a", 1398, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("Reached end of BluetoothInputStream");
                    this.f38893d.f38944u.post(new pdw(this));
                    return false;
                }
            } catch (IOException e) {
                bnsi b2 = pdz.f38896a.mo68387b();
                b2.mo68437a(e);
                b2.mo68432a("pdx", "a", 1404, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("failure to read over Bluetooth");
                this.f38893d.mo22948a(dcm.RFCOMM_READ_FAILURE);
                this.f38893d.mo22960g();
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo22940b(byte[] bArr, int i, int i2) {
        try {
            this.f38891b.write(bArr, i, i2);
            this.f38891b.flush();
        } catch (IOException e) {
            bnsi b = pdz.f38896a.mo68387b();
            b.mo68432a("pdx", "b", 1418, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("failure to write over Bluetooth");
            this.f38893d.mo22948a(dcm.RFCOMM_WRITE_FAILURE);
            this.f38893d.mo22960g();
        }
    }
}
