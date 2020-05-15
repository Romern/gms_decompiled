package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: bjsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjsq extends DialogFragment {

    /* renamed from: a */
    public Bundle f123243a;

    /* renamed from: b */
    public Context f123244b;

    /* renamed from: c */
    DialogInterface.OnClickListener f123245c;

    /* renamed from: d */
    private int f123246d;

    /* renamed from: e */
    private ImageView f123247e;

    public bjsq() {
        new bjsp();
        new bjsn(this);
    }

    /* renamed from: a */
    private final void m104502a(int i) {
        TypedValue typedValue = new TypedValue();
        this.f123244b.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = getActivity().obtainStyledAttributes(typedValue.data, new int[]{i});
        obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        bjsr bjsr = (bjsr) getFragmentManager().findFragmentByTag("FingerprintHelperFragment");
        if (bjsr != null) {
            bjsr.mo65505a(1);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123244b = getContext();
        int i = Build.VERSION.SDK_INT;
        m104502a(16844099);
        m104502a(16842808);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (bundle != null && this.f123243a == null) {
            this.f123243a = bundle.getBundle("SavedBundle");
        }
        C1349sg sgVar = new C1349sg(getContext());
        sgVar.mo15908b(this.f123243a.getCharSequence("title"));
        View inflate = LayoutInflater.from(sgVar.mo15890a()).inflate((int) C0126R.C0128layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.fingerprint_subtitle);
        TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.fingerprint_description);
        CharSequence charSequence = this.f123243a.getCharSequence("subtitle");
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
        CharSequence charSequence2 = this.f123243a.getCharSequence("description");
        if (TextUtils.isEmpty(charSequence2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(charSequence2);
        }
        this.f123247e = (ImageView) inflate.findViewById(C0126R.C0129id.fingerprint_icon);
        TextView textView3 = (TextView) inflate.findViewById(C0126R.C0129id.fingerprint_error);
        sgVar.mo15901a(mo9306a() ? getString(C0126R.string.confirm_device_credential_password) : this.f123243a.getCharSequence("negative_text"), new bjso(this));
        sgVar.mo15907b(inflate);
        C1350sh b = sgVar.mo15904b();
        b.setCanceledOnTouchOutside(false);
        return b;
    }

    public final void onPause() {
        super.onPause();
        throw null;
    }

    public final void onResume() {
        Drawable drawable;
        super.onResume();
        this.f123246d = 0;
        if (this.f123247e != null) {
            int i = Build.VERSION.SDK_INT;
            if (this.f123246d == 0) {
                drawable = this.f123244b.getDrawable(C0126R.C0127drawable.fingerprint_dialog_fp_to_error);
            } else {
                drawable = null;
            }
            if (drawable != null) {
                if (drawable instanceof AnimatedVectorDrawable) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                }
                this.f123247e.setImageDrawable(drawable);
                this.f123246d = 1;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("SavedBundle", this.f123243a);
    }

    /* renamed from: a */
    public final boolean mo9306a() {
        return this.f123243a.getBoolean("allow_device_credential");
    }
}
