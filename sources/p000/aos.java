package p000;

import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* renamed from: aos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aos implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ SeekBarPreference f1913a;

    public aos(SeekBarPreference seekBarPreference) {
        this.f1913a = seekBarPreference;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            SeekBarPreference seekBarPreference = this.f1913a;
            if (seekBarPreference.f1628f || !seekBarPreference.f1625c) {
                seekBarPreference.mo2028a(seekBar);
                return;
            }
        }
        SeekBarPreference seekBarPreference2 = this.f1913a;
        seekBarPreference2.mo2029f(i + seekBarPreference2.f1624b);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f1913a.f1625c = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f1913a.f1625c = false;
        int progress = seekBar.getProgress();
        SeekBarPreference seekBarPreference = this.f1913a;
        if (progress + seekBarPreference.f1624b != seekBarPreference.f1623a) {
            seekBarPreference.mo2028a(seekBar);
        }
    }
}
