package p000;

import android.content.Context;
import android.os.Debug;
import android.os.DropBoxManager;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: asen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class asen extends asem {

    /* renamed from: g */
    protected static final String[] f88783g = new String[0];

    /* renamed from: f */
    public final String f88784f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final calx mo49099a(Context context, InputStream inputStream, long j, long j2, qxq qxq) {
        return mo49100a(context, inputStream, j, j2, qxq, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String[] mo49101a(long j, long j2);

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.File], assign insn: PHI: (r3v0 ?) = (r3v1 ?), (r3v4 ?), (r3v9 ?) binds: [B:40:0x005c, B:32:0x004a, B:27:0x0043] */
    /* JADX WARN: Type inference failed for: r3v1, assign insn: 0x005c: MOVE  (r3v1 ? I:?[OBJECT, ARRAY]) = (r1v2 java.io.FileInputStream) */
    /* JADX WARN: Type inference failed for: r3v4, assign insn: 0x004b: MOVE  (r3v4 ? I:?[OBJECT, ARRAY]) = (0 ?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File], assign insn: 0x0001: INVOKE  (r2v2 ? I:java.io.File) = (r12v0 'this' asen A[THIS]), (r13v0 android.content.Context), (r14v0 long), (r16v0 long), (r18v0 qxq) type: VIRTUAL call: asen.c(android.content.Context, long, long, qxq):java.io.File */
    /* JADX WARN: Type inference failed for: r3v9, assign insn: ?: MOVE  (r3v9 ?) = (r3v5 java.lang.Object) */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0063  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    public final calx mo49092b(Context context, long j, long j2, qxq qxq) {
        ? r3;
        FileInputStream fileInputStream;
        Object obj;
        FileInputStream fileInputStream2 = null;
        r1 = null;
        FileInputStream fileInputStream3 = null;
        try {
            ? c = mo49103c(context, j, j2, qxq);
            try {
                if (cgue.f187767a.mo6606a().mo84504c()) {
                    if (!c.exists()) {
                        srz.m36171a((Closeable) null);
                        if (c != 0) {
                            c.delete();
                        }
                        return null;
                    }
                }
                fileInputStream = new FileInputStream((File) c);
                try {
                    calx b = mo49102b(context, fileInputStream, j, j2, qxq);
                    srz.m36171a((Closeable) fileInputStream);
                    if (c != 0) {
                        c.delete();
                    }
                    return b;
                } catch (IOException e) {
                    e = e;
                    fileInputStream2 = c;
                    try {
                        Log.w(this.f88779a, e);
                        throw new asel(e);
                    } catch (Throwable th) {
                        th = th;
                        r3 = fileInputStream2;
                        fileInputStream3 = fileInputStream;
                        srz.m36171a((Closeable) fileInputStream3);
                        if (r3 != 0) {
                            r3.delete();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = c;
                    fileInputStream3 = fileInputStream;
                    r3 = obj;
                    srz.m36171a((Closeable) fileInputStream3);
                    if (r3 != 0) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                fileInputStream = null;
                fileInputStream2 = c;
                Log.w(this.f88779a, e);
                throw new asel(e);
            } catch (Throwable th3) {
                th = th3;
                obj = c;
                r3 = obj;
                srz.m36171a((Closeable) fileInputStream3);
                if (r3 != 0) {
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            fileInputStream = null;
            Log.w(this.f88779a, e);
            throw new asel(e);
        } catch (Throwable th4) {
            th = th4;
            r3 = 0;
            srz.m36171a((Closeable) fileInputStream3);
            if (r3 != 0) {
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract calx mo49102b(Context context, InputStream inputStream, long j, long j2, qxq qxq);

    /* renamed from: c */
    public File mo49103c(Context context, long j, long j2, qxq qxq) {
        File fileStreamPath = context.getFileStreamPath(String.valueOf(this.f88779a).concat(".tmp"));
        if (fileStreamPath.exists()) {
            fileStreamPath.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileStreamPath);
            try {
                if (Debug.dumpService(this.f88784f, fileOutputStream2.getFD(), mo49101a(j, j2))) {
                    srz.m36171a(fileOutputStream2);
                    return fileStreamPath;
                }
                Log.w(this.f88779a, "Dumpsys failed.");
                throw new asel(String.valueOf(this.f88779a).concat(" dumpsys failed."));
            } catch (IOException | NullPointerException | SecurityException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    throw new asel(e);
                } catch (Throwable th) {
                    th = th;
                    srz.m36171a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                srz.m36171a(fileOutputStream);
                throw th;
            }
        } catch (IOException | NullPointerException | SecurityException e2) {
            e = e2;
            throw new asel(e);
        } catch (Throwable th3) {
            th = th3;
            srz.m36171a(fileOutputStream);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo49104h() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asen(String str, String str2, String str3, boolean z) {
        super(str, str3, z, false);
        cagz cagz = cagz.DEFAULT;
        this.f88784f = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final calx mo49100a(Context context, InputStream inputStream, long j, long j2, qxq qxq, boolean z) {
        calx calx;
        calu calu = (calu) calx.f175201v.mo74144da();
        if (calu.f164950c) {
            calu.mo74035c();
            calu.f164950c = false;
        }
        calx calx2 = (calx) calu.f164949b;
        int i = calx2.f175203a | 1;
        calx2.f175203a = i;
        calx2.f175206d = j;
        calx2.f175203a = i | 2;
        calx2.f175207e = j2;
        try {
            byte[] b = srz.m36178b(inputStream);
            if (!z) {
                try {
                    String str = new String(b, asem.f88778e);
                    if (calu.f164950c) {
                        calu.mo74035c();
                        calu.f164950c = false;
                    }
                    calx calx3 = (calx) calu.f164949b;
                    str.getClass();
                    calx3.f175203a |= 8;
                    calx3.f175209g = str;
                } catch (OutOfMemoryError e) {
                    String valueOf = String.valueOf(this.f88784f);
                    qxq.mo24383c(valueOf.length() == 0 ? new String("DumpsysOutOfMemory") : "DumpsysOutOfMemory".concat(valueOf)).mo24359a();
                    qxq.mo24388e();
                    calx = (calx) calu.mo74062i();
                }
            } else {
                bxtx a = bxtx.m123261a(b);
                if (calu.f164950c) {
                    calu.mo74035c();
                    calu.f164950c = false;
                }
                calx calx4 = (calx) calu.f164949b;
                a.getClass();
                calx4.f175203a |= 16777216;
                calx4.f175222t = a;
            }
            if (mo49104h()) {
                calu.mo74661a(Arrays.asList(asgz.m74111a(context, context.getSharedPreferences("com.google.android.metrics", 0), (DropBoxManager) context.getSystemService("dropbox"), this.f88779a, j, j2, false, qxq)));
            }
            calx = (calx) calu.mo74062i();
        } catch (IOException e2) {
            Log.w(this.f88779a, "Failed to read dumpsys output file.");
            calx = (calx) calu.mo74062i();
        } catch (Throwable th) {
            srz.m36171a((Closeable) inputStream);
            throw th;
        }
        srz.m36171a((Closeable) inputStream);
        return calx;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asen(String str, String str2, String str3, boolean z, byte[] bArr) {
        super(str, str3, z, true);
        cagz cagz = cagz.DEFAULT;
        this.f88784f = str2;
    }
}
