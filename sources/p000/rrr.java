package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;

/* renamed from: rrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rrr {

    /* renamed from: a */
    private SetupWizardLayout f43557a;

    /* renamed from: b */
    private GlifLayout f43558b;

    public rrr(GlifLayout glifLayout) {
        this.f43558b = glifLayout;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public static rrr m34310a(Context context, int i) {
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null, false);
        if (inflate instanceof SetupWizardLayout) {
            return new rrr((SetupWizardLayout) inflate);
        }
        if (inflate instanceof GlifLayout) {
            return new rrr((GlifLayout) inflate);
        }
        throw new ClassCastException("SetupWizardLayoutHelper must contain either SetupWizardLayout or GlifLayout");
    }

    /* renamed from: a */
    public final ViewGroup mo25046a() {
        GlifLayout glifLayout = this.f43558b;
        return glifLayout == null ? this.f43557a : glifLayout;
    }

    /* renamed from: b */
    public final void mo25049b() {
        SetupWizardLayout setupWizardLayout = this.f43557a;
        if (setupWizardLayout != null) {
            setupWizardLayout.mo71377c().f151533a.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo25051c(boolean z) {
        int i;
        SetupWizardLayout setupWizardLayout = this.f43557a;
        if (setupWizardLayout != null) {
            Button button = setupWizardLayout.mo71377c().f151534b;
            if (!z) {
                i = 8;
            } else {
                i = 0;
            }
            button.setVisibility(i);
        }
    }

    public rrr(SetupWizardLayout setupWizardLayout) {
        this.f43557a = setupWizardLayout;
    }

    /* renamed from: b */
    public final void mo25050b(boolean z) {
        SetupWizardLayout setupWizardLayout = this.f43557a;
        if (setupWizardLayout != null) {
            setupWizardLayout.mo71377c().f151533a.setEnabled(z);
        }
    }

    /* renamed from: a */
    public final void mo25047a(CharSequence charSequence) {
        GlifLayout glifLayout = this.f43558b;
        if (glifLayout == null) {
            this.f43557a.mo71375a(charSequence);
        } else {
            glifLayout.mo71363a(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo25048a(boolean z) {
        GlifLayout glifLayout = this.f43558b;
        if (glifLayout == null) {
            this.f43557a.mo71376b(z);
        } else {
            glifLayout.mo71364b(z);
        }
    }
}
