package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: fuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fuf extends Fragment {

    /* renamed from: a */
    fug f17256a;

    /* renamed from: b */
    boolean f17257b;

    /* renamed from: c */
    Intent f17258c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11342a(Activity activity) {
        if (this.f17257b && isResumed()) {
            Intent intent = this.f17258c;
            if (intent == null) {
                activity.finish();
            } else if (fzn.m12803a(intent)) {
                activity.startActivityForResult(this.f17258c, 0);
            } else {
                activity.startActivity(this.f17258c);
                activity.finish();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f17258c = (Intent) bundle.getParcelable("fdlIntent");
            this.f17257b = bundle.getBoolean("taskComplete");
        }
    }

    public final void onResume() {
        super.onResume();
        Activity activity = getActivity();
        if (this.f17257b) {
            mo11342a(activity);
        } else if (this.f17256a == null) {
            fug fug = new fug(activity, activity.getIntent(), new fuv(activity.getApplicationContext(), null), this);
            this.f17256a = fug;
            fug.execute(new Void[0]);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Intent intent = this.f17258c;
        if (intent != null) {
            bundle.putParcelable("fdlIntent", intent);
        }
        bundle.putBoolean("taskComplete", this.f17257b);
    }

    public final void onStop() {
        super.onStop();
        if (this.f17256a != null && !getActivity().isChangingConfigurations()) {
            this.f17256a.cancel(true);
            this.f17256a = null;
        }
    }
}
