package p000;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* renamed from: aot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aot implements View.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ SeekBarPreference f1914a;

    public aot(SeekBarPreference seekBarPreference) {
        this.f1914a = seekBarPreference;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            SeekBarPreference seekBarPreference = this.f1914a;
            if (!((!seekBarPreference.f1627e && (i == 21 || i == 22)) || i == 23 || i == 66)) {
                SeekBar seekBar = seekBarPreference.f1626d;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i, keyEvent);
                }
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
        }
        return false;
    }
}
