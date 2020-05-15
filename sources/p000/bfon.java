package p000;

import android.util.Base64OutputStream;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.DeflaterOutputStream;

/* renamed from: bfon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfon implements bfog {

    /* renamed from: a */
    private static bfon f114560a;

    /* renamed from: b */
    private final File f114561b;

    /* renamed from: c */
    private final long f114562c;

    /* renamed from: d */
    private DataOutputStream f114563d;

    /* renamed from: e */
    private int f114564e = 0;

    /* renamed from: f */
    private final int[] f114565f = new int[bfos.values().length];

    /* renamed from: g */
    private long f114566g = -1;

    public bfon(File file, long j) {
        this.f114561b = file;
        this.f114562c = j;
        String valueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Log file directory is ");
        sb.append(valueOf);
        sb.toString();
        this.f114563d = m97412b(file, j);
        this.f114566g = -1;
    }

    /* renamed from: a */
    public static synchronized bfon m97409a(File file, long j) {
        bfon bfon;
        synchronized (bfon.class) {
            if (f114560a == null) {
                f114560a = new bfon(file, j);
            }
            bfon = f114560a;
        }
        return bfon;
    }

    /* renamed from: b */
    private static synchronized DataOutputStream m97412b(File file, long j) {
        DataOutputStream dataOutputStream;
        synchronized (bfon.class) {
            File file2 = new File(file, "0.clog");
            int i = 0;
            while (true) {
                if (i < 8) {
                    StringBuilder sb = new StringBuilder(16);
                    sb.append(i);
                    sb.append(".clog");
                    File file3 = new File(file, sb.toString());
                    if (file3.length() == 0) {
                        file2 = file3;
                        break;
                    }
                    if (file2.lastModified() > file3.lastModified()) {
                        file2 = file3;
                    }
                    i++;
                }
            }
            try {
                dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
                dataOutputStream.writeInt(-500881805);
                dataOutputStream.writeInt(4);
                dataOutputStream.writeLong(j);
                dataOutputStream.writeInt(bfos.values().length);
                for (bfos bfos : bfos.values()) {
                    dataOutputStream.writeShort(bfos.name().hashCode());
                }
            } catch (IOException e) {
                dataOutputStream = new DataOutputStream(boav.f132480a);
            }
            String valueOf = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb2.append("pickNextFile ");
            sb2.append(valueOf);
            sb2.toString();
        }
        return dataOutputStream;
    }

    /* renamed from: a */
    protected static final void m97410a(DataOutputStream dataOutputStream, int i) {
        dataOutputStream.writeInt(-500881805);
        dataOutputStream.writeInt(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0230 A[Catch:{ Exception -> 0x0319, all -> 0x0314 }, LOOP:10: B:99:0x022e->B:100:0x0230, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0255 A[Catch:{ Exception -> 0x0319, all -> 0x0314 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x028f A[Catch:{ Exception -> 0x0319, all -> 0x0314 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02a4 A[Catch:{ Exception -> 0x0319, all -> 0x0314 }, LOOP:8: B:94:0x0212->B:129:0x02a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096 A[Catch:{ Exception -> 0x03ad, all -> 0x0390 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097 A[Catch:{ Exception -> 0x03ad, all -> 0x0390 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0225 A[Catch:{ Exception -> 0x0319, all -> 0x0314 }, LOOP:9: B:96:0x0223->B:97:0x0225, LOOP_END] */
    /* renamed from: a */
    private final boolean m97411a(DataOutputStream dataOutputStream, long j, long j2, long j3, int i, bfoj bfoj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr;
        ArrayList arrayList5;
        long j4;
        int[] iArr2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        int i5;
        bfom bfom;
        bfon bfon = this;
        DataOutputStream dataOutputStream2 = dataOutputStream;
        bfoj bfoj2 = bfoj;
        long j7 = j + 2500;
        try {
            bfon.f114563d.flush();
            long j8 = j2 + j3;
            File[] listFiles = bfon.f114561b.listFiles(new bfoh());
            ArrayList arrayList6 = new ArrayList(8);
            int i6 = -500881805;
            if (listFiles != null) {
                int length = listFiles.length;
                int i7 = 0;
                while (i7 < length) {
                    File file = listFiles[i7];
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                        if (dataInputStream.readInt() == i6 && dataInputStream.readInt() == 4) {
                            long readLong = dataInputStream.readLong();
                            int readInt = dataInputStream.readInt();
                            short[] sArr = new short[readInt];
                            for (int i8 = 0; i8 < readInt; i8++) {
                                sArr[i8] = dataInputStream.readShort();
                            }
                            bfom = new bfom(file, dataInputStream, readLong, sArr, dataInputStream.readLong());
                            if (bfom == null) {
                            }
                            i7++;
                            i6 = -500881805;
                        } else {
                            bfom = null;
                            if (bfom == null) {
                                arrayList6.add(bfom);
                            }
                            i7++;
                            i6 = -500881805;
                        }
                    } catch (IOException e) {
                        String valueOf = String.valueOf(file);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                        sb.append("Failed to read file: ");
                        sb.append(valueOf);
                        sb.toString();
                        bfom = null;
                    }
                }
            }
            Collections.sort(arrayList6);
            int i9 = 1;
            while (i9 < arrayList6.size() && ((bfom) arrayList6.get(i9)).mo62042a() <= j8) {
                i9++;
            }
            Iterator it = arrayList6.iterator();
            int i10 = 0;
            while (i10 < i9 - 1) {
                bhcy.m100661a(((bfom) it.next()).f114556b);
                it.remove();
                i10++;
                it.hasNext();
            }
            try {
                int[] iArr3 = new int[8192];
                int[] iArr4 = new int[8192];
                int[] iArr5 = new int[2];
                iArr5[1] = 8192;
                iArr5[0] = 3;
                int[][] iArr6 = (int[][]) Array.newInstance(int.class, iArr5);
                String[] strArr = new String[8192];
                int[] iArr7 = new int[bfos.values().length];
                int[] iArr8 = new int[8192];
                dataOutputStream2.writeInt(-500881805);
                dataOutputStream2.writeInt(4);
                dataOutputStream2.writeInt(bfos.values().length);
                bfos[] values = bfos.values();
                int length2 = values.length;
                int i11 = 0;
                while (i11 < length2) {
                    bfoj bfoj3 = bfoj2;
                    long j9 = j7;
                    int[] iArr9 = iArr3;
                    int[] iArr10 = iArr8;
                    ArrayList arrayList7 = arrayList6;
                    dataOutputStream2.writeShort(values[i11].name().hashCode());
                    i11++;
                    arrayList6 = arrayList7;
                    bfoj2 = bfoj3;
                    iArr3 = iArr9;
                    j7 = j9;
                    iArr8 = iArr10;
                    bfon = this;
                }
                int[] iArr11 = bfon.f114565f;
                int length3 = iArr11.length;
                int i12 = 0;
                while (i12 < length3) {
                    bfoj bfoj4 = bfoj2;
                    long j10 = j7;
                    int[] iArr12 = iArr3;
                    int[] iArr13 = iArr8;
                    arrayList3 = arrayList6;
                    try {
                        dataOutputStream2.writeInt(iArr11[i12]);
                        i12++;
                        arrayList6 = arrayList3;
                        bfoj2 = bfoj4;
                        iArr3 = iArr12;
                        j7 = j10;
                        iArr8 = iArr13;
                    } catch (Exception e2) {
                        arrayList = arrayList3;
                        if (arrayList != null) {
                        }
                        bhcy.m100661a(dataOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        arrayList2 = arrayList3;
                        if (arrayList2 != null) {
                        }
                        bhcy.m100661a(dataOutputStream);
                        throw th;
                    }
                }
                dataOutputStream2.writeInt(arrayList6.size());
                long j11 = 0;
                long j12 = -1;
                long j13 = -1;
                int i13 = 0;
                while (i13 < arrayList6.size()) {
                    bfom bfom2 = (bfom) arrayList6.get(i13);
                    if (j <= j7) {
                        iArr2 = iArr3;
                        long j14 = (long) i;
                        if (j11 < j14) {
                            String valueOf2 = String.valueOf(bfom2.f114555a);
                            j4 = j7;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 13);
                            sb2.append("Dump file ");
                            sb2.append(valueOf2);
                            sb2.append("...");
                            sb2.toString();
                            DataInputStream dataInputStream2 = bfom2.f114556b;
                            long j15 = bfom2.f114557c;
                            arrayList5 = arrayList6;
                            short[] sArr2 = bfom2.f114558d;
                            try {
                                long j16 = bfom2.f114559e;
                                long j17 = j12;
                                int i14 = 0;
                                long j18 = j11;
                                int i15 = 0;
                                boolean z = false;
                                long j19 = j16;
                                while (true) {
                                    iArr = iArr8;
                                    if (i15 < 8192) {
                                        if (j18 >= j14) {
                                            j5 = j15;
                                            break;
                                        }
                                        try {
                                            int readByte = dataInputStream2.readByte();
                                            if (readByte < 0) {
                                                readByte += PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                            }
                                            long j20 = j14;
                                            int readInt2 = dataInputStream2.readInt();
                                            int readInt3 = dataInputStream2.readInt();
                                            int readInt4 = dataInputStream2.readInt();
                                            int readInt5 = dataInputStream2.readInt();
                                            String readUTF = dataInputStream2.readUTF();
                                            j5 = j15;
                                            j19 += (long) readInt2;
                                            if (i13 == 0) {
                                                try {
                                                    if (bfom2.f114557c == j2) {
                                                        if (j19 < j3) {
                                                            i15++;
                                                            iArr8 = iArr;
                                                            j14 = j20;
                                                            j15 = j5;
                                                        } else if (!z) {
                                                            j16 = j19;
                                                            readInt2 = 0;
                                                            z = true;
                                                        }
                                                    }
                                                } catch (EOFException e3) {
                                                    j6 = j16;
                                                    j19 = j17;
                                                    bhcy.m100661a(dataInputStream2);
                                                    Arrays.fill(iArr7, -1);
                                                    i2 = i14 - 1;
                                                    while (i2 >= 0) {
                                                    }
                                                    m97410a(dataOutputStream2, i14);
                                                    long j21 = j5;
                                                    dataOutputStream2.writeLong(j21);
                                                    short[] sArr3 = sArr2;
                                                    int length4 = sArr3.length;
                                                    dataOutputStream2.writeInt(length4);
                                                    while (r5 < length4) {
                                                    }
                                                    while (i3 < i14) {
                                                    }
                                                    dataOutputStream2.writeLong(j6);
                                                    while (i4 < 4) {
                                                    }
                                                    while (i5 < bfos.values().length) {
                                                    }
                                                    j13 = j21;
                                                    j11 = j18;
                                                    j12 = j19;
                                                    i13++;
                                                    iArr3 = iArr2;
                                                    j7 = j4;
                                                    arrayList6 = arrayList5;
                                                    iArr8 = iArr;
                                                }
                                            }
                                            try {
                                                iArr2[i14] = readByte;
                                                iArr4[i14] = readInt2;
                                                iArr6[0][i14] = readInt3;
                                                iArr6[1][i14] = readInt4;
                                            } catch (EOFException e4) {
                                                j6 = j16;
                                                bhcy.m100661a(dataInputStream2);
                                                Arrays.fill(iArr7, -1);
                                                i2 = i14 - 1;
                                                while (i2 >= 0) {
                                                }
                                                m97410a(dataOutputStream2, i14);
                                                long j212 = j5;
                                                dataOutputStream2.writeLong(j212);
                                                short[] sArr32 = sArr2;
                                                int length42 = sArr32.length;
                                                dataOutputStream2.writeInt(length42);
                                                while (r5 < length42) {
                                                }
                                                while (i3 < i14) {
                                                }
                                                dataOutputStream2.writeLong(j6);
                                                while (i4 < 4) {
                                                }
                                                while (i5 < bfos.values().length) {
                                                }
                                                j13 = j212;
                                                j11 = j18;
                                                j12 = j19;
                                                i13++;
                                                iArr3 = iArr2;
                                                j7 = j4;
                                                arrayList6 = arrayList5;
                                                iArr8 = iArr;
                                            }
                                            try {
                                                iArr6[2][i14] = readInt5;
                                                strArr[i14] = readUTF;
                                                i14++;
                                                j18++;
                                                j17 = j19;
                                                i15++;
                                                iArr8 = iArr;
                                                j14 = j20;
                                                j15 = j5;
                                            } catch (EOFException e5) {
                                                j6 = j16;
                                                bhcy.m100661a(dataInputStream2);
                                                Arrays.fill(iArr7, -1);
                                                i2 = i14 - 1;
                                                while (i2 >= 0) {
                                                }
                                                m97410a(dataOutputStream2, i14);
                                                long j2122 = j5;
                                                dataOutputStream2.writeLong(j2122);
                                                short[] sArr322 = sArr2;
                                                int length422 = sArr322.length;
                                                dataOutputStream2.writeInt(length422);
                                                while (r5 < length422) {
                                                }
                                                while (i3 < i14) {
                                                }
                                                dataOutputStream2.writeLong(j6);
                                                while (i4 < 4) {
                                                }
                                                while (i5 < bfos.values().length) {
                                                }
                                                j13 = j2122;
                                                j11 = j18;
                                                j12 = j19;
                                                i13++;
                                                iArr3 = iArr2;
                                                j7 = j4;
                                                arrayList6 = arrayList5;
                                                iArr8 = iArr;
                                            }
                                        } catch (EOFException e6) {
                                            j5 = j15;
                                            j6 = j16;
                                            j19 = j17;
                                            bhcy.m100661a(dataInputStream2);
                                            Arrays.fill(iArr7, -1);
                                            i2 = i14 - 1;
                                            while (i2 >= 0) {
                                            }
                                            m97410a(dataOutputStream2, i14);
                                            long j21222 = j5;
                                            dataOutputStream2.writeLong(j21222);
                                            short[] sArr3222 = sArr2;
                                            int length4222 = sArr3222.length;
                                            dataOutputStream2.writeInt(length4222);
                                            while (r5 < length4222) {
                                            }
                                            while (i3 < i14) {
                                            }
                                            dataOutputStream2.writeLong(j6);
                                            while (i4 < 4) {
                                            }
                                            while (i5 < bfos.values().length) {
                                            }
                                            j13 = j21222;
                                            j11 = j18;
                                            j12 = j19;
                                            i13++;
                                            iArr3 = iArr2;
                                            j7 = j4;
                                            arrayList6 = arrayList5;
                                            iArr8 = iArr;
                                        }
                                    } else {
                                        j5 = j15;
                                        break;
                                    }
                                }
                                j6 = j16;
                                j19 = j17;
                                bhcy.m100661a(dataInputStream2);
                                Arrays.fill(iArr7, -1);
                                i2 = i14 - 1;
                                while (i2 >= 0) {
                                    int i16 = iArr2[i2];
                                    iArr[i2] = iArr7[i16];
                                    iArr7[i16] = i2;
                                    i2--;
                                    sArr2 = sArr2;
                                    j5 = j5;
                                }
                                m97410a(dataOutputStream2, i14);
                                long j212222 = j5;
                                dataOutputStream2.writeLong(j212222);
                                short[] sArr32222 = sArr2;
                                int length42222 = sArr32222.length;
                                dataOutputStream2.writeInt(length42222);
                                for (short s : sArr32222) {
                                    dataOutputStream2.writeShort(s);
                                }
                                for (i3 = 0; i3 < i14; i3++) {
                                    dataOutputStream2.writeByte((byte) iArr2[i3]);
                                }
                                dataOutputStream2.writeLong(j6);
                                for (i4 = 0; i4 < 4; i4++) {
                                    for (int i17 = 0; i17 < i14; i17++) {
                                        dataOutputStream2.writeByte(iArr4[i17] >>> (i4 * 8));
                                    }
                                }
                                for (i5 = 0; i5 < bfos.values().length; i5++) {
                                    for (int i18 = 0; i18 < 3; i18++) {
                                        for (int i19 = 0; i19 < 4; i19++) {
                                            int i20 = 0;
                                            for (int i21 = iArr7[i5]; i21 != -1; i21 = iArr[i21]) {
                                                dataOutputStream2.writeByte((iArr6[i18][i21] - i20) >>> (i19 * 8));
                                                i20 = iArr6[i18][i21];
                                            }
                                        }
                                    }
                                    for (int i22 = iArr7[i5]; i22 != -1; i22 = iArr[i22]) {
                                        dataOutputStream2.writeUTF(strArr[i22]);
                                    }
                                }
                                j13 = j212222;
                                j11 = j18;
                                j12 = j19;
                                i13++;
                                iArr3 = iArr2;
                                j7 = j4;
                                arrayList6 = arrayList5;
                                iArr8 = iArr;
                            } catch (Exception e7) {
                                arrayList3 = arrayList5;
                                arrayList = arrayList3;
                                if (arrayList != null) {
                                    int size = arrayList.size();
                                    for (int i23 = 0; i23 < size; i23++) {
                                        bhcy.m100661a(((bfom) arrayList.get(i23)).f114556b);
                                    }
                                }
                                bhcy.m100661a(dataOutputStream);
                                return false;
                            } catch (Throwable th2) {
                                th = th2;
                                arrayList3 = arrayList5;
                                arrayList2 = arrayList3;
                                if (arrayList2 != null) {
                                    int size2 = arrayList2.size();
                                    for (int i24 = 0; i24 < size2; i24++) {
                                        bhcy.m100661a(((bfom) arrayList2.get(i24)).f114556b);
                                    }
                                }
                                bhcy.m100661a(dataOutputStream);
                                throw th;
                            }
                        } else {
                            j4 = j7;
                        }
                    } else {
                        j4 = j7;
                        iArr2 = iArr3;
                    }
                    iArr = iArr8;
                    arrayList5 = arrayList6;
                    m97410a(dataOutputStream2, 0);
                    i13++;
                    iArr3 = iArr2;
                    j7 = j4;
                    arrayList6 = arrayList5;
                    iArr8 = iArr;
                }
                ArrayList arrayList8 = arrayList6;
                long j22 = j12;
                if (j22 == -1) {
                    arrayList4 = arrayList8;
                } else {
                    long j23 = j13;
                    if (j23 != -1) {
                        bfoj.f114549a = j23;
                        bfoj.f114550b = j22;
                        int size3 = arrayList8.size();
                        for (int i25 = 0; i25 < size3; i25++) {
                            bhcy.m100661a(((bfom) arrayList8.get(i25)).f114556b);
                        }
                        bhcy.m100661a(dataOutputStream);
                        return true;
                    }
                    arrayList4 = arrayList8;
                }
                int size4 = arrayList4.size();
                for (int i26 = 0; i26 < size4; i26++) {
                    bhcy.m100661a(((bfom) arrayList4.get(i26)).f114556b);
                }
            } catch (Exception e8) {
                arrayList3 = arrayList6;
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                bhcy.m100661a(dataOutputStream);
                return false;
            } catch (Throwable th3) {
                th = th3;
                arrayList3 = arrayList6;
                arrayList2 = arrayList3;
                if (arrayList2 != null) {
                }
                bhcy.m100661a(dataOutputStream);
                throw th;
            }
        } catch (Exception e9) {
            arrayList = null;
            if (arrayList != null) {
            }
            bhcy.m100661a(dataOutputStream);
            return false;
        } catch (Throwable th4) {
            th = th4;
            arrayList2 = null;
            if (arrayList2 != null) {
            }
            bhcy.m100661a(dataOutputStream);
            throw th;
        }
        bhcy.m100661a(dataOutputStream);
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[ExcHandler: IOException (e java.io.IOException), Splitter:B:7:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b A[SYNTHETIC, Splitter:B:28:0x004b] */
    /* renamed from: a */
    public final synchronized bfok mo62044a(File file, long j, long j2, int i, long j3) {
        FileOutputStream fileOutputStream;
        bfoj bfoj = new bfoj();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                DataOutputStream dataOutputStream = new DataOutputStream(new DeflaterOutputStream(fileOutputStream));
                boolean a = m97411a(dataOutputStream, j3, j, j2, i, bfoj);
                dataOutputStream.flush();
                bhcy.m100661a(fileOutputStream);
                if (a) {
                    return new bfok(bfoj.f114549a, bfoj.f114550b);
                }
            } catch (IOException e) {
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                }
                throw th;
            }
        } catch (IOException e2) {
            try {
                file.delete();
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream2 != null) {
                    bhcy.m100661a(fileOutputStream2);
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    public final synchronized void mo62033a(bfos bfos, long j, int i, int i2, int i3, Object obj) {
        int[] iArr = this.f114565f;
        int ordinal = bfos.ordinal();
        iArr[ordinal] = iArr[ordinal] + 1;
        if (this.f114566g == -1) {
            this.f114563d.writeLong(j);
            this.f114566g = j;
        }
        this.f114563d.writeByte(bfos.ordinal());
        this.f114563d.writeInt((int) (j - this.f114566g));
        this.f114566g = j;
        this.f114563d.writeInt(i);
        this.f114563d.writeInt(i2);
        this.f114563d.writeInt(i3);
        String obj2 = obj != null ? obj.toString() : "";
        if (obj2.length() > 64) {
            obj2 = obj2.substring(0, 64);
        }
        this.f114563d.writeUTF(obj2);
        int i4 = this.f114564e + 1;
        this.f114564e = i4;
        if (i4 == 8192) {
            this.f114563d.close();
            this.f114563d = m97412b(this.f114561b, this.f114562c);
            this.f114566g = -1;
            this.f114564e = 0;
        }
    }

    /* renamed from: a */
    public final synchronized void mo62034a(PrintWriter printWriter, long j) {
        printWriter.println("#### com.google.android.location.utils.logging.CompactLogger Start ####");
        m97411a(new DataOutputStream(new BufferedOutputStream(new DeflaterOutputStream(new BufferedOutputStream(new Base64OutputStream(new bfoi(new BufferedWriter(new bfol(new BufferedWriter(printWriter)))), 18))))), j, 0, 0, Integer.MAX_VALUE, new bfoj());
        printWriter.println();
        printWriter.println("#### com.google.android.location.utils.logging.CompactLogger End ####");
    }
}
