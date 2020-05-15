package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: admg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class admg extends adms {
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f62171d.mo33664a(C0126R.string.common_ok, new adme(this));
        this.f62171d.mo33665b(C0126R.string.common_settings, new admf(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.setup_restore_supervisor_success_fragment, viewGroup, false);
    }
}
