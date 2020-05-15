package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: pzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pzz implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final SharedPreferences f40767a;

    /* renamed from: b */
    public final Set f40768b = new HashSet();

    /* renamed from: c */
    public final Map f40769c = new HashMap();

    /* renamed from: d */
    public final Set f40770d = new HashSet();

    /* renamed from: e */
    public final Set f40771e = new HashSet();

    /* renamed from: f */
    public boolean f40772f;

    /* renamed from: g */
    public final qav f40773g = new qav("RCNPrefManager");

    /* renamed from: h */
    private final Context f40774h;

    public pzz(Context context) {
        this.f40774h = context;
        SharedPreferences b = qay.m31785b(context);
        this.f40767a = b;
        b.registerOnSharedPreferenceChangeListener(this);
        this.f40772f = this.f40767a.getBoolean("googlecast-isEnabled", !sre.m36084d(context));
        this.f40768b.addAll(this.f40767a.getStringSet("googlecast-disabledDeviceIds", Collections.emptySet()));
        Collections.addAll(this.f40770d, cday.f180398a.mo6606a().mo77180b().split(","));
        Collections.addAll(this.f40771e, cday.f180398a.mo6606a().mo77179a().split(","));
        Set<String> stringSet = this.f40767a.getStringSet("googlecast-dismissedSessions", Collections.emptySet());
        for (String str : stringSet) {
            String[] split = str.split(":");
            pzy pzy = null;
            if (split.length == 3 && !split[0].isEmpty() && !split[1].isEmpty() && !split[2].isEmpty()) {
                pzy pzy2 = new pzy();
                pzy2.f40764a = split[0];
                pzy2.f40765b = split[1];
                try {
                    pzy2.f40766c = Long.parseLong(split[2]);
                    pzy = pzy2;
                } catch (NumberFormatException e) {
                }
            }
            if (pzy != null && !m31734a(pzy)) {
                this.f40769c.put(pzy.f40764a, pzy);
            }
        }
        if (this.f40769c.size() != stringSet.size()) {
            mo23835b();
        }
    }

    /* renamed from: b */
    public final void mo23835b() {
        HashSet hashSet = new HashSet();
        for (pzy pzy : this.f40769c.values()) {
            if (!m31734a(pzy)) {
                hashSet.add(pzy.toString());
            }
        }
        this.f40767a.edit().putStringSet("googlecast-dismissedSessions", hashSet).apply();
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("googlecast-isEnabled".equals(str)) {
            boolean z = this.f40767a.getBoolean("googlecast-isEnabled", true);
            this.f40772f = z;
            this.f40774h.sendBroadcast(new Intent(!z ? "com.google.android.gms.cast.rcn.DISABLED" : "com.google.android.gms.cast.rcn.ENABLED"));
        }
    }

    /* renamed from: a */
    public static final boolean m31734a(pzy pzy) {
        return System.currentTimeMillis() - pzy.f40766c > 86400000;
    }

    /* renamed from: a */
    public final Set mo23834a() {
        Set<String> stringSet = this.f40767a.getStringSet("googlecast-RCNIds", Collections.emptySet());
        this.f40767a.edit().remove("googlecast-RCNIds").apply();
        HashSet hashSet = new HashSet(stringSet.size());
        for (String str : stringSet) {
            hashSet.add(Integer.valueOf(str));
        }
        return hashSet;
    }
}
