package p000;

import android.content.SharedPreferences;
import java.util.Collection;

/* renamed from: lhk */
final /* synthetic */ class lhk implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final lhn f26109a;

    public lhk(lhn lhn) {
        this.f26109a = lhn;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        bnic a;
        lhn lhn = this.f26109a;
        if ("profile".equals(str)) {
            synchronized (lhn.f26101a) {
                a = bnic.m109495a((Collection) lhn.f26102b);
            }
            bnrd a2 = a.iterator();
            while (a2.hasNext()) {
                ((krf) a2.next()).f24836a.mo14847v();
            }
        }
    }
}
