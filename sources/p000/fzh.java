package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: fzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fzh extends DialogFragment {

    /* renamed from: a */
    private sox f17736a;

    /* renamed from: a */
    public static fzh m12776a() {
        fzh fzh = new fzh();
        Bundle bundle = new Bundle();
        bundle.putString("message", null);
        bundle.putBoolean("cancelable", false);
        fzh.setArguments(bundle);
        return fzh;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, getTheme());
        setCancelable(getArguments().getBoolean("cancelable"));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.appinvite_material_progress_dialog, viewGroup, false);
        String string = getArguments().getString("message");
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.progress_message);
        textView.setText(string);
        if (TextUtils.isEmpty(string)) {
            i = 8;
        }
        textView.setVisibility(i);
        ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.progress_bar);
        sox a = m12777a(imageView);
        this.f17736a = a;
        imageView.setImageDrawable(a);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        sox sox = this.f17736a;
        if (sox != null && !sox.isRunning()) {
            this.f17736a.start();
        }
    }

    public final void onStop() {
        sox sox = this.f17736a;
        if (sox != null && sox.isRunning()) {
            this.f17736a.stop();
        }
        super.onStop();
    }

    /* renamed from: a */
    public static sox m12777a(View view) {
        sox sox = new sox(view.getContext(), view);
        sox.setAlpha(255);
        sox.mo25911a(view.getResources().getColor(C0126R.color.appinvite_light_black));
        return sox;
    }
}
