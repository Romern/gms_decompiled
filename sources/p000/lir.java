package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: lir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class lir extends deu {

    /* renamed from: b */
    private static final srn f26165b = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: c */
    private Intent f26166c;

    /* renamed from: d */
    lim f26167d;

    /* renamed from: e */
    private Bundle f26168e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract lim mo7996a(Intent intent, Bundle bundle);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15178a(int i, Intent intent) {
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        super.finish();
    }

    @Deprecated
    public final void finish() {
        this.f26167d.mo15165a(0);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f26167d.mo15166a(i, i2, intent);
    }

    public final void onBackPressed() {
        this.f26167d.mo15176g();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.f26166c = (Intent) bundle.getParcelable("com.google.android.gms.autofill.activity_intent");
            this.f26168e = bundle.getBundle("com.google.android.gms.autofill.controller_state");
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                this.f26166c = intent;
                this.f26168e = intent.getExtras();
                intent.replaceExtras((Bundle) null);
            }
        }
        if (this.f26166c != null) {
            if (this.f26168e == null) {
                this.f26168e = new Bundle();
            }
            lim a = mo7996a(this.f26166c, this.f26168e);
            if (a != null) {
                this.f26167d = a;
                super.onCreate(bundle);
                this.f26167d.mo15164a();
            }
        }
        this.f26167d = new lim(this, this.f26168e, bngx.m109376e());
        ((bnsl) f26165b.mo68387b()).mo68405a("Finishing because ActivityController is not found");
        mo15178a(0, (Intent) null);
        super.onCreate(bundle);
        this.f26167d.mo15164a();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        return this.f26167d.mo15169a(menu);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        lim lim = this.f26167d;
        bnre i = lim.f26161c.listIterator();
        while (i.hasNext()) {
            ((lil) i.next()).mo14925d();
        }
        lim.mo15175f();
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f26167d.mo15170a(menuItem);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.f26167d.mo15173d();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f26167d.mo15172c();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bnre i = this.f26167d.f26161c.listIterator();
        while (i.hasNext()) {
            ((lil) i.next()).mo14923b();
        }
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("com.google.android.gms.autofill.activity_intent", this.f26166c);
        bundle.putBundle("com.google.android.gms.autofill.controller_state", this.f26168e);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        lim lim = this.f26167d;
        lim.mo15171b();
        bnre i = lim.f26161c.listIterator();
        while (i.hasNext()) {
            ((lil) i.next()).mo14921a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        lim lim = this.f26167d;
        bnre i = lim.f26161c.listIterator();
        while (i.hasNext()) {
            ((lil) i.next()).mo14924c();
        }
        lim.mo15174e();
        super.onStop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo15179a(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo15180a(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }
}
