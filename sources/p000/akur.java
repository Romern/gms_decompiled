package p000;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Stack;

/* renamed from: akur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akur {

    /* renamed from: a */
    private final ArrayList f72908a = new ArrayList(5);

    /* renamed from: b */
    private final Stack f72909b = new Stack();

    /* renamed from: c */
    private final cijl f72910c;

    /* renamed from: d */
    private boolean f72911d = false;

    /* renamed from: a */
    public final synchronized void mo39874a() {
        this.f72911d = true;
        this.f72908a.clear();
        this.f72909b.clear();
    }

    /* renamed from: b */
    public final synchronized void mo39876b() {
        this.f72911d = false;
        this.f72908a.clear();
        this.f72909b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized Object mo39878c() {
        if (this.f72911d) {
            throw new akuq();
        } else if (!this.f72909b.isEmpty()) {
            return this.f72909b.pop();
        } else if (this.f72908a.size() < 5) {
            Object a = this.f72910c.mo6445a();
            this.f72908a.add(a);
            Object[] objArr = {a, Integer.valueOf(this.f72908a.size())};
            return a;
        } else {
            throw new NoSuchElementException("Pool is exhausted");
        }
    }

    /* renamed from: d */
    public final synchronized akus mo39879d() {
        try {
        } catch (akuq | NoSuchElementException e) {
            return new akus(this, this.f72910c.mo6445a());
        }
        return new akus(this, mo39878c());
    }

    public akur(cijl cijl) {
        this.f72910c = cijl;
    }

    /* renamed from: a */
    public final synchronized boolean mo39875a(Object obj) {
        return this.f72908a.contains(obj);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: b */
    public final synchronized void mo39877b(Object obj) {
        if (mo39875a(obj)) {
            sdo.m34971a(!this.f72911d, (Object) "Object should not be in a *closed* pool");
            if (!this.f72909b.contains(obj)) {
                this.f72909b.add(obj);
            }
        }
    }
}
