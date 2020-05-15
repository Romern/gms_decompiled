package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.places.PlacesLoggingChimeraService;

/* renamed from: binc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class binc {

    /* renamed from: a */
    public final bxvd f120966a;

    /* renamed from: b */
    private final String f120967b;

    /* renamed from: c */
    private final int f120968c;

    /* renamed from: d */
    private final String f120969d;

    public binc(ComponentName componentName, Bundle bundle) {
        sdo.m34959a(bundle);
        bxvd da = bppw.f138664f.mo74144da();
        this.f120966a = da;
        if (componentName != null) {
            String shortClassName = componentName.getShortClassName();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bppw bppw = (bppw) da.f164949b;
            shortClassName.getClass();
            bppw.f138666a |= 2;
            bppw.f138667b = shortClassName;
            this.f120967b = componentName.getPackageName();
        } else {
            this.f120967b = null;
        }
        if ("com.google.android.gms".equals(this.f120967b)) {
            this.f120969d = bundle.getString("gcore_client_name");
        } else {
            this.f120969d = null;
        }
        this.f120968c = bundle.getInt("gmscore_client_jar_version", 0);
    }

    /* renamed from: a */
    public final void mo64782a() {
        bxvd bxvd = this.f120966a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bppw bppw = (bppw) bxvd.f164949b;
        bppw bppw2 = bppw.f138664f;
        bppw.f138666a &= -65;
        bppw.f138668c = 0;
        bxvd bxvd2 = this.f120966a;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bppw bppw3 = (bppw) bxvd2.f164949b;
        bppw3.f138666a &= -513;
        bppw3.f138670e = 0;
        bxvd bxvd3 = this.f120966a;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppw bppw4 = (bppw) bxvd3.f164949b;
        bppw4.f138666a &= -129;
        bppw4.f138669d = 0;
    }

    /* renamed from: a */
    public final void mo64783a(Context context) {
        int i;
        if (cgfl.f186724a.mo6606a().mo83606m()) {
            if ((((bppw) this.f120966a.f164949b).f138666a & 64) == 0 && Log.isLoggable("Places", 5)) {
                Log.w("Places", "Logging result without specifying a selection");
            }
            String str = this.f120967b;
            try {
                i = svr.m36484b(context).mo26176b(str, 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                if (Log.isLoggable("Places", 5)) {
                    Log.w("Places", "Failed to get package's version code: ", e);
                }
                i = 0;
            }
            bpqk a = bhqq.m101351a(4, str, i, this.f120968c, this.f120969d, 0);
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((bxvk) a);
            bxvd bxvd2 = this.f120966a;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpqk bpqk = (bpqk) bxvd.f164949b;
            bppw bppw = (bppw) bxvd2.mo74062i();
            bpqk bpqk2 = bpqk.f138732w;
            bppw.getClass();
            bpqk.f138744k = bppw;
            bpqk.f138734a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            PlacesLoggingChimeraService.m117712a(context, (bpqk) bxvd.mo74062i());
        }
    }
}
