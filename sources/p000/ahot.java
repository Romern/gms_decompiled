package p000;

import android.os.SystemClock;

/* renamed from: ahot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahot {

    /* renamed from: a */
    private Object f67660a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo36911a(Object obj) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long ak = cfnv.f184625a.mo6606a().mo81778ak();
        while (true) {
            Object obj2 = this.f67660a;
            if (obj2 != obj) {
                if (obj2 != null) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (elapsedRealtime2 >= ak) {
                        this.f67660a = obj;
                        ((bnsl) ahkm.f67363a.mo68390d()).mo68422a("MediumsOwnership forcibly acquired by %s(%d)", (Object) obj.getClass().getSimpleName(), obj.hashCode());
                        break;
                    }
                    wait(ak - elapsedRealtime2);
                } else {
                    this.f67660a = obj;
                    ((bnsl) ahkm.f67363a.mo68390d()).mo68422a("MediumsOwnership owner set to %s(%d)", (Object) obj.getClass().getSimpleName(), obj.hashCode());
                    return;
                }
            } else {
                break;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo36912b(Object obj) {
        if (this.f67660a == obj) {
            this.f67660a = null;
            notifyAll();
        }
    }
}
