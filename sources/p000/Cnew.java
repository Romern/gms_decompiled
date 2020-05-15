package p000;

import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.beacon.BleSettings;
import java.util.Collections;
import java.util.Set;

/* renamed from: new  reason: invalid class name */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Cnew {

    /* renamed from: a */
    private final C1223np f35433a = new C1223np();

    /* renamed from: b */
    private final SharedPreferences f35434b;

    public Cnew(SharedPreferences sharedPreferences) {
        this.f35434b = sharedPreferences;
        mo20550b();
    }

    /* renamed from: a */
    public final synchronized void mo20547a() {
        int i = Build.VERSION.SDK_INT;
        SharedPreferences.Editor edit = this.f35434b.edit();
        edit.putStringSet("client_names", this.f35433a.keySet());
        int i2 = 0;
        while (true) {
            C1223np npVar = this.f35433a;
            if (i2 < npVar.f26809h) {
                String str = (String) npVar.mo15620b(i2);
                nev nev = (nev) this.f35433a.mo15621c(i2);
                if (nev != null) {
                    edit.putLong(String.valueOf(str).concat("scan_started"), nev.f35426b);
                    edit.putLong(String.valueOf(str).concat("scan_ended"), nev.f35427c);
                    edit.putLong(String.valueOf(str).concat("total_scans"), nev.f35430f);
                    edit.putLong(String.valueOf(str).concat("long_scans"), nev.f35431g);
                    edit.putLong(String.valueOf(str).concat("longest_scan"), nev.f35429e);
                    edit.putString(String.valueOf(str).concat("settings"), nev.f35425a);
                }
                i2++;
            } else {
                edit.apply();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo20550b() {
        synchronized (this) {
            int i = Build.VERSION.SDK_INT;
            Set<String> stringSet = this.f35434b.getStringSet("client_names", Collections.emptySet());
            if (stringSet != null) {
                if (!stringSet.isEmpty()) {
                    for (String str : stringSet) {
                        this.f35433a.put(str, new nev(this.f35434b.getString(String.valueOf(str).concat("settings"), ""), this.f35434b.getLong(String.valueOf(str).concat("scan_started"), 0), this.f35434b.getLong(String.valueOf(str).concat("scan_ended"), 0), this.f35434b.getLong(String.valueOf(str).concat("total_scans"), 0), this.f35434b.getLong(String.valueOf(str).concat("long_scans"), 0), this.f35434b.getLong(String.valueOf(str).concat("longest_scan"), 0)));
                    }
                    return;
                }
            }
            this.f35434b.edit().clear().apply();
        }
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        int i = 0;
        while (true) {
            C1223np npVar = this.f35433a;
            if (i >= npVar.f26809h) {
                return a.toString();
            }
            a.mo25396a("\nclient", (String) npVar.mo15620b(i));
            a.mo25396a("scanInfo", (nev) this.f35433a.mo15621c(i));
            i++;
        }
    }

    /* renamed from: a */
    public final synchronized void mo20548a(BleSettings bleSettings) {
        boolean z;
        if (bleSettings != null) {
            String a = bleSettings.mo17297a();
            nev nev = (nev) this.f35433a.get(a);
            if (nev == null) {
                nev = new nev();
            }
            String bleSettings2 = bleSettings.toString();
            if (bleSettings.f29265a == 3) {
                z = true;
            } else {
                z = false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = nev.f35426b;
            if (j >= nev.f35427c) {
                if (j != 0) {
                    nev.mo20543a(currentTimeMillis);
                }
            }
            nev.f35425a = bleSettings2;
            nev.f35432h = z;
            nev.f35426b = currentTimeMillis;
            this.f35433a.put(a, nev);
        }
    }

    /* renamed from: a */
    public final synchronized void mo20549a(Integer num) {
        nev nev = (nev) this.f35433a.get(BleSettings.m22044b(num.intValue()));
        if (nev != null) {
            nev.mo20543a(System.currentTimeMillis());
        }
    }
}
