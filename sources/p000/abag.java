package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: abag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abag extends DialogFragment {

    /* renamed from: c */
    private static final DialogInterface.OnClickListener f56930c = abad.f56924a;

    /* renamed from: a */
    public Bundle f56931a;

    /* renamed from: b */
    public abaf f56932b;

    /* renamed from: d */
    private int f56933d;

    /* renamed from: e */
    private int f56934e;

    /* renamed from: f */
    private int f56935f;

    /* renamed from: g */
    private int f56936g;

    /* renamed from: h */
    private int f56937h;

    /* renamed from: a */
    public static abae m47347a() {
        return new abae();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f56932b = (abaf) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement OnPositiveClickListener"));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f56933d = arguments.getInt("title_res_id");
        this.f56934e = arguments.getInt("message_res_id");
        this.f56935f = arguments.getInt("positive_button_text_res_id");
        this.f56936g = arguments.getInt("negative_button_text_res_id");
        this.f56937h = arguments.getInt("button_text_color_res_id");
        this.f56931a = arguments.getBundle("extra_args");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C1349sg sgVar = new C1349sg(getActivity());
        int i = this.f56933d;
        if (i != -1) {
            sgVar.mo15905b(i);
        }
        int i2 = this.f56934e;
        if (i2 != -1) {
            sgVar.mo15912d(i2);
        }
        int i3 = this.f56935f;
        if (i3 != -1) {
            sgVar.mo15906b(i3, new abac(this));
        }
        int i4 = this.f56936g;
        if (i4 != -1) {
            sgVar.mo15892a(i4, f56930c);
        }
        return sgVar.mo15904b();
    }

    public final void onStart() {
        super.onStart();
        if (this.f56937h != -1) {
            int b = C1133kh.m17843b(getActivity(), this.f56937h);
            C1350sh shVar = (C1350sh) getDialog();
            shVar.mo15913a(-1).setTextColor(b);
            shVar.mo15913a(-2).setTextColor(b);
        }
    }
}
