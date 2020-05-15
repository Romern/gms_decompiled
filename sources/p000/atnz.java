package p000;

import android.media.SoundPool;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atnz */
public final /* synthetic */ class atnz implements SoundPool.OnLoadCompleteListener {

    /* renamed from: a */
    private final TapUiChimeraActivity f90579a;

    /* renamed from: b */
    private final int f90580b;

    public atnz(TapUiChimeraActivity tapUiChimeraActivity, int i) {
        this.f90579a = tapUiChimeraActivity;
        this.f90580b = i;
    }

    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        TapUiChimeraActivity tapUiChimeraActivity = this.f90579a;
        int i3 = this.f90580b;
        if (i == i3) {
            if (i2 == 0) {
                tapUiChimeraActivity.f108694E.play(i3, 1.0f, 1.0f, 1, 0, 1.0f);
            }
            soundPool.setOnLoadCompleteListener(null);
        }
    }
}
