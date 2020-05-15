package p000;

import android.widget.Button;
import com.google.android.setupdesign.view.NavigationBar;

/* renamed from: bjan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjan implements bjaq {

    /* renamed from: a */
    final /* synthetic */ NavigationBar f122433a;

    public bjan(NavigationBar navigationBar) {
        this.f122433a = navigationBar;
    }

    /* renamed from: a */
    public final void mo64959a(boolean z) {
        int i = 8;
        this.f122433a.f151535c.setVisibility(!z ? 8 : 0);
        Button button = this.f122433a.f151533a;
        if (!z) {
            i = 0;
        }
        button.setVisibility(i);
    }
}
