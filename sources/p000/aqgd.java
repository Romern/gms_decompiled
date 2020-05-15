package p000;

import com.android.volley.RequestQueue;
import com.google.android.gms.security.verifier.InternalApkUploadChimeraService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* renamed from: aqgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgd {

    /* renamed from: a */
    public final InternalApkUploadChimeraService f86025a;

    /* renamed from: b */
    public final File f86026b;

    /* renamed from: c */
    public final byte[] f86027c;

    /* renamed from: d */
    public final byte[] f86028d;

    /* renamed from: e */
    public final BlockingQueue f86029e = new ArrayBlockingQueue(1);

    /* renamed from: f */
    public volatile boolean f86030f;

    /* renamed from: g */
    public RequestQueue f86031g;

    /* renamed from: h */
    public String f86032h;

    /* renamed from: i */
    public int f86033i;

    /* renamed from: j */
    public InputStream f86034j;

    /* renamed from: k */
    public int f86035k;

    /* renamed from: l */
    public final int f86036l;

    /* renamed from: m */
    private byte[] f86037m;

    /* renamed from: a */
    public final void mo47858a() {
        InputStream inputStream = this.f86034j;
        if (inputStream != null) {
            try {
                inputStream.close();
                this.f86034j = null;
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: b */
    public final void mo47859b() {
        int i;
        boolean z;
        new Object[1][0] = Integer.valueOf(this.f86035k);
        int i2 = this.f86033i - this.f86035k;
        if (i2 <= 262144) {
            i = i2;
        } else {
            i = AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        }
        if (i2 <= 262144) {
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = this.f86037m;
        if (bArr == null || bArr.length != i) {
            this.f86037m = new byte[i];
        }
        if (this.f86030f) {
            this.f86029e.add(0);
            return;
        }
        int i3 = this.f86035k;
        try {
            aqgx.m71597a(this.f86037m, this.f86034j);
            this.f86035k += this.f86037m.length;
            if (this.f86030f) {
                this.f86029e.add(0);
            } else if (!this.f86025a.mo58953b()) {
                aqgy.m71602b("Aborting upload: network state changed or service was disabled", new Object[0]);
                this.f86029e.add(0);
            } else {
                this.f86031g.add(new aqge(this.f86032h, new aqgb(this), new aqgc(this, z), i3, this.f86037m, z));
            }
        } catch (IOException | NullPointerException e) {
            aqgy.m71601a(e, "Error occurred while reading apk", new Object[0]);
            this.f86029e.add(1);
        }
    }

    public aqgd(InternalApkUploadChimeraService internalApkUploadChimeraService, File file, byte[] bArr, byte[] bArr2, int i) {
        this.f86025a = internalApkUploadChimeraService;
        this.f86026b = file;
        this.f86027c = (byte[]) sdo.m34959a(bArr);
        this.f86028d = (byte[]) sdo.m34959a(bArr2);
        this.f86036l = i;
    }
}
