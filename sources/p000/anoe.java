package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;
import java.util.Arrays;

/* renamed from: anoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anoe extends Fragment implements rjz, rka {

    /* renamed from: a */
    public rkb f77275a;

    /* renamed from: b */
    public boolean f77276b;

    /* renamed from: c */
    public boolean f77277c;

    /* renamed from: d */
    public alle f77278d;

    /* renamed from: e */
    private String f77279e;

    /* renamed from: f */
    private String f77280f;

    /* renamed from: g */
    private String f77281g;

    /* renamed from: h */
    private String f77282h;

    /* renamed from: i */
    private String f77283i;

    /* renamed from: a */
    public final void mo42035a() {
        this.f77277c = true;
        rjo rjo = allr.f73629a;
        amcp.m62616a(this.f77275a, this.f77279e, this.f77280f, this.f77281g, Arrays.asList(this.f77282h), null, anlt.f77089a).mo9458a(new anod(this));
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        if (this.f77276b) {
            this.f77276b = false;
            mo42035a();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof anoc)) {
            throw new IllegalStateException("Activity must implement AddToCircleFragmentHost.");
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        this.f77279e = arguments.getString("accountName");
        this.f77280f = arguments.getString("plusPageId");
        this.f77281g = arguments.getString("updatePersonId");
        this.f77282h = arguments.getString("circleIdToAdd");
        this.f77283i = arguments.getString("clientApplicationId");
        rjy rjy = new rjy(getActivity(), this, this);
        rjo rjo = allr.f73629a;
        allp allp = new allp();
        if (!TextUtils.isEmpty(this.f77283i)) {
            i = Integer.parseInt(this.f77283i);
        } else {
            i = 0;
        }
        allp.f73626a = i;
        rjy.mo24780a(rjo, allp.mo40491a());
        rkb b = rjy.mo24784b();
        this.f77275a = b;
        b.mo24801e();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f77275a.mo24803g();
    }

    /* renamed from: b */
    public final void mo42036b() {
        anoc anoc = (anoc) getActivity();
        if (anoc != null) {
            anoc.mo42034a(this.f77278d);
        }
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        if (this.f77276b || this.f77277c) {
            this.f77276b = true;
            this.f77275a.mo24801e();
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f77278d = null;
        mo42036b();
    }
}
