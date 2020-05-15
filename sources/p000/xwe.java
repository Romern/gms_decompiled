package p000;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: xwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xwe extends Fragment {

    /* renamed from: a */
    public Handler f53269a;

    /* renamed from: b */
    public boolean f53270b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        if (this.f53270b) {
            view = layoutInflater.inflate((int) C0126R.C0128layout.paask_spinner_fragment_for_strongbox, viewGroup, false);
        } else {
            view = layoutInflater.inflate((int) C0126R.C0128layout.paask_spinner_fragment, viewGroup, false);
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) ((ImageView) view.findViewById(C0126R.C0129id.fido_paask_progress_indicator)).getDrawable();
        animatedVectorDrawable.registerAnimationCallback(new xwd(this));
        animatedVectorDrawable.start();
        return view;
    }
}
