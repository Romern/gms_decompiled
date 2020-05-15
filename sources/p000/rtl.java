package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: rtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rtl implements SharedPreferences {

    /* renamed from: a */
    private SharedPreferences f43660a;

    /* renamed from: b */
    private final boolean f43661b;

    /* renamed from: c */
    private final Context f43662c;

    /* renamed from: d */
    private final String f43663d;

    /* renamed from: e */
    private final boolean f43664e;

    public rtl(Context context, String str, boolean z, boolean z2) {
        this.f43663d = str;
        if (z) {
            this.f43662c = context.getApplicationContext();
        } else {
            if (z2) {
                this.f43662c = aytw.m84817d(context.getApplicationContext());
            } else {
                this.f43662c = context.getApplicationContext();
            }
            this.f43660a = this.f43662c.getSharedPreferences(str, 0);
            if (cdjz.m133768c()) {
                this.f43660a = new rth(this.f43660a);
            }
        }
        this.f43661b = z;
        this.f43664e = z2;
        if (!z2) {
            return;
        }
        if (z) {
            Bundle a = m34399a(this.f43662c, this.f43663d, m34400a("moveSharedPreferencesFrom", null));
            if (a != null) {
                a.getBoolean("moveSharedPreferencesFrom", false);
                return;
            }
            return;
        }
        aytw.m84814b();
        if (aytw.m84815b(context) && !context.isDeviceProtectedStorage()) {
            this.f43662c.moveSharedPreferencesFrom(context, this.f43663d);
        }
    }

    /* renamed from: a */
    public static Bundle m34399a(Context context, String str, Bundle bundle) {
        scw scw;
        rex rex = new rex();
        Intent intent = new Intent("com.google.android.gms.common.BIND_SHARED_PREFS").setPackage("com.google.android.gms");
        skh a = skh.m35531a();
        int a2 = (int) cdjz.f181084a.mo6606a().mo77772a();
        if (a2 <= 0) {
            a2 = 1;
        }
        int i = 0;
        while (i < a2) {
            if (!a.mo25690a(context, intent, rex, 1)) {
                a.mo25689a(context, rex);
                Log.w("SharedPreferences", "binding to PrefService failed. Retry in 1 second");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                i++;
            } else {
                try {
                    IBinder a3 = rex.mo24567a();
                    if (a3 != null) {
                        IInterface queryLocalInterface = a3.queryLocalInterface("com.google.android.gms.common.internal.ISharedPreferencesService");
                        scw = !(queryLocalInterface instanceof scw) ? new scu(a3) : (scw) queryLocalInterface;
                    } else {
                        scw = null;
                    }
                    Bundle a4 = scw.mo25388a(str, 0, bundle);
                    skh.m35531a().mo25689a(context, rex);
                    return a4;
                } catch (InterruptedException e2) {
                    Log.e("SharedPreferences", "Bind to SharedPreferencesService interrupted");
                } catch (RemoteException e3) {
                    Log.e("SharedPreferences", "Bind to SharedPreferencesService interrupted");
                } catch (IllegalArgumentException e4) {
                    String valueOf = String.valueOf(e4.getMessage());
                    Log.e("SharedPreferences", valueOf.length() == 0 ? new String("Error communicating with SharedPreferencesService: ") : "Error communicating with SharedPreferencesService: ".concat(valueOf));
                } catch (Throwable th) {
                    skh.m35531a().mo25689a(context, rex);
                    throw th;
                }
            }
        }
        throw new rti(new RemoteException());
        skh.m35531a().mo25689a(context, rex);
        return null;
    }

    public final boolean contains(String str) {
        if (!this.f43661b) {
            return this.f43660a.contains(str);
        }
        Bundle a = m34399a(this.f43662c, this.f43663d, m34400a("contains", str));
        if (a != null) {
            return a.getBoolean("contains", false);
        }
        return false;
    }

    public final Map getAll() {
        if (!this.f43661b) {
            return this.f43660a.getAll();
        }
        Bundle a = m34399a(this.f43662c, this.f43663d, m34400a("getAll", null));
        return a == null ? Collections.EMPTY_MAP : (Map) a.getSerializable("getAll");
    }

    public final boolean getBoolean(String str, boolean z) {
        if (!this.f43661b) {
            return this.f43660a.getBoolean(str, z);
        }
        Bundle a = m34399a(this.f43662c, this.f43663d, m34400a("getBoolean", str));
        return a != null ? a.getBoolean("getBoolean", z) : z;
    }

    public final float getFloat(String str, float f) {
        if (!this.f43661b) {
            return this.f43660a.getFloat(str, f);
        }
        Bundle a = m34399a(this.f43662c, this.f43663d, m34400a("getFloat", str));
        return a != null ? a.getFloat("getFloat", f) : f;
    }

    public final int getInt(String str, int i) {
        if (!this.f43661b) {
            return this.f43660a.getInt(str, i);
        }
        Bundle a = m34399a(this.f43662c, this.f43663d, m34400a("getInt", str));
        return a != null ? a.getInt("getInt", i) : i;
    }

    public final long getLong(String str, long j) {
        if (!this.f43661b) {
            return this.f43660a.getLong(str, j);
        }
        Bundle a = m34399a(this.f43662c, this.f43663d, m34400a("getLong", str));
        return a != null ? a.getLong("getLong", j) : j;
    }

    public final String getString(String str, String str2) {
        if (!this.f43661b) {
            return this.f43660a.getString(str, str2);
        }
        Bundle a = m34399a(this.f43662c, this.f43663d, m34400a("getString", str));
        return a != null ? a.getString("getString") : str2;
    }

    public final Set getStringSet(String str, Set set) {
        String[] strArr;
        if (!this.f43661b) {
            return this.f43660a.getStringSet(str, set);
        }
        Bundle a = m34399a(this.f43662c, this.f43663d, m34400a("getStringSet", str));
        if (a != null) {
            strArr = a.getStringArray("getStringSet");
        } else {
            strArr = null;
        }
        if (strArr != null) {
            set = new C1225nr();
            for (String str2 : strArr) {
                set.add(str2);
            }
        }
        return set;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (!this.f43661b) {
            this.f43660a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (!this.f43661b) {
            this.f43660a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    /* renamed from: a */
    private final Bundle m34400a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("FUNCTION_NAME", str);
        bundle.putString("KEY_NAME", str2);
        bundle.putBoolean("isDirectBoot", this.f43664e);
        return bundle;
    }

    /* renamed from: a */
    public final rtk edit() {
        return new rtk(this.f43662c, this.f43660a, this.f43663d, this.f43661b, this.f43664e);
    }
}
