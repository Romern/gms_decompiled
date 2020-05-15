package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: adlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adlk extends sji {

    /* renamed from: a */
    private final adli f62114a;

    /* renamed from: d */
    private final adgc f62115d;

    /* renamed from: e */
    private final String f62116e;

    public adlk(adli adli, adgc adgc, String str) {
        super(121, "FetchStorageOperation");
        this.f62114a = adli;
        this.f62115d = adgc;
        this.f62116e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        try {
            adgc adgc = this.f62115d;
            Status status = Status.f30107a;
            adli adli = this.f62114a;
            String str = this.f62116e;
            sdo.m34977c(str);
            adli.mo33632a();
            byte[] a = adli.f62108d.mo33514a(str.getBytes(adli.f62106b));
            if (a != null) {
                adii adii = (adii) GeneratedMessageLite.m124016a(adii.f61801b, a, bxus.m123743b());
                Signature[] signatureArr = adli.f62107c.getPackageInfo(str, 64).signatures;
                for (byte[] bArr : bxzj.f165164a.mo66860a((Iterable) adii.f61803a)) {
                    int length = signatureArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            adli.f62105a.mo33426b("Installed app key is different from the instant app.", new Object[0]);
                            throw new adlh("Installed app doesn't have the same signature as the instant app.");
                        } else if (!Arrays.equals(bArr, signatureArr[i].toByteArray())) {
                            i++;
                        }
                    }
                }
                File b = adli.mo33634b(str);
                if (b.exists()) {
                    adgc.mo33442a(status, ParcelFileDescriptor.open(b, 268435456));
                    return;
                }
                throw new adlh("No app data found.");
            }
            adli.mo33633a(str);
            throw new adlh("Unknown package.");
        } catch (PackageManager.NameNotFoundException e) {
            throw new adlh("App not installed.");
        } catch (IOException e2) {
            adlm.f62121a.mo33425a(e2, "Unexpected fetch app data error.", new Object[0]);
            this.f62115d.mo33442a(Status.f30109c, (ParcelFileDescriptor) null);
        } catch (adlh e3) {
            adlm.f62121a.mo33425a(e3, "Failed to fetch app data.", new Object[0]);
            this.f62115d.mo33442a(Status.f30109c, (ParcelFileDescriptor) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f62115d.mo33442a(status, (ParcelFileDescriptor) null);
    }
}
