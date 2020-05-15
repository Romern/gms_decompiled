package p000;

import android.content.Context;
import java.io.IOException;

/* renamed from: ugc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ugc extends ugb {

    /* renamed from: h */
    private static final sbw f47504h = new sbw("FileContentDownloadTask", "");

    /* renamed from: i */
    private final uff f47505i;

    /* renamed from: j */
    private final uhn f47506j;

    /* renamed from: k */
    private final ugf f47507k;

    /* renamed from: l */
    private final ukk f47508l;

    /* renamed from: m */
    private final String f47509m;

    /* renamed from: n */
    private final long f47510n;

    public ugc(ufv ufv, uey uey, String str, Context context, ufe ufe, uff uff, uhn uhn, ugf ugf, ujx ujx, vfb vfb) {
        super(ufv, uey, str, context, ufe, vfb);
        this.f47505i = uff;
        this.f47506j = uhn;
        this.f47507k = ugf;
        this.f47508l = ujx.mo27551a();
        this.f47509m = ujx.mo27624l();
        this.f47510n = ujx.mo27635s();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        p000.ugc.f47504h.mo25378c("FileContentDownloadTask", java.lang.String.format("Error downloading: %s", r14), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        r14.f47498d.mo27242a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        p000.ugc.f47504h.mo25378c("FileContentDownloadTask", java.lang.String.format("No longer authorized: %s", r14), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        r0 = r14.f47498d;
        r1 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00de, code lost:
        p000.ugc.f47504h.mo25378c("FileContentDownloadTask", java.lang.String.format("Download interrupted: %s", r14), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ed, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f0, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        p000.ugc.f47504h.mo25368a("FileContentDownloadTask", "File is no longer available or permission was denied: %s", r14.f47508l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0112, code lost:
        r14.f47498d.mo27242a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0117, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0118, code lost:
        r14.f47498d.mo27242a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011d, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0080 A[ExcHandler: IOException (r1v11 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be A[ExcHandler: gid (r1v7 'e' gid A[CUSTOM_DECLARE]), Splitter:B:1:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00de A[Catch:{ uaa -> 0x0104, vex -> 0x007b, gid -> 0x00be, ufw -> 0x0079, IOException -> 0x0080, all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0104 A[ExcHandler: uaa (e uaa), Splitter:B:1:0x000e] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:41:0x00d6=Splitter:B:41:0x00d6, B:27:0x009b=Splitter:B:27:0x009b} */
    /* renamed from: a */
    public final boolean mo27309a() {
        ufv ufv;
        ujx ujx;
        int i;
        this.f47498d.mo27242a(1);
        int i2 = 6;
        ufm ufm = null;
        try {
            ujx = this.f47506j.mo27402a(this.f47497c, this.f47508l);
            if (!this.f47505i.mo27283a(ujx)) {
                ugf ugf = this.f47507k;
                ukk ukk = this.f47508l;
                String str = this.f47509m;
                uge uge = (uge) ugf.f47514b.get(ukk);
                if (uge != null && sdg.m34949a(uge.f47512b, str)) {
                    ufm = uge.f47511a;
                }
                mo27308a(ufm).mo27295a(new ufi(this.f47506j, this.f47497c, this.f47508l, this.f47509m));
                ugf ugf2 = this.f47507k;
                ukk ukk2 = this.f47508l;
                if (sdg.m34949a(((uge) ugf2.f47514b.get(ukk2)).f47512b, this.f47509m)) {
                    ugf2.f47514b.remove(ukk2);
                }
                this.f47498d.mo27242a(2);
                return true;
            }
            this.f47498d.mo27242a(3);
            return true;
        } catch (uaa e) {
        } catch (vex e2) {
            ujx = null;
            vex e3 = e2;
            if (this.f47499e.mo28377e()) {
            }
            i2 = i;
            ufv = this.f47498d;
            ufv.mo27242a(i2);
            return false;
        } catch (gid e4) {
        } catch (ufw e5) {
            ujx = null;
            ufw e6 = e5;
            f47504h.mo25378c("FileContentDownloadTask", String.format("Error starting a download: %s", this), e6);
            int a = ugb.m38309a(e6);
            i2 = a;
            ufv = this.f47498d;
            ufv.mo27242a(i2);
            return false;
        } catch (IOException e7) {
        }
    }

    /* renamed from: c */
    public final ufm mo27311c() {
        ugf ugf = this.f47507k;
        ukk ukk = this.f47508l;
        uge uge = new uge(ugf.f47513a.mo27281a(), this.f47509m);
        ugf.f47514b.put(ukk, uge);
        return uge.f47511a;
    }

    /* renamed from: d */
    public final long mo27312d() {
        return this.f47510n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo27313e() {
        return vpc.m40995b(this.f47509m);
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f47508l.equals(((ugc) obj).f47508l);
    }

    public final int hashCode() {
        return this.f47508l.hashCode();
    }

    public final String toString() {
        return String.format("FileContentDownloadTask[%s]", this.f47508l);
    }
}
