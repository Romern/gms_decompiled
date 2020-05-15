package p000;

import java.util.concurrent.Executor;

/* renamed from: uhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uhp {

    /* renamed from: a */
    public final uht f47652a;

    /* renamed from: b */
    public boolean f47653b = false;

    /* renamed from: c */
    private final uhj f47654c;

    public uhp(uhj uhj, Executor executor) {
        this.f47654c = uhj;
        this.f47652a = new uht(uhj, this, executor);
        this.f47653b = true;
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
    /* renamed from: a */
    public final void mo27485a() {
        sdo.m34971a(this.f47653b, (Object) "Cannot set successful an already ended Transaction");
        this.f47652a.mo27495d();
        uhj uhj = this.f47654c;
        sdo.m34970a(((Long) uhj.f47639d.get()).longValue() == 1);
        uhj.mo27473a(this);
        uhj.mo27472a().setTransactionSuccessful();
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
    public final void mo27486b() {
        boolean z;
        sdo.m34971a(this.f47653b, (Object) "Cannot end an already ended Transaction");
        uhj uhj = this.f47654c;
        if (((Long) uhj.f47639d.get()).longValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        uhj.mo27473a(this);
        uhj.f47641f.remove();
        uhj.mo27479e();
        this.f47653b = false;
    }
}
