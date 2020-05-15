package p000;

import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: ajar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ajar {

    /* renamed from: a */
    private final Object f70270a = new Object();

    /* renamed from: b */
    private final C1223np f70271b = new C1223np();

    /* renamed from: a */
    public final void mo38404a() {
        synchronized (this.f70270a) {
            this.f70271b.clear();
        }
    }

    /* renamed from: a */
    public void mo38393a(Object obj) {
    }

    /* renamed from: b */
    public final Collection mo38406b() {
        ArrayList arrayList;
        synchronized (this.f70270a) {
            arrayList = new ArrayList(this.f70271b.f26809h);
            for (ajaq ajaq : this.f70271b.values()) {
                arrayList.add(ajaq.f70267a);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final IInterface mo38408c(Object obj) {
        synchronized (this.f70270a) {
            ajaq ajaq = (ajaq) this.f70271b.get(obj);
            if (ajaq == null) {
                return null;
            }
            IInterface iInterface = ajaq.f70267a;
            return iInterface;
        }
    }

    /* renamed from: a */
    public final void mo38405a(Object obj, IInterface iInterface) {
        synchronized (this.f70270a) {
            ajaq ajaq = new ajaq(this, obj, iInterface);
            try {
                iInterface.asBinder().linkToDeath(ajaq, 0);
                this.f70271b.put(obj, ajaq);
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: b */
    public final void mo38407b(Object obj) {
        boolean z;
        synchronized (this.f70270a) {
            ajaq ajaq = (ajaq) this.f70271b.remove(obj);
            z = false;
            if (ajaq != null) {
                ajaq.f70267a.asBinder().unlinkToDeath(ajaq, 0);
                z = true;
            }
        }
        if (z) {
            mo38393a(obj);
        }
    }
}
