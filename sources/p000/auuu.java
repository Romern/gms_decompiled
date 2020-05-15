package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: auuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auuu implements auut {

    /* renamed from: a */
    private final auus f92559a;

    /* renamed from: b */
    private final Context f92560b;

    public auuu(Context context, auus auus) {
        this.f92559a = auus;
        this.f92560b = context;
    }

    /* renamed from: a */
    public final View mo50951a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate((int) C0126R.xml.onbody_focused_onbody_promotion_intro, (ViewGroup) null);
        if (!this.f92559a.mo50950g()) {
            ((TextView) inflate.findViewById(C0126R.C0129id.onbody_promotion_desc_screenlock_hint)).setVisibility(0);
        }
        return inflate;
    }

    /* renamed from: b */
    public final void mo50954b() {
        this.f92559a.mo50945b();
    }

    /* renamed from: c */
    public final void mo50955c() {
        this.f92559a.mo50946c();
    }

    /* renamed from: d */
    public final void mo50956d() {
        this.f92559a.mo50946c();
    }

    /* renamed from: e */
    public final void mo50957e() {
    }

    /* renamed from: f */
    public final String mo50958f() {
        return this.f92560b.getString(C0126R.string.auth_trust_agent_pref_on_body_detection_title);
    }

    /* renamed from: g */
    public final String mo50959g() {
        return this.f92560b.getString(C0126R.string.trust_agent_smartlock_disabled_title);
    }

    /* renamed from: h */
    public final String mo50960h() {
        return this.f92560b.getString(C0126R.string.trust_agent_smartlock_disabled_detail);
    }

    /* renamed from: i */
    public final String mo50961i() {
        return this.f92560b.getString(C0126R.string.onbody_promotion_other_trustlets);
    }

    /* renamed from: a */
    public final void mo50952a() {
        this.f92559a.mo50944a();
    }

    /* renamed from: a */
    public final void mo50953a(boolean z) {
        if (z) {
            this.f92559a.mo50947d();
            this.f92559a.mo50949f();
            return;
        }
        this.f92559a.mo50948e();
    }
}
