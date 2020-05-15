package p000;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: adqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqr {

    /* renamed from: a */
    public final SharedPreferences f62516a;

    /* renamed from: b */
    public final Object f62517b = new Object();

    public adqr(SharedPreferences sharedPreferences) {
        this.f62516a = sharedPreferences;
    }

    /* renamed from: a */
    public final Long mo33717a() {
        return Long.valueOf(this.f62516a.getLong("index_built_until_state", 0));
    }

    /* renamed from: b */
    public final void mo33721b() {
        this.f62516a.edit().clear().commit();
    }

    /* renamed from: c */
    public final void mo33722c() {
        this.f62516a.edit().putStringSet("batch_indexing_windows", new HashSet()).commit();
    }

    /* renamed from: d */
    public final void mo33723d() {
        mo33721b();
        this.f62516a.edit().putLong("index_built_until_state", 0).putBoolean("audio_media_files_indexing_enabled", ceqm.m137874e()).putBoolean("id_based_mediastore_indexing_enabled", ceqm.m137877h()).commit();
    }

    /* renamed from: a */
    public final Set mo33718a(String str) {
        Set<String> stringSet = this.f62516a.getStringSet(str, new HashSet());
        HashSet hashSet = new HashSet();
        for (String str2 : stringSet) {
            List c = bmyx.m108640a(' ').mo66925c((CharSequence) str2);
            if (c.size() == 2) {
                hashSet.add(new adqq(Long.valueOf((String) c.get(0)), Long.valueOf((String) c.get(1))));
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo33719a(long j) {
        this.f62516a.edit().putLong("index_built_until_state", j).commit();
    }

    /* renamed from: a */
    public final void mo33720a(adqq adqq) {
        synchronized (this.f62517b) {
            Set<String> stringSet = this.f62516a.getStringSet("batch_indexing_windows", new HashSet());
            stringSet.add(adqq.toString());
            this.f62516a.edit().putStringSet("batch_indexing_windows", stringSet).commit();
        }
    }
}
