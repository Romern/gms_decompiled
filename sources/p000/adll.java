package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: adll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adll extends sji {

    /* renamed from: a */
    private final adli f62117a;

    /* renamed from: d */
    private final rnt f62118d;

    /* renamed from: e */
    private final PackageInfo f62119e;

    /* renamed from: f */
    private final ParcelFileDescriptor f62120f;

    public adll(adli adli, rnt rnt, PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor) {
        super(121, "SetAppStorageDataOperation");
        this.f62117a = adli;
        this.f62118d = rnt;
        this.f62119e = packageInfo;
        this.f62120f = parcelFileDescriptor;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ca, code lost:
        p000.adlm.f62121a.mo33425a(r0, "Failed to persist instant app data.", new java.lang.Object[0]);
        r1.f62118d.mo11797a(com.google.android.gms.common.api.Status.f30109c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00da, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9 A[ExcHandler: adlh (r0v2 'e' adlh A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        adli adli;
        String str;
        try {
            adli = this.f62117a;
            str = this.f62119e.packageName;
            Signature[] signatureArr = this.f62119e.signatures;
            ParcelFileDescriptor parcelFileDescriptor = this.f62120f;
            sdo.m34977c(str);
            sdo.m34959a(signatureArr);
            adli.mo33632a();
            if (parcelFileDescriptor.getStatSize() <= 104857600) {
                File b = adli.mo33634b(str);
                if (b.exists()) {
                    b.delete();
                }
                adli.f62108d.mo33516b(str.getBytes(adli.f62106b));
                File[] listFiles = new File(adli.f62109e).listFiles();
                long j = 0;
                for (File file : listFiles) {
                    if (file.length() + j > 104857600 - parcelFileDescriptor.getStatSize()) {
                        String name = file.getName();
                        adli.mo33633a(name.substring(0, name.length() - 5));
                    } else {
                        j += file.length();
                    }
                }
                bxvd da = adii.f61801b.mo74144da();
                for (Signature signature : signatureArr) {
                    da.mo74041d(bxtx.m123261a(signature.toByteArray()));
                }
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                adli.f62108d.mo33512a(str.getBytes(adli.f62106b), ((adii) da.mo74062i()).mo73642k());
                srz.m36168a(autoCloseInputStream, new FileOutputStream(b), true);
                this.f62118d.mo11797a(Status.f30107a);
                return;
            }
            throw new adlh("Data size too big.");
        } catch (IOException e) {
            adli.mo33633a(str);
            throw e;
        } catch (adlh e2) {
        } catch (IOException e3) {
            adlm.f62121a.mo33425a(e3, "Unexpected failure to persist instant app data", new Object[0]);
            this.f62118d.mo11797a(Status.f30109c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f62118d.mo11797a(status);
    }
}
