package p000;

import android.content.Context;
import java.io.IOException;

/* renamed from: ugh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ugh extends ugb {

    /* renamed from: h */
    private static final sbw f47522h = new sbw("ThumbnailDownloadTask", "");

    /* renamed from: i */
    private final uff f47523i;

    /* renamed from: j */
    private final uhn f47524j;

    /* renamed from: k */
    private final ukk f47525k;

    public ugh(ufv ufv, uey uey, String str, Context context, ufe ufe, uff uff, uhn uhn, ujx ujx, vfb vfb) {
        super(ufv, uey, str, context, ufe, vfb);
        this.f47523i = uff;
        this.f47524j = uhn;
        this.f47525k = ujx.mo27551a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uhn.a(ujx, boolean):java.lang.String
     arg types: [ujx, int]
     candidates:
      uhn.a(uih, com.google.android.gms.drive.DriveId):java.lang.String
      uhn.a(uih, uzz):java.util.List
      uhn.a(long, java.lang.String):uey
      uhn.a(uih, long):uig
      uhn.a(uey, com.google.android.gms.drive.DriveId):ujx
      uhn.a(uey, java.lang.String):ujx
      uhn.a(uey, ukk):ujx
      uhn.a(ujx, java.lang.String):ukc
      uhl.a(uey, ujx):java.util.Set
      uhl.a(uih, java.lang.String):ujp
      uhl.a(ujx, long):void
      uhl.a(ujx, java.util.Set):void
      uhl.a(ukg, boolean):void
      uhl.a(ukk, long):void
      uhl.a(uey, uif):boolean
      uhn.a(ujx, boolean):java.lang.String */
    /* renamed from: a */
    public final boolean mo27309a() {
        ufv ufv;
        ufv ufv2;
        int i;
        ufv ufv3;
        this.f47498d.mo27242a(1);
        int i2 = 5;
        try {
            ujx a = this.f47524j.mo27402a(this.f47497c, this.f47525k);
            if (this.f47524j.mo27390a(a, false) == null) {
                mo27308a((ufm) null).mo27295a(new ufn(this.f47524j, a));
                ufv = this.f47498d;
                i2 = 2;
            } else {
                ufv = this.f47498d;
                i2 = 3;
            }
        } catch (uaa e) {
            f47522h.mo25368a("ThumbnailDownloadTask", "File is no longer available or permission was denied: %s", this);
            ufv = this.f47498d;
        } catch (vex e2) {
            if (!this.f47499e.mo28377e()) {
                i = 8;
            } else {
                i = 4;
            }
            ufv2 = this.f47498d;
        } catch (gid e3) {
            f47522h.mo25378c("ThumbnailDownloadTask", String.format("Authentication error: %s", this), e3);
            ufv3 = this.f47498d;
            i2 = 7;
        } catch (ufw e4) {
            f47522h.mo25378c("ThumbnailDownloadTask", String.format("Error starting a download: %s", this), e4);
            i = ugb.m38309a(e4);
            ufv2 = this.f47498d;
        } catch (IOException e5) {
            f47522h.mo25378c("ThumbnailDownloadTask", String.format("Error downloading: %s", this), e5);
            ufv3 = this.f47498d;
        } catch (Throwable th) {
            this.f47498d.mo27242a(5);
            throw th;
        }
        ufv.mo27242a(i2);
        return true;
        ufv3.mo27242a(i2);
        return false;
        ufv2.mo27242a(i);
        return false;
    }

    /* renamed from: c */
    public final ufm mo27311c() {
        return this.f47523i.mo27281a();
    }

    /* renamed from: d */
    public final long mo27312d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f47525k.equals(((ugh) obj).f47525k);
    }

    public final int hashCode() {
        return this.f47525k.hashCode();
    }

    public final String toString() {
        return String.format("ThumbnailDownloadTask[%s]", this.f47525k);
    }
}
