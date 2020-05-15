package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: te */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1374te extends Dialog implements C1352sj {

    /* renamed from: a */
    private C1353sk f27123a;

    /* renamed from: b */
    private final C1257ow f27124b = new C1373td(this);

    public C1374te(Context context, int i) {
        super(context, m20346a(context, i));
        C1353sk b = mo16005b();
        b.mo15934a(m20346a(context, i));
        b.mo15952k();
    }

    /* renamed from: a */
    private static int m20346a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0126R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo16005b().mo15941b(view, layoutParams);
    }

    /* renamed from: b */
    public final C1353sk mo16005b() {
        if (this.f27123a == null) {
            this.f27123a = C1353sk.m20234a(this, this);
        }
        return this.f27123a;
    }

    /* renamed from: bv */
    public final C1414ur mo8633bv() {
        return null;
    }

    /* renamed from: c */
    public final void mo16006c() {
        mo16005b().mo15945d(1);
    }

    public final void dismiss() {
        super.dismiss();
        mo16005b().mo15948g();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return C1258ox.m19818a(this.f27124b, keyEvent);
    }

    public final View findViewById(int i) {
        return mo16005b().mo15940b(i);
    }

    public final void invalidateOptionsMenu() {
        mo16005b().mo15947f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo16005b().mo15949h();
        super.onCreate(bundle);
        mo16005b().mo15952k();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        mo16005b().mo15944d();
    }

    public void setContentView(int i) {
        mo16005b().mo15943c(i);
    }

    public final void setTitle(int i) {
        super.setTitle(i);
        mo16005b().mo15938a(getContext().getString(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo16003a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setContentView(View view) {
        mo16005b().mo15936a(view);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo16005b().mo15938a(charSequence);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo16005b().mo15937a(view, layoutParams);
    }
}
