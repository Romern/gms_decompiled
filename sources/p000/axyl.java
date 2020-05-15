package p000;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: axyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axyl implements axyk {

    /* renamed from: a */
    public final String f96776a;

    public axyl(String str) {
        this.f96776a = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[SYNTHETIC, Splitter:B:30:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0098 A[SYNTHETIC, Splitter:B:41:0x0098] */
    /* renamed from: a */
    public final axzx mo53767a(ayev ayev) {
        axyt axyt;
        FileOutputStream fileOutputStream;
        ayfb ayfb = ayev.f97379b;
        if (ayfb == null) {
            ayfb = ayfb.f97441e;
        }
        FileOutputStream fileOutputStream2 = null;
        if ((ayfb.f97443a & 4) == 0) {
            return new axzx(ayev, null);
        }
        String a = axxv.m83495a(ayev.mo73642k());
        ayfb ayfb2 = ayev.f97379b;
        if (ayfb2 == null) {
            ayfb2 = ayfb.f97441e;
        }
        String a2 = axxv.m83495a(ayfb2.f97446d.mo73780k());
        File a3 = axyn.m83572a(this.f96776a, a);
        try {
            fileOutputStream = new FileOutputStream(a3);
            try {
                ayfb ayfb3 = ayev.f97379b;
                if (ayfb3 == null) {
                    ayfb3 = ayfb.f97441e;
                }
                ayfb3.f97446d.mo73757a(fileOutputStream);
                fileOutputStream.close();
                axyt = new axyt(a2, a3);
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                e = e2;
                try {
                    Log.w("wearable", "Error trying to write V0 asset into a file.", e);
                    if (fileOutputStream != null) {
                    }
                    axyt = null;
                    if (axyt != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                    }
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
            Log.w("wearable", "Error trying to write V0 asset into a file.", e);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                    axyt = null;
                } catch (IOException e4) {
                    axyt = null;
                    if (axyt != null) {
                    }
                }
                if (axyt != null) {
                }
            }
            axyt = null;
            if (axyt != null) {
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
        if (axyt != null) {
            return new axzx(ayev, axyt);
        }
        String valueOf = String.valueOf(ayev);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 83);
        sb.append("Dropped an incoming message because we failed to convert it to the latest version: ");
        sb.append(valueOf);
        Log.w("wearable", sb.toString());
        return new axzx(ayev, null, false);
    }

    /* renamed from: a */
    public final void mo53768a() {
    }
}
