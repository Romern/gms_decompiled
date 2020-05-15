package p000;

import android.util.Pair;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: bbgc */
final /* synthetic */ class bbgc implements Callable {

    /* renamed from: a */
    private final bbgf f102579a;

    /* renamed from: b */
    private final Iterable f102580b;

    public bbgc(bbgf bbgf, Iterable iterable) {
        this.f102579a = bbgf;
        this.f102580b = iterable;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        if (r8.equals("UNKNOWN") != false) goto L_0x007e;
     */
    public final Object call() {
        bbfz bbfz;
        Throwable th;
        int i;
        Throwable th2;
        bbgf bbgf = this.f102579a;
        Iterable<bxtx> iterable = this.f102580b;
        beeq a = bbgf.mo56132a();
        bbfv b = bbfw.m87969b();
        for (bxtx bxtx : iterable) {
            String a2 = bbgf.m87983a(bxtx);
            beep a3 = a.mo60616a(a2);
            if (a3 == null) {
                bbfx d = bbfz.m87976d();
                d.f102572a = 3;
                bbfz = d.mo56122a();
            } else {
                char c = 0;
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(a3.mo60615a(0)));
                try {
                    long readLong = dataInputStream.readLong();
                    String readUTF = dataInputStream.readUTF();
                    switch (readUTF.hashCode()) {
                        case -694877179:
                            if (readUTF.equals("DOES_NOT_EXIST")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -560484010:
                            if (readUTF.equals("NOT_FOUND_BUT_MAY_EXIST")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 67084130:
                            if (readUTF.equals("FOUND")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 433141802:
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        i = 1;
                    } else if (c == 1) {
                        i = 2;
                    } else if (c == 2) {
                        i = 3;
                    } else if (c == 3) {
                        i = 4;
                    } else {
                        throw new IllegalArgumentException();
                    }
                    long readLong2 = dataInputStream.readLong();
                    dataInputStream.close();
                    long currentTimeMillis = System.currentTimeMillis();
                    int i2 = krp.f24894a;
                    Pair create = Pair.create(Long.valueOf(ccjs.m130142d()), TimeUnit.DAYS);
                    long j = readLong2;
                    if (currentTimeMillis <= readLong + ((TimeUnit) create.second).toMillis(((Long) create.first).longValue())) {
                        bbfx d2 = bbfz.m87976d();
                        d2.f102572a = i;
                        d2.mo56123a(j);
                        if (i == 2) {
                            FileInputStream fileInputStream = new FileInputStream(a3.mo60615a(1));
                            try {
                                d2.mo56124a(bxtx.m123256a(fileInputStream));
                                fileInputStream.close();
                            } catch (Throwable th3) {
                                bqye.m113761a(th2, th3);
                            }
                        }
                        bbfz = d2.mo56122a();
                    } else {
                        a.mo60621c(a2);
                        bbfx d3 = bbfz.m87976d();
                        d3.f102572a = 3;
                        bbfz = d3.mo56122a();
                    }
                } catch (Throwable th4) {
                    bqye.m113761a(th, th4);
                }
            }
            b.mo56120a(bbfz);
        }
        return b.mo56119a();
        throw th2;
        throw th;
    }
}
