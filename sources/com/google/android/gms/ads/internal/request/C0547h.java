package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.ads.internal.request.h */
final /* synthetic */ class C0547h implements Runnable {

    /* renamed from: a */
    private final OutputStream f8704a;

    /* renamed from: b */
    private final byte[] f8705b;

    public C0547h(OutputStream outputStream, byte[] bArr) {
        this.f8704a = outputStream;
        this.f8705b = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
    public final void run() {
        OutputStream outputStream = this.f8704a;
        byte[] bArr = this.f8705b;
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
            try {
                dataOutputStream2.writeInt(bArr.length);
                dataOutputStream2.write(bArr);
                srz.m36171a(dataOutputStream2);
            } catch (IOException e) {
                e = e;
                dataOutputStream = dataOutputStream2;
                try {
                    C0633h.m5669b("Error transporting the ad response", e);
                    C0387d.m5366d().mo6783a(e, "LargeParcelTeleporter.pipeData.1");
                    if (dataOutputStream == null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (dataOutputStream != null) {
                        srz.m36171a(dataOutputStream);
                    } else {
                        srz.m36171a(outputStream);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                if (dataOutputStream != null) {
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            C0633h.m5669b("Error transporting the ad response", e);
            C0387d.m5366d().mo6783a(e, "LargeParcelTeleporter.pipeData.1");
            if (dataOutputStream == null) {
                srz.m36171a(dataOutputStream);
            } else {
                srz.m36171a(outputStream);
            }
        } catch (Throwable th3) {
            th = th3;
            if (dataOutputStream != null) {
            }
            throw th;
        }
    }
}
