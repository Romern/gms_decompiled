package p000;

import android.os.Bundle;
import com.google.android.chimera.DialogFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: awzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class awzb extends DialogFragment implements bkfm, bkdg, bkea {

    /* renamed from: a */
    public boolean f95344a = true;

    /* renamed from: b */
    public awib f95345b;

    /* renamed from: c */
    protected final ArrayList f95346c = new ArrayList();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9306a() {
        throw null;
    }

    /* renamed from: b */
    public final boolean mo52806b(List list) {
        return mo52805a(list, false);
    }

    /* renamed from: bT */
    public final boolean mo52807bT() {
        return bkde.m105360m(this.f95346c);
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f95346c;
    }

    /* renamed from: n */
    public final void mo52808n(boolean z) {
        if (this.f95344a != z) {
            this.f95344a = z;
            mo9306a();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("uiEnabled", this.f95344a);
        awib awib = this.f95345b;
        if (awib != null) {
            awib.mo51861a(bundle);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.f95344a = bundle.getBoolean("uiEnabled", true);
            mo9306a();
            awib awib = this.f95345b;
            if (awib != null) {
                awib.mo51871b(bundle);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo52804a(List list) {
        return mo52805a(list, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo52805a(List list, boolean z) {
        return bkde.m105348a(this.f95346c, list, z);
    }
}
