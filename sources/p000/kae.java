package p000;

import android.view.View;
import com.google.android.chimera.Activity;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: kae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kae {

    /* renamed from: a */
    public final View f23649a;

    /* renamed from: b */
    public final Collection f23650b = new HashSet();

    /* renamed from: c */
    public int f23651c;

    /* renamed from: d */
    public int f23652d;

    public kae(Activity activity) {
        View findViewById = activity.findViewById(16908290);
        this.f23649a = findViewById;
        findViewById.getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new kad(this));
    }
}
