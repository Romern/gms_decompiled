package p000;

import android.widget.SectionIndexer;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: fxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fxg extends abh implements SectionIndexer {

    /* renamed from: a */
    protected boolean f17497a;

    /* renamed from: d */
    protected int f17498d;

    /* renamed from: a */
    public abstract void mo11455a(ContactPerson contactPerson);

    /* renamed from: a */
    public abstract void mo11456a(ContactPerson contactPerson, int i);

    /* renamed from: a */
    public void mo11457a(CharSequence charSequence) {
    }

    /* renamed from: b */
    public abstract void mo11458b(ContactPerson contactPerson);

    /* renamed from: b */
    public void mo11459b(CharSequence charSequence) {
    }

    /* renamed from: b */
    public void mo11460b(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11461c() {
    }

    /* renamed from: c */
    public void mo11462c(CharSequence charSequence) {
    }

    /* renamed from: c */
    public abstract void mo11463c(boolean z);

    /* renamed from: d */
    public void mo11464d() {
    }

    /* renamed from: d */
    public void mo11465d(boolean z) {
    }

    /* renamed from: e */
    public CharSequence mo11466e() {
        return null;
    }

    /* renamed from: e */
    public void mo11467e(boolean z) {
    }

    /* renamed from: f */
    public abstract int mo11468f();

    /* renamed from: f */
    public final void mo11469f(int i) {
        this.f17498d = i;
        mo11461c();
    }

    /* renamed from: g */
    public abstract int mo11471g(int i);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo11472g(boolean z);

    /* renamed from: f */
    public final void mo11470f(boolean z) {
        if (z != this.f17497a) {
            this.f17497a = z;
            mo11472g(z);
        }
    }
}
