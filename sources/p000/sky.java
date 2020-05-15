package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.List;

/* renamed from: sky */
public final /* synthetic */ class sky implements Runnable {

    /* renamed from: a */
    private final Context f44654a;

    /* renamed from: b */
    private final long f44655b;

    /* renamed from: c */
    private final String f44656c;

    /* renamed from: d */
    private final int f44657d;

    /* renamed from: e */
    private final float f44658e;

    /* renamed from: f */
    private final int f44659f;

    /* renamed from: g */
    private final int f44660g;

    /* renamed from: h */
    private final long f44661h;

    /* renamed from: i */
    private final boolean f44662i;

    /* renamed from: j */
    private final boolean f44663j;

    /* renamed from: k */
    private final boolean f44664k;

    public sky(Context context, long j, String str, int i, float f, int i2, int i3, long j2, boolean z, boolean z2, boolean z3) {
        this.f44654a = context;
        this.f44655b = j;
        this.f44656c = str;
        this.f44657d = i;
        this.f44658e = f;
        this.f44659f = i2;
        this.f44660g = i3;
        this.f44661h = j2;
        this.f44662i = z;
        this.f44663j = z2;
        this.f44664k = z3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sfc.a(android.content.Context, boolean):sfb
     arg types: [rpr, int]
     candidates:
      sfc.a(android.content.Context, java.lang.String):java.util.List
      sfb.a(android.content.Context, java.lang.String):java.util.List
      sfc.a(android.content.Context, boolean):sfb */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0249, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x024a, code lost:
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0262, code lost:
        android.util.Log.e(r3, "unable to delete state file");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0267, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        if (r12 <= r3) goto L_0x00bf;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x022d A[SYNTHETIC, Splitter:B:103:0x022d] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0249 A[ExcHandler: SecurityException (e java.lang.SecurityException), Splitter:B:3:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0226 A[SYNTHETIC, Splitter:B:98:0x0226] */
    public final void run() {
        File file;
        String str;
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        skw skw;
        int i;
        int i2;
        Context context = this.f44654a;
        long j = this.f44655b;
        String str2 = this.f44656c;
        int i3 = this.f44657d;
        float f = this.f44658e;
        int i4 = this.f44659f;
        int i5 = this.f44660g;
        long j2 = this.f44661h;
        boolean z4 = this.f44662i;
        boolean z5 = this.f44663j;
        boolean z6 = this.f44664k;
        long f2 = cdpl.f181520a.mo6606a().mo78153f();
        String str3 = "SampledWakeLockSampler";
        if (f2 > 0) {
            File dir = aytw.m84817d(context).getDir("stats", 0);
            dir.mkdirs();
            File file2 = new File(dir, "SampledWakeLockSampler.state");
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    FileLock lock = randomAccessFile.getChannel().lock();
                    try {
                        if (randomAccessFile.length() < 16) {
                            file = file2;
                            z3 = z6;
                            try {
                                skw = new skw(1, 0, j);
                                z = z4;
                                z2 = z5;
                            } catch (IOException e) {
                                e = e;
                                str = str3;
                                try {
                                    Log.e(str, "unable update sample counter", e);
                                    if (!file.delete()) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } else {
                            file = file2;
                            z3 = z6;
                            int readInt = randomAccessFile.readInt();
                            if (readInt == 1) {
                                z2 = z5;
                                z = z4;
                                skw = new skw(1, randomAccessFile.readInt(), randomAccessFile.readLong());
                            } else {
                                z = z4;
                                z2 = z5;
                                skw = new skw(readInt, 0, 0);
                            }
                            int i6 = skw.f44649a;
                            if (i6 > 1) {
                                try {
                                    lock.release();
                                    randomAccessFile.close();
                                    return;
                                } catch (Throwable th3) {
                                    th = th3;
                                    str = str3;
                                    try {
                                        randomAccessFile.close();
                                    } catch (Throwable th4) {
                                        bqye.m113761a(th, th4);
                                    }
                                    throw th;
                                }
                            } else {
                                if (i6 == 1) {
                                    if (skw.f44650b >= 0) {
                                        long j3 = skw.f44651c;
                                        if (j3 >= 0) {
                                        }
                                    }
                                }
                                throw new IOException("state is invalid");
                            }
                        }
                        long j4 = j - skw.f44651c;
                        if (j4 >= skx.f44652a) {
                            skw.f44651c += (j4 / skx.f44652a) * skx.f44652a;
                            i = 0;
                        } else {
                            i = skw.f44650b;
                            if (((long) i) >= f2) {
                                lock.release();
                                randomAccessFile.close();
                                return;
                            }
                        }
                        skw.f44650b = i + 1;
                        randomAccessFile.seek(0);
                        int i7 = skw.f44649a;
                        if (i7 == 1) {
                            randomAccessFile.writeInt(1);
                            randomAccessFile.writeInt(skw.f44650b);
                            randomAccessFile.writeLong(skw.f44651c);
                            lock.release();
                            randomAccessFile.close();
                            if (i3 != 1) {
                                i2 = i3 != 2 ? 4 : 3;
                            } else {
                                i2 = 2;
                            }
                            sfb a = sfc.m35143a((Context) rpr.m34216b(), true);
                            if (a.mo25464b()) {
                                bxvd da = bpvm.f139376l.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bpvm bpvm = (bpvm) da.f164949b;
                                int i8 = bpvm.f139378a | 1;
                                bpvm.f139378a = i8;
                                bpvm.f139379b = j;
                                str2.getClass();
                                int i9 = 2 | i8;
                                bpvm.f139378a = i9;
                                bpvm.f139380c = str2;
                                bpvm.f139381d = i2 - 1;
                                int i10 = 4 | i9;
                                bpvm.f139378a = i10;
                                int i11 = i10 | 8;
                                bpvm.f139378a = i11;
                                bpvm.f139382e = f;
                                int i12 = i11 | 16;
                                bpvm.f139378a = i12;
                                bpvm.f139383f = i4;
                                int i13 = i12 | 32;
                                bpvm.f139378a = i13;
                                bpvm.f139384g = i5;
                                int i14 = i13 | 64;
                                bpvm.f139378a = i14;
                                bpvm.f139385h = j2;
                                int i15 = i14 | 128;
                                bpvm.f139378a = i15;
                                bpvm.f139386i = z;
                                int i16 = i15 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                bpvm.f139378a = i16;
                                bpvm.f139387j = z2;
                                bpvm.f139378a = i16 | 512;
                                bpvm.f139388k = z3;
                                bpvm bpvm2 = (bpvm) da.mo74062i();
                                bxvd da2 = bpvf.f139321t.mo74144da();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bpvf bpvf = (bpvf) da2.f164949b;
                                bpvm2.getClass();
                                if (!bpvf.f139338p.mo73666a()) {
                                    bpvf.f139338p = bxvk.m124021a(bpvf.f139338p);
                                }
                                bpvf.f139338p.add(bpvm2);
                                bpvf bpvf2 = (bpvf) da2.mo74062i();
                                cagz cagz = !cdpl.f181520a.mo6606a().mo78151d() ? cagz.UNMETERED_OR_DAILY : cagz.UNMETERED_ONLY;
                                List a2 = a.mo25461a(rpr.m34216b());
                                if (!a2.isEmpty()) {
                                    qwo a3 = ((qws) a2.get(0)).mo24333a(bpvf2);
                                    a3.mo24328b(21);
                                    a3.f42322f = cagz;
                                    a3.mo24327b();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("unexpected version: ");
                        sb.append(i7);
                        throw new IOException(sb.toString());
                    } catch (IOException e2) {
                        e = e2;
                        file = file2;
                        str = str3;
                        Log.e(str, "unable update sample counter", e);
                        if (!file.delete()) {
                            try {
                                lock.release();
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e3) {
                                    e = e3;
                                    Log.e(str, "unable check sample counter", e);
                                    if (!file.delete()) {
                                    }
                                } catch (SecurityException e4) {
                                    e = e4;
                                    Log.e(str, "unable to access state file", e);
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                th = th;
                                randomAccessFile.close();
                                throw th;
                            }
                        } else {
                            throw e;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        file = file2;
                        str = str3;
                        lock.release();
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    file = file2;
                    str = str3;
                    th = th;
                    randomAccessFile.close();
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                file = file2;
                str = str3;
                Log.e(str, "unable check sample counter", e);
                if (!file.delete()) {
                }
            } catch (SecurityException e6) {
            }
        }
    }
}
