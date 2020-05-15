package p000;

import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.WriteBatch;

/* renamed from: aqbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqbf extends aqas {

    /* renamed from: c */
    private static aqbf f85546c = null;

    /* renamed from: d */
    private LevelDb f85547d;

    static {
        aqbf.class.getSimpleName();
    }

    private aqbf(Context context) {
        super(context);
        this.f85547d = null;
        this.f85547d = mo47720a(false, null, "snet_pha");
    }

    /* renamed from: a */
    static synchronized aqbf m71285a(Context context) {
        aqbf aqbf;
        synchronized (aqbf.class) {
            if (f85546c == null) {
                f85546c = new aqbf(context);
            }
            aqbf = f85546c;
        }
        return aqbf;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    public final synchronized aqbe mo47726a(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = this.f85547d.get(bArr);
            if (bArr2 != null) {
                aqbd aqbd = (aqbd) GeneratedMessageLite.m124014a(aqbd.f85537e, bArr2);
                aqbe aqbe = new aqbe();
                aqbe.f85543a = aqbd.f85540b;
                aqbe.f85544b = aqbd.f85541c;
                aqbe.f85545c = aqbd.f85542d;
                return aqbe;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[SYNTHETIC, Splitter:B:21:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c A[SYNTHETIC, Splitter:B:28:0x006c] */
    /* renamed from: a */
    public final synchronized void mo47727a(byte[] bArr, aqbe aqbe) {
        WriteBatch writeBatch = null;
        try {
            bxvd da = aqbd.f85537e.mo74144da();
            String str = aqbe.f85543a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aqbd aqbd = (aqbd) da.f164949b;
            str.getClass();
            int i = aqbd.f85539a | 1;
            aqbd.f85539a = i;
            aqbd.f85540b = str;
            String str2 = aqbe.f85544b;
            str2.getClass();
            int i2 = i | 2;
            aqbd.f85539a = i2;
            aqbd.f85541c = str2;
            String str3 = aqbe.f85545c;
            str3.getClass();
            aqbd.f85539a = i2 | 4;
            aqbd.f85542d = str3;
            byte[] k = ((aqbd) da.mo74062i()).serializeToBytes();
            writeBatch = WriteBatch.create();
            try {
                writeBatch.put(bArr, k);
                this.f85547d.write(writeBatch);
                try {
                    writeBatch.close();
                } catch (Exception e) {
                }
            } catch (Exception | OutOfMemoryError e2) {
                if (writeBatch != null) {
                    writeBatch.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                th = th;
                if (writeBatch != null) {
                    try {
                        writeBatch.close();
                    } catch (Exception e3) {
                    }
                }
                throw th;
            }
        } catch (Exception | OutOfMemoryError e4) {
            if (writeBatch != null) {
            }
            return;
        } catch (Throwable th2) {
            th = th2;
            if (writeBatch != null) {
            }
            throw th;
        }
    }
}
