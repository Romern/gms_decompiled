package p000;

import android.content.Intent;
import android.os.Debug;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterInputStream;

/* renamed from: bdkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdkn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bdkp f105817a;

    /* renamed from: b */
    private final File f105818b;

    /* renamed from: c */
    private final cimx f105819c;

    /* renamed from: d */
    private final Float f105820d;

    /* renamed from: e */
    private final Long f105821e;

    /* renamed from: f */
    private final Long f105822f;

    public bdkn(bdkp bdkp, File file, cimx cimx, Float f, Long l, Long l2) {
        this.f105817a = bdkp;
        this.f105818b = file;
        this.f105819c = cimx;
        this.f105820d = f;
        this.f105821e = l;
        this.f105822f = l2;
    }

    public final void run() {
        DeflaterInputStream deflaterInputStream;
        bdkp bdkp = this.f105817a;
        bnrt bnrt = bdkp.f105825a;
        bdkp.f105826b.set(false);
        Debug.stopMethodTracing();
        Long valueOf = Long.valueOf(this.f105817a.f105835k.mo54417a());
        long longValue = valueOf.longValue();
        long longValue2 = this.f105821e.longValue();
        bdkp bdkp2 = this.f105817a;
        if (longValue < longValue2 + ((long) bdkp2.f105833i)) {
            Intent registerReceiver = bdkp2.f105827c.registerReceiver(null, bdkp2.f105834j);
            cimx cimx = this.f105819c;
            bxvd bxvd = (bxvd) cimx.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) cimx);
            cimy a = this.f105817a.mo58123a(registerReceiver);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cimx cimx2 = (cimx) bxvd.f164949b;
            cimx cimx3 = cimx.f190865e;
            a.getClass();
            cimx2.f190869c = a;
            cimx2.f190867a |= 2;
            float floatValue = this.f105820d.floatValue() - this.f105817a.mo58124b(registerReceiver);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cimx cimx4 = (cimx) bxvd.f164949b;
            cimx4.f190867a |= 4;
            cimx4.f190870d = floatValue;
            cimx cimx5 = (cimx) bxvd.mo74062i();
            bxvd da = cimw.f190855i.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimw cimw = (cimw) da.f164949b;
            cimx5.getClass();
            cimw.f190859c = cimx5;
            cimw.f190857a |= 2;
            File file = this.f105818b;
            if (file == null || !file.exists()) {
                bnrq bnrq = (bnrq) bdkp.f105825a.mo68387b();
                bnrq.mo68432a("bdkn", "run", 277, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("Missing trace file");
            } else {
                long length = this.f105818b.length();
                if (length > 0 && length < ((long) this.f105817a.f105829e)) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.f105818b);
                        try {
                            bxtv d = ByteString.m123268d((int) length);
                            try {
                                byte[] bArr = new byte[1024];
                                deflaterInputStream = new DeflaterInputStream(fileInputStream, new Deflater(9));
                                while (true) {
                                    int read = deflaterInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    d.write(bArr, 0, read);
                                }
                                deflaterInputStream.close();
                                ByteString a2 = d.mo73765a();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                cimw cimw2 = (cimw) da.f164949b;
                                a2.getClass();
                                cimw2.f190857a |= 1;
                                cimw2.f190858b = a2;
                                this.f105817a.mo58127f();
                                d.close();
                                fileInputStream.close();
                            } catch (Throwable th) {
                                d.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            fileInputStream.close();
                            throw th2;
                        }
                    } catch (IOException e) {
                        bnrq bnrq2 = (bnrq) bdkp.f105825a.mo68387b();
                        bnrq2.mo68437a(e);
                        bnrq2.mo68432a("bdkn", "run", 287, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnrq2.mo68420a("Unable to read file %s", this.f105818b);
                    } catch (Throwable th3) {
                        bqye.m113761a(th2, th3);
                    }
                }
            }
            double d2 = this.f105817a.f105832h;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimw cimw3 = (cimw) da.f164949b;
            int i = cimw3.f190857a | 4;
            cimw3.f190857a = i;
            cimw3.f190860d = d2;
            int i2 = this.f105817a.f105830f;
            cimw3.f190857a = i | 32;
            cimw3.f190863g = i2;
            if (valueOf.longValue() - this.f105822f.longValue() < 2147483647L) {
                int longValue3 = (int) (valueOf.longValue() - this.f105822f.longValue());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cimw cimw4 = (cimw) da.f164949b;
                cimw4.f190857a |= 16;
                cimw4.f190862f = longValue3;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cimw cimw5 = (cimw) da.f164949b;
                cimw5.f190857a |= 16;
                cimw5.f190862f = -1;
            }
            bdkp bdkp3 = this.f105817a;
            int i3 = bdkp3.f105831g;
            cimw cimw6 = (cimw) da.f164949b;
            int i4 = cimw6.f190857a | 8;
            cimw6.f190857a = i4;
            cimw6.f190861e = i3;
            int i5 = bdkp3.f105829e;
            cimw6.f190857a = i4 | 64;
            cimw6.f190864h = i5;
            if (cimw6.f190858b.mo73744a() > 0) {
                bxvd da2 = cios.f191113s.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cios cios = (cios) da2.f164949b;
                cimw cimw7 = (cimw) da.mo74062i();
                cimw7.getClass();
                cios.f191129o = cimw7;
                cios.f191115a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                this.f105817a.f105836l.mo58102a((cios) da2.mo74062i());
            }
            this.f105817a.mo58125d();
            return;
        }
        bdkp2.mo58125d();
        bnrq bnrq3 = (bnrq) bdkp.f105825a.mo68388c();
        bnrq3.mo68432a("bdkn", "run", 260, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnrq3.mo68415a("Missed sample window by %d ms", valueOf.longValue() - this.f105821e.longValue());
        return;
        throw th;
    }
}
