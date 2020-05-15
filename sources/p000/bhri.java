package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.places.Subscription;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: bhri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhri extends squ implements ssn, bhrd {

    /* renamed from: j */
    private static final String[] f119378j = {"android:monitor_location"};

    /* renamed from: a */
    public final Handler f119379a;

    /* renamed from: b */
    public final bhpw f119380b;

    /* renamed from: g */
    public final bhrb f119381g;

    /* renamed from: h */
    public final bhrc f119382h;

    /* renamed from: i */
    public final List f119383i = new ArrayList();

    /* renamed from: k */
    private final Context f119384k;

    /* renamed from: l */
    private final Set f119385l = new HashSet();

    public bhri(Context context, Handler handler, bhpw bhpw, bhrb bhrb) {
        super(f119378j, context, handler);
        this.f119384k = context;
        this.f119379a = handler;
        this.f119380b = bhpw;
        this.f119381g = bhrb;
        this.f119382h = new bhrc(context, "com.google.android.location.places.service.PlaceDetectionAsyncService");
    }

    /* renamed from: a */
    public final Future mo64183a(Subscription subscription) {
        FutureTask futureTask = new FutureTask(new bhrh(this, subscription));
        this.f119379a.post(new bhrf(this, futureTask));
        return futureTask;
    }

    /* renamed from: b */
    public final void mo64185b(Subscription subscription) {
        Context context = this.f119384k;
        bhpw bhpw = this.f119380b;
        if (subscription.f151357f == null) {
            subscription.f151357f = subscription.mo70889a(context, this, bhpw);
        }
        mo25985a(subscription, subscription.f151357f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9714a(int i) {
        ArrayList arrayList = new ArrayList();
        HashSet<bhqe> hashSet = new HashSet(this.f119385l);
        for (bhqe bhqe : mo25992c()) {
            if (!this.f119385l.contains(bhqe)) {
                arrayList.add(bhqe);
            }
            hashSet.remove(bhqe);
        }
        for (bhqe bhqe2 : hashSet) {
            bhqe2.mo64159c();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bhqe) arrayList.get(i2)).mo64158b();
        }
        this.f119385l.clear();
        this.f119385l.addAll(mo25992c());
        this.f119380b.f119280b.mo64538a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo9718b(sqt sqt) {
        bhqe bhqe = (bhqe) sqt;
    }

    /* renamed from: b */
    public final boolean mo26048b(String str) {
        for (Subscription subscription : this.f119382h.mo64177a()) {
            if (str.equals(subscription.mo70891a())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo64184a(Runnable runnable) {
        if (!this.f119382h.f119368b) {
            this.f119383i.add(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    public final void mo26047a(String str) {
        ArrayList arrayList = new ArrayList();
        for (Subscription subscription : this.f119382h.mo64177a()) {
            if (str.equals(subscription.mo70891a())) {
                arrayList.add(subscription);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mo64183a((Subscription) arrayList.get(i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9717a(sqt sqt) {
        bhqe bhqe = (bhqe) sqt;
    }
}
