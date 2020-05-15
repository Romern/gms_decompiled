package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import java.security.SecureRandom;

/* renamed from: arqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arqc implements arac {

    /* renamed from: c */
    private static final Logger f88111c = ascp.m73787a("Setup", "Util", "PostSetupHelperImpl");

    /* renamed from: a */
    public final SharedPreferences f88112a;

    /* renamed from: b */
    public final armd f88113b;

    /* renamed from: d */
    private final Context f88114d;

    public arqc(Context context) {
        armd armd = new armd(context);
        this.f88114d = context;
        this.f88112a = context.getSharedPreferences("SmartDevice.d2dSharedSecret", 0);
        this.f88113b = armd;
    }

    /* renamed from: b */
    public static byte[] m73292b() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: a */
    public final void mo48326a(byte[] bArr, long j) {
        if (bArr != null) {
            this.f88112a.edit().putString("sharedSecret", sqd.m35968b(bArr)).putLong("session", j).apply();
            CleanSharedSecretChimeraService.m92620b(this.f88114d);
            armd armd = this.f88113b;
            armd.mo48634a(2);
            armd.mo48635a(j);
            armd.mo48633a();
            return;
        }
        f88111c.mo25414c("Shared secret is null.", new Object[0]);
    }

    /* renamed from: a */
    public final byte[] mo48327a() {
        String string = this.f88112a.getString("sharedSecret", null);
        if (string != null) {
            return sqd.m35966a(string);
        }
        return null;
    }
}
