package p000;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: iv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1092iv extends C1087iq {

    /* renamed from: a */
    public final C1091iu f21843a;

    /* renamed from: b */
    private final C0013ak f21844b;

    public C1092iv(C0013ak akVar, C0061bs bsVar) {
        this.f21844b = akVar;
        this.f21843a = (C1091iu) new C0060br(bsVar, C1091iu.f21757a).mo3444a(C1091iu.class);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private final C1140ko m16193a(int i, Bundle bundle, C1085ip ipVar, C1140ko koVar) {
        try {
            this.f21843a.f21759e = true;
            C1140ko a = ipVar.mo8606a(i, bundle);
            if (a != null) {
                if (a.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(a.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + a);
                    }
                }
                C1088ir irVar = new C1088ir(i, bundle, a, koVar);
                if (m16194c(3)) {
                    "  Created new loader " + irVar;
                }
                this.f21843a.f21758d.mo15637a(i, irVar);
                this.f21843a.mo13341a();
                return irVar.mo13289a(this.f21844b, ipVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f21843a.mo13341a();
            throw th;
        }
    }

    /* renamed from: c */
    static boolean m16194c(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    /* renamed from: b */
    public final C1140ko mo13252b(int i) {
        C1091iu iuVar = this.f21843a;
        if (!iuVar.f21759e) {
            C1088ir a = iuVar.mo13340a(i);
            if (a != null) {
                return a.f21593h;
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.f21844b.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.f21844b)));
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: b */
    public final C1140ko mo13253b(int i, Bundle bundle, C1085ip ipVar) {
        C1140ko koVar;
        if (this.f21843a.f21759e) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (m16194c(2)) {
                "restartLoader in " + this + ": args=" + bundle;
            }
            C1088ir a = this.f21843a.mo13340a(i);
            if (a != null) {
                koVar = a.mo13290a(false);
            } else {
                koVar = null;
            }
            return m16193a(i, bundle, ipVar, koVar);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }

    /* renamed from: a */
    public final C1140ko mo13248a(int i, Bundle bundle, C1085ip ipVar) {
        if (this.f21843a.f21759e) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C1088ir a = this.f21843a.mo13340a(i);
            if (m16194c(2)) {
                "initLoader in " + this + ": args=" + bundle;
            }
            if (a == null) {
                return m16193a(i, bundle, ipVar, (C1140ko) null);
            }
            if (m16194c(3)) {
                "  Re-using existing loader " + a;
            }
            return a.mo13289a(this.f21844b, ipVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* renamed from: a */
    public final void mo13249a(int i) {
        if (this.f21843a.f21759e) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (m16194c(2)) {
                "destroyLoader in " + this + " of " + i;
            }
            C1088ir a = this.f21843a.mo13340a(i);
            if (a != null) {
                a.mo13290a(true);
                this.f21843a.f21758d.mo15636a(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo13250a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C1091iu iuVar = this.f21843a;
        if (iuVar.f21758d.mo15640c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < iuVar.f21758d.mo15640c(); i++) {
                C1088ir irVar = (C1088ir) iuVar.f21758d.mo15641c(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(iuVar.f21758d.mo15638b(i));
                printWriter.print(": ");
                printWriter.println(irVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(irVar.f21591a);
                printWriter.print(" mArgs=");
                printWriter.println(irVar.f21592g);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(irVar.f21593h);
                irVar.f21593h.dump(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (irVar.f21594i != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(irVar.f21594i);
                    C1089is isVar = irVar.f21594i;
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(isVar.f21607c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(irVar.f21593h.dataToString(irVar.mo2448b()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(irVar.mo2452d());
            }
        }
    }

    /* renamed from: a */
    public final boolean mo13251a() {
        C1089is isVar;
        C1091iu iuVar = this.f21843a;
        int c = iuVar.f21758d.mo15640c();
        for (int i = 0; i < c; i++) {
            C1088ir irVar = (C1088ir) iuVar.f21758d.mo15641c(i);
            if (irVar.mo2452d() && (isVar = irVar.f21594i) != null && !isVar.f21607c) {
                return true;
            }
        }
        return false;
    }
}
