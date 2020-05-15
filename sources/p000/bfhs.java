package p000;

import android.content.Context;
import android.media.AudioFormat;
import android.os.Build;
import android.os.SystemClock;
import com.felicanetworks.mfc.Felica;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bfhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfhs extends bfhw {

    /* renamed from: d */
    private long f113972d;

    public bfhs(Context context, bfev bfev, bfew bfew, bhdb bhdb, bgmk bgmk) {
        super(context, bfev, bfew, bhdb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo61644a(int i, int i2, long j) {
        bfhr bfhr;
        double d;
        ArrayList arrayList;
        int i3;
        int i4;
        bfhr bfhr2;
        bfhs bfhs = this;
        int i5 = i;
        bfhs.f113972d = j;
        bfhr bfhr3 = new bfhr(i5);
        bfhr3.f113971j = j;
        short[] sArr = new short[i5];
        while (bfhw.f113975a) {
            int read = bfhw.f113976b.read(sArr, 0, i5, 0);
            if (read >= 0) {
                bfio bfio = bfhr3.f113966b;
                bfim bfim = bfio.f114023b;
                bmxy.m108588a(true);
                bfim.mo61730a(0, read, i5);
                for (int i6 = 0; i6 < read; i6++) {
                    bfim.f114017a[bfim.mo61729a(bfim.f114020d + i6)] = sArr[i6];
                }
                bfim.mo61731b(read);
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    bfim bfim2 = bfio.f114023b;
                    int i7 = bfim2.f114020d;
                    int i8 = bfio.f114022a;
                    if (i7 < i8) {
                        break;
                    }
                    short[] sArr2 = new short[i8];
                    int min = Math.min(i8, i7);
                    for (int i9 = 0; i9 < min; i9++) {
                        sArr2[i9] = bfim2.f114017a[bfim2.mo61729a(i9)];
                    }
                    bfio.f114023b.mo61732c(i8);
                    arrayList2.add(sArr2);
                }
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    short[] sArr3 = (short[]) arrayList2.get(i10);
                    int length = sArr3.length;
                    double[] dArr = new double[length];
                    for (int i11 = 0; i11 < sArr3.length; i11++) {
                        double d2 = (double) sArr3[i11];
                        Double.isNaN(d2);
                        dArr[i11] = d2 / 32768.0d;
                    }
                    if (bfhr.f113968g == 0) {
                        bfhr.f113970i = SystemClock.elapsedRealtime();
                    }
                    "Nexus 5".equals(Build.MODEL);
                    if (!"Gear Live".equals(Build.MODEL)) {
                        d = 100000.0d;
                    } else {
                        d = 400000.0d;
                    }
                    double[] dArr2 = new double[length];
                    int i12 = 0;
                    while (i12 < length) {
                        dArr2[i12] = dArr[i12] * d;
                        i12++;
                        arrayList2 = arrayList2;
                        sArr = sArr;
                        dArr2 = dArr2;
                    }
                    bfht bfht = bfhr.f113962a;
                    bffh bffh = new bffh();
                    double[] dArr3 = new double[length];
                    for (int i13 = 0; i13 < length; i13++) {
                        dArr3[i13] = dArr2[i13] * bfhr.f113963d[i13];
                    }
                    if (length <= 0 || ((length - 1) & length) != 0) {
                        throw new IllegalArgumentException("Must be a power of 2");
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (int i14 = 0; i14 < length; i14++) {
                        arrayList4.add(Double.valueOf(dArr3[i14]));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int size2 = arrayList4.size();
                    int i15 = 0;
                    while (true) {
                        arrayList = arrayList3;
                        if (i15 >= size2) {
                            break;
                        }
                        arrayList5.add(new bffg(((Double) arrayList4.get(i15)).doubleValue(), 0.0d));
                        i15++;
                        arrayList3 = arrayList;
                        arrayList2 = arrayList2;
                        sArr = sArr;
                    }
                    ArrayList arrayList6 = arrayList2;
                    short[] sArr4 = sArr;
                    List subList = bffh.mo61576a(arrayList5).subList(0, arrayList4.size() / 2);
                    ArrayList arrayList7 = new ArrayList();
                    for (int i16 = 0; i16 < subList.size(); i16++) {
                        bffg bffg = (bffg) subList.get(i16);
                        double d3 = bffg.f113635a;
                        double d4 = bffg.f113636b;
                        arrayList7.add(Double.valueOf((d3 * d3) + (d4 * d4)));
                    }
                    bfhr.f113967c = arrayList7;
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(new ArrayList());
                    double d5 = 0.5d;
                    for (int i17 = 0; i17 < 512; i17++) {
                        double[] dArr4 = bfhr.f113965f;
                        if (dArr4 != null) {
                            bfhr2 = bfhr;
                        } else {
                            dArr4 = new double[512];
                            bfhr.f113965f = dArr4;
                            int i18 = 0;
                            while (i18 < 512) {
                                double d6 = (double) i18;
                                Double.isNaN(d6);
                                double d7 = d6 * 43.06640625d;
                                dArr4[i18] = (Math.atan(7.6E-4d * d7) * 13.0d) + (Math.atan(Math.pow(d7 / 7500.0d, 2.0d)) * 3.5d);
                                i18++;
                                bfhr = bfhr;
                            }
                            bfhr2 = bfhr;
                        }
                        double d8 = dArr4[i17];
                        if (d8 < 0.5d) {
                            bfhr = bfhr2;
                        } else {
                            while (d8 > d5) {
                                bfhr = bfhr2;
                                if (arrayList8.size() == 23) {
                                    break;
                                }
                                d5 += 1.0d;
                                arrayList8.add(new ArrayList());
                                bfhr2 = bfhr;
                            }
                            bfhr = bfhr2;
                            ((ArrayList) arrayList8.get(arrayList8.size() - 1)).add((Double) bfhr.f113967c.get(i17));
                        }
                    }
                    while (arrayList8.size() < 23) {
                        arrayList8.add(new ArrayList());
                    }
                    int size3 = arrayList8.size();
                    double[][] dArr5 = new double[size3][];
                    for (int i19 = 0; i19 < arrayList8.size(); i19++) {
                        dArr5[i19] = new double[((ArrayList) arrayList8.get(i19)).size()];
                        int i20 = 0;
                        while (true) {
                            double[] dArr6 = dArr5[i19];
                            if (i20 >= dArr6.length) {
                                break;
                            }
                            dArr6[i20] = ((Double) ((ArrayList) arrayList8.get(i19)).get(i20)).doubleValue();
                            i20++;
                        }
                    }
                    double[] dArr7 = new double[size3];
                    double[] dArr8 = new double[size3];
                    double[] dArr9 = new double[size3];
                    double a = bfhr.m96810a(19980.0d) / 41.0d;
                    ArrayList arrayList9 = new ArrayList();
                    int i21 = 0;
                    while (i21 <= 41) {
                        double a2 = bfhr.m96810a(20.0d);
                        double d9 = (double) i21;
                        Double.isNaN(d9);
                        arrayList9.add(Double.valueOf(a2 + (d9 * a)));
                        i21++;
                        size = size;
                        i10 = i10;
                    }
                    int i22 = size;
                    int i23 = i10;
                    double[] dArr10 = new double[40];
                    int i24 = 1;
                    for (int i25 = 40; i24 <= i25; i25 = 40) {
                        int i26 = i24 - 1;
                        int d10 = bfhr.m96816d(bfhr.m96813b(((Double) arrayList9.get(i26)).doubleValue()));
                        int d11 = bfhr.m96816d(bfhr.m96813b(((Double) arrayList9.get(i24)).doubleValue()));
                        int i27 = i24 + 1;
                        int d12 = bfhr.m96816d(bfhr.m96813b(((Double) arrayList9.get(i27)).doubleValue()));
                        ArrayList arrayList10 = arrayList9;
                        int i28 = d10;
                        double d13 = 0.0d;
                        while (true) {
                            i4 = i27;
                            if (i28 > d11 - 1) {
                                break;
                            }
                            double doubleValue = ((Double) bfhr.f113967c.get(i28)).doubleValue();
                            double d14 = (double) (i28 - d10);
                            Double.isNaN(d14);
                            double d15 = doubleValue * d14;
                            double d16 = (double) d11;
                            Double.isNaN(d16);
                            double d17 = (double) d10;
                            Double.isNaN(d17);
                            d13 += d15 / ((d16 + 0.0d) - d17);
                            i28++;
                            dArr7 = dArr7;
                            i27 = i4;
                            length = length;
                            dArr2 = dArr2;
                        }
                        double[] dArr11 = dArr7;
                        double[] dArr12 = dArr2;
                        int i29 = length;
                        double doubleValue2 = d13 + ((Double) bfhr.f113967c.get(d11)).doubleValue();
                        int i30 = d11 + 1;
                        while (i30 <= d12) {
                            double doubleValue3 = ((Double) bfhr.f113967c.get(i30)).doubleValue();
                            double d18 = (double) (d12 - i30);
                            Double.isNaN(d18);
                            double d19 = doubleValue3 * d18;
                            double d20 = (double) d12;
                            Double.isNaN(d20);
                            double d21 = (double) d11;
                            Double.isNaN(d21);
                            doubleValue2 += d19 / ((d20 + 0.0d) - d21);
                            i30++;
                            d12 = d12;
                            dArr9 = dArr9;
                            bfhr = bfhr;
                        }
                        dArr10[i26] = doubleValue2;
                        dArr7 = dArr11;
                        arrayList9 = arrayList10;
                        i24 = i4;
                        length = i29;
                        dArr2 = dArr12;
                    }
                    double[] dArr13 = dArr7;
                    bfhr bfhr4 = bfhr;
                    double[] dArr14 = dArr9;
                    double[] dArr15 = dArr2;
                    int i31 = length;
                    double[] dArr16 = new double[40];
                    int i32 = 0;
                    for (int i33 = 40; i32 < i33; i33 = 40) {
                        dArr16[i32] = Math.max(Math.log(dArr10[i32]), -100.0d);
                        i32++;
                    }
                    if (bfhr.f113964e == null || bfhr.f113964e.length != 40) {
                        bfhr.f113964e = (double[][]) Array.newInstance(double.class, 40, 40);
                        int i34 = 0;
                        while (true) {
                            if (i34 >= 40) {
                                break;
                            }
                            for (int i35 = 0; i35 < 40; i35++) {
                                double[] dArr17 = bfhr.f113964e[i34];
                                double d22 = (double) i34;
                                double d23 = (double) i35;
                                Double.isNaN(d23);
                                Double.isNaN(d22);
                                dArr17[i35] = Math.cos(((d22 * (d23 + 0.5d)) * 3.141592653589793d) / 40.0d) * Math.sqrt(0.05d);
                            }
                            i34++;
                        }
                        int i36 = 0;
                        for (i3 = 40; i36 < i3; i3 = 40) {
                            double[] dArr18 = bfhr.f113964e[0];
                            dArr18[i36] = dArr18[i36] * Math.sqrt(0.5d);
                            i36++;
                        }
                    }
                    double[] dArr19 = new double[40];
                    for (int i37 = 0; i37 < 40; i37++) {
                        double d24 = 0.0d;
                        for (int i38 = 0; i38 < 40; i38++) {
                            d24 += dArr16[i38] * bfhr.f113964e[i37][i38];
                        }
                        dArr19[i37] = d24;
                    }
                    for (int i39 = 0; i39 < size3; i39++) {
                        double a3 = bfhr.m96811a(dArr5[i39]);
                        dArr13[i39] = a3;
                        dArr8[i39] = bfhr.m96812a(dArr5[i39], a3);
                        dArr14[i39] = bfhr.m96814b(dArr5[i39]);
                    }
                    int i40 = i31;
                    double[] dArr20 = new double[i40];
                    for (int i41 = 0; i41 < i40; i41++) {
                        double d25 = dArr15[i41];
                        dArr20[i41] = d25 * d25;
                    }
                    double a4 = bfhr.m96811a(dArr20);
                    double a5 = bfhr.m96812a(dArr20, a4);
                    double b = bfhr.m96814b(dArr20);
                    int i42 = 1;
                    int i43 = 0;
                    while (i42 < 1024) {
                        ArrayList arrayList11 = arrayList;
                        bfhr bfhr5 = bfhr4;
                        if (dArr15[i42 - 1] <= 0.0d && dArr15[i42] > 0.0d) {
                            i43++;
                        }
                        i42++;
                        bfhr4 = bfhr5;
                        arrayList = arrayList11;
                    }
                    double d26 = (double) i43;
                    Double.isNaN(d26);
                    bfhr bfhr6 = bfhr4;
                    bfhq bfhq = new bfhq(a4, (d26 / 1024.0d) * 44100.0d, a5, b, dArr19, dArr13, dArr8, dArr14, bfhr6.f113971j);
                    bfhr6.f113971j += 23;
                    double[] dArr21 = bfhr6.f113969h;
                    int i44 = bfhr6.f113968g;
                    dArr21[i44] = a4;
                    int i45 = i44 + 1;
                    bfhr6.f113968g = i45;
                    if (i45 >= 199) {
                        double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - bfhr6.f113970i);
                        if (elapsedRealtime > 4920.770975056689d) {
                            String d27 = Double.toString(elapsedRealtime);
                            StringBuilder sb = new StringBuilder(String.valueOf(d27).length() + 65);
                            sb.append("Sound processing speed is too slow... ");
                            sb.append(d27);
                            sb.append(" > ");
                            sb.append(4620.770975056689d);
                            sb.toString();
                        }
                        double a6 = bfhr.m96811a(bfhr6.f113969h);
                        double a7 = bfhr.m96812a(bfhr6.f113969h, a6);
                        String d28 = Double.toString(bfhr.m96815c(a6));
                        double c = bfhr.m96815c(a7);
                        String str = Build.MODEL;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(d28).length() + 60 + String.valueOf(str).length());
                        sb2.append("calibration: volume level for 5 sec");
                        sb2.append(d28);
                        sb2.append(" ");
                        sb2.append(c);
                        sb2.append(str);
                        sb2.toString();
                        bfhr6.mo61708a();
                    }
                    arrayList.add(bfhq);
                    i10 = i23 + 1;
                    bfhr3 = bfhr6;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList6;
                    sArr = sArr4;
                    size = i22;
                }
                short[] sArr5 = sArr;
                bfhr bfhr7 = bfhr;
                ArrayList arrayList12 = arrayList3;
                int size4 = arrayList12.size();
                for (int i46 = 0; i46 < size4; i46++) {
                    ((bfhv) arrayList12.get(i46)).mo61707a(this.f113805h);
                }
                if (SystemClock.elapsedRealtime() - this.f113972d >= 7000) {
                    try {
                        bfhw.f113976b.stop();
                        try {
                            synchronized (bfhw.f113977c) {
                                if (bfhw.f113975a) {
                                    Locale.getDefault();
                                    new Object[1][0] = 53000;
                                    bfhw.f113977c.wait(53000);
                                }
                            }
                        } catch (InterruptedException e) {
                        }
                        this.f113972d = SystemClock.elapsedRealtime();
                        while (true) {
                            bfhw.f113976b.startRecording();
                            if (bfhw.f113976b.getRecordingState() == 3) {
                                break;
                            } else if (bfhw.f113975a) {
                                Locale.getDefault();
                                new Object[1][0] = Integer.valueOf((int) Felica.MAX_TIMEOUT);
                                try {
                                    synchronized (bfhw.f113977c) {
                                        if (bfhw.f113975a) {
                                            bfhw.f113977c.wait(60000);
                                        }
                                    }
                                } catch (InterruptedException e2) {
                                }
                            }
                        }
                        try {
                            bfim bfim3 = bfhr7.f113966b.f114023b;
                            bfim3.f114020d = 0;
                            bfim3.f114019c = 0;
                            bfhr7.f113971j = SystemClock.elapsedRealtime();
                            i5 = i;
                            bfhr3 = bfhr7;
                            bfhs = this;
                            sArr = sArr5;
                            break;
                        } catch (IllegalStateException e3) {
                            i5 = i;
                            bfhr3 = bfhr7;
                            bfhs = this;
                            sArr = sArr5;
                        }
                    } catch (IllegalStateException e4) {
                        i5 = i;
                        bfhr3 = bfhr7;
                        bfhs = this;
                        sArr = sArr5;
                    }
                } else {
                    i5 = i;
                    bfhr3 = bfhr7;
                    bfhs = this;
                    sArr = sArr5;
                }
            } else {
                Locale.getDefault();
                new Object[1][0] = Integer.valueOf(read);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final AudioFormat mo61645c() {
        return new AudioFormat.Builder().setEncoding(2).setSampleRate(44100).setChannelMask(16).build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo61646d() {
        return 44100;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo61647e() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo61648f() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo61649g() {
        return 1;
    }
}
