package p000;

import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: upv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class upv {

    /* renamed from: a */
    private final upr f48493a;

    /* renamed from: b */
    private final long f48494b;

    /* renamed from: c */
    private final ChangesAvailableOptions f48495c;

    /* renamed from: d */
    private final bnic f48496d;

    /* renamed from: e */
    private final Set f48497e = new HashSet();

    /* renamed from: f */
    private boolean f48498f = true;

    public upv(upr upr, long j, ChangesAvailableOptions changesAvailableOptions, Set set) {
        sdo.m34959a(set);
        this.f48493a = upr;
        this.f48494b = j;
        this.f48495c = changesAvailableOptions;
        this.f48496d = bnic.m109495a((Collection) set);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo27840a() {
        this.f48493a.mo27832a(new ChangesAvailableEvent(this.f48495c));
        this.f48497e.clear();
        if (!this.f48495c.f30774b) {
            this.f48498f = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized boolean mo27843b() {
        return this.f48498f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo27841a(Set set) {
        this.f48497e.addAll(set);
        if (this.f48497e.size() >= this.f48495c.f30773a) {
            mo27840a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo27842a(ujx ujx) {
        if (this.f48498f && !Collections.disjoint(this.f48496d, ujx.mo27574aj()) && ujx.mo27642y() > this.f48494b && this.f48497e.add(ujx.mo27610g()) && this.f48497e.size() >= this.f48495c.f30773a) {
            mo27840a();
            return true;
        }
    }
}
