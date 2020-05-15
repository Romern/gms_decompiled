package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.Map;

/* renamed from: acrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acrp {

    /* renamed from: a */
    public final Context f60629a;

    /* renamed from: b */
    public final acro f60630b;

    /* renamed from: c */
    public final SharedPreferences f60631c;

    /* renamed from: d */
    public final int f60632d;

    /* renamed from: e */
    public Map f60633e;

    /* renamed from: f */
    private final String f60634f;

    public acrp(Context context, acro acro, SharedPreferences sharedPreferences, int i, String str) {
        this.f60629a = context;
        this.f60630b = acro;
        this.f60631c = sharedPreferences;
        this.f60632d = i;
        this.f60634f = str;
    }

    /* renamed from: a */
    public static final boolean m49775a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getAll().isEmpty();
    }

    /* renamed from: b */
    public final void mo33048b(String str) {
        String valueOf = String.valueOf(this.f60634f);
        String str2 = str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
        File file = new File(new File(this.f60629a.getApplicationInfo().dataDir, "shared_prefs"), String.valueOf(str2).concat(".xml"));
        if (file.exists()) {
            String valueOf2 = String.valueOf(str2);
            absg.m48184a(valueOf2.length() == 0 ? new String("deleting old settings: ") : "deleting old settings: ".concat(valueOf2));
            file.delete();
            return;
        }
        String valueOf3 = String.valueOf(str2);
        absg.m48184a(valueOf3.length() == 0 ? new String("Does not exist: ") : "Does not exist: ".concat(valueOf3));
    }

    /* renamed from: a */
    public final abul mo33046a(String str) {
        abul abul = (abul) this.f60633e.get(str);
        if (abul != null) {
            return abul;
        }
        abul abul2 = abul.f58412n;
        this.f60633e.put(str, abul2);
        return abul2;
    }

    /* renamed from: a */
    public final void mo33047a(String str, abul abul) {
        this.f60633e.put(str, abul);
    }
}
