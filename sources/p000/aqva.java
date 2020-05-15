package p000;

import android.content.Context;
import android.support.p002v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aqva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aqva implements adx {

    /* renamed from: a */
    protected final Menu f86880a;

    /* renamed from: b */
    protected final Context f86881b;

    /* renamed from: c */
    public boolean f86882c;

    public aqva(Context context, Toolbar toolbar) {
        this.f86881b = context;
        toolbar.f1351q = this;
        this.f86880a = toolbar.mo1700j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48176a();

    /* renamed from: a */
    public final boolean mo477a(MenuItem menuItem) {
        int i = ((C1446vw) menuItem).f27454a;
        if (i == C0126R.C0129id.menu_star_contact) {
            if (this.f86882c) {
                mo48177b();
                return false;
            }
            mo48176a();
            return false;
        } else if (i == C0126R.C0129id.menu_add_contact) {
            mo48178c();
            return false;
        } else if (i == C0126R.C0129id.edit_contact) {
            mo48179d();
            return false;
        } else if (i == C0126R.C0129id.edit_profile) {
            mo48180e();
            return false;
        } else if (i != C0126R.C0129id.send_feedback) {
            return false;
        } else {
            mo48181f();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo48177b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo48178c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo48179d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo48180e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo48181f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo48182g() {
        this.f86880a.findItem(C0126R.C0129id.menu_star_contact).setVisible(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo48183h() {
        this.f86880a.findItem(C0126R.C0129id.menu_add_contact).setVisible(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo48184i() {
        this.f86880a.findItem(C0126R.C0129id.menu_add_contact).setVisible(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo48185j() {
        this.f86880a.findItem(C0126R.C0129id.edit_contact).setVisible(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo48186k() {
        this.f86880a.findItem(C0126R.C0129id.edit_contact).setVisible(false);
    }
}
