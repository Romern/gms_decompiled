package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: ga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1010ga extends C1018gh implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: Y */
    private Handler f17756Y;

    /* renamed from: Z */
    private final Runnable f17757Z = new C1005fw(this);

    /* renamed from: a */
    public final DialogInterface.OnDismissListener f17758a = new C1007fy(this);

    /* renamed from: aa */
    private final DialogInterface.OnCancelListener f17759aa = new C1006fx(this);

    /* renamed from: ab */
    private int f17760ab = 0;

    /* renamed from: ac */
    private int f17761ac = 0;

    /* renamed from: ad */
    private boolean f17762ad = true;

    /* renamed from: ae */
    private int f17763ae = -1;

    /* renamed from: af */
    private boolean f17764af;

    /* renamed from: ag */
    private final C0038ax f17765ag = new C1008fz(this);

    /* renamed from: ah */
    private boolean f17766ah;

    /* renamed from: ai */
    private boolean f17767ai;

    /* renamed from: aj */
    private boolean f17768aj;

    /* renamed from: ak */
    private boolean f17769ak = false;

    /* renamed from: b */
    public boolean f17770b = true;

    /* renamed from: c */
    public Dialog f17771c;

    /* renamed from: a */
    private final void m12841a(boolean z, boolean z2) {
        if (!this.f17767ai) {
            this.f17767ai = true;
            this.f17768aj = false;
            Dialog dialog = this.f17771c;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.f17771c.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f17756Y.getLooper()) {
                        onDismiss(this.f17771c);
                    } else {
                        this.f17756Y.post(this.f17757Z);
                    }
                }
            }
            this.f17766ah = true;
            if (this.f17763ae >= 0) {
                getParentFragmentManager().mo12517a(this.f17763ae, 1);
                this.f17763ae = -1;
                return;
            }
            C1058hr a = getParentFragmentManager().mo12516a();
            a.mo11289c(this);
            if (z) {
                a.mo11295g();
            } else {
                a.mo11294f();
            }
        }
    }

    public void dismiss() {
        m12841a(false, false);
    }

    public void dismissAllowingStateLoss() {
        m12841a(true, false);
    }

    public Dialog getDialog() {
        return this.f17771c;
    }

    public boolean getShowsDialog() {
        return this.f17770b;
    }

    public int getTheme() {
        return this.f17761ac;
    }

    public boolean isCancelable() {
        return this.f17762ad;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().mo2447a(this.f17765ag);
        if (!this.f17768aj) {
            this.f17767ai = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.f17756Y = new Handler();
        if (this.f18164A == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f17770b = z;
        if (bundle != null) {
            this.f17760ab = bundle.getInt("android:style", 0);
            this.f17761ac = bundle.getInt("android:theme", 0);
            this.f17762ad = bundle.getBoolean("android:cancelable", true);
            this.f17770b = bundle.getBoolean("android:showsDialog", this.f17770b);
            this.f17763ae = bundle.getInt("android:backStackId", -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (C1050hj.m14443a(3)) {
            "onCreateDialog called for DialogFragment " + this;
        }
        return new Dialog(requireContext(), getTheme());
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f17771c;
        if (dialog != null) {
            this.f17766ah = true;
            dialog.setOnDismissListener(null);
            this.f17771c.dismiss();
            if (!this.f17767ai) {
                onDismiss(this.f17771c);
            }
            this.f17771c = null;
            this.f17769ak = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.f17768aj && !this.f17767ai) {
            this.f17767ai = true;
        }
        getViewLifecycleOwnerLiveData().mo2449b(this.f17765ag);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f17766ah) {
            if (C1050hj.m14443a(3)) {
                "onDismiss called for DialogFragment " + this;
            }
            m12841a(true, true);
        }
    }

    /* JADX INFO: finally extract failed */
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.f17770b || this.f17764af) {
            if (C1050hj.m14443a(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.f17770b) {
                    "mShowsDialog = false: " + str;
                } else {
                    "mCreatingDialog = true: " + str;
                }
            }
            return onGetLayoutInflater;
        }
        if (!this.f17769ak) {
            try {
                this.f17764af = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.f17771c = onCreateDialog;
                if (this.f17770b) {
                    setupDialog(onCreateDialog, this.f17760ab);
                    C1021gj activity = getActivity();
                    if (activity != null) {
                        this.f17771c.setOwnerActivity(activity);
                    }
                    this.f17771c.setCancelable(this.f17762ad);
                    this.f17771c.setOnCancelListener(this.f17759aa);
                    this.f17771c.setOnDismissListener(this.f17758a);
                    this.f17769ak = true;
                } else {
                    this.f17771c = null;
                }
                this.f17764af = false;
            } catch (Throwable th) {
                this.f17764af = false;
                throw th;
            }
        }
        if (C1050hj.m14443a(2)) {
            "get layout inflater for DialogFragment " + this + " from dialog context";
        }
        Dialog dialog = this.f17771c;
        return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
    }

    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.f17771c;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i = this.f17760ab;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f17761ac;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.f17762ad) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.f17770b) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.f17763ae;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.f17771c;
        if (dialog != null) {
            this.f17766ah = false;
            dialog.show();
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.f17771c;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f17771c != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f17771c.onRestoreInstanceState(bundle2);
        }
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z) {
        this.f17762ad = z;
        Dialog dialog = this.f17771c;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.f17770b = z;
    }

    public void setStyle(int i, int i2) {
        if (C1050hj.m14443a(2)) {
            "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i2;
        }
        this.f17760ab = i;
        if (i == 2 || i == 3) {
            this.f17761ac = 16973913;
        }
        if (i2 != 0) {
            this.f17761ac = i2;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(C1058hr hrVar, String str) {
        this.f17767ai = false;
        this.f17768aj = true;
        hrVar.mo12686a(this, str);
        this.f17766ah = false;
        int f = hrVar.mo11294f();
        this.f17763ae = f;
        return f;
    }

    public void showNow(C1050hj hjVar, String str) {
        this.f17767ai = false;
        this.f17768aj = true;
        C1058hr a = hjVar.mo12516a();
        a.mo12686a(this, str);
        a.mo11296h();
    }

    public void show(C1050hj hjVar, String str) {
        this.f17767ai = false;
        this.f17768aj = true;
        C1058hr a = hjVar.mo12516a();
        a.mo12686a(this, str);
        a.mo11294f();
    }

    /* renamed from: a */
    public final void mo11578a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo11578a(layoutInflater, viewGroup, bundle);
        if (this.f18174K == null && this.f17771c != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f17771c.onRestoreInstanceState(bundle2);
        }
    }
}
