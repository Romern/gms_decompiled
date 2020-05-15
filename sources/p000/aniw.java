package p000;

import android.os.Build;
import android.util.Log;

/* renamed from: aniw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aniw {

    /* renamed from: b */
    private static final bnic f76980b = bnic.m109490a("https://www.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs", "https://tac.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs");

    /* renamed from: a */
    public final String f76981a;

    public aniw(String str) {
        if (!"user".equals(Build.TYPE)) {
            this.f76981a = str;
        } else if (!f76980b.contains(str)) {
            this.f76981a = "https://www.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs";
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 72 + String.valueOf("https://www.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs").length());
            sb.append("Invalid URL provided for Heterodyne: ");
            sb.append(str);
            sb.append("; falling back to known valid URL: ");
            sb.append("https://www.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs");
            Log.e("HeterodyneServiceUrl", sb.toString());
        } else {
            this.f76981a = str;
        }
    }
}
