package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: aezy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aezy {

    /* renamed from: a */
    private static Boolean f64066a;

    /* renamed from: b */
    private static WeakReference f64067b;

    /* renamed from: e */
    private static final sek f64068e = new sek(new String[]{"ClientConnectionManager"}, (int[]) null);

    /* renamed from: c */
    private final SharedPreferences f64069c;

    /* renamed from: d */
    private final afan f64070d;

    public aezy(Context context) {
        this.f64069c = context.getSharedPreferences("com.google.android.gms.magictether.host.CLIENT_CONNECTION_MANAGER_PREFERENCE_FILE", 0);
        this.f64070d = afal.m52785a(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* renamed from: a */
    public static aezy m52769a(Context context) {
        aezy aezy;
        boolean z;
        if (f64066a == null) {
            String a = ssy.m36271a();
            boolean z2 = false;
            if (a != null) {
                if (a.contains("magictether")) {
                    z = true;
                } else if (a.contains("chimera")) {
                    z = true;
                }
                if (!spn.m35873c()) {
                    z2 = true;
                } else if (z) {
                    z2 = true;
                }
                f64066a = Boolean.valueOf(z2);
            }
            z = false;
            if (!spn.m35873c()) {
            }
            f64066a = Boolean.valueOf(z2);
        }
        sdo.m34970a(f64066a.booleanValue());
        WeakReference weakReference = f64067b;
        if (weakReference != null) {
            aezy = (aezy) weakReference.get();
        } else {
            aezy = null;
        }
        if (aezy != null) {
            return aezy;
        }
        aezy aezy2 = new aezy(context);
        f64067b = new WeakReference(aezy2);
        return aezy2;
    }

    /* renamed from: b */
    public final void mo34704b(String str) {
        new Object[1][0] = jkr.m16853a(str);
        Set a = m52770a();
        if (!a.isEmpty()) {
            a.remove(str);
            m52771a(a);
            if (a.isEmpty()) {
                this.f64070d.mo34712a();
            }
        }
    }

    /* renamed from: a */
    private final Set m52770a() {
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(this.f64069c.getString("com.google.android.gms.magictether.CLIENT_DEVICE_LIST", "[]"));
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
        } catch (JSONException e) {
            f64068e.mo25418e("Parsing SharedPreferences client device list failed.", new Object[0]);
        }
        return hashSet;
    }

    /* renamed from: a */
    private final void m52771a(Set set) {
        this.f64069c.edit().putString("com.google.android.gms.magictether.CLIENT_DEVICE_LIST", new JSONArray((Collection) set).toString()).commit();
    }

    /* renamed from: a */
    public final void mo34702a(String str) {
        new Object[1][0] = jkr.m16853a(str);
        Set a = m52770a();
        a.add(str);
        m52771a(a);
    }

    /* renamed from: a */
    public final void mo34703a(boolean z) {
        m52771a(new HashSet());
        if (z) {
            this.f64070d.mo34712a();
        }
    }
}
