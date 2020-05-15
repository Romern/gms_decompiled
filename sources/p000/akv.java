package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: akv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class akv extends aky {

    /* renamed from: a */
    public final Object f796a = new Object();

    /* renamed from: b */
    Executor f797b;

    /* renamed from: c */
    aku f798c;

    /* renamed from: d */
    Collection f799d;

    /* renamed from: a */
    public String mo929a() {
        throw null;
    }

    /* renamed from: a */
    public abstract void mo930a(String str);

    /* renamed from: a */
    public abstract void mo931a(List list);

    /* renamed from: b */
    public String mo933b() {
        throw null;
    }

    /* renamed from: b */
    public abstract void mo934b(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo932a(Executor executor, aku aku) {
        synchronized (this.f796a) {
            if (executor == null) {
                throw new NullPointerException("Executor shouldn't be null");
            } else if (aku != null) {
                this.f797b = executor;
                this.f798c = aku;
                Collection collection = this.f799d;
                if (collection != null && !collection.isEmpty()) {
                    Collection collection2 = this.f799d;
                    this.f799d = null;
                    this.f797b.execute(new akr(this, aku, collection2));
                }
            } else {
                throw new NullPointerException("Listener shouldn't be null");
            }
        }
    }
}
