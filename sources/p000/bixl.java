package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: bixl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bixl extends TemplateLayout {

    /* renamed from: a */
    private boolean f122202a;

    /* renamed from: b */
    private Activity f122203b;

    public bixl(Context context) {
        this(context, 0, 0);
    }

    /* renamed from: a */
    private static Activity m102941a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m102941a(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Cannot find instance of Activity in parent tree");
    }

    /* renamed from: b */
    private void m102942b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bixm.f122206c, i, 0);
        boolean z = true;
        boolean z2 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        int i2 = Build.VERSION.SDK_INT;
        if (z2) {
            setSystemUiVisibility(1024);
        }
        mo71343a(biys.class, new biys(this, this.f122203b.getWindow(), attributeSet, i));
        mo71343a(biyt.class, new biyt(this, this.f122203b.getWindow()));
        mo71343a(biyn.class, new biyn(this, attributeSet, i));
        biyt biyt = (biyt) mo71342a(biyt.class);
        int i3 = Build.VERSION.SDK_INT;
        TypedArray obtainStyledAttributes2 = biyt.f122344a.getContext().obtainStyledAttributes(attributeSet, bixm.f122208e, i, 0);
        int color = obtainStyledAttributes2.getColor(1, 0);
        biyt.f122347d = color;
        int i4 = Build.VERSION.SDK_INT;
        if (biyt.f122345b != null) {
            if (biyt.f122346c) {
                Context context = biyt.f122344a.getContext();
                color = biyk.m102977a(context).mo64868a(context, biyj.CONFIG_NAVIGATION_BAR_BG_COLOR);
            }
            biyt.f122345b.setNavigationBarColor(color);
        }
        int i5 = Build.VERSION.SDK_INT;
        Window window = biyt.f122345b;
        if (!(window == null || (window.getDecorView().getSystemUiVisibility() & 16) == 16)) {
            z = false;
        }
        boolean z3 = obtainStyledAttributes2.getBoolean(0, z);
        int i6 = Build.VERSION.SDK_INT;
        if (biyt.f122345b != null) {
            if (biyt.f122346c) {
                Context context2 = biyt.f122344a.getContext();
                z3 = biyk.m102977a(context2).mo64872d(context2, biyj.CONFIG_LIGHT_NAVIGATION_BAR);
            }
            if (!z3) {
                biyt.f122345b.getDecorView().setSystemUiVisibility(biyt.f122345b.getDecorView().getSystemUiVisibility() & -17);
            } else {
                biyt.f122345b.getDecorView().setSystemUiVisibility(biyt.f122345b.getDecorView().getSystemUiVisibility() | 16);
            }
        }
        obtainStyledAttributes2.recycle();
        int i7 = Build.VERSION.SDK_INT;
        this.f122203b.getWindow().addFlags(Integer.MIN_VALUE);
        this.f122203b.getWindow().clearFlags(67108864);
        this.f122203b.getWindow().clearFlags(134217728);
    }

    /* renamed from: c */
    public final boolean mo64840c() {
        if (this.f122202a) {
            int i = Build.VERSION.SDK_INT;
            Bundle bundle = biyk.m102977a(getContext()).f122302a;
            if (bundle == null || bundle.isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: biyi.a(boolean, boolean):void
     arg types: [boolean, int]
     candidates:
      biyi.a(java.lang.String, boolean):java.lang.String
      biyi.a(boolean, boolean):void */
    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bixt.m102950a(this.f122203b);
        biyn biyn = (biyn) mo71342a(biyn.class);
        biyn.f122321m.mo64866a(biyn.mo64877b(), false);
        biyn.f122321m.mo64867b(biyn.mo64881f(), false);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        if (bizc.m103026b(this.f122203b.getIntent())) {
            biyn biyn = (biyn) mo71342a(biyn.class);
            biyi biyi = biyn.f122321m;
            boolean b = biyn.mo64877b();
            boolean f = biyn.mo64881f();
            biyi.f122257a = biyi.m102972a(biyi.f122257a, b);
            biyi.f122258b = biyi.m102972a(biyi.f122258b, f);
            biyp biyp = biyn.f122314f;
            biyp biyp2 = biyn.f122315g;
            PersistableBundle a = biyp != null ? biyp.mo64884a("PrimaryFooterButton") : PersistableBundle.EMPTY;
            PersistableBundle a2 = biyp2 != null ? biyp2.mo64884a("SecondaryFooterButton") : PersistableBundle.EMPTY;
            biyi biyi2 = biyn.f122321m;
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("PrimaryButtonVisibility", biyi2.f122257a);
            persistableBundle.putString("SecondaryButtonVisibility", biyi2.f122258b);
            PersistableBundle[] persistableBundleArr = {a2};
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(persistableBundle, a));
            Collections.addAll(arrayList, persistableBundleArr);
            PersistableBundle persistableBundle2 = new PersistableBundle();
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                PersistableBundle persistableBundle3 = (PersistableBundle) arrayList.get(i3);
                for (String str : persistableBundle3.keySet()) {
                    bixv.m102958a(!persistableBundle2.containsKey(str), String.format("Found duplicate key [%s] while attempting to merge bundles.", str));
                }
                persistableBundle2.putAll(persistableBundle3);
            }
            biyh.m102971a(getContext(), CustomEvent.m117807a(MetricKey.m117809a("SetupCompatMetrics", this.f122203b), persistableBundle2));
        }
    }

    public bixl(Context context, int i) {
        this(context, i, 0);
    }

    public bixl(Context context, int i, int i2) {
        super(context, i, i2);
        m102942b(null, C0126R.attr.sucLayoutTheme);
    }

    public bixl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m102942b(attributeSet, C0126R.attr.sucLayoutTheme);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo64837a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = C0126R.C0128layout.partner_customization_layout;
        }
        return mo71341a(layoutInflater, 0, i);
    }

    public bixl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m102942b(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ViewGroup mo64838a(int i) {
        if (i == 0) {
            i = C0126R.C0129id.suc_layout_content;
        }
        return super.mo64838a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64839a(AttributeSet attributeSet, int i) {
        boolean z = true;
        this.f122202a = true;
        Activity a = m102941a(getContext());
        this.f122203b = a;
        boolean b = bizc.m103026b(a.getIntent());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bixm.f122206c, i, 0);
        if (!obtainStyledAttributes.hasValue(1)) {
            String valueOf = String.valueOf(this.f122203b.getComponentName());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Attribute sucUsePartnerResource not found in ");
            sb.append(valueOf);
            Log.e("PartnerCustomizedLayout", sb.toString());
        }
        if (!b && !obtainStyledAttributes.getBoolean(1, true)) {
            z = false;
        }
        this.f122202a = z;
        obtainStyledAttributes.recycle();
    }
}
