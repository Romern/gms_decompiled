package p000;

import android.util.Log;
import java.io.File;

/* renamed from: dgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dgt extends dgr {

    /* renamed from: a */
    private final File f13083a;

    /* renamed from: b */
    private final String f13084b;

    public dgt(File file, dhs dhs) {
        this.f13083a = file;
        String str = dhs.f13182a;
        String str2 = dhs.f13183b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append("dl-");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append(".apk");
        this.f13084b = sb.toString();
    }

    /* renamed from: a */
    public final String mo8971a() {
        return this.f13084b;
    }

    /* renamed from: a */
    public final String mo8972a(File file) {
        if (!this.f13083a.renameTo(file)) {
            String valueOf = String.valueOf(this.f13083a);
            String valueOf2 = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length());
            sb.append("Failed to rename ");
            sb.append(valueOf);
            sb.append(" to ");
            sb.append(valueOf2);
            Log.e("FileApkMgr", sb.toString());
            return null;
        }
        String valueOf3 = String.valueOf(file.getAbsolutePath());
        if (valueOf3.length() == 0) {
            new String("Renamed to ");
        } else {
            "Renamed to ".concat(valueOf3);
        }
        return dha.m8463a(file);
    }
}
