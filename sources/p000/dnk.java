package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;

/* renamed from: dnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dnk extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private DialogPreference f13628a;

    /* renamed from: b */
    public int f13629b;

    /* renamed from: c */
    private CharSequence f13630c;

    /* renamed from: d */
    private CharSequence f13631d;

    /* renamed from: e */
    private CharSequence f13632e;

    /* renamed from: f */
    private CharSequence f13633f;

    /* renamed from: g */
    private int f13634g;

    /* renamed from: h */
    private BitmapDrawable f13635h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9304a(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f13633f;
            int i = 0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else if (findViewById instanceof TextView) {
                ((TextView) findViewById).setText(charSequence);
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9308a(C1349sg sgVar) {
    }

    /* renamed from: a */
    public abstract void mo9305a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9306a() {
        return false;
    }

    /* renamed from: b */
    public final DialogPreference mo9309b() {
        if (this.f13628a == null) {
            this.f13628a = (DialogPreference) ((ano) getTargetFragment()).mo2204a(getArguments().getString("key"));
        }
        return this.f13628a;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f13629b = i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof ano) {
            ano ano = (ano) targetFragment;
            String string = getArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) ano.mo2204a(string);
                this.f13628a = dialogPreference;
                this.f13630c = dialogPreference.f1551a;
                this.f13631d = dialogPreference.f1554d;
                this.f13632e = dialogPreference.f1555e;
                this.f13633f = dialogPreference.f1552b;
                this.f13634g = dialogPreference.f1556f;
                Drawable drawable = dialogPreference.f1553c;
                if (drawable == null || (drawable instanceof BitmapDrawable)) {
                    this.f13635h = (BitmapDrawable) drawable;
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                this.f13635h = new BitmapDrawable(getResources(), createBitmap);
                return;
            }
            this.f13630c = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f13631d = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f13632e = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f13633f = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f13634g = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f13635h = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        this.f13629b = -2;
        C1349sg sgVar = new C1349sg(activity);
        sgVar.mo15908b(this.f13630c);
        sgVar.mo15896a(this.f13635h);
        sgVar.mo15909b(this.f13631d, this);
        sgVar.mo15901a(this.f13632e, this);
        int i = this.f13634g;
        View view = null;
        if (i != 0) {
            view = LayoutInflater.from(activity).inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            mo9304a(view);
            sgVar.mo15907b(view);
        } else {
            sgVar.mo15900a(this.f13633f);
        }
        mo9308a(sgVar);
        C1350sh b = sgVar.mo15904b();
        if (mo9306a()) {
            b.getWindow().setSoftInputMode(5);
        }
        return b;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo9305a(this.f13629b == -1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f13630c);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f13631d);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f13632e);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f13633f);
        bundle.putInt("PreferenceDialogFragment.layout", this.f13634g);
        BitmapDrawable bitmapDrawable = this.f13635h;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
