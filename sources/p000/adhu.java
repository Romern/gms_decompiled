package p000;

import android.content.Context;
import android.provider.Settings;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;

/* renamed from: adhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhu {

    /* renamed from: a */
    public static final adfs f61721a = new adfs("InstantAppsMetadataMethods");

    /* renamed from: b */
    static final int f61722b = spn.f44932a;

    /* renamed from: c */
    public final Context f61723c;

    /* renamed from: d */
    public final adhk f61724d;

    /* renamed from: e */
    public final adik f61725e;

    /* renamed from: f */
    public final adfq f61726f;

    /* renamed from: g */
    private final File f61727g;

    public adhu(Context context, adhk adhk, adik adik, adfq adfq, File file) {
        this.f61723c = context;
        this.f61724d = adhk;
        this.f61725e = adik;
        this.f61726f = adfq;
        this.f61727g = file;
    }

    /* renamed from: a */
    public final int mo33521a() {
        return Settings.Global.getInt(this.f61723c.getContentResolver(), "ephemeral_cookie_max_size_bytes", AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
    }

    /* renamed from: a */
    public final File mo33522a(String str) {
        if (this.f61727g.exists() && !this.f61727g.isDirectory() && !this.f61727g.delete()) {
            f61721a.mo33426b("Unable to delete non-directory %s", this.f61727g);
            return null;
        } else if (this.f61727g.exists() || this.f61727g.mkdirs()) {
            return new File(this.f61727g, str);
        } else {
            f61721a.mo33426b("Unable to mkdirs for %s", this.f61727g);
            return null;
        }
    }
}
