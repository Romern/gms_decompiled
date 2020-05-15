package p000;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.List;

/* renamed from: azik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azik extends Fragment {

    /* renamed from: a */
    public List f99477a;

    /* renamed from: b */
    public String f99478b;

    /* renamed from: c */
    public boolean f99479c;

    /* renamed from: d */
    public boolean f99480d;

    /* renamed from: e */
    public azcb f99481e;

    /* renamed from: a */
    public final int mo54949a(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.ms_app_settings, viewGroup, false);
        TypedArray obtainStyledAttributes = getActivity().getTheme().obtainStyledAttributes(new int[]{16842801});
        int color = obtainStyledAttributes.getColor(0, C1133kh.m17843b(getContext(), C0126R.color.quantum_white_100));
        obtainStyledAttributes.recycle();
        inflate.setBackgroundColor(color);
        this.f99477a = azcv.m85357a(getContext()).mo54704e();
        this.f99478b = getArguments().getString("server_app_id");
        new azif(this, inflate).start();
        return inflate;
    }

    public final void onDestroy() {
        boolean z;
        super.onDestroy();
        if (cfeo.m138866W() && (z = this.f99480d) != this.f99479c) {
            mo54950a(z, true);
        }
    }

    /* renamed from: a */
    public final void mo54950a(boolean z, boolean z2) {
        if (!z) {
            Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.UNBLOCK_APP");
            intent.putExtra("server_app_id", this.f99478b);
            intent.putExtra("sync_app_block_state_with_server", z2);
            MessagingService.m94557b(intent, getContext());
            return;
        }
        Intent intent2 = new Intent("com.google.android.apps.libraries.matchstick.action.BLOCK_APP");
        intent2.putExtra("server_app_id", this.f99478b);
        intent2.putExtra("sync_app_block_state_with_server", z2);
        MessagingService.m94557b(intent2, getContext());
    }
}
