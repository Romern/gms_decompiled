package com.google.android.gms.ocr.credit.dynamite;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreditCardOcrFragmentDelegateImpl extends akpi {

    /* renamed from: a */
    private aksx f81309a;

    /* renamed from: b */
    private Context f81310b;

    /* renamed from: a */
    public final void mo39643a() {
        this.f81309a.onStart();
    }

    /* renamed from: b */
    public final vzr mo39648b(vzr vzr, vzr vzr2, Bundle bundle) {
        return vzs.m41642a(this.f81309a.onCreateView((LayoutInflater) this.f81310b.getSystemService("layout_inflater"), (ViewGroup) vzs.m41641a(vzr2), bundle));
    }

    /* renamed from: c */
    public final void mo39650c() {
        this.f81309a.onResume();
    }

    /* renamed from: d */
    public final void mo39652d() {
        this.f81309a.onPause();
    }

    /* renamed from: e */
    public final void mo39653e() {
        this.f81309a.onStop();
    }

    /* renamed from: f */
    public final void mo39654f() {
        this.f81309a.onDestroy();
    }

    /* renamed from: g */
    public final void mo39655g() {
        this.f81309a.onDestroyView();
    }

    /* renamed from: a */
    public final void mo39644a(Bundle bundle) {
        this.f81309a.onCreate(bundle);
    }

    /* renamed from: b */
    public final void mo39649b(Bundle bundle) {
        this.f81309a.onActivityCreated(bundle);
    }

    /* renamed from: c */
    public final void mo39651c(Bundle bundle) {
        this.f81309a.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public final void mo39645a(vzr vzr) {
        this.f81309a.onAttach((Activity) vzs.m41641a(vzr));
    }

    /* renamed from: a */
    public final void mo39646a(vzr vzr, vzr vzr2, Bundle bundle) {
        this.f81309a.onInflate((Activity) vzs.m41641a(vzr), (AttributeSet) vzs.m41641a(vzr2), bundle);
    }

    /* renamed from: a */
    public final void mo39647a(vzr vzr, vzr vzr2, Bundle bundle, akpg akpg) {
        Activity activity = (Activity) vzs.m41641a(vzr);
        rfz.m33557a(activity).mo24605a(activity.getPackageName());
        aksx aksx = new aksx(activity, akpg);
        this.f81309a = aksx;
        aksx.setArguments(bundle);
        new aksj(activity, bundle).mo39806a((aksg) this.f81309a);
        this.f81310b = (Context) vzs.m41641a(vzr2);
    }
}
