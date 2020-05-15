package p000;

import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: aupj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aupj implements aupn {

    /* renamed from: a */
    public final SharedPreferences f92270a;

    /* renamed from: b */
    public final SharedPreferences.Editor f92271b;

    public aupj(SharedPreferences sharedPreferences) {
        this.f92270a = sharedPreferences;
        this.f92271b = sharedPreferences.edit();
    }

    /* renamed from: a */
    public final long mo50724a(String str, long j) {
        return this.f92270a.getLong(str, j);
    }

    /* renamed from: b */
    public final void mo50731b(String str) {
        this.f92271b.remove(str);
    }

    /* renamed from: c */
    public final Set mo50735c() {
        return this.f92270a.getAll().keySet();
    }

    /* renamed from: d */
    public final void mo50737d() {
        this.f92271b.commit();
    }

    /* renamed from: a */
    public final String mo50725a(String str, String str2) {
        return this.f92270a.getString(str, str2);
    }

    /* renamed from: b */
    public final void mo50732b(String str, long j) {
        this.f92271b.putLong(str, j);
    }

    /* renamed from: c */
    public final boolean mo50736c(String str) {
        return this.f92270a.getBoolean(str, false);
    }

    /* renamed from: a */
    public final void mo50728a(String str, boolean z) {
        this.f92271b.putBoolean(str, z);
    }

    /* renamed from: a */
    public final boolean mo50729a(String str) {
        return this.f92270a.contains(str);
    }
}
