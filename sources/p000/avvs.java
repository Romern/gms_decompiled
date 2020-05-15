package p000;

import android.content.SharedPreferences;
import android.view.View;

/* renamed from: avvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avvs implements View.OnClickListener {
    public void onClick(View view) {
        avvn a = avvn.m79436a();
        synchronized (a.f93986a) {
            SharedPreferences b = a.mo51647b();
            rzz.m34727a(b, "Unexpected null from getPrefs.");
            SharedPreferences.Editor edit = b.edit();
            edit.clear();
            edit.apply();
        }
    }
}
