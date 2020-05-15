package p000;

import android.widget.Button;
import com.google.android.chimera.Fragment;
import java.util.Arrays;
import java.util.List;

/* renamed from: ikz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ikz extends Fragment {

    /* renamed from: a */
    private long f21274a = 0;

    static {
        new sek("TaggedFragment");
    }

    /* renamed from: a */
    public abstract String mo13099a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List mo13101b() {
        return Arrays.asList(new Button[0]);
    }

    /* renamed from: c */
    public final void mo13114c() {
        this.f21274a = 500;
    }

    public final void onStart() {
        super.onStart();
        if (this.f21274a > 0) {
            List<Button> b = mo13101b();
            if (!b.isEmpty()) {
                for (Button button : b) {
                    button.setEnabled(false);
                    button.setAlpha(0.5f);
                }
                new adzt().postDelayed(new iky(this), this.f21274a);
            }
        }
    }
}
