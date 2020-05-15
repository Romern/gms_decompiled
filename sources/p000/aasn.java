package p000;

import android.util.Log;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: aasn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasn implements View.OnClickListener {

    /* renamed from: a */
    private final HelpChimeraActivity f56516a;

    /* renamed from: b */
    private final aasm f56517b;

    /* renamed from: c */
    private final int f56518c;

    /* renamed from: d */
    private final String f56519d;

    /* renamed from: e */
    private final int f56520e;

    public aasn(HelpChimeraActivity helpChimeraActivity, aasm aasm, int i, int i2, String str) {
        this.f56516a = helpChimeraActivity;
        this.f56517b = aasm;
        this.f56518c = i;
        this.f56520e = i2;
        this.f56519d = str == null ? "" : str;
    }

    /* renamed from: c */
    private final aasg m46929c() {
        return aasg.m46857a(this.f56517b, this.f56520e, this.f56518c, this.f56519d, -1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31743a() {
        abgx.m47705a(this.f56516a, this.f56517b, this.f56520e, this.f56518c, this.f56519d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo31744b() {
        abcx.m47473a(this.f56516a, this.f56520e, this.f56517b.f56497g, this.f56518c, this.f56519d);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(aasm, aasg, boolean):void
     arg types: [?[OBJECT, ARRAY], aasg, int]
     candidates:
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(abey, java.lang.CharSequence, wzh):void
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(aasm, aasg, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(aasm, aasg, boolean):void
     arg types: [aasm, aasg, int]
     candidates:
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(abey, java.lang.CharSequence, wzh):void
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(aasm, aasg, boolean):void */
    public void onClick(View view) {
        if (!cego.f182642a.mo6606a().mo79108a()) {
            this.f56516a.mo43351m();
        }
        if (!cegl.f182639a.mo6606a().mo79106a()) {
            this.f56516a.findViewById(C0126R.C0129id.gh_search_box).setVisibility(8);
        }
        if (aaya.m47228a(cegr.m136796b())) {
            this.f56516a.f78973t.f111270i.clearFocus();
            aatj.m46979a(view);
        }
        if (this.f56517b.mo31720e() || this.f56517b.mo31728k() || this.f56517b.mo31734q()) {
            mo31744b();
            mo31743a();
        } else if (this.f56517b.mo31722f()) {
            mo31744b();
            mo31743a();
        } else if (this.f56517b.mo31727j()) {
            mo31744b();
            this.f56516a.mo43333a(this.f56517b, m46929c(), false);
        } else if (this.f56517b.mo31729l()) {
            mo31744b();
            this.f56516a.mo43333a(this.f56517b, m46929c(), false);
        } else if (this.f56517b.mo31724h()) {
            mo31744b();
            this.f56516a.mo43333a((aasm) null, m46929c(), false);
        } else if (this.f56517b.mo31730m()) {
            aaso.m46934a(new aass(this.f56516a), this.f56517b, this.f56518c, this.f56520e, this.f56519d);
        } else if (this.f56517b.mo31731n()) {
            mo31744b();
            aaso.m46935a(new aazy(), this.f56517b, this.f56516a);
        } else if (!this.f56517b.mo31732o()) {
            String valueOf = String.valueOf(this.f56517b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66);
            sb.append("Unsupported help content clicked on; doing nothing. HelpResponse: ");
            sb.append(valueOf);
            Log.w("gH_HelpRespClkListener", sb.toString());
        } else {
            mo31744b();
            aaso.m46933a(this.f56517b, this.f56516a);
        }
    }
}
